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

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * Option Selection. Required Character length and limitations:
	 * 12 single-byte alphanumeric characters 	  
	 *@Required	 
	 */ 
	private String optionSelection;

	/**
	 * Option Price. Optional 	 
	 */ 
	private String price;

	/**
	 * Option Type Optional 	 
	 */ 
	private OptionTypeListType optionType;

	/**
	 * 	 
	 */ 
	private List<InstallmentDetailsType> paymentPeriod = new ArrayList<InstallmentDetailsType>();

	

	/**
	 * Constructor with arguments
	 */
	public OptionSelectionDetailsType (String optionSelection){
		this.optionSelection = optionSelection;
	}	

	/**
	 * Default Constructor
	 */
	public OptionSelectionDetailsType (){
	}	

	/**
	 * Getter for optionSelection
	 */
	 public String getOptionSelection() {
	 	return optionSelection;
	 }
	 
	/**
	 * Setter for optionSelection
	 */
	 public void setOptionSelection(String optionSelection) {
	 	this.optionSelection = optionSelection;
	 }
	 
	/**
	 * Getter for price
	 */
	 public String getPrice() {
	 	return price;
	 }
	 
	/**
	 * Setter for price
	 */
	 public void setPrice(String price) {
	 	this.price = price;
	 }
	 
	/**
	 * Getter for optionType
	 */
	 public OptionTypeListType getOptionType() {
	 	return optionType;
	 }
	 
	/**
	 * Setter for optionType
	 */
	 public void setOptionType(OptionTypeListType optionType) {
	 	this.optionType = optionType;
	 }
	 
	/**
	 * Getter for paymentPeriod
	 */
	 public List<InstallmentDetailsType> getPaymentPeriod() {
	 	return paymentPeriod;
	 }
	 
	/**
	 * Setter for paymentPeriod
	 */
	 public void setPaymentPeriod(List<InstallmentDetailsType> paymentPeriod) {
	 	this.paymentPeriod = paymentPeriod;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(optionSelection != null) {
			sb.append("<").append(preferredPrefix).append(":OptionSelection>").append(SDKUtil.escapeInvalidXmlCharsRegex(optionSelection));
			sb.append("</").append(preferredPrefix).append(":OptionSelection>");
		}
		if(price != null) {
			sb.append("<").append(preferredPrefix).append(":Price>").append(SDKUtil.escapeInvalidXmlCharsRegex(price));
			sb.append("</").append(preferredPrefix).append(":Price>");
		}
		if(optionType != null) {
			sb.append("<").append(preferredPrefix).append(":OptionType>").append(SDKUtil.escapeInvalidXmlCharsRegex(optionType.getValue()));
			sb.append("</").append(preferredPrefix).append(":OptionType>");
		}
		if(paymentPeriod != null) {
			for(int i=0; i < paymentPeriod.size(); i++) {
				sb.append(paymentPeriod.get(i).toXMLString(preferredPrefix,"PaymentPeriod"));
			}
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
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
		    this.optionSelection = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Price", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.price = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OptionType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.optionType = OptionTypeListType.fromValue(childNode.getTextContent());
		}
        nodeList = (NodeList) xpath.evaluate("PaymentPeriod", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.paymentPeriod.add(new InstallmentDetailsType(subNode));
			}
		}
	}
 
}