package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.GetMobileStatusRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetMobileStatusRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private GetMobileStatusRequestDetailsType getMobileStatusRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public GetMobileStatusRequestType (GetMobileStatusRequestDetailsType getMobileStatusRequestDetails){
		this.getMobileStatusRequestDetails = getMobileStatusRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public GetMobileStatusRequestType (){
	}	

	/**
	 * Getter for getMobileStatusRequestDetails
	 */
	 public GetMobileStatusRequestDetailsType getGetMobileStatusRequestDetails() {
	 	return getMobileStatusRequestDetails;
	 }
	 
	/**
	 * Setter for getMobileStatusRequestDetails
	 */
	 public void setGetMobileStatusRequestDetails(GetMobileStatusRequestDetailsType getMobileStatusRequestDetails) {
	 	this.getMobileStatusRequestDetails = getMobileStatusRequestDetails;
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
		sb.append(super.toXMLString(prefix, null));
		if(getMobileStatusRequestDetails != null) {
			sb.append(getMobileStatusRequestDetails.toXMLString(null,"GetMobileStatusRequestDetails"));
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