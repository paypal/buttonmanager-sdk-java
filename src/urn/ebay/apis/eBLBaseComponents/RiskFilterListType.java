package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.RiskFilterDetailsType;
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
 * Details of Risk Filter. 
 */
public class RiskFilterListType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private List<RiskFilterDetailsType> Filters = new ArrayList<RiskFilterDetailsType>();

	

	/**
	 * Default Constructor
	 */
	public RiskFilterListType (){
	}	

	/**
	 * Getter for Filters
	 */
	 public List<RiskFilterDetailsType> getFilters() {
	 	return Filters;
	 }
	 
	/**
	 * Setter for Filters
	 */
	 public void setFilters(List<RiskFilterDetailsType> Filters) {
	 	this.Filters = Filters;
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
	
	public RiskFilterListType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
        nodeList = (NodeList) xpath.evaluate("Filters", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.Filters.add(new RiskFilterDetailsType(subNode));
			}
		}
	}
 
}