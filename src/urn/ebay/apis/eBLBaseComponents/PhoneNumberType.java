
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;



/**
 * Country code associated with this phone number.  
 */
public class PhoneNumberType {

	/**
	 * Country code associated with this phone number.  
	 */
	private String CountryCode;
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String value) {
		this.CountryCode = value;
	}

	/**
	 * Phone number associated with this phone.  
	 */
	private String PhoneNumber;
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String value) {
		this.PhoneNumber = value;
	}

	/**
	 * Extension associated with this phone number.  
	 */
	private String Extension;
	public String getExtension() {
		return Extension;
	}
	public void setExtension(String value) {
		this.Extension = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( CountryCode != null ) {
			sb.append("<ebl:CountryCode>").append(CountryCode);
			sb.append("</ebl:CountryCode>");
		}
		if( PhoneNumber != null ) {
			sb.append("<ebl:PhoneNumber>").append(PhoneNumber);
			sb.append("</ebl:PhoneNumber>");
		}
		if( Extension != null ) {
			sb.append("<ebl:Extension>").append(Extension);
			sb.append("</ebl:Extension>");
		}
		return sb.toString();
	}

}
