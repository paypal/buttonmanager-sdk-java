package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.RecurringPaymentsProfileStatusType;
import urn.ebay.apis.eBLBaseComponents.AutoBillType;
import urn.ebay.apis.eBLBaseComponents.RecurringPaymentsProfileDetailsType;
import urn.ebay.apis.eBLBaseComponents.BillingPeriodDetailsType;
import urn.ebay.apis.eBLBaseComponents.RecurringPaymentsSummaryType;
import urn.ebay.apis.eBLBaseComponents.CreditCardDetailsType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
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
 * Recurring Billing Profile ID 
 */
public class GetRecurringPaymentsProfileDetailsResponseDetailsType{


	/**
	 * Recurring Billing Profile ID 	  
	 *@Required	 
	 */ 
	private String ProfileID;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private RecurringPaymentsProfileStatusType ProfileStatus;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String Description;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private AutoBillType AutoBillOutstandingAmount;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private Integer MaxFailedPayments;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private RecurringPaymentsProfileDetailsType RecurringPaymentsProfileDetails;

	/**
	 * 	 
	 */ 
	private BillingPeriodDetailsType CurrentRecurringPaymentsPeriod;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private RecurringPaymentsSummaryType RecurringPaymentsSummary;

	/**
	 * 	 
	 */ 
	private CreditCardDetailsType CreditCard;

	/**
	 * 	 
	 */ 
	private BillingPeriodDetailsType TrialRecurringPaymentsPeriod;

	/**
	 * 	 
	 */ 
	private BillingPeriodDetailsType RegularRecurringPaymentsPeriod;

	/**
	 * 	 
	 */ 
	private BasicAmountType TrialAmountPaid;

	/**
	 * 	 
	 */ 
	private BasicAmountType RegularAmountPaid;

	/**
	 * 	 
	 */ 
	private BasicAmountType AggregateAmount;

	/**
	 * 	 
	 */ 
	private BasicAmountType AggregateOptionalAmount;

	/**
	 * 	 
	 */ 
	private String FinalPaymentDueDate;

	

	/**
	 * Default Constructor
	 */
	public GetRecurringPaymentsProfileDetailsResponseDetailsType (){
	}	

	/**
	 * Getter for ProfileID
	 */
	 public String getProfileID() {
	 	return ProfileID;
	 }
	 
	/**
	 * Setter for ProfileID
	 */
	 public void setProfileID(String ProfileID) {
	 	this.ProfileID = ProfileID;
	 }
	 
	/**
	 * Getter for ProfileStatus
	 */
	 public RecurringPaymentsProfileStatusType getProfileStatus() {
	 	return ProfileStatus;
	 }
	 
	/**
	 * Setter for ProfileStatus
	 */
	 public void setProfileStatus(RecurringPaymentsProfileStatusType ProfileStatus) {
	 	this.ProfileStatus = ProfileStatus;
	 }
	 
	/**
	 * Getter for Description
	 */
	 public String getDescription() {
	 	return Description;
	 }
	 
	/**
	 * Setter for Description
	 */
	 public void setDescription(String Description) {
	 	this.Description = Description;
	 }
	 
	/**
	 * Getter for AutoBillOutstandingAmount
	 */
	 public AutoBillType getAutoBillOutstandingAmount() {
	 	return AutoBillOutstandingAmount;
	 }
	 
	/**
	 * Setter for AutoBillOutstandingAmount
	 */
	 public void setAutoBillOutstandingAmount(AutoBillType AutoBillOutstandingAmount) {
	 	this.AutoBillOutstandingAmount = AutoBillOutstandingAmount;
	 }
	 
	/**
	 * Getter for MaxFailedPayments
	 */
	 public Integer getMaxFailedPayments() {
	 	return MaxFailedPayments;
	 }
	 
	/**
	 * Setter for MaxFailedPayments
	 */
	 public void setMaxFailedPayments(Integer MaxFailedPayments) {
	 	this.MaxFailedPayments = MaxFailedPayments;
	 }
	 
	/**
	 * Getter for RecurringPaymentsProfileDetails
	 */
	 public RecurringPaymentsProfileDetailsType getRecurringPaymentsProfileDetails() {
	 	return RecurringPaymentsProfileDetails;
	 }
	 
	/**
	 * Setter for RecurringPaymentsProfileDetails
	 */
	 public void setRecurringPaymentsProfileDetails(RecurringPaymentsProfileDetailsType RecurringPaymentsProfileDetails) {
	 	this.RecurringPaymentsProfileDetails = RecurringPaymentsProfileDetails;
	 }
	 
	/**
	 * Getter for CurrentRecurringPaymentsPeriod
	 */
	 public BillingPeriodDetailsType getCurrentRecurringPaymentsPeriod() {
	 	return CurrentRecurringPaymentsPeriod;
	 }
	 
	/**
	 * Setter for CurrentRecurringPaymentsPeriod
	 */
	 public void setCurrentRecurringPaymentsPeriod(BillingPeriodDetailsType CurrentRecurringPaymentsPeriod) {
	 	this.CurrentRecurringPaymentsPeriod = CurrentRecurringPaymentsPeriod;
	 }
	 
	/**
	 * Getter for RecurringPaymentsSummary
	 */
	 public RecurringPaymentsSummaryType getRecurringPaymentsSummary() {
	 	return RecurringPaymentsSummary;
	 }
	 
	/**
	 * Setter for RecurringPaymentsSummary
	 */
	 public void setRecurringPaymentsSummary(RecurringPaymentsSummaryType RecurringPaymentsSummary) {
	 	this.RecurringPaymentsSummary = RecurringPaymentsSummary;
	 }
	 
	/**
	 * Getter for CreditCard
	 */
	 public CreditCardDetailsType getCreditCard() {
	 	return CreditCard;
	 }
	 
	/**
	 * Setter for CreditCard
	 */
	 public void setCreditCard(CreditCardDetailsType CreditCard) {
	 	this.CreditCard = CreditCard;
	 }
	 
	/**
	 * Getter for TrialRecurringPaymentsPeriod
	 */
	 public BillingPeriodDetailsType getTrialRecurringPaymentsPeriod() {
	 	return TrialRecurringPaymentsPeriod;
	 }
	 
	/**
	 * Setter for TrialRecurringPaymentsPeriod
	 */
	 public void setTrialRecurringPaymentsPeriod(BillingPeriodDetailsType TrialRecurringPaymentsPeriod) {
	 	this.TrialRecurringPaymentsPeriod = TrialRecurringPaymentsPeriod;
	 }
	 
	/**
	 * Getter for RegularRecurringPaymentsPeriod
	 */
	 public BillingPeriodDetailsType getRegularRecurringPaymentsPeriod() {
	 	return RegularRecurringPaymentsPeriod;
	 }
	 
	/**
	 * Setter for RegularRecurringPaymentsPeriod
	 */
	 public void setRegularRecurringPaymentsPeriod(BillingPeriodDetailsType RegularRecurringPaymentsPeriod) {
	 	this.RegularRecurringPaymentsPeriod = RegularRecurringPaymentsPeriod;
	 }
	 
	/**
	 * Getter for TrialAmountPaid
	 */
	 public BasicAmountType getTrialAmountPaid() {
	 	return TrialAmountPaid;
	 }
	 
	/**
	 * Setter for TrialAmountPaid
	 */
	 public void setTrialAmountPaid(BasicAmountType TrialAmountPaid) {
	 	this.TrialAmountPaid = TrialAmountPaid;
	 }
	 
	/**
	 * Getter for RegularAmountPaid
	 */
	 public BasicAmountType getRegularAmountPaid() {
	 	return RegularAmountPaid;
	 }
	 
	/**
	 * Setter for RegularAmountPaid
	 */
	 public void setRegularAmountPaid(BasicAmountType RegularAmountPaid) {
	 	this.RegularAmountPaid = RegularAmountPaid;
	 }
	 
	/**
	 * Getter for AggregateAmount
	 */
	 public BasicAmountType getAggregateAmount() {
	 	return AggregateAmount;
	 }
	 
	/**
	 * Setter for AggregateAmount
	 */
	 public void setAggregateAmount(BasicAmountType AggregateAmount) {
	 	this.AggregateAmount = AggregateAmount;
	 }
	 
	/**
	 * Getter for AggregateOptionalAmount
	 */
	 public BasicAmountType getAggregateOptionalAmount() {
	 	return AggregateOptionalAmount;
	 }
	 
	/**
	 * Setter for AggregateOptionalAmount
	 */
	 public void setAggregateOptionalAmount(BasicAmountType AggregateOptionalAmount) {
	 	this.AggregateOptionalAmount = AggregateOptionalAmount;
	 }
	 
	/**
	 * Getter for FinalPaymentDueDate
	 */
	 public String getFinalPaymentDueDate() {
	 	return FinalPaymentDueDate;
	 }
	 
	/**
	 * Setter for FinalPaymentDueDate
	 */
	 public void setFinalPaymentDueDate(String FinalPaymentDueDate) {
	 	this.FinalPaymentDueDate = FinalPaymentDueDate;
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
	
	public GetRecurringPaymentsProfileDetailsResponseDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("ProfileID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ProfileID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProfileStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ProfileStatus = RecurringPaymentsProfileStatusType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("Description", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Description = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AutoBillOutstandingAmount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AutoBillOutstandingAmount = AutoBillType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("MaxFailedPayments", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.MaxFailedPayments = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("RecurringPaymentsProfileDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.RecurringPaymentsProfileDetails =  new RecurringPaymentsProfileDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("CurrentRecurringPaymentsPeriod", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CurrentRecurringPaymentsPeriod =  new BillingPeriodDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("RecurringPaymentsSummary", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.RecurringPaymentsSummary =  new RecurringPaymentsSummaryType(childNode);
		}
		childNode = (Node) xpath.evaluate("CreditCard", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CreditCard =  new CreditCardDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("TrialRecurringPaymentsPeriod", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TrialRecurringPaymentsPeriod =  new BillingPeriodDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("RegularRecurringPaymentsPeriod", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.RegularRecurringPaymentsPeriod =  new BillingPeriodDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("TrialAmountPaid", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TrialAmountPaid =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("RegularAmountPaid", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.RegularAmountPaid =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("AggregateAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AggregateAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("AggregateOptionalAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AggregateOptionalAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("FinalPaymentDueDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.FinalPaymentDueDate = childNode.getTextContent();
		}
	
	}
 
}