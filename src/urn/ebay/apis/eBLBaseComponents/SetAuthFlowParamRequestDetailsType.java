
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.AddressType;


/**
 * URL to which the customer's browser is returned after choosing to login with PayPal.
 * Required
 * Character length and limitations: no limit. 
 */
public class SetAuthFlowParamRequestDetailsType {

	/**
URL to which the customer's browser is returned after choosing to login with PayPal.
	 * Required
	 * Character length and limitations: no limit. 	 */
	private String ReturnURL;
	public String getReturnURL() {
		return ReturnURL;
	}
	public void setReturnURL(String value) {
		this.ReturnURL = value;
	}

	/**
URL to which the customer is returned if he does not approve the use of PayPal login. 
	 * Required
	 * Character length and limitations: no limit
	 */
	private String CancelURL;
	public String getCancelURL() {
		return CancelURL;
	}
	public void setCancelURL(String value) {
		this.CancelURL = value;
	}

	/**
URL to which the customer's browser is returned after user logs out from PayPal. 
	 * Required
	 * Character length and limitations: no limit. 	 */
	private String LogoutURL;
	public String getLogoutURL() {
		return LogoutURL;
	}
	public void setLogoutURL(String value) {
		this.LogoutURL = value;
	}

	/**
The type of the flow.
	 * Optional
	 * Character length and limitations: 127 single-byte alphanumeric characters
	 */
	private String InitFlowType;
	public String getInitFlowType() {
		return InitFlowType;
	}
	public void setInitFlowType(String value) {
		this.InitFlowType = value;
	}

	/**
The used to decide SkipLogin allowed or not.
	 * Optional
	 * Character length and limitations: 127 single-byte alphanumeric characters
	 */
	private String SkipLoginPage;
	public String getSkipLoginPage() {
		return SkipLoginPage;
	}
	public void setSkipLoginPage(String value) {
		this.SkipLoginPage = value;
	}

	/**
The name of the field Merchant requires from PayPal after user's login.
	 * Optional
	 * Character length and limitations: 256 single-byte alphanumeric characters
	 */
	private String ServiceName1;
	public String getServiceName1() {
		return ServiceName1;
	}
	public void setServiceName1(String value) {
		this.ServiceName1 = value;
	}

	/**
Whether the field is required, opt-in or opt-out.
	 * Optional
	 * Character length and limitations: 127 single-byte alphanumeric characters
	 */
	private String ServiceDefReq1;
	public String getServiceDefReq1() {
		return ServiceDefReq1;
	}
	public void setServiceDefReq1(String value) {
		this.ServiceDefReq1 = value;
	}

	/**
The name of the field Merchant requires from PayPal after user's login.
	 * Optional
	 * Character length and limitations: 256 single-byte alphanumeric characters
	 */
	private String ServiceName2;
	public String getServiceName2() {
		return ServiceName2;
	}
	public void setServiceName2(String value) {
		this.ServiceName2 = value;
	}

	/**
Whether the field is required, opt-in or opt-out.
	 * Optional
	 * Character length and limitations: 127 single-byte alphanumeric characters
	 */
	private String ServiceDefReq2;
	public String getServiceDefReq2() {
		return ServiceDefReq2;
	}
	public void setServiceDefReq2(String value) {
		this.ServiceDefReq2 = value;
	}

	/**
	 * Locale of pages displayed by PayPal during Authentication Login.
	 * Optional
	 * Character length and limitations: Five single-byte alphabetic characters, upper- or lowercase. 
	 * Allowable values: 
	 * AU or en_AU
	 * DE or de_DE
	 * FR or fr_FR
	 * GB or en_GB
	 * IT or it_IT
	 * JP or ja_JP
	 * US or en_US
	 */
	private String LocaleCode;
	public String getLocaleCode() {
		return LocaleCode;
	}
	public void setLocaleCode(String value) {
		this.LocaleCode = value;
	}

	/**
Sets the Custom Payment Page Style for flow pages associated with this button/link. PageStyle corresponds to the HTML variable page_style for customizing flow pages. The value is the same as the Page Style Name you chose when adding or editing the page style from the Profile subtab of the My Account tab of your PayPal account. 
	 * Optional
	 * Character length and limitations: 30 single-byte alphabetic characters.
	 */
	private String PageStyle;
	public String getPageStyle() {
		return PageStyle;
	}
	public void setPageStyle(String value) {
		this.PageStyle = value;
	}

	/**
	 * A URL for the image you want to appear at the top left of the flow page. The image has a maximum size of 750 pixels wide by 90 pixels high. PayPal recommends that you provide an image that is stored on a secure (https) server. 
	 * Optional
	 * Character length and limitations: 127
	 */
	private String cppheaderimage;
	public String getCppheaderimage() {
		return cppheaderimage;
	}
	public void setCppheaderimage(String value) {
		this.cppheaderimage = value;
	}

	/**
	 * Sets the border color around the header of the flow page. The border is a 2-pixel perimeter around the header space, which is 750 pixels wide by 90 pixels high. 
	 * Optional
	 * Character length and limitations: Six character HTML hexadecimal color code in ASCII
	 */
	private String cppheaderbordercolor;
	public String getCppheaderbordercolor() {
		return cppheaderbordercolor;
	}
	public void setCppheaderbordercolor(String value) {
		this.cppheaderbordercolor = value;
	}

	/**
	 * Sets the background color for the header of the flow page. 
	 * Optional
	 * Character length and limitation: Six character HTML hexadecimal color code in ASCII
	 */
	private String cppheaderbackcolor;
	public String getCppheaderbackcolor() {
		return cppheaderbackcolor;
	}
	public void setCppheaderbackcolor(String value) {
		this.cppheaderbackcolor = value;
	}

	/**
	 * Sets the background color for the payment page. 
	 * Optional
	 * Character length and limitation: Six character HTML hexadecimal color code in ASCII
	 */
	private String cpppayflowcolor;
	public String getCpppayflowcolor() {
		return cpppayflowcolor;
	}
	public void setCpppayflowcolor(String value) {
		this.cpppayflowcolor = value;
	}

	/**
First Name of the user, this information is used if user chooses to signup with PayPal.
	 * Optional
	 * Character length and limitation: Six character HTML hexadecimal color code in ASCII
	 */
	private String FirstName;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String value) {
		this.FirstName = value;
	}

	/**
Last Name of the user, this information is used if user chooses to signup with PayPal.
	 * Optional
	 * Character length and limitation: Six character HTML hexadecimal color code in ASCII
	 */
	private String LastName;
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String value) {
		this.LastName = value;
	}

	/**
User address, this information is used when user chooses to signup for PayPal.
	 * Optional
	 * If you include a shipping address and set the AddressOverride element on the request, PayPal returns this same address in GetExpressCheckoutDetailsResponse. 
	 */
	private AddressType Address;
	public AddressType getAddress() {
		return Address;
	}
	public void setAddress(AddressType value) {
		this.Address = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ReturnURL != null ) {
			sb.append("<ebl:ReturnURL>").append(ReturnURL);
			sb.append("</ebl:ReturnURL>");
		}
		if( CancelURL != null ) {
			sb.append("<ebl:CancelURL>").append(CancelURL);
			sb.append("</ebl:CancelURL>");
		}
		if( LogoutURL != null ) {
			sb.append("<ebl:LogoutURL>").append(LogoutURL);
			sb.append("</ebl:LogoutURL>");
		}
		if( InitFlowType != null ) {
			sb.append("<ebl:InitFlowType>").append(InitFlowType);
			sb.append("</ebl:InitFlowType>");
		}
		if( SkipLoginPage != null ) {
			sb.append("<ebl:SkipLoginPage>").append(SkipLoginPage);
			sb.append("</ebl:SkipLoginPage>");
		}
		if( ServiceName1 != null ) {
			sb.append("<ebl:ServiceName1>").append(ServiceName1);
			sb.append("</ebl:ServiceName1>");
		}
		if( ServiceDefReq1 != null ) {
			sb.append("<ebl:ServiceDefReq1>").append(ServiceDefReq1);
			sb.append("</ebl:ServiceDefReq1>");
		}
		if( ServiceName2 != null ) {
			sb.append("<ebl:ServiceName2>").append(ServiceName2);
			sb.append("</ebl:ServiceName2>");
		}
		if( ServiceDefReq2 != null ) {
			sb.append("<ebl:ServiceDefReq2>").append(ServiceDefReq2);
			sb.append("</ebl:ServiceDefReq2>");
		}
		if( LocaleCode != null ) {
			sb.append("<ebl:LocaleCode>").append(LocaleCode);
			sb.append("</ebl:LocaleCode>");
		}
		if( PageStyle != null ) {
			sb.append("<ebl:PageStyle>").append(PageStyle);
			sb.append("</ebl:PageStyle>");
		}
		if( cppheaderimage != null ) {
			sb.append("<ebl:cpp-header-image>").append(cppheaderimage);
			sb.append("</ebl:cpp-header-image>");
		}
		if( cppheaderbordercolor != null ) {
			sb.append("<ebl:cpp-header-border-color>").append(cppheaderbordercolor);
			sb.append("</ebl:cpp-header-border-color>");
		}
		if( cppheaderbackcolor != null ) {
			sb.append("<ebl:cpp-header-back-color>").append(cppheaderbackcolor);
			sb.append("</ebl:cpp-header-back-color>");
		}
		if( cpppayflowcolor != null ) {
			sb.append("<ebl:cpp-payflow-color>").append(cpppayflowcolor);
			sb.append("</ebl:cpp-payflow-color>");
		}
		if( FirstName != null ) {
			sb.append("<ebl:FirstName>").append(FirstName);
			sb.append("</ebl:FirstName>");
		}
		if( LastName != null ) {
			sb.append("<ebl:LastName>").append(LastName);
			sb.append("</ebl:LastName>");
		}
		if( Address != null ) {
			sb.append("<ebl:Address>");
			sb.append(Address.toXMLString());
			sb.append("</ebl:Address>");
		}
		return sb.toString();
	}

}
