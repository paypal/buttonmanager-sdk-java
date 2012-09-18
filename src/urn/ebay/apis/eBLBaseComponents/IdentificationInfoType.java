package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.MobileIDInfoType;
import urn.ebay.apis.eBLBaseComponents.RememberMeIDInfoType;
import urn.ebay.apis.eBLBaseComponents.IdentityTokenInfoType;
import com.paypal.core.SDKUtil;

/**
 * Mobile specific buyer identification. 
 */
public class IdentificationInfoType{


	/**
	 * Mobile specific buyer identification.	 
	 */ 
	private MobileIDInfoType MobileIDInfo;

	/**
	 * Contains login bypass information.	 
	 */ 
	private RememberMeIDInfoType RememberMeIDInfo;

	/**
	 * Identity Access Token.	 
	 */ 
	private IdentityTokenInfoType IdentityTokenInfo;

	

	/**
	 * Default Constructor
	 */
	public IdentificationInfoType (){
	}	

	/**
	 * Getter for MobileIDInfo
	 */
	 public MobileIDInfoType getMobileIDInfo() {
	 	return MobileIDInfo;
	 }
	 
	/**
	 * Setter for MobileIDInfo
	 */
	 public void setMobileIDInfo(MobileIDInfoType MobileIDInfo) {
	 	this.MobileIDInfo = MobileIDInfo;
	 }
	 
	/**
	 * Getter for RememberMeIDInfo
	 */
	 public RememberMeIDInfoType getRememberMeIDInfo() {
	 	return RememberMeIDInfo;
	 }
	 
	/**
	 * Setter for RememberMeIDInfo
	 */
	 public void setRememberMeIDInfo(RememberMeIDInfoType RememberMeIDInfo) {
	 	this.RememberMeIDInfo = RememberMeIDInfo;
	 }
	 
	/**
	 * Getter for IdentityTokenInfo
	 */
	 public IdentityTokenInfoType getIdentityTokenInfo() {
	 	return IdentityTokenInfo;
	 }
	 
	/**
	 * Setter for IdentityTokenInfo
	 */
	 public void setIdentityTokenInfo(IdentityTokenInfoType IdentityTokenInfo) {
	 	this.IdentityTokenInfo = IdentityTokenInfo;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(MobileIDInfo != null) {
			sb.append("<ebl:MobileIDInfo>");
			sb.append(MobileIDInfo.toXMLString());
			sb.append("</ebl:MobileIDInfo>");
		}
		if(RememberMeIDInfo != null) {
			sb.append("<ebl:RememberMeIDInfo>");
			sb.append(RememberMeIDInfo.toXMLString());
			sb.append("</ebl:RememberMeIDInfo>");
		}
		if(IdentityTokenInfo != null) {
			sb.append("<ebl:IdentityTokenInfo>");
			sb.append(IdentityTokenInfo.toXMLString());
			sb.append("</ebl:IdentityTokenInfo>");
		}
		return sb.toString();
	}

}