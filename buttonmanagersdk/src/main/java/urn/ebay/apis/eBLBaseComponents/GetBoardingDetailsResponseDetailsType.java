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
	private BoardingStatusType Status;

	/**
	 * Date the boarding process started	 
	 */ 
	private String StartDate;

	/**
	 * Date the merchant’s status or progress was last updated	 
	 */ 
	private String LastUpdated;

	/**
	 * Reason for merchant’s cancellation of sign-up. Character
	 * length and limitations: 1,024 alphanumeric characters	 
	 */ 
	private String Reason;

	/**
	 * 	 
	 */ 
	private String ProgramName;

	/**
	 * 	 
	 */ 
	private String ProgramCode;

	/**
	 * 	 
	 */ 
	private String CampaignID;

	/**
	 * Indicates if there is a limitation on the amount of money
	 * the business can withdraw from PayPal	 
	 */ 
	private UserWithdrawalLimitTypeType UserWithdrawalLimit;

	/**
	 * Custom information you set on the EnterBoarding API call
	 * Character length and limitations: 256 alphanumeric
	 * characters	 
	 */ 
	private String PartnerCustom;

	/**
	 * Details about the owner of the account	 
	 */ 
	private PayerInfoType AccountOwner;

	/**
	 * Merchant’s PayPal API credentials	 
	 */ 
	private APICredentialsType Credentials;

	/**
	 * The APIs that this merchant has granted the business partner
	 * permission to call on his behalf. For example:
	 * SetExpressCheckout,GetExpressCheckoutDetails,DoExpressCheckoutPayment	 
	 */ 
	private String ConfigureAPIs;

	/**
	 * Primary email verification status. Confirmed, Unconfirmed	 
	 */ 
	private String EmailVerificationStatus;

	/**
	 * Gives VettingStatus - Pending, Cancelled, Approved,
	 * UnderReview Character length and limitations: 256
	 * alphanumeric characters	 
	 */ 
	private String VettingStatus;

	/**
	 * Gives BankAccountVerificationStatus - Added, Confirmed
	 * Character length and limitations: 256 alphanumeric
	 * characters	 
	 */ 
	private String BankAccountVerificationStatus;

	

	/**
	 * Default Constructor
	 */
	public GetBoardingDetailsResponseDetailsType (){
	}	

	/**
	 * Getter for Status
	 */
	 public BoardingStatusType getStatus() {
	 	return Status;
	 }
	 
	/**
	 * Setter for Status
	 */
	 public void setStatus(BoardingStatusType Status) {
	 	this.Status = Status;
	 }
	 
	/**
	 * Getter for StartDate
	 */
	 public String getStartDate() {
	 	return StartDate;
	 }
	 
	/**
	 * Setter for StartDate
	 */
	 public void setStartDate(String StartDate) {
	 	this.StartDate = StartDate;
	 }
	 
	/**
	 * Getter for LastUpdated
	 */
	 public String getLastUpdated() {
	 	return LastUpdated;
	 }
	 
	/**
	 * Setter for LastUpdated
	 */
	 public void setLastUpdated(String LastUpdated) {
	 	this.LastUpdated = LastUpdated;
	 }
	 
	/**
	 * Getter for Reason
	 */
	 public String getReason() {
	 	return Reason;
	 }
	 
	/**
	 * Setter for Reason
	 */
	 public void setReason(String Reason) {
	 	this.Reason = Reason;
	 }
	 
	/**
	 * Getter for ProgramName
	 */
	 public String getProgramName() {
	 	return ProgramName;
	 }
	 
	/**
	 * Setter for ProgramName
	 */
	 public void setProgramName(String ProgramName) {
	 	this.ProgramName = ProgramName;
	 }
	 
	/**
	 * Getter for ProgramCode
	 */
	 public String getProgramCode() {
	 	return ProgramCode;
	 }
	 
	/**
	 * Setter for ProgramCode
	 */
	 public void setProgramCode(String ProgramCode) {
	 	this.ProgramCode = ProgramCode;
	 }
	 
	/**
	 * Getter for CampaignID
	 */
	 public String getCampaignID() {
	 	return CampaignID;
	 }
	 
	/**
	 * Setter for CampaignID
	 */
	 public void setCampaignID(String CampaignID) {
	 	this.CampaignID = CampaignID;
	 }
	 
	/**
	 * Getter for UserWithdrawalLimit
	 */
	 public UserWithdrawalLimitTypeType getUserWithdrawalLimit() {
	 	return UserWithdrawalLimit;
	 }
	 
	/**
	 * Setter for UserWithdrawalLimit
	 */
	 public void setUserWithdrawalLimit(UserWithdrawalLimitTypeType UserWithdrawalLimit) {
	 	this.UserWithdrawalLimit = UserWithdrawalLimit;
	 }
	 
	/**
	 * Getter for PartnerCustom
	 */
	 public String getPartnerCustom() {
	 	return PartnerCustom;
	 }
	 
	/**
	 * Setter for PartnerCustom
	 */
	 public void setPartnerCustom(String PartnerCustom) {
	 	this.PartnerCustom = PartnerCustom;
	 }
	 
	/**
	 * Getter for AccountOwner
	 */
	 public PayerInfoType getAccountOwner() {
	 	return AccountOwner;
	 }
	 
	/**
	 * Setter for AccountOwner
	 */
	 public void setAccountOwner(PayerInfoType AccountOwner) {
	 	this.AccountOwner = AccountOwner;
	 }
	 
	/**
	 * Getter for Credentials
	 */
	 public APICredentialsType getCredentials() {
	 	return Credentials;
	 }
	 
	/**
	 * Setter for Credentials
	 */
	 public void setCredentials(APICredentialsType Credentials) {
	 	this.Credentials = Credentials;
	 }
	 
	/**
	 * Getter for ConfigureAPIs
	 */
	 public String getConfigureAPIs() {
	 	return ConfigureAPIs;
	 }
	 
	/**
	 * Setter for ConfigureAPIs
	 */
	 public void setConfigureAPIs(String ConfigureAPIs) {
	 	this.ConfigureAPIs = ConfigureAPIs;
	 }
	 
	/**
	 * Getter for EmailVerificationStatus
	 */
	 public String getEmailVerificationStatus() {
	 	return EmailVerificationStatus;
	 }
	 
	/**
	 * Setter for EmailVerificationStatus
	 */
	 public void setEmailVerificationStatus(String EmailVerificationStatus) {
	 	this.EmailVerificationStatus = EmailVerificationStatus;
	 }
	 
	/**
	 * Getter for VettingStatus
	 */
	 public String getVettingStatus() {
	 	return VettingStatus;
	 }
	 
	/**
	 * Setter for VettingStatus
	 */
	 public void setVettingStatus(String VettingStatus) {
	 	this.VettingStatus = VettingStatus;
	 }
	 
	/**
	 * Getter for BankAccountVerificationStatus
	 */
	 public String getBankAccountVerificationStatus() {
	 	return BankAccountVerificationStatus;
	 }
	 
	/**
	 * Setter for BankAccountVerificationStatus
	 */
	 public void setBankAccountVerificationStatus(String BankAccountVerificationStatus) {
	 	this.BankAccountVerificationStatus = BankAccountVerificationStatus;
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
		    this.Status = BoardingStatusType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("StartDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.StartDate = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("LastUpdated", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.LastUpdated = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Reason", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Reason = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProgramName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ProgramName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProgramCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ProgramCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CampaignID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CampaignID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("UserWithdrawalLimit", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.UserWithdrawalLimit = UserWithdrawalLimitTypeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PartnerCustom", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PartnerCustom = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AccountOwner", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AccountOwner =  new PayerInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("Credentials", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Credentials =  new APICredentialsType(childNode);
		}
		childNode = (Node) xpath.evaluate("ConfigureAPIs", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ConfigureAPIs = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("EmailVerificationStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.EmailVerificationStatus = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("VettingStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.VettingStatus = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BankAccountVerificationStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.BankAccountVerificationStatus = childNode.getTextContent();
		}
	
	}
 
}