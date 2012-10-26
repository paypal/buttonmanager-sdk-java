package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import com.paypal.core.SDKUtil;

/**
 * URL to which the customer's browser is returned after
 * choosing to login with PayPal. Required Character length and
 * limitations: no limit. 
 */
public class SetAccessPermissionsRequestDetailsType{


	/**
	 * URL to which the customer's browser is returned after
	 * choosing to login with PayPal. Required Character length and
	 * limitations: no limit. 	 
	 */ 
	private String ReturnURL;

	/**
	 * URL to which the customer is returned if he does not approve
	 * the use of PayPal login. Required Character length and
	 * limitations: no limit 	 
	 */ 
	private String CancelURL;

	/**
	 * URL to which the customer's browser is returned after user
	 * logs out from PayPal. Required Character length and
	 * limitations: no limit. 	 
	 */ 
	private String LogoutURL;

	/**
	 * The type of the flow. Optional Character length and
	 * limitations: 127 single-byte alphanumeric characters 	 
	 */ 
	private String InitFlowType;

	/**
	 * The used to decide SkipLogin allowed or not. Optional
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String SkipLoginPage;

	/**
	 * contains information about API Services 	 
	 */ 
	private List<String> RequiredAccessPermissions = new ArrayList<String>();

	/**
	 * contains information about API Services 	 
	 */ 
	private List<String> OptionalAccessPermissions = new ArrayList<String>();

	/**
	 * Locale of pages displayed by PayPal during Authentication
	 * Login. Optional Character length and limitations: Five
	 * single-byte alphabetic characters, upper- or lowercase.
	 * Allowable values: AU or en_AUDE or de_DEFR or fr_FRGB or
	 * en_GBIT or it_ITJP or ja_JPUS or en_US 	 
	 */ 
	private String LocaleCode;

	/**
	 * Sets the Custom Payment Page Style for flow pages associated
	 * with this button/link. PageStyle corresponds to the HTML
	 * variable page_style for customizing flow pages. The value is
	 * the same as the Page Style Name you chose when adding or
	 * editing the page style from the Profile subtab of the My
	 * Account tab of your PayPal account. Optional Character
	 * length and limitations: 30 single-byte alphabetic
	 * characters. 	 
	 */ 
	private String PageStyle;

	/**
	 * A URL for the image you want to appear at the top left of
	 * the flow page. The image has a maximum size of 750 pixels
	 * wide by 90 pixels high. PayPal recommends that you provide
	 * an image that is stored on a secure (https) server. Optional
	 * Character length and limitations: 127 	 
	 */ 
	private String cppHeaderImage;

	/**
	 * Sets the border color around the header of the flow page.
	 * The border is a 2-pixel perimeter around the header space,
	 * which is 750 pixels wide by 90 pixels high. Optional
	 * Character length and limitations: Six character HTML
	 * hexadecimal color code in ASCII 	 
	 */ 
	private String cppHeaderBorderColor;

	/**
	 * Sets the background color for the header of the flow page.
	 * Optional Character length and limitation: Six character HTML
	 * hexadecimal color code in ASCII 	 
	 */ 
	private String cppHeaderBackColor;

	/**
	 * Sets the background color for the payment page. Optional
	 * Character length and limitation: Six character HTML
	 * hexadecimal color code in ASCII 	 
	 */ 
	private String cppPayflowColor;

	/**
	 * First Name of the user, this information is used if user
	 * chooses to signup with PayPal. Optional Character length and
	 * limitation: Six character HTML hexadecimal color code in
	 * ASCII 	 
	 */ 
	private String FirstName;

	/**
	 * Last Name of the user, this information is used if user
	 * chooses to signup with PayPal. Optional Character length and
	 * limitation: Six character HTML hexadecimal color code in
	 * ASCII 	 
	 */ 
	private String LastName;

	/**
	 * User address, this information is used when user chooses to
	 * signup for PayPal. Optional If you include a shipping
	 * address and set the AddressOverride element on the request,
	 * PayPal returns this same address in
	 * GetExpressCheckoutDetailsResponse. 	 
	 */ 
	private AddressType Address;

	

	/**
	 * Default Constructor
	 */
	public SetAccessPermissionsRequestDetailsType (){
	}	

	/**
	 * Getter for ReturnURL
	 */
	 public String getReturnURL() {
	 	return ReturnURL;
	 }
	 
	/**
	 * Setter for ReturnURL
	 */
	 public void setReturnURL(String ReturnURL) {
	 	this.ReturnURL = ReturnURL;
	 }
	 
	/**
	 * Getter for CancelURL
	 */
	 public String getCancelURL() {
	 	return CancelURL;
	 }
	 
	/**
	 * Setter for CancelURL
	 */
	 public void setCancelURL(String CancelURL) {
	 	this.CancelURL = CancelURL;
	 }
	 
	/**
	 * Getter for LogoutURL
	 */
	 public String getLogoutURL() {
	 	return LogoutURL;
	 }
	 
	/**
	 * Setter for LogoutURL
	 */
	 public void setLogoutURL(String LogoutURL) {
	 	this.LogoutURL = LogoutURL;
	 }
	 
	/**
	 * Getter for InitFlowType
	 */
	 public String getInitFlowType() {
	 	return InitFlowType;
	 }
	 
	/**
	 * Setter for InitFlowType
	 */
	 public void setInitFlowType(String InitFlowType) {
	 	this.InitFlowType = InitFlowType;
	 }
	 
	/**
	 * Getter for SkipLoginPage
	 */
	 public String getSkipLoginPage() {
	 	return SkipLoginPage;
	 }
	 
	/**
	 * Setter for SkipLoginPage
	 */
	 public void setSkipLoginPage(String SkipLoginPage) {
	 	this.SkipLoginPage = SkipLoginPage;
	 }
	 
	/**
	 * Getter for RequiredAccessPermissions
	 */
	 public List<String> getRequiredAccessPermissions() {
	 	return RequiredAccessPermissions;
	 }
	 
	/**
	 * Setter for RequiredAccessPermissions
	 */
	 public void setRequiredAccessPermissions(List<String> RequiredAccessPermissions) {
	 	this.RequiredAccessPermissions = RequiredAccessPermissions;
	 }
	 
	/**
	 * Getter for OptionalAccessPermissions
	 */
	 public List<String> getOptionalAccessPermissions() {
	 	return OptionalAccessPermissions;
	 }
	 
	/**
	 * Setter for OptionalAccessPermissions
	 */
	 public void setOptionalAccessPermissions(List<String> OptionalAccessPermissions) {
	 	this.OptionalAccessPermissions = OptionalAccessPermissions;
	 }
	 
	/**
	 * Getter for LocaleCode
	 */
	 public String getLocaleCode() {
	 	return LocaleCode;
	 }
	 
	/**
	 * Setter for LocaleCode
	 */
	 public void setLocaleCode(String LocaleCode) {
	 	this.LocaleCode = LocaleCode;
	 }
	 
	/**
	 * Getter for PageStyle
	 */
	 public String getPageStyle() {
	 	return PageStyle;
	 }
	 
	/**
	 * Setter for PageStyle
	 */
	 public void setPageStyle(String PageStyle) {
	 	this.PageStyle = PageStyle;
	 }
	 
	/**
	 * Getter for cppHeaderImage
	 */
	 public String getCppHeaderImage() {
	 	return cppHeaderImage;
	 }
	 
	/**
	 * Setter for cppHeaderImage
	 */
	 public void setCppHeaderImage(String cppHeaderImage) {
	 	this.cppHeaderImage = cppHeaderImage;
	 }
	 
	/**
	 * Getter for cppHeaderBorderColor
	 */
	 public String getCppHeaderBorderColor() {
	 	return cppHeaderBorderColor;
	 }
	 
	/**
	 * Setter for cppHeaderBorderColor
	 */
	 public void setCppHeaderBorderColor(String cppHeaderBorderColor) {
	 	this.cppHeaderBorderColor = cppHeaderBorderColor;
	 }
	 
	/**
	 * Getter for cppHeaderBackColor
	 */
	 public String getCppHeaderBackColor() {
	 	return cppHeaderBackColor;
	 }
	 
	/**
	 * Setter for cppHeaderBackColor
	 */
	 public void setCppHeaderBackColor(String cppHeaderBackColor) {
	 	this.cppHeaderBackColor = cppHeaderBackColor;
	 }
	 
	/**
	 * Getter for cppPayflowColor
	 */
	 public String getCppPayflowColor() {
	 	return cppPayflowColor;
	 }
	 
	/**
	 * Setter for cppPayflowColor
	 */
	 public void setCppPayflowColor(String cppPayflowColor) {
	 	this.cppPayflowColor = cppPayflowColor;
	 }
	 
	/**
	 * Getter for FirstName
	 */
	 public String getFirstName() {
	 	return FirstName;
	 }
	 
	/**
	 * Setter for FirstName
	 */
	 public void setFirstName(String FirstName) {
	 	this.FirstName = FirstName;
	 }
	 
	/**
	 * Getter for LastName
	 */
	 public String getLastName() {
	 	return LastName;
	 }
	 
	/**
	 * Setter for LastName
	 */
	 public void setLastName(String LastName) {
	 	this.LastName = LastName;
	 }
	 
	/**
	 * Getter for Address
	 */
	 public AddressType getAddress() {
	 	return Address;
	 }
	 
	/**
	 * Setter for Address
	 */
	 public void setAddress(AddressType Address) {
	 	this.Address = Address;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ReturnURL != null) {
			sb.append("<ebl:ReturnURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(ReturnURL));
			sb.append("</ebl:ReturnURL>");
		}
		if(CancelURL != null) {
			sb.append("<ebl:CancelURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(CancelURL));
			sb.append("</ebl:CancelURL>");
		}
		if(LogoutURL != null) {
			sb.append("<ebl:LogoutURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(LogoutURL));
			sb.append("</ebl:LogoutURL>");
		}
		if(InitFlowType != null) {
			sb.append("<ebl:InitFlowType>").append(SDKUtil.escapeInvalidXmlCharsRegex(InitFlowType));
			sb.append("</ebl:InitFlowType>");
		}
		if(SkipLoginPage != null) {
			sb.append("<ebl:SkipLoginPage>").append(SDKUtil.escapeInvalidXmlCharsRegex(SkipLoginPage));
			sb.append("</ebl:SkipLoginPage>");
		}
		if(RequiredAccessPermissions != null) {
			for(int i=0; i < RequiredAccessPermissions.size(); i++) {
				sb.append("<ebl:RequiredAccessPermissions>").append(SDKUtil.escapeInvalidXmlCharsRegex(RequiredAccessPermissions.get(i)));
				sb.append("</ebl:RequiredAccessPermissions>");
			}
		}
		if(OptionalAccessPermissions != null) {
			for(int i=0; i < OptionalAccessPermissions.size(); i++) {
				sb.append("<ebl:OptionalAccessPermissions>").append(SDKUtil.escapeInvalidXmlCharsRegex(OptionalAccessPermissions.get(i)));
				sb.append("</ebl:OptionalAccessPermissions>");
			}
		}
		if(LocaleCode != null) {
			sb.append("<ebl:LocaleCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(LocaleCode));
			sb.append("</ebl:LocaleCode>");
		}
		if(PageStyle != null) {
			sb.append("<ebl:PageStyle>").append(SDKUtil.escapeInvalidXmlCharsRegex(PageStyle));
			sb.append("</ebl:PageStyle>");
		}
		if(cppHeaderImage != null) {
			sb.append("<ebl:cpp-header-image>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppHeaderImage));
			sb.append("</ebl:cpp-header-image>");
		}
		if(cppHeaderBorderColor != null) {
			sb.append("<ebl:cpp-header-border-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppHeaderBorderColor));
			sb.append("</ebl:cpp-header-border-color>");
		}
		if(cppHeaderBackColor != null) {
			sb.append("<ebl:cpp-header-back-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppHeaderBackColor));
			sb.append("</ebl:cpp-header-back-color>");
		}
		if(cppPayflowColor != null) {
			sb.append("<ebl:cpp-payflow-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppPayflowColor));
			sb.append("</ebl:cpp-payflow-color>");
		}
		if(FirstName != null) {
			sb.append("<ebl:FirstName>").append(SDKUtil.escapeInvalidXmlCharsRegex(FirstName));
			sb.append("</ebl:FirstName>");
		}
		if(LastName != null) {
			sb.append("<ebl:LastName>").append(SDKUtil.escapeInvalidXmlCharsRegex(LastName));
			sb.append("</ebl:LastName>");
		}
		if(Address != null) {
			sb.append("<ebl:Address>");
			sb.append(Address.toXMLString());
			sb.append("</ebl:Address>");
		}
		return sb.toString();
	}


}