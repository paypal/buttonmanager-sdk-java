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

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Code used to identify the promotion offer. 	 
	 */ 
	private String offerCode;

	/**
	 * Specific infromation for BML, Similar structure could be
	 * added for sepcific  promotion needs like CrossPromotions 	 
	 */ 
	private BMLOfferInfoType bMLOfferInfo;

	

	/**
	 * Default Constructor
	 */
	public OfferDetailsType (){
	}	

	/**
	 * Getter for offerCode
	 */
	 public String getOfferCode() {
	 	return offerCode;
	 }
	 
	/**
	 * Setter for offerCode
	 */
	 public void setOfferCode(String offerCode) {
	 	this.offerCode = offerCode;
	 }
	 
	/**
	 * Getter for bMLOfferInfo
	 */
	 public BMLOfferInfoType getBMLOfferInfo() {
	 	return bMLOfferInfo;
	 }
	 
	/**
	 * Setter for bMLOfferInfo
	 */
	 public void setBMLOfferInfo(BMLOfferInfoType bMLOfferInfo) {
	 	this.bMLOfferInfo = bMLOfferInfo;
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
		if(offerCode != null) {
			sb.append("<").append(preferredPrefix).append(":OfferCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(offerCode));
			sb.append("</").append(preferredPrefix).append(":OfferCode>");
		}
		if(bMLOfferInfo != null) {
			sb.append(bMLOfferInfo.toXMLString(preferredPrefix,"BMLOfferInfo"));
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
	
	public OfferDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("OfferCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.offerCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BMLOfferInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.bMLOfferInfo =  new BMLOfferInfoType(childNode);
		}
	}
 
}