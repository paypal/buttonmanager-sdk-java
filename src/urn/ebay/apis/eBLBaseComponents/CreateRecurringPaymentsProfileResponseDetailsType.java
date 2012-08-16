package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.RecurringPaymentsProfileStatusType;
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
		} else if (n.getNodeType() == Node.ELEMENT_NODE ){
			return (n.getChildNodes().getLength() == 0);
		} else {
			return false;
		}
	}
	
	private String convertToXML(Node n){
		String name = n.getNodeName();
		short type = n.getNodeType();
		if (Node.CDATA_SECTION_NODE == type) {
			return "<![CDATA[" + n.getNodeValue() + "]]&gt;";
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
	
	public CreateRecurringPaymentsProfileResponseDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("ProfileID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ProfileID").item(0))) {
				this.ProfileID = (String)document.getElementsByTagName("ProfileID").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("ProfileStatus").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ProfileStatus").item(0))) {
				this.ProfileStatus = RecurringPaymentsProfileStatusType.fromValue(document.getElementsByTagName("ProfileStatus").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("TransactionID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TransactionID").item(0))) {
				this.TransactionID = (String)document.getElementsByTagName("TransactionID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("DCCProcessorResponse").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("DCCProcessorResponse").item(0))) {
				this.DCCProcessorResponse = (String)document.getElementsByTagName("DCCProcessorResponse").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("DCCReturnCode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("DCCReturnCode").item(0))) {
				this.DCCReturnCode = (String)document.getElementsByTagName("DCCReturnCode").item(0).getTextContent();
			}
		}
	
	}
 
}