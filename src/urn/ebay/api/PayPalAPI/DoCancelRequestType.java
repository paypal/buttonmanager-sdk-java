
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.APIType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


/**
 * Msg Sub Id that was used for the orginal operation. 
 */
public class DoCancelRequestType extends AbstractRequestType{

	/**
Msg Sub Id that was used for the orginal operation. 	 *
	 * @Required
	 */
	private String CancelMsgSubID;
	public String getCancelMsgSubID() {
		return CancelMsgSubID;
	}
	public void setCancelMsgSubID(String value) {
		this.CancelMsgSubID = value;
	}

	/**
Original API's type	 *
	 * @Required
	 */
	private APIType APIType;
	public APIType getAPIType() {
		return APIType;
	}
	public void setAPIType(APIType value) {
		this.APIType = value;
	}


	public DoCancelRequestType(String CancelMsgSubID, APIType APIType) {
		this.CancelMsgSubID = CancelMsgSubID;
		this.APIType = APIType;
	}
	public DoCancelRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( CancelMsgSubID != null ) {
			sb.append("<urn:CancelMsgSubID>").append(CancelMsgSubID);
			sb.append("</urn:CancelMsgSubID>");
		}
		if( APIType != null ) {
			sb.append("<urn:APIType>").append( APIType.getValue());
			sb.append("</urn:APIType>");
		}
		return sb.toString();
	}

}
