package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import com.paypal.core.SDKUtil;

/**
 * BusinessOwnerInfoType 
 */
public class BusinessOwnerInfoType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Details about the business owner	 
	 */ 
	private PayerInfoType owner;

	/**
	 * Business owner’s home telephone number Character length
	 * and limitations: 32 alphanumeric characters	 
	 */ 
	private String homePhone;

	/**
	 * Business owner’s mobile telephone number Character length
	 * and limitations: 32 alphanumeric characters	 
	 */ 
	private String mobilePhone;

	/**
	 * Business owner’s social security number Character length
	 * and limitations: 9 alphanumeric characters	 
	 */ 
	private String sSN;

	

	/**
	 * Default Constructor
	 */
	public BusinessOwnerInfoType (){
	}	

	/**
	 * Getter for owner
	 */
	 public PayerInfoType getOwner() {
	 	return owner;
	 }
	 
	/**
	 * Setter for owner
	 */
	 public void setOwner(PayerInfoType owner) {
	 	this.owner = owner;
	 }
	 
	/**
	 * Getter for homePhone
	 */
	 public String getHomePhone() {
	 	return homePhone;
	 }
	 
	/**
	 * Setter for homePhone
	 */
	 public void setHomePhone(String homePhone) {
	 	this.homePhone = homePhone;
	 }
	 
	/**
	 * Getter for mobilePhone
	 */
	 public String getMobilePhone() {
	 	return mobilePhone;
	 }
	 
	/**
	 * Setter for mobilePhone
	 */
	 public void setMobilePhone(String mobilePhone) {
	 	this.mobilePhone = mobilePhone;
	 }
	 
	/**
	 * Getter for sSN
	 */
	 public String getSSN() {
	 	return sSN;
	 }
	 
	/**
	 * Setter for sSN
	 */
	 public void setSSN(String sSN) {
	 	this.sSN = sSN;
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
		if(owner != null) {
			sb.append(owner.toXMLString(preferredPrefix,"Owner"));
		}
		if(homePhone != null) {
			sb.append("<").append(preferredPrefix).append(":HomePhone>").append(SDKUtil.escapeInvalidXmlCharsRegex(homePhone));
			sb.append("</").append(preferredPrefix).append(":HomePhone>");
		}
		if(mobilePhone != null) {
			sb.append("<").append(preferredPrefix).append(":MobilePhone>").append(SDKUtil.escapeInvalidXmlCharsRegex(mobilePhone));
			sb.append("</").append(preferredPrefix).append(":MobilePhone>");
		}
		if(sSN != null) {
			sb.append("<").append(preferredPrefix).append(":SSN>").append(SDKUtil.escapeInvalidXmlCharsRegex(sSN));
			sb.append("</").append(preferredPrefix).append(":SSN>");
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