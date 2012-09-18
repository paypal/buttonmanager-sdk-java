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


	/**
	 * Allowable values: 0,1 The value 1 indicates that the
	 * customer can accept push funding, and 0 means they cannot.
	 * Optional Character length and limitations: One single-byte
	 * numeric character. 	 
	 */ 
	private String AllowPushFunding;

	/**
	 * Allowable values: ELV, CreditCard, ChinaUnionPay, BML This
	 * element could be used to specify the perered funding option
	 * for a guest users. It has effect only if LandingPage element
	 * is set to Billing. Otherwise it will be ignored. 	 
	 */ 
	private UserSelectedFundingSourceType UserSelectedFundingSource;

	

	/**
	 * Default Constructor
	 */
	public FundingSourceDetailsType (){
	}	

	/**
	 * Getter for AllowPushFunding
	 */
	 public String getAllowPushFunding() {
	 	return AllowPushFunding;
	 }
	 
	/**
	 * Setter for AllowPushFunding
	 */
	 public void setAllowPushFunding(String AllowPushFunding) {
	 	this.AllowPushFunding = AllowPushFunding;
	 }
	 
	/**
	 * Getter for UserSelectedFundingSource
	 */
	 public UserSelectedFundingSourceType getUserSelectedFundingSource() {
	 	return UserSelectedFundingSource;
	 }
	 
	/**
	 * Setter for UserSelectedFundingSource
	 */
	 public void setUserSelectedFundingSource(UserSelectedFundingSourceType UserSelectedFundingSource) {
	 	this.UserSelectedFundingSource = UserSelectedFundingSource;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(AllowPushFunding != null) {
			sb.append("<ebl:AllowPushFunding>").append(SDKUtil.escapeInvalidXmlCharsRegex(AllowPushFunding));
			sb.append("</ebl:AllowPushFunding>");
		}
		if(UserSelectedFundingSource != null) {
			sb.append("<ebl:UserSelectedFundingSource>").append(SDKUtil.escapeInvalidXmlCharsRegex(UserSelectedFundingSource.getValue()));
			sb.append("</ebl:UserSelectedFundingSource>");
		}
		return sb.toString();
	}

}