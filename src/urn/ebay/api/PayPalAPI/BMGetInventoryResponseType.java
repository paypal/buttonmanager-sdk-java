package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ItemTrackingDetailsType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.OptionTrackingDetailsType;
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
 * 
 */
public class BMGetInventoryResponseType extends AbstractResponseType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private String HostedButtonID;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String TrackInv;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String TrackPnl;

	/**
	 * 	 
	 */ 
	private ItemTrackingDetailsType ItemTrackingDetails;

	/**
	 * 	 
	 */ 
	private String OptionIndex;

	/**
	 * 	 
	 */ 
	private String OptionName;

	/**
	 * 	 
	 */ 
	private List<OptionTrackingDetailsType> OptionTrackingDetails = new ArrayList<OptionTrackingDetailsType>();

	/**
	 * 	 
	 */ 
	private String SoldoutURL;

	/**
	 * 	 
	 */ 
	private List<String> DigitalDownloadKeys = new ArrayList<String>();

	

	/**
	 * Default Constructor
	 */
	public BMGetInventoryResponseType (){
	}	

	/**
	 * Getter for HostedButtonID
	 */
	 public String getHostedButtonID() {
	 	return HostedButtonID;
	 }
	 
	/**
	 * Setter for HostedButtonID
	 */
	 public void setHostedButtonID(String HostedButtonID) {
	 	this.HostedButtonID = HostedButtonID;
	 }
	 
	/**
	 * Getter for TrackInv
	 */
	 public String getTrackInv() {
	 	return TrackInv;
	 }
	 
	/**
	 * Setter for TrackInv
	 */
	 public void setTrackInv(String TrackInv) {
	 	this.TrackInv = TrackInv;
	 }
	 
	/**
	 * Getter for TrackPnl
	 */
	 public String getTrackPnl() {
	 	return TrackPnl;
	 }
	 
	/**
	 * Setter for TrackPnl
	 */
	 public void setTrackPnl(String TrackPnl) {
	 	this.TrackPnl = TrackPnl;
	 }
	 
	/**
	 * Getter for ItemTrackingDetails
	 */
	 public ItemTrackingDetailsType getItemTrackingDetails() {
	 	return ItemTrackingDetails;
	 }
	 
	/**
	 * Setter for ItemTrackingDetails
	 */
	 public void setItemTrackingDetails(ItemTrackingDetailsType ItemTrackingDetails) {
	 	this.ItemTrackingDetails = ItemTrackingDetails;
	 }
	 
	/**
	 * Getter for OptionIndex
	 */
	 public String getOptionIndex() {
	 	return OptionIndex;
	 }
	 
	/**
	 * Setter for OptionIndex
	 */
	 public void setOptionIndex(String OptionIndex) {
	 	this.OptionIndex = OptionIndex;
	 }
	 
	/**
	 * Getter for OptionName
	 */
	 public String getOptionName() {
	 	return OptionName;
	 }
	 
	/**
	 * Setter for OptionName
	 */
	 public void setOptionName(String OptionName) {
	 	this.OptionName = OptionName;
	 }
	 
	/**
	 * Getter for OptionTrackingDetails
	 */
	 public List<OptionTrackingDetailsType> getOptionTrackingDetails() {
	 	return OptionTrackingDetails;
	 }
	 
	/**
	 * Setter for OptionTrackingDetails
	 */
	 public void setOptionTrackingDetails(List<OptionTrackingDetailsType> OptionTrackingDetails) {
	 	this.OptionTrackingDetails = OptionTrackingDetails;
	 }
	 
	/**
	 * Getter for SoldoutURL
	 */
	 public String getSoldoutURL() {
	 	return SoldoutURL;
	 }
	 
	/**
	 * Setter for SoldoutURL
	 */
	 public void setSoldoutURL(String SoldoutURL) {
	 	this.SoldoutURL = SoldoutURL;
	 }
	 
	/**
	 * Getter for DigitalDownloadKeys
	 */
	 public List<String> getDigitalDownloadKeys() {
	 	return DigitalDownloadKeys;
	 }
	 
	/**
	 * Setter for DigitalDownloadKeys
	 */
	 public void setDigitalDownloadKeys(List<String> DigitalDownloadKeys) {
	 	this.DigitalDownloadKeys = DigitalDownloadKeys;
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
	
	public BMGetInventoryResponseType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		super(xmlSoap);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("HostedButtonID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("HostedButtonID").item(0))) {
				this.HostedButtonID = (String)document.getElementsByTagName("HostedButtonID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("TrackInv").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TrackInv").item(0))) {
				this.TrackInv = (String)document.getElementsByTagName("TrackInv").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("TrackPnl").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TrackPnl").item(0))) {
				this.TrackPnl = (String)document.getElementsByTagName("TrackPnl").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("ItemTrackingDetails").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ItemTrackingDetails").item(0))) {
				nodeList = document.getElementsByTagName("ItemTrackingDetails");
				xmlString = convertToXML(nodeList.item(0));
				this.ItemTrackingDetails =  new ItemTrackingDetailsType(xmlString);
			}
		}
		if (document.getElementsByTagName("OptionIndex").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OptionIndex").item(0))) {
				this.OptionIndex = (String)document.getElementsByTagName("OptionIndex").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("OptionName").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OptionName").item(0))) {
				this.OptionName = (String)document.getElementsByTagName("OptionName").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("OptionTrackingDetails").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OptionTrackingDetails").item(0))) {
				nodeList = document.getElementsByTagName("OptionTrackingDetails");
				for(int i=0; i < nodeList.getLength(); i++) {
					xmlString = convertToXML(nodeList.item(i));
					this.OptionTrackingDetails.add(new OptionTrackingDetailsType(xmlString));
				}
			}
		}
		if (document.getElementsByTagName("SoldoutURL").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SoldoutURL").item(0))) {
				this.SoldoutURL = (String)document.getElementsByTagName("SoldoutURL").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("DigitalDownloadKeys").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("DigitalDownloadKeys").item(0))) {
				nodeList = document.getElementsByTagName("DigitalDownloadKeys");
				for(int i=0; i < nodeList.getLength(); i++) {
					String value = nodeList.item(i).getTextContent();
					this.DigitalDownloadKeys.add(value);
					
				}
			}
		}
	}
 
}