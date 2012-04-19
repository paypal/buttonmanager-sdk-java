
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;



/**
 * Lists the Payment Methods (other than PayPal) that the use can pay with e.g. Money Order. 
 * Optional.
 */
public class OtherPaymentMethodDetailsType {

	/**
	 * The identifier of the Payment Method.
	 */
	private String OtherPaymentMethodId;
	public String getOtherPaymentMethodId() {
		return OtherPaymentMethodId;
	}
	public void setOtherPaymentMethodId(String value) {
		this.OtherPaymentMethodId = value;
	}

	/**
	 * Valid values are 'Method', 'SubMethod'.
	 */
	private String OtherPaymentMethodType;
	public String getOtherPaymentMethodType() {
		return OtherPaymentMethodType;
	}
	public void setOtherPaymentMethodType(String value) {
		this.OtherPaymentMethodType = value;
	}

	/**
	 * The name of the Payment Method.
	 */
	private String OtherPaymentMethodLabel;
	public String getOtherPaymentMethodLabel() {
		return OtherPaymentMethodLabel;
	}
	public void setOtherPaymentMethodLabel(String value) {
		this.OtherPaymentMethodLabel = value;
	}

	/**
	 * The short description of the Payment Method, goes along with the label.
	 */
	private String OtherPaymentMethodLabelDescription;
	public String getOtherPaymentMethodLabelDescription() {
		return OtherPaymentMethodLabelDescription;
	}
	public void setOtherPaymentMethodLabelDescription(String value) {
		this.OtherPaymentMethodLabelDescription = value;
	}

	/**
	 * The title for the long description.
	 */
	private String OtherPaymentMethodLongDescriptionTitle;
	public String getOtherPaymentMethodLongDescriptionTitle() {
		return OtherPaymentMethodLongDescriptionTitle;
	}
	public void setOtherPaymentMethodLongDescriptionTitle(String value) {
		this.OtherPaymentMethodLongDescriptionTitle = value;
	}

	/**
	 * The long description of the Payment Method.
	 */
	private String OtherPaymentMethodLongDescription;
	public String getOtherPaymentMethodLongDescription() {
		return OtherPaymentMethodLongDescription;
	}
	public void setOtherPaymentMethodLongDescription(String value) {
		this.OtherPaymentMethodLongDescription = value;
	}

	/**
	 * The icon of the Payment Method.
	 */
	private String OtherPaymentMethodIcon;
	public String getOtherPaymentMethodIcon() {
		return OtherPaymentMethodIcon;
	}
	public void setOtherPaymentMethodIcon(String value) {
		this.OtherPaymentMethodIcon = value;
	}

	/**
	 * If this flag is true, then OtherPaymentMethodIcon is required to have a valid value; the label will be hidden and only ICON will be shown.
	 */
	private Boolean OtherPaymentMethodHideLabel;
	public Boolean getOtherPaymentMethodHideLabel() {
		return OtherPaymentMethodHideLabel;
	}
	public void setOtherPaymentMethodHideLabel(Boolean value) {
		this.OtherPaymentMethodHideLabel = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( OtherPaymentMethodId != null ) {
			sb.append("<ebl:OtherPaymentMethodId>").append(OtherPaymentMethodId);
			sb.append("</ebl:OtherPaymentMethodId>");
		}
		if( OtherPaymentMethodType != null ) {
			sb.append("<ebl:OtherPaymentMethodType>").append(OtherPaymentMethodType);
			sb.append("</ebl:OtherPaymentMethodType>");
		}
		if( OtherPaymentMethodLabel != null ) {
			sb.append("<ebl:OtherPaymentMethodLabel>").append(OtherPaymentMethodLabel);
			sb.append("</ebl:OtherPaymentMethodLabel>");
		}
		if( OtherPaymentMethodLabelDescription != null ) {
			sb.append("<ebl:OtherPaymentMethodLabelDescription>").append(OtherPaymentMethodLabelDescription);
			sb.append("</ebl:OtherPaymentMethodLabelDescription>");
		}
		if( OtherPaymentMethodLongDescriptionTitle != null ) {
			sb.append("<ebl:OtherPaymentMethodLongDescriptionTitle>").append(OtherPaymentMethodLongDescriptionTitle);
			sb.append("</ebl:OtherPaymentMethodLongDescriptionTitle>");
		}
		if( OtherPaymentMethodLongDescription != null ) {
			sb.append("<ebl:OtherPaymentMethodLongDescription>").append(OtherPaymentMethodLongDescription);
			sb.append("</ebl:OtherPaymentMethodLongDescription>");
		}
		if( OtherPaymentMethodIcon != null ) {
			sb.append("<ebl:OtherPaymentMethodIcon>").append(OtherPaymentMethodIcon);
			sb.append("</ebl:OtherPaymentMethodIcon>");
		}
		if( OtherPaymentMethodHideLabel != null ) {
			sb.append("<ebl:OtherPaymentMethodHideLabel>").append(OtherPaymentMethodHideLabel);
			sb.append("</ebl:OtherPaymentMethodHideLabel>");
		}
		return sb.toString();
	}

}
