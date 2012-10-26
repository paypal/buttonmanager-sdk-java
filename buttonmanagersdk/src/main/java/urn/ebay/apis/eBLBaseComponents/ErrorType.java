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
	private String ShortMessage;

	/**
	 * 	 
	 */ 
	private String LongMessage;

	/**
	 * Error code can be used by a receiving application to
	 * debugging a response message. These codes will need to be
	 * uniquely defined for each application. 	 
	 */ 
	private String ErrorCode;

	/**
	 * SeverityCode indicates whether the error is an application 
	 * level error or if it is informational error, i.e., warning. 
	 * 	 
	 */ 
	private SeverityCodeType SeverityCode;

	/**
	 * This optional element may carry additional
	 * application-specific error variables that indicate specific
	 * information about the error condition particularly in the
	 * cases where there are multiple instances of the ErrorType
	 * which require additional context.  	 
	 */ 
	private List<ErrorParameterType> ErrorParameters = new ArrayList<ErrorParameterType>();

	

	/**
	 * Default Constructor
	 */
	public ErrorType (){
	}	

	/**
	 * Getter for ShortMessage
	 */
	 public String getShortMessage() {
	 	return ShortMessage;
	 }
	 
	/**
	 * Setter for ShortMessage
	 */
	 public void setShortMessage(String ShortMessage) {
	 	this.ShortMessage = ShortMessage;
	 }
	 
	/**
	 * Getter for LongMessage
	 */
	 public String getLongMessage() {
	 	return LongMessage;
	 }
	 
	/**
	 * Setter for LongMessage
	 */
	 public void setLongMessage(String LongMessage) {
	 	this.LongMessage = LongMessage;
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
	 
	/**
	 * Getter for SeverityCode
	 */
	 public SeverityCodeType getSeverityCode() {
	 	return SeverityCode;
	 }
	 
	/**
	 * Setter for SeverityCode
	 */
	 public void setSeverityCode(SeverityCodeType SeverityCode) {
	 	this.SeverityCode = SeverityCode;
	 }
	 
	/**
	 * Getter for ErrorParameters
	 */
	 public List<ErrorParameterType> getErrorParameters() {
	 	return ErrorParameters;
	 }
	 
	/**
	 * Setter for ErrorParameters
	 */
	 public void setErrorParameters(List<ErrorParameterType> ErrorParameters) {
	 	this.ErrorParameters = ErrorParameters;
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
		    this.ShortMessage = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("LongMessage", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.LongMessage = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ErrorCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ErrorCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SeverityCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SeverityCode = SeverityCodeType.fromValue(childNode.getTextContent());
		}
        nodeList = (NodeList) xpath.evaluate("ErrorParameters", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.ErrorParameters.add(new ErrorParameterType(subNode));
			}
		}
	}
 
}