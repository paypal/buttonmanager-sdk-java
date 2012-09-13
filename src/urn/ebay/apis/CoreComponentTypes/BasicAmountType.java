package urn.ebay.apis.CoreComponentTypes;
import urn.ebay.apis.eBLBaseComponents.CurrencyCodeType;
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
 * On requests, you must set the currencyID attribute to one of
 * the three-character currency codes for any of the supported
 * PayPal currencies. Limitations: Must not exceed $10,000 USD
 * in any currency. No currency symbol. Decimal separator must
 * be a period (.), and the thousands separator must be a comma
 * (,).
 */
public class BasicAmountType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private CurrencyCodeType currencyID;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String value;

	

	/**
	 * Constructor with arguments
	 */
	public BasicAmountType (CurrencyCodeType currencyID, String value){
		this.currencyID = currencyID;
		this.value = value;
	}	

	/**
	 * Default Constructor
	 */
	public BasicAmountType (){
	}	

	/**
	 * Getter for currencyID
	 */
	 public CurrencyCodeType getCurrencyID() {
	 	return currencyID;
	 }
	 
	/**
	 * Setter for currencyID
	 */
	 public void setCurrencyID(CurrencyCodeType currencyID) {
	 	this.currencyID = currencyID;
	 }
	 
	/**
	 * Getter for value
	 */
	 public String getValue() {
	 	return value;
	 }
	 
	/**
	 * Setter for value
	 */
	 public void setValue(String value) {
	 	this.value = value;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(currencyID != null) {
			sb.append(" currencyID=\"").append(SDKUtil.escapeInvalidXmlCharsRegex(currencyID.getValue())).append("\">");
		}
		if(value != null) {
			sb.append(SDKUtil.escapeInvalidXmlCharsRegex(value));
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
	
	public BasicAmountType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("@currencyID", node, XPathConstants.NODE);
		if (childNode != null) {
		    this.currencyID = CurrencyCodeType.fromValue(childNode.getNodeValue());
		}
		this.value = node.getTextContent();
	
	
	}
 
}