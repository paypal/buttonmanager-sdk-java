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
		} else if (n.getNodeType() == Node.ELEMENT_NODE ){
			return (n.getChildNodes().getLength() == 0);
		} else {
			return false;
		}
	}
	
	private String convertToXML(Node n){
		String name = n.getNodeName();
		short type = n.getNodeType();
		if (Node.CDATA_SECTION_NODE == type) {
			return "<![CDATA[" + n.getNodeValue() + "]]&gt;";
		}
		if (name.startsWith("#")) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		sb.append("<").append(name);
		NamedNodeMap attrs = n.getAttributes();
		if (attrs != null) {
			for (int i = 0; i < attrs.getLength(); i++) {
				Node attr = attrs.item(i);
				sb.append(" ").append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
			}
		}
		String textContent = null;
		NodeList children = n.getChildNodes();
		if (children.getLength() == 0) {
			if (((textContent = n.getTextContent())) != null && (!"".equals(textContent))) {
				sb.append(textContent).append("</").append(name).append(">");
			} else {
				sb.append("/>");
			}
		} else {
			sb.append(">");
			boolean hasValidChildren = false;
			for (int i = 0; i < children.getLength(); i++) {
				String childToString = convertToXML(children.item(i));
				if (!"".equals(childToString)) {
					sb.append(childToString);
					hasValidChildren = true;
				}
			}
			if (!hasValidChildren && ((textContent = n.getTextContent()) != null)) {
				sb.append(textContent);
			}
			sb.append("</").append(name).append(">");
		}
		return sb.toString();
	}
	
	public GetRecurringPaymentsProfileDetailsResponseDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("ProfileID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ProfileID").item(0))) {
				this.ProfileID = (String)document.getElementsByTagName("ProfileID").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("ProfileStatus").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ProfileStatus").item(0))) {
				this.ProfileStatus = RecurringPaymentsProfileStatusType.fromValue(document.getElementsByTagName("ProfileStatus").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("Description").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Description").item(0))) {
				this.Description = (String)document.getElementsByTagName("Description").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("AutoBillOutstandingAmount").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("AutoBillOutstandingAmount").item(0))) {
				this.AutoBillOutstandingAmount = AutoBillType.fromValue(document.getElementsByTagName("AutoBillOutstandingAmount").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("MaxFailedPayments").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("MaxFailedPayments").item(0))) {
				this.MaxFailedPayments = Integer.valueOf(document.getElementsByTagName("MaxFailedPayments").item(0).getTextContent());
			}
		}
	
		if(document.getElementsByTagName("RecurringPaymentsProfileDetails").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("RecurringPaymentsProfileDetails").item(0))) {
				nodeList = document.getElementsByTagName("RecurringPaymentsProfileDetails");
				xmlString = convertToXML(nodeList.item(0));
				this.RecurringPaymentsProfileDetails =  new RecurringPaymentsProfileDetailsType(xmlString);
			}
		}
		if(document.getElementsByTagName("CurrentRecurringPaymentsPeriod").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("CurrentRecurringPaymentsPeriod").item(0))) {
				nodeList = document.getElementsByTagName("CurrentRecurringPaymentsPeriod");
				xmlString = convertToXML(nodeList.item(0));
				this.CurrentRecurringPaymentsPeriod =  new BillingPeriodDetailsType(xmlString);
			}
		}
		if(document.getElementsByTagName("RecurringPaymentsSummary").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("RecurringPaymentsSummary").item(0))) {
				nodeList = document.getElementsByTagName("RecurringPaymentsSummary");
				xmlString = convertToXML(nodeList.item(0));
				this.RecurringPaymentsSummary =  new RecurringPaymentsSummaryType(xmlString);
			}
		}
		if(document.getElementsByTagName("CreditCard").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("CreditCard").item(0))) {
				nodeList = document.getElementsByTagName("CreditCard");
				xmlString = convertToXML(nodeList.item(0));
				this.CreditCard =  new CreditCardDetailsType(xmlString);
			}
		}
		if(document.getElementsByTagName("TrialRecurringPaymentsPeriod").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TrialRecurringPaymentsPeriod").item(0))) {
				nodeList = document.getElementsByTagName("TrialRecurringPaymentsPeriod");
				xmlString = convertToXML(nodeList.item(0));
				this.TrialRecurringPaymentsPeriod =  new BillingPeriodDetailsType(xmlString);
			}
		}
		if(document.getElementsByTagName("RegularRecurringPaymentsPeriod").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("RegularRecurringPaymentsPeriod").item(0))) {
				nodeList = document.getElementsByTagName("RegularRecurringPaymentsPeriod");
				xmlString = convertToXML(nodeList.item(0));
				this.RegularRecurringPaymentsPeriod =  new BillingPeriodDetailsType(xmlString);
			}
		}
		if(document.getElementsByTagName("TrialAmountPaid").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TrialAmountPaid").item(0))) {
				nodeList = document.getElementsByTagName("TrialAmountPaid");
				xmlString = convertToXML(nodeList.item(0));
				this.TrialAmountPaid =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("RegularAmountPaid").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("RegularAmountPaid").item(0))) {
				nodeList = document.getElementsByTagName("RegularAmountPaid");
				xmlString = convertToXML(nodeList.item(0));
				this.RegularAmountPaid =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("AggregateAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("AggregateAmount").item(0))) {
				nodeList = document.getElementsByTagName("AggregateAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.AggregateAmount =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("AggregateOptionalAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("AggregateOptionalAmount").item(0))) {
				nodeList = document.getElementsByTagName("AggregateOptionalAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.AggregateOptionalAmount =  new BasicAmountType(xmlString);
			}
		}
		if (document.getElementsByTagName("FinalPaymentDueDate").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("FinalPaymentDueDate").item(0))) {
				this.FinalPaymentDueDate = (String)document.getElementsByTagName("FinalPaymentDueDate").item(0).getTextContent();
			}
		}
	
	}
 
}