package urn.ebay.apis.CoreComponentTypes;
import urn.ebay.apis.eBLBaseComponents.CurrencyCodeType;
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
 * On requests, you must set the currencyID attribute to one of
 * the three-character currency codes for any of the supported
 * PayPal currencies. Limitations: Must not exceed $10,000 USD
 * in any currency. No currency symbol. Decimal separator must
 * be a period (.), and the thousands separator must be a comma
 * (,).
 */
public class BasicAmountType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private CurrencyCodeType currencyID;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String value;

	

	/**
	 * Constructor with arguments
	 */
	public BasicAmountType (CurrencyCodeType currencyID, String value){
		this.currencyID = currencyID;
		this.value = value;
	}	

	/**
	 * Default Constructor
	 */
	public BasicAmountType (){
	}	

	/**
	 * Getter for currencyID
	 */
	 public CurrencyCodeType getCurrencyID() {
	 	return currencyID;
	 }
	 
	/**
	 * Setter for currencyID
	 */
	 public void setCurrencyID(CurrencyCodeType currencyID) {
	 	this.currencyID = currencyID;
	 }
	 
	/**
	 * Getter for value
	 */
	 public String getValue() {
	 	return value;
	 }
	 
	/**
	 * Setter for value
	 */
	 public void setValue(String value) {
	 	this.value = value;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(currencyID != null) {
			sb.append(" currencyID=\"").append(currencyID).append("\">");
		}
		if(value != null) {
			sb.append(value);
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
	
	public BasicAmountType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		this.currencyID = CurrencyCodeType.fromValue(document.getChildNodes().item(0).getAttributes().getNamedItem("currencyID").getNodeValue());
	this.value = (String)document.getChildNodes().item(0).getTextContent();
	
	
	}
 
}