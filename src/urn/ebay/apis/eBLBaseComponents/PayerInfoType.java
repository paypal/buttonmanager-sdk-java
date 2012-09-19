package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PayPalUserStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.PersonNameType;
import urn.ebay.apis.eBLBaseComponents.CountryCodeType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.TaxIdDetailsType;
import urn.ebay.apis.EnhancedDataTypes.EnhancedPayerInfoType;
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
 * PayerInfoType Payer information 
 */
public class PayerInfoType{


	/**
	 * Email address of payer Character length and limitations: 127
	 * single-byte characters	 
	 */ 
	private String Payer;

	/**
	 * Unique customer ID Character length and limitations: 17
	 * single-byte characters	 
	 */ 
	private String PayerID;

	/**
	 * Status of payer's email address 	 
	 */ 
	private PayPalUserStatusCodeType PayerStatus;

	/**
	 * Name of payer 	 
	 */ 
	private PersonNameType PayerName;

	/**
	 * Payment sender's country of residence using standard
	 * two-character ISO 3166 country codes. Character length and
	 * limitations: Two single-byte characters	 
	 */ 
	private CountryCodeType PayerCountry;

	/**
	 * Payer's business name. Character length and limitations: 127
	 * single-byte characters	 
	 */ 
	private String PayerBusiness;

	/**
	 * Payer's business address	 
	 */ 
	private AddressType Address;

	/**
	 * Business contact telephone number	 
	 */ 
	private String ContactPhone;

	/**
	 * Details about payer's tax info. Refer to the
	 * TaxIdDetailsType for more details. 	 
	 */ 
	private TaxIdDetailsType TaxIdDetails;

	/**
	 * Holds any enhanced information about the payer	 
	 */ 
	private EnhancedPayerInfoType EnhancedPayerInfo;

	

	/**
	 * Default Constructor
	 */
	public PayerInfoType (){
	}	

	/**
	 * Getter for Payer
	 */
	 public String getPayer() {
	 	return Payer;
	 }
	 
	/**
	 * Setter for Payer
	 */
	 public void setPayer(String Payer) {
	 	this.Payer = Payer;
	 }
	 
	/**
	 * Getter for PayerID
	 */
	 public String getPayerID() {
	 	return PayerID;
	 }
	 
	/**
	 * Setter for PayerID
	 */
	 public void setPayerID(String PayerID) {
	 	this.PayerID = PayerID;
	 }
	 
	/**
	 * Getter for PayerStatus
	 */
	 public PayPalUserStatusCodeType getPayerStatus() {
	 	return PayerStatus;
	 }
	 
	/**
	 * Setter for PayerStatus
	 */
	 public void setPayerStatus(PayPalUserStatusCodeType PayerStatus) {
	 	this.PayerStatus = PayerStatus;
	 }
	 
	/**
	 * Getter for PayerName
	 */
	 public PersonNameType getPayerName() {
	 	return PayerName;
	 }
	 
	/**
	 * Setter for PayerName
	 */
	 public void setPayerName(PersonNameType PayerName) {
	 	this.PayerName = PayerName;
	 }
	 
	/**
	 * Getter for PayerCountry
	 */
	 public CountryCodeType getPayerCountry() {
	 	return PayerCountry;
	 }
	 
	/**
	 * Setter for PayerCountry
	 */
	 public void setPayerCountry(CountryCodeType PayerCountry) {
	 	this.PayerCountry = PayerCountry;
	 }
	 
	/**
	 * Getter for PayerBusiness
	 */
	 public String getPayerBusiness() {
	 	return PayerBusiness;
	 }
	 
	/**
	 * Setter for PayerBusiness
	 */
	 public void setPayerBusiness(String PayerBusiness) {
	 	this.PayerBusiness = PayerBusiness;
	 }
	 
	/**
	 * Getter for Address
	 */
	 public AddressType getAddress() {
	 	return Address;
	 }
	 
	/**
	 * Setter for Address
	 */
	 public void setAddress(AddressType Address) {
	 	this.Address = Address;
	 }
	 
	/**
	 * Getter for ContactPhone
	 */
	 public String getContactPhone() {
	 	return ContactPhone;
	 }
	 
	/**
	 * Setter for ContactPhone
	 */
	 public void setContactPhone(String ContactPhone) {
	 	this.ContactPhone = ContactPhone;
	 }
	 
	/**
	 * Getter for TaxIdDetails
	 */
	 public TaxIdDetailsType getTaxIdDetails() {
	 	return TaxIdDetails;
	 }
	 
	/**
	 * Setter for TaxIdDetails
	 */
	 public void setTaxIdDetails(TaxIdDetailsType TaxIdDetails) {
	 	this.TaxIdDetails = TaxIdDetails;
	 }
	 
	/**
	 * Getter for EnhancedPayerInfo
	 */
	 public EnhancedPayerInfoType getEnhancedPayerInfo() {
	 	return EnhancedPayerInfo;
	 }
	 
	/**
	 * Setter for EnhancedPayerInfo
	 */
	 public void setEnhancedPayerInfo(EnhancedPayerInfoType EnhancedPayerInfo) {
	 	this.EnhancedPayerInfo = EnhancedPayerInfo;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Payer != null) {
			sb.append("<ebl:Payer>").append(SDKUtil.escapeInvalidXmlCharsRegex(Payer));
			sb.append("</ebl:Payer>");
		}
		if(PayerID != null) {
			sb.append("<ebl:PayerID>").append(SDKUtil.escapeInvalidXmlCharsRegex(PayerID));
			sb.append("</ebl:PayerID>");
		}
		if(PayerStatus != null) {
			sb.append("<ebl:PayerStatus>").append(SDKUtil.escapeInvalidXmlCharsRegex(PayerStatus.getValue()));
			sb.append("</ebl:PayerStatus>");
		}
		if(PayerName != null) {
			sb.append("<ebl:PayerName>");
			sb.append(PayerName.toXMLString());
			sb.append("</ebl:PayerName>");
		}
		if(PayerCountry != null) {
			sb.append("<ebl:PayerCountry>").append(SDKUtil.escapeInvalidXmlCharsRegex(PayerCountry.getValue()));
			sb.append("</ebl:PayerCountry>");
		}
		if(PayerBusiness != null) {
			sb.append("<ebl:PayerBusiness>").append(SDKUtil.escapeInvalidXmlCharsRegex(PayerBusiness));
			sb.append("</ebl:PayerBusiness>");
		}
		if(Address != null) {
			sb.append("<ebl:Address>");
			sb.append(Address.toXMLString());
			sb.append("</ebl:Address>");
		}
		if(ContactPhone != null) {
			sb.append("<ebl:ContactPhone>").append(SDKUtil.escapeInvalidXmlCharsRegex(ContactPhone));
			sb.append("</ebl:ContactPhone>");
		}
		if(TaxIdDetails != null) {
			sb.append("<ebl:TaxIdDetails>");
			sb.append(TaxIdDetails.toXMLString());
			sb.append("</ebl:TaxIdDetails>");
		}
		if(EnhancedPayerInfo != null) {
			sb.append("<ebl:EnhancedPayerInfo>");
			sb.append(EnhancedPayerInfo.toXMLString());
			sb.append("</ebl:EnhancedPayerInfo>");
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
	
	public PayerInfoType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Payer", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Payer = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayerID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PayerID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayerStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PayerStatus = PayPalUserStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PayerName", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PayerName =  new PersonNameType(childNode);
		}
		childNode = (Node) xpath.evaluate("PayerCountry", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PayerCountry = CountryCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PayerBusiness", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PayerBusiness = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Address", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Address =  new AddressType(childNode);
		}
		childNode = (Node) xpath.evaluate("ContactPhone", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ContactPhone = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TaxIdDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TaxIdDetails =  new TaxIdDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("EnhancedPayerInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.EnhancedPayerInfo =  new EnhancedPayerInfoType(childNode);
		}
	}
 
}