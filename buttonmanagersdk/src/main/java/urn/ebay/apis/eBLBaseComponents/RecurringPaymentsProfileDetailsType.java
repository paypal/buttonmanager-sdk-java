package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.AddressType;
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
 * Subscriber name - if missing, will use name in buyer's
 * account 
 */
public class RecurringPaymentsProfileDetailsType{


	/**
	 * Subscriber name - if missing, will use name in buyer's
	 * account 	 
	 */ 
	private String SubscriberName;

	/**
	 * Subscriber address - if missing, will use address in buyer's
	 * account 	 
	 */ 
	private AddressType SubscriberShippingAddress;

	/**
	 * When does this Profile begin billing? 	  
	 *@Required	 
	 */ 
	private String BillingStartDate;

	/**
	 * Your own unique invoice or tracking number. Optional
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String ProfileReference;

	

	/**
	 * Constructor with arguments
	 */
	public RecurringPaymentsProfileDetailsType (String BillingStartDate){
		this.BillingStartDate = BillingStartDate;
	}	

	/**
	 * Default Constructor
	 */
	public RecurringPaymentsProfileDetailsType (){
	}	

	/**
	 * Getter for SubscriberName
	 */
	 public String getSubscriberName() {
	 	return SubscriberName;
	 }
	 
	/**
	 * Setter for SubscriberName
	 */
	 public void setSubscriberName(String SubscriberName) {
	 	this.SubscriberName = SubscriberName;
	 }
	 
	/**
	 * Getter for SubscriberShippingAddress
	 */
	 public AddressType getSubscriberShippingAddress() {
	 	return SubscriberShippingAddress;
	 }
	 
	/**
	 * Setter for SubscriberShippingAddress
	 */
	 public void setSubscriberShippingAddress(AddressType SubscriberShippingAddress) {
	 	this.SubscriberShippingAddress = SubscriberShippingAddress;
	 }
	 
	/**
	 * Getter for BillingStartDate
	 */
	 public String getBillingStartDate() {
	 	return BillingStartDate;
	 }
	 
	/**
	 * Setter for BillingStartDate
	 */
	 public void setBillingStartDate(String BillingStartDate) {
	 	this.BillingStartDate = BillingStartDate;
	 }
	 
	/**
	 * Getter for ProfileReference
	 */
	 public String getProfileReference() {
	 	return ProfileReference;
	 }
	 
	/**
	 * Setter for ProfileReference
	 */
	 public void setProfileReference(String ProfileReference) {
	 	this.ProfileReference = ProfileReference;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(SubscriberName != null) {
			sb.append("<ebl:SubscriberName>").append(SDKUtil.escapeInvalidXmlCharsRegex(SubscriberName));
			sb.append("</ebl:SubscriberName>");
		}
		if(SubscriberShippingAddress != null) {
			sb.append("<ebl:SubscriberShippingAddress>");
			sb.append(SubscriberShippingAddress.toXMLString());
			sb.append("</ebl:SubscriberShippingAddress>");
		}
		if(BillingStartDate != null) {
			sb.append("<ebl:BillingStartDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(BillingStartDate));
			sb.append("</ebl:BillingStartDate>");
		}
		if(ProfileReference != null) {
			sb.append("<ebl:ProfileReference>").append(SDKUtil.escapeInvalidXmlCharsRegex(ProfileReference));
			sb.append("</ebl:ProfileReference>");
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
	
	public RecurringPaymentsProfileDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("SubscriberName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SubscriberName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SubscriberShippingAddress", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SubscriberShippingAddress =  new AddressType(childNode);
		}
		childNode = (Node) xpath.evaluate("BillingStartDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.BillingStartDate = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProfileReference", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ProfileReference = childNode.getTextContent();
		}
	
	}
 
}