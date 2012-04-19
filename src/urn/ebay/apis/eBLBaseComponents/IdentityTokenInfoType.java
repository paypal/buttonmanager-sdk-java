
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;



/**
 * Identity Access token from merchant
 */
public class IdentityTokenInfoType {

	/**
Identity Access token from merchant	 *
	 * @Required
	 */
	private String AccessToken;
	public String getAccessToken() {
		return AccessToken;
	}
	public void setAccessToken(String value) {
		this.AccessToken = value;
	}


	public IdentityTokenInfoType(String AccessToken) {
		this.AccessToken = AccessToken;
	}
	public IdentityTokenInfoType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( AccessToken != null ) {
			sb.append("<ebl:AccessToken>").append(AccessToken);
			sb.append("</ebl:AccessToken>");
		}
		return sb.toString();
	}

}
