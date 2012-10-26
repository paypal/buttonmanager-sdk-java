package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.RecurringPaymentsProfileStatusType;
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
 * Recurring Billing Profile ID 
 */
public class CreateRecurringPaymentsProfileResponseDetailsType{


	/**
	 * Recurring Billing Profile ID 	  
	 *@Required	 
	 */ 
	private String profileID;

	/**
	 * Recurring Billing Profile Status 	 
	 */ 
	private RecurringPaymentsProfileStatusType profileStatus;

	/**
	 * Transaction id from DCC initial payment 	 
	 */ 
	private String transactionID;

	/**
	 * Response from DCC initial payment 	 
	 */ 
	private String dCCProcessorResponse;

	/**
	 * Return code if DCC initial payment fails 	 
	 */ 
	private String dCCReturnCode;

	

	/**
	 * Default Constructor
	 */
	public CreateRecurringPaymentsProfileResponseDetailsType (){
	}	

	/**
	 * Getter for profileID
	 */
	 public String getProfileID() {
	 	return profileID;
	 }
	 
	/**
	 * Setter for profileID
	 */
	 public void setProfileID(String profileID) {
	 	this.profileID = profileID;
	 }
	 
	/**
	 * Getter for profileStatus
	 */
	 public RecurringPaymentsProfileStatusType getProfileStatus() {
	 	return profileStatus;
	 }
	 
	/**
	 * Setter for profileStatus
	 */
	 public void setProfileStatus(RecurringPaymentsProfileStatusType profileStatus) {
	 	this.profileStatus = profileStatus;
	 }
	 
	/**
	 * Getter for transactionID
	 */
	 public String getTransactionID() {
	 	return transactionID;
	 }
	 
	/**
	 * Setter for transactionID
	 */
	 public void setTransactionID(String transactionID) {
	 	this.transactionID = transactionID;
	 }
	 
	/**
	 * Getter for dCCProcessorResponse
	 */
	 public String getDCCProcessorResponse() {
	 	return dCCProcessorResponse;
	 }
	 
	/**
	 * Setter for dCCProcessorResponse
	 */
	 public void setDCCProcessorResponse(String dCCProcessorResponse) {
	 	this.dCCProcessorResponse = dCCProcessorResponse;
	 }
	 
	/**
	 * Getter for dCCReturnCode
	 */
	 public String getDCCReturnCode() {
	 	return dCCReturnCode;
	 }
	 
	/**
	 * Setter for dCCReturnCode
	 */
	 public void setDCCReturnCode(String dCCReturnCode) {
	 	this.dCCReturnCode = dCCReturnCode;
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
	
	public CreateRecurringPaymentsProfileResponseDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("ProfileID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.profileID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProfileStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.profileStatus = RecurringPaymentsProfileStatusType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("TransactionID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.transactionID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("DCCProcessorResponse", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.dCCProcessorResponse = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("DCCReturnCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.dCCReturnCode = childNode.getTextContent();
		}
	
	}
 
}