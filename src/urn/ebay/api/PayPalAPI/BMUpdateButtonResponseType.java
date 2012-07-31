package urn.ebay.api.PayPalAPI;
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
 * 
 */
public class BMUpdateButtonResponseType extends AbstractResponseType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private String Website;

	/**
	 * 	 
	 */ 
	private String Email;

	/**
	 * 	 
	 */ 
	private String Mobile;

	/**
	 * 	 
	 */ 
	private String HostedButtonID;

	

	/**
	 * Default Constructor
	 */
	public BMUpdateButtonResponseType (){
	}	

	/**
	 * Getter for Website
	 */
	 public String getWebsite() {
	 	return Website;
	 }
	 
	/**
	 * Setter for Website
	 */
	 public void setWebsite(String Website) {
	 	this.Website = Website;
	 }
	 
	/**
	 * Getter for Email
	 */
	 public String getEmail() {
	 	return Email;
	 }
	 
	/**
	 * Setter for Email
	 */
	 public void setEmail(String Email) {
	 	this.Email = Email;
	 }
	 
	/**
	 * Getter for Mobile
	 */
	 public String getMobile() {
	 	return Mobile;
	 }
	 
	/**
	 * Setter for Mobile
	 */
	 public void setMobile(String Mobile) {
	 	this.Mobile = Mobile;
	 }
	 
	/**
	 * Getter for HostedButtonID
	 */
	 public String getHostedButtonID() {
	 	return HostedButtonID;
	 }
	 
	/**
	 * Setter for HostedButtonID
	 */
	 public void setHostedButtonID(String HostedButtonID) {
	 	this.HostedButtonID = HostedButtonID;
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
	
	public BMUpdateButtonResponseType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		super(xmlSoap);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("Website").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Website").item(0))) {
				this.Website = (String)document.getElementsByTagName("Website").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Email").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Email").item(0))) {
				this.Email = (String)document.getElementsByTagName("Email").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Mobile").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Mobile").item(0))) {
				this.Mobile = (String)document.getElementsByTagName("Mobile").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("HostedButtonID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("HostedButtonID").item(0))) {
				this.HostedButtonID = (String)document.getElementsByTagName("HostedButtonID").item(0).getTextContent();
			}
		}
	
	}

}