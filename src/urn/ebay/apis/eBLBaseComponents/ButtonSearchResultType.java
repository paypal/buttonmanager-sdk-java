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
public class ButtonSearchResultType{


	/**
	 * No Document Comments	 
	 */ 
	private String HostedButtonID;

	/**
	 * No Document Comments	 
	 */ 
	private String ButtonType;

	/**
	 * No Document Comments	 
	 */ 
	private String ItemName;

	/**
	 * No Document Comments	 
	 */ 
	private String ModifyDate;

	

	/**
	 * Default Constructor
	 */
	public ButtonSearchResultType (){
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
	 
	/**
	 * Getter for ButtonType
	 */
	 public String getButtonType() {
	 	return ButtonType;
	 }
	 
	/**
	 * Setter for ButtonType
	 */
	 public void setButtonType(String ButtonType) {
	 	this.ButtonType = ButtonType;
	 }
	 
	/**
	 * Getter for ItemName
	 */
	 public String getItemName() {
	 	return ItemName;
	 }
	 
	/**
	 * Setter for ItemName
	 */
	 public void setItemName(String ItemName) {
	 	this.ItemName = ItemName;
	 }
	 
	/**
	 * Getter for ModifyDate
	 */
	 public String getModifyDate() {
	 	return ModifyDate;
	 }
	 
	/**
	 * Setter for ModifyDate
	 */
	 public void setModifyDate(String ModifyDate) {
	 	this.ModifyDate = ModifyDate;
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
	
	public ButtonSearchResultType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("HostedButtonID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("HostedButtonID").item(0))) {
				this.HostedButtonID = (String)document.getElementsByTagName("HostedButtonID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ButtonType").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ButtonType").item(0))) {
				this.ButtonType = (String)document.getElementsByTagName("ButtonType").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ItemName").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ItemName").item(0))) {
				this.ItemName = (String)document.getElementsByTagName("ItemName").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ModifyDate").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ModifyDate").item(0))) {
				this.ModifyDate = (String)document.getElementsByTagName("ModifyDate").item(0).getTextContent();
			}
		}
	
	}

}