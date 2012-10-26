package urn.ebay.api.PayPalAPI;
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
 * Indicates whether the phone is activated for mobile payments
 * 
 */
public class GetMobileStatusResponseType extends AbstractResponseType {


	/**
	 * Indicates whether the phone is activated for mobile payments
	 * 	  
	 *@Required	 
	 */ 
	private Integer isActivated;

	/**
	 * Indicates whether there is a payment pending from the phone 	  
	 *@Required	 
	 */ 
	private Integer paymentPending;

	

	/**
	 * Default Constructor
	 */
	public GetMobileStatusResponseType (){
	}	

	/**
	 * Getter for isActivated
	 */
	 public Integer getIsActivated() {
	 	return isActivated;
	 }
	 
	/**
	 * Setter for isActivated
	 */
	 public void setIsActivated(Integer isActivated) {
	 	this.isActivated = isActivated;
	 }
	 
	/**
	 * Getter for paymentPending
	 */
	 public Integer getPaymentPending() {
	 	return paymentPending;
	 }
	 
	/**
	 * Setter for paymentPending
	 */
	 public void setPaymentPending(Integer paymentPending) {
	 	this.paymentPending = paymentPending;
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
	
	public GetMobileStatusResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("IsActivated", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.isActivated = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("PaymentPending", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.paymentPending = Integer.valueOf(childNode.getTextContent());
		}
	
	}
 
}