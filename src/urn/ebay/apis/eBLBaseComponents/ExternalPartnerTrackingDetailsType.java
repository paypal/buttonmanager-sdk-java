package urn.ebay.apis.eBLBaseComponents;

/**
 * Contains elements that allow tracking for an external
 * partner. 
 */
public class ExternalPartnerTrackingDetailsType{


	/**
	 * PayPal will just log this string. There will NOT be any
	 * business logic around it, nor any decisions made based on
	 * the value of the string that is passed in. From a
	 * tracking/analytical perspective, PayPal would not infer any
	 * meaning to any specific value. We would just segment the
	 * traffic based on the value passed (Cart and None as an
	 * example) and track different metrics like risk/conversion
	 * etc based on these segments. The external partner would
	 * control the value of what gets passed and we take that value
	 * as is and generate data based on it. Optional 	 
	 */ 
	private String ExternalPartnerSegmentID;

	

	/**
	 * Default Constructor
	 */
	public ExternalPartnerTrackingDetailsType (){
	}	

	/**
	 * Getter for ExternalPartnerSegmentID
	 */
	 public String getExternalPartnerSegmentID() {
	 	return ExternalPartnerSegmentID;
	 }
	 
	/**
	 * Setter for ExternalPartnerSegmentID
	 */
	 public void setExternalPartnerSegmentID(String ExternalPartnerSegmentID) {
	 	this.ExternalPartnerSegmentID = ExternalPartnerSegmentID;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ExternalPartnerSegmentID != null) {
			sb.append("<ebl:ExternalPartnerSegmentID>").append(ExternalPartnerSegmentID);
			sb.append("</ebl:ExternalPartnerSegmentID>");
		}
		return sb.toString();
	}

}