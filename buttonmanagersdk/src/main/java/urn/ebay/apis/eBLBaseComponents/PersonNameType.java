package urn.ebay.apis.eBLBaseComponents;
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
 * 
 */
public class PersonNameType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private String salutation;

	/**
	 * 	 
	 */ 
	private String firstName;

	/**
	 * 	 
	 */ 
	private String middleName;

	/**
	 * 	 
	 */ 
	private String lastName;

	/**
	 * 	 
	 */ 
	private String suffix;

	

	/**
	 * Default Constructor
	 */
	public PersonNameType (){
	}	

	/**
	 * Getter for salutation
	 */
	 public String getSalutation() {
	 	return salutation;
	 }
	 
	/**
	 * Setter for salutation
	 */
	 public void setSalutation(String salutation) {
	 	this.salutation = salutation;
	 }
	 
	/**
	 * Getter for firstName
	 */
	 public String getFirstName() {
	 	return firstName;
	 }
	 
	/**
	 * Setter for firstName
	 */
	 public void setFirstName(String firstName) {
	 	this.firstName = firstName;
	 }
	 
	/**
	 * Getter for middleName
	 */
	 public String getMiddleName() {
	 	return middleName;
	 }
	 
	/**
	 * Setter for middleName
	 */
	 public void setMiddleName(String middleName) {
	 	this.middleName = middleName;
	 }
	 
	/**
	 * Getter for lastName
	 */
	 public String getLastName() {
	 	return lastName;
	 }
	 
	/**
	 * Setter for lastName
	 */
	 public void setLastName(String lastName) {
	 	this.lastName = lastName;
	 }
	 
	/**
	 * Getter for suffix
	 */
	 public String getSuffix() {
	 	return suffix;
	 }
	 
	/**
	 * Setter for suffix
	 */
	 public void setSuffix(String suffix) {
	 	this.suffix = suffix;
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
		if(salutation != null) {
			sb.append("<").append(preferredPrefix).append(":Salutation>").append(SDKUtil.escapeInvalidXmlCharsRegex(salutation));
			sb.append("</").append(preferredPrefix).append(":Salutation>");
		}
		if(firstName != null) {
			sb.append("<").append(preferredPrefix).append(":FirstName>").append(SDKUtil.escapeInvalidXmlCharsRegex(firstName));
			sb.append("</").append(preferredPrefix).append(":FirstName>");
		}
		if(middleName != null) {
			sb.append("<").append(preferredPrefix).append(":MiddleName>").append(SDKUtil.escapeInvalidXmlCharsRegex(middleName));
			sb.append("</").append(preferredPrefix).append(":MiddleName>");
		}
		if(lastName != null) {
			sb.append("<").append(preferredPrefix).append(":LastName>").append(SDKUtil.escapeInvalidXmlCharsRegex(lastName));
			sb.append("</").append(preferredPrefix).append(":LastName>");
		}
		if(suffix != null) {
			sb.append("<").append(preferredPrefix).append(":Suffix>").append(SDKUtil.escapeInvalidXmlCharsRegex(suffix));
			sb.append("</").append(preferredPrefix).append(":Suffix>");
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
	
	public PersonNameType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Salutation", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.salutation = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("FirstName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.firstName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("MiddleName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.middleName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("LastName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.lastName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Suffix", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.suffix = childNode.getTextContent();
		}
	
	}
 
}