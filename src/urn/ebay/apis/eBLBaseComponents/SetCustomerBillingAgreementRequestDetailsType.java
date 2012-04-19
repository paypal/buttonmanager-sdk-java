
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.BillingAgreementDetailsType;


/**
 */
public class SetCustomerBillingAgreementRequestDetailsType {

	/**
	 *
	 * @Required
	 */
	private BillingAgreementDetailsType BillingAgreementDetails;
	public BillingAgreementDetailsType getBillingAgreementDetails() {
		return BillingAgreementDetails;
	}
	public void setBillingAgreementDetails(BillingAgreementDetailsType value) {
		this.BillingAgreementDetails = value;
	}

	/**
	 *
	 * @Required
	 */
	private String ReturnURL;
	public String getReturnURL() {
		return ReturnURL;
	}
	public void setReturnURL(String value) {
		this.ReturnURL = value;
	}

	/**
	 *
	 * @Required
	 */
	private String CancelURL;
	public String getCancelURL() {
		return CancelURL;
	}
	public void setCancelURL(String value) {
		this.CancelURL = value;
	}

	/**
	 */
	private String LocaleCode;
	public String getLocaleCode() {
		return LocaleCode;
	}
	public void setLocaleCode(String value) {
		this.LocaleCode = value;
	}

	/**
	 */
	private String PageStyle;
	public String getPageStyle() {
		return PageStyle;
	}
	public void setPageStyle(String value) {
		this.PageStyle = value;
	}

	/**
	 */
	private String cppheaderimage;
	public String getCppheaderimage() {
		return cppheaderimage;
	}
	public void setCppheaderimage(String value) {
		this.cppheaderimage = value;
	}

	/**
	 */
	private String cppheaderbordercolor;
	public String getCppheaderbordercolor() {
		return cppheaderbordercolor;
	}
	public void setCppheaderbordercolor(String value) {
		this.cppheaderbordercolor = value;
	}

	/**
	 */
	private String cppheaderbackcolor;
	public String getCppheaderbackcolor() {
		return cppheaderbackcolor;
	}
	public void setCppheaderbackcolor(String value) {
		this.cppheaderbackcolor = value;
	}

	/**
	 */
	private String cpppayflowcolor;
	public String getCpppayflowcolor() {
		return cpppayflowcolor;
	}
	public void setCpppayflowcolor(String value) {
		this.cpppayflowcolor = value;
	}

	/**
	 */
	private String BuyerEmail;
	public String getBuyerEmail() {
		return BuyerEmail;
	}
	public void setBuyerEmail(String value) {
		this.BuyerEmail = value;
	}

	/**
The value 1 indicates that you require that the customer's billing address on file. Setting this element overrides the setting you have specified in Admin.
	 * Optional
	 * Character length and limitations: One single-byte numeric character.
	 */
	private String ReqBillingAddress;
	public String getReqBillingAddress() {
		return ReqBillingAddress;
	}
	public void setReqBillingAddress(String value) {
		this.ReqBillingAddress = value;
	}


	public SetCustomerBillingAgreementRequestDetailsType(BillingAgreementDetailsType BillingAgreementDetails, String ReturnURL, String CancelURL) {
		this.BillingAgreementDetails = BillingAgreementDetails;
		this.ReturnURL = ReturnURL;
		this.CancelURL = CancelURL;
	}
	public SetCustomerBillingAgreementRequestDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( BillingAgreementDetails != null ) {
			sb.append("<ebl:BillingAgreementDetails>");
			sb.append(BillingAgreementDetails.toXMLString());
			sb.append("</ebl:BillingAgreementDetails>");
		}
		if( ReturnURL != null ) {
			sb.append("<ebl:ReturnURL>").append(ReturnURL);
			sb.append("</ebl:ReturnURL>");
		}
		if( CancelURL != null ) {
			sb.append("<ebl:CancelURL>").append(CancelURL);
			sb.append("</ebl:CancelURL>");
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
		if( BuyerEmail != null ) {
			sb.append("<ebl:BuyerEmail>").append(BuyerEmail);
			sb.append("</ebl:BuyerEmail>");
		}
		if( ReqBillingAddress != null ) {
			sb.append("<ebl:ReqBillingAddress>").append(ReqBillingAddress);
			sb.append("</ebl:ReqBillingAddress>");
		}
		return sb.toString();
	}

}
