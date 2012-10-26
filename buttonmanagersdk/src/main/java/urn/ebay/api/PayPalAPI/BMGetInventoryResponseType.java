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
	private String hostedButtonID;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String trackInv;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String trackPnl;

	/**
	 * 	 
	 */ 
	private ItemTrackingDetailsType itemTrackingDetails;

	/**
	 * 	 
	 */ 
	private String optionIndex;

	/**
	 * 	 
	 */ 
	private String optionName;

	/**
	 * 	 
	 */ 
	private List<OptionTrackingDetailsType> optionTrackingDetails = new ArrayList<OptionTrackingDetailsType>();

	/**
	 * 	 
	 */ 
	private String soldoutURL;

	/**
	 * 	 
	 */ 
	private List<String> digitalDownloadKeys = new ArrayList<String>();

	

	/**
	 * Default Constructor
	 */
	public BMGetInventoryResponseType (){
	}	

	/**
	 * Getter for hostedButtonID
	 */
	 public String getHostedButtonID() {
	 	return hostedButtonID;
	 }
	 
	/**
	 * Setter for hostedButtonID
	 */
	 public void setHostedButtonID(String hostedButtonID) {
	 	this.hostedButtonID = hostedButtonID;
	 }
	 
	/**
	 * Getter for trackInv
	 */
	 public String getTrackInv() {
	 	return trackInv;
	 }
	 
	/**
	 * Setter for trackInv
	 */
	 public void setTrackInv(String trackInv) {
	 	this.trackInv = trackInv;
	 }
	 
	/**
	 * Getter for trackPnl
	 */
	 public String getTrackPnl() {
	 	return trackPnl;
	 }
	 
	/**
	 * Setter for trackPnl
	 */
	 public void setTrackPnl(String trackPnl) {
	 	this.trackPnl = trackPnl;
	 }
	 
	/**
	 * Getter for itemTrackingDetails
	 */
	 public ItemTrackingDetailsType getItemTrackingDetails() {
	 	return itemTrackingDetails;
	 }
	 
	/**
	 * Setter for itemTrackingDetails
	 */
	 public void setItemTrackingDetails(ItemTrackingDetailsType itemTrackingDetails) {
	 	this.itemTrackingDetails = itemTrackingDetails;
	 }
	 
	/**
	 * Getter for optionIndex
	 */
	 public String getOptionIndex() {
	 	return optionIndex;
	 }
	 
	/**
	 * Setter for optionIndex
	 */
	 public void setOptionIndex(String optionIndex) {
	 	this.optionIndex = optionIndex;
	 }
	 
	/**
	 * Getter for optionName
	 */
	 public String getOptionName() {
	 	return optionName;
	 }
	 
	/**
	 * Setter for optionName
	 */
	 public void setOptionName(String optionName) {
	 	this.optionName = optionName;
	 }
	 
	/**
	 * Getter for optionTrackingDetails
	 */
	 public List<OptionTrackingDetailsType> getOptionTrackingDetails() {
	 	return optionTrackingDetails;
	 }
	 
	/**
	 * Setter for optionTrackingDetails
	 */
	 public void setOptionTrackingDetails(List<OptionTrackingDetailsType> optionTrackingDetails) {
	 	this.optionTrackingDetails = optionTrackingDetails;
	 }
	 
	/**
	 * Getter for soldoutURL
	 */
	 public String getSoldoutURL() {
	 	return soldoutURL;
	 }
	 
	/**
	 * Setter for soldoutURL
	 */
	 public void setSoldoutURL(String soldoutURL) {
	 	this.soldoutURL = soldoutURL;
	 }
	 
	/**
	 * Getter for digitalDownloadKeys
	 */
	 public List<String> getDigitalDownloadKeys() {
	 	return digitalDownloadKeys;
	 }
	 
	/**
	 * Setter for digitalDownloadKeys
	 */
	 public void setDigitalDownloadKeys(List<String> digitalDownloadKeys) {
	 	this.digitalDownloadKeys = digitalDownloadKeys;
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
		    this.hostedButtonID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TrackInv", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.trackInv = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TrackPnl", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.trackPnl = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemTrackingDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemTrackingDetails =  new ItemTrackingDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("OptionIndex", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.optionIndex = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OptionName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.optionName = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("OptionTrackingDetails", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.optionTrackingDetails.add(new OptionTrackingDetailsType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("SoldoutURL", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.soldoutURL = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("DigitalDownloadKeys", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
			    Node subNode = nodeList.item(i);
			    String value = subNode.getTextContent();
			    this.digitalDownloadKeys.add(value);
					
			}
		}
	}
 
}