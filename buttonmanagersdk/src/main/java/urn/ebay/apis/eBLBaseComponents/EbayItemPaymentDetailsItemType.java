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
 * EbayItemPaymentDetailsItemType - Type declaration to be used
 * by other schemas. Information about an Ebay Payment Item. 
 */
public class EbayItemPaymentDetailsItemType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Auction ItemNumber. Optional Character length and
	 * limitations: 765 single-byte characters	 
	 */ 
	private String itemNumber;

	/**
	 * Auction Transaction ID. Optional Character length and
	 * limitations: 255 single-byte characters	 
	 */ 
	private String auctionTransactionId;

	/**
	 * Ebay Order ID. Optional Character length and limitations: 64
	 * single-byte characters	 
	 */ 
	private String orderId;

	/**
	 * Ebay Cart ID. Optional Character length and limitations: 64
	 * single-byte characters 	 
	 */ 
	private String cartID;

	

	/**
	 * Default Constructor
	 */
	public EbayItemPaymentDetailsItemType (){
	}	

	/**
	 * Getter for itemNumber
	 */
	 public String getItemNumber() {
	 	return itemNumber;
	 }
	 
	/**
	 * Setter for itemNumber
	 */
	 public void setItemNumber(String itemNumber) {
	 	this.itemNumber = itemNumber;
	 }
	 
	/**
	 * Getter for auctionTransactionId
	 */
	 public String getAuctionTransactionId() {
	 	return auctionTransactionId;
	 }
	 
	/**
	 * Setter for auctionTransactionId
	 */
	 public void setAuctionTransactionId(String auctionTransactionId) {
	 	this.auctionTransactionId = auctionTransactionId;
	 }
	 
	/**
	 * Getter for orderId
	 */
	 public String getOrderId() {
	 	return orderId;
	 }
	 
	/**
	 * Setter for orderId
	 */
	 public void setOrderId(String orderId) {
	 	this.orderId = orderId;
	 }
	 
	/**
	 * Getter for cartID
	 */
	 public String getCartID() {
	 	return cartID;
	 }
	 
	/**
	 * Setter for cartID
	 */
	 public void setCartID(String cartID) {
	 	this.cartID = cartID;
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
		if(itemNumber != null) {
			sb.append("<").append(preferredPrefix).append(":ItemNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemNumber));
			sb.append("</").append(preferredPrefix).append(":ItemNumber>");
		}
		if(auctionTransactionId != null) {
			sb.append("<").append(preferredPrefix).append(":AuctionTransactionId>").append(SDKUtil.escapeInvalidXmlCharsRegex(auctionTransactionId));
			sb.append("</").append(preferredPrefix).append(":AuctionTransactionId>");
		}
		if(orderId != null) {
			sb.append("<").append(preferredPrefix).append(":OrderId>").append(SDKUtil.escapeInvalidXmlCharsRegex(orderId));
			sb.append("</").append(preferredPrefix).append(":OrderId>");
		}
		if(cartID != null) {
			sb.append("<").append(preferredPrefix).append(":CartID>").append(SDKUtil.escapeInvalidXmlCharsRegex(cartID));
			sb.append("</").append(preferredPrefix).append(":CartID>");
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
	
	public EbayItemPaymentDetailsItemType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("ItemNumber", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemNumber = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AuctionTransactionId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.auctionTransactionId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OrderId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.orderId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CartID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.cartID = childNode.getTextContent();
		}
	
	}
 
}