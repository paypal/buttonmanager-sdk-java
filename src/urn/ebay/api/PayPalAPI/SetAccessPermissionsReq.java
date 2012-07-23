package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.SetAccessPermissionsRequestType;

/**
 * No Document Comments
 */
public class SetAccessPermissionsReq{


	/**
	 * No Document Comments	 
	 */ 
	private SetAccessPermissionsRequestType SetAccessPermissionsRequest;

	

	/**
	 * Default Constructor
	 */
	public SetAccessPermissionsReq (){
	}	

	/**
	 * Getter for SetAccessPermissionsRequest
	 */
	 public SetAccessPermissionsRequestType getSetAccessPermissionsRequest() {
	 	return SetAccessPermissionsRequest;
	 }
	 
	/**
	 * Setter for SetAccessPermissionsRequest
	 */
	 public void setSetAccessPermissionsRequest(SetAccessPermissionsRequestType SetAccessPermissionsRequest) {
	 	this.SetAccessPermissionsRequest = SetAccessPermissionsRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:SetAccessPermissionsReq>");
		if(SetAccessPermissionsRequest != null) {
			sb.append("<urn:SetAccessPermissionsRequest>");
			sb.append(SetAccessPermissionsRequest.toXMLString());
			sb.append("</urn:SetAccessPermissionsRequest>");
		}
		sb.append("</urn:SetAccessPermissionsReq>");
		return sb.toString();
	}

}