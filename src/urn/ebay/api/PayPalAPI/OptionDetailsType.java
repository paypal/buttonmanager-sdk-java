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


	/**
	 * Option Name. Optional 	  
	 *@Required	 
	 */ 
	private String OptionName;

	/**
	 * 	 
	 */ 
	private List<OptionSelectionDetailsType> OptionSelectionDetails = new ArrayList<OptionSelectionDetailsType>();

	

	/**
	 * Constructor with arguments
	 */
	public OptionDetailsType (String OptionName){
		this.OptionName = OptionName;
	}	

	/**
	 * Default Constructor
	 */
	public OptionDetailsType (){
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
	 * Getter for OptionSelectionDetails
	 */
	 public List<OptionSelectionDetailsType> getOptionSelectionDetails() {
	 	return OptionSelectionDetails;
	 }
	 
	/**
	 * Setter for OptionSelectionDetails
	 */
	 public void setOptionSelectionDetails(List<OptionSelectionDetailsType> OptionSelectionDetails) {
	 	this.OptionSelectionDetails = OptionSelectionDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(OptionName != null) {
			sb.append("<urn:OptionName>").append(SDKUtil.escapeInvalidXmlCharsRegex(OptionName));
			sb.append("</urn:OptionName>");
		}
		if(OptionSelectionDetails != null) {
			for(int i=0; i < OptionSelectionDetails.size(); i++) {
				sb.append("<urn:OptionSelectionDetails>");
				sb.append(OptionSelectionDetails.get(i).toXMLString());
				sb.append("</urn:OptionSelectionDetails>");
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
		    this.OptionName = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("OptionSelectionDetails", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.OptionSelectionDetails.add(new OptionSelectionDetailsType(subNode));
			}
		}
	}
 
}