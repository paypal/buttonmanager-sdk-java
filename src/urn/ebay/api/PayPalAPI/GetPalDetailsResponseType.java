package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractResponseType;
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
public class GetPalDetailsResponseType extends AbstractResponseType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private String Pal;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String Locale;

	

	/**
	 * Default Constructor
	 */
	public GetPalDetailsResponseType (){
	}	

	/**
	 * Getter for Pal
	 */
	 public String getPal() {
	 	return Pal;
	 }
	 
	/**
	 * Setter for Pal
	 */
	 public void setPal(String Pal) {
	 	this.Pal = Pal;
	 }
	 
	/**
	 * Getter for Locale
	 */
	 public String getLocale() {
	 	return Locale;
	 }
	 
	/**
	 * Setter for Locale
	 */
	 public void setLocale(String Locale) {
	 	this.Locale = Locale;
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
	
	public GetPalDetailsResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Pal", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Pal = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Locale", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Locale = childNode.getTextContent();
		}
	
	}
 
}