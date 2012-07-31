package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.UpdateAccessPermissionsRequestType;

/**
 * 
 */
public class UpdateAccessPermissionsReq{


	/**
	 * 	 
	 */ 
	private UpdateAccessPermissionsRequestType UpdateAccessPermissionsRequest;

	

	/**
	 * Default Constructor
	 */
	public UpdateAccessPermissionsReq (){
	}	

	/**
	 * Getter for UpdateAccessPermissionsRequest
	 */
	 public UpdateAccessPermissionsRequestType getUpdateAccessPermissionsRequest() {
	 	return UpdateAccessPermissionsRequest;
	 }
	 
	/**
	 * Setter for UpdateAccessPermissionsRequest
	 */
	 public void setUpdateAccessPermissionsRequest(UpdateAccessPermissionsRequestType UpdateAccessPermissionsRequest) {
	 	this.UpdateAccessPermissionsRequest = UpdateAccessPermissionsRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:UpdateAccessPermissionsReq>");
		if(UpdateAccessPermissionsRequest != null) {
			sb.append("<urn:UpdateAccessPermissionsRequest>");
			sb.append(UpdateAccessPermissionsRequest.toXMLString());
			sb.append("</urn:UpdateAccessPermissionsRequest>");
		}
		sb.append("</urn:UpdateAccessPermissionsReq>");
		return sb.toString();
	}

}