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
 * UATP Card Details Type 
 */
public class UATPDetailsType{


	/**
	 * UATP Card Number	 
	 */ 
	private String UATPNumber;

	/**
	 * UATP Card expirty month	 
	 */ 
	private Integer ExpMonth;

	/**
	 * UATP Card expirty year	 
	 */ 
	private Integer ExpYear;

	

	/**
	 * Default Constructor
	 */
	public UATPDetailsType (){
	}	

	/**
	 * Getter for UATPNumber
	 */
	 public String getUATPNumber() {
	 	return UATPNumber;
	 }
	 
	/**
	 * Setter for UATPNumber
	 */
	 public void setUATPNumber(String UATPNumber) {
	 	this.UATPNumber = UATPNumber;
	 }
	 
	/**
	 * Getter for ExpMonth
	 */
	 public Integer getExpMonth() {
	 	return ExpMonth;
	 }
	 
	/**
	 * Setter for ExpMonth
	 */
	 public void setExpMonth(Integer ExpMonth) {
	 	this.ExpMonth = ExpMonth;
	 }
	 
	/**
	 * Getter for ExpYear
	 */
	 public Integer getExpYear() {
	 	return ExpYear;
	 }
	 
	/**
	 * Setter for ExpYear
	 */
	 public void setExpYear(Integer ExpYear) {
	 	this.ExpYear = ExpYear;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(UATPNumber != null) {
			sb.append("<ebl:UATPNumber>").append(UATPNumber);
			sb.append("</ebl:UATPNumber>");
		}
		if(ExpMonth != null) {
			sb.append("<ebl:ExpMonth>").append(ExpMonth);
			sb.append("</ebl:ExpMonth>");
		}
		if(ExpYear != null) {
			sb.append("<ebl:ExpYear>").append(ExpYear);
			sb.append("</ebl:ExpYear>");
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
	
	public UATPDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("UATPNumber").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("UATPNumber").item(0))) {
				this.UATPNumber = (String)document.getElementsByTagName("UATPNumber").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ExpMonth").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ExpMonth").item(0))) {
				this.ExpMonth = Integer.valueOf(document.getElementsByTagName("ExpMonth").item(0).getTextContent());
			}
		}
	
		if (document.getElementsByTagName("ExpYear").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ExpYear").item(0))) {
				this.ExpYear = Integer.valueOf(document.getElementsByTagName("ExpYear").item(0).getTextContent());
			}
		}
	
	}

}