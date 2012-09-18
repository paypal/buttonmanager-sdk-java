package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PhoneNumberType;
import com.paypal.core.SDKUtil;

/**
 * Phone number for status inquiry 
 */
public class GetMobileStatusRequestDetailsType{


	/**
	 * Phone number for status inquiry 	 
	 */ 
	private PhoneNumberType Phone;

	

	/**
	 * Default Constructor
	 */
	public GetMobileStatusRequestDetailsType (){
	}	

	/**
	 * Getter for Phone
	 */
	 public PhoneNumberType getPhone() {
	 	return Phone;
	 }
	 
	/**
	 * Setter for Phone
	 */
	 public void setPhone(PhoneNumberType Phone) {
	 	this.Phone = Phone;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Phone != null) {
			sb.append("<ebl:Phone>");
			sb.append(Phone.toXMLString());
			sb.append("</ebl:Phone>");
		}
		return sb.toString();
	}

}