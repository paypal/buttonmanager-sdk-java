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
	private String ProfileID;

	/**
	 * Recurring Billing Profile Status 	 
	 */ 
	private RecurringPaymentsProfileStatusType ProfileStatus;

	/**
	 * Transaction id from DCC initial payment 	 
	 */ 
	private String TransactionID;

	/**
	 * Response from DCC initial payment 	 
	 */ 
	private String DCCProcessorResponse;

	/**
	 * Return code if DCC initial payment fails 	 
	 */ 
	private String DCCReturnCode;

	

	/**
	 * Default Constructor
	 */
	public CreateRecurringPaymentsProfileResponseDetailsType (){
	}	

	/**
	 * Getter for ProfileID
	 */
	 public String getProfileID() {
	 	return ProfileID;
	 }
	 
	/**
	 * Setter for ProfileID
	 */
	 public void setProfileID(String ProfileID) {
	 	this.ProfileID = ProfileID;
	 }
	 
	/**
	 * Getter for ProfileStatus
	 */
	 public RecurringPaymentsProfileStatusType getProfileStatus() {
	 	return ProfileStatus;
	 }
	 
	/**
	 * Setter for ProfileStatus
	 */
	 public void setProfileStatus(RecurringPaymentsProfileStatusType ProfileStatus) {
	 	this.ProfileStatus = ProfileStatus;
	 }
	 
	/**
	 * Getter for TransactionID
	 */
	 public String getTransactionID() {
	 	return TransactionID;
	 }
	 
	/**
	 * Setter for TransactionID
	 */
	 public void setTransactionID(String TransactionID) {
	 	this.TransactionID = TransactionID;
	 }
	 
	/**
	 * Getter for DCCProcessorResponse
	 */
	 public String getDCCProcessorResponse() {
	 	return DCCProcessorResponse;
	 }
	 
	/**
	 * Setter for DCCProcessorResponse
	 */
	 public void setDCCProcessorResponse(String DCCProcessorResponse) {
	 	this.DCCProcessorResponse = DCCProcessorResponse;
	 }
	 
	/**
	 * Getter for DCCReturnCode
	 */
	 public String getDCCReturnCode() {
	 	return DCCReturnCode;
	 }
	 
	/**
	 * Setter for DCCReturnCode
	 */
	 public void setDCCReturnCode(String DCCReturnCode) {
	 	this.DCCReturnCode = DCCReturnCode;
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
		    this.ProfileID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProfileStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ProfileStatus = RecurringPaymentsProfileStatusType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("TransactionID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TransactionID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("DCCProcessorResponse", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.DCCProcessorResponse = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("DCCReturnCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.DCCReturnCode = childNode.getTextContent();
		}
	
	}
 
}