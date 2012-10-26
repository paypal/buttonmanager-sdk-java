package urn.ebay.apis.eBLBaseComponents;
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
 * OffersAndCouponsInfoType Information about a Offers and
 * Coupons. 
 */
public class OfferCouponInfoType{


	/**
	 * Type of the incentive 	 
	 */ 
	private String type;

	/**
	 * ID of the Incentive used in transaction	 
	 */ 
	private String iD;

	/**
	 * Amount used on transaction	 
	 */ 
	private String amount;

	/**
	 * Amount Currency	 
	 */ 
	private String amountCurrency;

	

	/**
	 * Default Constructor
	 */
	public OfferCouponInfoType (){
	}	

	/**
	 * Getter for type
	 */
	 public String getType() {
	 	return type;
	 }
	 
	/**
	 * Setter for type
	 */
	 public void setType(String type) {
	 	this.type = type;
	 }
	 
	/**
	 * Getter for iD
	 */
	 public String getID() {
	 	return iD;
	 }
	 
	/**
	 * Setter for iD
	 */
	 public void setID(String iD) {
	 	this.iD = iD;
	 }
	 
	/**
	 * Getter for amount
	 */
	 public String getAmount() {
	 	return amount;
	 }
	 
	/**
	 * Setter for amount
	 */
	 public void setAmount(String amount) {
	 	this.amount = amount;
	 }
	 
	/**
	 * Getter for amountCurrency
	 */
	 public String getAmountCurrency() {
	 	return amountCurrency;
	 }
	 
	/**
	 * Setter for amountCurrency
	 */
	 public void setAmountCurrency(String amountCurrency) {
	 	this.amountCurrency = amountCurrency;
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
	
	public OfferCouponInfoType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Type", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.type = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.iD = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Amount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.amount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AmountCurrency", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.amountCurrency = childNode.getTextContent();
		}
	
	}
 
}