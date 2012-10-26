package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.MobileIDInfoType;
import urn.ebay.apis.eBLBaseComponents.RememberMeIDInfoType;
import urn.ebay.apis.eBLBaseComponents.IdentityTokenInfoType;
import com.paypal.core.SDKUtil;

/**
 * Mobile specific buyer identification. 
 */
public class IdentificationInfoType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Mobile specific buyer identification.	 
	 */ 
	private MobileIDInfoType mobileIDInfo;

	/**
	 * Contains login bypass information.	 
	 */ 
	private RememberMeIDInfoType rememberMeIDInfo;

	/**
	 * Identity Access Token.	 
	 */ 
	private IdentityTokenInfoType identityTokenInfo;

	

	/**
	 * Default Constructor
	 */
	public IdentificationInfoType (){
	}	

	/**
	 * Getter for mobileIDInfo
	 */
	 public MobileIDInfoType getMobileIDInfo() {
	 	return mobileIDInfo;
	 }
	 
	/**
	 * Setter for mobileIDInfo
	 */
	 public void setMobileIDInfo(MobileIDInfoType mobileIDInfo) {
	 	this.mobileIDInfo = mobileIDInfo;
	 }
	 
	/**
	 * Getter for rememberMeIDInfo
	 */
	 public RememberMeIDInfoType getRememberMeIDInfo() {
	 	return rememberMeIDInfo;
	 }
	 
	/**
	 * Setter for rememberMeIDInfo
	 */
	 public void setRememberMeIDInfo(RememberMeIDInfoType rememberMeIDInfo) {
	 	this.rememberMeIDInfo = rememberMeIDInfo;
	 }
	 
	/**
	 * Getter for identityTokenInfo
	 */
	 public IdentityTokenInfoType getIdentityTokenInfo() {
	 	return identityTokenInfo;
	 }
	 
	/**
	 * Setter for identityTokenInfo
	 */
	 public void setIdentityTokenInfo(IdentityTokenInfoType identityTokenInfo) {
	 	this.identityTokenInfo = identityTokenInfo;
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
		if(mobileIDInfo != null) {
			sb.append(mobileIDInfo.toXMLString(preferredPrefix,"MobileIDInfo"));
		}
		if(rememberMeIDInfo != null) {
			sb.append(rememberMeIDInfo.toXMLString(preferredPrefix,"RememberMeIDInfo"));
		}
		if(identityTokenInfo != null) {
			sb.append(identityTokenInfo.toXMLString(preferredPrefix,"IdentityTokenInfo"));
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