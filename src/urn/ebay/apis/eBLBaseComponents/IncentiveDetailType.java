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
	private String RedemptionCode;

	/**
	 * 	 
	 */ 
	private String DisplayCode;

	/**
	 * 	 
	 */ 
	private String ProgramId;

	/**
	 * 	 
	 */ 
	private IncentiveTypeCodeType IncentiveType;

	/**
	 * 	 
	 */ 
	private String IncentiveDescription;

	/**
	 * 	 
	 */ 
	private List<IncentiveAppliedToType> AppliedTo = new ArrayList<IncentiveAppliedToType>();

	/**
	 * 	 
	 */ 
	private String Status;

	/**
	 * 	 
	 */ 
	private String ErrorCode;

	

	/**
	 * Default Constructor
	 */
	public IncentiveDetailType (){
	}	

	/**
	 * Getter for RedemptionCode
	 */
	 public String getRedemptionCode() {
	 	return RedemptionCode;
	 }
	 
	/**
	 * Setter for RedemptionCode
	 */
	 public void setRedemptionCode(String RedemptionCode) {
	 	this.RedemptionCode = RedemptionCode;
	 }
	 
	/**
	 * Getter for DisplayCode
	 */
	 public String getDisplayCode() {
	 	return DisplayCode;
	 }
	 
	/**
	 * Setter for DisplayCode
	 */
	 public void setDisplayCode(String DisplayCode) {
	 	this.DisplayCode = DisplayCode;
	 }
	 
	/**
	 * Getter for ProgramId
	 */
	 public String getProgramId() {
	 	return ProgramId;
	 }
	 
	/**
	 * Setter for ProgramId
	 */
	 public void setProgramId(String ProgramId) {
	 	this.ProgramId = ProgramId;
	 }
	 
	/**
	 * Getter for IncentiveType
	 */
	 public IncentiveTypeCodeType getIncentiveType() {
	 	return IncentiveType;
	 }
	 
	/**
	 * Setter for IncentiveType
	 */
	 public void setIncentiveType(IncentiveTypeCodeType IncentiveType) {
	 	this.IncentiveType = IncentiveType;
	 }
	 
	/**
	 * Getter for IncentiveDescription
	 */
	 public String getIncentiveDescription() {
	 	return IncentiveDescription;
	 }
	 
	/**
	 * Setter for IncentiveDescription
	 */
	 public void setIncentiveDescription(String IncentiveDescription) {
	 	this.IncentiveDescription = IncentiveDescription;
	 }
	 
	/**
	 * Getter for AppliedTo
	 */
	 public List<IncentiveAppliedToType> getAppliedTo() {
	 	return AppliedTo;
	 }
	 
	/**
	 * Setter for AppliedTo
	 */
	 public void setAppliedTo(List<IncentiveAppliedToType> AppliedTo) {
	 	this.AppliedTo = AppliedTo;
	 }
	 
	/**
	 * Getter for Status
	 */
	 public String getStatus() {
	 	return Status;
	 }
	 
	/**
	 * Setter for Status
	 */
	 public void setStatus(String Status) {
	 	this.Status = Status;
	 }
	 
	/**
	 * Getter for ErrorCode
	 */
	 public String getErrorCode() {
	 	return ErrorCode;
	 }
	 
	/**
	 * Setter for ErrorCode
	 */
	 public void setErrorCode(String ErrorCode) {
	 	this.ErrorCode = ErrorCode;
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
		    this.RedemptionCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("DisplayCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.DisplayCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProgramId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ProgramId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("IncentiveType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.IncentiveType = IncentiveTypeCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("IncentiveDescription", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.IncentiveDescription = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("AppliedTo", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.AppliedTo.add(new IncentiveAppliedToType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("Status", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Status = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ErrorCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ErrorCode = childNode.getTextContent();
		}
	
	}
 
}