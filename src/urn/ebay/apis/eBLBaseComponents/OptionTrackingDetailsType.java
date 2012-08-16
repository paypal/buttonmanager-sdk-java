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
 * Option Number. Optional 
 */
public class OptionTrackingDetailsType{


	/**
	 * Option Number. Optional 	 
	 */ 
	private String OptionNumber;

	/**
	 * Option Quantity. Optional 	 
	 */ 
	private String OptionQty;

	/**
	 * Option Select Name. Optional 	 
	 */ 
	private String OptionSelect;

	/**
	 * Option Quantity Delta. Optional 	 
	 */ 
	private String OptionQtyDelta;

	/**
	 * Option Alert. Optional 	 
	 */ 
	private String OptionAlert;

	/**
	 * Option Cost. Optional 	 
	 */ 
	private String OptionCost;

	

	/**
	 * Default Constructor
	 */
	public OptionTrackingDetailsType (){
	}	

	/**
	 * Getter for OptionNumber
	 */
	 public String getOptionNumber() {
	 	return OptionNumber;
	 }
	 
	/**
	 * Setter for OptionNumber
	 */
	 public void setOptionNumber(String OptionNumber) {
	 	this.OptionNumber = OptionNumber;
	 }
	 
	/**
	 * Getter for OptionQty
	 */
	 public String getOptionQty() {
	 	return OptionQty;
	 }
	 
	/**
	 * Setter for OptionQty
	 */
	 public void setOptionQty(String OptionQty) {
	 	this.OptionQty = OptionQty;
	 }
	 
	/**
	 * Getter for OptionSelect
	 */
	 public String getOptionSelect() {
	 	return OptionSelect;
	 }
	 
	/**
	 * Setter for OptionSelect
	 */
	 public void setOptionSelect(String OptionSelect) {
	 	this.OptionSelect = OptionSelect;
	 }
	 
	/**
	 * Getter for OptionQtyDelta
	 */
	 public String getOptionQtyDelta() {
	 	return OptionQtyDelta;
	 }
	 
	/**
	 * Setter for OptionQtyDelta
	 */
	 public void setOptionQtyDelta(String OptionQtyDelta) {
	 	this.OptionQtyDelta = OptionQtyDelta;
	 }
	 
	/**
	 * Getter for OptionAlert
	 */
	 public String getOptionAlert() {
	 	return OptionAlert;
	 }
	 
	/**
	 * Setter for OptionAlert
	 */
	 public void setOptionAlert(String OptionAlert) {
	 	this.OptionAlert = OptionAlert;
	 }
	 
	/**
	 * Getter for OptionCost
	 */
	 public String getOptionCost() {
	 	return OptionCost;
	 }
	 
	/**
	 * Setter for OptionCost
	 */
	 public void setOptionCost(String OptionCost) {
	 	this.OptionCost = OptionCost;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(OptionNumber != null) {
			sb.append("<ebl:OptionNumber>").append(OptionNumber);
			sb.append("</ebl:OptionNumber>");
		}
		if(OptionQty != null) {
			sb.append("<ebl:OptionQty>").append(OptionQty);
			sb.append("</ebl:OptionQty>");
		}
		if(OptionSelect != null) {
			sb.append("<ebl:OptionSelect>").append(OptionSelect);
			sb.append("</ebl:OptionSelect>");
		}
		if(OptionQtyDelta != null) {
			sb.append("<ebl:OptionQtyDelta>").append(OptionQtyDelta);
			sb.append("</ebl:OptionQtyDelta>");
		}
		if(OptionAlert != null) {
			sb.append("<ebl:OptionAlert>").append(OptionAlert);
			sb.append("</ebl:OptionAlert>");
		}
		if(OptionCost != null) {
			sb.append("<ebl:OptionCost>").append(OptionCost);
			sb.append("</ebl:OptionCost>");
		}
		return sb.toString();
	}
	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else if (n.getNodeType() == Node.ELEMENT_NODE ){
			return (n.getChildNodes().getLength() == 0);
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
	
	public OptionTrackingDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("OptionNumber").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OptionNumber").item(0))) {
				this.OptionNumber = (String)document.getElementsByTagName("OptionNumber").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("OptionQty").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OptionQty").item(0))) {
				this.OptionQty = (String)document.getElementsByTagName("OptionQty").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("OptionSelect").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OptionSelect").item(0))) {
				this.OptionSelect = (String)document.getElementsByTagName("OptionSelect").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("OptionQtyDelta").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OptionQtyDelta").item(0))) {
				this.OptionQtyDelta = (String)document.getElementsByTagName("OptionQtyDelta").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("OptionAlert").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OptionAlert").item(0))) {
				this.OptionAlert = (String)document.getElementsByTagName("OptionAlert").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("OptionCost").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OptionCost").item(0))) {
				this.OptionCost = (String)document.getElementsByTagName("OptionCost").item(0).getTextContent();
			}
		}
	
	}
 
}