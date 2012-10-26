package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.TaxIdDetailsType;
import urn.ebay.apis.eBLBaseComponents.IdentificationInfoType;
import com.paypal.core.SDKUtil;

/**
 * Details about the buyer's account passed in by the merchant
 * or partner. Optional. 
 */
public class BuyerDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * The client's unique ID for this user. 	 
	 */ 
	private String buyerId;

	/**
	 * The user name of the user at the marketplaces site. 	 
	 */ 
	private String buyerUserName;

	/**
	 * Date when the user registered with the marketplace. 	 
	 */ 
	private String buyerRegistrationDate;

	/**
	 * Details about payer's tax info. Refer to the
	 * TaxIdDetailsType for more details. 	 
	 */ 
	private TaxIdDetailsType taxIdDetails;

	/**
	 * Contains information that identifies the buyer. e.g. email
	 * address or the external remember me id. 	 
	 */ 
	private IdentificationInfoType identificationInfo;

	

	/**
	 * Default Constructor
	 */
	public BuyerDetailsType (){
	}	

	/**
	 * Getter for buyerId
	 */
	 public String getBuyerId() {
	 	return buyerId;
	 }
	 
	/**
	 * Setter for buyerId
	 */
	 public void setBuyerId(String buyerId) {
	 	this.buyerId = buyerId;
	 }
	 
	/**
	 * Getter for buyerUserName
	 */
	 public String getBuyerUserName() {
	 	return buyerUserName;
	 }
	 
	/**
	 * Setter for buyerUserName
	 */
	 public void setBuyerUserName(String buyerUserName) {
	 	this.buyerUserName = buyerUserName;
	 }
	 
	/**
	 * Getter for buyerRegistrationDate
	 */
	 public String getBuyerRegistrationDate() {
	 	return buyerRegistrationDate;
	 }
	 
	/**
	 * Setter for buyerRegistrationDate
	 */
	 public void setBuyerRegistrationDate(String buyerRegistrationDate) {
	 	this.buyerRegistrationDate = buyerRegistrationDate;
	 }
	 
	/**
	 * Getter for taxIdDetails
	 */
	 public TaxIdDetailsType getTaxIdDetails() {
	 	return taxIdDetails;
	 }
	 
	/**
	 * Setter for taxIdDetails
	 */
	 public void setTaxIdDetails(TaxIdDetailsType taxIdDetails) {
	 	this.taxIdDetails = taxIdDetails;
	 }
	 
	/**
	 * Getter for identificationInfo
	 */
	 public IdentificationInfoType getIdentificationInfo() {
	 	return identificationInfo;
	 }
	 
	/**
	 * Setter for identificationInfo
	 */
	 public void setIdentificationInfo(IdentificationInfoType identificationInfo) {
	 	this.identificationInfo = identificationInfo;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(buyerId != null) {
			sb.append("<").append(preferredPrefix).append(":BuyerId>").append(SDKUtil.escapeInvalidXmlCharsRegex(buyerId));
			sb.append("</").append(preferredPrefix).append(":BuyerId>");
		}
		if(buyerUserName != null) {
			sb.append("<").append(preferredPrefix).append(":BuyerUserName>").append(SDKUtil.escapeInvalidXmlCharsRegex(buyerUserName));
			sb.append("</").append(preferredPrefix).append(":BuyerUserName>");
		}
		if(buyerRegistrationDate != null) {
			sb.append("<").append(preferredPrefix).append(":BuyerRegistrationDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(buyerRegistrationDate));
			sb.append("</").append(preferredPrefix).append(":BuyerRegistrationDate>");
		}
		if(taxIdDetails != null) {
			sb.append(taxIdDetails.toXMLString(preferredPrefix,"TaxIdDetails"));
		}
		if(identificationInfo != null) {
			sb.append(identificationInfo.toXMLString(preferredPrefix,"IdentificationInfo"));
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		return sb.toString();
	}


}