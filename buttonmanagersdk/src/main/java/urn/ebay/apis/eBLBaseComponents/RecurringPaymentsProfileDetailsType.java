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

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Subscriber name - if missing, will use name in buyer's
	 * account 	 
	 */ 
	private String subscriberName;

	/**
	 * Subscriber address - if missing, will use address in buyer's
	 * account 	 
	 */ 
	private AddressType subscriberShippingAddress;

	/**
	 * When does this Profile begin billing? 	  
	 *@Required	 
	 */ 
	private String billingStartDate;

	/**
	 * Your own unique invoice or tracking number. Optional
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String profileReference;

	

	/**
	 * Constructor with arguments
	 */
	public RecurringPaymentsProfileDetailsType (String billingStartDate){
		this.billingStartDate = billingStartDate;
	}	

	/**
	 * Default Constructor
	 */
	public RecurringPaymentsProfileDetailsType (){
	}	

	/**
	 * Getter for subscriberName
	 */
	 public String getSubscriberName() {
	 	return subscriberName;
	 }
	 
	/**
	 * Setter for subscriberName
	 */
	 public void setSubscriberName(String subscriberName) {
	 	this.subscriberName = subscriberName;
	 }
	 
	/**
	 * Getter for subscriberShippingAddress
	 */
	 public AddressType getSubscriberShippingAddress() {
	 	return subscriberShippingAddress;
	 }
	 
	/**
	 * Setter for subscriberShippingAddress
	 */
	 public void setSubscriberShippingAddress(AddressType subscriberShippingAddress) {
	 	this.subscriberShippingAddress = subscriberShippingAddress;
	 }
	 
	/**
	 * Getter for billingStartDate
	 */
	 public String getBillingStartDate() {
	 	return billingStartDate;
	 }
	 
	/**
	 * Setter for billingStartDate
	 */
	 public void setBillingStartDate(String billingStartDate) {
	 	this.billingStartDate = billingStartDate;
	 }
	 
	/**
	 * Getter for profileReference
	 */
	 public String getProfileReference() {
	 	return profileReference;
	 }
	 
	/**
	 * Setter for profileReference
	 */
	 public void setProfileReference(String profileReference) {
	 	this.profileReference = profileReference;
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
		if(subscriberName != null) {
			sb.append("<").append(preferredPrefix).append(":SubscriberName>").append(SDKUtil.escapeInvalidXmlCharsRegex(subscriberName));
			sb.append("</").append(preferredPrefix).append(":SubscriberName>");
		}
		if(subscriberShippingAddress != null) {
			sb.append(subscriberShippingAddress.toXMLString(preferredPrefix,"SubscriberShippingAddress"));
		}
		if(billingStartDate != null) {
			sb.append("<").append(preferredPrefix).append(":BillingStartDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(billingStartDate));
			sb.append("</").append(preferredPrefix).append(":BillingStartDate>");
		}
		if(profileReference != null) {
			sb.append("<").append(preferredPrefix).append(":ProfileReference>").append(SDKUtil.escapeInvalidXmlCharsRegex(profileReference));
			sb.append("</").append(preferredPrefix).append(":ProfileReference>");
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
	
	public RecurringPaymentsProfileDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("SubscriberName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.subscriberName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SubscriberShippingAddress", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.subscriberShippingAddress =  new AddressType(childNode);
		}
		childNode = (Node) xpath.evaluate("BillingStartDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.billingStartDate = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProfileReference", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.profileReference = childNode.getTextContent();
		}
	
	}
 
}