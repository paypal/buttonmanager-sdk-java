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


	/**
	 * 	 
	 */ 
	private String Salutation;

	/**
	 * 	 
	 */ 
	private String FirstName;

	/**
	 * 	 
	 */ 
	private String MiddleName;

	/**
	 * 	 
	 */ 
	private String LastName;

	/**
	 * 	 
	 */ 
	private String Suffix;

	

	/**
	 * Default Constructor
	 */
	public PersonNameType (){
	}	

	/**
	 * Getter for Salutation
	 */
	 public String getSalutation() {
	 	return Salutation;
	 }
	 
	/**
	 * Setter for Salutation
	 */
	 public void setSalutation(String Salutation) {
	 	this.Salutation = Salutation;
	 }
	 
	/**
	 * Getter for FirstName
	 */
	 public String getFirstName() {
	 	return FirstName;
	 }
	 
	/**
	 * Setter for FirstName
	 */
	 public void setFirstName(String FirstName) {
	 	this.FirstName = FirstName;
	 }
	 
	/**
	 * Getter for MiddleName
	 */
	 public String getMiddleName() {
	 	return MiddleName;
	 }
	 
	/**
	 * Setter for MiddleName
	 */
	 public void setMiddleName(String MiddleName) {
	 	this.MiddleName = MiddleName;
	 }
	 
	/**
	 * Getter for LastName
	 */
	 public String getLastName() {
	 	return LastName;
	 }
	 
	/**
	 * Setter for LastName
	 */
	 public void setLastName(String LastName) {
	 	this.LastName = LastName;
	 }
	 
	/**
	 * Getter for Suffix
	 */
	 public String getSuffix() {
	 	return Suffix;
	 }
	 
	/**
	 * Setter for Suffix
	 */
	 public void setSuffix(String Suffix) {
	 	this.Suffix = Suffix;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Salutation != null) {
			sb.append("<ebl:Salutation>").append(SDKUtil.escapeInvalidXmlCharsRegex(Salutation));
			sb.append("</ebl:Salutation>");
		}
		if(FirstName != null) {
			sb.append("<ebl:FirstName>").append(SDKUtil.escapeInvalidXmlCharsRegex(FirstName));
			sb.append("</ebl:FirstName>");
		}
		if(MiddleName != null) {
			sb.append("<ebl:MiddleName>").append(SDKUtil.escapeInvalidXmlCharsRegex(MiddleName));
			sb.append("</ebl:MiddleName>");
		}
		if(LastName != null) {
			sb.append("<ebl:LastName>").append(SDKUtil.escapeInvalidXmlCharsRegex(LastName));
			sb.append("</ebl:LastName>");
		}
		if(Suffix != null) {
			sb.append("<ebl:Suffix>").append(SDKUtil.escapeInvalidXmlCharsRegex(Suffix));
			sb.append("</ebl:Suffix>");
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
		    this.Salutation = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("FirstName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.FirstName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("MiddleName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.MiddleName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("LastName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.LastName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Suffix", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Suffix = childNode.getTextContent();
		}
	
	}
 
}