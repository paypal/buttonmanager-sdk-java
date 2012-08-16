package urn.ebay.apis.eBLBaseComponents;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;
import java.io.FileInputStream;
import java.io.StringReader;
import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * EbayItemPaymentDetailsItemType - Type declaration to be used
 * by other schemas. Information about an Ebay Payment Item. 
 */
public class EbayItemPaymentDetailsItemType{


	/**
	 * Auction ItemNumber. Optional Character length and
	 * limitations: 765 single-byte characters	 
	 */ 
	private String ItemNumber;

	/**
	 * Auction Transaction ID. Optional Character length and
	 * limitations: 255 single-byte characters	 
	 */ 
	private String AuctionTransactionId;

	/**
	 * Ebay Order ID. Optional Character length and limitations: 64
	 * single-byte characters	 
	 */ 
	private String OrderId;

	/**
	 * Ebay Cart ID. Optional Character length and limitations: 64
	 * single-byte characters 	 
	 */ 
	private String CartID;

	

	/**
	 * Default Constructor
	 */
	public EbayItemPaymentDetailsItemType (){
	}	

	/**
	 * Getter for ItemNumber
	 */
	 public String getItemNumber() {
	 	return ItemNumber;
	 }
	 
	/**
	 * Setter for ItemNumber
	 */
	 public void setItemNumber(String ItemNumber) {
	 	this.ItemNumber = ItemNumber;
	 }
	 
	/**
	 * Getter for AuctionTransactionId
	 */
	 public String getAuctionTransactionId() {
	 	return AuctionTransactionId;
	 }
	 
	/**
	 * Setter for AuctionTransactionId
	 */
	 public void setAuctionTransactionId(String AuctionTransactionId) {
	 	this.AuctionTransactionId = AuctionTransactionId;
	 }
	 
	/**
	 * Getter for OrderId
	 */
	 public String getOrderId() {
	 	return OrderId;
	 }
	 
	/**
	 * Setter for OrderId
	 */
	 public void setOrderId(String OrderId) {
	 	this.OrderId = OrderId;
	 }
	 
	/**
	 * Getter for CartID
	 */
	 public String getCartID() {
	 	return CartID;
	 }
	 
	/**
	 * Setter for CartID
	 */
	 public void setCartID(String CartID) {
	 	this.CartID = CartID;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ItemNumber != null) {
			sb.append("<ebl:ItemNumber>").append(ItemNumber);
			sb.append("</ebl:ItemNumber>");
		}
		if(AuctionTransactionId != null) {
			sb.append("<ebl:AuctionTransactionId>").append(AuctionTransactionId);
			sb.append("</ebl:AuctionTransactionId>");
		}
		if(OrderId != null) {
			sb.append("<ebl:OrderId>").append(OrderId);
			sb.append("</ebl:OrderId>");
		}
		if(CartID != null) {
			sb.append("<ebl:CartID>").append(CartID);
			sb.append("</ebl:CartID>");
		}
		return sb.toString();
	}
	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else if (n.getNodeType() == Node.ELEMENT_NODE ){
			return (n.getChildNodes().getLength() == 0);
		} else {
			return false;
		}
	}
	
	private String convertToXML(Node n){
		String name = n.getNodeName();
		short type = n.getNodeType();
		if (Node.CDATA_SECTION_NODE == type) {
			return "<![CDATA[" + n.getNodeValue() + "]]&gt;";
		}
		if (name.startsWith("#")) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		sb.append("<").append(name);
		NamedNodeMap attrs = n.getAttributes();
		if (attrs != null) {
			for (int i = 0; i < attrs.getLength(); i++) {
				Node attr = attrs.item(i);
				sb.append(" ").append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
			}
		}
		String textContent = null;
		NodeList children = n.getChildNodes();
		if (children.getLength() == 0) {
			if (((textContent = n.getTextContent())) != null && (!"".equals(textContent))) {
				sb.append(textContent).append("</").append(name).append(">");
			} else {
				sb.append("/>");
			}
		} else {
			sb.append(">");
			boolean hasValidChildren = false;
			for (int i = 0; i < children.getLength(); i++) {
				String childToString = convertToXML(children.item(i));
				if (!"".equals(childToString)) {
					sb.append(childToString);
					hasValidChildren = true;
				}
			}
			if (!hasValidChildren && ((textContent = n.getTextContent()) != null)) {
				sb.append(textContent);
			}
			sb.append("</").append(name).append(">");
		}
		return sb.toString();
	}
	
	public EbayItemPaymentDetailsItemType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("ItemNumber").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ItemNumber").item(0))) {
				this.ItemNumber = (String)document.getElementsByTagName("ItemNumber").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("AuctionTransactionId").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("AuctionTransactionId").item(0))) {
				this.AuctionTransactionId = (String)document.getElementsByTagName("AuctionTransactionId").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("OrderId").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OrderId").item(0))) {
				this.OrderId = (String)document.getElementsByTagName("OrderId").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("CartID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("CartID").item(0))) {
				this.CartID = (String)document.getElementsByTagName("CartID").item(0).getTextContent();
			}
		}
	
	}
 
}