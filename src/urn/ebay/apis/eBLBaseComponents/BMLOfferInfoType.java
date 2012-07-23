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
 * BMLOfferInfoType Specific information for BML. 
 */
public class BMLOfferInfoType{


	/**
	 * Unique identification for merchant/buyer/offer combo. 	 
	 */ 
	private String OfferTrackingID;

	

	/**
	 * Default Constructor
	 */
	public BMLOfferInfoType (){
	}	

	/**
	 * Getter for OfferTrackingID
	 */
	 public String getOfferTrackingID() {
	 	return OfferTrackingID;
	 }
	 
	/**
	 * Setter for OfferTrackingID
	 */
	 public void setOfferTrackingID(String OfferTrackingID) {
	 	this.OfferTrackingID = OfferTrackingID;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(OfferTrackingID != null) {
			sb.append("<ebl:OfferTrackingID>").append(OfferTrackingID);
			sb.append("</ebl:OfferTrackingID>");
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
	
	public BMLOfferInfoType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("OfferTrackingID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OfferTrackingID").item(0))) {
				nodeList = document.getElementsByTagName("OfferTrackingID");
				String value = nodeList.item(0).getTextContent();
				this.OfferTrackingID = value;
			}
		}
	}

}