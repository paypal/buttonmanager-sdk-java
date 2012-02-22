
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import java.util.ArrayList;
import java.util.List;
import urn.ebay.api.PayPalAPI.OptionDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.ButtonCodeType;
import urn.ebay.apis.eBLBaseComponents.ButtonImageType;
import urn.ebay.apis.eBLBaseComponents.ButtonSubTypeType;
import urn.ebay.apis.eBLBaseComponents.ButtonTypeType;
import urn.ebay.apis.eBLBaseComponents.BuyNowTextType;
import urn.ebay.apis.eBLBaseComponents.CountryCodeType;
import urn.ebay.apis.eBLBaseComponents.SubscribeTextType;


/**
 * Hosted Button id of the button to update.
 * Required
 * Character length and limitations: 10 single-byte numeric characters
 */
public class BMUpdateButtonRequestType extends AbstractRequestType{

	/**
	 * Hosted Button id of the button to update.
	 * Required
	 * Character length and limitations: 10 single-byte numeric characters
	 *
	 * @Required
	 */
	private String HostedButtonID;
	public String getHostedButtonID() {
		return HostedButtonID;
	}
	public void setHostedButtonID(String value) {
		this.HostedButtonID = value;
	}

	/**
	 * Type of Button to create.
	 * Required
	 * Must be one of the following: BUYNOW, CART, GIFTCERTIFICATE. SUBSCRIBE, PAYMENTPLAN, AUTOBILLING, DONATE, VIEWCART or UNSUBSCRIBE
	 */
	private ButtonTypeType ButtonType;
	public ButtonTypeType getButtonType() {
		return ButtonType;
	}
	public void setButtonType(ButtonTypeType value) {
		this.ButtonType = value;
	}

	/**
	 * button code.
	 * optional
	 * Must be one of the following: hosted, encrypted or cleartext
	 */
	private ButtonCodeType ButtonCode;
	public ButtonCodeType getButtonCode() {
		return ButtonCode;
	}
	public void setButtonCode(ButtonCodeType value) {
		this.ButtonCode = value;
	}

	/**
	 * Button sub type.
	 * optional for button types buynow and cart only
	 * Must Be either PRODUCTS or SERVICES
	 */
	private ButtonSubTypeType ButtonSubType;
	public ButtonSubTypeType getButtonSubType() {
		return ButtonSubType;
	}
	public void setButtonSubType(ButtonSubTypeType value) {
		this.ButtonSubType = value;
	}

	/**
	 * Button Variable information
	 * At least one required recurring
	 * Character length and limitations: 63 single-byte alphanumeric characters
	 */
	private List<String> ButtonVar = new ArrayList<String>();
	public List<String> getButtonVar() {
		return ButtonVar;
	}
	public void setButtonVar(List<String> value) {
		this.ButtonVar = value;
	}

	/**
	 */
	private List<OptionDetailsType> OptionDetails = new ArrayList<OptionDetailsType>();
	public List<OptionDetailsType> getOptionDetails() {
		return OptionDetails;
	}
	public void setOptionDetails(List<OptionDetailsType> value) {
		this.OptionDetails = value;
	}

	/**
	 * Details of each option for the button.
	 * Optional
	 */
	private List<String> TextBox = new ArrayList<String>();
	public List<String> getTextBox() {
		return TextBox;
	}
	public void setTextBox(List<String> value) {
		this.TextBox = value;
	}

	/**
	 * Button image to use.
	 * Optional
	 * Must be one of: REG, SML, or CC
	 */
	private ButtonImageType ButtonImage;
	public ButtonImageType getButtonImage() {
		return ButtonImage;
	}
	public void setButtonImage(ButtonImageType value) {
		this.ButtonImage = value;
	}

	/**
	 * Button URL for custom button image.
	 * Optional
	 * Character length and limitations: 127 single-byte alphanumeric characters
	 */
	private String ButtonImageURL;
	public String getButtonImageURL() {
		return ButtonImageURL;
	}
	public void setButtonImageURL(String value) {
		this.ButtonImageURL = value;
	}

	/**
	 * Text to use on Buy Now Button.
	 * Optional
	 * Must be either BUYNOW or PAYNOW
	 */
	private BuyNowTextType BuyNowText;
	public BuyNowTextType getBuyNowText() {
		return BuyNowText;
	}
	public void setBuyNowText(BuyNowTextType value) {
		this.BuyNowText = value;
	}

	/**
	 * Text to use on Subscribe button.
	 * Optional
	 * Must be either BUYNOW or SUBSCRIBE
	 */
	private SubscribeTextType SubscribeText;
	public SubscribeTextType getSubscribeText() {
		return SubscribeText;
	}
	public void setSubscribeText(SubscribeTextType value) {
		this.SubscribeText = value;
	}

	/**
	 * Button Country.
	 * Optional
	 * Must be valid ISO country code
	 */
	private CountryCodeType ButtonCountry;
	public CountryCodeType getButtonCountry() {
		return ButtonCountry;
	}
	public void setButtonCountry(CountryCodeType value) {
		this.ButtonCountry = value;
	}

	/**
	 * Button language code.
	 * Optional
	 * Character length and limitations: 2 single-byte alphanumeric characters
	 */
	private String ButtonLanguage;
	public String getButtonLanguage() {
		return ButtonLanguage;
	}
	public void setButtonLanguage(String value) {
		this.ButtonLanguage = value;
	}


	public BMUpdateButtonRequestType(String HostedButtonID) {
		this.HostedButtonID = HostedButtonID;
	}
	public BMUpdateButtonRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( HostedButtonID != null ) {
			sb.append("<urn:HostedButtonID>").append(HostedButtonID);
			sb.append("</urn:HostedButtonID>");
		}
		if( ButtonType != null ) {
			sb.append("<urn:ButtonType>").append( ButtonType.getValue());
			sb.append("</urn:ButtonType>");
		}
		if( ButtonCode != null ) {
			sb.append("<urn:ButtonCode>").append( ButtonCode.getValue());
			sb.append("</urn:ButtonCode>");
		}
		if( ButtonSubType != null ) {
			sb.append("<urn:ButtonSubType>").append( ButtonSubType.getValue());
			sb.append("</urn:ButtonSubType>");
		}
		if( ButtonVar != null ) {
			for(int i=0; i<ButtonVar.size(); i++) {
				sb.append("<urn:ButtonVar>").append(ButtonVar.get(i));
				sb.append("</urn:ButtonVar>");
			}
		}
		if( OptionDetails != null ) {
			for(int i=0; i<OptionDetails.size(); i++) {
				sb.append("<urn:OptionDetails>");
				sb.append(OptionDetails.get(i).toXMLString());
				sb.append("</urn:OptionDetails>");
			}
		}
		if( TextBox != null ) {
			for(int i=0; i<TextBox.size(); i++) {
				sb.append("<urn:TextBox>").append(TextBox.get(i));
				sb.append("</urn:TextBox>");
			}
		}
		if( ButtonImage != null ) {
			sb.append("<urn:ButtonImage>").append( ButtonImage.getValue());
			sb.append("</urn:ButtonImage>");
		}
		if( ButtonImageURL != null ) {
			sb.append("<urn:ButtonImageURL>").append(ButtonImageURL);
			sb.append("</urn:ButtonImageURL>");
		}
		if( BuyNowText != null ) {
			sb.append("<urn:BuyNowText>").append( BuyNowText.getValue());
			sb.append("</urn:BuyNowText>");
		}
		if( SubscribeText != null ) {
			sb.append("<urn:SubscribeText>").append( SubscribeText.getValue());
			sb.append("</urn:SubscribeText>");
		}
		if( ButtonCountry != null ) {
			sb.append("<urn:ButtonCountry>").append( ButtonCountry.getValue());
			sb.append("</urn:ButtonCountry>");
		}
		if( ButtonLanguage != null ) {
			sb.append("<urn:ButtonLanguage>").append(ButtonLanguage);
			sb.append("</urn:ButtonLanguage>");
		}
		return sb.toString();
	}

}
