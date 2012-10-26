package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.CreditCardTypeType;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import urn.ebay.apis.eBLBaseComponents.ThreeDSecureRequestType;
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
 * CreditCardDetailsType Information about a Credit Card. 
 */
public class CreditCardDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private CreditCardTypeType creditCardType;

	/**
	 * 	 
	 */ 
	private String creditCardNumber;

	/**
	 * 	 
	 */ 
	private Integer expMonth;

	/**
	 * 	 
	 */ 
	private Integer expYear;

	/**
	 * 	 
	 */ 
	private PayerInfoType cardOwner;

	/**
	 * 	 
	 */ 
	private String cVV2;

	/**
	 * 	 
	 */ 
	private Integer startMonth;

	/**
	 * 	 
	 */ 
	private Integer startYear;

	/**
	 * 	 
	 */ 
	private String issueNumber;

	/**
	 * 	 
	 */ 
	private ThreeDSecureRequestType threeDSecureRequest;

	

	/**
	 * Default Constructor
	 */
	public CreditCardDetailsType (){
	}	

	/**
	 * Getter for creditCardType
	 */
	 public CreditCardTypeType getCreditCardType() {
	 	return creditCardType;
	 }
	 
	/**
	 * Setter for creditCardType
	 */
	 public void setCreditCardType(CreditCardTypeType creditCardType) {
	 	this.creditCardType = creditCardType;
	 }
	 
	/**
	 * Getter for creditCardNumber
	 */
	 public String getCreditCardNumber() {
	 	return creditCardNumber;
	 }
	 
	/**
	 * Setter for creditCardNumber
	 */
	 public void setCreditCardNumber(String creditCardNumber) {
	 	this.creditCardNumber = creditCardNumber;
	 }
	 
	/**
	 * Getter for expMonth
	 */
	 public Integer getExpMonth() {
	 	return expMonth;
	 }
	 
	/**
	 * Setter for expMonth
	 */
	 public void setExpMonth(Integer expMonth) {
	 	this.expMonth = expMonth;
	 }
	 
	/**
	 * Getter for expYear
	 */
	 public Integer getExpYear() {
	 	return expYear;
	 }
	 
	/**
	 * Setter for expYear
	 */
	 public void setExpYear(Integer expYear) {
	 	this.expYear = expYear;
	 }
	 
	/**
	 * Getter for cardOwner
	 */
	 public PayerInfoType getCardOwner() {
	 	return cardOwner;
	 }
	 
	/**
	 * Setter for cardOwner
	 */
	 public void setCardOwner(PayerInfoType cardOwner) {
	 	this.cardOwner = cardOwner;
	 }
	 
	/**
	 * Getter for cVV2
	 */
	 public String getCVV2() {
	 	return cVV2;
	 }
	 
	/**
	 * Setter for cVV2
	 */
	 public void setCVV2(String cVV2) {
	 	this.cVV2 = cVV2;
	 }
	 
	/**
	 * Getter for startMonth
	 */
	 public Integer getStartMonth() {
	 	return startMonth;
	 }
	 
	/**
	 * Setter for startMonth
	 */
	 public void setStartMonth(Integer startMonth) {
	 	this.startMonth = startMonth;
	 }
	 
	/**
	 * Getter for startYear
	 */
	 public Integer getStartYear() {
	 	return startYear;
	 }
	 
	/**
	 * Setter for startYear
	 */
	 public void setStartYear(Integer startYear) {
	 	this.startYear = startYear;
	 }
	 
	/**
	 * Getter for issueNumber
	 */
	 public String getIssueNumber() {
	 	return issueNumber;
	 }
	 
	/**
	 * Setter for issueNumber
	 */
	 public void setIssueNumber(String issueNumber) {
	 	this.issueNumber = issueNumber;
	 }
	 
	/**
	 * Getter for threeDSecureRequest
	 */
	 public ThreeDSecureRequestType getThreeDSecureRequest() {
	 	return threeDSecureRequest;
	 }
	 
	/**
	 * Setter for threeDSecureRequest
	 */
	 public void setThreeDSecureRequest(ThreeDSecureRequestType threeDSecureRequest) {
	 	this.threeDSecureRequest = threeDSecureRequest;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(creditCardType != null) {
			sb.append("<").append(preferredPrefix).append(":CreditCardType>").append(SDKUtil.escapeInvalidXmlCharsRegex(creditCardType.getValue()));
			sb.append("</").append(preferredPrefix).append(":CreditCardType>");
		}
		if(creditCardNumber != null) {
			sb.append("<").append(preferredPrefix).append(":CreditCardNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(creditCardNumber));
			sb.append("</").append(preferredPrefix).append(":CreditCardNumber>");
		}
		if(expMonth != null) {
			sb.append("<").append(preferredPrefix).append(":ExpMonth>").append(SDKUtil.escapeInvalidXmlCharsRegex(expMonth));
			sb.append("</").append(preferredPrefix).append(":ExpMonth>");
		}
		if(expYear != null) {
			sb.append("<").append(preferredPrefix).append(":ExpYear>").append(SDKUtil.escapeInvalidXmlCharsRegex(expYear));
			sb.append("</").append(preferredPrefix).append(":ExpYear>");
		}
		if(cardOwner != null) {
			sb.append(cardOwner.toXMLString(preferredPrefix,"CardOwner"));
		}
		if(cVV2 != null) {
			sb.append("<").append(preferredPrefix).append(":CVV2>").append(SDKUtil.escapeInvalidXmlCharsRegex(cVV2));
			sb.append("</").append(preferredPrefix).append(":CVV2>");
		}
		if(startMonth != null) {
			sb.append("<").append(preferredPrefix).append(":StartMonth>").append(SDKUtil.escapeInvalidXmlCharsRegex(startMonth));
			sb.append("</").append(preferredPrefix).append(":StartMonth>");
		}
		if(startYear != null) {
			sb.append("<").append(preferredPrefix).append(":StartYear>").append(SDKUtil.escapeInvalidXmlCharsRegex(startYear));
			sb.append("</").append(preferredPrefix).append(":StartYear>");
		}
		if(issueNumber != null) {
			sb.append("<").append(preferredPrefix).append(":IssueNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(issueNumber));
			sb.append("</").append(preferredPrefix).append(":IssueNumber>");
		}
		if(threeDSecureRequest != null) {
			sb.append(threeDSecureRequest.toXMLString(preferredPrefix,"ThreeDSecureRequest"));
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
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
	
	public CreditCardDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("CreditCardType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.creditCardType = CreditCardTypeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("CreditCardNumber", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.creditCardNumber = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ExpMonth", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.expMonth = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("ExpYear", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.expYear = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("CardOwner", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.cardOwner =  new PayerInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("CVV2", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.cVV2 = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("StartMonth", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.startMonth = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("StartYear", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.startYear = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("IssueNumber", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.issueNumber = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ThreeDSecureRequest", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.threeDSecureRequest =  new ThreeDSecureRequestType(childNode);
		}
	}
 
}