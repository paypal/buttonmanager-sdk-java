package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.MerchantPullPaymentResponseType;
import urn.ebay.apis.eBLBaseComponents.FMFDetailsType;
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
public class BillUserResponseType extends AbstractResponseType {


	/**
	 * 	 
	 */ 
	private MerchantPullPaymentResponseType BillUserResponseDetails;

	/**
	 * 	 
	 */ 
	private FMFDetailsType FMFDetails;

	

	/**
	 * Default Constructor
	 */
	public BillUserResponseType (){
	}	

	/**
	 * Getter for BillUserResponseDetails
	 */
	 public MerchantPullPaymentResponseType getBillUserResponseDetails() {
	 	return BillUserResponseDetails;
	 }
	 
	/**
	 * Setter for BillUserResponseDetails
	 */
	 public void setBillUserResponseDetails(MerchantPullPaymentResponseType BillUserResponseDetails) {
	 	this.BillUserResponseDetails = BillUserResponseDetails;
	 }
	 
	/**
	 * Getter for FMFDetails
	 */
	 public FMFDetailsType getFMFDetails() {
	 	return FMFDetails;
	 }
	 
	/**
	 * Setter for FMFDetails
	 */
	 public void setFMFDetails(FMFDetailsType FMFDetails) {
	 	this.FMFDetails = FMFDetails;
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
	
	public BillUserResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("BillUserResponseDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.BillUserResponseDetails =  new MerchantPullPaymentResponseType(childNode);
		}
		childNode = (Node) xpath.evaluate("FMFDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.FMFDetails =  new FMFDetailsType(childNode);
		}
	}
 
}