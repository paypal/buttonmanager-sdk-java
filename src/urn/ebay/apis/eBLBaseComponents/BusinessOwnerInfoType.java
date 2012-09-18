package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import com.paypal.core.SDKUtil;

/**
 * BusinessOwnerInfoType 
 */
public class BusinessOwnerInfoType{


	/**
	 * Details about the business owner	 
	 */ 
	private PayerInfoType Owner;

	/**
	 * Business owner’s home telephone number Character length
	 * and limitations: 32 alphanumeric characters	 
	 */ 
	private String HomePhone;

	/**
	 * Business owner’s mobile telephone number Character length
	 * and limitations: 32 alphanumeric characters	 
	 */ 
	private String MobilePhone;

	/**
	 * Business owner’s social security number Character length
	 * and limitations: 9 alphanumeric characters	 
	 */ 
	private String SSN;

	

	/**
	 * Default Constructor
	 */
	public BusinessOwnerInfoType (){
	}	

	/**
	 * Getter for Owner
	 */
	 public PayerInfoType getOwner() {
	 	return Owner;
	 }
	 
	/**
	 * Setter for Owner
	 */
	 public void setOwner(PayerInfoType Owner) {
	 	this.Owner = Owner;
	 }
	 
	/**
	 * Getter for HomePhone
	 */
	 public String getHomePhone() {
	 	return HomePhone;
	 }
	 
	/**
	 * Setter for HomePhone
	 */
	 public void setHomePhone(String HomePhone) {
	 	this.HomePhone = HomePhone;
	 }
	 
	/**
	 * Getter for MobilePhone
	 */
	 public String getMobilePhone() {
	 	return MobilePhone;
	 }
	 
	/**
	 * Setter for MobilePhone
	 */
	 public void setMobilePhone(String MobilePhone) {
	 	this.MobilePhone = MobilePhone;
	 }
	 
	/**
	 * Getter for SSN
	 */
	 public String getSSN() {
	 	return SSN;
	 }
	 
	/**
	 * Setter for SSN
	 */
	 public void setSSN(String SSN) {
	 	this.SSN = SSN;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Owner != null) {
			sb.append("<ebl:Owner>");
			sb.append(Owner.toXMLString());
			sb.append("</ebl:Owner>");
		}
		if(HomePhone != null) {
			sb.append("<ebl:HomePhone>").append(SDKUtil.escapeInvalidXmlCharsRegex(HomePhone));
			sb.append("</ebl:HomePhone>");
		}
		if(MobilePhone != null) {
			sb.append("<ebl:MobilePhone>").append(SDKUtil.escapeInvalidXmlCharsRegex(MobilePhone));
			sb.append("</ebl:MobilePhone>");
		}
		if(SSN != null) {
			sb.append("<ebl:SSN>").append(SDKUtil.escapeInvalidXmlCharsRegex(SSN));
			sb.append("</ebl:SSN>");
		}
		return sb.toString();
	}

}