package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.PendingStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.FMFDetailsType;
import urn.ebay.apis.eBLBaseComponents.ThreeDSecureResponseType;
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
 * The amount of the payment as specified by you on
 * DoDirectPaymentRequest.
 */
public class DoDirectPaymentResponseType extends AbstractResponseType {


	/**
	 * The amount of the payment as specified by you on
	 * DoDirectPaymentRequest.	  
	 *@Required	 
	 */ 
	private BasicAmountType amount;

	/**
	 * Address Verification System response code. Character limit:
	 * One single-byte alphanumeric character AVS
	 * CodeMeaningMatched Details A AddressAddress only (no ZIP) B
	 * International “A”Address only (no ZIP) CInternational
	 * “N” None DInternational “X” Address and Postal Code
	 * E Not allowed for MOTO (Internet/Phone) transactions Not
	 * applicable F UK-specific “X”Address and Postal Code G
	 * Global Unavailable Not applicable I International
	 * UnavailableNot applicable N NoNone PPostal (International
	 * “Z”)Postal Code only (no Address) RRetryNot applicable S
	 * Service not Supported Not applicable U UnavailableNot
	 * applicable W Whole ZIPNine-digit ZIP code (no Address) X
	 * Exact match Address and nine-digit ZIP code Y YesAddress and
	 * five-digit ZIP Z ZIP Five-digit ZIP code (no Address) All
	 * others Error Not applicable	  
	 *@Required	 
	 */ 
	private String aVSCode;

	/**
	 * Result of the CVV2 check by PayPal. CVV2 CodeMeaningMatched
	 * Details M MatchCVV2 N No match None P Not ProcessedNot
	 * applicable SService not SupportedNot applicable U
	 * UnavailableNot applicable XNo response Not applicable All
	 * others ErrorNot applicable 	  
	 *@Required	 
	 */ 
	private String cVV2Code;

	/**
	 * Transaction identification number. Character length and
	 * limitations: 19 characters maximum.	  
	 *@Required	 
	 */ 
	private String transactionID;

	/**
	 * The reason why a particular transaction went in pending. 	 
	 */ 
	private PendingStatusCodeType pendingReason;

	/**
	 * This will identify the actual transaction status. 	 
	 */ 
	private PaymentStatusCodeType paymentStatus;

	/**
	 * 	 
	 */ 
	private FMFDetailsType fMFDetails;

	/**
	 * 	 
	 */ 
	private ThreeDSecureResponseType threeDSecureResponse;

	/**
	 * Response code from the processor when a recurring
	 * transaction is declined.  	 
	 */ 
	private String paymentAdviceCode;

	

	/**
	 * Default Constructor
	 */
	public DoDirectPaymentResponseType (){
	}	

	/**
	 * Getter for amount
	 */
	 public BasicAmountType getAmount() {
	 	return amount;
	 }
	 
	/**
	 * Setter for amount
	 */
	 public void setAmount(BasicAmountType amount) {
	 	this.amount = amount;
	 }
	 
	/**
	 * Getter for aVSCode
	 */
	 public String getAVSCode() {
	 	return aVSCode;
	 }
	 
	/**
	 * Setter for aVSCode
	 */
	 public void setAVSCode(String aVSCode) {
	 	this.aVSCode = aVSCode;
	 }
	 
	/**
	 * Getter for cVV2Code
	 */
	 public String getCVV2Code() {
	 	return cVV2Code;
	 }
	 
	/**
	 * Setter for cVV2Code
	 */
	 public void setCVV2Code(String cVV2Code) {
	 	this.cVV2Code = cVV2Code;
	 }
	 
	/**
	 * Getter for transactionID
	 */
	 public String getTransactionID() {
	 	return transactionID;
	 }
	 
	/**
	 * Setter for transactionID
	 */
	 public void setTransactionID(String transactionID) {
	 	this.transactionID = transactionID;
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
	 * Getter for fMFDetails
	 */
	 public FMFDetailsType getFMFDetails() {
	 	return fMFDetails;
	 }
	 
	/**
	 * Setter for fMFDetails
	 */
	 public void setFMFDetails(FMFDetailsType fMFDetails) {
	 	this.fMFDetails = fMFDetails;
	 }
	 
	/**
	 * Getter for threeDSecureResponse
	 */
	 public ThreeDSecureResponseType getThreeDSecureResponse() {
	 	return threeDSecureResponse;
	 }
	 
	/**
	 * Setter for threeDSecureResponse
	 */
	 public void setThreeDSecureResponse(ThreeDSecureResponseType threeDSecureResponse) {
	 	this.threeDSecureResponse = threeDSecureResponse;
	 }
	 
	/**
	 * Getter for paymentAdviceCode
	 */
	 public String getPaymentAdviceCode() {
	 	return paymentAdviceCode;
	 }
	 
	/**
	 * Setter for paymentAdviceCode
	 */
	 public void setPaymentAdviceCode(String paymentAdviceCode) {
	 	this.paymentAdviceCode = paymentAdviceCode;
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
	
	public DoDirectPaymentResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Amount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.amount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("AVSCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.aVSCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CVV2Code", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.cVV2Code = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TransactionID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.transactionID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PendingReason", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.pendingReason = PendingStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PaymentStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentStatus = PaymentStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("FMFDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.fMFDetails =  new FMFDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("ThreeDSecureResponse", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.threeDSecureResponse =  new ThreeDSecureResponseType(childNode);
		}
		childNode = (Node) xpath.evaluate("PaymentAdviceCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentAdviceCode = childNode.getTextContent();
		}
	
	}
 
}