package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.ThreeDSecureRequestType;
import urn.ebay.apis.eBLBaseComponents.ThreeDSecureResponseType;
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
 * 3DSecureInfoType Information about 3D Secure parameters. 
 */
public class ThreeDSecureInfoType{


	/**
	 * No Document Comments	 
	 */ 
	private ThreeDSecureRequestType ThreeDSecureRequest;

	/**
	 * No Document Comments	 
	 */ 
	private ThreeDSecureResponseType ThreeDSecureResponse;

	

	/**
	 * Default Constructor
	 */
	public ThreeDSecureInfoType (){
	}	

	/**
	 * Getter for ThreeDSecureRequest
	 */
	 public ThreeDSecureRequestType getThreeDSecureRequest() {
	 	return ThreeDSecureRequest;
	 }
	 
	/**
	 * Setter for ThreeDSecureRequest
	 */
	 public void setThreeDSecureRequest(ThreeDSecureRequestType ThreeDSecureRequest) {
	 	this.ThreeDSecureRequest = ThreeDSecureRequest;
	 }
	 
	/**
	 * Getter for ThreeDSecureResponse
	 */
	 public ThreeDSecureResponseType getThreeDSecureResponse() {
	 	return ThreeDSecureResponse;
	 }
	 
	/**
	 * Setter for ThreeDSecureResponse
	 */
	 public void setThreeDSecureResponse(ThreeDSecureResponseType ThreeDSecureResponse) {
	 	this.ThreeDSecureResponse = ThreeDSecureResponse;
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
	
	public ThreeDSecureInfoType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if(document.getElementsByTagName("ThreeDSecureRequest").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ThreeDSecureRequest").item(0))) {
				nodeList = document.getElementsByTagName("ThreeDSecureRequest");
				xmlString = convertToXML(nodeList.item(0));
				this.ThreeDSecureRequest =  new ThreeDSecureRequestType(xmlString);
			}
		}
		if(document.getElementsByTagName("ThreeDSecureResponse").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ThreeDSecureResponse").item(0))) {
				nodeList = document.getElementsByTagName("ThreeDSecureResponse");
				xmlString = convertToXML(nodeList.item(0));
				this.ThreeDSecureResponse =  new ThreeDSecureResponseType(xmlString);
			}
		}
	}

}