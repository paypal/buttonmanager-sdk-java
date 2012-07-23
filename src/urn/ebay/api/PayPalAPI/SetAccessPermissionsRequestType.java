package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.SetAccessPermissionsRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * No Document Comments
 */
public class SetAccessPermissionsRequestType extends AbstractRequestType {


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private SetAccessPermissionsRequestDetailsType SetAccessPermissionsRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public SetAccessPermissionsRequestType (SetAccessPermissionsRequestDetailsType SetAccessPermissionsRequestDetails){
		this.SetAccessPermissionsRequestDetails = SetAccessPermissionsRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public SetAccessPermissionsRequestType (){
	}	

	/**
	 * Getter for SetAccessPermissionsRequestDetails
	 */
	 public SetAccessPermissionsRequestDetailsType getSetAccessPermissionsRequestDetails() {
	 	return SetAccessPermissionsRequestDetails;
	 }
	 
	/**
	 * Setter for SetAccessPermissionsRequestDetails
	 */
	 public void setSetAccessPermissionsRequestDetails(SetAccessPermissionsRequestDetailsType SetAccessPermissionsRequestDetails) {
	 	this.SetAccessPermissionsRequestDetails = SetAccessPermissionsRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(SetAccessPermissionsRequestDetails != null) {
			sb.append("<ebl:SetAccessPermissionsRequestDetails>");
			sb.append(SetAccessPermissionsRequestDetails.toXMLString());
			sb.append("</ebl:SetAccessPermissionsRequestDetails>");
		}
		return sb.toString();
	}

}