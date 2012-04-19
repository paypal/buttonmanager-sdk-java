
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import urn.ebay.apis.eBLBaseComponents.RecurringPaymentsProfileStatusType;


/**
 * Recurring Billing Profile ID
 */
public class CreateRecurringPaymentsProfileResponseDetailsType {

	/**
	 * Recurring Billing Profile ID
	 *
	 * @Required
	 */
	private String ProfileID;
	public String getProfileID() {
		return ProfileID;
	}
	public void setProfileID(String value) {
		this.ProfileID = value;
	}

	/**
	 * Recurring Billing Profile Status
	 */
	private RecurringPaymentsProfileStatusType ProfileStatus;
	public RecurringPaymentsProfileStatusType getProfileStatus() {
		return ProfileStatus;
	}
	public void setProfileStatus(RecurringPaymentsProfileStatusType value) {
		this.ProfileStatus = value;
	}

	/**
	 * Transaction id from DCC initial payment
	 */
	private String TransactionID;
	public String getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(String value) {
		this.TransactionID = value;
	}

	/**
	 * Response from DCC initial payment
	 */
	private String DCCProcessorResponse;
	public String getDCCProcessorResponse() {
		return DCCProcessorResponse;
	}
	public void setDCCProcessorResponse(String value) {
		this.DCCProcessorResponse = value;
	}

	/**
	 * Return code if DCC initial payment fails
	 */
	private String DCCReturnCode;
	public String getDCCReturnCode() {
		return DCCReturnCode;
	}
	public void setDCCReturnCode(String value) {
		this.DCCReturnCode = value;
	}


	public CreateRecurringPaymentsProfileResponseDetailsType() {
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
			  return "<![CDATA[" + n.getNodeValue() + "]]&gt;";
		 } 
		 if (name.startsWith("#")) {
			  return "";
		} 
		 StringBuffer sb = new StringBuffer();
		 sb.append('<').append(name);
		 NamedNodeMap attrs = n.getAttributes();
		 if (attrs != null) { 
		  for (int i = 0; i < attrs.getLength(); i++) { 
			    Node attr = attrs.item(i);
			    sb.append(' ').append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
		  }
		 } 
		 String textContent = null; 
		 NodeList children = n.getChildNodes(); 
		 if (children.getLength() == 0) { 
		  if ((textContent = n.getTextContent()) != null && !"".equals(textContent)) {
		    sb.append(textContent).append("</").append(name).append('>'); 
		  } else { 
		    sb.append("/>"); 
		  } 
		 } else { 
		  sb.append('>'); 
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
		  sb.append("</").append(name).append('>');
		 }
		 return sb.toString();
	 } 
	 public CreateRecurringPaymentsProfileResponseDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("ProfileID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ProfileID").item(0))){ 
		 this.ProfileID =(String)document.getElementsByTagName("ProfileID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ProfileStatus").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ProfileStatus").item(0))){ 
		 this.ProfileStatus = RecurringPaymentsProfileStatusType.fromValue(document.getElementsByTagName("ProfileStatus").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("TransactionID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TransactionID").item(0))){ 
		 this.TransactionID =(String)document.getElementsByTagName("TransactionID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("DCCProcessorResponse").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("DCCProcessorResponse").item(0))){ 
		 this.DCCProcessorResponse =(String)document.getElementsByTagName("DCCProcessorResponse").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("DCCReturnCode").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("DCCReturnCode").item(0))){ 
		 this.DCCReturnCode =(String)document.getElementsByTagName("DCCReturnCode").item(0).getTextContent();

}
	}
	}
}
