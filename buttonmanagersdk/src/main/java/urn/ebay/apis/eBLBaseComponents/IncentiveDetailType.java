package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.IncentiveTypeCodeType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.IncentiveAppliedToType;
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
public class IncentiveDetailType{


	/**
	 * 	 
	 */ 
	private String redemptionCode;

	/**
	 * 	 
	 */ 
	private String displayCode;

	/**
	 * 	 
	 */ 
	private String programId;

	/**
	 * 	 
	 */ 
	private IncentiveTypeCodeType incentiveType;

	/**
	 * 	 
	 */ 
	private String incentiveDescription;

	/**
	 * 	 
	 */ 
	private List<IncentiveAppliedToType> appliedTo = new ArrayList<IncentiveAppliedToType>();

	/**
	 * 	 
	 */ 
	private String status;

	/**
	 * 	 
	 */ 
	private String errorCode;

	

	/**
	 * Default Constructor
	 */
	public IncentiveDetailType (){
	}	

	/**
	 * Getter for redemptionCode
	 */
	 public String getRedemptionCode() {
	 	return redemptionCode;
	 }
	 
	/**
	 * Setter for redemptionCode
	 */
	 public void setRedemptionCode(String redemptionCode) {
	 	this.redemptionCode = redemptionCode;
	 }
	 
	/**
	 * Getter for displayCode
	 */
	 public String getDisplayCode() {
	 	return displayCode;
	 }
	 
	/**
	 * Setter for displayCode
	 */
	 public void setDisplayCode(String displayCode) {
	 	this.displayCode = displayCode;
	 }
	 
	/**
	 * Getter for programId
	 */
	 public String getProgramId() {
	 	return programId;
	 }
	 
	/**
	 * Setter for programId
	 */
	 public void setProgramId(String programId) {
	 	this.programId = programId;
	 }
	 
	/**
	 * Getter for incentiveType
	 */
	 public IncentiveTypeCodeType getIncentiveType() {
	 	return incentiveType;
	 }
	 
	/**
	 * Setter for incentiveType
	 */
	 public void setIncentiveType(IncentiveTypeCodeType incentiveType) {
	 	this.incentiveType = incentiveType;
	 }
	 
	/**
	 * Getter for incentiveDescription
	 */
	 public String getIncentiveDescription() {
	 	return incentiveDescription;
	 }
	 
	/**
	 * Setter for incentiveDescription
	 */
	 public void setIncentiveDescription(String incentiveDescription) {
	 	this.incentiveDescription = incentiveDescription;
	 }
	 
	/**
	 * Getter for appliedTo
	 */
	 public List<IncentiveAppliedToType> getAppliedTo() {
	 	return appliedTo;
	 }
	 
	/**
	 * Setter for appliedTo
	 */
	 public void setAppliedTo(List<IncentiveAppliedToType> appliedTo) {
	 	this.appliedTo = appliedTo;
	 }
	 
	/**
	 * Getter for status
	 */
	 public String getStatus() {
	 	return status;
	 }
	 
	/**
	 * Setter for status
	 */
	 public void setStatus(String status) {
	 	this.status = status;
	 }
	 
	/**
	 * Getter for errorCode
	 */
	 public String getErrorCode() {
	 	return errorCode;
	 }
	 
	/**
	 * Setter for errorCode
	 */
	 public void setErrorCode(String errorCode) {
	 	this.errorCode = errorCode;
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
	
	public IncentiveDetailType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("RedemptionCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.redemptionCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("DisplayCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.displayCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProgramId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.programId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("IncentiveType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.incentiveType = IncentiveTypeCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("IncentiveDescription", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.incentiveDescription = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("AppliedTo", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.appliedTo.add(new IncentiveAppliedToType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("Status", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.status = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ErrorCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.errorCode = childNode.getTextContent();
		}
	
	}
 
}