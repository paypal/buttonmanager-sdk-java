package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ButtonTypeType;
import urn.ebay.apis.eBLBaseComponents.ButtonCodeType;
import urn.ebay.apis.eBLBaseComponents.ButtonSubTypeType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.api.PayPalAPI.OptionDetailsType;
import urn.ebay.apis.eBLBaseComponents.ButtonImageType;
import urn.ebay.apis.eBLBaseComponents.BuyNowTextType;
import urn.ebay.apis.eBLBaseComponents.SubscribeTextType;
import urn.ebay.apis.eBLBaseComponents.CountryCodeType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * Type of Button to create.  Required Must be one of the
 * following: BUYNOW, CART, GIFTCERTIFICATE. SUBSCRIBE,
 * PAYMENTPLAN, AUTOBILLING, DONATE, VIEWCART or UNSUBSCRIBE  
 */
public class BMCreateButtonRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * Type of Button to create.  Required Must be one of the
	 * following: BUYNOW, CART, GIFTCERTIFICATE. SUBSCRIBE,
	 * PAYMENTPLAN, AUTOBILLING, DONATE, VIEWCART or UNSUBSCRIBE 	 
	 */ 
	private ButtonTypeType buttonType;

	/**
	 * button code.  optional Must be one of the following: hosted,
	 * encrypted or cleartext 	 
	 */ 
	private ButtonCodeType buttonCode;

	/**
	 * Button sub type.  optional for button types buynow and cart
	 * only Must Be either PRODUCTS or SERVICES 	 
	 */ 
	private ButtonSubTypeType buttonSubType;

	/**
	 * Button Variable information  At least one required recurring
	 * Character length and limitations: 63 single-byte
	 * alphanumeric characters 	 
	 */ 
	private List<String> buttonVar = new ArrayList<String>();

	/**
	 * 	 
	 */ 
	private List<OptionDetailsType> optionDetails = new ArrayList<OptionDetailsType>();

	/**
	 * Details of each option for the button.  Optional 	 
	 */ 
	private List<String> textBox = new ArrayList<String>();

	/**
	 * Button image to use.  Optional Must be one of: REG, SML, or
	 * CC 	 
	 */ 
	private ButtonImageType buttonImage;

	/**
	 * Button URL for custom button image.  Optional Character
	 * length and limitations: 127 single-byte alphanumeric
	 * characters 	 
	 */ 
	private String buttonImageURL;

	/**
	 * Text to use on Buy Now Button.  Optional Must be either
	 * BUYNOW or PAYNOW 	 
	 */ 
	private BuyNowTextType buyNowText;

	/**
	 * Text to use on Subscribe button.  Optional Must be either
	 * BUYNOW or SUBSCRIBE 	 
	 */ 
	private SubscribeTextType subscribeText;

	/**
	 * Button Country.  Optional Must be valid ISO country code 	 
	 */ 
	private CountryCodeType buttonCountry;

	/**
	 * Button language code.  Optional Character length and
	 * limitations: 3 single-byte alphanumeric characters 	 
	 */ 
	private String buttonLanguage;

	

	/**
	 * Default Constructor
	 */
	public BMCreateButtonRequestType (){
	}	

	/**
	 * Getter for buttonType
	 */
	 public ButtonTypeType getButtonType() {
	 	return buttonType;
	 }
	 
	/**
	 * Setter for buttonType
	 */
	 public void setButtonType(ButtonTypeType buttonType) {
	 	this.buttonType = buttonType;
	 }
	 
	/**
	 * Getter for buttonCode
	 */
	 public ButtonCodeType getButtonCode() {
	 	return buttonCode;
	 }
	 
	/**
	 * Setter for buttonCode
	 */
	 public void setButtonCode(ButtonCodeType buttonCode) {
	 	this.buttonCode = buttonCode;
	 }
	 
	/**
	 * Getter for buttonSubType
	 */
	 public ButtonSubTypeType getButtonSubType() {
	 	return buttonSubType;
	 }
	 
	/**
	 * Setter for buttonSubType
	 */
	 public void setButtonSubType(ButtonSubTypeType buttonSubType) {
	 	this.buttonSubType = buttonSubType;
	 }
	 
	/**
	 * Getter for buttonVar
	 */
	 public List<String> getButtonVar() {
	 	return buttonVar;
	 }
	 
	/**
	 * Setter for buttonVar
	 */
	 public void setButtonVar(List<String> buttonVar) {
	 	this.buttonVar = buttonVar;
	 }
	 
	/**
	 * Getter for optionDetails
	 */
	 public List<OptionDetailsType> getOptionDetails() {
	 	return optionDetails;
	 }
	 
	/**
	 * Setter for optionDetails
	 */
	 public void setOptionDetails(List<OptionDetailsType> optionDetails) {
	 	this.optionDetails = optionDetails;
	 }
	 
	/**
	 * Getter for textBox
	 */
	 public List<String> getTextBox() {
	 	return textBox;
	 }
	 
	/**
	 * Setter for textBox
	 */
	 public void setTextBox(List<String> textBox) {
	 	this.textBox = textBox;
	 }
	 
	/**
	 * Getter for buttonImage
	 */
	 public ButtonImageType getButtonImage() {
	 	return buttonImage;
	 }
	 
	/**
	 * Setter for buttonImage
	 */
	 public void setButtonImage(ButtonImageType buttonImage) {
	 	this.buttonImage = buttonImage;
	 }
	 
	/**
	 * Getter for buttonImageURL
	 */
	 public String getButtonImageURL() {
	 	return buttonImageURL;
	 }
	 
	/**
	 * Setter for buttonImageURL
	 */
	 public void setButtonImageURL(String buttonImageURL) {
	 	this.buttonImageURL = buttonImageURL;
	 }
	 
	/**
	 * Getter for buyNowText
	 */
	 public BuyNowTextType getBuyNowText() {
	 	return buyNowText;
	 }
	 
	/**
	 * Setter for buyNowText
	 */
	 public void setBuyNowText(BuyNowTextType buyNowText) {
	 	this.buyNowText = buyNowText;
	 }
	 
	/**
	 * Getter for subscribeText
	 */
	 public SubscribeTextType getSubscribeText() {
	 	return subscribeText;
	 }
	 
	/**
	 * Setter for subscribeText
	 */
	 public void setSubscribeText(SubscribeTextType subscribeText) {
	 	this.subscribeText = subscribeText;
	 }
	 
	/**
	 * Getter for buttonCountry
	 */
	 public CountryCodeType getButtonCountry() {
	 	return buttonCountry;
	 }
	 
	/**
	 * Setter for buttonCountry
	 */
	 public void setButtonCountry(CountryCodeType buttonCountry) {
	 	this.buttonCountry = buttonCountry;
	 }
	 
	/**
	 * Getter for buttonLanguage
	 */
	 public String getButtonLanguage() {
	 	return buttonLanguage;
	 }
	 
	/**
	 * Setter for buttonLanguage
	 */
	 public void setButtonLanguage(String buttonLanguage) {
	 	this.buttonLanguage = buttonLanguage;
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
		sb.append(super.toXMLString(prefix, null));
		if(buttonType != null) {
			sb.append("<").append(preferredPrefix).append(":ButtonType>").append(SDKUtil.escapeInvalidXmlCharsRegex(buttonType.getValue()));
			sb.append("</").append(preferredPrefix).append(":ButtonType>");
		}
		if(buttonCode != null) {
			sb.append("<").append(preferredPrefix).append(":ButtonCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(buttonCode.getValue()));
			sb.append("</").append(preferredPrefix).append(":ButtonCode>");
		}
		if(buttonSubType != null) {
			sb.append("<").append(preferredPrefix).append(":ButtonSubType>").append(SDKUtil.escapeInvalidXmlCharsRegex(buttonSubType.getValue()));
			sb.append("</").append(preferredPrefix).append(":ButtonSubType>");
		}
		if(buttonVar != null) {
			for(int i=0; i < buttonVar.size(); i++) {
				sb.append("<").append(preferredPrefix).append(":ButtonVar>").append(SDKUtil.escapeInvalidXmlCharsRegex(buttonVar.get(i)));
				sb.append("</").append(preferredPrefix).append(":ButtonVar>");
			}
		}
		if(optionDetails != null) {
			for(int i=0; i < optionDetails.size(); i++) {
				sb.append(optionDetails.get(i).toXMLString(preferredPrefix,"OptionDetails"));
			}
		}
		if(textBox != null) {
			for(int i=0; i < textBox.size(); i++) {
				sb.append("<").append(preferredPrefix).append(":TextBox>").append(SDKUtil.escapeInvalidXmlCharsRegex(textBox.get(i)));
				sb.append("</").append(preferredPrefix).append(":TextBox>");
			}
		}
		if(buttonImage != null) {
			sb.append("<").append(preferredPrefix).append(":ButtonImage>").append(SDKUtil.escapeInvalidXmlCharsRegex(buttonImage.getValue()));
			sb.append("</").append(preferredPrefix).append(":ButtonImage>");
		}
		if(buttonImageURL != null) {
			sb.append("<").append(preferredPrefix).append(":ButtonImageURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(buttonImageURL));
			sb.append("</").append(preferredPrefix).append(":ButtonImageURL>");
		}
		if(buyNowText != null) {
			sb.append("<").append(preferredPrefix).append(":BuyNowText>").append(SDKUtil.escapeInvalidXmlCharsRegex(buyNowText.getValue()));
			sb.append("</").append(preferredPrefix).append(":BuyNowText>");
		}
		if(subscribeText != null) {
			sb.append("<").append(preferredPrefix).append(":SubscribeText>").append(SDKUtil.escapeInvalidXmlCharsRegex(subscribeText.getValue()));
			sb.append("</").append(preferredPrefix).append(":SubscribeText>");
		}
		if(buttonCountry != null) {
			sb.append("<").append(preferredPrefix).append(":ButtonCountry>").append(SDKUtil.escapeInvalidXmlCharsRegex(buttonCountry.getValue()));
			sb.append("</").append(preferredPrefix).append(":ButtonCountry>");
		}
		if(buttonLanguage != null) {
			sb.append("<").append(preferredPrefix).append(":ButtonLanguage>").append(SDKUtil.escapeInvalidXmlCharsRegex(buttonLanguage));
			sb.append("</").append(preferredPrefix).append(":ButtonLanguage>");
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