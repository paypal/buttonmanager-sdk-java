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
 * Details of Risk Filter. 
 */
public class RiskFilterDetailsType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private Integer Id;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String Name;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String Description;

	

	/**
	 * Default Constructor
	 */
	public RiskFilterDetailsType (){
	}	

	/**
	 * Getter for Id
	 */
	 public Integer getId() {
	 	return Id;
	 }
	 
	/**
	 * Setter for Id
	 */
	 public void setId(Integer Id) {
	 	this.Id = Id;
	 }
	 
	/**
	 * Getter for Name
	 */
	 public String getName() {
	 	return Name;
	 }
	 
	/**
	 * Setter for Name
	 */
	 public void setName(String Name) {
	 	this.Name = Name;
	 }
	 
	/**
	 * Getter for Description
	 */
	 public String getDescription() {
	 	return Description;
	 }
	 
	/**
	 * Setter for Description
	 */
	 public void setDescription(String Description) {
	 	this.Description = Description;
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
	
	public RiskFilterDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("Id").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Id").item(0))) {
				this.Id = Integer.valueOf(document.getElementsByTagName("Id").item(0).getTextContent());
			}
		}
	
		if (document.getElementsByTagName("Name").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Name").item(0))) {
				this.Name = (String)document.getElementsByTagName("Name").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Description").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Description").item(0))) {
				this.Description = (String)document.getElementsByTagName("Description").item(0).getTextContent();
			}
		}
	
	}

}