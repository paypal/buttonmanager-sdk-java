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
 * Details about the seller. 
 */
public class SellerDetailsType{


	/**
	 * Unique identifier for the seller. Optional 	 
	 */ 
	private String SellerId;

	/**
	 * The user name of the user at the marketplaces site. Optional
	 * 	 
	 */ 
	private String SellerUserName;

	/**
	 * Date when the user registered with the marketplace. Optional
	 * 	 
	 */ 
	private String SellerRegistrationDate;

	/**
	 * Seller Paypal Account Id contains the seller EmailId or
	 * PayerId or PhoneNo passed during the Request. 	 
	 */ 
	private String PayPalAccountID;

	/**
	 * Unique PayPal customer account identification number (of the
	 * seller). This feild is meant for Response. This field is
	 * ignored, if passed in the Request. 	 
	 */ 
	private String SecureMerchantAccountID;

	

	/**
	 * Default Constructor
	 */
	public SellerDetailsType (){
	}	

	/**
	 * Getter for SellerId
	 */
	 public String getSellerId() {
	 	return SellerId;
	 }
	 
	/**
	 * Setter for SellerId
	 */
	 public void setSellerId(String SellerId) {
	 	this.SellerId = SellerId;
	 }
	 
	/**
	 * Getter for SellerUserName
	 */
	 public String getSellerUserName() {
	 	return SellerUserName;
	 }
	 
	/**
	 * Setter for SellerUserName
	 */
	 public void setSellerUserName(String SellerUserName) {
	 	this.SellerUserName = SellerUserName;
	 }
	 
	/**
	 * Getter for SellerRegistrationDate
	 */
	 public String getSellerRegistrationDate() {
	 	return SellerRegistrationDate;
	 }
	 
	/**
	 * Setter for SellerRegistrationDate
	 */
	 public void setSellerRegistrationDate(String SellerRegistrationDate) {
	 	this.SellerRegistrationDate = SellerRegistrationDate;
	 }
	 
	/**
	 * Getter for PayPalAccountID
	 */
	 public String getPayPalAccountID() {
	 	return PayPalAccountID;
	 }
	 
	/**
	 * Setter for PayPalAccountID
	 */
	 public void setPayPalAccountID(String PayPalAccountID) {
	 	this.PayPalAccountID = PayPalAccountID;
	 }
	 
	/**
	 * Getter for SecureMerchantAccountID
	 */
	 public String getSecureMerchantAccountID() {
	 	return SecureMerchantAccountID;
	 }
	 
	/**
	 * Setter for SecureMerchantAccountID
	 */
	 public void setSecureMerchantAccountID(String SecureMerchantAccountID) {
	 	this.SecureMerchantAccountID = SecureMerchantAccountID;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(SellerId != null) {
			sb.append("<ebl:SellerId>").append(SellerId);
			sb.append("</ebl:SellerId>");
		}
		if(SellerUserName != null) {
			sb.append("<ebl:SellerUserName>").append(SellerUserName);
			sb.append("</ebl:SellerUserName>");
		}
		if(SellerRegistrationDate != null) {
			sb.append("<ebl:SellerRegistrationDate>").append(SellerRegistrationDate);
			sb.append("</ebl:SellerRegistrationDate>");
		}
		if(PayPalAccountID != null) {
			sb.append("<ebl:PayPalAccountID>").append(PayPalAccountID);
			sb.append("</ebl:PayPalAccountID>");
		}
		if(SecureMerchantAccountID != null) {
			sb.append("<ebl:SecureMerchantAccountID>").append(SecureMerchantAccountID);
			sb.append("</ebl:SecureMerchantAccountID>");
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
	
	public SellerDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("SellerId").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SellerId").item(0))) {
				this.SellerId = (String)document.getElementsByTagName("SellerId").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("SellerUserName").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SellerUserName").item(0))) {
				this.SellerUserName = (String)document.getElementsByTagName("SellerUserName").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("SellerRegistrationDate").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SellerRegistrationDate").item(0))) {
				this.SellerRegistrationDate = (String)document.getElementsByTagName("SellerRegistrationDate").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("PayPalAccountID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PayPalAccountID").item(0))) {
				this.PayPalAccountID = (String)document.getElementsByTagName("PayPalAccountID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("SecureMerchantAccountID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SecureMerchantAccountID").item(0))) {
				this.SecureMerchantAccountID = (String)document.getElementsByTagName("SecureMerchantAccountID").item(0).getTextContent();
			}
		}
	
	}
 
}