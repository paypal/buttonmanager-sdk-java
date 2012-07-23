package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.DoReferenceTransactionResponseDetailsType;
import urn.ebay.apis.eBLBaseComponents.FMFDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractResponseType;
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
 * No Document Comments
 */
public class DoReferenceTransactionResponseType extends AbstractResponseType {


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private DoReferenceTransactionResponseDetailsType DoReferenceTransactionResponseDetails;

	/**
	 * No Document Comments	 
	 */ 
	private FMFDetailsType FMFDetails;

	

	/**
	 * Default Constructor
	 */
	public DoReferenceTransactionResponseType (){
	}	

	/**
	 * Getter for DoReferenceTransactionResponseDetails
	 */
	 public DoReferenceTransactionResponseDetailsType getDoReferenceTransactionResponseDetails() {
	 	return DoReferenceTransactionResponseDetails;
	 }
	 
	/**
	 * Setter for DoReferenceTransactionResponseDetails
	 */
	 public void setDoReferenceTransactionResponseDetails(DoReferenceTransactionResponseDetailsType DoReferenceTransactionResponseDetails) {
	 	this.DoReferenceTransactionResponseDetails = DoReferenceTransactionResponseDetails;
	 }
	 
	/**
	 * Getter for FMFDetails
	 */
	 public FMFDetailsType getFMFDetails() {
	 	return FMFDetails;
	 }
	 
	/**
	 * Setter for FMFDetails
	 */
	 public void setFMFDetails(FMFDetailsType FMFDetails) {
	 	this.FMFDetails = FMFDetails;
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
	
	public DoReferenceTransactionResponseType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		super(xmlSoap);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if(document.getElementsByTagName("DoReferenceTransactionResponseDetails").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("DoReferenceTransactionResponseDetails").item(0))) {
				nodeList = document.getElementsByTagName("DoReferenceTransactionResponseDetails");
				xmlString = convertToXML(nodeList.item(0));
				this.DoReferenceTransactionResponseDetails =  new DoReferenceTransactionResponseDetailsType(xmlString);
			}
		}
		if(document.getElementsByTagName("FMFDetails").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("FMFDetails").item(0))) {
				nodeList = document.getElementsByTagName("FMFDetails");
				xmlString = convertToXML(nodeList.item(0));
				this.FMFDetails =  new FMFDetailsType(xmlString);
			}
		}
	}

}