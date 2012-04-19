
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.IdentityTokenInfoType;
import urn.ebay.apis.eBLBaseComponents.MobileIDInfoType;
import urn.ebay.apis.eBLBaseComponents.RememberMeIDInfoType;


/**
 * Mobile specific buyer identification.
 */
public class IdentificationInfoType {

	/**
Mobile specific buyer identification.	 */
	private MobileIDInfoType MobileIDInfo;
	public MobileIDInfoType getMobileIDInfo() {
		return MobileIDInfo;
	}
	public void setMobileIDInfo(MobileIDInfoType value) {
		this.MobileIDInfo = value;
	}

	/**
Contains login bypass information.	 */
	private RememberMeIDInfoType RememberMeIDInfo;
	public RememberMeIDInfoType getRememberMeIDInfo() {
		return RememberMeIDInfo;
	}
	public void setRememberMeIDInfo(RememberMeIDInfoType value) {
		this.RememberMeIDInfo = value;
	}

	/**
Identity Access Token.	 */
	private IdentityTokenInfoType IdentityTokenInfo;
	public IdentityTokenInfoType getIdentityTokenInfo() {
		return IdentityTokenInfo;
	}
	public void setIdentityTokenInfo(IdentityTokenInfoType value) {
		this.IdentityTokenInfo = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( MobileIDInfo != null ) {
			sb.append("<ebl:MobileIDInfo>");
			sb.append(MobileIDInfo.toXMLString());
			sb.append("</ebl:MobileIDInfo>");
		}
		if( RememberMeIDInfo != null ) {
			sb.append("<ebl:RememberMeIDInfo>");
			sb.append(RememberMeIDInfo.toXMLString());
			sb.append("</ebl:RememberMeIDInfo>");
		}
		if( IdentityTokenInfo != null ) {
			sb.append("<ebl:IdentityTokenInfo>");
			sb.append(IdentityTokenInfo.toXMLString());
			sb.append("</ebl:IdentityTokenInfo>");
		}
		return sb.toString();
	}

}
