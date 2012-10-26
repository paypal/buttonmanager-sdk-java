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
import urn.ebay.apis.eBLBaseComponents.AbstractResponseType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;
import java.io.FileInputStream;
import java.io.StringReader;
import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Type of button. One of the following: BUYNOW, CART,
 * GIFTCERTIFICATE. SUBSCRIBE, PAYMENTPLAN, AUTOBILLING,
 * DONATE, VIEWCART or UNSUBSCRIBE 
 */
public class BMGetButtonDetailsResponseType extends AbstractResponseType {


	/**
	 * 	 
	 */ 
	private String website;

	/**
	 * 	 
	 */ 
	private String email;

	/**
	 * 	 
	 */ 
	private String mobile;

	/**
	 * 	 
	 */ 
	private String hostedButtonID;

	/**
	 * Type of button. One of the following: BUYNOW, CART,
	 * GIFTCERTIFICATE. SUBSCRIBE, PAYMENTPLAN, AUTOBILLING,
	 * DONATE, VIEWCART or UNSUBSCRIBE 	 
	 */ 
	private ButtonTypeType buttonType;

	/**
	 * Type of button code. One of the following: hosted, encrypted
	 * or cleartext 	 
	 */ 
	private ButtonCodeType buttonCode;

	/**
	 * Button sub type. optional for button types buynow and cart
	 * only Either PRODUCTS or SERVICES 	 
	 */ 
	private ButtonSubTypeType buttonSubType;

	/**
	 * Button Variable information Character length and
	 * limitations: 63 single-byte alphanumeric characters 	 
	 */ 
	private List<String> buttonVar = new ArrayList<String>();

	/**
	 * 	 
	 */ 
	private List<OptionDetailsType> optionDetails = new ArrayList<OptionDetailsType>();

	/**
	 * Text field 	 
	 */ 
	private List<String> textBox = new ArrayList<String>();

	/**
	 * Button image to use. One of: REG, SML, or CC 	 
	 */ 
	private ButtonImageType buttonImage;

	/**
	 * Button URL for custom button image. 	 
	 */ 
	private String buttonImageURL;

	/**
	 * Text to use on Buy Now Button. Either BUYNOW or PAYNOW 	 
	 */ 
	private BuyNowTextType buyNowText;

	/**
	 * Text to use on Subscribe button. Must be either BUYNOW or
	 * SUBSCRIBE 	 
	 */ 
	private SubscribeTextType subscribeText;

	/**
	 * Button Country. Valid ISO country code or 'International' 	 
	 */ 
	private CountryCodeType buttonCountry;

	/**
	 * Button language code. Character length and limitations: 3
	 * single-byte alphanumeric characters 	 
	 */ 
	private String buttonLanguage;

	

	/**
	 * Default Constructor
	 */
	public BMGetButtonDetailsResponseType (){
	}	

	/**
	 * Getter for website
	 */
	 public String getWebsite() {
	 	return website;
	 }
	 
	/**
	 * Setter for website
	 */
	 public void setWebsite(String website) {
	 	this.website = website;
	 }
	 
	/**
	 * Getter for email
	 */
	 public String getEmail() {
	 	return email;
	 }
	 
	/**
	 * Setter for email
	 */
	 public void setEmail(String email) {
	 	this.email = email;
	 }
	 
	/**
	 * Getter for mobile
	 */
	 public String getMobile() {
	 	return mobile;
	 }
	 
	/**
	 * Setter for mobile
	 */
	 public void setMobile(String mobile) {
	 	this.mobile = mobile;
	 }
	 
	/**
	 * Getter for hostedButtonID
	 */
	 public String getHostedButtonID() {
	 	return hostedButtonID;
	 }
	 
	/**
	 * Setter for hostedButtonID
	 */
	 public void setHostedButtonID(String hostedButtonID) {
	 	this.hostedButtonID = hostedButtonID;
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
	 



	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else if (n.getNodeType() == Node.ELEMENT_NODE ) {
			return (n.getChildNodes().getLength() == 0);
		} else {
			return false;
		}
	}
	
	public BMGetButtonDetailsResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Website", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.website = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Email", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.email = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Mobile", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.mobile = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("HostedButtonID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.hostedButtonID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ButtonType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.buttonType = ButtonTypeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ButtonCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.buttonCode = ButtonCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ButtonSubType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.buttonSubType = ButtonSubTypeType.fromValue(childNode.getTextContent());
		}
        nodeList = (NodeList) xpath.evaluate("ButtonVar", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
			    Node subNode = nodeList.item(i);
			    String value = subNode.getTextContent();
			    this.buttonVar.add(value);
					
			}
		}
        nodeList = (NodeList) xpath.evaluate("OptionDetails", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.optionDetails.add(new OptionDetailsType(subNode));
			}
		}
        nodeList = (NodeList) xpath.evaluate("TextBox", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
			    Node subNode = nodeList.item(i);
			    String value = subNode.getTextContent();
			    this.textBox.add(value);
					
			}
		}
		childNode = (Node) xpath.evaluate("ButtonImage", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.buttonImage = ButtonImageType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ButtonImageURL", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.buttonImageURL = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BuyNowText", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.buyNowText = BuyNowTextType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("SubscribeText", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.subscribeText = SubscribeTextType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ButtonCountry", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.buttonCountry = CountryCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ButtonLanguage", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.buttonLanguage = childNode.getTextContent();
		}
	
	}
 
}