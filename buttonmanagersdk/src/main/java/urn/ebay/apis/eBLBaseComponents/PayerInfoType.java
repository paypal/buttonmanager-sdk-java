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

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Email address of payer Character length and limitations: 127
	 * single-byte characters	 
	 */ 
	private String payer;

	/**
	 * Unique customer ID Character length and limitations: 17
	 * single-byte characters	 
	 */ 
	private String payerID;

	/**
	 * Status of payer's email address 	 
	 */ 
	private PayPalUserStatusCodeType payerStatus;

	/**
	 * Name of payer 	 
	 */ 
	private PersonNameType payerName;

	/**
	 * Payment sender's country of residence using standard
	 * two-character ISO 3166 country codes. Character length and
	 * limitations: Two single-byte characters	 
	 */ 
	private CountryCodeType payerCountry;

	/**
	 * Payer's business name. Character length and limitations: 127
	 * single-byte characters	 
	 */ 
	private String payerBusiness;

	/**
	 * Payer's business address	 
	 */ 
	private AddressType address;

	/**
	 * Business contact telephone number	 
	 */ 
	private String contactPhone;

	/**
	 * Details about payer's tax info. Refer to the
	 * TaxIdDetailsType for more details. 	 
	 */ 
	private TaxIdDetailsType taxIdDetails;

	/**
	 * Holds any enhanced information about the payer	 
	 */ 
	private EnhancedPayerInfoType enhancedPayerInfo;

	

	/**
	 * Default Constructor
	 */
	public PayerInfoType (){
	}	

	/**
	 * Getter for payer
	 */
	 public String getPayer() {
	 	return payer;
	 }
	 
	/**
	 * Setter for payer
	 */
	 public void setPayer(String payer) {
	 	this.payer = payer;
	 }
	 
	/**
	 * Getter for payerID
	 */
	 public String getPayerID() {
	 	return payerID;
	 }
	 
	/**
	 * Setter for payerID
	 */
	 public void setPayerID(String payerID) {
	 	this.payerID = payerID;
	 }
	 
	/**
	 * Getter for payerStatus
	 */
	 public PayPalUserStatusCodeType getPayerStatus() {
	 	return payerStatus;
	 }
	 
	/**
	 * Setter for payerStatus
	 */
	 public void setPayerStatus(PayPalUserStatusCodeType payerStatus) {
	 	this.payerStatus = payerStatus;
	 }
	 
	/**
	 * Getter for payerName
	 */
	 public PersonNameType getPayerName() {
	 	return payerName;
	 }
	 
	/**
	 * Setter for payerName
	 */
	 public void setPayerName(PersonNameType payerName) {
	 	this.payerName = payerName;
	 }
	 
	/**
	 * Getter for payerCountry
	 */
	 public CountryCodeType getPayerCountry() {
	 	return payerCountry;
	 }
	 
	/**
	 * Setter for payerCountry
	 */
	 public void setPayerCountry(CountryCodeType payerCountry) {
	 	this.payerCountry = payerCountry;
	 }
	 
	/**
	 * Getter for payerBusiness
	 */
	 public String getPayerBusiness() {
	 	return payerBusiness;
	 }
	 
	/**
	 * Setter for payerBusiness
	 */
	 public void setPayerBusiness(String payerBusiness) {
	 	this.payerBusiness = payerBusiness;
	 }
	 
	/**
	 * Getter for address
	 */
	 public AddressType getAddress() {
	 	return address;
	 }
	 
	/**
	 * Setter for address
	 */
	 public void setAddress(AddressType address) {
	 	this.address = address;
	 }
	 
	/**
	 * Getter for contactPhone
	 */
	 public String getContactPhone() {
	 	return contactPhone;
	 }
	 
	/**
	 * Setter for contactPhone
	 */
	 public void setContactPhone(String contactPhone) {
	 	this.contactPhone = contactPhone;
	 }
	 
	/**
	 * Getter for taxIdDetails
	 */
	 public TaxIdDetailsType getTaxIdDetails() {
	 	return taxIdDetails;
	 }
	 
	/**
	 * Setter for taxIdDetails
	 */
	 public void setTaxIdDetails(TaxIdDetailsType taxIdDetails) {
	 	this.taxIdDetails = taxIdDetails;
	 }
	 
	/**
	 * Getter for enhancedPayerInfo
	 */
	 public EnhancedPayerInfoType getEnhancedPayerInfo() {
	 	return enhancedPayerInfo;
	 }
	 
	/**
	 * Setter for enhancedPayerInfo
	 */
	 public void setEnhancedPayerInfo(EnhancedPayerInfoType enhancedPayerInfo) {
	 	this.enhancedPayerInfo = enhancedPayerInfo;
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
		if(payer != null) {
			sb.append("<").append(preferredPrefix).append(":Payer>").append(SDKUtil.escapeInvalidXmlCharsRegex(payer));
			sb.append("</").append(preferredPrefix).append(":Payer>");
		}
		if(payerID != null) {
			sb.append("<").append(preferredPrefix).append(":PayerID>").append(SDKUtil.escapeInvalidXmlCharsRegex(payerID));
			sb.append("</").append(preferredPrefix).append(":PayerID>");
		}
		if(payerStatus != null) {
			sb.append("<").append(preferredPrefix).append(":PayerStatus>").append(SDKUtil.escapeInvalidXmlCharsRegex(payerStatus.getValue()));
			sb.append("</").append(preferredPrefix).append(":PayerStatus>");
		}
		if(payerName != null) {
			sb.append(payerName.toXMLString(preferredPrefix,"PayerName"));
		}
		if(payerCountry != null) {
			sb.append("<").append(preferredPrefix).append(":PayerCountry>").append(SDKUtil.escapeInvalidXmlCharsRegex(payerCountry.getValue()));
			sb.append("</").append(preferredPrefix).append(":PayerCountry>");
		}
		if(payerBusiness != null) {
			sb.append("<").append(preferredPrefix).append(":PayerBusiness>").append(SDKUtil.escapeInvalidXmlCharsRegex(payerBusiness));
			sb.append("</").append(preferredPrefix).append(":PayerBusiness>");
		}
		if(address != null) {
			sb.append(address.toXMLString(preferredPrefix,"Address"));
		}
		if(contactPhone != null) {
			sb.append("<").append(preferredPrefix).append(":ContactPhone>").append(SDKUtil.escapeInvalidXmlCharsRegex(contactPhone));
			sb.append("</").append(preferredPrefix).append(":ContactPhone>");
		}
		if(taxIdDetails != null) {
			sb.append(taxIdDetails.toXMLString(preferredPrefix,"TaxIdDetails"));
		}
		if(enhancedPayerInfo != null) {
			sb.append(enhancedPayerInfo.toXMLString(preferredPrefix,"EnhancedPayerInfo"));
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
	
	public PayerInfoType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Payer", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.payer = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayerID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.payerID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayerStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.payerStatus = PayPalUserStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PayerName", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.payerName =  new PersonNameType(childNode);
		}
		childNode = (Node) xpath.evaluate("PayerCountry", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.payerCountry = CountryCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PayerBusiness", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.payerBusiness = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Address", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.address =  new AddressType(childNode);
		}
		childNode = (Node) xpath.evaluate("ContactPhone", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.contactPhone = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TaxIdDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.taxIdDetails =  new TaxIdDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("EnhancedPayerInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.enhancedPayerInfo =  new EnhancedPayerInfoType(childNode);
		}
	}
 
}