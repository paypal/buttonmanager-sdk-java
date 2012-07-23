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
 * No Document Comments
 */
public class PersonNameType{


	/**
	 * No Document Comments	 
	 */ 
	private String Salutation;

	/**
	 * No Document Comments	 
	 */ 
	private String FirstName;

	/**
	 * No Document Comments	 
	 */ 
	private String MiddleName;

	/**
	 * No Document Comments	 
	 */ 
	private String LastName;

	/**
	 * No Document Comments	 
	 */ 
	private String Suffix;

	

	/**
	 * Default Constructor
	 */
	public PersonNameType (){
	}	

	/**
	 * Getter for Salutation
	 */
	 public String getSalutation() {
	 	return Salutation;
	 }
	 
	/**
	 * Setter for Salutation
	 */
	 public void setSalutation(String Salutation) {
	 	this.Salutation = Salutation;
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
	 * Getter for MiddleName
	 */
	 public String getMiddleName() {
	 	return MiddleName;
	 }
	 
	/**
	 * Setter for MiddleName
	 */
	 public void setMiddleName(String MiddleName) {
	 	this.MiddleName = MiddleName;
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
	 * Getter for Suffix
	 */
	 public String getSuffix() {
	 	return Suffix;
	 }
	 
	/**
	 * Setter for Suffix
	 */
	 public void setSuffix(String Suffix) {
	 	this.Suffix = Suffix;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Salutation != null) {
			sb.append("<ebl:Salutation>").append(Salutation);
			sb.append("</ebl:Salutation>");
		}
		if(FirstName != null) {
			sb.append("<ebl:FirstName>").append(FirstName);
			sb.append("</ebl:FirstName>");
		}
		if(MiddleName != null) {
			sb.append("<ebl:MiddleName>").append(MiddleName);
			sb.append("</ebl:MiddleName>");
		}
		if(LastName != null) {
			sb.append("<ebl:LastName>").append(LastName);
			sb.append("</ebl:LastName>");
		}
		if(Suffix != null) {
			sb.append("<ebl:Suffix>").append(Suffix);
			sb.append("</ebl:Suffix>");
		}
		return sb.toString();
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
	
	public PersonNameType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("Salutation").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Salutation").item(0))) {
				this.Salutation = (String)document.getElementsByTagName("Salutation").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("FirstName").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("FirstName").item(0))) {
				this.FirstName = (String)document.getElementsByTagName("FirstName").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("MiddleName").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("MiddleName").item(0))) {
				this.MiddleName = (String)document.getElementsByTagName("MiddleName").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("LastName").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("LastName").item(0))) {
				this.LastName = (String)document.getElementsByTagName("LastName").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Suffix").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Suffix").item(0))) {
				this.Suffix = (String)document.getElementsByTagName("Suffix").item(0).getTextContent();
			}
		}
	
	}

}