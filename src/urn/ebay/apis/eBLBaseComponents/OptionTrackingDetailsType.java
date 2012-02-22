
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
 * Option Number.
 * Optional
 */
public class OptionTrackingDetailsType {

	/**
	 * Option Number.
	 * Optional
	 */
	private String OptionNumber;
	public String getOptionNumber() {
		return OptionNumber;
	}
	public void setOptionNumber(String value) {
		this.OptionNumber = value;
	}

	/**
	 * Option Quantity.
	 * Optional
	 */
	private String OptionQty;
	public String getOptionQty() {
		return OptionQty;
	}
	public void setOptionQty(String value) {
		this.OptionQty = value;
	}

	/**
	 * Option Select Name.
	 * Optional
	 */
	private String OptionSelect;
	public String getOptionSelect() {
		return OptionSelect;
	}
	public void setOptionSelect(String value) {
		this.OptionSelect = value;
	}

	/**
	 * Option Quantity Delta.
	 * Optional
	 */
	private String OptionQtyDelta;
	public String getOptionQtyDelta() {
		return OptionQtyDelta;
	}
	public void setOptionQtyDelta(String value) {
		this.OptionQtyDelta = value;
	}

	/**
	 * Option Alert.
	 * Optional
	 */
	private String OptionAlert;
	public String getOptionAlert() {
		return OptionAlert;
	}
	public void setOptionAlert(String value) {
		this.OptionAlert = value;
	}

	/**
	 * Option Cost.
	 * Optional
	 */
	private String OptionCost;
	public String getOptionCost() {
		return OptionCost;
	}
	public void setOptionCost(String value) {
		this.OptionCost = value;
	}


	public OptionTrackingDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( OptionNumber != null ) {
			sb.append("<ebl:OptionNumber>").append(OptionNumber);
			sb.append("</ebl:OptionNumber>");
		}
		if( OptionQty != null ) {
			sb.append("<ebl:OptionQty>").append(OptionQty);
			sb.append("</ebl:OptionQty>");
		}
		if( OptionSelect != null ) {
			sb.append("<ebl:OptionSelect>").append(OptionSelect);
			sb.append("</ebl:OptionSelect>");
		}
		if( OptionQtyDelta != null ) {
			sb.append("<ebl:OptionQtyDelta>").append(OptionQtyDelta);
			sb.append("</ebl:OptionQtyDelta>");
		}
		if( OptionAlert != null ) {
			sb.append("<ebl:OptionAlert>").append(OptionAlert);
			sb.append("</ebl:OptionAlert>");
		}
		if( OptionCost != null ) {
			sb.append("<ebl:OptionCost>").append(OptionCost);
			sb.append("</ebl:OptionCost>");
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
	 public OptionTrackingDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("OptionNumber").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OptionNumber").item(0))){ 
		 this.OptionNumber =(String)document.getElementsByTagName("OptionNumber").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("OptionQty").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OptionQty").item(0))){ 
		 this.OptionQty =(String)document.getElementsByTagName("OptionQty").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("OptionSelect").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OptionSelect").item(0))){ 
		 this.OptionSelect =(String)document.getElementsByTagName("OptionSelect").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("OptionQtyDelta").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OptionQtyDelta").item(0))){ 
		 this.OptionQtyDelta =(String)document.getElementsByTagName("OptionQtyDelta").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("OptionAlert").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OptionAlert").item(0))){ 
		 this.OptionAlert =(String)document.getElementsByTagName("OptionAlert").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("OptionCost").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OptionCost").item(0))){ 
		 this.OptionCost =(String)document.getElementsByTagName("OptionCost").item(0).getTextContent();

}
	}
	}
}
