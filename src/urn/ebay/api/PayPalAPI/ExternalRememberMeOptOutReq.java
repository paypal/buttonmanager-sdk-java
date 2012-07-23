package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.ExternalRememberMeOptOutRequestType;

/**
 * No Document Comments
 */
public class ExternalRememberMeOptOutReq{


	/**
	 * No Document Comments	 
	 */ 
	private ExternalRememberMeOptOutRequestType ExternalRememberMeOptOutRequest;

	

	/**
	 * Default Constructor
	 */
	public ExternalRememberMeOptOutReq (){
	}	

	/**
	 * Getter for ExternalRememberMeOptOutRequest
	 */
	 public ExternalRememberMeOptOutRequestType getExternalRememberMeOptOutRequest() {
	 	return ExternalRememberMeOptOutRequest;
	 }
	 
	/**
	 * Setter for ExternalRememberMeOptOutRequest
	 */
	 public void setExternalRememberMeOptOutRequest(ExternalRememberMeOptOutRequestType ExternalRememberMeOptOutRequest) {
	 	this.ExternalRememberMeOptOutRequest = ExternalRememberMeOptOutRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:ExternalRememberMeOptOutReq>");
		if(ExternalRememberMeOptOutRequest != null) {
			sb.append("<urn:ExternalRememberMeOptOutRequest>");
			sb.append(ExternalRememberMeOptOutRequest.toXMLString());
			sb.append("</urn:ExternalRememberMeOptOutRequest>");
		}
		sb.append("</urn:ExternalRememberMeOptOutReq>");
		return sb.toString();
	}

}