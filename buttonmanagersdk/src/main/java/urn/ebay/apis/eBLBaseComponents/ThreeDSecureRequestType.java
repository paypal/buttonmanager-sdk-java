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
 * The Common 3DS fields. Common for both GTD and DCC API's. 
 */
public class ThreeDSecureRequestType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private String eci3ds;

	/**
	 * 	 
	 */ 
	private String cavv;

	/**
	 * 	 
	 */ 
	private String xid;

	/**
	 * 	 
	 */ 
	private String mpiVendor3ds;

	/**
	 * 	 
	 */ 
	private String authStatus3ds;

	

	/**
	 * Default Constructor
	 */
	public ThreeDSecureRequestType (){
	}	

	/**
	 * Getter for eci3ds
	 */
	 public String getEci3ds() {
	 	return eci3ds;
	 }
	 
	/**
	 * Setter for eci3ds
	 */
	 public void setEci3ds(String eci3ds) {
	 	this.eci3ds = eci3ds;
	 }
	 
	/**
	 * Getter for cavv
	 */
	 public String getCavv() {
	 	return cavv;
	 }
	 
	/**
	 * Setter for cavv
	 */
	 public void setCavv(String cavv) {
	 	this.cavv = cavv;
	 }
	 
	/**
	 * Getter for xid
	 */
	 public String getXid() {
	 	return xid;
	 }
	 
	/**
	 * Setter for xid
	 */
	 public void setXid(String xid) {
	 	this.xid = xid;
	 }
	 
	/**
	 * Getter for mpiVendor3ds
	 */
	 public String getMpiVendor3ds() {
	 	return mpiVendor3ds;
	 }
	 
	/**
	 * Setter for mpiVendor3ds
	 */
	 public void setMpiVendor3ds(String mpiVendor3ds) {
	 	this.mpiVendor3ds = mpiVendor3ds;
	 }
	 
	/**
	 * Getter for authStatus3ds
	 */
	 public String getAuthStatus3ds() {
	 	return authStatus3ds;
	 }
	 
	/**
	 * Setter for authStatus3ds
	 */
	 public void setAuthStatus3ds(String authStatus3ds) {
	 	this.authStatus3ds = authStatus3ds;
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
		if(eci3ds != null) {
			sb.append("<").append(preferredPrefix).append(":Eci3ds>").append(SDKUtil.escapeInvalidXmlCharsRegex(eci3ds));
			sb.append("</").append(preferredPrefix).append(":Eci3ds>");
		}
		if(cavv != null) {
			sb.append("<").append(preferredPrefix).append(":Cavv>").append(SDKUtil.escapeInvalidXmlCharsRegex(cavv));
			sb.append("</").append(preferredPrefix).append(":Cavv>");
		}
		if(xid != null) {
			sb.append("<").append(preferredPrefix).append(":Xid>").append(SDKUtil.escapeInvalidXmlCharsRegex(xid));
			sb.append("</").append(preferredPrefix).append(":Xid>");
		}
		if(mpiVendor3ds != null) {
			sb.append("<").append(preferredPrefix).append(":MpiVendor3ds>").append(SDKUtil.escapeInvalidXmlCharsRegex(mpiVendor3ds));
			sb.append("</").append(preferredPrefix).append(":MpiVendor3ds>");
		}
		if(authStatus3ds != null) {
			sb.append("<").append(preferredPrefix).append(":AuthStatus3ds>").append(SDKUtil.escapeInvalidXmlCharsRegex(authStatus3ds));
			sb.append("</").append(preferredPrefix).append(":AuthStatus3ds>");
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
	
	public ThreeDSecureRequestType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Eci3ds", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.eci3ds = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Cavv", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.cavv = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Xid", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.xid = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("MpiVendor3ds", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.mpiVendor3ds = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AuthStatus3ds", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.authStatus3ds = childNode.getTextContent();
		}
	
	}
 
}