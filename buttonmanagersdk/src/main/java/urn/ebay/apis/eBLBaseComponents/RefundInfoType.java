package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PaymentStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.PendingStatusCodeType;
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
 * Holds refunds payment status information 
 */
public class RefundInfoType{


	/**
	 * Refund status whether it is Instant or Delayed. 	 
	 */ 
	private PaymentStatusCodeType RefundStatus;

	/**
	 * Tells us the reason when refund payment status is Delayed. 	 
	 */ 
	private PendingStatusCodeType PendingReason;

	

	/**
	 * Default Constructor
	 */
	public RefundInfoType (){
	}	

	/**
	 * Getter for RefundStatus
	 */
	 public PaymentStatusCodeType getRefundStatus() {
	 	return RefundStatus;
	 }
	 
	/**
	 * Setter for RefundStatus
	 */
	 public void setRefundStatus(PaymentStatusCodeType RefundStatus) {
	 	this.RefundStatus = RefundStatus;
	 }
	 
	/**
	 * Getter for PendingReason
	 */
	 public PendingStatusCodeType getPendingReason() {
	 	return PendingReason;
	 }
	 
	/**
	 * Setter for PendingReason
	 */
	 public void setPendingReason(PendingStatusCodeType PendingReason) {
	 	this.PendingReason = PendingReason;
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
	
	public RefundInfoType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("RefundStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.RefundStatus = PaymentStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PendingReason", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PendingReason = PendingStatusCodeType.fromValue(childNode.getTextContent());
		}
	}
 
}