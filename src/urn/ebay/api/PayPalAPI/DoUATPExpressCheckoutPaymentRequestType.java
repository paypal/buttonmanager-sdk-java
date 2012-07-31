package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoExpressCheckoutPaymentRequestType;

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