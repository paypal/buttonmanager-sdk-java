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
public class RecurringPaymentsSummaryType{


	/**
	 * 	 
	 */ 
	private String NextBillingDate;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private Integer NumberCyclesCompleted;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private Integer NumberCyclesRemaining;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private BasicAmountType OutstandingBalance;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private Integer FailedPaymentCount;

	/**
	 * 	 
	 */ 
	private String LastPaymentDate;

	/**
	 * 	 
	 */ 
	private BasicAmountType LastPaymentAmount;

	

	/**
	 * Default Constructor
	 */
	public RecurringPaymentsSummaryType (){
	}	

	/**
	 * Getter for NextBillingDate
	 */
	 public String getNextBillingDate() {
	 	return NextBillingDate;
	 }
	 
	/**
	 * Setter for NextBillingDate
	 */
	 public void setNextBillingDate(String NextBillingDate) {
	 	this.NextBillingDate = NextBillingDate;
	 }
	 
	/**
	 * Getter for NumberCyclesCompleted
	 */
	 public Integer getNumberCyclesCompleted() {
	 	return NumberCyclesCompleted;
	 }
	 
	/**
	 * Setter for NumberCyclesCompleted
	 */
	 public void setNumberCyclesCompleted(Integer NumberCyclesCompleted) {
	 	this.NumberCyclesCompleted = NumberCyclesCompleted;
	 }
	 
	/**
	 * Getter for NumberCyclesRemaining
	 */
	 public Integer getNumberCyclesRemaining() {
	 	return NumberCyclesRemaining;
	 }
	 
	/**
	 * Setter for NumberCyclesRemaining
	 */
	 public void setNumberCyclesRemaining(Integer NumberCyclesRemaining) {
	 	this.NumberCyclesRemaining = NumberCyclesRemaining;
	 }
	 
	/**
	 * Getter for OutstandingBalance
	 */
	 public BasicAmountType getOutstandingBalance() {
	 	return OutstandingBalance;
	 }
	 
	/**
	 * Setter for OutstandingBalance
	 */
	 public void setOutstandingBalance(BasicAmountType OutstandingBalance) {
	 	this.OutstandingBalance = OutstandingBalance;
	 }
	 
	/**
	 * Getter for FailedPaymentCount
	 */
	 public Integer getFailedPaymentCount() {
	 	return FailedPaymentCount;
	 }
	 
	/**
	 * Setter for FailedPaymentCount
	 */
	 public void setFailedPaymentCount(Integer FailedPaymentCount) {
	 	this.FailedPaymentCount = FailedPaymentCount;
	 }
	 
	/**
	 * Getter for LastPaymentDate
	 */
	 public String getLastPaymentDate() {
	 	return LastPaymentDate;
	 }
	 
	/**
	 * Setter for LastPaymentDate
	 */
	 public void setLastPaymentDate(String LastPaymentDate) {
	 	this.LastPaymentDate = LastPaymentDate;
	 }
	 
	/**
	 * Getter for LastPaymentAmount
	 */
	 public BasicAmountType getLastPaymentAmount() {
	 	return LastPaymentAmount;
	 }
	 
	/**
	 * Setter for LastPaymentAmount
	 */
	 public void setLastPaymentAmount(BasicAmountType LastPaymentAmount) {
	 	this.LastPaymentAmount = LastPaymentAmount;
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
	
	public RecurringPaymentsSummaryType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("NextBillingDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.NextBillingDate = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("NumberCyclesCompleted", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.NumberCyclesCompleted = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("NumberCyclesRemaining", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.NumberCyclesRemaining = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("OutstandingBalance", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OutstandingBalance =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("FailedPaymentCount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.FailedPaymentCount = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("LastPaymentDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.LastPaymentDate = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("LastPaymentAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.LastPaymentAmount =  new BasicAmountType(childNode);
		}
	}
 
}