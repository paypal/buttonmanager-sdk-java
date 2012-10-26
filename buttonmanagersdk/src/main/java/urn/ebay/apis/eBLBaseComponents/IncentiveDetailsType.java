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
	private String UniqueIdentifier;

	/**
	 * Defines if the incentive has been applied on Ebay or PayPal.
	 * 	 
	 */ 
	private IncentiveSiteAppliedOnType SiteAppliedOn;

	/**
	 * The total discount amount for the incentive, summation of
	 * discounts up across all the buckets/items. 	 
	 */ 
	private BasicAmountType TotalDiscountAmount;

	/**
	 * Status of incentive processing. Sussess or Error. 	 
	 */ 
	private IncentiveAppliedStatusType Status;

	/**
	 * Error code if there are any errors. Zero otherwise. 	 
	 */ 
	private Integer ErrorCode;

	/**
	 * Details of incentive application on individual bucket/item. 	 
	 */ 
	private List<IncentiveAppliedDetailsType> IncentiveAppliedDetails = new ArrayList<IncentiveAppliedDetailsType>();

	

	/**
	 * Default Constructor
	 */
	public IncentiveDetailsType (){
	}	

	/**
	 * Getter for UniqueIdentifier
	 */
	 public String getUniqueIdentifier() {
	 	return UniqueIdentifier;
	 }
	 
	/**
	 * Setter for UniqueIdentifier
	 */
	 public void setUniqueIdentifier(String UniqueIdentifier) {
	 	this.UniqueIdentifier = UniqueIdentifier;
	 }
	 
	/**
	 * Getter for SiteAppliedOn
	 */
	 public IncentiveSiteAppliedOnType getSiteAppliedOn() {
	 	return SiteAppliedOn;
	 }
	 
	/**
	 * Setter for SiteAppliedOn
	 */
	 public void setSiteAppliedOn(IncentiveSiteAppliedOnType SiteAppliedOn) {
	 	this.SiteAppliedOn = SiteAppliedOn;
	 }
	 
	/**
	 * Getter for TotalDiscountAmount
	 */
	 public BasicAmountType getTotalDiscountAmount() {
	 	return TotalDiscountAmount;
	 }
	 
	/**
	 * Setter for TotalDiscountAmount
	 */
	 public void setTotalDiscountAmount(BasicAmountType TotalDiscountAmount) {
	 	this.TotalDiscountAmount = TotalDiscountAmount;
	 }
	 
	/**
	 * Getter for Status
	 */
	 public IncentiveAppliedStatusType getStatus() {
	 	return Status;
	 }
	 
	/**
	 * Setter for Status
	 */
	 public void setStatus(IncentiveAppliedStatusType Status) {
	 	this.Status = Status;
	 }
	 
	/**
	 * Getter for ErrorCode
	 */
	 public Integer getErrorCode() {
	 	return ErrorCode;
	 }
	 
	/**
	 * Setter for ErrorCode
	 */
	 public void setErrorCode(Integer ErrorCode) {
	 	this.ErrorCode = ErrorCode;
	 }
	 
	/**
	 * Getter for IncentiveAppliedDetails
	 */
	 public List<IncentiveAppliedDetailsType> getIncentiveAppliedDetails() {
	 	return IncentiveAppliedDetails;
	 }
	 
	/**
	 * Setter for IncentiveAppliedDetails
	 */
	 public void setIncentiveAppliedDetails(List<IncentiveAppliedDetailsType> IncentiveAppliedDetails) {
	 	this.IncentiveAppliedDetails = IncentiveAppliedDetails;
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
		    this.UniqueIdentifier = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SiteAppliedOn", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SiteAppliedOn = IncentiveSiteAppliedOnType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("TotalDiscountAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TotalDiscountAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("Status", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Status = IncentiveAppliedStatusType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ErrorCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.ErrorCode = Integer.valueOf(childNode.getTextContent());
		}
	
        nodeList = (NodeList) xpath.evaluate("IncentiveAppliedDetails", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.IncentiveAppliedDetails.add(new IncentiveAppliedDetailsType(subNode));
			}
		}
	}
 
}