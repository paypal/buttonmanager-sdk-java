
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
 * Details about the payer's tax info passed in by the merchant or partner.
 * Optional.
 */
public class TaxIdDetailsType {

	/**
	 * The payer's Tax ID type; CNPJ/CPF for BR country.
	 */
	private String TaxIdType;
	public String getTaxIdType() {
		return TaxIdType;
	}
	public void setTaxIdType(String value) {
		this.TaxIdType = value;
	}

	/**
	 * The payer's Tax ID
	 */
	private String TaxId;
	public String getTaxId() {
		return TaxId;
	}
	public void setTaxId(String value) {
		this.TaxId = value;
	}


	public TaxIdDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( TaxIdType != null ) {
			sb.append("<ebl:TaxIdType>").append(TaxIdType);
			sb.append("</ebl:TaxIdType>");
		}
		if( TaxId != null ) {
			sb.append("<ebl:TaxId>").append(TaxId);
			sb.append("</ebl:TaxId>");
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
	 public TaxIdDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("TaxIdType").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TaxIdType").item(0))){ 
		 this.TaxIdType =(String)document.getElementsByTagName("TaxIdType").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("TaxId").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TaxId").item(0))){ 
		 this.TaxId =(String)document.getElementsByTagName("TaxId").item(0).getTextContent();

}
	}
	}
}
