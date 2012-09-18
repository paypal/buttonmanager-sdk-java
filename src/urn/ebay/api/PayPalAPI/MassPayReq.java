package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.MassPayRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class MassPayReq{


	/**
	 * 	 
	 */ 
	private MassPayRequestType MassPayRequest;

	

	/**
	 * Default Constructor
	 */
	public MassPayReq (){
	}	

	/**
	 * Getter for MassPayRequest
	 */
	 public MassPayRequestType getMassPayRequest() {
	 	return MassPayRequest;
	 }
	 
	/**
	 * Setter for MassPayRequest
	 */
	 public void setMassPayRequest(MassPayRequestType MassPayRequest) {
	 	this.MassPayRequest = MassPayRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:MassPayReq>");
		if(MassPayRequest != null) {
			sb.append("<urn:MassPayRequest>");
			sb.append(MassPayRequest.toXMLString());
			sb.append("</urn:MassPayRequest>");
		}
		sb.append("</urn:MassPayReq>");
		return sb.toString();
	}

}