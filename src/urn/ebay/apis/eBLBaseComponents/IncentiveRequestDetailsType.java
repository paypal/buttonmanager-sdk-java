
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.IncentiveRequestCodeType;
import urn.ebay.apis.eBLBaseComponents.IncentiveRequestDetailLevelCodeType;


/**
 */
public class IncentiveRequestDetailsType {

	/**
	 */
	private String RequestId;
	public String getRequestId() {
		return RequestId;
	}
	public void setRequestId(String value) {
		this.RequestId = value;
	}

	/**
	 */
	private IncentiveRequestCodeType RequestType;
	public IncentiveRequestCodeType getRequestType() {
		return RequestType;
	}
	public void setRequestType(IncentiveRequestCodeType value) {
		this.RequestType = value;
	}

	/**
	 */
	private IncentiveRequestDetailLevelCodeType RequestDetailLevel;
	public IncentiveRequestDetailLevelCodeType getRequestDetailLevel() {
		return RequestDetailLevel;
	}
	public void setRequestDetailLevel(IncentiveRequestDetailLevelCodeType value) {
		this.RequestDetailLevel = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( RequestId != null ) {
			sb.append("<ebl:RequestId>").append(RequestId);
			sb.append("</ebl:RequestId>");
		}
		if( RequestType != null ) {
			sb.append("<ebl:RequestType>").append( RequestType.getValue());
			sb.append("</ebl:RequestType>");
		}
		if( RequestDetailLevel != null ) {
			sb.append("<ebl:RequestDetailLevel>").append( RequestDetailLevel.getValue());
			sb.append("</ebl:RequestDetailLevel>");
		}
		return sb.toString();
	}

}
