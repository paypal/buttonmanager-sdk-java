package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.TaxIdDetailsType;
import urn.ebay.apis.eBLBaseComponents.IdentificationInfoType;
import com.paypal.core.SDKUtil;

/**
 * Details about the buyer's account passed in by the merchant
 * or partner. Optional. 
 */
public class BuyerDetailsType{


	/**
	 * The client's unique ID for this user. 	 
	 */ 
	private String BuyerId;

	/**
	 * The user name of the user at the marketplaces site. 	 
	 */ 
	private String BuyerUserName;

	/**
	 * Date when the user registered with the marketplace. 	 
	 */ 
	private String BuyerRegistrationDate;

	/**
	 * Details about payer's tax info. Refer to the
	 * TaxIdDetailsType for more details. 	 
	 */ 
	private TaxIdDetailsType TaxIdDetails;

	/**
	 * Contains information that identifies the buyer. e.g. email
	 * address or the external remember me id. 	 
	 */ 
	private IdentificationInfoType IdentificationInfo;

	

	/**
	 * Default Constructor
	 */
	public BuyerDetailsType (){
	}	

	/**
	 * Getter for BuyerId
	 */
	 public String getBuyerId() {
	 	return BuyerId;
	 }
	 
	/**
	 * Setter for BuyerId
	 */
	 public void setBuyerId(String BuyerId) {
	 	this.BuyerId = BuyerId;
	 }
	 
	/**
	 * Getter for BuyerUserName
	 */
	 public String getBuyerUserName() {
	 	return BuyerUserName;
	 }
	 
	/**
	 * Setter for BuyerUserName
	 */
	 public void setBuyerUserName(String BuyerUserName) {
	 	this.BuyerUserName = BuyerUserName;
	 }
	 
	/**
	 * Getter for BuyerRegistrationDate
	 */
	 public String getBuyerRegistrationDate() {
	 	return BuyerRegistrationDate;
	 }
	 
	/**
	 * Setter for BuyerRegistrationDate
	 */
	 public void setBuyerRegistrationDate(String BuyerRegistrationDate) {
	 	this.BuyerRegistrationDate = BuyerRegistrationDate;
	 }
	 
	/**
	 * Getter for TaxIdDetails
	 */
	 public TaxIdDetailsType getTaxIdDetails() {
	 	return TaxIdDetails;
	 }
	 
	/**
	 * Setter for TaxIdDetails
	 */
	 public void setTaxIdDetails(TaxIdDetailsType TaxIdDetails) {
	 	this.TaxIdDetails = TaxIdDetails;
	 }
	 
	/**
	 * Getter for IdentificationInfo
	 */
	 public IdentificationInfoType getIdentificationInfo() {
	 	return IdentificationInfo;
	 }
	 
	/**
	 * Setter for IdentificationInfo
	 */
	 public void setIdentificationInfo(IdentificationInfoType IdentificationInfo) {
	 	this.IdentificationInfo = IdentificationInfo;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(BuyerId != null) {
			sb.append("<ebl:BuyerId>").append(SDKUtil.escapeInvalidXmlCharsRegex(BuyerId));
			sb.append("</ebl:BuyerId>");
		}
		if(BuyerUserName != null) {
			sb.append("<ebl:BuyerUserName>").append(SDKUtil.escapeInvalidXmlCharsRegex(BuyerUserName));
			sb.append("</ebl:BuyerUserName>");
		}
		if(BuyerRegistrationDate != null) {
			sb.append("<ebl:BuyerRegistrationDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(BuyerRegistrationDate));
			sb.append("</ebl:BuyerRegistrationDate>");
		}
		if(TaxIdDetails != null) {
			sb.append("<ebl:TaxIdDetails>");
			sb.append(TaxIdDetails.toXMLString());
			sb.append("</ebl:TaxIdDetails>");
		}
		if(IdentificationInfo != null) {
			sb.append("<ebl:IdentificationInfo>");
			sb.append(IdentificationInfo.toXMLString());
			sb.append("</ebl:IdentificationInfo>");
		}
		return sb.toString();
	}


}