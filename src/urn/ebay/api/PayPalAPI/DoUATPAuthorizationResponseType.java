
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

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
import urn.ebay.api.PayPalAPI.DoAuthorizationResponseType;
import urn.ebay.apis.eBLBaseComponents.UATPDetailsType;


/**
 * Auth Authorization Code.
 */
public class DoUATPAuthorizationResponseType extends DoAuthorizationResponseType{

	/**
	 *
	 * @Required
	 */
	private UATPDetailsType UATPDetails;
	public UATPDetailsType getUATPDetails() {
		return UATPDetails;
	}
	public void setUATPDetails(UATPDetailsType value) {
		this.UATPDetails = value;
	}

	/**
	 * Auth Authorization Code.
	 *
	 * @Required
	 */
	private String AuthorizationCode;
	public String getAuthorizationCode() {
		return AuthorizationCode;
	}
	public void setAuthorizationCode(String value) {
		this.AuthorizationCode = value;
	}

	/**
	 * Invoice ID. A pass through.
	 */
	private String InvoiceID;
	public String getInvoiceID() {
		return InvoiceID;
	}
	public void setInvoiceID(String value) {
		this.InvoiceID = value;
	}


	public DoUATPAuthorizationResponseType() {
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
	 public DoUATPAuthorizationResponseType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 super(xmlSoap); 
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("UATPDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("UATPDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("UATPDetails");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.UATPDetails =  new UATPDetailsType(xmlString);

}
	}
		 if(document.getElementsByTagName("AuthorizationCode").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AuthorizationCode").item(0))){ 
		 this.AuthorizationCode =(String)document.getElementsByTagName("AuthorizationCode").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("InvoiceID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("InvoiceID").item(0))){ 
		 this.InvoiceID =(String)document.getElementsByTagName("InvoiceID").item(0).getTextContent();

}
	}
	}
}
