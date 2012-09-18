package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoExpressCheckoutPaymentRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoUATPExpressCheckoutPaymentRequestType extends DoExpressCheckoutPaymentRequestType {


	

	/**
	 * Default Constructor
	 */
	public DoUATPExpressCheckoutPaymentRequestType (){
	}	



	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		return sb.toString();
	}

}