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
 * OffersAndCouponsInfoType Information about a Offers and
 * Coupons. 
 */
public class OfferCouponInfoType{


	/**
	 * Type of the incentive 	 
	 */ 
	private String Type;

	/**
	 * ID of the Incentive used in transaction	 
	 */ 
	private String ID;

	/**
	 * Amount used on transaction	 
	 */ 
	private String Amount;

	/**
	 * Amount Currency	 
	 */ 
	private String AmountCurrency;

	

	/**
	 * Default Constructor
	 */
	public OfferCouponInfoType (){
	}	

	/**
	 * Getter for Type
	 */
	 public String getType() {
	 	return Type;
	 }
	 
	/**
	 * Setter for Type
	 */
	 public void setType(String Type) {
	 	this.Type = Type;
	 }
	 
	/**
	 * Getter for ID
	 */
	 public String getID() {
	 	return ID;
	 }
	 
	/**
	 * Setter for ID
	 */
	 public void setID(String ID) {
	 	this.ID = ID;
	 }
	 
	/**
	 * Getter for Amount
	 */
	 public String getAmount() {
	 	return Amount;
	 }
	 
	/**
	 * Setter for Amount
	 */
	 public void setAmount(String Amount) {
	 	this.Amount = Amount;
	 }
	 
	/**
	 * Getter for AmountCurrency
	 */
	 public String getAmountCurrency() {
	 	return AmountCurrency;
	 }
	 
	/**
	 * Setter for AmountCurrency
	 */
	 public void setAmountCurrency(String AmountCurrency) {
	 	this.AmountCurrency = AmountCurrency;
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
	
	public OfferCouponInfoType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("Type").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Type").item(0))) {
				this.Type = (String)document.getElementsByTagName("Type").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ID").item(0))) {
				this.ID = (String)document.getElementsByTagName("ID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Amount").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Amount").item(0))) {
				this.Amount = (String)document.getElementsByTagName("Amount").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("AmountCurrency").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("AmountCurrency").item(0))) {
				this.AmountCurrency = (String)document.getElementsByTagName("AmountCurrency").item(0).getTextContent();
			}
		}
	
	}
 
}