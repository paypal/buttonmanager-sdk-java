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
			sb.append("<ebl:SellerId>").append(SDKUtil.escapeInvalidXmlCharsRegex(SellerId));
			sb.append("</ebl:SellerId>");
		}
		if(SellerUserName != null) {
			sb.append("<ebl:SellerUserName>").append(SDKUtil.escapeInvalidXmlCharsRegex(SellerUserName));
			sb.append("</ebl:SellerUserName>");
		}
		if(SellerRegistrationDate != null) {
			sb.append("<ebl:SellerRegistrationDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(SellerRegistrationDate));
			sb.append("</ebl:SellerRegistrationDate>");
		}
		if(PayPalAccountID != null) {
			sb.append("<ebl:PayPalAccountID>").append(SDKUtil.escapeInvalidXmlCharsRegex(PayPalAccountID));
			sb.append("</ebl:PayPalAccountID>");
		}
		if(SecureMerchantAccountID != null) {
			sb.append("<ebl:SecureMerchantAccountID>").append(SDKUtil.escapeInvalidXmlCharsRegex(SecureMerchantAccountID));
			sb.append("</ebl:SecureMerchantAccountID>");
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
		    this.SellerId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SellerUserName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SellerUserName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SellerRegistrationDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SellerRegistrationDate = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayPalAccountID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PayPalAccountID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SecureMerchantAccountID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SecureMerchantAccountID = childNode.getTextContent();
		}
	
	}
 
}