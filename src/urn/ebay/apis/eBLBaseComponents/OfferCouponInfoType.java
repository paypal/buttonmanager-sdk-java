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
		    this.Type = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Amount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Amount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AmountCurrency", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AmountCurrency = childNode.getTextContent();
		}
	
	}
 
}