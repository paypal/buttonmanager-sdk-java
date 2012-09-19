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
	private String Token;

	/**
	 * Information about the transaction 	 
	 */ 
	private List<PaymentInfoType> PaymentInfo = new ArrayList<PaymentInfoType>();

	/**
	 * 	 
	 */ 
	private String BillingAgreementID;

	/**
	 * 	 
	 */ 
	private String RedirectRequired;

	/**
	 * Memo entered by sender in PayPal Review Page note field.
	 * Optional Character length and limitations: 255 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String Note;

	/**
	 * Redirect back to PayPal, PayPal can host the success page. 	 
	 */ 
	private String SuccessPageRedirectRequested;

	/**
	 * Information about the user selected options. 	 
	 */ 
	private UserSelectedOptionType UserSelectedOptions;

	/**
	 * Information about Coupled Payment transactions. 	 
	 */ 
	private List<CoupledPaymentInfoType> CoupledPaymentInfo = new ArrayList<CoupledPaymentInfoType>();

	

	/**
	 * Default Constructor
	 */
	public DoExpressCheckoutPaymentResponseDetailsType (){
	}	

	/**
	 * Getter for Token
	 */
	 public String getToken() {
	 	return Token;
	 }
	 
	/**
	 * Setter for Token
	 */
	 public void setToken(String Token) {
	 	this.Token = Token;
	 }
	 
	/**
	 * Getter for PaymentInfo
	 */
	 public List<PaymentInfoType> getPaymentInfo() {
	 	return PaymentInfo;
	 }
	 
	/**
	 * Setter for PaymentInfo
	 */
	 public void setPaymentInfo(List<PaymentInfoType> PaymentInfo) {
	 	this.PaymentInfo = PaymentInfo;
	 }
	 
	/**
	 * Getter for BillingAgreementID
	 */
	 public String getBillingAgreementID() {
	 	return BillingAgreementID;
	 }
	 
	/**
	 * Setter for BillingAgreementID
	 */
	 public void setBillingAgreementID(String BillingAgreementID) {
	 	this.BillingAgreementID = BillingAgreementID;
	 }
	 
	/**
	 * Getter for RedirectRequired
	 */
	 public String getRedirectRequired() {
	 	return RedirectRequired;
	 }
	 
	/**
	 * Setter for RedirectRequired
	 */
	 public void setRedirectRequired(String RedirectRequired) {
	 	this.RedirectRequired = RedirectRequired;
	 }
	 
	/**
	 * Getter for Note
	 */
	 public String getNote() {
	 	return Note;
	 }
	 
	/**
	 * Setter for Note
	 */
	 public void setNote(String Note) {
	 	this.Note = Note;
	 }
	 
	/**
	 * Getter for SuccessPageRedirectRequested
	 */
	 public String getSuccessPageRedirectRequested() {
	 	return SuccessPageRedirectRequested;
	 }
	 
	/**
	 * Setter for SuccessPageRedirectRequested
	 */
	 public void setSuccessPageRedirectRequested(String SuccessPageRedirectRequested) {
	 	this.SuccessPageRedirectRequested = SuccessPageRedirectRequested;
	 }
	 
	/**
	 * Getter for UserSelectedOptions
	 */
	 public UserSelectedOptionType getUserSelectedOptions() {
	 	return UserSelectedOptions;
	 }
	 
	/**
	 * Setter for UserSelectedOptions
	 */
	 public void setUserSelectedOptions(UserSelectedOptionType UserSelectedOptions) {
	 	this.UserSelectedOptions = UserSelectedOptions;
	 }
	 
	/**
	 * Getter for CoupledPaymentInfo
	 */
	 public List<CoupledPaymentInfoType> getCoupledPaymentInfo() {
	 	return CoupledPaymentInfo;
	 }
	 
	/**
	 * Setter for CoupledPaymentInfo
	 */
	 public void setCoupledPaymentInfo(List<CoupledPaymentInfoType> CoupledPaymentInfo) {
	 	this.CoupledPaymentInfo = CoupledPaymentInfo;
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
		    this.Token = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("PaymentInfo", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.PaymentInfo.add(new PaymentInfoType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("BillingAgreementID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.BillingAgreementID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("RedirectRequired", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.RedirectRequired = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Note", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Note = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SuccessPageRedirectRequested", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SuccessPageRedirectRequested = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("UserSelectedOptions", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.UserSelectedOptions =  new UserSelectedOptionType(childNode);
		}
        nodeList = (NodeList) xpath.evaluate("CoupledPaymentInfo", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.CoupledPaymentInfo.add(new CoupledPaymentInfoType(subNode));
			}
		}
	}
 
}