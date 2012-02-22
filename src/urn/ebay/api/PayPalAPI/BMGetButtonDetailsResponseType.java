
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import urn.ebay.api.PayPalAPI.OptionDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractResponseType;
import urn.ebay.apis.eBLBaseComponents.ButtonCodeType;
import urn.ebay.apis.eBLBaseComponents.ButtonImageType;
import urn.ebay.apis.eBLBaseComponents.ButtonSubTypeType;
import urn.ebay.apis.eBLBaseComponents.ButtonTypeType;
import urn.ebay.apis.eBLBaseComponents.BuyNowTextType;
import urn.ebay.apis.eBLBaseComponents.CountryCodeType;
import urn.ebay.apis.eBLBaseComponents.SubscribeTextType;


/**
 * Type of button.
 * One of the following: BUYNOW, CART, GIFTCERTIFICATE. SUBSCRIBE, PAYMENTPLAN, AUTOBILLING, DONATE, VIEWCART or UNSUBSCRIBE
 */
public class BMGetButtonDetailsResponseType extends AbstractResponseType{

	/**
	 */
	private String Website;
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String value) {
		this.Website = value;
	}

	/**
	 */
	private String Email;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String value) {
		this.Email = value;
	}

	/**
	 */
	private String Mobile;
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String value) {
		this.Mobile = value;
	}

	/**
	 */
	private String HostedButtonID;
	public String getHostedButtonID() {
		return HostedButtonID;
	}
	public void setHostedButtonID(String value) {
		this.HostedButtonID = value;
	}

	/**
	 * Type of button.
	 * One of the following: BUYNOW, CART, GIFTCERTIFICATE. SUBSCRIBE, PAYMENTPLAN, AUTOBILLING, DONATE, VIEWCART or UNSUBSCRIBE
	 */
	private ButtonTypeType ButtonType;
	public ButtonTypeType getButtonType() {
		return ButtonType;
	}
	public void setButtonType(ButtonTypeType value) {
		this.ButtonType = value;
	}

	/**
	 * Type of button code.
	 * One of the following: hosted, encrypted or cleartext
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
	 * Either PRODUCTS or SERVICES
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
	 * Text field
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
	 * One of: REG, SML, or CC
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
	 * Either BUYNOW or PAYNOW
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
	 * Valid ISO country code or 'International'
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
	 * Character length and limitations: 3 single-byte alphanumeric characters
	 */
	private String ButtonLanguage;
	public String getButtonLanguage() {
		return ButtonLanguage;
	}
	public void setButtonLanguage(String value) {
		this.ButtonLanguage = value;
	}


	public BMGetButtonDetailsResponseType() {
	}
	 private  boolean isWhitespaceNode(Node n) {
		 if (n.getNodeType() == Node.TEXT_NODE) { 
				String val = n.getNodeValue();
				return val.trim().length() == 0; 
		 } else {
				return false;
		 } 
	 } 
	 private String convertToXML(Node n){ 
		 String name = n.getNodeName();
		 short type = n.getNodeType();
		 if (Node.CDATA_SECTION_NODE == type) {
			  return "<![CDATA[" + n.getNodeValue() + "]]&gt;";
		 } 
		 if (name.startsWith("#")) {
			  return "";
		} 
		 StringBuffer sb = new StringBuffer();
		 sb.append('<').append(name);
		 NamedNodeMap attrs = n.getAttributes();
		 if (attrs != null) { 
		  for (int i = 0; i < attrs.getLength(); i++) { 
			    Node attr = attrs.item(i);
			    sb.append(' ').append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
		  }
		 } 
		 String textContent = null; 
		 NodeList children = n.getChildNodes(); 
		 if (children.getLength() == 0) { 
		  if ((textContent = n.getTextContent()) != null && !"".equals(textContent)) {
		    sb.append(textContent).append("</").append(name).append('>'); 
		  } else { 
		    sb.append("/>"); 
		  } 
		 } else { 
		  sb.append('>'); 
		  boolean hasValidChildren = false;
		  for (int i = 0; i < children.getLength(); i++) { 
		    String childToString = convertToXML(children.item(i));
		    if (!"".equals(childToString)) {
		      sb.append(childToString); 
		      hasValidChildren = true; 
		    } 
		  } 
		  if (!hasValidChildren && ((textContent = n.getTextContent()) != null)) { 
		    sb.append(textContent); 
		 }
		  sb.append("</").append(name).append('>');
		 }
		 return sb.toString();
	 } 
	 public BMGetButtonDetailsResponseType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 super(xmlSoap); 
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("Website").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Website").item(0))){ 
		 this.Website =(String)document.getElementsByTagName("Website").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Email").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Email").item(0))){ 
		 this.Email =(String)document.getElementsByTagName("Email").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Mobile").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Mobile").item(0))){ 
		 this.Mobile =(String)document.getElementsByTagName("Mobile").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("HostedButtonID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("HostedButtonID").item(0))){ 
		 this.HostedButtonID =(String)document.getElementsByTagName("HostedButtonID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ButtonType").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ButtonType").item(0))){ 
		 this.ButtonType = ButtonTypeType.fromValue(document.getElementsByTagName("ButtonType").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("ButtonCode").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ButtonCode").item(0))){ 
		 this.ButtonCode = ButtonCodeType.fromValue(document.getElementsByTagName("ButtonCode").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("ButtonSubType").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ButtonSubType").item(0))){ 
		 this.ButtonSubType = ButtonSubTypeType.fromValue(document.getElementsByTagName("ButtonSubType").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("ButtonVar").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ButtonVar").item(0))){ 
		 nodeList = document.getElementsByTagName("ButtonVar");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 String value = nodeList.item(i).getTextContent(); 
			 this.ButtonVar.add(value);
		}

}
	}
		 if(document.getElementsByTagName("OptionDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OptionDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("OptionDetails");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 xmlString = convertToXML(nodeList.item(i)); 
				this.OptionDetails.add(new OptionDetailsType(xmlString));
			}

}
	}
		 if(document.getElementsByTagName("TextBox").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TextBox").item(0))){ 
		 nodeList = document.getElementsByTagName("TextBox");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 String value = nodeList.item(i).getTextContent(); 
			 this.TextBox.add(value);
		}

}
	}
		 if(document.getElementsByTagName("ButtonImage").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ButtonImage").item(0))){ 
		 this.ButtonImage = ButtonImageType.fromValue(document.getElementsByTagName("ButtonImage").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("ButtonImageURL").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ButtonImageURL").item(0))){ 
		 this.ButtonImageURL =(String)document.getElementsByTagName("ButtonImageURL").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("BuyNowText").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BuyNowText").item(0))){ 
		 this.BuyNowText = BuyNowTextType.fromValue(document.getElementsByTagName("BuyNowText").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("SubscribeText").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("SubscribeText").item(0))){ 
		 this.SubscribeText = SubscribeTextType.fromValue(document.getElementsByTagName("SubscribeText").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("ButtonCountry").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ButtonCountry").item(0))){ 
		 this.ButtonCountry = CountryCodeType.fromValue(document.getElementsByTagName("ButtonCountry").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("ButtonLanguage").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ButtonLanguage").item(0))){ 
		 this.ButtonLanguage =(String)document.getElementsByTagName("ButtonLanguage").item(0).getTextContent();

}
	}
	}
}
