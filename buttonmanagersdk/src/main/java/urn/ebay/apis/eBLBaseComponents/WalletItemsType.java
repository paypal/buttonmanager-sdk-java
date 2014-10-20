package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.WalletItemType;
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
 * Details about an Item stored in the PayPal Wallet. 
 */
public class WalletItemsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * (Optional)Identifies a wallet item of a given type. The
	 * format varies depending on the type. 	 
	 */ 
	private WalletItemType type;

	/**
	 * (Optional)Uniquely identifies a wallet item of given type.
	 * Format varies depending on the type. Character length and
	 * limitations: 64 single-byte characters maximum. 	 
	 */ 
	private String id;

	/**
	 * (Optional)Description of wallet item. Character length and
	 * limitations: 512 single-byte characters maximum. 	 
	 */ 
	private String description;

	

	/**
	 * Default Constructor
	 */
	public WalletItemsType (){
	}	

	/**
	 * Getter for type
	 */
	 public WalletItemType getType() {
	 	return type;
	 }
	 
	/**
	 * Setter for type
	 */
	 public void setType(WalletItemType type) {
	 	this.type = type;
	 }
	 
	/**
	 * Getter for id
	 */
	 public String getId() {
	 	return id;
	 }
	 
	/**
	 * Setter for id
	 */
	 public void setId(String id) {
	 	this.id = id;
	 }
	 
	/**
	 * Getter for description
	 */
	 public String getDescription() {
	 	return description;
	 }
	 
	/**
	 * Setter for description
	 */
	 public void setDescription(String description) {
	 	this.description = description;
	 }
	 


	public String toXMLString(String prefix, String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(type != null) {
			sb.append("<").append(preferredPrefix).append(":Type>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.type.getValue()));
			sb.append("</").append(preferredPrefix).append(":Type>");
		}
		if(id != null) {
			sb.append("<").append(preferredPrefix).append(":Id>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.id));
			sb.append("</").append(preferredPrefix).append(":Id>");
		}
		if(description != null) {
			sb.append("<").append(preferredPrefix).append(":Description>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.description));
			sb.append("</").append(preferredPrefix).append(":Description>");
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
	
	public WalletItemsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Type", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.type = WalletItemType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("Id", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.id = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Description", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.description = childNode.getTextContent();
		}
	
	}
 
}