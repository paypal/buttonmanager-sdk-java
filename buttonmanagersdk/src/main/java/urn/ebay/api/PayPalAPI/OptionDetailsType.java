package urn.ebay.api.PayPalAPI;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.api.PayPalAPI.OptionSelectionDetailsType;
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
 * Option Name. Optional 
 */
public class OptionDetailsType{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * Option Name. Optional 	  
	 *@Required	 
	 */ 
	private String optionName;

	/**
	 * 	 
	 */ 
	private List<OptionSelectionDetailsType> optionSelectionDetails = new ArrayList<OptionSelectionDetailsType>();

	

	/**
	 * Constructor with arguments
	 */
	public OptionDetailsType (String optionName){
		this.optionName = optionName;
	}	

	/**
	 * Default Constructor
	 */
	public OptionDetailsType (){
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
	 * Getter for optionSelectionDetails
	 */
	 public List<OptionSelectionDetailsType> getOptionSelectionDetails() {
	 	return optionSelectionDetails;
	 }
	 
	/**
	 * Setter for optionSelectionDetails
	 */
	 public void setOptionSelectionDetails(List<OptionSelectionDetailsType> optionSelectionDetails) {
	 	this.optionSelectionDetails = optionSelectionDetails;
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
		if(optionName != null) {
			sb.append("<").append(preferredPrefix).append(":OptionName>").append(SDKUtil.escapeInvalidXmlCharsRegex(optionName));
			sb.append("</").append(preferredPrefix).append(":OptionName>");
		}
		if(optionSelectionDetails != null) {
			for(int i=0; i < optionSelectionDetails.size(); i++) {
				sb.append(optionSelectionDetails.get(i).toXMLString(preferredPrefix,"OptionSelectionDetails"));
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
	
	public OptionDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("OptionName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.optionName = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("OptionSelectionDetails", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.optionSelectionDetails.add(new OptionSelectionDetailsType(subNode));
			}
		}
	}
 
}