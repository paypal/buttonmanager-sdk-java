package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * Email address of buyer to be verified. Required Maximum
 * string length: 255 single-byte characters Input mask: ?@?.??
 * 
 */
public class AddressVerifyRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * Email address of buyer to be verified. Required Maximum
	 * string length: 255 single-byte characters Input mask: ?@?.??	  
	 *@Required	 
	 */ 
	private String email;

	/**
	 * First line of buyer’s billing or shipping street address
	 * to be verified. Required For verification, input value of
	 * street address must match the first three single-byte
	 * characters of the street address on file for the PayPal
	 * account. Maximum string length: 35 single-byte characters
	 * Alphanumeric plus - , . ‘ # \ Whitespace and case of input
	 * value are ignored.	  
	 *@Required	 
	 */ 
	private String street;

	/**
	 * Postal code to be verified. Required For verification, input
	 * value of postal code must match the first five single-byte
	 * characters of the postal code on file for the PayPal
	 * account. Maximum string length: 16 single-byte characters
	 * Whitespace and case of input value are ignored.	  
	 *@Required	 
	 */ 
	private String zip;

	

	/**
	 * Constructor with arguments
	 */
	public AddressVerifyRequestType (String email, String street, String zip){
		this.email = email;
		this.street = street;
		this.zip = zip;
	}	

	/**
	 * Default Constructor
	 */
	public AddressVerifyRequestType (){
	}	

	/**
	 * Getter for email
	 */
	 public String getEmail() {
	 	return email;
	 }
	 
	/**
	 * Setter for email
	 */
	 public void setEmail(String email) {
	 	this.email = email;
	 }
	 
	/**
	 * Getter for street
	 */
	 public String getStreet() {
	 	return street;
	 }
	 
	/**
	 * Setter for street
	 */
	 public void setStreet(String street) {
	 	this.street = street;
	 }
	 
	/**
	 * Getter for zip
	 */
	 public String getZip() {
	 	return zip;
	 }
	 
	/**
	 * Setter for zip
	 */
	 public void setZip(String zip) {
	 	this.zip = zip;
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
		sb.append(super.toXMLString(prefix, null));
		if(email != null) {
			sb.append("<").append(preferredPrefix).append(":Email>").append(SDKUtil.escapeInvalidXmlCharsRegex(email));
			sb.append("</").append(preferredPrefix).append(":Email>");
		}
		if(street != null) {
			sb.append("<").append(preferredPrefix).append(":Street>").append(SDKUtil.escapeInvalidXmlCharsRegex(street));
			sb.append("</").append(preferredPrefix).append(":Street>");
		}
		if(zip != null) {
			sb.append("<").append(preferredPrefix).append(":Zip>").append(SDKUtil.escapeInvalidXmlCharsRegex(zip));
			sb.append("</").append(preferredPrefix).append(":Zip>");
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