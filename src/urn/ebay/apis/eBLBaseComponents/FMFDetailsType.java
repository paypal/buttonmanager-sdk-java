
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
import urn.ebay.apis.eBLBaseComponents.RiskFilterListType;


/**
 * Thes are filters that could result in accept/deny/pending action.
 */
public class FMFDetailsType {

	/**
	 */
	private RiskFilterListType AcceptFilters;
	public RiskFilterListType getAcceptFilters() {
		return AcceptFilters;
	}
	public void setAcceptFilters(RiskFilterListType value) {
		this.AcceptFilters = value;
	}

	/**
	 */
	private RiskFilterListType PendingFilters;
	public RiskFilterListType getPendingFilters() {
		return PendingFilters;
	}
	public void setPendingFilters(RiskFilterListType value) {
		this.PendingFilters = value;
	}

	/**
	 */
	private RiskFilterListType DenyFilters;
	public RiskFilterListType getDenyFilters() {
		return DenyFilters;
	}
	public void setDenyFilters(RiskFilterListType value) {
		this.DenyFilters = value;
	}

	/**
	 */
	private RiskFilterListType ReportFilters;
	public RiskFilterListType getReportFilters() {
		return ReportFilters;
	}
	public void setReportFilters(RiskFilterListType value) {
		this.ReportFilters = value;
	}


	public FMFDetailsType() {
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
	 public FMFDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("AcceptFilters").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AcceptFilters").item(0))){ 
		 nodeList = document.getElementsByTagName("AcceptFilters");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.AcceptFilters =  new RiskFilterListType(xmlString);

}
	}
		 if(document.getElementsByTagName("PendingFilters").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PendingFilters").item(0))){ 
		 nodeList = document.getElementsByTagName("PendingFilters");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.PendingFilters =  new RiskFilterListType(xmlString);

}
	}
		 if(document.getElementsByTagName("DenyFilters").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("DenyFilters").item(0))){ 
		 nodeList = document.getElementsByTagName("DenyFilters");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.DenyFilters =  new RiskFilterListType(xmlString);

}
	}
		 if(document.getElementsByTagName("ReportFilters").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ReportFilters").item(0))){ 
		 nodeList = document.getElementsByTagName("ReportFilters");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.ReportFilters =  new RiskFilterListType(xmlString);

}
	}
	}
}
