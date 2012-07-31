package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.RiskFilterListType;
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
 * Thes are filters that could result in accept/deny/pending
 * action. 
 */
public class FMFDetailsType{


	/**
	 * 	 
	 */ 
	private RiskFilterListType AcceptFilters;

	/**
	 * 	 
	 */ 
	private RiskFilterListType PendingFilters;

	/**
	 * 	 
	 */ 
	private RiskFilterListType DenyFilters;

	/**
	 * 	 
	 */ 
	private RiskFilterListType ReportFilters;

	

	/**
	 * Default Constructor
	 */
	public FMFDetailsType (){
	}	

	/**
	 * Getter for AcceptFilters
	 */
	 public RiskFilterListType getAcceptFilters() {
	 	return AcceptFilters;
	 }
	 
	/**
	 * Setter for AcceptFilters
	 */
	 public void setAcceptFilters(RiskFilterListType AcceptFilters) {
	 	this.AcceptFilters = AcceptFilters;
	 }
	 
	/**
	 * Getter for PendingFilters
	 */
	 public RiskFilterListType getPendingFilters() {
	 	return PendingFilters;
	 }
	 
	/**
	 * Setter for PendingFilters
	 */
	 public void setPendingFilters(RiskFilterListType PendingFilters) {
	 	this.PendingFilters = PendingFilters;
	 }
	 
	/**
	 * Getter for DenyFilters
	 */
	 public RiskFilterListType getDenyFilters() {
	 	return DenyFilters;
	 }
	 
	/**
	 * Setter for DenyFilters
	 */
	 public void setDenyFilters(RiskFilterListType DenyFilters) {
	 	this.DenyFilters = DenyFilters;
	 }
	 
	/**
	 * Getter for ReportFilters
	 */
	 public RiskFilterListType getReportFilters() {
	 	return ReportFilters;
	 }
	 
	/**
	 * Setter for ReportFilters
	 */
	 public void setReportFilters(RiskFilterListType ReportFilters) {
	 	this.ReportFilters = ReportFilters;
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
	
	public FMFDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if(document.getElementsByTagName("AcceptFilters").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("AcceptFilters").item(0))) {
				nodeList = document.getElementsByTagName("AcceptFilters");
				xmlString = convertToXML(nodeList.item(0));
				this.AcceptFilters =  new RiskFilterListType(xmlString);
			}
		}
		if(document.getElementsByTagName("PendingFilters").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PendingFilters").item(0))) {
				nodeList = document.getElementsByTagName("PendingFilters");
				xmlString = convertToXML(nodeList.item(0));
				this.PendingFilters =  new RiskFilterListType(xmlString);
			}
		}
		if(document.getElementsByTagName("DenyFilters").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("DenyFilters").item(0))) {
				nodeList = document.getElementsByTagName("DenyFilters");
				xmlString = convertToXML(nodeList.item(0));
				this.DenyFilters =  new RiskFilterListType(xmlString);
			}
		}
		if(document.getElementsByTagName("ReportFilters").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ReportFilters").item(0))) {
				nodeList = document.getElementsByTagName("ReportFilters");
				xmlString = convertToXML(nodeList.item(0));
				this.ReportFilters =  new RiskFilterListType(xmlString);
			}
		}
	}

}