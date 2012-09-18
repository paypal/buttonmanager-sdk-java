package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ItemTrackingDetailsType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.OptionTrackingDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractResponseType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
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
		} else if (n.getNodeType() == Node.ELEMENT_NODE ) {
			return (n.getChildNodes().getLength() == 0);
		} else {
			return false;
		}
	}
	
	public BMGetInventoryResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("HostedButtonID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.HostedButtonID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TrackInv", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TrackInv = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TrackPnl", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TrackPnl = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemTrackingDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ItemTrackingDetails =  new ItemTrackingDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("OptionIndex", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OptionIndex = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OptionName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OptionName = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("OptionTrackingDetails", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.OptionTrackingDetails.add(new OptionTrackingDetailsType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("SoldoutURL", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SoldoutURL = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("DigitalDownloadKeys", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
			    Node subNode = nodeList.item(i);
			    String value = subNode.getTextContent();
			    this.DigitalDownloadKeys.add(value);
					
			}
		}
	}
 
}