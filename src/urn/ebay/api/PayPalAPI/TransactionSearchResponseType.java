package urn.ebay.api.PayPalAPI;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.PaymentTransactionSearchResultType;
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
 * Results of a Transaction Search.
 */
public class TransactionSearchResponseType extends AbstractResponseType {


	/**
	 * Results of a Transaction Search.	 
	 */ 
	private List<PaymentTransactionSearchResultType> PaymentTransactions = new ArrayList<PaymentTransactionSearchResultType>();

	

	/**
	 * Default Constructor
	 */
	public TransactionSearchResponseType (){
	}	

	/**
	 * Getter for PaymentTransactions
	 */
	 public List<PaymentTransactionSearchResultType> getPaymentTransactions() {
	 	return PaymentTransactions;
	 }
	 
	/**
	 * Setter for PaymentTransactions
	 */
	 public void setPaymentTransactions(List<PaymentTransactionSearchResultType> PaymentTransactions) {
	 	this.PaymentTransactions = PaymentTransactions;
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
	
	public TransactionSearchResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
        nodeList = (NodeList) xpath.evaluate("PaymentTransactions", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.PaymentTransactions.add(new PaymentTransactionSearchResultType(subNode));
			}
		}
	}
 
}