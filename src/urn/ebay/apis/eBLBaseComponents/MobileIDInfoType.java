
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;



/**
 * The Session token returned during buyer authentication.
 */
public class MobileIDInfoType {

	/**
The Session token returned during buyer authentication.	 */
	private String SessionToken;
	public String getSessionToken() {
		return SessionToken;
	}
	public void setSessionToken(String value) {
		this.SessionToken = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( SessionToken != null ) {
			sb.append("<ebl:SessionToken>").append(SessionToken);
			sb.append("</ebl:SessionToken>");
		}
		return sb.toString();
	}

}
