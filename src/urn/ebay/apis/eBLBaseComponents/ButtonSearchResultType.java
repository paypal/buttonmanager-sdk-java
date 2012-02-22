
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
 */
public class ButtonSearchResultType {

	/**
	 */
	private String HostedButtonID;
	public String getHostedButtonID() {
		return HostedButtonID;
	}
	public void setHostedButtonID(String value) {
		this.HostedButtonID = value;
	}

	/**
	 */
	private String ButtonType;
	public String getButtonType() {
		return ButtonType;
	}
	public void setButtonType(String value) {
		this.ButtonType = value;
	}

	/**
	 */
	private String ItemName;
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String value) {
		this.ItemName = value;
	}

	/**
	 */
	private String ModifyDate;
	public String getModifyDate() {
		return ModifyDate;
	}
	public void setModifyDate(String value) {
		this.ModifyDate = value;
	}


	public ButtonSearchResultType() {
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
	 public ButtonSearchResultType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("HostedButtonID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("HostedButtonID").item(0))){ 
		 this.HostedButtonID =(String)document.getElementsByTagName("HostedButtonID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ButtonType").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ButtonType").item(0))){ 
		 this.ButtonType =(String)document.getElementsByTagName("ButtonType").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ItemName").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ItemName").item(0))){ 
		 this.ItemName =(String)document.getElementsByTagName("ItemName").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ModifyDate").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ModifyDate").item(0))){ 
		 this.ModifyDate =(String)document.getElementsByTagName("ModifyDate").item(0).getTextContent();

}
	}
	}
}
