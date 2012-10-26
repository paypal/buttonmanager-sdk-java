package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.SeverityCodeType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.ErrorParameterType;
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
 * Error code can be used by a receiving application to
 * debugging a response message. These codes will need to be
 * uniquely defined for each application. 
 */
public class ErrorType{


	/**
	 * 	 
	 */ 
	private String shortMessage;

	/**
	 * 	 
	 */ 
	private String longMessage;

	/**
	 * Error code can be used by a receiving application to
	 * debugging a response message. These codes will need to be
	 * uniquely defined for each application. 	 
	 */ 
	private String errorCode;

	/**
	 * SeverityCode indicates whether the error is an application 
	 * level error or if it is informational error, i.e., warning. 
	 * 	 
	 */ 
	private SeverityCodeType severityCode;

	/**
	 * This optional element may carry additional
	 * application-specific error variables that indicate specific
	 * information about the error condition particularly in the
	 * cases where there are multiple instances of the ErrorType
	 * which require additional context.  	 
	 */ 
	private List<ErrorParameterType> errorParameters = new ArrayList<ErrorParameterType>();

	

	/**
	 * Default Constructor
	 */
	public ErrorType (){
	}	

	/**
	 * Getter for shortMessage
	 */
	 public String getShortMessage() {
	 	return shortMessage;
	 }
	 
	/**
	 * Setter for shortMessage
	 */
	 public void setShortMessage(String shortMessage) {
	 	this.shortMessage = shortMessage;
	 }
	 
	/**
	 * Getter for longMessage
	 */
	 public String getLongMessage() {
	 	return longMessage;
	 }
	 
	/**
	 * Setter for longMessage
	 */
	 public void setLongMessage(String longMessage) {
	 	this.longMessage = longMessage;
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
	 
	/**
	 * Getter for severityCode
	 */
	 public SeverityCodeType getSeverityCode() {
	 	return severityCode;
	 }
	 
	/**
	 * Setter for severityCode
	 */
	 public void setSeverityCode(SeverityCodeType severityCode) {
	 	this.severityCode = severityCode;
	 }
	 
	/**
	 * Getter for errorParameters
	 */
	 public List<ErrorParameterType> getErrorParameters() {
	 	return errorParameters;
	 }
	 
	/**
	 * Setter for errorParameters
	 */
	 public void setErrorParameters(List<ErrorParameterType> errorParameters) {
	 	this.errorParameters = errorParameters;
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
	
	public ErrorType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("ShortMessage", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.shortMessage = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("LongMessage", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.longMessage = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ErrorCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.errorCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SeverityCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.severityCode = SeverityCodeType.fromValue(childNode.getTextContent());
		}
        nodeList = (NodeList) xpath.evaluate("ErrorParameters", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.errorParameters.add(new ErrorParameterType(subNode));
			}
		}
	}
 
}