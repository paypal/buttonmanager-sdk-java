
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


/**
 * Response information resulting from opt-in operation or current login bypass status.
 */
public class ExternalRememberMeStatusDetailsType {

	/**
	 * Required field that reports status of opt-in or login bypass attempt.
	 * 0 = Success - successful opt-in or ExternalRememberMeID specified in SetExpressCheckout
	 * is valid.
	 * 1 = Invalid ID - ExternalRememberMeID specified in SetExpressCheckout is invalid.
	 * 2 = Internal Error - System error or outage during opt-in or login bypass.  Can retry
	 * opt-in or login bypass next time.  Flow will force full authentication and allow buyer
	 * to complete transaction.
	 * -1 = None - the return value does not signify any valid remember me status.
	 *
	 * @Required
	 */
	private Integer ExternalRememberMeStatus;
	public Integer getExternalRememberMeStatus() {
		return ExternalRememberMeStatus;
	}
	public void setExternalRememberMeStatus(Integer value) {
		this.ExternalRememberMeStatus = value;
	}

	/**
	 * Identifier returned on external-remember-me-opt-in to allow the merchant to request
	 * bypass of PayPal login through external remember me on behalf of the buyer in future
	 * transactions.  The ExternalRememberMeID is a 17-character alphanumeric (encrypted)
	 * string.  This field has meaning only to the merchant.
	 */
	private String ExternalRememberMeID;
	public String getExternalRememberMeID() {
		return ExternalRememberMeID;
	}
	public void setExternalRememberMeID(String value) {
		this.ExternalRememberMeID = value;
	}


	public ExternalRememberMeStatusDetailsType() {
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
	 public ExternalRememberMeStatusDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("ExternalRememberMeStatus").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ExternalRememberMeStatus").item(0))){ 
		 this.ExternalRememberMeStatus =Integer.valueOf(document.getElementsByTagName("ExternalRememberMeStatus").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("ExternalRememberMeID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ExternalRememberMeID").item(0))){ 
		 this.ExternalRememberMeID =(String)document.getElementsByTagName("ExternalRememberMeID").item(0).getTextContent();

}
	}
	}
}
