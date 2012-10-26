package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.UserSelectedFundingSourceType;
import com.paypal.core.SDKUtil;

/**
 * Allowable values: 0,1 The value 1 indicates that the
 * customer can accept push funding, and 0 means they cannot.
 * Optional Character length and limitations: One single-byte
 * numeric character. 
 */
public class FundingSourceDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Allowable values: 0,1 The value 1 indicates that the
	 * customer can accept push funding, and 0 means they cannot.
	 * Optional Character length and limitations: One single-byte
	 * numeric character. 	 
	 */ 
	private String allowPushFunding;

	/**
	 * Allowable values: ELV, CreditCard, ChinaUnionPay, BML This
	 * element could be used to specify the perered funding option
	 * for a guest users. It has effect only if LandingPage element
	 * is set to Billing. Otherwise it will be ignored. 	 
	 */ 
	private UserSelectedFundingSourceType userSelectedFundingSource;

	

	/**
	 * Default Constructor
	 */
	public FundingSourceDetailsType (){
	}	

	/**
	 * Getter for allowPushFunding
	 */
	 public String getAllowPushFunding() {
	 	return allowPushFunding;
	 }
	 
	/**
	 * Setter for allowPushFunding
	 */
	 public void setAllowPushFunding(String allowPushFunding) {
	 	this.allowPushFunding = allowPushFunding;
	 }
	 
	/**
	 * Getter for userSelectedFundingSource
	 */
	 public UserSelectedFundingSourceType getUserSelectedFundingSource() {
	 	return userSelectedFundingSource;
	 }
	 
	/**
	 * Setter for userSelectedFundingSource
	 */
	 public void setUserSelectedFundingSource(UserSelectedFundingSourceType userSelectedFundingSource) {
	 	this.userSelectedFundingSource = userSelectedFundingSource;
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
		if(allowPushFunding != null) {
			sb.append("<").append(preferredPrefix).append(":AllowPushFunding>").append(SDKUtil.escapeInvalidXmlCharsRegex(allowPushFunding));
			sb.append("</").append(preferredPrefix).append(":AllowPushFunding>");
		}
		if(userSelectedFundingSource != null) {
			sb.append("<").append(preferredPrefix).append(":UserSelectedFundingSource>").append(SDKUtil.escapeInvalidXmlCharsRegex(userSelectedFundingSource.getValue()));
			sb.append("</").append(preferredPrefix).append(":UserSelectedFundingSource>");
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