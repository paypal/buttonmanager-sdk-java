
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import urn.ebay.apis.eBLBaseComponents.AbstractResponseType;
import urn.ebay.apis.eBLBaseComponents.ItemTrackingDetailsType;
import urn.ebay.apis.eBLBaseComponents.OptionTrackingDetailsType;


/**
 */
public class BMGetInventoryResponseType extends AbstractResponseType{

	/**
	 *
	 * @Required
	 */
	private String HostedButtonID;
	public String getHostedButtonID() {
		return HostedButtonID;
	}
	public void setHostedButtonID(String value) {
		this.HostedButtonID = value;
	}

	/**
	 *
	 * @Required
	 */
	private String TrackInv;
	public String getTrackInv() {
		return TrackInv;
	}
	public void setTrackInv(String value) {
		this.TrackInv = value;
	}

	/**
	 *
	 * @Required
	 */
	private String TrackPnl;
	public String getTrackPnl() {
		return TrackPnl;
	}
	public void setTrackPnl(String value) {
		this.TrackPnl = value;
	}

	/**
	 */
	private ItemTrackingDetailsType ItemTrackingDetails;
	public ItemTrackingDetailsType getItemTrackingDetails() {
		return ItemTrackingDetails;
	}
	public void setItemTrackingDetails(ItemTrackingDetailsType value) {
		this.ItemTrackingDetails = value;
	}

	/**
	 */
	private String OptionIndex;
	public String getOptionIndex() {
		return OptionIndex;
	}
	public void setOptionIndex(String value) {
		this.OptionIndex = value;
	}

	/**
	 */
	private String OptionName;
	public String getOptionName() {
		return OptionName;
	}
	public void setOptionName(String value) {
		this.OptionName = value;
	}

	/**
	 */
	private List<OptionTrackingDetailsType> OptionTrackingDetails = new ArrayList<OptionTrackingDetailsType>();
	public List<OptionTrackingDetailsType> getOptionTrackingDetails() {
		return OptionTrackingDetails;
	}
	public void setOptionTrackingDetails(List<OptionTrackingDetailsType> value) {
		this.OptionTrackingDetails = value;
	}

	/**
	 */
	private String SoldoutURL;
	public String getSoldoutURL() {
		return SoldoutURL;
	}
	public void setSoldoutURL(String value) {
		this.SoldoutURL = value;
	}

	/**
	 */
	private List<String> DigitalDownloadKeys = new ArrayList<String>();
	public List<String> getDigitalDownloadKeys() {
		return DigitalDownloadKeys;
	}
	public void setDigitalDownloadKeys(List<String> value) {
		this.DigitalDownloadKeys = value;
	}


	public BMGetInventoryResponseType() {
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
		 sb.append('<').append(name);
		 NamedNodeMap attrs = n.getAttributes();
		 if (attrs != null) { 
		  for (int i = 0; i < attrs.getLength(); i++) { 
			    Node attr = attrs.item(i);
			    sb.append(' ').append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
		  }
		 } 
		 String textContent = null; 
		 NodeList children = n.getChildNodes(); 
		 if (children.getLength() == 0) { 
		  if ((textContent = n.getTextContent()) != null && !"".equals(textContent)) {
		    sb.append(textContent).append("</").append(name).append('>'); 
		  } else { 
		    sb.append("/>"); 
		  } 
		 } else { 
		  sb.append('>'); 
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
		  sb.append("</").append(name).append('>');
		 }
		 return sb.toString();
	 } 
	 public BMGetInventoryResponseType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 super(xmlSoap); 
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("HostedButtonID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("HostedButtonID").item(0))){ 
		 this.HostedButtonID =(String)document.getElementsByTagName("HostedButtonID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("TrackInv").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TrackInv").item(0))){ 
		 this.TrackInv =(String)document.getElementsByTagName("TrackInv").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("TrackPnl").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TrackPnl").item(0))){ 
		 this.TrackPnl =(String)document.getElementsByTagName("TrackPnl").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ItemTrackingDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ItemTrackingDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("ItemTrackingDetails");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.ItemTrackingDetails =  new ItemTrackingDetailsType(xmlString);

}
	}
		 if(document.getElementsByTagName("OptionIndex").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OptionIndex").item(0))){ 
		 this.OptionIndex =(String)document.getElementsByTagName("OptionIndex").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("OptionName").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OptionName").item(0))){ 
		 this.OptionName =(String)document.getElementsByTagName("OptionName").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("OptionTrackingDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OptionTrackingDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("OptionTrackingDetails");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 xmlString = convertToXML(nodeList.item(i)); 
				this.OptionTrackingDetails.add(new OptionTrackingDetailsType(xmlString));
			}

}
	}
		 if(document.getElementsByTagName("SoldoutURL").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("SoldoutURL").item(0))){ 
		 this.SoldoutURL =(String)document.getElementsByTagName("SoldoutURL").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("DigitalDownloadKeys").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("DigitalDownloadKeys").item(0))){ 
		 nodeList = document.getElementsByTagName("DigitalDownloadKeys");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 String value = nodeList.item(i).getTextContent(); 
			 this.DigitalDownloadKeys.add(value);
		}

}
	}
	}
}
