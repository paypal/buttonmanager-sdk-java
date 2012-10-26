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
 * 3DS remaining fields. 
 */
public class ThreeDSecureResponseType{


	/**
	 * 	 
	 */ 
	private String vpas;

	/**
	 * 	 
	 */ 
	private String eciSubmitted3DS;

	

	/**
	 * Default Constructor
	 */
	public ThreeDSecureResponseType (){
	}	

	/**
	 * Getter for vpas
	 */
	 public String getVpas() {
	 	return vpas;
	 }
	 
	/**
	 * Setter for vpas
	 */
	 public void setVpas(String vpas) {
	 	this.vpas = vpas;
	 }
	 
	/**
	 * Getter for eciSubmitted3DS
	 */
	 public String getEciSubmitted3DS() {
	 	return eciSubmitted3DS;
	 }
	 
	/**
	 * Setter for eciSubmitted3DS
	 */
	 public void setEciSubmitted3DS(String eciSubmitted3DS) {
	 	this.eciSubmitted3DS = eciSubmitted3DS;
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
	
	public ThreeDSecureResponseType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Vpas", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.vpas = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("EciSubmitted3DS", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.eciSubmitted3DS = childNode.getTextContent();
		}
	
	}
 
}