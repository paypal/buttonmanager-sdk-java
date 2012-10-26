package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BoardingStatusType;
import urn.ebay.apis.eBLBaseComponents.UserWithdrawalLimitTypeType;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import urn.ebay.apis.eBLBaseComponents.APICredentialsType;
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
 * Status of merchant's onboarding process:
 * CompletedCancelledPending Character length and limitations:
 * Eight alphabetic characters 
 */
public class GetBoardingDetailsResponseDetailsType{


	/**
	 * Status of merchant's onboarding process:
	 * CompletedCancelledPending Character length and limitations:
	 * Eight alphabetic characters	 
	 */ 
	private BoardingStatusType status;

	/**
	 * Date the boarding process started	 
	 */ 
	private String startDate;

	/**
	 * Date the merchant’s status or progress was last updated	 
	 */ 
	private String lastUpdated;

	/**
	 * Reason for merchant’s cancellation of sign-up. Character
	 * length and limitations: 1,024 alphanumeric characters	 
	 */ 
	private String reason;

	/**
	 * 	 
	 */ 
	private String programName;

	/**
	 * 	 
	 */ 
	private String programCode;

	/**
	 * 	 
	 */ 
	private String campaignID;

	/**
	 * Indicates if there is a limitation on the amount of money
	 * the business can withdraw from PayPal	 
	 */ 
	private UserWithdrawalLimitTypeType userWithdrawalLimit;

	/**
	 * Custom information you set on the EnterBoarding API call
	 * Character length and limitations: 256 alphanumeric
	 * characters	 
	 */ 
	private String partnerCustom;

	/**
	 * Details about the owner of the account	 
	 */ 
	private PayerInfoType accountOwner;

	/**
	 * Merchant’s PayPal API credentials	 
	 */ 
	private APICredentialsType credentials;

	/**
	 * The APIs that this merchant has granted the business partner
	 * permission to call on his behalf. For example:
	 * SetExpressCheckout,GetExpressCheckoutDetails,DoExpressCheckoutPayment	 
	 */ 
	private String configureAPIs;

	/**
	 * Primary email verification status. Confirmed, Unconfirmed	 
	 */ 
	private String emailVerificationStatus;

	/**
	 * Gives VettingStatus - Pending, Cancelled, Approved,
	 * UnderReview Character length and limitations: 256
	 * alphanumeric characters	 
	 */ 
	private String vettingStatus;

	/**
	 * Gives BankAccountVerificationStatus - Added, Confirmed
	 * Character length and limitations: 256 alphanumeric
	 * characters	 
	 */ 
	private String bankAccountVerificationStatus;

	

	/**
	 * Default Constructor
	 */
	public GetBoardingDetailsResponseDetailsType (){
	}	

	/**
	 * Getter for status
	 */
	 public BoardingStatusType getStatus() {
	 	return status;
	 }
	 
	/**
	 * Setter for status
	 */
	 public void setStatus(BoardingStatusType status) {
	 	this.status = status;
	 }
	 
	/**
	 * Getter for startDate
	 */
	 public String getStartDate() {
	 	return startDate;
	 }
	 
	/**
	 * Setter for startDate
	 */
	 public void setStartDate(String startDate) {
	 	this.startDate = startDate;
	 }
	 
	/**
	 * Getter for lastUpdated
	 */
	 public String getLastUpdated() {
	 	return lastUpdated;
	 }
	 
	/**
	 * Setter for lastUpdated
	 */
	 public void setLastUpdated(String lastUpdated) {
	 	this.lastUpdated = lastUpdated;
	 }
	 
	/**
	 * Getter for reason
	 */
	 public String getReason() {
	 	return reason;
	 }
	 
	/**
	 * Setter for reason
	 */
	 public void setReason(String reason) {
	 	this.reason = reason;
	 }
	 
	/**
	 * Getter for programName
	 */
	 public String getProgramName() {
	 	return programName;
	 }
	 
	/**
	 * Setter for programName
	 */
	 public void setProgramName(String programName) {
	 	this.programName = programName;
	 }
	 
	/**
	 * Getter for programCode
	 */
	 public String getProgramCode() {
	 	return programCode;
	 }
	 
	/**
	 * Setter for programCode
	 */
	 public void setProgramCode(String programCode) {
	 	this.programCode = programCode;
	 }
	 
	/**
	 * Getter for campaignID
	 */
	 public String getCampaignID() {
	 	return campaignID;
	 }
	 
	/**
	 * Setter for campaignID
	 */
	 public void setCampaignID(String campaignID) {
	 	this.campaignID = campaignID;
	 }
	 
	/**
	 * Getter for userWithdrawalLimit
	 */
	 public UserWithdrawalLimitTypeType getUserWithdrawalLimit() {
	 	return userWithdrawalLimit;
	 }
	 
	/**
	 * Setter for userWithdrawalLimit
	 */
	 public void setUserWithdrawalLimit(UserWithdrawalLimitTypeType userWithdrawalLimit) {
	 	this.userWithdrawalLimit = userWithdrawalLimit;
	 }
	 
	/**
	 * Getter for partnerCustom
	 */
	 public String getPartnerCustom() {
	 	return partnerCustom;
	 }
	 
	/**
	 * Setter for partnerCustom
	 */
	 public void setPartnerCustom(String partnerCustom) {
	 	this.partnerCustom = partnerCustom;
	 }
	 
	/**
	 * Getter for accountOwner
	 */
	 public PayerInfoType getAccountOwner() {
	 	return accountOwner;
	 }
	 
	/**
	 * Setter for accountOwner
	 */
	 public void setAccountOwner(PayerInfoType accountOwner) {
	 	this.accountOwner = accountOwner;
	 }
	 
	/**
	 * Getter for credentials
	 */
	 public APICredentialsType getCredentials() {
	 	return credentials;
	 }
	 
	/**
	 * Setter for credentials
	 */
	 public void setCredentials(APICredentialsType credentials) {
	 	this.credentials = credentials;
	 }
	 
	/**
	 * Getter for configureAPIs
	 */
	 public String getConfigureAPIs() {
	 	return configureAPIs;
	 }
	 
	/**
	 * Setter for configureAPIs
	 */
	 public void setConfigureAPIs(String configureAPIs) {
	 	this.configureAPIs = configureAPIs;
	 }
	 
	/**
	 * Getter for emailVerificationStatus
	 */
	 public String getEmailVerificationStatus() {
	 	return emailVerificationStatus;
	 }
	 
	/**
	 * Setter for emailVerificationStatus
	 */
	 public void setEmailVerificationStatus(String emailVerificationStatus) {
	 	this.emailVerificationStatus = emailVerificationStatus;
	 }
	 
	/**
	 * Getter for vettingStatus
	 */
	 public String getVettingStatus() {
	 	return vettingStatus;
	 }
	 
	/**
	 * Setter for vettingStatus
	 */
	 public void setVettingStatus(String vettingStatus) {
	 	this.vettingStatus = vettingStatus;
	 }
	 
	/**
	 * Getter for bankAccountVerificationStatus
	 */
	 public String getBankAccountVerificationStatus() {
	 	return bankAccountVerificationStatus;
	 }
	 
	/**
	 * Setter for bankAccountVerificationStatus
	 */
	 public void setBankAccountVerificationStatus(String bankAccountVerificationStatus) {
	 	this.bankAccountVerificationStatus = bankAccountVerificationStatus;
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
	
	public GetBoardingDetailsResponseDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Status", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.status = BoardingStatusType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("StartDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.startDate = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("LastUpdated", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.lastUpdated = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Reason", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.reason = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProgramName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.programName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProgramCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.programCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CampaignID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.campaignID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("UserWithdrawalLimit", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.userWithdrawalLimit = UserWithdrawalLimitTypeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PartnerCustom", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.partnerCustom = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AccountOwner", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.accountOwner =  new PayerInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("Credentials", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.credentials =  new APICredentialsType(childNode);
		}
		childNode = (Node) xpath.evaluate("ConfigureAPIs", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.configureAPIs = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("EmailVerificationStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.emailVerificationStatus = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("VettingStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.vettingStatus = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BankAccountVerificationStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.bankAccountVerificationStatus = childNode.getTextContent();
		}
	
	}
 
}