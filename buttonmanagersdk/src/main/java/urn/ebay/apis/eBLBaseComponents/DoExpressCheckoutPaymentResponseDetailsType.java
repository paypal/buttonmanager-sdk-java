package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.PaymentInfoType;
import urn.ebay.apis.eBLBaseComponents.UserSelectedOptionType;
import urn.ebay.apis.eBLBaseComponents.CoupledPaymentInfoType;
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
 * The timestamped token value that was returned by
 * SetExpressCheckoutResponse and passed on
 * GetExpressCheckoutDetailsRequest. Character length and
 * limitations:20 single-byte characters 
 */
public class DoExpressCheckoutPaymentResponseDetailsType{


	/**
	 * The timestamped token value that was returned by
	 * SetExpressCheckoutResponse and passed on
	 * GetExpressCheckoutDetailsRequest. Character length and
	 * limitations:20 single-byte characters	 
	 */ 
	private String token;

	/**
	 * Information about the transaction 	 
	 */ 
	private List<PaymentInfoType> paymentInfo = new ArrayList<PaymentInfoType>();

	/**
	 * 	 
	 */ 
	private String billingAgreementID;

	/**
	 * 	 
	 */ 
	private String redirectRequired;

	/**
	 * Memo entered by sender in PayPal Review Page note field.
	 * Optional Character length and limitations: 255 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String note;

	/**
	 * Redirect back to PayPal, PayPal can host the success page. 	 
	 */ 
	private String successPageRedirectRequested;

	/**
	 * Information about the user selected options. 	 
	 */ 
	private UserSelectedOptionType userSelectedOptions;

	/**
	 * Information about Coupled Payment transactions. 	 
	 */ 
	private List<CoupledPaymentInfoType> coupledPaymentInfo = new ArrayList<CoupledPaymentInfoType>();

	

	/**
	 * Default Constructor
	 */
	public DoExpressCheckoutPaymentResponseDetailsType (){
	}	

	/**
	 * Getter for token
	 */
	 public String getToken() {
	 	return token;
	 }
	 
	/**
	 * Setter for token
	 */
	 public void setToken(String token) {
	 	this.token = token;
	 }
	 
	/**
	 * Getter for paymentInfo
	 */
	 public List<PaymentInfoType> getPaymentInfo() {
	 	return paymentInfo;
	 }
	 
	/**
	 * Setter for paymentInfo
	 */
	 public void setPaymentInfo(List<PaymentInfoType> paymentInfo) {
	 	this.paymentInfo = paymentInfo;
	 }
	 
	/**
	 * Getter for billingAgreementID
	 */
	 public String getBillingAgreementID() {
	 	return billingAgreementID;
	 }
	 
	/**
	 * Setter for billingAgreementID
	 */
	 public void setBillingAgreementID(String billingAgreementID) {
	 	this.billingAgreementID = billingAgreementID;
	 }
	 
	/**
	 * Getter for redirectRequired
	 */
	 public String getRedirectRequired() {
	 	return redirectRequired;
	 }
	 
	/**
	 * Setter for redirectRequired
	 */
	 public void setRedirectRequired(String redirectRequired) {
	 	this.redirectRequired = redirectRequired;
	 }
	 
	/**
	 * Getter for note
	 */
	 public String getNote() {
	 	return note;
	 }
	 
	/**
	 * Setter for note
	 */
	 public void setNote(String note) {
	 	this.note = note;
	 }
	 
	/**
	 * Getter for successPageRedirectRequested
	 */
	 public String getSuccessPageRedirectRequested() {
	 	return successPageRedirectRequested;
	 }
	 
	/**
	 * Setter for successPageRedirectRequested
	 */
	 public void setSuccessPageRedirectRequested(String successPageRedirectRequested) {
	 	this.successPageRedirectRequested = successPageRedirectRequested;
	 }
	 
	/**
	 * Getter for userSelectedOptions
	 */
	 public UserSelectedOptionType getUserSelectedOptions() {
	 	return userSelectedOptions;
	 }
	 
	/**
	 * Setter for userSelectedOptions
	 */
	 public void setUserSelectedOptions(UserSelectedOptionType userSelectedOptions) {
	 	this.userSelectedOptions = userSelectedOptions;
	 }
	 
	/**
	 * Getter for coupledPaymentInfo
	 */
	 public List<CoupledPaymentInfoType> getCoupledPaymentInfo() {
	 	return coupledPaymentInfo;
	 }
	 
	/**
	 * Setter for coupledPaymentInfo
	 */
	 public void setCoupledPaymentInfo(List<CoupledPaymentInfoType> coupledPaymentInfo) {
	 	this.coupledPaymentInfo = coupledPaymentInfo;
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
	
	public DoExpressCheckoutPaymentResponseDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Token", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.token = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("PaymentInfo", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.paymentInfo.add(new PaymentInfoType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("BillingAgreementID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.billingAgreementID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("RedirectRequired", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.redirectRequired = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Note", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.note = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SuccessPageRedirectRequested", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.successPageRedirectRequested = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("UserSelectedOptions", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.userSelectedOptions =  new UserSelectedOptionType(childNode);
		}
        nodeList = (NodeList) xpath.evaluate("CoupledPaymentInfo", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.coupledPaymentInfo.add(new CoupledPaymentInfoType(subNode));
			}
		}
	}
 
}