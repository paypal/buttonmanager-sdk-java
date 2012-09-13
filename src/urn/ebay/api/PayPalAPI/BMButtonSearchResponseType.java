package urn.ebay.api.PayPalAPI;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.ButtonSearchResultType;
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
public class BMButtonSearchResponseType extends AbstractResponseType {


	/**
	 * 	 
	 */ 
	private List<ButtonSearchResultType> ButtonSearchResult = new ArrayList<ButtonSearchResultType>();

	

	/**
	 * Default Constructor
	 */
	public BMButtonSearchResponseType (){
	}	

	/**
	 * Getter for ButtonSearchResult
	 */
	 public List<ButtonSearchResultType> getButtonSearchResult() {
	 	return ButtonSearchResult;
	 }
	 
	/**
	 * Setter for ButtonSearchResult
	 */
	 public void setButtonSearchResult(List<ButtonSearchResultType> ButtonSearchResult) {
	 	this.ButtonSearchResult = ButtonSearchResult;
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
	
	public BMButtonSearchResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
        nodeList = (NodeList) xpath.evaluate("ButtonSearchResult", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.ButtonSearchResult.add(new ButtonSearchResultType(subNode));
			}
		}
	}
 
}