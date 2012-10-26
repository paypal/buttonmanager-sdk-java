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
	private String nextBillingDate;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private Integer numberCyclesCompleted;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private Integer numberCyclesRemaining;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private BasicAmountType outstandingBalance;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private Integer failedPaymentCount;

	/**
	 * 	 
	 */ 
	private String lastPaymentDate;

	/**
	 * 	 
	 */ 
	private BasicAmountType lastPaymentAmount;

	

	/**
	 * Default Constructor
	 */
	public RecurringPaymentsSummaryType (){
	}	

	/**
	 * Getter for nextBillingDate
	 */
	 public String getNextBillingDate() {
	 	return nextBillingDate;
	 }
	 
	/**
	 * Setter for nextBillingDate
	 */
	 public void setNextBillingDate(String nextBillingDate) {
	 	this.nextBillingDate = nextBillingDate;
	 }
	 
	/**
	 * Getter for numberCyclesCompleted
	 */
	 public Integer getNumberCyclesCompleted() {
	 	return numberCyclesCompleted;
	 }
	 
	/**
	 * Setter for numberCyclesCompleted
	 */
	 public void setNumberCyclesCompleted(Integer numberCyclesCompleted) {
	 	this.numberCyclesCompleted = numberCyclesCompleted;
	 }
	 
	/**
	 * Getter for numberCyclesRemaining
	 */
	 public Integer getNumberCyclesRemaining() {
	 	return numberCyclesRemaining;
	 }
	 
	/**
	 * Setter for numberCyclesRemaining
	 */
	 public void setNumberCyclesRemaining(Integer numberCyclesRemaining) {
	 	this.numberCyclesRemaining = numberCyclesRemaining;
	 }
	 
	/**
	 * Getter for outstandingBalance
	 */
	 public BasicAmountType getOutstandingBalance() {
	 	return outstandingBalance;
	 }
	 
	/**
	 * Setter for outstandingBalance
	 */
	 public void setOutstandingBalance(BasicAmountType outstandingBalance) {
	 	this.outstandingBalance = outstandingBalance;
	 }
	 
	/**
	 * Getter for failedPaymentCount
	 */
	 public Integer getFailedPaymentCount() {
	 	return failedPaymentCount;
	 }
	 
	/**
	 * Setter for failedPaymentCount
	 */
	 public void setFailedPaymentCount(Integer failedPaymentCount) {
	 	this.failedPaymentCount = failedPaymentCount;
	 }
	 
	/**
	 * Getter for lastPaymentDate
	 */
	 public String getLastPaymentDate() {
	 	return lastPaymentDate;
	 }
	 
	/**
	 * Setter for lastPaymentDate
	 */
	 public void setLastPaymentDate(String lastPaymentDate) {
	 	this.lastPaymentDate = lastPaymentDate;
	 }
	 
	/**
	 * Getter for lastPaymentAmount
	 */
	 public BasicAmountType getLastPaymentAmount() {
	 	return lastPaymentAmount;
	 }
	 
	/**
	 * Setter for lastPaymentAmount
	 */
	 public void setLastPaymentAmount(BasicAmountType lastPaymentAmount) {
	 	this.lastPaymentAmount = lastPaymentAmount;
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
		    this.nextBillingDate = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("NumberCyclesCompleted", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.numberCyclesCompleted = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("NumberCyclesRemaining", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.numberCyclesRemaining = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("OutstandingBalance", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.outstandingBalance =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("FailedPaymentCount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.failedPaymentCount = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("LastPaymentDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.lastPaymentDate = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("LastPaymentAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.lastPaymentAmount =  new BasicAmountType(childNode);
		}
	}
 
}