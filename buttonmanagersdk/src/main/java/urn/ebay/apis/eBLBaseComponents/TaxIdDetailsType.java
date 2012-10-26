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

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * The payer's Tax ID type; CNPJ/CPF for BR country. 	 
	 */ 
	private String taxIdType;

	/**
	 * The payer's Tax ID 	 
	 */ 
	private String taxId;

	

	/**
	 * Default Constructor
	 */
	public TaxIdDetailsType (){
	}	

	/**
	 * Getter for taxIdType
	 */
	 public String getTaxIdType() {
	 	return taxIdType;
	 }
	 
	/**
	 * Setter for taxIdType
	 */
	 public void setTaxIdType(String taxIdType) {
	 	this.taxIdType = taxIdType;
	 }
	 
	/**
	 * Getter for taxId
	 */
	 public String getTaxId() {
	 	return taxId;
	 }
	 
	/**
	 * Setter for taxId
	 */
	 public void setTaxId(String taxId) {
	 	this.taxId = taxId;
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
		if(taxIdType != null) {
			sb.append("<").append(preferredPrefix).append(":TaxIdType>").append(SDKUtil.escapeInvalidXmlCharsRegex(taxIdType));
			sb.append("</").append(preferredPrefix).append(":TaxIdType>");
		}
		if(taxId != null) {
			sb.append("<").append(preferredPrefix).append(":TaxId>").append(SDKUtil.escapeInvalidXmlCharsRegex(taxId));
			sb.append("</").append(preferredPrefix).append(":TaxId>");
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
	
	public TaxIdDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("TaxIdType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.taxIdType = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TaxId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.taxId = childNode.getTextContent();
		}
	
	}
 
}