package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.OptionTypeListType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.api.PayPalAPI.InstallmentDetailsType;
import com.paypal.core.SDKUtil;
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
 * Option Selection. Required Character length and limitations:
 * 12 single-byte alphanumeric characters 
 */
public class OptionSelectionDetailsType{


	/**
	 * Option Selection. Required Character length and limitations:
	 * 12 single-byte alphanumeric characters 	  
	 *@Required	 
	 */ 
	private String OptionSelection;

	/**
	 * Option Price. Optional 	 
	 */ 
	private String Price;

	/**
	 * Option Type Optional 	 
	 */ 
	private OptionTypeListType OptionType;

	/**
	 * 	 
	 */ 
	private List<InstallmentDetailsType> PaymentPeriod = new ArrayList<InstallmentDetailsType>();

	

	/**
	 * Constructor with arguments
	 */
	public OptionSelectionDetailsType (String OptionSelection){
		this.OptionSelection = OptionSelection;
	}	

	/**
	 * Default Constructor
	 */
	public OptionSelectionDetailsType (){
	}	

	/**
	 * Getter for OptionSelection
	 */
	 public String getOptionSelection() {
	 	return OptionSelection;
	 }
	 
	/**
	 * Setter for OptionSelection
	 */
	 public void setOptionSelection(String OptionSelection) {
	 	this.OptionSelection = OptionSelection;
	 }
	 
	/**
	 * Getter for Price
	 */
	 public String getPrice() {
	 	return Price;
	 }
	 
	/**
	 * Setter for Price
	 */
	 public void setPrice(String Price) {
	 	this.Price = Price;
	 }
	 
	/**
	 * Getter for OptionType
	 */
	 public OptionTypeListType getOptionType() {
	 	return OptionType;
	 }
	 
	/**
	 * Setter for OptionType
	 */
	 public void setOptionType(OptionTypeListType OptionType) {
	 	this.OptionType = OptionType;
	 }
	 
	/**
	 * Getter for PaymentPeriod
	 */
	 public List<InstallmentDetailsType> getPaymentPeriod() {
	 	return PaymentPeriod;
	 }
	 
	/**
	 * Setter for PaymentPeriod
	 */
	 public void setPaymentPeriod(List<InstallmentDetailsType> PaymentPeriod) {
	 	this.PaymentPeriod = PaymentPeriod;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(OptionSelection != null) {
			sb.append("<urn:OptionSelection>").append(SDKUtil.escapeInvalidXmlCharsRegex(OptionSelection));
			sb.append("</urn:OptionSelection>");
		}
		if(Price != null) {
			sb.append("<urn:Price>").append(SDKUtil.escapeInvalidXmlCharsRegex(Price));
			sb.append("</urn:Price>");
		}
		if(OptionType != null) {
			sb.append("<urn:OptionType>").append(SDKUtil.escapeInvalidXmlCharsRegex(OptionType.getValue()));
			sb.append("</urn:OptionType>");
		}
		if(PaymentPeriod != null) {
			for(int i=0; i < PaymentPeriod.size(); i++) {
				sb.append("<urn:PaymentPeriod>");
				sb.append(PaymentPeriod.get(i).toXMLString());
				sb.append("</urn:PaymentPeriod>");
			}
		}
		return sb.toString();
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
	
	public OptionSelectionDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("OptionSelection", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OptionSelection = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Price", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Price = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OptionType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OptionType = OptionTypeListType.fromValue(childNode.getTextContent());
		}
        nodeList = (NodeList) xpath.evaluate("PaymentPeriod", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.PaymentPeriod.add(new InstallmentDetailsType(subNode));
			}
		}
	}
 
}