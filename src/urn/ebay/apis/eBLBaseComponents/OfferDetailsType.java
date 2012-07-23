package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BMLOfferInfoType;
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
 * OfferDetailsType Specific information for an offer. 
 */
public class OfferDetailsType{


	/**
	 * Code used to identify the promotion offer. 	 
	 */ 
	private String OfferCode;

	/**
	 * Specific infromation for BML, Similar structure could be
	 * added for sepcific  promotion needs like CrossPromotions 	 
	 */ 
	private BMLOfferInfoType BMLOfferInfo;

	

	/**
	 * Default Constructor
	 */
	public OfferDetailsType (){
	}	

	/**
	 * Getter for OfferCode
	 */
	 public String getOfferCode() {
	 	return OfferCode;
	 }
	 
	/**
	 * Setter for OfferCode
	 */
	 public void setOfferCode(String OfferCode) {
	 	this.OfferCode = OfferCode;
	 }
	 
	/**
	 * Getter for BMLOfferInfo
	 */
	 public BMLOfferInfoType getBMLOfferInfo() {
	 	return BMLOfferInfo;
	 }
	 
	/**
	 * Setter for BMLOfferInfo
	 */
	 public void setBMLOfferInfo(BMLOfferInfoType BMLOfferInfo) {
	 	this.BMLOfferInfo = BMLOfferInfo;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(OfferCode != null) {
			sb.append("<ebl:OfferCode>").append(OfferCode);
			sb.append("</ebl:OfferCode>");
		}
		if(BMLOfferInfo != null) {
			sb.append("<ebl:BMLOfferInfo>");
			sb.append(BMLOfferInfo.toXMLString());
			sb.append("</ebl:BMLOfferInfo>");
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
	
	public OfferDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("OfferCode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OfferCode").item(0))) {
				this.OfferCode = (String)document.getElementsByTagName("OfferCode").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("BMLOfferInfo").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BMLOfferInfo").item(0))) {
				nodeList = document.getElementsByTagName("BMLOfferInfo");
				xmlString = convertToXML(nodeList.item(0));
				this.BMLOfferInfo =  new BMLOfferInfoType(xmlString);
			}
		}
	}

}