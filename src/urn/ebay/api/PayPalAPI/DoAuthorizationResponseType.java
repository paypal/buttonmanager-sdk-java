package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AuthorizationInfoType;
import urn.ebay.apis.eBLBaseComponents.AbstractResponseType;
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
 * An authorization identification number. Character length and
 * limits: 19 single-byte characters 
 */
public class DoAuthorizationResponseType extends AbstractResponseType {


	/**
	 * An authorization identification number. Character length and
	 * limits: 19 single-byte characters	  
	 *@Required	 
	 */ 
	private String TransactionID;

	/**
	 * The amount and currency you specified in the request. 	  
	 *@Required	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * No Document Comments	 
	 */ 
	private AuthorizationInfoType AuthorizationInfo;

	/**
	 * Return msgsubid back to merchant	 
	 */ 
	private String MsgSubID;

	

	/**
	 * Default Constructor
	 */
	public DoAuthorizationResponseType (){
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
	 * Getter for Amount
	 */
	 public BasicAmountType getAmount() {
	 	return Amount;
	 }
	 
	/**
	 * Setter for Amount
	 */
	 public void setAmount(BasicAmountType Amount) {
	 	this.Amount = Amount;
	 }
	 
	/**
	 * Getter for AuthorizationInfo
	 */
	 public AuthorizationInfoType getAuthorizationInfo() {
	 	return AuthorizationInfo;
	 }
	 
	/**
	 * Setter for AuthorizationInfo
	 */
	 public void setAuthorizationInfo(AuthorizationInfoType AuthorizationInfo) {
	 	this.AuthorizationInfo = AuthorizationInfo;
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
	
	public DoAuthorizationResponseType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		super(xmlSoap);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("TransactionID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TransactionID").item(0))) {
				this.TransactionID = (String)document.getElementsByTagName("TransactionID").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("Amount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Amount").item(0))) {
				nodeList = document.getElementsByTagName("Amount");
				xmlString = convertToXML(nodeList.item(0));
				this.Amount =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("AuthorizationInfo").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("AuthorizationInfo").item(0))) {
				nodeList = document.getElementsByTagName("AuthorizationInfo");
				xmlString = convertToXML(nodeList.item(0));
				this.AuthorizationInfo =  new AuthorizationInfoType(xmlString);
			}
		}
		if (document.getElementsByTagName("MsgSubID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("MsgSubID").item(0))) {
				this.MsgSubID = (String)document.getElementsByTagName("MsgSubID").item(0).getTextContent();
			}
		}
	
	}

}