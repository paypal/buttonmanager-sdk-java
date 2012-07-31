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
 * 3DS remaining fields. 
 */
public class ThreeDSecureResponseType{


	/**
	 * 	 
	 */ 
	private String Vpas;

	/**
	 * 	 
	 */ 
	private String EciSubmitted3DS;

	

	/**
	 * Default Constructor
	 */
	public ThreeDSecureResponseType (){
	}	

	/**
	 * Getter for Vpas
	 */
	 public String getVpas() {
	 	return Vpas;
	 }
	 
	/**
	 * Setter for Vpas
	 */
	 public void setVpas(String Vpas) {
	 	this.Vpas = Vpas;
	 }
	 
	/**
	 * Getter for EciSubmitted3DS
	 */
	 public String getEciSubmitted3DS() {
	 	return EciSubmitted3DS;
	 }
	 
	/**
	 * Setter for EciSubmitted3DS
	 */
	 public void setEciSubmitted3DS(String EciSubmitted3DS) {
	 	this.EciSubmitted3DS = EciSubmitted3DS;
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
	
	public ThreeDSecureResponseType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("Vpas").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Vpas").item(0))) {
				this.Vpas = (String)document.getElementsByTagName("Vpas").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("EciSubmitted3DS").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("EciSubmitted3DS").item(0))) {
				this.EciSubmitted3DS = (String)document.getElementsByTagName("EciSubmitted3DS").item(0).getTextContent();
			}
		}
	
	}

}