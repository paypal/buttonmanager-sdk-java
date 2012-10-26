package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.EnterBoardingRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class EnterBoardingRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private EnterBoardingRequestDetailsType enterBoardingRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public EnterBoardingRequestType (EnterBoardingRequestDetailsType enterBoardingRequestDetails){
		this.enterBoardingRequestDetails = enterBoardingRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public EnterBoardingRequestType (){
	}	

	/**
	 * Getter for enterBoardingRequestDetails
	 */
	 public EnterBoardingRequestDetailsType getEnterBoardingRequestDetails() {
	 	return enterBoardingRequestDetails;
	 }
	 
	/**
	 * Setter for enterBoardingRequestDetails
	 */
	 public void setEnterBoardingRequestDetails(EnterBoardingRequestDetailsType enterBoardingRequestDetails) {
	 	this.enterBoardingRequestDetails = enterBoardingRequestDetails;
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
		if(enterBoardingRequestDetails != null) {
			sb.append(enterBoardingRequestDetails.toXMLString(null,"EnterBoardingRequestDetails"));
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