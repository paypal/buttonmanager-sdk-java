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


	/**
	 * 	 
	 */ 
	private String Eci3ds;

	/**
	 * 	 
	 */ 
	private String Cavv;

	/**
	 * 	 
	 */ 
	private String Xid;

	/**
	 * 	 
	 */ 
	private String MpiVendor3ds;

	/**
	 * 	 
	 */ 
	private String AuthStatus3ds;

	

	/**
	 * Default Constructor
	 */
	public ThreeDSecureRequestType (){
	}	

	/**
	 * Getter for Eci3ds
	 */
	 public String getEci3ds() {
	 	return Eci3ds;
	 }
	 
	/**
	 * Setter for Eci3ds
	 */
	 public void setEci3ds(String Eci3ds) {
	 	this.Eci3ds = Eci3ds;
	 }
	 
	/**
	 * Getter for Cavv
	 */
	 public String getCavv() {
	 	return Cavv;
	 }
	 
	/**
	 * Setter for Cavv
	 */
	 public void setCavv(String Cavv) {
	 	this.Cavv = Cavv;
	 }
	 
	/**
	 * Getter for Xid
	 */
	 public String getXid() {
	 	return Xid;
	 }
	 
	/**
	 * Setter for Xid
	 */
	 public void setXid(String Xid) {
	 	this.Xid = Xid;
	 }
	 
	/**
	 * Getter for MpiVendor3ds
	 */
	 public String getMpiVendor3ds() {
	 	return MpiVendor3ds;
	 }
	 
	/**
	 * Setter for MpiVendor3ds
	 */
	 public void setMpiVendor3ds(String MpiVendor3ds) {
	 	this.MpiVendor3ds = MpiVendor3ds;
	 }
	 
	/**
	 * Getter for AuthStatus3ds
	 */
	 public String getAuthStatus3ds() {
	 	return AuthStatus3ds;
	 }
	 
	/**
	 * Setter for AuthStatus3ds
	 */
	 public void setAuthStatus3ds(String AuthStatus3ds) {
	 	this.AuthStatus3ds = AuthStatus3ds;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Eci3ds != null) {
			sb.append("<ebl:Eci3ds>").append(SDKUtil.escapeInvalidXmlCharsRegex(Eci3ds));
			sb.append("</ebl:Eci3ds>");
		}
		if(Cavv != null) {
			sb.append("<ebl:Cavv>").append(SDKUtil.escapeInvalidXmlCharsRegex(Cavv));
			sb.append("</ebl:Cavv>");
		}
		if(Xid != null) {
			sb.append("<ebl:Xid>").append(SDKUtil.escapeInvalidXmlCharsRegex(Xid));
			sb.append("</ebl:Xid>");
		}
		if(MpiVendor3ds != null) {
			sb.append("<ebl:MpiVendor3ds>").append(SDKUtil.escapeInvalidXmlCharsRegex(MpiVendor3ds));
			sb.append("</ebl:MpiVendor3ds>");
		}
		if(AuthStatus3ds != null) {
			sb.append("<ebl:AuthStatus3ds>").append(SDKUtil.escapeInvalidXmlCharsRegex(AuthStatus3ds));
			sb.append("</ebl:AuthStatus3ds>");
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
		    this.Eci3ds = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Cavv", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Cavv = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Xid", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Xid = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("MpiVendor3ds", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.MpiVendor3ds = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AuthStatus3ds", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AuthStatus3ds = childNode.getTextContent();
		}
	
	}
 
}