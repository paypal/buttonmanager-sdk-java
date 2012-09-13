package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.GetExpressCheckoutDetailsResponseDetailsType;
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
public class GetExpressCheckoutDetailsResponseType extends AbstractResponseType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private GetExpressCheckoutDetailsResponseDetailsType GetExpressCheckoutDetailsResponseDetails;

	

	/**
	 * Default Constructor
	 */
	public GetExpressCheckoutDetailsResponseType (){
	}	

	/**
	 * Getter for GetExpressCheckoutDetailsResponseDetails
	 */
	 public GetExpressCheckoutDetailsResponseDetailsType getGetExpressCheckoutDetailsResponseDetails() {
	 	return GetExpressCheckoutDetailsResponseDetails;
	 }
	 
	/**
	 * Setter for GetExpressCheckoutDetailsResponseDetails
	 */
	 public void setGetExpressCheckoutDetailsResponseDetails(GetExpressCheckoutDetailsResponseDetailsType GetExpressCheckoutDetailsResponseDetails) {
	 	this.GetExpressCheckoutDetailsResponseDetails = GetExpressCheckoutDetailsResponseDetails;
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
	
	public GetExpressCheckoutDetailsResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("GetExpressCheckoutDetailsResponseDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.GetExpressCheckoutDetailsResponseDetails =  new GetExpressCheckoutDetailsResponseDetailsType(childNode);
		}
	}
 
}