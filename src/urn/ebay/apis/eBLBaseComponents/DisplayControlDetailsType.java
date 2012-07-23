package urn.ebay.apis.eBLBaseComponents;

/**
 * Contains elements that allows customization of display (user
 * interface) elements. 
 */
public class DisplayControlDetailsType{


	/**
	 * Optional URL to pay button image for the inline checkout
	 * flow. Currently applicable only to the inline checkout flow
	 * when the FlowControlDetails/InlineReturnURL is present. 	 
	 */ 
	private String InContextPaymentButtonImage;

	

	/**
	 * Default Constructor
	 */
	public DisplayControlDetailsType (){
	}	

	/**
	 * Getter for InContextPaymentButtonImage
	 */
	 public String getInContextPaymentButtonImage() {
	 	return InContextPaymentButtonImage;
	 }
	 
	/**
	 * Setter for InContextPaymentButtonImage
	 */
	 public void setInContextPaymentButtonImage(String InContextPaymentButtonImage) {
	 	this.InContextPaymentButtonImage = InContextPaymentButtonImage;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(InContextPaymentButtonImage != null) {
			sb.append("<ebl:InContextPaymentButtonImage>").append(InContextPaymentButtonImage);
			sb.append("</ebl:InContextPaymentButtonImage>");
		}
		return sb.toString();
	}

}