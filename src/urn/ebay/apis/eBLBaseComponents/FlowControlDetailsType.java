
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;



/**
 * An optional set of values related to flow-specific details.
 */
public class FlowControlDetailsType {

	/**
	 * The URL to redirect to for an unpayable transaction.  This field is currently used only
	 * for the inline checkout flow.
	 */
	private String ErrorURL;
	public String getErrorURL() {
		return ErrorURL;
	}
	public void setErrorURL(String value) {
		this.ErrorURL = value;
	}

	/**
	 * The URL to redirect to after a user clicks the "Pay" or "Continue" button on the merchant's
	 * site.  This field is currently used only for the inline checkout flow.
	 */
	private String InContextReturnURL;
	public String getInContextReturnURL() {
		return InContextReturnURL;
	}
	public void setInContextReturnURL(String value) {
		this.InContextReturnURL = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ErrorURL != null ) {
			sb.append("<ebl:ErrorURL>").append(ErrorURL);
			sb.append("</ebl:ErrorURL>");
		}
		if( InContextReturnURL != null ) {
			sb.append("<ebl:InContextReturnURL>").append(InContextReturnURL);
			sb.append("</ebl:InContextReturnURL>");
		}
		return sb.toString();
	}

}
