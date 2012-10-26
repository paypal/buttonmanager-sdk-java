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
	private BasicAmountType balance;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String balanceTimeStamp;

	/**
	 * 	 
	 */ 
	private List<BasicAmountType> balanceHoldings = new ArrayList<BasicAmountType>();

	

	/**
	 * Default Constructor
	 */
	public GetBalanceResponseType (){
	}	

	/**
	 * Getter for balance
	 */
	 public BasicAmountType getBalance() {
	 	return balance;
	 }
	 
	/**
	 * Setter for balance
	 */
	 public void setBalance(BasicAmountType balance) {
	 	this.balance = balance;
	 }
	 
	/**
	 * Getter for balanceTimeStamp
	 */
	 public String getBalanceTimeStamp() {
	 	return balanceTimeStamp;
	 }
	 
	/**
	 * Setter for balanceTimeStamp
	 */
	 public void setBalanceTimeStamp(String balanceTimeStamp) {
	 	this.balanceTimeStamp = balanceTimeStamp;
	 }
	 
	/**
	 * Getter for balanceHoldings
	 */
	 public List<BasicAmountType> getBalanceHoldings() {
	 	return balanceHoldings;
	 }
	 
	/**
	 * Setter for balanceHoldings
	 */
	 public void setBalanceHoldings(List<BasicAmountType> balanceHoldings) {
	 	this.balanceHoldings = balanceHoldings;
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
		    this.balance =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("BalanceTimeStamp", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.balanceTimeStamp = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("BalanceHoldings", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.balanceHoldings.add(new BasicAmountType(subNode));
			}
		}
	}
 
}