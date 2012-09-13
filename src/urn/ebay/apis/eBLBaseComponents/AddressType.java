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


	/**
	 * Person's name associated with this address. Character length
	 * and limitations: 32 single-byte alphanumeric characters	 
	 */ 
	private String Name;

	/**
	 * First street address. Character length and limitations: 300
	 * single-byte alphanumeric characters	 
	 */ 
	private String Street1;

	/**
	 * Second street address. Character length and limitations: 300
	 * single-byte alphanumeric characters	 
	 */ 
	private String Street2;

	/**
	 * Name of city. Character length and limitations: 120
	 * single-byte alphanumeric characters	 
	 */ 
	private String CityName;

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
	private String StateOrProvince;

	/**
	 * ISO 3166 standard country code Character limit: Two
	 * single-byte characters. 	 
	 */ 
	private CountryCodeType Country;

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
	private String CountryName;

	/**
	 * Telephone number associated with this address	 
	 */ 
	private String Phone;

	/**
	 * 	 
	 */ 
	private String PostalCode;

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout,
	 * DoExpressCheckoutPayment, DoDirectPayment,
	 * CreateRecurringPaymentsProfile, or
	 * UpdateRecurringPaymentsProfile.	 
	 */ 
	private String AddressID;

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout,
	 * DoExpressCheckoutPayment, DoDirectPayment,
	 * CreateRecurringPaymentsProfile or
	 * UpdateRecurringPaymentsProfile.	 
	 */ 
	private AddressOwnerCodeType AddressOwner;

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout,
	 * DoExpressCheckoutPayment, DoDirectPayment,
	 * CreateRecurringPaymentsProfile or
	 * UpdateRecurringPaymentsProfile.	 
	 */ 
	private String ExternalAddressID;

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout,
	 * DoExpressCheckoutPayment, DoDirectPayment,
	 * CreateRecurringPaymentsProfile or
	 * UpdateRecurringPaymentsProfile.  Only applicable to
	 * SellerPaymentAddress today. Seller's international name that
	 * is associated with the payment address. 	 
	 */ 
	private String InternationalName;

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout,
	 * DoExpressCheckoutPayment, DoDirectPayment,
	 * CreateRecurringPaymentsProfile or
	 * UpdateRecurringPaymentsProfile. Only applicable to
	 * SellerPaymentAddress today. International state and city for
	 * the seller's payment address. 	 
	 */ 
	private String InternationalStateAndCity;

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout,
	 * DoExpressCheckoutPayment, DoDirectPayment,
	 * CreateRecurringPaymentsProfile or
	 * UpdateRecurringPaymentsProfile. Only applicable to
	 * SellerPaymentAddress today. Seller's international street
	 * address that is associated with the payment address. 	 
	 */ 
	private String InternationalStreet;

	/**
	 * Status of the address on file with PayPal. IMPORTANT: Do not
	 * set this element for SetExpressCheckout,
	 * DoExpressCheckoutPayment, DoDirectPayment,
	 * CreateRecurringPaymentsProfile or
	 * UpdateRecurringPaymentsProfile. 	 
	 */ 
	private AddressStatusCodeType AddressStatus;

	

	/**
	 * Default Constructor
	 */
	public AddressType (){
	}	

	/**
	 * Getter for Name
	 */
	 public String getName() {
	 	return Name;
	 }
	 
	/**
	 * Setter for Name
	 */
	 public void setName(String Name) {
	 	this.Name = Name;
	 }
	 
	/**
	 * Getter for Street1
	 */
	 public String getStreet1() {
	 	return Street1;
	 }
	 
	/**
	 * Setter for Street1
	 */
	 public void setStreet1(String Street1) {
	 	this.Street1 = Street1;
	 }
	 
	/**
	 * Getter for Street2
	 */
	 public String getStreet2() {
	 	return Street2;
	 }
	 
	/**
	 * Setter for Street2
	 */
	 public void setStreet2(String Street2) {
	 	this.Street2 = Street2;
	 }
	 
	/**
	 * Getter for CityName
	 */
	 public String getCityName() {
	 	return CityName;
	 }
	 
	/**
	 * Setter for CityName
	 */
	 public void setCityName(String CityName) {
	 	this.CityName = CityName;
	 }
	 
	/**
	 * Getter for StateOrProvince
	 */
	 public String getStateOrProvince() {
	 	return StateOrProvince;
	 }
	 
	/**
	 * Setter for StateOrProvince
	 */
	 public void setStateOrProvince(String StateOrProvince) {
	 	this.StateOrProvince = StateOrProvince;
	 }
	 
	/**
	 * Getter for Country
	 */
	 public CountryCodeType getCountry() {
	 	return Country;
	 }
	 
	/**
	 * Setter for Country
	 */
	 public void setCountry(CountryCodeType Country) {
	 	this.Country = Country;
	 }
	 
	/**
	 * Getter for CountryName
	 */
	 public String getCountryName() {
	 	return CountryName;
	 }
	 
	/**
	 * Setter for CountryName
	 */
	 public void setCountryName(String CountryName) {
	 	this.CountryName = CountryName;
	 }
	 
	/**
	 * Getter for Phone
	 */
	 public String getPhone() {
	 	return Phone;
	 }
	 
	/**
	 * Setter for Phone
	 */
	 public void setPhone(String Phone) {
	 	this.Phone = Phone;
	 }
	 
	/**
	 * Getter for PostalCode
	 */
	 public String getPostalCode() {
	 	return PostalCode;
	 }
	 
	/**
	 * Setter for PostalCode
	 */
	 public void setPostalCode(String PostalCode) {
	 	this.PostalCode = PostalCode;
	 }
	 
	/**
	 * Getter for AddressID
	 */
	 public String getAddressID() {
	 	return AddressID;
	 }
	 
	/**
	 * Setter for AddressID
	 */
	 public void setAddressID(String AddressID) {
	 	this.AddressID = AddressID;
	 }
	 
	/**
	 * Getter for AddressOwner
	 */
	 public AddressOwnerCodeType getAddressOwner() {
	 	return AddressOwner;
	 }
	 
	/**
	 * Setter for AddressOwner
	 */
	 public void setAddressOwner(AddressOwnerCodeType AddressOwner) {
	 	this.AddressOwner = AddressOwner;
	 }
	 
	/**
	 * Getter for ExternalAddressID
	 */
	 public String getExternalAddressID() {
	 	return ExternalAddressID;
	 }
	 
	/**
	 * Setter for ExternalAddressID
	 */
	 public void setExternalAddressID(String ExternalAddressID) {
	 	this.ExternalAddressID = ExternalAddressID;
	 }
	 
	/**
	 * Getter for InternationalName
	 */
	 public String getInternationalName() {
	 	return InternationalName;
	 }
	 
	/**
	 * Setter for InternationalName
	 */
	 public void setInternationalName(String InternationalName) {
	 	this.InternationalName = InternationalName;
	 }
	 
	/**
	 * Getter for InternationalStateAndCity
	 */
	 public String getInternationalStateAndCity() {
	 	return InternationalStateAndCity;
	 }
	 
	/**
	 * Setter for InternationalStateAndCity
	 */
	 public void setInternationalStateAndCity(String InternationalStateAndCity) {
	 	this.InternationalStateAndCity = InternationalStateAndCity;
	 }
	 
	/**
	 * Getter for InternationalStreet
	 */
	 public String getInternationalStreet() {
	 	return InternationalStreet;
	 }
	 
	/**
	 * Setter for InternationalStreet
	 */
	 public void setInternationalStreet(String InternationalStreet) {
	 	this.InternationalStreet = InternationalStreet;
	 }
	 
	/**
	 * Getter for AddressStatus
	 */
	 public AddressStatusCodeType getAddressStatus() {
	 	return AddressStatus;
	 }
	 
	/**
	 * Setter for AddressStatus
	 */
	 public void setAddressStatus(AddressStatusCodeType AddressStatus) {
	 	this.AddressStatus = AddressStatus;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Name != null) {
			sb.append("<ebl:Name>").append(SDKUtil.escapeInvalidXmlCharsRegex(Name));
			sb.append("</ebl:Name>");
		}
		if(Street1 != null) {
			sb.append("<ebl:Street1>").append(SDKUtil.escapeInvalidXmlCharsRegex(Street1));
			sb.append("</ebl:Street1>");
		}
		if(Street2 != null) {
			sb.append("<ebl:Street2>").append(SDKUtil.escapeInvalidXmlCharsRegex(Street2));
			sb.append("</ebl:Street2>");
		}
		if(CityName != null) {
			sb.append("<ebl:CityName>").append(SDKUtil.escapeInvalidXmlCharsRegex(CityName));
			sb.append("</ebl:CityName>");
		}
		if(StateOrProvince != null) {
			sb.append("<ebl:StateOrProvince>").append(SDKUtil.escapeInvalidXmlCharsRegex(StateOrProvince));
			sb.append("</ebl:StateOrProvince>");
		}
		if(Country != null) {
			sb.append("<ebl:Country>").append(SDKUtil.escapeInvalidXmlCharsRegex(Country.getValue()));
			sb.append("</ebl:Country>");
		}
		if(CountryName != null) {
			sb.append("<ebl:CountryName>").append(SDKUtil.escapeInvalidXmlCharsRegex(CountryName));
			sb.append("</ebl:CountryName>");
		}
		if(Phone != null) {
			sb.append("<ebl:Phone>").append(SDKUtil.escapeInvalidXmlCharsRegex(Phone));
			sb.append("</ebl:Phone>");
		}
		if(PostalCode != null) {
			sb.append("<ebl:PostalCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(PostalCode));
			sb.append("</ebl:PostalCode>");
		}
		if(AddressID != null) {
			sb.append("<ebl:AddressID>").append(SDKUtil.escapeInvalidXmlCharsRegex(AddressID));
			sb.append("</ebl:AddressID>");
		}
		if(AddressOwner != null) {
			sb.append("<ebl:AddressOwner>").append(SDKUtil.escapeInvalidXmlCharsRegex(AddressOwner.getValue()));
			sb.append("</ebl:AddressOwner>");
		}
		if(ExternalAddressID != null) {
			sb.append("<ebl:ExternalAddressID>").append(SDKUtil.escapeInvalidXmlCharsRegex(ExternalAddressID));
			sb.append("</ebl:ExternalAddressID>");
		}
		if(InternationalName != null) {
			sb.append("<ebl:InternationalName>").append(SDKUtil.escapeInvalidXmlCharsRegex(InternationalName));
			sb.append("</ebl:InternationalName>");
		}
		if(InternationalStateAndCity != null) {
			sb.append("<ebl:InternationalStateAndCity>").append(SDKUtil.escapeInvalidXmlCharsRegex(InternationalStateAndCity));
			sb.append("</ebl:InternationalStateAndCity>");
		}
		if(InternationalStreet != null) {
			sb.append("<ebl:InternationalStreet>").append(SDKUtil.escapeInvalidXmlCharsRegex(InternationalStreet));
			sb.append("</ebl:InternationalStreet>");
		}
		if(AddressStatus != null) {
			sb.append("<ebl:AddressStatus>").append(SDKUtil.escapeInvalidXmlCharsRegex(AddressStatus.getValue()));
			sb.append("</ebl:AddressStatus>");
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
		    this.Name = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Street1", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Street1 = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Street2", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Street2 = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CityName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CityName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("StateOrProvince", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.StateOrProvince = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Country", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Country = CountryCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("CountryName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CountryName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Phone", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Phone = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PostalCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PostalCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AddressID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AddressID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AddressOwner", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AddressOwner = AddressOwnerCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ExternalAddressID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ExternalAddressID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InternationalName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.InternationalName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InternationalStateAndCity", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.InternationalStateAndCity = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InternationalStreet", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.InternationalStreet = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AddressStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AddressStatus = AddressStatusCodeType.fromValue(childNode.getTextContent());
		}
	}
 
}