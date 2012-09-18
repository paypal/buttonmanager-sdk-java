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


	/**
	 * 	 
	 */ 
	private CreditCardTypeType CreditCardType;

	/**
	 * 	 
	 */ 
	private String CreditCardNumber;

	/**
	 * 	 
	 */ 
	private Integer ExpMonth;

	/**
	 * 	 
	 */ 
	private Integer ExpYear;

	/**
	 * 	 
	 */ 
	private PayerInfoType CardOwner;

	/**
	 * 	 
	 */ 
	private String CVV2;

	/**
	 * 	 
	 */ 
	private Integer StartMonth;

	/**
	 * 	 
	 */ 
	private Integer StartYear;

	/**
	 * 	 
	 */ 
	private String IssueNumber;

	/**
	 * 	 
	 */ 
	private ThreeDSecureRequestType ThreeDSecureRequest;

	

	/**
	 * Default Constructor
	 */
	public CreditCardDetailsType (){
	}	

	/**
	 * Getter for CreditCardType
	 */
	 public CreditCardTypeType getCreditCardType() {
	 	return CreditCardType;
	 }
	 
	/**
	 * Setter for CreditCardType
	 */
	 public void setCreditCardType(CreditCardTypeType CreditCardType) {
	 	this.CreditCardType = CreditCardType;
	 }
	 
	/**
	 * Getter for CreditCardNumber
	 */
	 public String getCreditCardNumber() {
	 	return CreditCardNumber;
	 }
	 
	/**
	 * Setter for CreditCardNumber
	 */
	 public void setCreditCardNumber(String CreditCardNumber) {
	 	this.CreditCardNumber = CreditCardNumber;
	 }
	 
	/**
	 * Getter for ExpMonth
	 */
	 public Integer getExpMonth() {
	 	return ExpMonth;
	 }
	 
	/**
	 * Setter for ExpMonth
	 */
	 public void setExpMonth(Integer ExpMonth) {
	 	this.ExpMonth = ExpMonth;
	 }
	 
	/**
	 * Getter for ExpYear
	 */
	 public Integer getExpYear() {
	 	return ExpYear;
	 }
	 
	/**
	 * Setter for ExpYear
	 */
	 public void setExpYear(Integer ExpYear) {
	 	this.ExpYear = ExpYear;
	 }
	 
	/**
	 * Getter for CardOwner
	 */
	 public PayerInfoType getCardOwner() {
	 	return CardOwner;
	 }
	 
	/**
	 * Setter for CardOwner
	 */
	 public void setCardOwner(PayerInfoType CardOwner) {
	 	this.CardOwner = CardOwner;
	 }
	 
	/**
	 * Getter for CVV2
	 */
	 public String getCVV2() {
	 	return CVV2;
	 }
	 
	/**
	 * Setter for CVV2
	 */
	 public void setCVV2(String CVV2) {
	 	this.CVV2 = CVV2;
	 }
	 
	/**
	 * Getter for StartMonth
	 */
	 public Integer getStartMonth() {
	 	return StartMonth;
	 }
	 
	/**
	 * Setter for StartMonth
	 */
	 public void setStartMonth(Integer StartMonth) {
	 	this.StartMonth = StartMonth;
	 }
	 
	/**
	 * Getter for StartYear
	 */
	 public Integer getStartYear() {
	 	return StartYear;
	 }
	 
	/**
	 * Setter for StartYear
	 */
	 public void setStartYear(Integer StartYear) {
	 	this.StartYear = StartYear;
	 }
	 
	/**
	 * Getter for IssueNumber
	 */
	 public String getIssueNumber() {
	 	return IssueNumber;
	 }
	 
	/**
	 * Setter for IssueNumber
	 */
	 public void setIssueNumber(String IssueNumber) {
	 	this.IssueNumber = IssueNumber;
	 }
	 
	/**
	 * Getter for ThreeDSecureRequest
	 */
	 public ThreeDSecureRequestType getThreeDSecureRequest() {
	 	return ThreeDSecureRequest;
	 }
	 
	/**
	 * Setter for ThreeDSecureRequest
	 */
	 public void setThreeDSecureRequest(ThreeDSecureRequestType ThreeDSecureRequest) {
	 	this.ThreeDSecureRequest = ThreeDSecureRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(CreditCardType != null) {
			sb.append("<ebl:CreditCardType>").append(SDKUtil.escapeInvalidXmlCharsRegex(CreditCardType.getValue()));
			sb.append("</ebl:CreditCardType>");
		}
		if(CreditCardNumber != null) {
			sb.append("<ebl:CreditCardNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(CreditCardNumber));
			sb.append("</ebl:CreditCardNumber>");
		}
		if(ExpMonth != null) {
			sb.append("<ebl:ExpMonth>").append(SDKUtil.escapeInvalidXmlCharsRegex(ExpMonth));
			sb.append("</ebl:ExpMonth>");
		}
		if(ExpYear != null) {
			sb.append("<ebl:ExpYear>").append(SDKUtil.escapeInvalidXmlCharsRegex(ExpYear));
			sb.append("</ebl:ExpYear>");
		}
		if(CardOwner != null) {
			sb.append("<ebl:CardOwner>");
			sb.append(CardOwner.toXMLString());
			sb.append("</ebl:CardOwner>");
		}
		if(CVV2 != null) {
			sb.append("<ebl:CVV2>").append(SDKUtil.escapeInvalidXmlCharsRegex(CVV2));
			sb.append("</ebl:CVV2>");
		}
		if(StartMonth != null) {
			sb.append("<ebl:StartMonth>").append(SDKUtil.escapeInvalidXmlCharsRegex(StartMonth));
			sb.append("</ebl:StartMonth>");
		}
		if(StartYear != null) {
			sb.append("<ebl:StartYear>").append(SDKUtil.escapeInvalidXmlCharsRegex(StartYear));
			sb.append("</ebl:StartYear>");
		}
		if(IssueNumber != null) {
			sb.append("<ebl:IssueNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(IssueNumber));
			sb.append("</ebl:IssueNumber>");
		}
		if(ThreeDSecureRequest != null) {
			sb.append("<ebl:ThreeDSecureRequest>");
			sb.append(ThreeDSecureRequest.toXMLString());
			sb.append("</ebl:ThreeDSecureRequest>");
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
		    this.CreditCardType = CreditCardTypeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("CreditCardNumber", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CreditCardNumber = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ExpMonth", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.ExpMonth = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("ExpYear", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.ExpYear = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("CardOwner", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CardOwner =  new PayerInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("CVV2", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CVV2 = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("StartMonth", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.StartMonth = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("StartYear", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.StartYear = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("IssueNumber", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.IssueNumber = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ThreeDSecureRequest", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ThreeDSecureRequest =  new ThreeDSecureRequestType(childNode);
		}
	}
 
}