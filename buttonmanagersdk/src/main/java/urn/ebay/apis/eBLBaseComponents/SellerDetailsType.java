package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
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

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Unique identifier for the seller. Optional 	 
	 */ 
	private String sellerId;

	/**
	 * The user name of the user at the marketplaces site. Optional
	 * 	 
	 */ 
	private String sellerUserName;

	/**
	 * Date when the user registered with the marketplace. Optional
	 * 	 
	 */ 
	private String sellerRegistrationDate;

	/**
	 * Seller Paypal Account Id contains the seller EmailId or
	 * PayerId or PhoneNo passed during the Request. 	 
	 */ 
	private String payPalAccountID;

	/**
	 * Unique PayPal customer account identification number (of the
	 * seller). This feild is meant for Response. This field is
	 * ignored, if passed in the Request. 	 
	 */ 
	private String secureMerchantAccountID;

	

	/**
	 * Default Constructor
	 */
	public SellerDetailsType (){
	}	

	/**
	 * Getter for sellerId
	 */
	 public String getSellerId() {
	 	return sellerId;
	 }
	 
	/**
	 * Setter for sellerId
	 */
	 public void setSellerId(String sellerId) {
	 	this.sellerId = sellerId;
	 }
	 
	/**
	 * Getter for sellerUserName
	 */
	 public String getSellerUserName() {
	 	return sellerUserName;
	 }
	 
	/**
	 * Setter for sellerUserName
	 */
	 public void setSellerUserName(String sellerUserName) {
	 	this.sellerUserName = sellerUserName;
	 }
	 
	/**
	 * Getter for sellerRegistrationDate
	 */
	 public String getSellerRegistrationDate() {
	 	return sellerRegistrationDate;
	 }
	 
	/**
	 * Setter for sellerRegistrationDate
	 */
	 public void setSellerRegistrationDate(String sellerRegistrationDate) {
	 	this.sellerRegistrationDate = sellerRegistrationDate;
	 }
	 
	/**
	 * Getter for payPalAccountID
	 */
	 public String getPayPalAccountID() {
	 	return payPalAccountID;
	 }
	 
	/**
	 * Setter for payPalAccountID
	 */
	 public void setPayPalAccountID(String payPalAccountID) {
	 	this.payPalAccountID = payPalAccountID;
	 }
	 
	/**
	 * Getter for secureMerchantAccountID
	 */
	 public String getSecureMerchantAccountID() {
	 	return secureMerchantAccountID;
	 }
	 
	/**
	 * Setter for secureMerchantAccountID
	 */
	 public void setSecureMerchantAccountID(String secureMerchantAccountID) {
	 	this.secureMerchantAccountID = secureMerchantAccountID;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(sellerId != null) {
			sb.append("<").append(preferredPrefix).append(":SellerId>").append(SDKUtil.escapeInvalidXmlCharsRegex(sellerId));
			sb.append("</").append(preferredPrefix).append(":SellerId>");
		}
		if(sellerUserName != null) {
			sb.append("<").append(preferredPrefix).append(":SellerUserName>").append(SDKUtil.escapeInvalidXmlCharsRegex(sellerUserName));
			sb.append("</").append(preferredPrefix).append(":SellerUserName>");
		}
		if(sellerRegistrationDate != null) {
			sb.append("<").append(preferredPrefix).append(":SellerRegistrationDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(sellerRegistrationDate));
			sb.append("</").append(preferredPrefix).append(":SellerRegistrationDate>");
		}
		if(payPalAccountID != null) {
			sb.append("<").append(preferredPrefix).append(":PayPalAccountID>").append(SDKUtil.escapeInvalidXmlCharsRegex(payPalAccountID));
			sb.append("</").append(preferredPrefix).append(":PayPalAccountID>");
		}
		if(secureMerchantAccountID != null) {
			sb.append("<").append(preferredPrefix).append(":SecureMerchantAccountID>").append(SDKUtil.escapeInvalidXmlCharsRegex(secureMerchantAccountID));
			sb.append("</").append(preferredPrefix).append(":SecureMerchantAccountID>");
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		return sb.toString();
	}


	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else if (n.getNodeType() == Node.ELEMENT_NODE ) {
			return (n.getChildNodes().getLength() == 0);
		} else {
			return false;
		}
	}
	
	public SellerDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("SellerId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.sellerId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SellerUserName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.sellerUserName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SellerRegistrationDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.sellerRegistrationDate = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayPalAccountID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.payPalAccountID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SecureMerchantAccountID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.secureMerchantAccountID = childNode.getTextContent();
		}
	
	}
 
}