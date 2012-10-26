package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import urn.ebay.apis.eBLBaseComponents.PaymentInfoType;
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
 * A free-form field for your own use, such as a tracking
 * number or other value you want returned to you in IPN.
 * Optional Character length and limitations: 256 single-byte
 * alphanumeric characters 
 */
public class DoMobileCheckoutPaymentResponseDetailsType{


	/**
	 * A free-form field for your own use, such as a tracking
	 * number or other value you want returned to you in IPN.
	 * Optional Character length and limitations: 256 single-byte
	 * alphanumeric characters	 
	 */ 
	private String Custom;

	/**
	 * Your own unique invoice or tracking number. Optional
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters	 
	 */ 
	private String InvoiceID;

	/**
	 * Information about the payer	 
	 */ 
	private PayerInfoType PayerInfo;

	/**
	 * Information about the transaction	 
	 */ 
	private PaymentInfoType PaymentInfo;

	

	/**
	 * Default Constructor
	 */
	public DoMobileCheckoutPaymentResponseDetailsType (){
	}	

	/**
	 * Getter for Custom
	 */
	 public String getCustom() {
	 	return Custom;
	 }
	 
	/**
	 * Setter for Custom
	 */
	 public void setCustom(String Custom) {
	 	this.Custom = Custom;
	 }
	 
	/**
	 * Getter for InvoiceID
	 */
	 public String getInvoiceID() {
	 	return InvoiceID;
	 }
	 
	/**
	 * Setter for InvoiceID
	 */
	 public void setInvoiceID(String InvoiceID) {
	 	this.InvoiceID = InvoiceID;
	 }
	 
	/**
	 * Getter for PayerInfo
	 */
	 public PayerInfoType getPayerInfo() {
	 	return PayerInfo;
	 }
	 
	/**
	 * Setter for PayerInfo
	 */
	 public void setPayerInfo(PayerInfoType PayerInfo) {
	 	this.PayerInfo = PayerInfo;
	 }
	 
	/**
	 * Getter for PaymentInfo
	 */
	 public PaymentInfoType getPaymentInfo() {
	 	return PaymentInfo;
	 }
	 
	/**
	 * Setter for PaymentInfo
	 */
	 public void setPaymentInfo(PaymentInfoType PaymentInfo) {
	 	this.PaymentInfo = PaymentInfo;
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
	
	public DoMobileCheckoutPaymentResponseDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Custom", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Custom = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InvoiceID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.InvoiceID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayerInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PayerInfo =  new PayerInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("PaymentInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PaymentInfo =  new PaymentInfoType(childNode);
		}
	}
 
}