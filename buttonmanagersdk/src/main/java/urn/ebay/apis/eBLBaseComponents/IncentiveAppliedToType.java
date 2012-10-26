package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
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
public class IncentiveAppliedToType{


	/**
	 * 	 
	 */ 
	private String bucketId;

	/**
	 * 	 
	 */ 
	private String itemId;

	/**
	 * 	 
	 */ 
	private BasicAmountType incentiveAmount;

	/**
	 * 	 
	 */ 
	private String subType;

	

	/**
	 * Default Constructor
	 */
	public IncentiveAppliedToType (){
	}	

	/**
	 * Getter for bucketId
	 */
	 public String getBucketId() {
	 	return bucketId;
	 }
	 
	/**
	 * Setter for bucketId
	 */
	 public void setBucketId(String bucketId) {
	 	this.bucketId = bucketId;
	 }
	 
	/**
	 * Getter for itemId
	 */
	 public String getItemId() {
	 	return itemId;
	 }
	 
	/**
	 * Setter for itemId
	 */
	 public void setItemId(String itemId) {
	 	this.itemId = itemId;
	 }
	 
	/**
	 * Getter for incentiveAmount
	 */
	 public BasicAmountType getIncentiveAmount() {
	 	return incentiveAmount;
	 }
	 
	/**
	 * Setter for incentiveAmount
	 */
	 public void setIncentiveAmount(BasicAmountType incentiveAmount) {
	 	this.incentiveAmount = incentiveAmount;
	 }
	 
	/**
	 * Getter for subType
	 */
	 public String getSubType() {
	 	return subType;
	 }
	 
	/**
	 * Setter for subType
	 */
	 public void setSubType(String subType) {
	 	this.subType = subType;
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
	
	public IncentiveAppliedToType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("BucketId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.bucketId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("IncentiveAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.incentiveAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("SubType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.subType = childNode.getTextContent();
		}
	
	}
 
}