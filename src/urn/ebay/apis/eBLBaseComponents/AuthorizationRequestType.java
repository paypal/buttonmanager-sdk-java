
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;



/**
 */
public class AuthorizationRequestType {

	/**
	 *
	 * @Required
	 */
	private Boolean IsRequested;
	public Boolean getIsRequested() {
		return IsRequested;
	}
	public void setIsRequested(Boolean value) {
		this.IsRequested = value;
	}


	public AuthorizationRequestType(Boolean IsRequested) {
		this.IsRequested = IsRequested;
	}
	public AuthorizationRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( IsRequested != null ) {
			sb.append("<ebl:IsRequested>").append(IsRequested);
			sb.append("</ebl:IsRequested>");
		}
		return sb.toString();
	}

}
