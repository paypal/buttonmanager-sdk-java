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


	/**
	 * UATP Card Number	 
	 */ 
	private String UATPNumber;

	/**
	 * UATP Card expirty month	 
	 */ 
	private Integer ExpMonth;

	/**
	 * UATP Card expirty year	 
	 */ 
	private Integer ExpYear;

	

	/**
	 * Default Constructor
	 */
	public UATPDetailsType (){
	}	

	/**
	 * Getter for UATPNumber
	 */
	 public String getUATPNumber() {
	 	return UATPNumber;
	 }
	 
	/**
	 * Setter for UATPNumber
	 */
	 public void setUATPNumber(String UATPNumber) {
	 	this.UATPNumber = UATPNumber;
	 }
	 
	/**
	 * Getter for ExpMonth
	 */
	 public Integer getExpMonth() {
	 	return ExpMonth;
	 }
	 
	/**
	 * Setter for ExpMonth
	 */
	 public void setExpMonth(Integer ExpMonth) {
	 	this.ExpMonth = ExpMonth;
	 }
	 
	/**
	 * Getter for ExpYear
	 */
	 public Integer getExpYear() {
	 	return ExpYear;
	 }
	 
	/**
	 * Setter for ExpYear
	 */
	 public void setExpYear(Integer ExpYear) {
	 	this.ExpYear = ExpYear;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(UATPNumber != null) {
			sb.append("<ebl:UATPNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(UATPNumber));
			sb.append("</ebl:UATPNumber>");
		}
		if(ExpMonth != null) {
			sb.append("<ebl:ExpMonth>").append(SDKUtil.escapeInvalidXmlCharsRegex(ExpMonth));
			sb.append("</ebl:ExpMonth>");
		}
		if(ExpYear != null) {
			sb.append("<ebl:ExpYear>").append(SDKUtil.escapeInvalidXmlCharsRegex(ExpYear));
			sb.append("</ebl:ExpYear>");
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
		    this.UATPNumber = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ExpMonth", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.ExpMonth = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("ExpYear", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.ExpYear = Integer.valueOf(childNode.getTextContent());
		}
	
	}
 
}