package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.APIAuthenticationType;
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
 * APICredentialsType 
 */
public class APICredentialsType{


	/**
	 * Merchant’s PayPal API usernameCharacter length and
	 * limitations: 128 alphanumeric characters	 
	 */ 
	private String Username;

	/**
	 * Merchant’s PayPal API passwordCharacter length and
	 * limitations: 40 alphanumeric characters	 
	 */ 
	private String Password;

	/**
	 * Merchant’s PayPal API signature, if one exists. Character
	 * length and limitations: 256 alphanumeric characters	 
	 */ 
	private String Signature;

	/**
	 * Merchant’s PayPal API certificate in PEM format, if one
	 * exists The certificate consists of two parts: the private
	 * key (2,048 bytes) and the certificate proper (4,000 bytes).
	 * Character length and limitations: 6,048 alphanumeric
	 * characters	 
	 */ 
	private String Certificate;

	/**
	 * Merchant’s PayPal API authentication mechanism. Auth-None:
	 * no authentication mechanism on file Cert: API certificate
	 * Sign: API signature Character length and limitations: 9
	 * alphanumeric characters	 
	 */ 
	private APIAuthenticationType Type;

	

	/**
	 * Default Constructor
	 */
	public APICredentialsType (){
	}	

	/**
	 * Getter for Username
	 */
	 public String getUsername() {
	 	return Username;
	 }
	 
	/**
	 * Setter for Username
	 */
	 public void setUsername(String Username) {
	 	this.Username = Username;
	 }
	 
	/**
	 * Getter for Password
	 */
	 public String getPassword() {
	 	return Password;
	 }
	 
	/**
	 * Setter for Password
	 */
	 public void setPassword(String Password) {
	 	this.Password = Password;
	 }
	 
	/**
	 * Getter for Signature
	 */
	 public String getSignature() {
	 	return Signature;
	 }
	 
	/**
	 * Setter for Signature
	 */
	 public void setSignature(String Signature) {
	 	this.Signature = Signature;
	 }
	 
	/**
	 * Getter for Certificate
	 */
	 public String getCertificate() {
	 	return Certificate;
	 }
	 
	/**
	 * Setter for Certificate
	 */
	 public void setCertificate(String Certificate) {
	 	this.Certificate = Certificate;
	 }
	 
	/**
	 * Getter for Type
	 */
	 public APIAuthenticationType getType() {
	 	return Type;
	 }
	 
	/**
	 * Setter for Type
	 */
	 public void setType(APIAuthenticationType Type) {
	 	this.Type = Type;
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
	
	public APICredentialsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("Username").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Username").item(0))) {
				this.Username = (String)document.getElementsByTagName("Username").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Password").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Password").item(0))) {
				this.Password = (String)document.getElementsByTagName("Password").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Signature").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Signature").item(0))) {
				this.Signature = (String)document.getElementsByTagName("Signature").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Certificate").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Certificate").item(0))) {
				this.Certificate = (String)document.getElementsByTagName("Certificate").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("Type").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Type").item(0))) {
				this.Type = APIAuthenticationType.fromValue(document.getElementsByTagName("Type").item(0).getTextContent());
			}
		}
	}

}