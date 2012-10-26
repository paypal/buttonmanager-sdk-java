package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoExpressCheckoutPaymentRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoUATPExpressCheckoutPaymentRequestType extends DoExpressCheckoutPaymentRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	

	/**
	 * Default Constructor
	 */
	public DoUATPExpressCheckoutPaymentRequestType (){
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