package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * Country code associated with this phone number. 
 */
public class PhoneNumberType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Country code associated with this phone number. 	 
	 */ 
	private String countryCode;

	/**
	 * Phone number associated with this phone. 	 
	 */ 
	private String phoneNumber;

	/**
	 * Extension associated with this phone number. 	 
	 */ 
	private String extension;

	

	/**
	 * Default Constructor
	 */
	public PhoneNumberType (){
	}	

	/**
	 * Getter for countryCode
	 */
	 public String getCountryCode() {
	 	return countryCode;
	 }
	 
	/**
	 * Setter for countryCode
	 */
	 public void setCountryCode(String countryCode) {
	 	this.countryCode = countryCode;
	 }
	 
	/**
	 * Getter for phoneNumber
	 */
	 public String getPhoneNumber() {
	 	return phoneNumber;
	 }
	 
	/**
	 * Setter for phoneNumber
	 */
	 public void setPhoneNumber(String phoneNumber) {
	 	this.phoneNumber = phoneNumber;
	 }
	 
	/**
	 * Getter for extension
	 */
	 public String getExtension() {
	 	return extension;
	 }
	 
	/**
	 * Setter for extension
	 */
	 public void setExtension(String extension) {
	 	this.extension = extension;
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
		if(countryCode != null) {
			sb.append("<").append(preferredPrefix).append(":CountryCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(countryCode));
			sb.append("</").append(preferredPrefix).append(":CountryCode>");
		}
		if(phoneNumber != null) {
			sb.append("<").append(preferredPrefix).append(":PhoneNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(phoneNumber));
			sb.append("</").append(preferredPrefix).append(":PhoneNumber>");
		}
		if(extension != null) {
			sb.append("<").append(preferredPrefix).append(":Extension>").append(SDKUtil.escapeInvalidXmlCharsRegex(extension));
			sb.append("</").append(preferredPrefix).append(":Extension>");
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