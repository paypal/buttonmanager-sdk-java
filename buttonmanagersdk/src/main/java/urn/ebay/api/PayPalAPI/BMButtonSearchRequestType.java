package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * The earliest transaction date at which to start the search.
 * No wildcards are allowed. Required 
 */
public class BMButtonSearchRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * The earliest transaction date at which to start the search.
	 * No wildcards are allowed. Required 	 
	 */ 
	private String startDate;

	/**
	 * The latest transaction date to be included in the search
	 * Optional 	 
	 */ 
	private String endDate;

	

	/**
	 * Default Constructor
	 */
	public BMButtonSearchRequestType (){
	}	

	/**
	 * Getter for startDate
	 */
	 public String getStartDate() {
	 	return startDate;
	 }
	 
	/**
	 * Setter for startDate
	 */
	 public void setStartDate(String startDate) {
	 	this.startDate = startDate;
	 }
	 
	/**
	 * Getter for endDate
	 */
	 public String getEndDate() {
	 	return endDate;
	 }
	 
	/**
	 * Setter for endDate
	 */
	 public void setEndDate(String endDate) {
	 	this.endDate = endDate;
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
		if(startDate != null) {
			sb.append("<").append(preferredPrefix).append(":StartDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(startDate));
			sb.append("</").append(preferredPrefix).append(":StartDate>");
		}
		if(endDate != null) {
			sb.append("<").append(preferredPrefix).append(":EndDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(endDate));
			sb.append("</").append(preferredPrefix).append(":EndDate>");
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