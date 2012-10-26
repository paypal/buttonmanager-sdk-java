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
 * UATP Card Details Type 
 */
public class UATPDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * UATP Card Number	 
	 */ 
	private String uATPNumber;

	/**
	 * UATP Card expirty month	 
	 */ 
	private Integer expMonth;

	/**
	 * UATP Card expirty year	 
	 */ 
	private Integer expYear;

	

	/**
	 * Default Constructor
	 */
	public UATPDetailsType (){
	}	

	/**
	 * Getter for uATPNumber
	 */
	 public String getUATPNumber() {
	 	return uATPNumber;
	 }
	 
	/**
	 * Setter for uATPNumber
	 */
	 public void setUATPNumber(String uATPNumber) {
	 	this.uATPNumber = uATPNumber;
	 }
	 
	/**
	 * Getter for expMonth
	 */
	 public Integer getExpMonth() {
	 	return expMonth;
	 }
	 
	/**
	 * Setter for expMonth
	 */
	 public void setExpMonth(Integer expMonth) {
	 	this.expMonth = expMonth;
	 }
	 
	/**
	 * Getter for expYear
	 */
	 public Integer getExpYear() {
	 	return expYear;
	 }
	 
	/**
	 * Setter for expYear
	 */
	 public void setExpYear(Integer expYear) {
	 	this.expYear = expYear;
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
		if(uATPNumber != null) {
			sb.append("<").append(preferredPrefix).append(":UATPNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(uATPNumber));
			sb.append("</").append(preferredPrefix).append(":UATPNumber>");
		}
		if(expMonth != null) {
			sb.append("<").append(preferredPrefix).append(":ExpMonth>").append(SDKUtil.escapeInvalidXmlCharsRegex(expMonth));
			sb.append("</").append(preferredPrefix).append(":ExpMonth>");
		}
		if(expYear != null) {
			sb.append("<").append(preferredPrefix).append(":ExpYear>").append(SDKUtil.escapeInvalidXmlCharsRegex(expYear));
			sb.append("</").append(preferredPrefix).append(":ExpYear>");
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
	
	public UATPDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("UATPNumber", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.uATPNumber = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ExpMonth", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.expMonth = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("ExpYear", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.expYear = Integer.valueOf(childNode.getTextContent());
		}
	
	}
 
}