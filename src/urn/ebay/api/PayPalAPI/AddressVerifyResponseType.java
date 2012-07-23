package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AddressStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.MatchStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.CountryCodeType;
import urn.ebay.apis.eBLBaseComponents.AbstractResponseType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
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
		} else {
			return false;
		}
	}
	
	private String convertToXML(Node n){
		String name = n.getNodeName();
		short type = n.getNodeType();
		if (Node.CDATA_SECTION_NODE == type) {
			return "&lt![CDATA[\" + n.getNodeValue() + \"]]&gt";
		}
		if (name.startsWith("#")) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		sb.append("<").append(name);
		NamedNodeMap attrs = n.getAttributes();
		if (attrs != null) {
			for (int i = 0; i < attrs.getLength(); i++) {
				Node attr = attrs.item(i);
				sb.append(" ").append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
			}
		}
		String textContent = null;
		NodeList children = n.getChildNodes();
		if (children.getLength() == 0) {
			if (((textContent = n.getTextContent())) != null && (!"".equals(textContent))) {
				sb.append(textContent).append("</").append(name).append(">");
			} else {
				sb.append("/>");
			}
		} else {
			sb.append(">");
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
			sb.append("</").append(name).append(">");
		}
		return sb.toString();
	}
	
	public AddressVerifyResponseType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		super(xmlSoap);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if(document.getElementsByTagName("ConfirmationCode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ConfirmationCode").item(0))) {
				this.ConfirmationCode = AddressStatusCodeType.fromValue(document.getElementsByTagName("ConfirmationCode").item(0).getTextContent());
			}
		}
		if(document.getElementsByTagName("StreetMatch").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("StreetMatch").item(0))) {
				this.StreetMatch = MatchStatusCodeType.fromValue(document.getElementsByTagName("StreetMatch").item(0).getTextContent());
			}
		}
		if(document.getElementsByTagName("ZipMatch").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ZipMatch").item(0))) {
				this.ZipMatch = MatchStatusCodeType.fromValue(document.getElementsByTagName("ZipMatch").item(0).getTextContent());
			}
		}
		if(document.getElementsByTagName("CountryCode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("CountryCode").item(0))) {
				this.CountryCode = CountryCodeType.fromValue(document.getElementsByTagName("CountryCode").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("PayPalToken").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PayPalToken").item(0))) {
				this.PayPalToken = (String)document.getElementsByTagName("PayPalToken").item(0).getTextContent();
			}
		}
	
	}

}