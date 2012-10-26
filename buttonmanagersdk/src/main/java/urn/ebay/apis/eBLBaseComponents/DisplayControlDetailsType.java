package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * Contains elements that allows customization of display (user
 * interface) elements. 
 */
public class DisplayControlDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Optional URL to pay button image for the inline checkout
	 * flow. Currently applicable only to the inline checkout flow
	 * when the FlowControlDetails/InlineReturnURL is present. 	 
	 */ 
	private String inContextPaymentButtonImage;

	

	/**
	 * Default Constructor
	 */
	public DisplayControlDetailsType (){
	}	

	/**
	 * Getter for inContextPaymentButtonImage
	 */
	 public String getInContextPaymentButtonImage() {
	 	return inContextPaymentButtonImage;
	 }
	 
	/**
	 * Setter for inContextPaymentButtonImage
	 */
	 public void setInContextPaymentButtonImage(String inContextPaymentButtonImage) {
	 	this.inContextPaymentButtonImage = inContextPaymentButtonImage;
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
		if(inContextPaymentButtonImage != null) {
			sb.append("<").append(preferredPrefix).append(":InContextPaymentButtonImage>").append(SDKUtil.escapeInvalidXmlCharsRegex(inContextPaymentButtonImage));
			sb.append("</").append(preferredPrefix).append(":InContextPaymentButtonImage>");
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