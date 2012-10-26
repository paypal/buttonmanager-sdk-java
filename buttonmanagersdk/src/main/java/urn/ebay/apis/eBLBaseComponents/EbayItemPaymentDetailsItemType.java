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


	/**
	 * Auction ItemNumber. Optional Character length and
	 * limitations: 765 single-byte characters	 
	 */ 
	private String ItemNumber;

	/**
	 * Auction Transaction ID. Optional Character length and
	 * limitations: 255 single-byte characters	 
	 */ 
	private String AuctionTransactionId;

	/**
	 * Ebay Order ID. Optional Character length and limitations: 64
	 * single-byte characters	 
	 */ 
	private String OrderId;

	/**
	 * Ebay Cart ID. Optional Character length and limitations: 64
	 * single-byte characters 	 
	 */ 
	private String CartID;

	

	/**
	 * Default Constructor
	 */
	public EbayItemPaymentDetailsItemType (){
	}	

	/**
	 * Getter for ItemNumber
	 */
	 public String getItemNumber() {
	 	return ItemNumber;
	 }
	 
	/**
	 * Setter for ItemNumber
	 */
	 public void setItemNumber(String ItemNumber) {
	 	this.ItemNumber = ItemNumber;
	 }
	 
	/**
	 * Getter for AuctionTransactionId
	 */
	 public String getAuctionTransactionId() {
	 	return AuctionTransactionId;
	 }
	 
	/**
	 * Setter for AuctionTransactionId
	 */
	 public void setAuctionTransactionId(String AuctionTransactionId) {
	 	this.AuctionTransactionId = AuctionTransactionId;
	 }
	 
	/**
	 * Getter for OrderId
	 */
	 public String getOrderId() {
	 	return OrderId;
	 }
	 
	/**
	 * Setter for OrderId
	 */
	 public void setOrderId(String OrderId) {
	 	this.OrderId = OrderId;
	 }
	 
	/**
	 * Getter for CartID
	 */
	 public String getCartID() {
	 	return CartID;
	 }
	 
	/**
	 * Setter for CartID
	 */
	 public void setCartID(String CartID) {
	 	this.CartID = CartID;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ItemNumber != null) {
			sb.append("<ebl:ItemNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemNumber));
			sb.append("</ebl:ItemNumber>");
		}
		if(AuctionTransactionId != null) {
			sb.append("<ebl:AuctionTransactionId>").append(SDKUtil.escapeInvalidXmlCharsRegex(AuctionTransactionId));
			sb.append("</ebl:AuctionTransactionId>");
		}
		if(OrderId != null) {
			sb.append("<ebl:OrderId>").append(SDKUtil.escapeInvalidXmlCharsRegex(OrderId));
			sb.append("</ebl:OrderId>");
		}
		if(CartID != null) {
			sb.append("<ebl:CartID>").append(SDKUtil.escapeInvalidXmlCharsRegex(CartID));
			sb.append("</ebl:CartID>");
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
		    this.ItemNumber = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AuctionTransactionId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AuctionTransactionId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OrderId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OrderId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CartID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CartID = childNode.getTextContent();
		}
	
	}
 
}