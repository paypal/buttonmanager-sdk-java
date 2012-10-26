package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.CountryCodeType;
import urn.ebay.apis.eBLBaseComponents.AddressOwnerCodeType;
import urn.ebay.apis.eBLBaseComponents.AddressStatusCodeType;
import com.paypal.core.SDKUtil;
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
 * Person's name associated with this address. Character length
 * and limitations: 32 single-byte alphanumeric characters 
 */
public class AddressType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Person's name associated with this address. Character length
	 * and limitations: 32 single-byte alphanumeric characters	 
	 */ 
	private String name;

	/**
	 * First street address. Character length and limitations: 300
	 * single-byte alphanumeric characters	 
	 */ 
	private String street1;

	/**
	 * Second street address. Character length and limitations: 300
	 * single-byte alphanumeric characters	 
	 */ 
	private String street2;

	/**
	 * Name of city. Character length and limitations: 120
	 * single-byte alphanumeric characters	 
	 */ 
	private String cityName;

	/**
	 * State or province. Character length and limitations: 120
	 * single-byte alphanumeric characters For Canada and the USA,
	 * StateOrProvince must be the standard 2-character
	 * abbreviation of a state or province. Canadian Provinces
	 * Alberta AB British_Columbia BC Manitoba MB New_Brunswick NB
	 * Newfoundland NF Northwest_Territories NT Nova_Scotia NS
	 * Nunavut NU Ontario ON Prince_Edward_Island PE Quebec QC
	 * Saskatchewan SK Yukon YK United States Alabama  AL Alaska AK
	 * American_Samoa AS Arizona AZ Arkansas AR California CA
	 * Colorado CO Connecticut CT Delaware DE District_Of_Columbia
	 * DC Federated_States_Of_Micronesia FM Florida FL Georgia GA
	 * Guam GU Hawaii HI Idaho ID Illinois IL Indiana IN Iowa IA
	 * Kansas KS Kentucky KY Louisiana LA Maine ME Marshall_Islands
	 * MH Maryland MD Massachusetts MA Michigan MI Minnesota MN
	 * Mississippi MS Missouri MO Montana MT Nebraska NE Nevada NV
	 * New_Hampshire NH New_Jersey NJ New_Mexico NM New_York NY
	 * North_Carolina NC North_Dakota ND Northern_Mariana_Islands
	 * MP Ohio OH Oklahoma OK Oregon OR Palau PW Pennsylvania PA
	 * Puerto_Rico PR Rhode_Island RI South_Carolina SC
	 * South_Dakota SD Tennessee TN Texas TX Utah UT Vermont VT
	 * Virgin_Islands VI Virginia VA Washington WA West_Virginia WV
	 * Wisconsin WI Wyoming WY Armed_Forces_Americas AA
	 * Armed_Forces AE Armed_Forces_Pacific AP 	 
	 */ 
	private String stateOrProvince;

	/**
	 * ISO 3166 standard country code Character limit: Two
	 * single-byte characters. 	 
	 */ 
	private CountryCodeType country;

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout,
	 * DoExpressCheckoutPayment, DoDirectPayment,
	 * CreateRecurringPaymentsProfile or
	 * UpdateRecurringPaymentsProfile.  This element should only be
	 * used in response elements and typically  should not be used
	 * in creating request messages which specify the name of a
	 * country using the Country element (which refers to a 
	 * 2-letter country code). 	 
	 */ 
	private String countryName;

	/**
	 * Telephone number associated with this address	 
	 */ 
	private String phone;

	/**
	 * 	 
	 */ 
	private String postalCode;

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout,
	 * DoExpressCheckoutPayment, DoDirectPayment,
	 * CreateRecurringPaymentsProfile, or
	 * UpdateRecurringPaymentsProfile.	 
	 */ 
	private String addressID;

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout,
	 * DoExpressCheckoutPayment, DoDirectPayment,
	 * CreateRecurringPaymentsProfile or
	 * UpdateRecurringPaymentsProfile.	 
	 */ 
	private AddressOwnerCodeType addressOwner;

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout,
	 * DoExpressCheckoutPayment, DoDirectPayment,
	 * CreateRecurringPaymentsProfile or
	 * UpdateRecurringPaymentsProfile.	 
	 */ 
	private String externalAddressID;

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout,
	 * DoExpressCheckoutPayment, DoDirectPayment,
	 * CreateRecurringPaymentsProfile or
	 * UpdateRecurringPaymentsProfile.  Only applicable to
	 * SellerPaymentAddress today. Seller's international name that
	 * is associated with the payment address. 	 
	 */ 
	private String internationalName;

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout,
	 * DoExpressCheckoutPayment, DoDirectPayment,
	 * CreateRecurringPaymentsProfile or
	 * UpdateRecurringPaymentsProfile. Only applicable to
	 * SellerPaymentAddress today. International state and city for
	 * the seller's payment address. 	 
	 */ 
	private String internationalStateAndCity;

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout,
	 * DoExpressCheckoutPayment, DoDirectPayment,
	 * CreateRecurringPaymentsProfile or
	 * UpdateRecurringPaymentsProfile. Only applicable to
	 * SellerPaymentAddress today. Seller's international street
	 * address that is associated with the payment address. 	 
	 */ 
	private String internationalStreet;

	/**
	 * Status of the address on file with PayPal. IMPORTANT: Do not
	 * set this element for SetExpressCheckout,
	 * DoExpressCheckoutPayment, DoDirectPayment,
	 * CreateRecurringPaymentsProfile or
	 * UpdateRecurringPaymentsProfile. 	 
	 */ 
	private AddressStatusCodeType addressStatus;

	

	/**
	 * Default Constructor
	 */
	public AddressType (){
	}	

	/**
	 * Getter for name
	 */
	 public String getName() {
	 	return name;
	 }
	 
	/**
	 * Setter for name
	 */
	 public void setName(String name) {
	 	this.name = name;
	 }
	 
	/**
	 * Getter for street1
	 */
	 public String getStreet1() {
	 	return street1;
	 }
	 
	/**
	 * Setter for street1
	 */
	 public void setStreet1(String street1) {
	 	this.street1 = street1;
	 }
	 
	/**
	 * Getter for street2
	 */
	 public String getStreet2() {
	 	return street2;
	 }
	 
	/**
	 * Setter for street2
	 */
	 public void setStreet2(String street2) {
	 	this.street2 = street2;
	 }
	 
	/**
	 * Getter for cityName
	 */
	 public String getCityName() {
	 	return cityName;
	 }
	 
	/**
	 * Setter for cityName
	 */
	 public void setCityName(String cityName) {
	 	this.cityName = cityName;
	 }
	 
	/**
	 * Getter for stateOrProvince
	 */
	 public String getStateOrProvince() {
	 	return stateOrProvince;
	 }
	 
	/**
	 * Setter for stateOrProvince
	 */
	 public void setStateOrProvince(String stateOrProvince) {
	 	this.stateOrProvince = stateOrProvince;
	 }
	 
	/**
	 * Getter for country
	 */
	 public CountryCodeType getCountry() {
	 	return country;
	 }
	 
	/**
	 * Setter for country
	 */
	 public void setCountry(CountryCodeType country) {
	 	this.country = country;
	 }
	 
	/**
	 * Getter for countryName
	 */
	 public String getCountryName() {
	 	return countryName;
	 }
	 
	/**
	 * Setter for countryName
	 */
	 public void setCountryName(String countryName) {
	 	this.countryName = countryName;
	 }
	 
	/**
	 * Getter for phone
	 */
	 public String getPhone() {
	 	return phone;
	 }
	 
	/**
	 * Setter for phone
	 */
	 public void setPhone(String phone) {
	 	this.phone = phone;
	 }
	 
	/**
	 * Getter for postalCode
	 */
	 public String getPostalCode() {
	 	return postalCode;
	 }
	 
	/**
	 * Setter for postalCode
	 */
	 public void setPostalCode(String postalCode) {
	 	this.postalCode = postalCode;
	 }
	 
	/**
	 * Getter for addressID
	 */
	 public String getAddressID() {
	 	return addressID;
	 }
	 
	/**
	 * Setter for addressID
	 */
	 public void setAddressID(String addressID) {
	 	this.addressID = addressID;
	 }
	 
	/**
	 * Getter for addressOwner
	 */
	 public AddressOwnerCodeType getAddressOwner() {
	 	return addressOwner;
	 }
	 
	/**
	 * Setter for addressOwner
	 */
	 public void setAddressOwner(AddressOwnerCodeType addressOwner) {
	 	this.addressOwner = addressOwner;
	 }
	 
	/**
	 * Getter for externalAddressID
	 */
	 public String getExternalAddressID() {
	 	return externalAddressID;
	 }
	 
	/**
	 * Setter for externalAddressID
	 */
	 public void setExternalAddressID(String externalAddressID) {
	 	this.externalAddressID = externalAddressID;
	 }
	 
	/**
	 * Getter for internationalName
	 */
	 public String getInternationalName() {
	 	return internationalName;
	 }
	 
	/**
	 * Setter for internationalName
	 */
	 public void setInternationalName(String internationalName) {
	 	this.internationalName = internationalName;
	 }
	 
	/**
	 * Getter for internationalStateAndCity
	 */
	 public String getInternationalStateAndCity() {
	 	return internationalStateAndCity;
	 }
	 
	/**
	 * Setter for internationalStateAndCity
	 */
	 public void setInternationalStateAndCity(String internationalStateAndCity) {
	 	this.internationalStateAndCity = internationalStateAndCity;
	 }
	 
	/**
	 * Getter for internationalStreet
	 */
	 public String getInternationalStreet() {
	 	return internationalStreet;
	 }
	 
	/**
	 * Setter for internationalStreet
	 */
	 public void setInternationalStreet(String internationalStreet) {
	 	this.internationalStreet = internationalStreet;
	 }
	 
	/**
	 * Getter for addressStatus
	 */
	 public AddressStatusCodeType getAddressStatus() {
	 	return addressStatus;
	 }
	 
	/**
	 * Setter for addressStatus
	 */
	 public void setAddressStatus(AddressStatusCodeType addressStatus) {
	 	this.addressStatus = addressStatus;
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
		if(name != null) {
			sb.append("<").append(preferredPrefix).append(":Name>").append(SDKUtil.escapeInvalidXmlCharsRegex(name));
			sb.append("</").append(preferredPrefix).append(":Name>");
		}
		if(street1 != null) {
			sb.append("<").append(preferredPrefix).append(":Street1>").append(SDKUtil.escapeInvalidXmlCharsRegex(street1));
			sb.append("</").append(preferredPrefix).append(":Street1>");
		}
		if(street2 != null) {
			sb.append("<").append(preferredPrefix).append(":Street2>").append(SDKUtil.escapeInvalidXmlCharsRegex(street2));
			sb.append("</").append(preferredPrefix).append(":Street2>");
		}
		if(cityName != null) {
			sb.append("<").append(preferredPrefix).append(":CityName>").append(SDKUtil.escapeInvalidXmlCharsRegex(cityName));
			sb.append("</").append(preferredPrefix).append(":CityName>");
		}
		if(stateOrProvince != null) {
			sb.append("<").append(preferredPrefix).append(":StateOrProvince>").append(SDKUtil.escapeInvalidXmlCharsRegex(stateOrProvince));
			sb.append("</").append(preferredPrefix).append(":StateOrProvince>");
		}
		if(country != null) {
			sb.append("<").append(preferredPrefix).append(":Country>").append(SDKUtil.escapeInvalidXmlCharsRegex(country.getValue()));
			sb.append("</").append(preferredPrefix).append(":Country>");
		}
		if(countryName != null) {
			sb.append("<").append(preferredPrefix).append(":CountryName>").append(SDKUtil.escapeInvalidXmlCharsRegex(countryName));
			sb.append("</").append(preferredPrefix).append(":CountryName>");
		}
		if(phone != null) {
			sb.append("<").append(preferredPrefix).append(":Phone>").append(SDKUtil.escapeInvalidXmlCharsRegex(phone));
			sb.append("</").append(preferredPrefix).append(":Phone>");
		}
		if(postalCode != null) {
			sb.append("<").append(preferredPrefix).append(":PostalCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(postalCode));
			sb.append("</").append(preferredPrefix).append(":PostalCode>");
		}
		if(addressID != null) {
			sb.append("<").append(preferredPrefix).append(":AddressID>").append(SDKUtil.escapeInvalidXmlCharsRegex(addressID));
			sb.append("</").append(preferredPrefix).append(":AddressID>");
		}
		if(addressOwner != null) {
			sb.append("<").append(preferredPrefix).append(":AddressOwner>").append(SDKUtil.escapeInvalidXmlCharsRegex(addressOwner.getValue()));
			sb.append("</").append(preferredPrefix).append(":AddressOwner>");
		}
		if(externalAddressID != null) {
			sb.append("<").append(preferredPrefix).append(":ExternalAddressID>").append(SDKUtil.escapeInvalidXmlCharsRegex(externalAddressID));
			sb.append("</").append(preferredPrefix).append(":ExternalAddressID>");
		}
		if(internationalName != null) {
			sb.append("<").append(preferredPrefix).append(":InternationalName>").append(SDKUtil.escapeInvalidXmlCharsRegex(internationalName));
			sb.append("</").append(preferredPrefix).append(":InternationalName>");
		}
		if(internationalStateAndCity != null) {
			sb.append("<").append(preferredPrefix).append(":InternationalStateAndCity>").append(SDKUtil.escapeInvalidXmlCharsRegex(internationalStateAndCity));
			sb.append("</").append(preferredPrefix).append(":InternationalStateAndCity>");
		}
		if(internationalStreet != null) {
			sb.append("<").append(preferredPrefix).append(":InternationalStreet>").append(SDKUtil.escapeInvalidXmlCharsRegex(internationalStreet));
			sb.append("</").append(preferredPrefix).append(":InternationalStreet>");
		}
		if(addressStatus != null) {
			sb.append("<").append(preferredPrefix).append(":AddressStatus>").append(SDKUtil.escapeInvalidXmlCharsRegex(addressStatus.getValue()));
			sb.append("</").append(preferredPrefix).append(":AddressStatus>");
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
	
	public AddressType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Name", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.name = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Street1", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.street1 = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Street2", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.street2 = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CityName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.cityName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("StateOrProvince", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.stateOrProvince = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Country", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.country = CountryCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("CountryName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.countryName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Phone", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.phone = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PostalCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.postalCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AddressID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.addressID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AddressOwner", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.addressOwner = AddressOwnerCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ExternalAddressID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.externalAddressID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InternationalName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.internationalName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InternationalStateAndCity", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.internationalStateAndCity = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InternationalStreet", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.internationalStreet = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AddressStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.addressStatus = AddressStatusCodeType.fromValue(childNode.getTextContent());
		}
	}
 
}