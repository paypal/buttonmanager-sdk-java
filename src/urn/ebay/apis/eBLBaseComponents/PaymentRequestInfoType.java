package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.ErrorType;
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
 * Contains payment request information for each bucket in the
 * cart.  
 */
public class PaymentRequestInfoType{


	/**
	 * Contains the transaction id of the bucket.  	 
	 */ 
	private String TransactionId;

	/**
	 * Contains the bucket id.  	 
	 */ 
	private String PaymentRequestID;

	/**
	 * Contains the error details.  	 
	 */ 
	private ErrorType PaymentError;

	

	/**
	 * Default Constructor
	 */
	public PaymentRequestInfoType (){
	}	

	/**
	 * Getter for TransactionId
	 */
	 public String getTransactionId() {
	 	return TransactionId;
	 }
	 
	/**
	 * Setter for TransactionId
	 */
	 public void setTransactionId(String TransactionId) {
	 	this.TransactionId = TransactionId;
	 }
	 
	/**
	 * Getter for PaymentRequestID
	 */
	 public String getPaymentRequestID() {
	 	return PaymentRequestID;
	 }
	 
	/**
	 * Setter for PaymentRequestID
	 */
	 public void setPaymentRequestID(String PaymentRequestID) {
	 	this.PaymentRequestID = PaymentRequestID;
	 }
	 
	/**
	 * Getter for PaymentError
	 */
	 public ErrorType getPaymentError() {
	 	return PaymentError;
	 }
	 
	/**
	 * Setter for PaymentError
	 */
	 public void setPaymentError(ErrorType PaymentError) {
	 	this.PaymentError = PaymentError;
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
	
	public PaymentRequestInfoType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("TransactionId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TransactionId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PaymentRequestID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PaymentRequestID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PaymentError", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PaymentError =  new ErrorType(childNode);
		}
	}
 
}