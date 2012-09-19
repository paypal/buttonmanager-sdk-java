package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.PaymentTransactionType;
import urn.ebay.apis.eBLBaseComponents.ThreeDSecureInfoType;
import urn.ebay.apis.eBLBaseComponents.AbstractResponseType;
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
 * 
 */
public class GetTransactionDetailsResponseType extends AbstractResponseType {


	/**
	 * 	 
	 */ 
	private PaymentTransactionType PaymentTransactionDetails;

	/**
	 * 	 
	 */ 
	private ThreeDSecureInfoType ThreeDSecureDetails;

	

	/**
	 * Default Constructor
	 */
	public GetTransactionDetailsResponseType (){
	}	

	/**
	 * Getter for PaymentTransactionDetails
	 */
	 public PaymentTransactionType getPaymentTransactionDetails() {
	 	return PaymentTransactionDetails;
	 }
	 
	/**
	 * Setter for PaymentTransactionDetails
	 */
	 public void setPaymentTransactionDetails(PaymentTransactionType PaymentTransactionDetails) {
	 	this.PaymentTransactionDetails = PaymentTransactionDetails;
	 }
	 
	/**
	 * Getter for ThreeDSecureDetails
	 */
	 public ThreeDSecureInfoType getThreeDSecureDetails() {
	 	return ThreeDSecureDetails;
	 }
	 
	/**
	 * Setter for ThreeDSecureDetails
	 */
	 public void setThreeDSecureDetails(ThreeDSecureInfoType ThreeDSecureDetails) {
	 	this.ThreeDSecureDetails = ThreeDSecureDetails;
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
	
	public GetTransactionDetailsResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("PaymentTransactionDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PaymentTransactionDetails =  new PaymentTransactionType(childNode);
		}
		childNode = (Node) xpath.evaluate("ThreeDSecureDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ThreeDSecureDetails =  new ThreeDSecureInfoType(childNode);
		}
	}
 
}