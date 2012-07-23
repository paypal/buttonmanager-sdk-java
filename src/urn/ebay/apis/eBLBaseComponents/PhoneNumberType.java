package urn.ebay.apis.eBLBaseComponents;

/**
 * Country code associated with this phone number. 
 */
public class PhoneNumberType{


	/**
	 * Country code associated with this phone number. 	 
	 */ 
	private String CountryCode;

	/**
	 * Phone number associated with this phone. 	 
	 */ 
	private String PhoneNumber;

	/**
	 * Extension associated with this phone number. 	 
	 */ 
	private String Extension;

	

	/**
	 * Default Constructor
	 */
	public PhoneNumberType (){
	}	

	/**
	 * Getter for CountryCode
	 */
	 public String getCountryCode() {
	 	return CountryCode;
	 }
	 
	/**
	 * Setter for CountryCode
	 */
	 public void setCountryCode(String CountryCode) {
	 	this.CountryCode = CountryCode;
	 }
	 
	/**
	 * Getter for PhoneNumber
	 */
	 public String getPhoneNumber() {
	 	return PhoneNumber;
	 }
	 
	/**
	 * Setter for PhoneNumber
	 */
	 public void setPhoneNumber(String PhoneNumber) {
	 	this.PhoneNumber = PhoneNumber;
	 }
	 
	/**
	 * Getter for Extension
	 */
	 public String getExtension() {
	 	return Extension;
	 }
	 
	/**
	 * Setter for Extension
	 */
	 public void setExtension(String Extension) {
	 	this.Extension = Extension;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(CountryCode != null) {
			sb.append("<ebl:CountryCode>").append(CountryCode);
			sb.append("</ebl:CountryCode>");
		}
		if(PhoneNumber != null) {
			sb.append("<ebl:PhoneNumber>").append(PhoneNumber);
			sb.append("</ebl:PhoneNumber>");
		}
		if(Extension != null) {
			sb.append("<ebl:Extension>").append(Extension);
			sb.append("</ebl:Extension>");
		}
		return sb.toString();
	}

}