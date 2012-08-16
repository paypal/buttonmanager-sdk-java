package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
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
 * Information on user selected options 
 */
public class UserSelectedOptionType{


	/**
	 * 	 
	 */ 
	private String ShippingCalculationMode;

	/**
	 * 	 
	 */ 
	private String InsuranceOptionSelected;

	/**
	 * 	 
	 */ 
	private String ShippingOptionIsDefault;

	/**
	 * 	 
	 */ 
	private BasicAmountType ShippingOptionAmount;

	/**
	 * 	 
	 */ 
	private String ShippingOptionName;

	

	/**
	 * Default Constructor
	 */
	public UserSelectedOptionType (){
	}	

	/**
	 * Getter for ShippingCalculationMode
	 */
	 public String getShippingCalculationMode() {
	 	return ShippingCalculationMode;
	 }
	 
	/**
	 * Setter for ShippingCalculationMode
	 */
	 public void setShippingCalculationMode(String ShippingCalculationMode) {
	 	this.ShippingCalculationMode = ShippingCalculationMode;
	 }
	 
	/**
	 * Getter for InsuranceOptionSelected
	 */
	 public String getInsuranceOptionSelected() {
	 	return InsuranceOptionSelected;
	 }
	 
	/**
	 * Setter for InsuranceOptionSelected
	 */
	 public void setInsuranceOptionSelected(String InsuranceOptionSelected) {
	 	this.InsuranceOptionSelected = InsuranceOptionSelected;
	 }
	 
	/**
	 * Getter for ShippingOptionIsDefault
	 */
	 public String getShippingOptionIsDefault() {
	 	return ShippingOptionIsDefault;
	 }
	 
	/**
	 * Setter for ShippingOptionIsDefault
	 */
	 public void setShippingOptionIsDefault(String ShippingOptionIsDefault) {
	 	this.ShippingOptionIsDefault = ShippingOptionIsDefault;
	 }
	 
	/**
	 * Getter for ShippingOptionAmount
	 */
	 public BasicAmountType getShippingOptionAmount() {
	 	return ShippingOptionAmount;
	 }
	 
	/**
	 * Setter for ShippingOptionAmount
	 */
	 public void setShippingOptionAmount(BasicAmountType ShippingOptionAmount) {
	 	this.ShippingOptionAmount = ShippingOptionAmount;
	 }
	 
	/**
	 * Getter for ShippingOptionName
	 */
	 public String getShippingOptionName() {
	 	return ShippingOptionName;
	 }
	 
	/**
	 * Setter for ShippingOptionName
	 */
	 public void setShippingOptionName(String ShippingOptionName) {
	 	this.ShippingOptionName = ShippingOptionName;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ShippingCalculationMode != null) {
			sb.append("<ebl:ShippingCalculationMode>").append(ShippingCalculationMode);
			sb.append("</ebl:ShippingCalculationMode>");
		}
		if(InsuranceOptionSelected != null) {
			sb.append("<ebl:InsuranceOptionSelected>").append(InsuranceOptionSelected);
			sb.append("</ebl:InsuranceOptionSelected>");
		}
		if(ShippingOptionIsDefault != null) {
			sb.append("<ebl:ShippingOptionIsDefault>").append(ShippingOptionIsDefault);
			sb.append("</ebl:ShippingOptionIsDefault>");
		}
		if(ShippingOptionAmount != null) {
			sb.append("<ebl:ShippingOptionAmount");
			sb.append(ShippingOptionAmount.toXMLString());
			sb.append("</ebl:ShippingOptionAmount>");
		}
		if(ShippingOptionName != null) {
			sb.append("<ebl:ShippingOptionName>").append(ShippingOptionName);
			sb.append("</ebl:ShippingOptionName>");
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
	
	public UserSelectedOptionType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("ShippingCalculationMode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ShippingCalculationMode").item(0))) {
				this.ShippingCalculationMode = (String)document.getElementsByTagName("ShippingCalculationMode").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("InsuranceOptionSelected").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("InsuranceOptionSelected").item(0))) {
				this.InsuranceOptionSelected = (String)document.getElementsByTagName("InsuranceOptionSelected").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ShippingOptionIsDefault").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ShippingOptionIsDefault").item(0))) {
				this.ShippingOptionIsDefault = (String)document.getElementsByTagName("ShippingOptionIsDefault").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("ShippingOptionAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ShippingOptionAmount").item(0))) {
				nodeList = document.getElementsByTagName("ShippingOptionAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.ShippingOptionAmount =  new BasicAmountType(xmlString);
			}
		}
		if (document.getElementsByTagName("ShippingOptionName").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ShippingOptionName").item(0))) {
				this.ShippingOptionName = (String)document.getElementsByTagName("ShippingOptionName").item(0).getTextContent();
			}
		}
	
	}
 
}