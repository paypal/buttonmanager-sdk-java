package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AddressStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.MatchStatusCodeType;
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
 * Confirmation of a match, with one of the following tokens:
 * None: The input value of the Email object does not match any
 * email address on file at PayPal. Confirmed: If the value of
 * the StreetMatch object is Matched, PayPal responds that the
 * entire postal address is confirmed. Unconfirmed: PayPal
 * responds that the postal address is unconfirmed 
 */
public class AddressVerifyResponseType extends AbstractResponseType {


	/**
	 * Confirmation of a match, with one of the following tokens:
	 * None: The input value of the Email object does not match any
	 * email address on file at PayPal. Confirmed: If the value of
	 * the StreetMatch object is Matched, PayPal responds that the
	 * entire postal address is confirmed. Unconfirmed: PayPal
	 * responds that the postal address is unconfirmed	  
	 *@Required	 
	 */ 
	private AddressStatusCodeType ConfirmationCode;

	/**
	 * PayPal has compared the postal address you want to verify
	 * with the postal address on file at PayPal. None: The input
	 * value of the Email object does not match any email address
	 * on file at PayPal. In addition, an error response is
	 * returned. No further comparison of other input values has
	 * been made. Matched: The street address matches the street
	 * address on file at PayPal. Unmatched: The street address
	 * does not match the street address on file at PayPal. 	  
	 *@Required	 
	 */ 
	private MatchStatusCodeType StreetMatch;

	/**
	 * PayPal has compared the zip code you want to verify with the
	 * zip code on file for the email address. None: The street
	 * address was unmatched. No further comparison of other input
	 * values has been made. Matched: The zip code matches the zip
	 * code on file at PayPal. Unmatched: The zip code does not
	 * match the zip code on file at PayPal. 	 
	 */ 
	private MatchStatusCodeType ZipMatch;

	/**
	 * Two-character country code (ISO 3166) on file for the PayPal
	 * email address. 	 
	 */ 
	private CountryCodeType CountryCode;

	/**
	 * The token prevents a buyer from using any street address
	 * other than the address on file at PayPal during additional
	 * purchases he might make from the merchant. It contains
	 * encrypted information about the user’s street address and
	 * email address. You can pass the value of the token with the
	 * Buy Now button HTML address_api_token variable so that
	 * PayPal prevents the buyer from using any street address or
	 * email address other than those verified by PayPal. The token
	 * is valid for 24 hours. Character length and limitations: 94
	 * single-byte characters 	 
	 */ 
	private String PayPalToken;

	

	/**
	 * Default Constructor
	 */
	public AddressVerifyResponseType (){
	}	

	/**
	 * Getter for ConfirmationCode
	 */
	 public AddressStatusCodeType getConfirmationCode() {
	 	return ConfirmationCode;
	 }
	 
	/**
	 * Setter for ConfirmationCode
	 */
	 public void setConfirmationCode(AddressStatusCodeType ConfirmationCode) {
	 	this.ConfirmationCode = ConfirmationCode;
	 }
	 
	/**
	 * Getter for StreetMatch
	 */
	 public MatchStatusCodeType getStreetMatch() {
	 	return StreetMatch;
	 }
	 
	/**
	 * Setter for StreetMatch
	 */
	 public void setStreetMatch(MatchStatusCodeType StreetMatch) {
	 	this.StreetMatch = StreetMatch;
	 }
	 
	/**
	 * Getter for ZipMatch
	 */
	 public MatchStatusCodeType getZipMatch() {
	 	return ZipMatch;
	 }
	 
	/**
	 * Setter for ZipMatch
	 */
	 public void setZipMatch(MatchStatusCodeType ZipMatch) {
	 	this.ZipMatch = ZipMatch;
	 }
	 
	/**
	 * Getter for CountryCode
	 */
	 public CountryCodeType getCountryCode() {
	 	return CountryCode;
	 }
	 
	/**
	 * Setter for CountryCode
	 */
	 public void setCountryCode(CountryCodeType CountryCode) {
	 	this.CountryCode = CountryCode;
	 }
	 
	/**
	 * Getter for PayPalToken
	 */
	 public String getPayPalToken() {
	 	return PayPalToken;
	 }
	 
	/**
	 * Setter for PayPalToken
	 */
	 public void setPayPalToken(String PayPalToken) {
	 	this.PayPalToken = PayPalToken;
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
	
	public AddressVerifyResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("ConfirmationCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ConfirmationCode = AddressStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("StreetMatch", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.StreetMatch = MatchStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ZipMatch", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ZipMatch = MatchStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("CountryCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CountryCode = CountryCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PayPalToken", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PayPalToken = childNode.getTextContent();
		}
	
	}
 
}