package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.IncentiveSiteAppliedOnType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.IncentiveAppliedStatusType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.IncentiveAppliedDetailsType;
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
 * Information about the incentives that were applied from Ebay
 * RYP page and PayPal RYP page. 
 */
public class IncentiveDetailsType{


	/**
	 * Unique Identifier consisting of redemption code, user
	 * friendly descripotion, incentive type, campaign code,
	 * incenitve application order and site redeemed on. 	 
	 */ 
	private String uniqueIdentifier;

	/**
	 * Defines if the incentive has been applied on Ebay or PayPal.
	 * 	 
	 */ 
	private IncentiveSiteAppliedOnType siteAppliedOn;

	/**
	 * The total discount amount for the incentive, summation of
	 * discounts up across all the buckets/items. 	 
	 */ 
	private BasicAmountType totalDiscountAmount;

	/**
	 * Status of incentive processing. Sussess or Error. 	 
	 */ 
	private IncentiveAppliedStatusType status;

	/**
	 * Error code if there are any errors. Zero otherwise. 	 
	 */ 
	private Integer errorCode;

	/**
	 * Details of incentive application on individual bucket/item. 	 
	 */ 
	private List<IncentiveAppliedDetailsType> incentiveAppliedDetails = new ArrayList<IncentiveAppliedDetailsType>();

	

	/**
	 * Default Constructor
	 */
	public IncentiveDetailsType (){
	}	

	/**
	 * Getter for uniqueIdentifier
	 */
	 public String getUniqueIdentifier() {
	 	return uniqueIdentifier;
	 }
	 
	/**
	 * Setter for uniqueIdentifier
	 */
	 public void setUniqueIdentifier(String uniqueIdentifier) {
	 	this.uniqueIdentifier = uniqueIdentifier;
	 }
	 
	/**
	 * Getter for siteAppliedOn
	 */
	 public IncentiveSiteAppliedOnType getSiteAppliedOn() {
	 	return siteAppliedOn;
	 }
	 
	/**
	 * Setter for siteAppliedOn
	 */
	 public void setSiteAppliedOn(IncentiveSiteAppliedOnType siteAppliedOn) {
	 	this.siteAppliedOn = siteAppliedOn;
	 }
	 
	/**
	 * Getter for totalDiscountAmount
	 */
	 public BasicAmountType getTotalDiscountAmount() {
	 	return totalDiscountAmount;
	 }
	 
	/**
	 * Setter for totalDiscountAmount
	 */
	 public void setTotalDiscountAmount(BasicAmountType totalDiscountAmount) {
	 	this.totalDiscountAmount = totalDiscountAmount;
	 }
	 
	/**
	 * Getter for status
	 */
	 public IncentiveAppliedStatusType getStatus() {
	 	return status;
	 }
	 
	/**
	 * Setter for status
	 */
	 public void setStatus(IncentiveAppliedStatusType status) {
	 	this.status = status;
	 }
	 
	/**
	 * Getter for errorCode
	 */
	 public Integer getErrorCode() {
	 	return errorCode;
	 }
	 
	/**
	 * Setter for errorCode
	 */
	 public void setErrorCode(Integer errorCode) {
	 	this.errorCode = errorCode;
	 }
	 
	/**
	 * Getter for incentiveAppliedDetails
	 */
	 public List<IncentiveAppliedDetailsType> getIncentiveAppliedDetails() {
	 	return incentiveAppliedDetails;
	 }
	 
	/**
	 * Setter for incentiveAppliedDetails
	 */
	 public void setIncentiveAppliedDetails(List<IncentiveAppliedDetailsType> incentiveAppliedDetails) {
	 	this.incentiveAppliedDetails = incentiveAppliedDetails;
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
	
	public IncentiveDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("UniqueIdentifier", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.uniqueIdentifier = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SiteAppliedOn", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.siteAppliedOn = IncentiveSiteAppliedOnType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("TotalDiscountAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.totalDiscountAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("Status", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.status = IncentiveAppliedStatusType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ErrorCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.errorCode = Integer.valueOf(childNode.getTextContent());
		}
	
        nodeList = (NodeList) xpath.evaluate("IncentiveAppliedDetails", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.incentiveAppliedDetails.add(new IncentiveAppliedDetailsType(subNode));
			}
		}
	}
 
}