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
	private Integer IsActivated;

	/**
	 * Indicates whether there is a payment pending from the phone 	  
	 *@Required	 
	 */ 
	private Integer PaymentPending;

	

	/**
	 * Default Constructor
	 */
	public GetMobileStatusResponseType (){
	}	

	/**
	 * Getter for IsActivated
	 */
	 public Integer getIsActivated() {
	 	return IsActivated;
	 }
	 
	/**
	 * Setter for IsActivated
	 */
	 public void setIsActivated(Integer IsActivated) {
	 	this.IsActivated = IsActivated;
	 }
	 
	/**
	 * Getter for PaymentPending
	 */
	 public Integer getPaymentPending() {
	 	return PaymentPending;
	 }
	 
	/**
	 * Setter for PaymentPending
	 */
	 public void setPaymentPending(Integer PaymentPending) {
	 	this.PaymentPending = PaymentPending;
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
			this.IsActivated = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("PaymentPending", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.PaymentPending = Integer.valueOf(childNode.getTextContent());
		}
	
	}
 
}