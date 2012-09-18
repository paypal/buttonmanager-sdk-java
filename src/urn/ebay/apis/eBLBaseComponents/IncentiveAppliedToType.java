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
	private String BucketId;

	/**
	 * 	 
	 */ 
	private String ItemId;

	/**
	 * 	 
	 */ 
	private BasicAmountType IncentiveAmount;

	/**
	 * 	 
	 */ 
	private String SubType;

	

	/**
	 * Default Constructor
	 */
	public IncentiveAppliedToType (){
	}	

	/**
	 * Getter for BucketId
	 */
	 public String getBucketId() {
	 	return BucketId;
	 }
	 
	/**
	 * Setter for BucketId
	 */
	 public void setBucketId(String BucketId) {
	 	this.BucketId = BucketId;
	 }
	 
	/**
	 * Getter for ItemId
	 */
	 public String getItemId() {
	 	return ItemId;
	 }
	 
	/**
	 * Setter for ItemId
	 */
	 public void setItemId(String ItemId) {
	 	this.ItemId = ItemId;
	 }
	 
	/**
	 * Getter for IncentiveAmount
	 */
	 public BasicAmountType getIncentiveAmount() {
	 	return IncentiveAmount;
	 }
	 
	/**
	 * Setter for IncentiveAmount
	 */
	 public void setIncentiveAmount(BasicAmountType IncentiveAmount) {
	 	this.IncentiveAmount = IncentiveAmount;
	 }
	 
	/**
	 * Getter for SubType
	 */
	 public String getSubType() {
	 	return SubType;
	 }
	 
	/**
	 * Setter for SubType
	 */
	 public void setSubType(String SubType) {
	 	this.SubType = SubType;
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
		    this.BucketId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ItemId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("IncentiveAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.IncentiveAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("SubType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SubType = childNode.getTextContent();
		}
	
	}
 
}