package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoCaptureRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoCaptureReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private DoCaptureRequestType doCaptureRequest;

	

	/**
	 * Default Constructor
	 */
	public DoCaptureReq (){
	}	

	/**
	 * Getter for doCaptureRequest
	 */
	 public DoCaptureRequestType getDoCaptureRequest() {
	 	return doCaptureRequest;
	 }
	 
	/**
	 * Setter for doCaptureRequest
	 */
	 public void setDoCaptureRequest(DoCaptureRequestType doCaptureRequest) {
	 	this.doCaptureRequest = doCaptureRequest;
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
		if(doCaptureRequest != null) {
			sb.append(doCaptureRequest.toXMLString(null,"DoCaptureRequest"));
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