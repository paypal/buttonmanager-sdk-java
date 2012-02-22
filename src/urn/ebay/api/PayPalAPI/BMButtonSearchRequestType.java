
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


/**
 * The earliest transaction date at which to start the search. No wildcards are allowed. 
 * Required
 */
public class BMButtonSearchRequestType extends AbstractRequestType{

	/**
	 * The earliest transaction date at which to start the search. No wildcards are allowed. 
	 * Required
	 */
	private String StartDate;
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String value) {
		this.StartDate = value;
	}

	/**
	 * The latest transaction date to be included in the search 
	 * Optional
	 */
	private String EndDate;
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String value) {
		this.EndDate = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( StartDate != null ) {
			sb.append("<urn:StartDate>").append(StartDate);
			sb.append("</urn:StartDate>");
		}
		if( EndDate != null ) {
			sb.append("<urn:EndDate>").append(EndDate);
			sb.append("</urn:EndDate>");
		}
		return sb.toString();
	}

}
