package urn.ebay.apis.eBLBaseComponents;
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
 * The first name of the User. Character length and
 * limitations: 127 single-byte alphanumeric characters 
 */
public class GetAuthDetailsResponseDetailsType{


	/**
	 * The first name of the User. Character length and
	 * limitations: 127 single-byte alphanumeric characters	 
	 */ 
	private String FirstName;

	/**
	 * The Last name of the user. Character length and limitations:
	 * 127 single-byte alphanumeric characters	 
	 */ 
	private String LastName;

	/**
	 * The email address of the user. Character length and
	 * limitations: 256 single-byte alphanumeric characters. 	 
	 */ 
	private String Email;

	/**
	 * Encrypted PayPal customer account identification number.
	 * Required Character length and limitations: 127 single-byte
	 * characters.	 
	 */ 
	private String PayerID;

	

	/**
	 * Default Constructor
	 */
	public GetAuthDetailsResponseDetailsType (){
	}	

	/**
	 * Getter for FirstName
	 */
	 public String getFirstName() {
	 	return FirstName;
	 }
	 
	/**
	 * Setter for FirstName
	 */
	 public void setFirstName(String FirstName) {
	 	this.FirstName = FirstName;
	 }
	 
	/**
	 * Getter for LastName
	 */
	 public String getLastName() {
	 	return LastName;
	 }
	 
	/**
	 * Setter for LastName
	 */
	 public void setLastName(String LastName) {
	 	this.LastName = LastName;
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
	 * Getter for PayerID
	 */
	 public String getPayerID() {
	 	return PayerID;
	 }
	 
	/**
	 * Setter for PayerID
	 */
	 public void setPayerID(String PayerID) {
	 	this.PayerID = PayerID;
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
	
	public GetAuthDetailsResponseDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("FirstName").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("FirstName").item(0))) {
				this.FirstName = (String)document.getElementsByTagName("FirstName").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("LastName").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("LastName").item(0))) {
				this.LastName = (String)document.getElementsByTagName("LastName").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Email").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Email").item(0))) {
				this.Email = (String)document.getElementsByTagName("Email").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("PayerID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PayerID").item(0))) {
				this.PayerID = (String)document.getElementsByTagName("PayerID").item(0).getTextContent();
			}
		}
	
	}

}