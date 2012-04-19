
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;



/**
 * Contains elements that allows customization of display (user interface) elements.
 */
public class DisplayControlDetailsType {

	/**
	 * Optional URL to pay button image for the inline checkout flow.  Currently applicable
	 * only to the inline checkout flow when the FlowControlDetails/InlineReturnURL is present.
	 */
	private String InContextPaymentButtonImage;
	public String getInContextPaymentButtonImage() {
		return InContextPaymentButtonImage;
	}
	public void setInContextPaymentButtonImage(String value) {
		this.InContextPaymentButtonImage = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( InContextPaymentButtonImage != null ) {
			sb.append("<ebl:InContextPaymentButtonImage>").append(InContextPaymentButtonImage);
			sb.append("</ebl:InContextPaymentButtonImage>");
		}
		return sb.toString();
	}

}
