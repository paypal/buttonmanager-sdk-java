package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.UATPDetailsType;
import urn.ebay.api.PayPalAPI.DoAuthorizationResponseType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
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
 * Auth Authorization Code. 
 */
public class DoUATPAuthorizationResponseType extends DoAuthorizationResponseType {


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private UATPDetailsType UATPDetails;

	/**
	 * Auth Authorization Code. 	  
	 *@Required	 
	 */ 
	private String AuthorizationCode;

	/**
	 * Invoice ID. A pass through. 	 
	 */ 
	private String InvoiceID;

	/**
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String MsgSubID;

	

	/**
	 * Default Constructor
	 */
	public DoUATPAuthorizationResponseType (){
	}	

	/**
	 * Getter for UATPDetails
	 */
	 public UATPDetailsType getUATPDetails() {
	 	return UATPDetails;
	 }
	 
	/**
	 * Setter for UATPDetails
	 */
	 public void setUATPDetails(UATPDetailsType UATPDetails) {
	 	this.UATPDetails = UATPDetails;
	 }
	 
	/**
	 * Getter for AuthorizationCode
	 */
	 public String getAuthorizationCode() {
	 	return AuthorizationCode;
	 }
	 
	/**
	 * Setter for AuthorizationCode
	 */
	 public void setAuthorizationCode(String AuthorizationCode) {
	 	this.AuthorizationCode = AuthorizationCode;
	 }
	 
	/**
	 * Getter for InvoiceID
	 */
	 public String getInvoiceID() {
	 	return InvoiceID;
	 }
	 
	/**
	 * Setter for InvoiceID
	 */
	 public void setInvoiceID(String InvoiceID) {
	 	this.InvoiceID = InvoiceID;
	 }
	 
	/**
	 * Getter for MsgSubID
	 */
	 public String getMsgSubID() {
	 	return MsgSubID;
	 }
	 
	/**
	 * Setter for MsgSubID
	 */
	 public void setMsgSubID(String MsgSubID) {
	 	this.MsgSubID = MsgSubID;
	 }
	 


	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else {
			return false;
		}
	}
	
	private String convertToXML(Node n){
		String name = n.getNodeName();
		short type = n.getNodeType();
		if (Node.CDATA_SECTION_NODE == type) {
			return "&lt![CDATA[\" + n.getNodeValue() + \"]]&gt";
		}
		if (name.startsWith("#")) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		sb.append("<").append(name);
		NamedNodeMap attrs = n.getAttributes();
		if (attrs != null) {
			for (int i = 0; i < attrs.getLength(); i++) {
				Node attr = attrs.item(i);
				sb.append(" ").append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
			}
		}
		String textContent = null;
		NodeList children = n.getChildNodes();
		if (children.getLength() == 0) {
			if (((textContent = n.getTextContent())) != null && (!"".equals(textContent))) {
				sb.append(textContent).append("</").append(name).append(">");
			} else {
				sb.append("/>");
			}
		} else {
			sb.append(">");
			boolean hasValidChildren = false;
			for (int i = 0; i < children.getLength(); i++) {
				String childToString = convertToXML(children.item(i));
				if (!"".equals(childToString)) {
					sb.append(childToString);
					hasValidChildren = true;
				}
			}
			if (!hasValidChildren && ((textContent = n.getTextContent()) != null)) {
				sb.append(textContent);
			}
			sb.append("</").append(name).append(">");
		}
		return sb.toString();
	}
	
	public DoUATPAuthorizationResponseType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		super(xmlSoap);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if(document.getElementsByTagName("UATPDetails").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("UATPDetails").item(0))) {
				nodeList = document.getElementsByTagName("UATPDetails");
				xmlString = convertToXML(nodeList.item(0));
				this.UATPDetails =  new UATPDetailsType(xmlString);
			}
		}
		if (document.getElementsByTagName("AuthorizationCode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("AuthorizationCode").item(0))) {
				this.AuthorizationCode = (String)document.getElementsByTagName("AuthorizationCode").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("InvoiceID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("InvoiceID").item(0))) {
				this.InvoiceID = (String)document.getElementsByTagName("InvoiceID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("MsgSubID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("MsgSubID").item(0))) {
				this.MsgSubID = (String)document.getElementsByTagName("MsgSubID").item(0).getTextContent();
			}
		}
	
	}

}