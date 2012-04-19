
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


/**
 * EbayItemPaymentDetailsItemType - Type declaration to be used by other schemas.
 * Information about an Ebay Payment Item.
 */
public class EbayItemPaymentDetailsItemType {

	/**
	 * Auction ItemNumber. 
	 * Optional
	 * Character length and limitations: 765 single-byte characters
	 */
	private String ItemNumber;
	public String getItemNumber() {
		return ItemNumber;
	}
	public void setItemNumber(String value) {
		this.ItemNumber = value;
	}

	/**
	 * Auction Transaction ID. 
	 * Optional
	 * Character length and limitations: 255 single-byte characters
	 */
	private String AuctionTransactionId;
	public String getAuctionTransactionId() {
		return AuctionTransactionId;
	}
	public void setAuctionTransactionId(String value) {
		this.AuctionTransactionId = value;
	}

	/**
	 * Ebay Order ID. 
	 * Optional
	 * Character length and limitations: 64 single-byte characters
	 */
	private String OrderId;
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String value) {
		this.OrderId = value;
	}

	/**
	 * Ebay Cart ID.
	 * Optional
	 * Character length and limitations: 64 single-byte characters
	 */
	private String CartID;
	public String getCartID() {
		return CartID;
	}
	public void setCartID(String value) {
		this.CartID = value;
	}


	public EbayItemPaymentDetailsItemType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ItemNumber != null ) {
			sb.append("<ebl:ItemNumber>").append(ItemNumber);
			sb.append("</ebl:ItemNumber>");
		}
		if( AuctionTransactionId != null ) {
			sb.append("<ebl:AuctionTransactionId>").append(AuctionTransactionId);
			sb.append("</ebl:AuctionTransactionId>");
		}
		if( OrderId != null ) {
			sb.append("<ebl:OrderId>").append(OrderId);
			sb.append("</ebl:OrderId>");
		}
		if( CartID != null ) {
			sb.append("<ebl:CartID>").append(CartID);
			sb.append("</ebl:CartID>");
		}
		return sb.toString();
	}

	 private  boolean isWhitespaceNode(Node n) {
		 if (n.getNodeType() == Node.TEXT_NODE) { 
				String val = n.getNodeValue();
				return val.trim().length() == 0; 
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
		 sb.append('<').append(name);
		 NamedNodeMap attrs = n.getAttributes();
		 if (attrs != null) { 
		  for (int i = 0; i < attrs.getLength(); i++) { 
			    Node attr = attrs.item(i);
			    sb.append(' ').append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
		  }
		 } 
		 String textContent = null; 
		 NodeList children = n.getChildNodes(); 
		 if (children.getLength() == 0) { 
		  if ((textContent = n.getTextContent()) != null && !"".equals(textContent)) {
		    sb.append(textContent).append("</").append(name).append('>'); 
		  } else { 
		    sb.append("/>"); 
		  } 
		 } else { 
		  sb.append('>'); 
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
		  sb.append("</").append(name).append('>');
		 }
		 return sb.toString();
	 } 
	 public EbayItemPaymentDetailsItemType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("ItemNumber").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ItemNumber").item(0))){ 
		 this.ItemNumber =(String)document.getElementsByTagName("ItemNumber").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("AuctionTransactionId").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AuctionTransactionId").item(0))){ 
		 this.AuctionTransactionId =(String)document.getElementsByTagName("AuctionTransactionId").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("OrderId").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OrderId").item(0))){ 
		 this.OrderId =(String)document.getElementsByTagName("OrderId").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("CartID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("CartID").item(0))){ 
		 this.CartID =(String)document.getElementsByTagName("CartID").item(0).getTextContent();

}
	}
	}
}
