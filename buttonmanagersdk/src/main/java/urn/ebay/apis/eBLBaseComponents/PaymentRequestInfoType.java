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
	private String transactionId;

	/**
	 * Contains the bucket id.  	 
	 */ 
	private String paymentRequestID;

	/**
	 * Contains the error details.  	 
	 */ 
	private ErrorType paymentError;

	

	/**
	 * Default Constructor
	 */
	public PaymentRequestInfoType (){
	}	

	/**
	 * Getter for transactionId
	 */
	 public String getTransactionId() {
	 	return transactionId;
	 }
	 
	/**
	 * Setter for transactionId
	 */
	 public void setTransactionId(String transactionId) {
	 	this.transactionId = transactionId;
	 }
	 
	/**
	 * Getter for paymentRequestID
	 */
	 public String getPaymentRequestID() {
	 	return paymentRequestID;
	 }
	 
	/**
	 * Setter for paymentRequestID
	 */
	 public void setPaymentRequestID(String paymentRequestID) {
	 	this.paymentRequestID = paymentRequestID;
	 }
	 
	/**
	 * Getter for paymentError
	 */
	 public ErrorType getPaymentError() {
	 	return paymentError;
	 }
	 
	/**
	 * Setter for paymentError
	 */
	 public void setPaymentError(ErrorType paymentError) {
	 	this.paymentError = paymentError;
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
		    this.transactionId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PaymentRequestID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentRequestID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PaymentError", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentError =  new ErrorType(childNode);
		}
	}
 
}