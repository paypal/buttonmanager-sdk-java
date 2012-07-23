package urn.ebay.apis.eBLBaseComponents;

/**
 * An optional set of values related to flow-specific details. 
 */
public class FlowControlDetailsType{


	/**
	 * The URL to redirect to for an unpayable transaction. This
	 * field is currently used only for the inline checkout flow. 	 
	 */ 
	private String ErrorURL;

	/**
	 * The URL to redirect to after a user clicks the "Pay" or
	 * "Continue" button on the merchant's site. This field is
	 * currently used only for the inline checkout flow. 	 
	 */ 
	private String InContextReturnURL;

	

	/**
	 * Default Constructor
	 */
	public FlowControlDetailsType (){
	}	

	/**
	 * Getter for ErrorURL
	 */
	 public String getErrorURL() {
	 	return ErrorURL;
	 }
	 
	/**
	 * Setter for ErrorURL
	 */
	 public void setErrorURL(String ErrorURL) {
	 	this.ErrorURL = ErrorURL;
	 }
	 
	/**
	 * Getter for InContextReturnURL
	 */
	 public String getInContextReturnURL() {
	 	return InContextReturnURL;
	 }
	 
	/**
	 * Setter for InContextReturnURL
	 */
	 public void setInContextReturnURL(String InContextReturnURL) {
	 	this.InContextReturnURL = InContextReturnURL;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ErrorURL != null) {
			sb.append("<ebl:ErrorURL>").append(ErrorURL);
			sb.append("</ebl:ErrorURL>");
		}
		if(InContextReturnURL != null) {
			sb.append("<ebl:InContextReturnURL>").append(InContextReturnURL);
			sb.append("</ebl:InContextReturnURL>");
		}
		return sb.toString();
	}

}