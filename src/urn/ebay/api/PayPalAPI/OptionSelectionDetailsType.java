package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.OptionTypeListType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.api.PayPalAPI.InstallmentDetailsType;
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
 * Option Selection. Required Character length and limitations:
 * 12 single-byte alphanumeric characters 
 */
public class OptionSelectionDetailsType{


	/**
	 * Option Selection. Required Character length and limitations:
	 * 12 single-byte alphanumeric characters 	  
	 *@Required	 
	 */ 
	private String OptionSelection;

	/**
	 * Option Price. Optional 	 
	 */ 
	private String Price;

	/**
	 * Option Type Optional 	 
	 */ 
	private OptionTypeListType OptionType;

	/**
	 * 	 
	 */ 
	private List<InstallmentDetailsType> PaymentPeriod = new ArrayList<InstallmentDetailsType>();

	

	/**
	 * Constructor with arguments
	 */
	public OptionSelectionDetailsType (String OptionSelection){
		this.OptionSelection = OptionSelection;
	}	

	/**
	 * Default Constructor
	 */
	public OptionSelectionDetailsType (){
	}	

	/**
	 * Getter for OptionSelection
	 */
	 public String getOptionSelection() {
	 	return OptionSelection;
	 }
	 
	/**
	 * Setter for OptionSelection
	 */
	 public void setOptionSelection(String OptionSelection) {
	 	this.OptionSelection = OptionSelection;
	 }
	 
	/**
	 * Getter for Price
	 */
	 public String getPrice() {
	 	return Price;
	 }
	 
	/**
	 * Setter for Price
	 */
	 public void setPrice(String Price) {
	 	this.Price = Price;
	 }
	 
	/**
	 * Getter for OptionType
	 */
	 public OptionTypeListType getOptionType() {
	 	return OptionType;
	 }
	 
	/**
	 * Setter for OptionType
	 */
	 public void setOptionType(OptionTypeListType OptionType) {
	 	this.OptionType = OptionType;
	 }
	 
	/**
	 * Getter for PaymentPeriod
	 */
	 public List<InstallmentDetailsType> getPaymentPeriod() {
	 	return PaymentPeriod;
	 }
	 
	/**
	 * Setter for PaymentPeriod
	 */
	 public void setPaymentPeriod(List<InstallmentDetailsType> PaymentPeriod) {
	 	this.PaymentPeriod = PaymentPeriod;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(OptionSelection != null) {
			sb.append("<urn:OptionSelection>").append(OptionSelection);
			sb.append("</urn:OptionSelection>");
		}
		if(Price != null) {
			sb.append("<urn:Price>").append(Price);
			sb.append("</urn:Price>");
		}
		if(OptionType != null) {
			sb.append("<urn:OptionType>").append(OptionType.getValue());
			sb.append("</urn:OptionType>");
		}
		if(PaymentPeriod != null) {
			for(int i=0; i < PaymentPeriod.size(); i++) {
				sb.append("<urn:PaymentPeriod>");
				sb.append(PaymentPeriod.get(i).toXMLString());
				sb.append("</urn:PaymentPeriod>");
			}
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
	
	public OptionSelectionDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("OptionSelection").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OptionSelection").item(0))) {
				this.OptionSelection = (String)document.getElementsByTagName("OptionSelection").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Price").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Price").item(0))) {
				this.Price = (String)document.getElementsByTagName("Price").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("OptionType").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OptionType").item(0))) {
				this.OptionType = OptionTypeListType.fromValue(document.getElementsByTagName("OptionType").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("PaymentPeriod").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentPeriod").item(0))) {
				nodeList = document.getElementsByTagName("PaymentPeriod");
				for(int i=0; i < nodeList.getLength(); i++) {
					xmlString = convertToXML(nodeList.item(i));
					this.PaymentPeriod.add(new InstallmentDetailsType(xmlString));
				}
			}
		}
	}
 
}