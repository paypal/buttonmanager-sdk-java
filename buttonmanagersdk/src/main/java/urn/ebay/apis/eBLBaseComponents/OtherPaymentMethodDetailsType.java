package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * Lists the Payment Methods (other than PayPal) that the use
 * can pay with e.g. Money Order. Optional. 
 */
public class OtherPaymentMethodDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * The identifier of the Payment Method. 	 
	 */ 
	private String otherPaymentMethodId;

	/**
	 * Valid values are 'Method', 'SubMethod'. 	 
	 */ 
	private String otherPaymentMethodType;

	/**
	 * The name of the Payment Method. 	 
	 */ 
	private String otherPaymentMethodLabel;

	/**
	 * The short description of the Payment Method, goes along with
	 * the label. 	 
	 */ 
	private String otherPaymentMethodLabelDescription;

	/**
	 * The title for the long description. 	 
	 */ 
	private String otherPaymentMethodLongDescriptionTitle;

	/**
	 * The long description of the Payment Method. 	 
	 */ 
	private String otherPaymentMethodLongDescription;

	/**
	 * The icon of the Payment Method. 	 
	 */ 
	private String otherPaymentMethodIcon;

	/**
	 * If this flag is true, then OtherPaymentMethodIcon is
	 * required to have a valid value; the label will be hidden and
	 * only ICON will be shown. 	 
	 */ 
	private Boolean otherPaymentMethodHideLabel;

	

	/**
	 * Default Constructor
	 */
	public OtherPaymentMethodDetailsType (){
	}	

	/**
	 * Getter for otherPaymentMethodId
	 */
	 public String getOtherPaymentMethodId() {
	 	return otherPaymentMethodId;
	 }
	 
	/**
	 * Setter for otherPaymentMethodId
	 */
	 public void setOtherPaymentMethodId(String otherPaymentMethodId) {
	 	this.otherPaymentMethodId = otherPaymentMethodId;
	 }
	 
	/**
	 * Getter for otherPaymentMethodType
	 */
	 public String getOtherPaymentMethodType() {
	 	return otherPaymentMethodType;
	 }
	 
	/**
	 * Setter for otherPaymentMethodType
	 */
	 public void setOtherPaymentMethodType(String otherPaymentMethodType) {
	 	this.otherPaymentMethodType = otherPaymentMethodType;
	 }
	 
	/**
	 * Getter for otherPaymentMethodLabel
	 */
	 public String getOtherPaymentMethodLabel() {
	 	return otherPaymentMethodLabel;
	 }
	 
	/**
	 * Setter for otherPaymentMethodLabel
	 */
	 public void setOtherPaymentMethodLabel(String otherPaymentMethodLabel) {
	 	this.otherPaymentMethodLabel = otherPaymentMethodLabel;
	 }
	 
	/**
	 * Getter for otherPaymentMethodLabelDescription
	 */
	 public String getOtherPaymentMethodLabelDescription() {
	 	return otherPaymentMethodLabelDescription;
	 }
	 
	/**
	 * Setter for otherPaymentMethodLabelDescription
	 */
	 public void setOtherPaymentMethodLabelDescription(String otherPaymentMethodLabelDescription) {
	 	this.otherPaymentMethodLabelDescription = otherPaymentMethodLabelDescription;
	 }
	 
	/**
	 * Getter for otherPaymentMethodLongDescriptionTitle
	 */
	 public String getOtherPaymentMethodLongDescriptionTitle() {
	 	return otherPaymentMethodLongDescriptionTitle;
	 }
	 
	/**
	 * Setter for otherPaymentMethodLongDescriptionTitle
	 */
	 public void setOtherPaymentMethodLongDescriptionTitle(String otherPaymentMethodLongDescriptionTitle) {
	 	this.otherPaymentMethodLongDescriptionTitle = otherPaymentMethodLongDescriptionTitle;
	 }
	 
	/**
	 * Getter for otherPaymentMethodLongDescription
	 */
	 public String getOtherPaymentMethodLongDescription() {
	 	return otherPaymentMethodLongDescription;
	 }
	 
	/**
	 * Setter for otherPaymentMethodLongDescription
	 */
	 public void setOtherPaymentMethodLongDescription(String otherPaymentMethodLongDescription) {
	 	this.otherPaymentMethodLongDescription = otherPaymentMethodLongDescription;
	 }
	 
	/**
	 * Getter for otherPaymentMethodIcon
	 */
	 public String getOtherPaymentMethodIcon() {
	 	return otherPaymentMethodIcon;
	 }
	 
	/**
	 * Setter for otherPaymentMethodIcon
	 */
	 public void setOtherPaymentMethodIcon(String otherPaymentMethodIcon) {
	 	this.otherPaymentMethodIcon = otherPaymentMethodIcon;
	 }
	 
	/**
	 * Getter for otherPaymentMethodHideLabel
	 */
	 public Boolean getOtherPaymentMethodHideLabel() {
	 	return otherPaymentMethodHideLabel;
	 }
	 
	/**
	 * Setter for otherPaymentMethodHideLabel
	 */
	 public void setOtherPaymentMethodHideLabel(Boolean otherPaymentMethodHideLabel) {
	 	this.otherPaymentMethodHideLabel = otherPaymentMethodHideLabel;
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
		if(otherPaymentMethodId != null) {
			sb.append("<").append(preferredPrefix).append(":OtherPaymentMethodId>").append(SDKUtil.escapeInvalidXmlCharsRegex(otherPaymentMethodId));
			sb.append("</").append(preferredPrefix).append(":OtherPaymentMethodId>");
		}
		if(otherPaymentMethodType != null) {
			sb.append("<").append(preferredPrefix).append(":OtherPaymentMethodType>").append(SDKUtil.escapeInvalidXmlCharsRegex(otherPaymentMethodType));
			sb.append("</").append(preferredPrefix).append(":OtherPaymentMethodType>");
		}
		if(otherPaymentMethodLabel != null) {
			sb.append("<").append(preferredPrefix).append(":OtherPaymentMethodLabel>").append(SDKUtil.escapeInvalidXmlCharsRegex(otherPaymentMethodLabel));
			sb.append("</").append(preferredPrefix).append(":OtherPaymentMethodLabel>");
		}
		if(otherPaymentMethodLabelDescription != null) {
			sb.append("<").append(preferredPrefix).append(":OtherPaymentMethodLabelDescription>").append(SDKUtil.escapeInvalidXmlCharsRegex(otherPaymentMethodLabelDescription));
			sb.append("</").append(preferredPrefix).append(":OtherPaymentMethodLabelDescription>");
		}
		if(otherPaymentMethodLongDescriptionTitle != null) {
			sb.append("<").append(preferredPrefix).append(":OtherPaymentMethodLongDescriptionTitle>").append(SDKUtil.escapeInvalidXmlCharsRegex(otherPaymentMethodLongDescriptionTitle));
			sb.append("</").append(preferredPrefix).append(":OtherPaymentMethodLongDescriptionTitle>");
		}
		if(otherPaymentMethodLongDescription != null) {
			sb.append("<").append(preferredPrefix).append(":OtherPaymentMethodLongDescription>").append(SDKUtil.escapeInvalidXmlCharsRegex(otherPaymentMethodLongDescription));
			sb.append("</").append(preferredPrefix).append(":OtherPaymentMethodLongDescription>");
		}
		if(otherPaymentMethodIcon != null) {
			sb.append("<").append(preferredPrefix).append(":OtherPaymentMethodIcon>").append(SDKUtil.escapeInvalidXmlCharsRegex(otherPaymentMethodIcon));
			sb.append("</").append(preferredPrefix).append(":OtherPaymentMethodIcon>");
		}
		if(otherPaymentMethodHideLabel != null) {
			sb.append("<").append(preferredPrefix).append(":OtherPaymentMethodHideLabel>").append(SDKUtil.escapeInvalidXmlCharsRegex(otherPaymentMethodHideLabel));
			sb.append("</").append(preferredPrefix).append(":OtherPaymentMethodHideLabel>");
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