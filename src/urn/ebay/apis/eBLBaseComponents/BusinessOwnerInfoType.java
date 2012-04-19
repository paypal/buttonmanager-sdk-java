
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.PayerInfoType;


/**
 * BusinessOwnerInfoType 
 */
public class BusinessOwnerInfoType {

	/**
	 * Details about the business owner	 */
	private PayerInfoType Owner;
	public PayerInfoType getOwner() {
		return Owner;
	}
	public void setOwner(PayerInfoType value) {
		this.Owner = value;
	}

	/**
	 * Business owner’s home telephone number
	 * Character length and limitations: 32 alphanumeric characters	 */
	private String HomePhone;
	public String getHomePhone() {
		return HomePhone;
	}
	public void setHomePhone(String value) {
		this.HomePhone = value;
	}

	/**
	 * Business owner’s mobile telephone number
	 * Character length and limitations: 32 alphanumeric characters	 */
	private String MobilePhone;
	public String getMobilePhone() {
		return MobilePhone;
	}
	public void setMobilePhone(String value) {
		this.MobilePhone = value;
	}

	/**
	 * Business owner’s social security number
	 * Character length and limitations: 9 alphanumeric characters	 */
	private String SSN;
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String value) {
		this.SSN = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( Owner != null ) {
			sb.append("<ebl:Owner>");
			sb.append(Owner.toXMLString());
			sb.append("</ebl:Owner>");
		}
		if( HomePhone != null ) {
			sb.append("<ebl:HomePhone>").append(HomePhone);
			sb.append("</ebl:HomePhone>");
		}
		if( MobilePhone != null ) {
			sb.append("<ebl:MobilePhone>").append(MobilePhone);
			sb.append("</ebl:MobilePhone>");
		}
		if( SSN != null ) {
			sb.append("<ebl:SSN>").append(SSN);
			sb.append("</ebl:SSN>");
		}
		return sb.toString();
	}

}
