package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * The earliest transaction date at which to start the search.
 * No wildcards are allowed. Required 
 */
public class BMButtonSearchRequestType extends AbstractRequestType {


	/**
	 * The earliest transaction date at which to start the search.
	 * No wildcards are allowed. Required 	 
	 */ 
	private String StartDate;

	/**
	 * The latest transaction date to be included in the search
	 * Optional 	 
	 */ 
	private String EndDate;

	

	/**
	 * Default Constructor
	 */
	public BMButtonSearchRequestType (){
	}	

	/**
	 * Getter for StartDate
	 */
	 public String getStartDate() {
	 	return StartDate;
	 }
	 
	/**
	 * Setter for StartDate
	 */
	 public void setStartDate(String StartDate) {
	 	this.StartDate = StartDate;
	 }
	 
	/**
	 * Getter for EndDate
	 */
	 public String getEndDate() {
	 	return EndDate;
	 }
	 
	/**
	 * Setter for EndDate
	 */
	 public void setEndDate(String EndDate) {
	 	this.EndDate = EndDate;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(StartDate != null) {
			sb.append("<urn:StartDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(StartDate));
			sb.append("</urn:StartDate>");
		}
		if(EndDate != null) {
			sb.append("<urn:EndDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(EndDate));
			sb.append("</urn:EndDate>");
		}
		return sb.toString();
	}

}