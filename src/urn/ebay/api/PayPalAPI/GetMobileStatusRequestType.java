package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.GetMobileStatusRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetMobileStatusRequestType extends AbstractRequestType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private GetMobileStatusRequestDetailsType GetMobileStatusRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public GetMobileStatusRequestType (GetMobileStatusRequestDetailsType GetMobileStatusRequestDetails){
		this.GetMobileStatusRequestDetails = GetMobileStatusRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public GetMobileStatusRequestType (){
	}	

	/**
	 * Getter for GetMobileStatusRequestDetails
	 */
	 public GetMobileStatusRequestDetailsType getGetMobileStatusRequestDetails() {
	 	return GetMobileStatusRequestDetails;
	 }
	 
	/**
	 * Setter for GetMobileStatusRequestDetails
	 */
	 public void setGetMobileStatusRequestDetails(GetMobileStatusRequestDetailsType GetMobileStatusRequestDetails) {
	 	this.GetMobileStatusRequestDetails = GetMobileStatusRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(GetMobileStatusRequestDetails != null) {
			sb.append("<ebl:GetMobileStatusRequestDetails>");
			sb.append(GetMobileStatusRequestDetails.toXMLString());
			sb.append("</ebl:GetMobileStatusRequestDetails>");
		}
		return sb.toString();
	}

}