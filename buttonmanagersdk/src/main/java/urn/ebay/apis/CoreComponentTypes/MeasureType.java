package urn.ebay.apis.CoreComponentTypes;
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
public class MeasureType{

	private static final String nameSpace="urn:ebay:apis:CoreComponentTypes";
	private static final String preferredPrefix="cc";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String unit;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private Double value;

	

	/**
	 * Constructor with arguments
	 */
	public MeasureType (String unit, Double value){
		this.unit = unit;
		this.value = value;
	}	

	/**
	 * Default Constructor
	 */
	public MeasureType (){
	}	

	/**
	 * Getter for unit
	 */
	 public String getUnit() {
	 	return unit;
	 }
	 
	/**
	 * Setter for unit
	 */
	 public void setUnit(String unit) {
	 	this.unit = unit;
	 }
	 
	/**
	 * Getter for value
	 */
	 public Double getValue() {
	 	return value;
	 }
	 
	/**
	 * Setter for value
	 */
	 public void setValue(Double value) {
	 	this.value = value;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name);
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name);
			}
		sb.append(getAttributeAsXml());
		sb.append(">");
		}
		if(value != null) {
			sb.append(SDKUtil.escapeInvalidXmlCharsRegex(value));
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

	
	private String getAttributeAsXml() {
		StringBuilder sb = new StringBuilder();
		if(unit != null) {
			sb.append(" unit=\"").append(SDKUtil.escapeInvalidXmlCharsRegex(unit)).append("\"");	
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
	
	public MeasureType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("unit", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.unit = childNode.getTextContent();
		}
	
		this.value = Double.valueOf(node.getTextContent());
	
	
	}
 
}