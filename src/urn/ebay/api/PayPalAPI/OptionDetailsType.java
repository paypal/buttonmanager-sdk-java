
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import urn.ebay.api.PayPalAPI.OptionSelectionDetailsType;


/**
 * Option Name.
 * Optional
 */
public class OptionDetailsType {

	/**
	 * Option Name.
	 * Optional
	 *
	 * @Required
	 */
	private String OptionName;
	public String getOptionName() {
		return OptionName;
	}
	public void setOptionName(String value) {
		this.OptionName = value;
	}

	/**
	 */
	private List<OptionSelectionDetailsType> OptionSelectionDetails = new ArrayList<OptionSelectionDetailsType>();
	public List<OptionSelectionDetailsType> getOptionSelectionDetails() {
		return OptionSelectionDetails;
	}
	public void setOptionSelectionDetails(List<OptionSelectionDetailsType> value) {
		this.OptionSelectionDetails = value;
	}


	public OptionDetailsType(String OptionName) {
		this.OptionName = OptionName;
	}
	public OptionDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( OptionName != null ) {
			sb.append("<urn:OptionName>").append(OptionName);
			sb.append("</urn:OptionName>");
		}
		if( OptionSelectionDetails != null ) {
			for(int i=0; i<OptionSelectionDetails.size(); i++) {
				sb.append("<urn:OptionSelectionDetails>");
				sb.append(OptionSelectionDetails.get(i).toXMLString());
				sb.append("</urn:OptionSelectionDetails>");
			}
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
	 public OptionDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("OptionName").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OptionName").item(0))){ 
		 this.OptionName =(String)document.getElementsByTagName("OptionName").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("OptionSelectionDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OptionSelectionDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("OptionSelectionDetails");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 xmlString = convertToXML(nodeList.item(i)); 
				this.OptionSelectionDetails.add(new OptionSelectionDetailsType(xmlString));
			}

}
	}
	}
}
