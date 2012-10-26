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
	private String BuyerID;

	/**
	 * Auction's close date 	 
	 */ 
	private String ClosingDate;

	

	/**
	 * Default Constructor
	 */
	public AuctionInfoType (){
	}	

	/**
	 * Getter for BuyerID
	 */
	 public String getBuyerID() {
	 	return BuyerID;
	 }
	 
	/**
	 * Setter for BuyerID
	 */
	 public void setBuyerID(String BuyerID) {
	 	this.BuyerID = BuyerID;
	 }
	 
	/**
	 * Getter for ClosingDate
	 */
	 public String getClosingDate() {
	 	return ClosingDate;
	 }
	 
	/**
	 * Setter for ClosingDate
	 */
	 public void setClosingDate(String ClosingDate) {
	 	this.ClosingDate = ClosingDate;
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
		    this.BuyerID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ClosingDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ClosingDate = childNode.getTextContent();
		}
	
	}
 
}