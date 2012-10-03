package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.RedeemedOfferType;
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
 * Describes discount information 
 */
public class DiscountType{


	/**
	 * Item nameOptional Character length and limits: 127
	 * single-byte characters 	 
	 */ 
	private String Name;

	/**
	 * description of the discountOptional Character length and
	 * limits: 127 single-byte characters 	 
	 */ 
	private String Description;

	/**
	 * amount discountedOptional 	  
	 *@Required	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * offer typeOptional 	 
	 */ 
	private RedeemedOfferType RedeemedOfferType;

	/**
	 * offer IDOptional Character length and limits: 64 single-byte
	 * characters 	 
	 */ 
	private String RedeemedOfferID;

	

	/**
	 * Constructor with arguments
	 */
	public DiscountType (BasicAmountType Amount){
		this.Amount = Amount;
	}	

	/**
	 * Default Constructor
	 */
	public DiscountType (){
	}	

	/**
	 * Getter for Name
	 */
	 public String getName() {
	 	return Name;
	 }
	 
	/**
	 * Setter for Name
	 */
	 public void setName(String Name) {
	 	this.Name = Name;
	 }
	 
	/**
	 * Getter for Description
	 */
	 public String getDescription() {
	 	return Description;
	 }
	 
	/**
	 * Setter for Description
	 */
	 public void setDescription(String Description) {
	 	this.Description = Description;
	 }
	 
	/**
	 * Getter for Amount
	 */
	 public BasicAmountType getAmount() {
	 	return Amount;
	 }
	 
	/**
	 * Setter for Amount
	 */
	 public void setAmount(BasicAmountType Amount) {
	 	this.Amount = Amount;
	 }
	 
	/**
	 * Getter for RedeemedOfferType
	 */
	 public RedeemedOfferType getRedeemedOfferType() {
	 	return RedeemedOfferType;
	 }
	 
	/**
	 * Setter for RedeemedOfferType
	 */
	 public void setRedeemedOfferType(RedeemedOfferType RedeemedOfferType) {
	 	this.RedeemedOfferType = RedeemedOfferType;
	 }
	 
	/**
	 * Getter for RedeemedOfferID
	 */
	 public String getRedeemedOfferID() {
	 	return RedeemedOfferID;
	 }
	 
	/**
	 * Setter for RedeemedOfferID
	 */
	 public void setRedeemedOfferID(String RedeemedOfferID) {
	 	this.RedeemedOfferID = RedeemedOfferID;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Name != null) {
			sb.append("<ebl:Name>").append(SDKUtil.escapeInvalidXmlCharsRegex(Name));
			sb.append("</ebl:Name>");
		}
		if(Description != null) {
			sb.append("<ebl:Description>").append(SDKUtil.escapeInvalidXmlCharsRegex(Description));
			sb.append("</ebl:Description>");
		}
		if(Amount != null) {
			sb.append("<ebl:Amount");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		if(RedeemedOfferType != null) {
			sb.append("<ebl:RedeemedOfferType>").append(SDKUtil.escapeInvalidXmlCharsRegex(RedeemedOfferType.getValue()));
			sb.append("</ebl:RedeemedOfferType>");
		}
		if(RedeemedOfferID != null) {
			sb.append("<ebl:RedeemedOfferID>").append(SDKUtil.escapeInvalidXmlCharsRegex(RedeemedOfferID));
			sb.append("</ebl:RedeemedOfferID>");
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
	
	public DiscountType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Name", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Name = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Description", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Description = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Amount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Amount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("RedeemedOfferType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.RedeemedOfferType = RedeemedOfferType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("RedeemedOfferID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.RedeemedOfferID = childNode.getTextContent();
		}
	
	}
 
}