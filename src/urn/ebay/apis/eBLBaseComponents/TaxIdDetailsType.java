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
 * Details about the payer's tax info passed in by the merchant
 * or partner. Optional. 
 */
public class TaxIdDetailsType{


	/**
	 * The payer's Tax ID type; CNPJ/CPF for BR country. 	 
	 */ 
	private String TaxIdType;

	/**
	 * The payer's Tax ID 	 
	 */ 
	private String TaxId;

	

	/**
	 * Default Constructor
	 */
	public TaxIdDetailsType (){
	}	

	/**
	 * Getter for TaxIdType
	 */
	 public String getTaxIdType() {
	 	return TaxIdType;
	 }
	 
	/**
	 * Setter for TaxIdType
	 */
	 public void setTaxIdType(String TaxIdType) {
	 	this.TaxIdType = TaxIdType;
	 }
	 
	/**
	 * Getter for TaxId
	 */
	 public String getTaxId() {
	 	return TaxId;
	 }
	 
	/**
	 * Setter for TaxId
	 */
	 public void setTaxId(String TaxId) {
	 	this.TaxId = TaxId;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(TaxIdType != null) {
			sb.append("<ebl:TaxIdType>").append(SDKUtil.escapeInvalidXmlCharsRegex(TaxIdType));
			sb.append("</ebl:TaxIdType>");
		}
		if(TaxId != null) {
			sb.append("<ebl:TaxId>").append(SDKUtil.escapeInvalidXmlCharsRegex(TaxId));
			sb.append("</ebl:TaxId>");
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
	
	public TaxIdDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("TaxIdType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TaxIdType = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TaxId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TaxId = childNode.getTextContent();
		}
	
	}
 
}