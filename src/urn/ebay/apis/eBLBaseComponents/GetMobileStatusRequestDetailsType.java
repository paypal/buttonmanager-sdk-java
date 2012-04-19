
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.PhoneNumberType;


/**
 * Phone number for status inquiry 
 */
public class GetMobileStatusRequestDetailsType {

	/**
Phone number for status inquiry 	 */
	private PhoneNumberType Phone;
	public PhoneNumberType getPhone() {
		return Phone;
	}
	public void setPhone(PhoneNumberType value) {
		this.Phone = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( Phone != null ) {
			sb.append("<ebl:Phone>");
			sb.append(Phone.toXMLString());
			sb.append("</ebl:Phone>");
		}
		return sb.toString();
	}

}
