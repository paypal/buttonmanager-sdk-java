package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BoardingStatusType;
import urn.ebay.apis.eBLBaseComponents.UserWithdrawalLimitTypeType;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import urn.ebay.apis.eBLBaseComponents.APICredentialsType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
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
		} else if (n.getNodeType() == Node.ELEMENT_NODE ){
			return (n.getChildNodes().getLength() == 0);
		} else {
			return false;
		}
	}
	
	private String convertToXML(Node n){
		String name = n.getNodeName();
		short type = n.getNodeType();
		if (Node.CDATA_SECTION_NODE == type) {
			return "<![CDATA[" + n.getNodeValue() + "]]&gt;";
		}
		if (name.startsWith("#")) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		sb.append("<").append(name);
		NamedNodeMap attrs = n.getAttributes();
		if (attrs != null) {
			for (int i = 0; i < attrs.getLength(); i++) {
				Node attr = attrs.item(i);
				sb.append(" ").append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
			}
		}
		String textContent = null;
		NodeList children = n.getChildNodes();
		if (children.getLength() == 0) {
			if (((textContent = n.getTextContent())) != null && (!"".equals(textContent))) {
				sb.append(textContent).append("</").append(name).append(">");
			} else {
				sb.append("/>");
			}
		} else {
			sb.append(">");
			boolean hasValidChildren = false;
			for (int i = 0; i < children.getLength(); i++) {
				String childToString = convertToXML(children.item(i));
				if (!"".equals(childToString)) {
					sb.append(childToString);
					hasValidChildren = true;
				}
			}
			if (!hasValidChildren && ((textContent = n.getTextContent()) != null)) {
				sb.append(textContent);
			}
			sb.append("</").append(name).append(">");
		}
		return sb.toString();
	}
	
	public GetBoardingDetailsResponseDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if(document.getElementsByTagName("Status").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Status").item(0))) {
				this.Status = BoardingStatusType.fromValue(document.getElementsByTagName("Status").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("StartDate").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("StartDate").item(0))) {
				this.StartDate = (String)document.getElementsByTagName("StartDate").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("LastUpdated").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("LastUpdated").item(0))) {
				this.LastUpdated = (String)document.getElementsByTagName("LastUpdated").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Reason").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Reason").item(0))) {
				this.Reason = (String)document.getElementsByTagName("Reason").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ProgramName").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ProgramName").item(0))) {
				this.ProgramName = (String)document.getElementsByTagName("ProgramName").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ProgramCode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ProgramCode").item(0))) {
				this.ProgramCode = (String)document.getElementsByTagName("ProgramCode").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("CampaignID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("CampaignID").item(0))) {
				this.CampaignID = (String)document.getElementsByTagName("CampaignID").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("UserWithdrawalLimit").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("UserWithdrawalLimit").item(0))) {
				this.UserWithdrawalLimit = UserWithdrawalLimitTypeType.fromValue(document.getElementsByTagName("UserWithdrawalLimit").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("PartnerCustom").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PartnerCustom").item(0))) {
				this.PartnerCustom = (String)document.getElementsByTagName("PartnerCustom").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("AccountOwner").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("AccountOwner").item(0))) {
				nodeList = document.getElementsByTagName("AccountOwner");
				xmlString = convertToXML(nodeList.item(0));
				this.AccountOwner =  new PayerInfoType(xmlString);
			}
		}
		if(document.getElementsByTagName("Credentials").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Credentials").item(0))) {
				nodeList = document.getElementsByTagName("Credentials");
				xmlString = convertToXML(nodeList.item(0));
				this.Credentials =  new APICredentialsType(xmlString);
			}
		}
		if (document.getElementsByTagName("ConfigureAPIs").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ConfigureAPIs").item(0))) {
				this.ConfigureAPIs = (String)document.getElementsByTagName("ConfigureAPIs").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("EmailVerificationStatus").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("EmailVerificationStatus").item(0))) {
				this.EmailVerificationStatus = (String)document.getElementsByTagName("EmailVerificationStatus").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("VettingStatus").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("VettingStatus").item(0))) {
				this.VettingStatus = (String)document.getElementsByTagName("VettingStatus").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("BankAccountVerificationStatus").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BankAccountVerificationStatus").item(0))) {
				this.BankAccountVerificationStatus = (String)document.getElementsByTagName("BankAccountVerificationStatus").item(0).getTextContent();
			}
		}
	
	}
 
}