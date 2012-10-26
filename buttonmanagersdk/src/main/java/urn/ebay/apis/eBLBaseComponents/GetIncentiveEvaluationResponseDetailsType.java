package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.IncentiveDetailType;
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
public class GetIncentiveEvaluationResponseDetailsType{


	/**
	 * 	 
	 */ 
	private List<IncentiveDetailType> IncentiveDetails = new ArrayList<IncentiveDetailType>();

	/**
	 * 	 
	 */ 
	private String RequestId;

	

	/**
	 * Default Constructor
	 */
	public GetIncentiveEvaluationResponseDetailsType (){
	}	

	/**
	 * Getter for IncentiveDetails
	 */
	 public List<IncentiveDetailType> getIncentiveDetails() {
	 	return IncentiveDetails;
	 }
	 
	/**
	 * Setter for IncentiveDetails
	 */
	 public void setIncentiveDetails(List<IncentiveDetailType> IncentiveDetails) {
	 	this.IncentiveDetails = IncentiveDetails;
	 }
	 
	/**
	 * Getter for RequestId
	 */
	 public String getRequestId() {
	 	return RequestId;
	 }
	 
	/**
	 * Setter for RequestId
	 */
	 public void setRequestId(String RequestId) {
	 	this.RequestId = RequestId;
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
	
	public GetIncentiveEvaluationResponseDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
        nodeList = (NodeList) xpath.evaluate("IncentiveDetails", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.IncentiveDetails.add(new IncentiveDetailType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("RequestId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.RequestId = childNode.getTextContent();
		}
	
	}
 
}