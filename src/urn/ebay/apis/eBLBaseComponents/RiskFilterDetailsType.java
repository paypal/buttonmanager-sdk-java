package urn.ebay.apis.eBLBaseComponents;
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
 * Details of Risk Filter. 
 */
public class RiskFilterDetailsType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private Integer Id;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String Name;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String Description;

	

	/**
	 * Default Constructor
	 */
	public RiskFilterDetailsType (){
	}	

	/**
	 * Getter for Id
	 */
	 public Integer getId() {
	 	return Id;
	 }
	 
	/**
	 * Setter for Id
	 */
	 public void setId(Integer Id) {
	 	this.Id = Id;
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
	 * Getter for Description
	 */
	 public String getDescription() {
	 	return Description;
	 }
	 
	/**
	 * Setter for Description
	 */
	 public void setDescription(String Description) {
	 	this.Description = Description;
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
	
	public RiskFilterDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Id", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.Id = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("Name", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Name = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Description", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Description = childNode.getTextContent();
		}
	
	}
 
}