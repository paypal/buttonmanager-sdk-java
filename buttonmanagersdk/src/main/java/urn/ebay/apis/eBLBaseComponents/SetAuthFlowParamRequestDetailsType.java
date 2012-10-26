package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import com.paypal.core.SDKUtil;

/**
 * URL to which the customer's browser is returned after
 * choosing to login with PayPal. Required Character length and
 * limitations: no limit. 
 */
public class SetAuthFlowParamRequestDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * URL to which the customer's browser is returned after
	 * choosing to login with PayPal. Required Character length and
	 * limitations: no limit. 	 
	 */ 
	private String returnURL;

	/**
	 * URL to which the customer is returned if he does not approve
	 * the use of PayPal login. Required Character length and
	 * limitations: no limit	 
	 */ 
	private String cancelURL;

	/**
	 * URL to which the customer's browser is returned after user
	 * logs out from PayPal. Required Character length and
	 * limitations: no limit. 	 
	 */ 
	private String logoutURL;

	/**
	 * The type of the flow. Optional Character length and
	 * limitations: 127 single-byte alphanumeric characters	 
	 */ 
	private String initFlowType;

	/**
	 * The used to decide SkipLogin allowed or not. Optional
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String skipLoginPage;

	/**
	 * The name of the field Merchant requires from PayPal after
	 * user's login. Optional Character length and limitations: 256
	 * single-byte alphanumeric characters 	 
	 */ 
	private String serviceName1;

	/**
	 * Whether the field is required, opt-in or opt-out.  Optional
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String serviceDefReq1;

	/**
	 * The name of the field Merchant requires from PayPal after
	 * user's login. Optional Character length and limitations: 256
	 * single-byte alphanumeric characters	 
	 */ 
	private String serviceName2;

	/**
	 * Whether the field is required, opt-in or opt-out. Optional
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters	 
	 */ 
	private String serviceDefReq2;

	/**
	 * Locale of pages displayed by PayPal during Authentication
	 * Login. Optional Character length and limitations: Five
	 * single-byte alphabetic characters, upper- or lowercase.
	 * Allowable values: AU or en_AUDE or de_DEFR or fr_FRGB or
	 * en_GBIT or it_ITJP or ja_JPUS or en_US	 
	 */ 
	private String localeCode;

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
	private String pageStyle;

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
	private String firstName;

	/**
	 * Last Name of the user, this information is used if user
	 * chooses to signup with PayPal. Optional Character length and
	 * limitation: Six character HTML hexadecimal color code in
	 * ASCII	 
	 */ 
	private String lastName;

	/**
	 * User address, this information is used when user chooses to
	 * signup for PayPal. Optional If you include a shipping
	 * address and set the AddressOverride element on the request,
	 * PayPal returns this same address in
	 * GetExpressCheckoutDetailsResponse. 	 
	 */ 
	private AddressType address;

	

	/**
	 * Default Constructor
	 */
	public SetAuthFlowParamRequestDetailsType (){
	}	

	/**
	 * Getter for returnURL
	 */
	 public String getReturnURL() {
	 	return returnURL;
	 }
	 
	/**
	 * Setter for returnURL
	 */
	 public void setReturnURL(String returnURL) {
	 	this.returnURL = returnURL;
	 }
	 
	/**
	 * Getter for cancelURL
	 */
	 public String getCancelURL() {
	 	return cancelURL;
	 }
	 
	/**
	 * Setter for cancelURL
	 */
	 public void setCancelURL(String cancelURL) {
	 	this.cancelURL = cancelURL;
	 }
	 
	/**
	 * Getter for logoutURL
	 */
	 public String getLogoutURL() {
	 	return logoutURL;
	 }
	 
	/**
	 * Setter for logoutURL
	 */
	 public void setLogoutURL(String logoutURL) {
	 	this.logoutURL = logoutURL;
	 }
	 
	/**
	 * Getter for initFlowType
	 */
	 public String getInitFlowType() {
	 	return initFlowType;
	 }
	 
	/**
	 * Setter for initFlowType
	 */
	 public void setInitFlowType(String initFlowType) {
	 	this.initFlowType = initFlowType;
	 }
	 
	/**
	 * Getter for skipLoginPage
	 */
	 public String getSkipLoginPage() {
	 	return skipLoginPage;
	 }
	 
	/**
	 * Setter for skipLoginPage
	 */
	 public void setSkipLoginPage(String skipLoginPage) {
	 	this.skipLoginPage = skipLoginPage;
	 }
	 
	/**
	 * Getter for serviceName1
	 */
	 public String getServiceName1() {
	 	return serviceName1;
	 }
	 
	/**
	 * Setter for serviceName1
	 */
	 public void setServiceName1(String serviceName1) {
	 	this.serviceName1 = serviceName1;
	 }
	 
	/**
	 * Getter for serviceDefReq1
	 */
	 public String getServiceDefReq1() {
	 	return serviceDefReq1;
	 }
	 
	/**
	 * Setter for serviceDefReq1
	 */
	 public void setServiceDefReq1(String serviceDefReq1) {
	 	this.serviceDefReq1 = serviceDefReq1;
	 }
	 
	/**
	 * Getter for serviceName2
	 */
	 public String getServiceName2() {
	 	return serviceName2;
	 }
	 
	/**
	 * Setter for serviceName2
	 */
	 public void setServiceName2(String serviceName2) {
	 	this.serviceName2 = serviceName2;
	 }
	 
	/**
	 * Getter for serviceDefReq2
	 */
	 public String getServiceDefReq2() {
	 	return serviceDefReq2;
	 }
	 
	/**
	 * Setter for serviceDefReq2
	 */
	 public void setServiceDefReq2(String serviceDefReq2) {
	 	this.serviceDefReq2 = serviceDefReq2;
	 }
	 
	/**
	 * Getter for localeCode
	 */
	 public String getLocaleCode() {
	 	return localeCode;
	 }
	 
	/**
	 * Setter for localeCode
	 */
	 public void setLocaleCode(String localeCode) {
	 	this.localeCode = localeCode;
	 }
	 
	/**
	 * Getter for pageStyle
	 */
	 public String getPageStyle() {
	 	return pageStyle;
	 }
	 
	/**
	 * Setter for pageStyle
	 */
	 public void setPageStyle(String pageStyle) {
	 	this.pageStyle = pageStyle;
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
	 * Getter for firstName
	 */
	 public String getFirstName() {
	 	return firstName;
	 }
	 
	/**
	 * Setter for firstName
	 */
	 public void setFirstName(String firstName) {
	 	this.firstName = firstName;
	 }
	 
	/**
	 * Getter for lastName
	 */
	 public String getLastName() {
	 	return lastName;
	 }
	 
	/**
	 * Setter for lastName
	 */
	 public void setLastName(String lastName) {
	 	this.lastName = lastName;
	 }
	 
	/**
	 * Getter for address
	 */
	 public AddressType getAddress() {
	 	return address;
	 }
	 
	/**
	 * Setter for address
	 */
	 public void setAddress(AddressType address) {
	 	this.address = address;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(returnURL != null) {
			sb.append("<").append(preferredPrefix).append(":ReturnURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(returnURL));
			sb.append("</").append(preferredPrefix).append(":ReturnURL>");
		}
		if(cancelURL != null) {
			sb.append("<").append(preferredPrefix).append(":CancelURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(cancelURL));
			sb.append("</").append(preferredPrefix).append(":CancelURL>");
		}
		if(logoutURL != null) {
			sb.append("<").append(preferredPrefix).append(":LogoutURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(logoutURL));
			sb.append("</").append(preferredPrefix).append(":LogoutURL>");
		}
		if(initFlowType != null) {
			sb.append("<").append(preferredPrefix).append(":InitFlowType>").append(SDKUtil.escapeInvalidXmlCharsRegex(initFlowType));
			sb.append("</").append(preferredPrefix).append(":InitFlowType>");
		}
		if(skipLoginPage != null) {
			sb.append("<").append(preferredPrefix).append(":SkipLoginPage>").append(SDKUtil.escapeInvalidXmlCharsRegex(skipLoginPage));
			sb.append("</").append(preferredPrefix).append(":SkipLoginPage>");
		}
		if(serviceName1 != null) {
			sb.append("<").append(preferredPrefix).append(":ServiceName1>").append(SDKUtil.escapeInvalidXmlCharsRegex(serviceName1));
			sb.append("</").append(preferredPrefix).append(":ServiceName1>");
		}
		if(serviceDefReq1 != null) {
			sb.append("<").append(preferredPrefix).append(":ServiceDefReq1>").append(SDKUtil.escapeInvalidXmlCharsRegex(serviceDefReq1));
			sb.append("</").append(preferredPrefix).append(":ServiceDefReq1>");
		}
		if(serviceName2 != null) {
			sb.append("<").append(preferredPrefix).append(":ServiceName2>").append(SDKUtil.escapeInvalidXmlCharsRegex(serviceName2));
			sb.append("</").append(preferredPrefix).append(":ServiceName2>");
		}
		if(serviceDefReq2 != null) {
			sb.append("<").append(preferredPrefix).append(":ServiceDefReq2>").append(SDKUtil.escapeInvalidXmlCharsRegex(serviceDefReq2));
			sb.append("</").append(preferredPrefix).append(":ServiceDefReq2>");
		}
		if(localeCode != null) {
			sb.append("<").append(preferredPrefix).append(":LocaleCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(localeCode));
			sb.append("</").append(preferredPrefix).append(":LocaleCode>");
		}
		if(pageStyle != null) {
			sb.append("<").append(preferredPrefix).append(":PageStyle>").append(SDKUtil.escapeInvalidXmlCharsRegex(pageStyle));
			sb.append("</").append(preferredPrefix).append(":PageStyle>");
		}
		if(cppHeaderImage != null) {
			sb.append("<").append(preferredPrefix).append(":cpp-header-image>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppHeaderImage));
			sb.append("</").append(preferredPrefix).append(":cpp-header-image>");
		}
		if(cppHeaderBorderColor != null) {
			sb.append("<").append(preferredPrefix).append(":cpp-header-border-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppHeaderBorderColor));
			sb.append("</").append(preferredPrefix).append(":cpp-header-border-color>");
		}
		if(cppHeaderBackColor != null) {
			sb.append("<").append(preferredPrefix).append(":cpp-header-back-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppHeaderBackColor));
			sb.append("</").append(preferredPrefix).append(":cpp-header-back-color>");
		}
		if(cppPayflowColor != null) {
			sb.append("<").append(preferredPrefix).append(":cpp-payflow-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppPayflowColor));
			sb.append("</").append(preferredPrefix).append(":cpp-payflow-color>");
		}
		if(firstName != null) {
			sb.append("<").append(preferredPrefix).append(":FirstName>").append(SDKUtil.escapeInvalidXmlCharsRegex(firstName));
			sb.append("</").append(preferredPrefix).append(":FirstName>");
		}
		if(lastName != null) {
			sb.append("<").append(preferredPrefix).append(":LastName>").append(SDKUtil.escapeInvalidXmlCharsRegex(lastName));
			sb.append("</").append(preferredPrefix).append(":LastName>");
		}
		if(address != null) {
			sb.append(address.toXMLString(preferredPrefix,"Address"));
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		return sb.toString();
	}


}