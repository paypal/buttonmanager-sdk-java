
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AutoBillType;
import urn.ebay.apis.eBLBaseComponents.BillingPeriodDetailsType;
import urn.ebay.apis.eBLBaseComponents.CreditCardDetailsType;
import urn.ebay.apis.eBLBaseComponents.RecurringPaymentsProfileDetailsType;
import urn.ebay.apis.eBLBaseComponents.RecurringPaymentsProfileStatusType;
import urn.ebay.apis.eBLBaseComponents.RecurringPaymentsSummaryType;


/**
 * Recurring Billing Profile ID
 */
public class GetRecurringPaymentsProfileDetailsResponseDetailsType {

	/**
	 * Recurring Billing Profile ID
	 *
	 * @Required
	 */
	private String ProfileID;
	public String getProfileID() {
		return ProfileID;
	}
	public void setProfileID(String value) {
		this.ProfileID = value;
	}

	/**
	 *
	 * @Required
	 */
	private RecurringPaymentsProfileStatusType ProfileStatus;
	public RecurringPaymentsProfileStatusType getProfileStatus() {
		return ProfileStatus;
	}
	public void setProfileStatus(RecurringPaymentsProfileStatusType value) {
		this.ProfileStatus = value;
	}

	/**
	 *
	 * @Required
	 */
	private String Description;
	public String getDescription() {
		return Description;
	}
	public void setDescription(String value) {
		this.Description = value;
	}

	/**
	 *
	 * @Required
	 */
	private AutoBillType AutoBillOutstandingAmount;
	public AutoBillType getAutoBillOutstandingAmount() {
		return AutoBillOutstandingAmount;
	}
	public void setAutoBillOutstandingAmount(AutoBillType value) {
		this.AutoBillOutstandingAmount = value;
	}

	/**
	 *
	 * @Required
	 */
	private Integer MaxFailedPayments;
	public Integer getMaxFailedPayments() {
		return MaxFailedPayments;
	}
	public void setMaxFailedPayments(Integer value) {
		this.MaxFailedPayments = value;
	}

	/**
	 *
	 * @Required
	 */
	private RecurringPaymentsProfileDetailsType RecurringPaymentsProfileDetails;
	public RecurringPaymentsProfileDetailsType getRecurringPaymentsProfileDetails() {
		return RecurringPaymentsProfileDetails;
	}
	public void setRecurringPaymentsProfileDetails(RecurringPaymentsProfileDetailsType value) {
		this.RecurringPaymentsProfileDetails = value;
	}

	/**
	 */
	private BillingPeriodDetailsType CurrentRecurringPaymentsPeriod;
	public BillingPeriodDetailsType getCurrentRecurringPaymentsPeriod() {
		return CurrentRecurringPaymentsPeriod;
	}
	public void setCurrentRecurringPaymentsPeriod(BillingPeriodDetailsType value) {
		this.CurrentRecurringPaymentsPeriod = value;
	}

	/**
	 *
	 * @Required
	 */
	private RecurringPaymentsSummaryType RecurringPaymentsSummary;
	public RecurringPaymentsSummaryType getRecurringPaymentsSummary() {
		return RecurringPaymentsSummary;
	}
	public void setRecurringPaymentsSummary(RecurringPaymentsSummaryType value) {
		this.RecurringPaymentsSummary = value;
	}

	/**
	 */
	private CreditCardDetailsType CreditCard;
	public CreditCardDetailsType getCreditCard() {
		return CreditCard;
	}
	public void setCreditCard(CreditCardDetailsType value) {
		this.CreditCard = value;
	}

	/**
	 */
	private BillingPeriodDetailsType TrialRecurringPaymentsPeriod;
	public BillingPeriodDetailsType getTrialRecurringPaymentsPeriod() {
		return TrialRecurringPaymentsPeriod;
	}
	public void setTrialRecurringPaymentsPeriod(BillingPeriodDetailsType value) {
		this.TrialRecurringPaymentsPeriod = value;
	}

	/**
	 */
	private BillingPeriodDetailsType RegularRecurringPaymentsPeriod;
	public BillingPeriodDetailsType getRegularRecurringPaymentsPeriod() {
		return RegularRecurringPaymentsPeriod;
	}
	public void setRegularRecurringPaymentsPeriod(BillingPeriodDetailsType value) {
		this.RegularRecurringPaymentsPeriod = value;
	}

	/**
	 */
	private BasicAmountType TrialAmountPaid;
	public BasicAmountType getTrialAmountPaid() {
		return TrialAmountPaid;
	}
	public void setTrialAmountPaid(BasicAmountType value) {
		this.TrialAmountPaid = value;
	}

	/**
	 */
	private BasicAmountType RegularAmountPaid;
	public BasicAmountType getRegularAmountPaid() {
		return RegularAmountPaid;
	}
	public void setRegularAmountPaid(BasicAmountType value) {
		this.RegularAmountPaid = value;
	}

	/**
	 */
	private BasicAmountType AggregateAmount;
	public BasicAmountType getAggregateAmount() {
		return AggregateAmount;
	}
	public void setAggregateAmount(BasicAmountType value) {
		this.AggregateAmount = value;
	}

	/**
	 */
	private BasicAmountType AggregateOptionalAmount;
	public BasicAmountType getAggregateOptionalAmount() {
		return AggregateOptionalAmount;
	}
	public void setAggregateOptionalAmount(BasicAmountType value) {
		this.AggregateOptionalAmount = value;
	}

	/**
	 */
	private String FinalPaymentDueDate;
	public String getFinalPaymentDueDate() {
		return FinalPaymentDueDate;
	}
	public void setFinalPaymentDueDate(String value) {
		this.FinalPaymentDueDate = value;
	}


	public GetRecurringPaymentsProfileDetailsResponseDetailsType() {
	}
	 private  boolean isWhitespaceNode(Node n) {
		 if (n.getNodeType() == Node.TEXT_NODE) { 
				String val = n.getNodeValue();
				return val.trim().length() == 0; 
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
		 sb.append('<').append(name);
		 NamedNodeMap attrs = n.getAttributes();
		 if (attrs != null) { 
		  for (int i = 0; i < attrs.getLength(); i++) { 
			    Node attr = attrs.item(i);
			    sb.append(' ').append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
		  }
		 } 
		 String textContent = null; 
		 NodeList children = n.getChildNodes(); 
		 if (children.getLength() == 0) { 
		  if ((textContent = n.getTextContent()) != null && !"".equals(textContent)) {
		    sb.append(textContent).append("</").append(name).append('>'); 
		  } else { 
		    sb.append("/>"); 
		  } 
		 } else { 
		  sb.append('>'); 
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
		  sb.append("</").append(name).append('>');
		 }
		 return sb.toString();
	 } 
	 public GetRecurringPaymentsProfileDetailsResponseDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("ProfileID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ProfileID").item(0))){ 
		 this.ProfileID =(String)document.getElementsByTagName("ProfileID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ProfileStatus").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ProfileStatus").item(0))){ 
		 this.ProfileStatus = RecurringPaymentsProfileStatusType.fromValue(document.getElementsByTagName("ProfileStatus").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("Description").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Description").item(0))){ 
		 this.Description =(String)document.getElementsByTagName("Description").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("AutoBillOutstandingAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AutoBillOutstandingAmount").item(0))){ 
		 this.AutoBillOutstandingAmount = AutoBillType.fromValue(document.getElementsByTagName("AutoBillOutstandingAmount").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("MaxFailedPayments").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("MaxFailedPayments").item(0))){ 
		 this.MaxFailedPayments =Integer.valueOf(document.getElementsByTagName("MaxFailedPayments").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("RecurringPaymentsProfileDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("RecurringPaymentsProfileDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("RecurringPaymentsProfileDetails");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.RecurringPaymentsProfileDetails =  new RecurringPaymentsProfileDetailsType(xmlString);

}
	}
		 if(document.getElementsByTagName("CurrentRecurringPaymentsPeriod").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("CurrentRecurringPaymentsPeriod").item(0))){ 
		 nodeList = document.getElementsByTagName("CurrentRecurringPaymentsPeriod");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.CurrentRecurringPaymentsPeriod =  new BillingPeriodDetailsType(xmlString);

}
	}
		 if(document.getElementsByTagName("RecurringPaymentsSummary").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("RecurringPaymentsSummary").item(0))){ 
		 nodeList = document.getElementsByTagName("RecurringPaymentsSummary");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.RecurringPaymentsSummary =  new RecurringPaymentsSummaryType(xmlString);

}
	}
		 if(document.getElementsByTagName("CreditCard").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("CreditCard").item(0))){ 
		 nodeList = document.getElementsByTagName("CreditCard");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.CreditCard =  new CreditCardDetailsType(xmlString);

}
	}
		 if(document.getElementsByTagName("TrialRecurringPaymentsPeriod").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TrialRecurringPaymentsPeriod").item(0))){ 
		 nodeList = document.getElementsByTagName("TrialRecurringPaymentsPeriod");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.TrialRecurringPaymentsPeriod =  new BillingPeriodDetailsType(xmlString);

}
	}
		 if(document.getElementsByTagName("RegularRecurringPaymentsPeriod").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("RegularRecurringPaymentsPeriod").item(0))){ 
		 nodeList = document.getElementsByTagName("RegularRecurringPaymentsPeriod");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.RegularRecurringPaymentsPeriod =  new BillingPeriodDetailsType(xmlString);

}
	}
		 if(document.getElementsByTagName("TrialAmountPaid").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TrialAmountPaid").item(0))){ 
		 nodeList = document.getElementsByTagName("TrialAmountPaid");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.TrialAmountPaid =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("RegularAmountPaid").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("RegularAmountPaid").item(0))){ 
		 nodeList = document.getElementsByTagName("RegularAmountPaid");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.RegularAmountPaid =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("AggregateAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AggregateAmount").item(0))){ 
		 nodeList = document.getElementsByTagName("AggregateAmount");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.AggregateAmount =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("AggregateOptionalAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AggregateOptionalAmount").item(0))){ 
		 nodeList = document.getElementsByTagName("AggregateOptionalAmount");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.AggregateOptionalAmount =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("FinalPaymentDueDate").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("FinalPaymentDueDate").item(0))){ 
		 this.FinalPaymentDueDate =(String)document.getElementsByTagName("FinalPaymentDueDate").item(0).getTextContent();

}
	}
	}
}
