package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * Lists the Payment Methods (other than PayPal) that the use
 * can pay with e.g. Money Order. Optional. 
 */
public class OtherPaymentMethodDetailsType{


	/**
	 * The identifier of the Payment Method. 	 
	 */ 
	private String OtherPaymentMethodId;

	/**
	 * Valid values are 'Method', 'SubMethod'. 	 
	 */ 
	private String OtherPaymentMethodType;

	/**
	 * The name of the Payment Method. 	 
	 */ 
	private String OtherPaymentMethodLabel;

	/**
	 * The short description of the Payment Method, goes along with
	 * the label. 	 
	 */ 
	private String OtherPaymentMethodLabelDescription;

	/**
	 * The title for the long description. 	 
	 */ 
	private String OtherPaymentMethodLongDescriptionTitle;

	/**
	 * The long description of the Payment Method. 	 
	 */ 
	private String OtherPaymentMethodLongDescription;

	/**
	 * The icon of the Payment Method. 	 
	 */ 
	private String OtherPaymentMethodIcon;

	/**
	 * If this flag is true, then OtherPaymentMethodIcon is
	 * required to have a valid value; the label will be hidden and
	 * only ICON will be shown. 	 
	 */ 
	private Boolean OtherPaymentMethodHideLabel;

	

	/**
	 * Default Constructor
	 */
	public OtherPaymentMethodDetailsType (){
	}	

	/**
	 * Getter for OtherPaymentMethodId
	 */
	 public String getOtherPaymentMethodId() {
	 	return OtherPaymentMethodId;
	 }
	 
	/**
	 * Setter for OtherPaymentMethodId
	 */
	 public void setOtherPaymentMethodId(String OtherPaymentMethodId) {
	 	this.OtherPaymentMethodId = OtherPaymentMethodId;
	 }
	 
	/**
	 * Getter for OtherPaymentMethodType
	 */
	 public String getOtherPaymentMethodType() {
	 	return OtherPaymentMethodType;
	 }
	 
	/**
	 * Setter for OtherPaymentMethodType
	 */
	 public void setOtherPaymentMethodType(String OtherPaymentMethodType) {
	 	this.OtherPaymentMethodType = OtherPaymentMethodType;
	 }
	 
	/**
	 * Getter for OtherPaymentMethodLabel
	 */
	 public String getOtherPaymentMethodLabel() {
	 	return OtherPaymentMethodLabel;
	 }
	 
	/**
	 * Setter for OtherPaymentMethodLabel
	 */
	 public void setOtherPaymentMethodLabel(String OtherPaymentMethodLabel) {
	 	this.OtherPaymentMethodLabel = OtherPaymentMethodLabel;
	 }
	 
	/**
	 * Getter for OtherPaymentMethodLabelDescription
	 */
	 public String getOtherPaymentMethodLabelDescription() {
	 	return OtherPaymentMethodLabelDescription;
	 }
	 
	/**
	 * Setter for OtherPaymentMethodLabelDescription
	 */
	 public void setOtherPaymentMethodLabelDescription(String OtherPaymentMethodLabelDescription) {
	 	this.OtherPaymentMethodLabelDescription = OtherPaymentMethodLabelDescription;
	 }
	 
	/**
	 * Getter for OtherPaymentMethodLongDescriptionTitle
	 */
	 public String getOtherPaymentMethodLongDescriptionTitle() {
	 	return OtherPaymentMethodLongDescriptionTitle;
	 }
	 
	/**
	 * Setter for OtherPaymentMethodLongDescriptionTitle
	 */
	 public void setOtherPaymentMethodLongDescriptionTitle(String OtherPaymentMethodLongDescriptionTitle) {
	 	this.OtherPaymentMethodLongDescriptionTitle = OtherPaymentMethodLongDescriptionTitle;
	 }
	 
	/**
	 * Getter for OtherPaymentMethodLongDescription
	 */
	 public String getOtherPaymentMethodLongDescription() {
	 	return OtherPaymentMethodLongDescription;
	 }
	 
	/**
	 * Setter for OtherPaymentMethodLongDescription
	 */
	 public void setOtherPaymentMethodLongDescription(String OtherPaymentMethodLongDescription) {
	 	this.OtherPaymentMethodLongDescription = OtherPaymentMethodLongDescription;
	 }
	 
	/**
	 * Getter for OtherPaymentMethodIcon
	 */
	 public String getOtherPaymentMethodIcon() {
	 	return OtherPaymentMethodIcon;
	 }
	 
	/**
	 * Setter for OtherPaymentMethodIcon
	 */
	 public void setOtherPaymentMethodIcon(String OtherPaymentMethodIcon) {
	 	this.OtherPaymentMethodIcon = OtherPaymentMethodIcon;
	 }
	 
	/**
	 * Getter for OtherPaymentMethodHideLabel
	 */
	 public Boolean getOtherPaymentMethodHideLabel() {
	 	return OtherPaymentMethodHideLabel;
	 }
	 
	/**
	 * Setter for OtherPaymentMethodHideLabel
	 */
	 public void setOtherPaymentMethodHideLabel(Boolean OtherPaymentMethodHideLabel) {
	 	this.OtherPaymentMethodHideLabel = OtherPaymentMethodHideLabel;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(OtherPaymentMethodId != null) {
			sb.append("<ebl:OtherPaymentMethodId>").append(SDKUtil.escapeInvalidXmlCharsRegex(OtherPaymentMethodId));
			sb.append("</ebl:OtherPaymentMethodId>");
		}
		if(OtherPaymentMethodType != null) {
			sb.append("<ebl:OtherPaymentMethodType>").append(SDKUtil.escapeInvalidXmlCharsRegex(OtherPaymentMethodType));
			sb.append("</ebl:OtherPaymentMethodType>");
		}
		if(OtherPaymentMethodLabel != null) {
			sb.append("<ebl:OtherPaymentMethodLabel>").append(SDKUtil.escapeInvalidXmlCharsRegex(OtherPaymentMethodLabel));
			sb.append("</ebl:OtherPaymentMethodLabel>");
		}
		if(OtherPaymentMethodLabelDescription != null) {
			sb.append("<ebl:OtherPaymentMethodLabelDescription>").append(SDKUtil.escapeInvalidXmlCharsRegex(OtherPaymentMethodLabelDescription));
			sb.append("</ebl:OtherPaymentMethodLabelDescription>");
		}
		if(OtherPaymentMethodLongDescriptionTitle != null) {
			sb.append("<ebl:OtherPaymentMethodLongDescriptionTitle>").append(SDKUtil.escapeInvalidXmlCharsRegex(OtherPaymentMethodLongDescriptionTitle));
			sb.append("</ebl:OtherPaymentMethodLongDescriptionTitle>");
		}
		if(OtherPaymentMethodLongDescription != null) {
			sb.append("<ebl:OtherPaymentMethodLongDescription>").append(SDKUtil.escapeInvalidXmlCharsRegex(OtherPaymentMethodLongDescription));
			sb.append("</ebl:OtherPaymentMethodLongDescription>");
		}
		if(OtherPaymentMethodIcon != null) {
			sb.append("<ebl:OtherPaymentMethodIcon>").append(SDKUtil.escapeInvalidXmlCharsRegex(OtherPaymentMethodIcon));
			sb.append("</ebl:OtherPaymentMethodIcon>");
		}
		if(OtherPaymentMethodHideLabel != null) {
			sb.append("<ebl:OtherPaymentMethodHideLabel>").append(SDKUtil.escapeInvalidXmlCharsRegex(OtherPaymentMethodHideLabel));
			sb.append("</ebl:OtherPaymentMethodHideLabel>");
		}
		return sb.toString();
	}


}