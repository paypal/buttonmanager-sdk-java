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
	private BasicAmountType Amount;

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
	private String AVSCode;

	/**
	 * Result of the CVV2 check by PayPal. CVV2 CodeMeaningMatched
	 * Details M MatchCVV2 N No match None P Not ProcessedNot
	 * applicable SService not SupportedNot applicable U
	 * UnavailableNot applicable XNo response Not applicable All
	 * others ErrorNot applicable 	  
	 *@Required	 
	 */ 
	private String CVV2Code;

	/**
	 * Transaction identification number. Character length and
	 * limitations: 19 characters maximum.	  
	 *@Required	 
	 */ 
	private String TransactionID;

	/**
	 * The reason why a particular transaction went in pending. 	 
	 */ 
	private PendingStatusCodeType PendingReason;

	/**
	 * This will identify the actual transaction status. 	 
	 */ 
	private PaymentStatusCodeType PaymentStatus;

	/**
	 * 	 
	 */ 
	private FMFDetailsType FMFDetails;

	/**
	 * 	 
	 */ 
	private ThreeDSecureResponseType ThreeDSecureResponse;

	/**
	 * Response code from the processor when a recurring
	 * transaction is declined.  	 
	 */ 
	private String PaymentAdviceCode;

	

	/**
	 * Default Constructor
	 */
	public DoDirectPaymentResponseType (){
	}	

	/**
	 * Getter for Amount
	 */
	 public BasicAmountType getAmount() {
	 	return Amount;
	 }
	 
	/**
	 * Setter for Amount
	 */
	 public void setAmount(BasicAmountType Amount) {
	 	this.Amount = Amount;
	 }
	 
	/**
	 * Getter for AVSCode
	 */
	 public String getAVSCode() {
	 	return AVSCode;
	 }
	 
	/**
	 * Setter for AVSCode
	 */
	 public void setAVSCode(String AVSCode) {
	 	this.AVSCode = AVSCode;
	 }
	 
	/**
	 * Getter for CVV2Code
	 */
	 public String getCVV2Code() {
	 	return CVV2Code;
	 }
	 
	/**
	 * Setter for CVV2Code
	 */
	 public void setCVV2Code(String CVV2Code) {
	 	this.CVV2Code = CVV2Code;
	 }
	 
	/**
	 * Getter for TransactionID
	 */
	 public String getTransactionID() {
	 	return TransactionID;
	 }
	 
	/**
	 * Setter for TransactionID
	 */
	 public void setTransactionID(String TransactionID) {
	 	this.TransactionID = TransactionID;
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
	 
	/**
	 * Getter for PaymentStatus
	 */
	 public PaymentStatusCodeType getPaymentStatus() {
	 	return PaymentStatus;
	 }
	 
	/**
	 * Setter for PaymentStatus
	 */
	 public void setPaymentStatus(PaymentStatusCodeType PaymentStatus) {
	 	this.PaymentStatus = PaymentStatus;
	 }
	 
	/**
	 * Getter for FMFDetails
	 */
	 public FMFDetailsType getFMFDetails() {
	 	return FMFDetails;
	 }
	 
	/**
	 * Setter for FMFDetails
	 */
	 public void setFMFDetails(FMFDetailsType FMFDetails) {
	 	this.FMFDetails = FMFDetails;
	 }
	 
	/**
	 * Getter for ThreeDSecureResponse
	 */
	 public ThreeDSecureResponseType getThreeDSecureResponse() {
	 	return ThreeDSecureResponse;
	 }
	 
	/**
	 * Setter for ThreeDSecureResponse
	 */
	 public void setThreeDSecureResponse(ThreeDSecureResponseType ThreeDSecureResponse) {
	 	this.ThreeDSecureResponse = ThreeDSecureResponse;
	 }
	 
	/**
	 * Getter for PaymentAdviceCode
	 */
	 public String getPaymentAdviceCode() {
	 	return PaymentAdviceCode;
	 }
	 
	/**
	 * Setter for PaymentAdviceCode
	 */
	 public void setPaymentAdviceCode(String PaymentAdviceCode) {
	 	this.PaymentAdviceCode = PaymentAdviceCode;
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
		    this.Amount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("AVSCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AVSCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CVV2Code", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CVV2Code = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TransactionID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TransactionID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PendingReason", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PendingReason = PendingStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PaymentStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PaymentStatus = PaymentStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("FMFDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.FMFDetails =  new FMFDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("ThreeDSecureResponse", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ThreeDSecureResponse =  new ThreeDSecureResponseType(childNode);
		}
		childNode = (Node) xpath.evaluate("PaymentAdviceCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PaymentAdviceCode = childNode.getTextContent();
		}
	
	}
 
}