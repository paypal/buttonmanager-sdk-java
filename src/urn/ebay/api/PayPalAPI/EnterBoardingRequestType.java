package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.EnterBoardingRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class EnterBoardingRequestType extends AbstractRequestType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private EnterBoardingRequestDetailsType EnterBoardingRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public EnterBoardingRequestType (EnterBoardingRequestDetailsType EnterBoardingRequestDetails){
		this.EnterBoardingRequestDetails = EnterBoardingRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public EnterBoardingRequestType (){
	}	

	/**
	 * Getter for EnterBoardingRequestDetails
	 */
	 public EnterBoardingRequestDetailsType getEnterBoardingRequestDetails() {
	 	return EnterBoardingRequestDetails;
	 }
	 
	/**
	 * Setter for EnterBoardingRequestDetails
	 */
	 public void setEnterBoardingRequestDetails(EnterBoardingRequestDetailsType EnterBoardingRequestDetails) {
	 	this.EnterBoardingRequestDetails = EnterBoardingRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(EnterBoardingRequestDetails != null) {
			sb.append("<ebl:EnterBoardingRequestDetails>");
			sb.append(EnterBoardingRequestDetails.toXMLString());
			sb.append("</ebl:EnterBoardingRequestDetails>");
		}
		return sb.toString();
	}


}