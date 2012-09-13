package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import java.util.List;
import java.util.ArrayList;
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
public class GetBalanceResponseType extends AbstractResponseType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private BasicAmountType Balance;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String BalanceTimeStamp;

	/**
	 * 	 
	 */ 
	private List<BasicAmountType> BalanceHoldings = new ArrayList<BasicAmountType>();

	

	/**
	 * Default Constructor
	 */
	public GetBalanceResponseType (){
	}	

	/**
	 * Getter for Balance
	 */
	 public BasicAmountType getBalance() {
	 	return Balance;
	 }
	 
	/**
	 * Setter for Balance
	 */
	 public void setBalance(BasicAmountType Balance) {
	 	this.Balance = Balance;
	 }
	 
	/**
	 * Getter for BalanceTimeStamp
	 */
	 public String getBalanceTimeStamp() {
	 	return BalanceTimeStamp;
	 }
	 
	/**
	 * Setter for BalanceTimeStamp
	 */
	 public void setBalanceTimeStamp(String BalanceTimeStamp) {
	 	this.BalanceTimeStamp = BalanceTimeStamp;
	 }
	 
	/**
	 * Getter for BalanceHoldings
	 */
	 public List<BasicAmountType> getBalanceHoldings() {
	 	return BalanceHoldings;
	 }
	 
	/**
	 * Setter for BalanceHoldings
	 */
	 public void setBalanceHoldings(List<BasicAmountType> BalanceHoldings) {
	 	this.BalanceHoldings = BalanceHoldings;
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
	
	public GetBalanceResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Balance", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Balance =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("BalanceTimeStamp", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.BalanceTimeStamp = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("BalanceHoldings", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.BalanceHoldings.add(new BasicAmountType(subNode));
			}
		}
	}
 
}