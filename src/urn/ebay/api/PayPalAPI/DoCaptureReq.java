package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoCaptureRequestType;

/**
 * No Document Comments
 */
public class DoCaptureReq{


	/**
	 * No Document Comments	 
	 */ 
	private DoCaptureRequestType DoCaptureRequest;

	

	/**
	 * Default Constructor
	 */
	public DoCaptureReq (){
	}	

	/**
	 * Getter for DoCaptureRequest
	 */
	 public DoCaptureRequestType getDoCaptureRequest() {
	 	return DoCaptureRequest;
	 }
	 
	/**
	 * Setter for DoCaptureRequest
	 */
	 public void setDoCaptureRequest(DoCaptureRequestType DoCaptureRequest) {
	 	this.DoCaptureRequest = DoCaptureRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:DoCaptureReq>");
		if(DoCaptureRequest != null) {
			sb.append("<urn:DoCaptureRequest>");
			sb.append(DoCaptureRequest.toXMLString());
			sb.append("</urn:DoCaptureRequest>");
		}
		sb.append("</urn:DoCaptureReq>");
		return sb.toString();
	}

}