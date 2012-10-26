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
 * Authorization details 
 */
public class AuthorizationInfoType{


	/**
	 * The status of the payment: Pending: The payment is pending.
	 * See "PendingReason" for more information.	 
	 */ 
	private PaymentStatusCodeType paymentStatus;

	/**
	 * The reason the payment is pending:none: No pending reason
	 * address: The payment is pending because your customer did
	 * not include a confirmed shipping address and your Payment
	 * Receiving Preferences is set such that you want to manually
	 * accept or deny each of these payments. To change your
	 * preference, go to the Preferences section of your Profile.
	 * authorization: The authorization is pending at time of
	 * creation if payment is not under review echeck: The payment
	 * is pending because it was made by an eCheck that has not yet
	 * cleared. intl: The payment is pending because you hold a
	 * non-U.S. account and do not have a withdrawal mechanism. You
	 * must manually accept or deny this payment from your Account
	 * Overview. multi-currency: You do not have a balance in the
	 * currency sent, and you do not have your Payment Receiving
	 * Preferences set to automatically convert and accept this
	 * payment. You must manually accept or deny this payment.
	 * unilateral: The payment is pending because it was made to an
	 * email address that is not yet registered or confirmed.
	 * upgrade: The payment is pending because it was made via
	 * credit card and you must upgrade your account to Business or
	 * Premier status in order to receive the funds. upgrade can
	 * also mean that you have reached the monthly limit for
	 * transactions on your account. verify: The payment is pending
	 * because you are not yet verified. You must verify your
	 * account before you can accept this payment. payment_review:
	 * The payment is pending because it is under payment review.
	 * other: The payment is pending for a reason other than those
	 * listed above. For more information, contact PayPal Customer
	 * Service.	 
	 */ 
	private PendingStatusCodeType pendingReason;

	/**
	 * Protection Eligibility for this Transaction - None, SPP or
	 * ESPP 	 
	 */ 
	private String protectionEligibility;

	/**
	 * Protection Eligibility Type for this Transaction 	 
	 */ 
	private String protectionEligibilityType;

	

	/**
	 * Default Constructor
	 */
	public AuthorizationInfoType (){
	}	

	/**
	 * Getter for paymentStatus
	 */
	 public PaymentStatusCodeType getPaymentStatus() {
	 	return paymentStatus;
	 }
	 
	/**
	 * Setter for paymentStatus
	 */
	 public void setPaymentStatus(PaymentStatusCodeType paymentStatus) {
	 	this.paymentStatus = paymentStatus;
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
	 
	/**
	 * Getter for protectionEligibility
	 */
	 public String getProtectionEligibility() {
	 	return protectionEligibility;
	 }
	 
	/**
	 * Setter for protectionEligibility
	 */
	 public void setProtectionEligibility(String protectionEligibility) {
	 	this.protectionEligibility = protectionEligibility;
	 }
	 
	/**
	 * Getter for protectionEligibilityType
	 */
	 public String getProtectionEligibilityType() {
	 	return protectionEligibilityType;
	 }
	 
	/**
	 * Setter for protectionEligibilityType
	 */
	 public void setProtectionEligibilityType(String protectionEligibilityType) {
	 	this.protectionEligibilityType = protectionEligibilityType;
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
	
	public AuthorizationInfoType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("PaymentStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentStatus = PaymentStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PendingReason", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.pendingReason = PendingStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ProtectionEligibility", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.protectionEligibility = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProtectionEligibilityType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.protectionEligibilityType = childNode.getTextContent();
		}
	
	}
 
}