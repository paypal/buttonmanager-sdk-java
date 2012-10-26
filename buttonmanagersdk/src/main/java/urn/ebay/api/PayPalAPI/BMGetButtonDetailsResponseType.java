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
	private String Website;

	/**
	 * 	 
	 */ 
	private String Email;

	/**
	 * 	 
	 */ 
	private String Mobile;

	/**
	 * 	 
	 */ 
	private String HostedButtonID;

	/**
	 * Type of button. One of the following: BUYNOW, CART,
	 * GIFTCERTIFICATE. SUBSCRIBE, PAYMENTPLAN, AUTOBILLING,
	 * DONATE, VIEWCART or UNSUBSCRIBE 	 
	 */ 
	private ButtonTypeType ButtonType;

	/**
	 * Type of button code. One of the following: hosted, encrypted
	 * or cleartext 	 
	 */ 
	private ButtonCodeType ButtonCode;

	/**
	 * Button sub type. optional for button types buynow and cart
	 * only Either PRODUCTS or SERVICES 	 
	 */ 
	private ButtonSubTypeType ButtonSubType;

	/**
	 * Button Variable information Character length and
	 * limitations: 63 single-byte alphanumeric characters 	 
	 */ 
	private List<String> ButtonVar = new ArrayList<String>();

	/**
	 * 	 
	 */ 
	private List<OptionDetailsType> OptionDetails = new ArrayList<OptionDetailsType>();

	/**
	 * Text field 	 
	 */ 
	private List<String> TextBox = new ArrayList<String>();

	/**
	 * Button image to use. One of: REG, SML, or CC 	 
	 */ 
	private ButtonImageType ButtonImage;

	/**
	 * Button URL for custom button image. 	 
	 */ 
	private String ButtonImageURL;

	/**
	 * Text to use on Buy Now Button. Either BUYNOW or PAYNOW 	 
	 */ 
	private BuyNowTextType BuyNowText;

	/**
	 * Text to use on Subscribe button. Must be either BUYNOW or
	 * SUBSCRIBE 	 
	 */ 
	private SubscribeTextType SubscribeText;

	/**
	 * Button Country. Valid ISO country code or 'International' 	 
	 */ 
	private CountryCodeType ButtonCountry;

	/**
	 * Button language code. Character length and limitations: 3
	 * single-byte alphanumeric characters 	 
	 */ 
	private String ButtonLanguage;

	

	/**
	 * Default Constructor
	 */
	public BMGetButtonDetailsResponseType (){
	}	

	/**
	 * Getter for Website
	 */
	 public String getWebsite() {
	 	return Website;
	 }
	 
	/**
	 * Setter for Website
	 */
	 public void setWebsite(String Website) {
	 	this.Website = Website;
	 }
	 
	/**
	 * Getter for Email
	 */
	 public String getEmail() {
	 	return Email;
	 }
	 
	/**
	 * Setter for Email
	 */
	 public void setEmail(String Email) {
	 	this.Email = Email;
	 }
	 
	/**
	 * Getter for Mobile
	 */
	 public String getMobile() {
	 	return Mobile;
	 }
	 
	/**
	 * Setter for Mobile
	 */
	 public void setMobile(String Mobile) {
	 	this.Mobile = Mobile;
	 }
	 
	/**
	 * Getter for HostedButtonID
	 */
	 public String getHostedButtonID() {
	 	return HostedButtonID;
	 }
	 
	/**
	 * Setter for HostedButtonID
	 */
	 public void setHostedButtonID(String HostedButtonID) {
	 	this.HostedButtonID = HostedButtonID;
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
		    this.Website = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Email", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Email = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Mobile", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Mobile = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("HostedButtonID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.HostedButtonID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ButtonType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ButtonType = ButtonTypeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ButtonCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ButtonCode = ButtonCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ButtonSubType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ButtonSubType = ButtonSubTypeType.fromValue(childNode.getTextContent());
		}
        nodeList = (NodeList) xpath.evaluate("ButtonVar", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
			    Node subNode = nodeList.item(i);
			    String value = subNode.getTextContent();
			    this.ButtonVar.add(value);
					
			}
		}
        nodeList = (NodeList) xpath.evaluate("OptionDetails", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.OptionDetails.add(new OptionDetailsType(subNode));
			}
		}
        nodeList = (NodeList) xpath.evaluate("TextBox", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
			    Node subNode = nodeList.item(i);
			    String value = subNode.getTextContent();
			    this.TextBox.add(value);
					
			}
		}
		childNode = (Node) xpath.evaluate("ButtonImage", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ButtonImage = ButtonImageType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ButtonImageURL", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ButtonImageURL = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BuyNowText", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.BuyNowText = BuyNowTextType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("SubscribeText", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SubscribeText = SubscribeTextType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ButtonCountry", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ButtonCountry = CountryCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ButtonLanguage", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ButtonLanguage = childNode.getTextContent();
		}
	
	}
 
}