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

/**
 * Type of Button to create.  Required Must be one of the
 * following: BUYNOW, CART, GIFTCERTIFICATE. SUBSCRIBE,
 * PAYMENTPLAN, AUTOBILLING, DONATE, VIEWCART or UNSUBSCRIBE  
 */
public class BMCreateButtonRequestType extends AbstractRequestType {


	/**
	 * Type of Button to create.  Required Must be one of the
	 * following: BUYNOW, CART, GIFTCERTIFICATE. SUBSCRIBE,
	 * PAYMENTPLAN, AUTOBILLING, DONATE, VIEWCART or UNSUBSCRIBE 	 
	 */ 
	private ButtonTypeType ButtonType;

	/**
	 * button code.  optional Must be one of the following: hosted,
	 * encrypted or cleartext 	 
	 */ 
	private ButtonCodeType ButtonCode;

	/**
	 * Button sub type.  optional for button types buynow and cart
	 * only Must Be either PRODUCTS or SERVICES 	 
	 */ 
	private ButtonSubTypeType ButtonSubType;

	/**
	 * Button Variable information  At least one required recurring
	 * Character length and limitations: 63 single-byte
	 * alphanumeric characters 	 
	 */ 
	private List<String> ButtonVar = new ArrayList<String>();

	/**
	 * 	 
	 */ 
	private List<OptionDetailsType> OptionDetails = new ArrayList<OptionDetailsType>();

	/**
	 * Details of each option for the button.  Optional 	 
	 */ 
	private List<String> TextBox = new ArrayList<String>();

	/**
	 * Button image to use.  Optional Must be one of: REG, SML, or
	 * CC 	 
	 */ 
	private ButtonImageType ButtonImage;

	/**
	 * Button URL for custom button image.  Optional Character
	 * length and limitations: 127 single-byte alphanumeric
	 * characters 	 
	 */ 
	private String ButtonImageURL;

	/**
	 * Text to use on Buy Now Button.  Optional Must be either
	 * BUYNOW or PAYNOW 	 
	 */ 
	private BuyNowTextType BuyNowText;

	/**
	 * Text to use on Subscribe button.  Optional Must be either
	 * BUYNOW or SUBSCRIBE 	 
	 */ 
	private SubscribeTextType SubscribeText;

	/**
	 * Button Country.  Optional Must be valid ISO country code 	 
	 */ 
	private CountryCodeType ButtonCountry;

	/**
	 * Button language code.  Optional Character length and
	 * limitations: 3 single-byte alphanumeric characters 	 
	 */ 
	private String ButtonLanguage;

	

	/**
	 * Default Constructor
	 */
	public BMCreateButtonRequestType (){
	}	

	/**
	 * Getter for ButtonType
	 */
	 public ButtonTypeType getButtonType() {
	 	return ButtonType;
	 }
	 
	/**
	 * Setter for ButtonType
	 */
	 public void setButtonType(ButtonTypeType ButtonType) {
	 	this.ButtonType = ButtonType;
	 }
	 
	/**
	 * Getter for ButtonCode
	 */
	 public ButtonCodeType getButtonCode() {
	 	return ButtonCode;
	 }
	 
	/**
	 * Setter for ButtonCode
	 */
	 public void setButtonCode(ButtonCodeType ButtonCode) {
	 	this.ButtonCode = ButtonCode;
	 }
	 
	/**
	 * Getter for ButtonSubType
	 */
	 public ButtonSubTypeType getButtonSubType() {
	 	return ButtonSubType;
	 }
	 
	/**
	 * Setter for ButtonSubType
	 */
	 public void setButtonSubType(ButtonSubTypeType ButtonSubType) {
	 	this.ButtonSubType = ButtonSubType;
	 }
	 
	/**
	 * Getter for ButtonVar
	 */
	 public List<String> getButtonVar() {
	 	return ButtonVar;
	 }
	 
	/**
	 * Setter for ButtonVar
	 */
	 public void setButtonVar(List<String> ButtonVar) {
	 	this.ButtonVar = ButtonVar;
	 }
	 
	/**
	 * Getter for OptionDetails
	 */
	 public List<OptionDetailsType> getOptionDetails() {
	 	return OptionDetails;
	 }
	 
	/**
	 * Setter for OptionDetails
	 */
	 public void setOptionDetails(List<OptionDetailsType> OptionDetails) {
	 	this.OptionDetails = OptionDetails;
	 }
	 
	/**
	 * Getter for TextBox
	 */
	 public List<String> getTextBox() {
	 	return TextBox;
	 }
	 
	/**
	 * Setter for TextBox
	 */
	 public void setTextBox(List<String> TextBox) {
	 	this.TextBox = TextBox;
	 }
	 
	/**
	 * Getter for ButtonImage
	 */
	 public ButtonImageType getButtonImage() {
	 	return ButtonImage;
	 }
	 
	/**
	 * Setter for ButtonImage
	 */
	 public void setButtonImage(ButtonImageType ButtonImage) {
	 	this.ButtonImage = ButtonImage;
	 }
	 
	/**
	 * Getter for ButtonImageURL
	 */
	 public String getButtonImageURL() {
	 	return ButtonImageURL;
	 }
	 
	/**
	 * Setter for ButtonImageURL
	 */
	 public void setButtonImageURL(String ButtonImageURL) {
	 	this.ButtonImageURL = ButtonImageURL;
	 }
	 
	/**
	 * Getter for BuyNowText
	 */
	 public BuyNowTextType getBuyNowText() {
	 	return BuyNowText;
	 }
	 
	/**
	 * Setter for BuyNowText
	 */
	 public void setBuyNowText(BuyNowTextType BuyNowText) {
	 	this.BuyNowText = BuyNowText;
	 }
	 
	/**
	 * Getter for SubscribeText
	 */
	 public SubscribeTextType getSubscribeText() {
	 	return SubscribeText;
	 }
	 
	/**
	 * Setter for SubscribeText
	 */
	 public void setSubscribeText(SubscribeTextType SubscribeText) {
	 	this.SubscribeText = SubscribeText;
	 }
	 
	/**
	 * Getter for ButtonCountry
	 */
	 public CountryCodeType getButtonCountry() {
	 	return ButtonCountry;
	 }
	 
	/**
	 * Setter for ButtonCountry
	 */
	 public void setButtonCountry(CountryCodeType ButtonCountry) {
	 	this.ButtonCountry = ButtonCountry;
	 }
	 
	/**
	 * Getter for ButtonLanguage
	 */
	 public String getButtonLanguage() {
	 	return ButtonLanguage;
	 }
	 
	/**
	 * Setter for ButtonLanguage
	 */
	 public void setButtonLanguage(String ButtonLanguage) {
	 	this.ButtonLanguage = ButtonLanguage;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(ButtonType != null) {
			sb.append("<urn:ButtonType>").append(ButtonType.getValue());
			sb.append("</urn:ButtonType>");
		}
		if(ButtonCode != null) {
			sb.append("<urn:ButtonCode>").append(ButtonCode.getValue());
			sb.append("</urn:ButtonCode>");
		}
		if(ButtonSubType != null) {
			sb.append("<urn:ButtonSubType>").append(ButtonSubType.getValue());
			sb.append("</urn:ButtonSubType>");
		}
		if(ButtonVar != null) {
			for(int i=0; i < ButtonVar.size(); i++) {
				sb.append("<urn:ButtonVar>").append(ButtonVar.get(i));
				sb.append("</urn:ButtonVar>");
			}
		}
		if(OptionDetails != null) {
			for(int i=0; i < OptionDetails.size(); i++) {
				sb.append("<urn:OptionDetails>");
				sb.append(OptionDetails.get(i).toXMLString());
				sb.append("</urn:OptionDetails>");
			}
		}
		if(TextBox != null) {
			for(int i=0; i < TextBox.size(); i++) {
				sb.append("<urn:TextBox>").append(TextBox.get(i));
				sb.append("</urn:TextBox>");
			}
		}
		if(ButtonImage != null) {
			sb.append("<urn:ButtonImage>").append(ButtonImage.getValue());
			sb.append("</urn:ButtonImage>");
		}
		if(ButtonImageURL != null) {
			sb.append("<urn:ButtonImageURL>").append(ButtonImageURL);
			sb.append("</urn:ButtonImageURL>");
		}
		if(BuyNowText != null) {
			sb.append("<urn:BuyNowText>").append(BuyNowText.getValue());
			sb.append("</urn:BuyNowText>");
		}
		if(SubscribeText != null) {
			sb.append("<urn:SubscribeText>").append(SubscribeText.getValue());
			sb.append("</urn:SubscribeText>");
		}
		if(ButtonCountry != null) {
			sb.append("<urn:ButtonCountry>").append(ButtonCountry.getValue());
			sb.append("</urn:ButtonCountry>");
		}
		if(ButtonLanguage != null) {
			sb.append("<urn:ButtonLanguage>").append(ButtonLanguage);
			sb.append("</urn:ButtonLanguage>");
		}
		return sb.toString();
	}

}