package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.MassPayRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class MassPayReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private MassPayRequestType massPayRequest;

	

	/**
	 * Default Constructor
	 */
	public MassPayReq (){
	}	

	/**
	 * Getter for massPayRequest
	 */
	 public MassPayRequestType getMassPayRequest() {
	 	return massPayRequest;
	 }
	 
	/**
	 * Setter for massPayRequest
	 */
	 public void setMassPayRequest(MassPayRequestType massPayRequest) {
	 	this.massPayRequest = massPayRequest;
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
		if(massPayRequest != null) {
			sb.append(massPayRequest.toXMLString(null,"MassPayRequest"));
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