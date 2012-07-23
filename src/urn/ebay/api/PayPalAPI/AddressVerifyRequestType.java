package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * Email address of buyer to be verified. Required Maximum
 * string length: 255 single-byte characters Input mask: ?@?.??
 * 
 */
public class AddressVerifyRequestType extends AbstractRequestType {


	/**
	 * Email address of buyer to be verified. Required Maximum
	 * string length: 255 single-byte characters Input mask: ?@?.??	  
	 *@Required	 
	 */ 
	private String Email;

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
	private String Street;

	/**
	 * Postal code to be verified. Required For verification, input
	 * value of postal code must match the first five single-byte
	 * characters of the postal code on file for the PayPal
	 * account. Maximum string length: 16 single-byte characters
	 * Whitespace and case of input value are ignored.	  
	 *@Required	 
	 */ 
	private String Zip;

	

	/**
	 * Constructor with arguments
	 */
	public AddressVerifyRequestType (String Email, String Street, String Zip){
		this.Email = Email;
		this.Street = Street;
		this.Zip = Zip;
	}	

	/**
	 * Default Constructor
	 */
	public AddressVerifyRequestType (){
	}	

	/**
	 * Getter for Email
	 */
	 public String getEmail() {
	 	return Email;
	 }
	 
	/**
	 * Setter for Email
	 */
	 public void setEmail(String Email) {
	 	this.Email = Email;
	 }
	 
	/**
	 * Getter for Street
	 */
	 public String getStreet() {
	 	return Street;
	 }
	 
	/**
	 * Setter for Street
	 */
	 public void setStreet(String Street) {
	 	this.Street = Street;
	 }
	 
	/**
	 * Getter for Zip
	 */
	 public String getZip() {
	 	return Zip;
	 }
	 
	/**
	 * Setter for Zip
	 */
	 public void setZip(String Zip) {
	 	this.Zip = Zip;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(Email != null) {
			sb.append("<urn:Email>").append(Email);
			sb.append("</urn:Email>");
		}
		if(Street != null) {
			sb.append("<urn:Street>").append(Street);
			sb.append("</urn:Street>");
		}
		if(Zip != null) {
			sb.append("<urn:Zip>").append(Zip);
			sb.append("</urn:Zip>");
		}
		return sb.toString();
	}

}