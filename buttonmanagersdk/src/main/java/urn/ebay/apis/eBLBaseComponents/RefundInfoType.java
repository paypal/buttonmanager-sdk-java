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
	private PaymentStatusCodeType refundStatus;

	/**
	 * Tells us the reason when refund payment status is Delayed. 	 
	 */ 
	private PendingStatusCodeType pendingReason;

	

	/**
	 * Default Constructor
	 */
	public RefundInfoType (){
	}	

	/**
	 * Getter for refundStatus
	 */
	 public PaymentStatusCodeType getRefundStatus() {
	 	return refundStatus;
	 }
	 
	/**
	 * Setter for refundStatus
	 */
	 public void setRefundStatus(PaymentStatusCodeType refundStatus) {
	 	this.refundStatus = refundStatus;
	 }
	 
	/**
	 * Getter for pendingReason
	 */
	 public PendingStatusCodeType getPendingReason() {
	 	return pendingReason;
	 }
	 
	/**
	 * Setter for pendingReason
	 */
	 public void setPendingReason(PendingStatusCodeType pendingReason) {
	 	this.pendingReason = pendingReason;
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
		    this.refundStatus = PaymentStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PendingReason", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.pendingReason = PendingStatusCodeType.fromValue(childNode.getTextContent());
		}
	}
 
}