package urn.ebay.apis.eBLBaseComponents;
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
 * AuctionInfoType Basic information about an auction. 
 */
public class AuctionInfoType{


	/**
	 * Customer's auction ID 	 
	 */ 
	private String buyerID;

	/**
	 * Auction's close date 	 
	 */ 
	private String closingDate;

	

	/**
	 * Default Constructor
	 */
	public AuctionInfoType (){
	}	

	/**
	 * Getter for buyerID
	 */
	 public String getBuyerID() {
	 	return buyerID;
	 }
	 
	/**
	 * Setter for buyerID
	 */
	 public void setBuyerID(String buyerID) {
	 	this.buyerID = buyerID;
	 }
	 
	/**
	 * Getter for closingDate
	 */
	 public String getClosingDate() {
	 	return closingDate;
	 }
	 
	/**
	 * Setter for closingDate
	 */
	 public void setClosingDate(String closingDate) {
	 	this.closingDate = closingDate;
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
	
	public AuctionInfoType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("BuyerID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.buyerID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ClosingDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.closingDate = childNode.getTextContent();
		}
	
	}
 
}