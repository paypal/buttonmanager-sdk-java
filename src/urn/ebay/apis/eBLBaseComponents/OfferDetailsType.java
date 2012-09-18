package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BMLOfferInfoType;
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
 * OfferDetailsType Specific information for an offer. 
 */
public class OfferDetailsType{


	/**
	 * Code used to identify the promotion offer. 	 
	 */ 
	private String OfferCode;

	/**
	 * Specific infromation for BML, Similar structure could be
	 * added for sepcific  promotion needs like CrossPromotions 	 
	 */ 
	private BMLOfferInfoType BMLOfferInfo;

	

	/**
	 * Default Constructor
	 */
	public OfferDetailsType (){
	}	

	/**
	 * Getter for OfferCode
	 */
	 public String getOfferCode() {
	 	return OfferCode;
	 }
	 
	/**
	 * Setter for OfferCode
	 */
	 public void setOfferCode(String OfferCode) {
	 	this.OfferCode = OfferCode;
	 }
	 
	/**
	 * Getter for BMLOfferInfo
	 */
	 public BMLOfferInfoType getBMLOfferInfo() {
	 	return BMLOfferInfo;
	 }
	 
	/**
	 * Setter for BMLOfferInfo
	 */
	 public void setBMLOfferInfo(BMLOfferInfoType BMLOfferInfo) {
	 	this.BMLOfferInfo = BMLOfferInfo;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(OfferCode != null) {
			sb.append("<ebl:OfferCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(OfferCode));
			sb.append("</ebl:OfferCode>");
		}
		if(BMLOfferInfo != null) {
			sb.append("<ebl:BMLOfferInfo>");
			sb.append(BMLOfferInfo.toXMLString());
			sb.append("</ebl:BMLOfferInfo>");
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
	
	public OfferDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("OfferCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OfferCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BMLOfferInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.BMLOfferInfo =  new BMLOfferInfoType(childNode);
		}
	}
 
}