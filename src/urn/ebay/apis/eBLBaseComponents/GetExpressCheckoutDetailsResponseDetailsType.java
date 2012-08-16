package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsType;
import urn.ebay.apis.eBLBaseComponents.UserSelectedOptionType;
import urn.ebay.apis.eBLBaseComponents.IncentiveDetailsType;
import urn.ebay.apis.eBLBaseComponents.PaymentRequestInfoType;
import urn.ebay.apis.eBLBaseComponents.ExternalRememberMeStatusDetailsType;
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
 * The timestamped token value that was returned by
 * SetExpressCheckoutResponse and passed on
 * GetExpressCheckoutDetailsRequest. Character length and
 * limitations: 20 single-byte characters 
 */
public class GetExpressCheckoutDetailsResponseDetailsType{


	/**
	 * The timestamped token value that was returned by
	 * SetExpressCheckoutResponse and passed on
	 * GetExpressCheckoutDetailsRequest. Character length and
	 * limitations: 20 single-byte characters	 
	 */ 
	private String Token;

	/**
	 * Information about the payer	 
	 */ 
	private PayerInfoType PayerInfo;

	/**
	 * A free-form field for your own use, as set by you in the
	 * Custom element of SetExpressCheckoutRequest. Character
	 * length and limitations: 256 single-byte alphanumeric
	 * characters	 
	 */ 
	private String Custom;

	/**
	 * Your own invoice or tracking number, as set by you in the
	 * InvoiceID element of SetExpressCheckoutRequest. Character
	 * length and limitations: 127 single-byte alphanumeric
	 * characters	 
	 */ 
	private String InvoiceID;

	/**
	 * Payer's contact telephone number. PayPal returns a contact
	 * telephone number only if your Merchant account profile
	 * settings require that the buyer enter one.	 
	 */ 
	private String ContactPhone;

	/**
	 * 	 
	 */ 
	private Boolean BillingAgreementAcceptedStatus;

	/**
	 * 	 
	 */ 
	private String RedirectRequired;

	/**
	 * Customer's billing address. Optional If you have credit card
	 * mapped in your account then billing address of the credit
	 * card is returned otherwise your primary address is returned
	 * , PayPal returns this address in
	 * GetExpressCheckoutDetailsResponse.	 
	 */ 
	private AddressType BillingAddress;

	/**
	 * Text note entered by the buyer in PayPal flow. 	 
	 */ 
	private String Note;

	/**
	 * Returns the status of the EC checkout session. Values
	 * include 'PaymentActionNotInitiated', 'PaymentActionFailed',
	 * 'PaymentActionInProgress', 'PaymentCompleted'. 	 
	 */ 
	private String CheckoutStatus;

	/**
	 * PayPal may offer a discount or gift certificate to the
	 * buyer, which will be represented by a negativeamount. If the
	 * buyer has a negative balance, PayPal will add that amount to
	 * the current charges, which will be represented as a positive
	 * amount. 	 
	 */ 
	private BasicAmountType PayPalAdjustment;

	/**
	 * Information about the individual purchased items. 	 
	 */ 
	private List<PaymentDetailsType> PaymentDetails = new ArrayList<PaymentDetailsType>();

	/**
	 * Information about the user selected options. 	 
	 */ 
	private UserSelectedOptionType UserSelectedOptions;

	/**
	 * Information about the incentives that were applied from Ebay
	 * RYP page and PayPal RYP page. 	 
	 */ 
	private List<IncentiveDetailsType> IncentiveDetails = new ArrayList<IncentiveDetailsType>();

	/**
	 * Information about the Gift message. 	 
	 */ 
	private String GiftMessage;

	/**
	 * Information about the Gift receipt enable. 	 
	 */ 
	private String GiftReceiptEnable;

	/**
	 * Information about the Gift Wrap name. 	 
	 */ 
	private String GiftWrapName;

	/**
	 * Information about the Gift Wrap amount. 	 
	 */ 
	private BasicAmountType GiftWrapAmount;

	/**
	 * Information about the Buyer marketing email. 	 
	 */ 
	private String BuyerMarketingEmail;

	/**
	 * Information about the survey question. 	 
	 */ 
	private String SurveyQuestion;

	/**
	 * Information about the survey choice selected by the user. 	 
	 */ 
	private List<String> SurveyChoiceSelected = new ArrayList<String>();

	/**
	 * Contains payment request information about each bucket in
	 * the cart. 	 
	 */ 
	private List<PaymentRequestInfoType> PaymentRequestInfo = new ArrayList<PaymentRequestInfoType>();

	/**
	 * Response information resulting from opt-in operation or
	 * current login bypass status. 	 
	 */ 
	private ExternalRememberMeStatusDetailsType ExternalRememberMeStatusDetails;

	

	/**
	 * Default Constructor
	 */
	public GetExpressCheckoutDetailsResponseDetailsType (){
	}	

	/**
	 * Getter for Token
	 */
	 public String getToken() {
	 	return Token;
	 }
	 
	/**
	 * Setter for Token
	 */
	 public void setToken(String Token) {
	 	this.Token = Token;
	 }
	 
	/**
	 * Getter for PayerInfo
	 */
	 public PayerInfoType getPayerInfo() {
	 	return PayerInfo;
	 }
	 
	/**
	 * Setter for PayerInfo
	 */
	 public void setPayerInfo(PayerInfoType PayerInfo) {
	 	this.PayerInfo = PayerInfo;
	 }
	 
	/**
	 * Getter for Custom
	 */
	 public String getCustom() {
	 	return Custom;
	 }
	 
	/**
	 * Setter for Custom
	 */
	 public void setCustom(String Custom) {
	 	this.Custom = Custom;
	 }
	 
	/**
	 * Getter for InvoiceID
	 */
	 public String getInvoiceID() {
	 	return InvoiceID;
	 }
	 
	/**
	 * Setter for InvoiceID
	 */
	 public void setInvoiceID(String InvoiceID) {
	 	this.InvoiceID = InvoiceID;
	 }
	 
	/**
	 * Getter for ContactPhone
	 */
	 public String getContactPhone() {
	 	return ContactPhone;
	 }
	 
	/**
	 * Setter for ContactPhone
	 */
	 public void setContactPhone(String ContactPhone) {
	 	this.ContactPhone = ContactPhone;
	 }
	 
	/**
	 * Getter for BillingAgreementAcceptedStatus
	 */
	 public Boolean getBillingAgreementAcceptedStatus() {
	 	return BillingAgreementAcceptedStatus;
	 }
	 
	/**
	 * Setter for BillingAgreementAcceptedStatus
	 */
	 public void setBillingAgreementAcceptedStatus(Boolean BillingAgreementAcceptedStatus) {
	 	this.BillingAgreementAcceptedStatus = BillingAgreementAcceptedStatus;
	 }
	 
	/**
	 * Getter for RedirectRequired
	 */
	 public String getRedirectRequired() {
	 	return RedirectRequired;
	 }
	 
	/**
	 * Setter for RedirectRequired
	 */
	 public void setRedirectRequired(String RedirectRequired) {
	 	this.RedirectRequired = RedirectRequired;
	 }
	 
	/**
	 * Getter for BillingAddress
	 */
	 public AddressType getBillingAddress() {
	 	return BillingAddress;
	 }
	 
	/**
	 * Setter for BillingAddress
	 */
	 public void setBillingAddress(AddressType BillingAddress) {
	 	this.BillingAddress = BillingAddress;
	 }
	 
	/**
	 * Getter for Note
	 */
	 public String getNote() {
	 	return Note;
	 }
	 
	/**
	 * Setter for Note
	 */
	 public void setNote(String Note) {
	 	this.Note = Note;
	 }
	 
	/**
	 * Getter for CheckoutStatus
	 */
	 public String getCheckoutStatus() {
	 	return CheckoutStatus;
	 }
	 
	/**
	 * Setter for CheckoutStatus
	 */
	 public void setCheckoutStatus(String CheckoutStatus) {
	 	this.CheckoutStatus = CheckoutStatus;
	 }
	 
	/**
	 * Getter for PayPalAdjustment
	 */
	 public BasicAmountType getPayPalAdjustment() {
	 	return PayPalAdjustment;
	 }
	 
	/**
	 * Setter for PayPalAdjustment
	 */
	 public void setPayPalAdjustment(BasicAmountType PayPalAdjustment) {
	 	this.PayPalAdjustment = PayPalAdjustment;
	 }
	 
	/**
	 * Getter for PaymentDetails
	 */
	 public List<PaymentDetailsType> getPaymentDetails() {
	 	return PaymentDetails;
	 }
	 
	/**
	 * Setter for PaymentDetails
	 */
	 public void setPaymentDetails(List<PaymentDetailsType> PaymentDetails) {
	 	this.PaymentDetails = PaymentDetails;
	 }
	 
	/**
	 * Getter for UserSelectedOptions
	 */
	 public UserSelectedOptionType getUserSelectedOptions() {
	 	return UserSelectedOptions;
	 }
	 
	/**
	 * Setter for UserSelectedOptions
	 */
	 public void setUserSelectedOptions(UserSelectedOptionType UserSelectedOptions) {
	 	this.UserSelectedOptions = UserSelectedOptions;
	 }
	 
	/**
	 * Getter for IncentiveDetails
	 */
	 public List<IncentiveDetailsType> getIncentiveDetails() {
	 	return IncentiveDetails;
	 }
	 
	/**
	 * Setter for IncentiveDetails
	 */
	 public void setIncentiveDetails(List<IncentiveDetailsType> IncentiveDetails) {
	 	this.IncentiveDetails = IncentiveDetails;
	 }
	 
	/**
	 * Getter for GiftMessage
	 */
	 public String getGiftMessage() {
	 	return GiftMessage;
	 }
	 
	/**
	 * Setter for GiftMessage
	 */
	 public void setGiftMessage(String GiftMessage) {
	 	this.GiftMessage = GiftMessage;
	 }
	 
	/**
	 * Getter for GiftReceiptEnable
	 */
	 public String getGiftReceiptEnable() {
	 	return GiftReceiptEnable;
	 }
	 
	/**
	 * Setter for GiftReceiptEnable
	 */
	 public void setGiftReceiptEnable(String GiftReceiptEnable) {
	 	this.GiftReceiptEnable = GiftReceiptEnable;
	 }
	 
	/**
	 * Getter for GiftWrapName
	 */
	 public String getGiftWrapName() {
	 	return GiftWrapName;
	 }
	 
	/**
	 * Setter for GiftWrapName
	 */
	 public void setGiftWrapName(String GiftWrapName) {
	 	this.GiftWrapName = GiftWrapName;
	 }
	 
	/**
	 * Getter for GiftWrapAmount
	 */
	 public BasicAmountType getGiftWrapAmount() {
	 	return GiftWrapAmount;
	 }
	 
	/**
	 * Setter for GiftWrapAmount
	 */
	 public void setGiftWrapAmount(BasicAmountType GiftWrapAmount) {
	 	this.GiftWrapAmount = GiftWrapAmount;
	 }
	 
	/**
	 * Getter for BuyerMarketingEmail
	 */
	 public String getBuyerMarketingEmail() {
	 	return BuyerMarketingEmail;
	 }
	 
	/**
	 * Setter for BuyerMarketingEmail
	 */
	 public void setBuyerMarketingEmail(String BuyerMarketingEmail) {
	 	this.BuyerMarketingEmail = BuyerMarketingEmail;
	 }
	 
	/**
	 * Getter for SurveyQuestion
	 */
	 public String getSurveyQuestion() {
	 	return SurveyQuestion;
	 }
	 
	/**
	 * Setter for SurveyQuestion
	 */
	 public void setSurveyQuestion(String SurveyQuestion) {
	 	this.SurveyQuestion = SurveyQuestion;
	 }
	 
	/**
	 * Getter for SurveyChoiceSelected
	 */
	 public List<String> getSurveyChoiceSelected() {
	 	return SurveyChoiceSelected;
	 }
	 
	/**
	 * Setter for SurveyChoiceSelected
	 */
	 public void setSurveyChoiceSelected(List<String> SurveyChoiceSelected) {
	 	this.SurveyChoiceSelected = SurveyChoiceSelected;
	 }
	 
	/**
	 * Getter for PaymentRequestInfo
	 */
	 public List<PaymentRequestInfoType> getPaymentRequestInfo() {
	 	return PaymentRequestInfo;
	 }
	 
	/**
	 * Setter for PaymentRequestInfo
	 */
	 public void setPaymentRequestInfo(List<PaymentRequestInfoType> PaymentRequestInfo) {
	 	this.PaymentRequestInfo = PaymentRequestInfo;
	 }
	 
	/**
	 * Getter for ExternalRememberMeStatusDetails
	 */
	 public ExternalRememberMeStatusDetailsType getExternalRememberMeStatusDetails() {
	 	return ExternalRememberMeStatusDetails;
	 }
	 
	/**
	 * Setter for ExternalRememberMeStatusDetails
	 */
	 public void setExternalRememberMeStatusDetails(ExternalRememberMeStatusDetailsType ExternalRememberMeStatusDetails) {
	 	this.ExternalRememberMeStatusDetails = ExternalRememberMeStatusDetails;
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
	
	public GetExpressCheckoutDetailsResponseDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("Token").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Token").item(0))) {
				this.Token = (String)document.getElementsByTagName("Token").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("PayerInfo").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PayerInfo").item(0))) {
				nodeList = document.getElementsByTagName("PayerInfo");
				xmlString = convertToXML(nodeList.item(0));
				this.PayerInfo =  new PayerInfoType(xmlString);
			}
		}
		if (document.getElementsByTagName("Custom").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Custom").item(0))) {
				this.Custom = (String)document.getElementsByTagName("Custom").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("InvoiceID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("InvoiceID").item(0))) {
				this.InvoiceID = (String)document.getElementsByTagName("InvoiceID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ContactPhone").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ContactPhone").item(0))) {
				this.ContactPhone = (String)document.getElementsByTagName("ContactPhone").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("BillingAgreementAcceptedStatus").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BillingAgreementAcceptedStatus").item(0))) {
				this.BillingAgreementAcceptedStatus = Boolean.valueOf(document.getElementsByTagName("BillingAgreementAcceptedStatus").item(0).getTextContent());
			}
		}
	
		if (document.getElementsByTagName("RedirectRequired").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("RedirectRequired").item(0))) {
				this.RedirectRequired = (String)document.getElementsByTagName("RedirectRequired").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("BillingAddress").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BillingAddress").item(0))) {
				nodeList = document.getElementsByTagName("BillingAddress");
				xmlString = convertToXML(nodeList.item(0));
				this.BillingAddress =  new AddressType(xmlString);
			}
		}
		if (document.getElementsByTagName("Note").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Note").item(0))) {
				this.Note = (String)document.getElementsByTagName("Note").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("CheckoutStatus").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("CheckoutStatus").item(0))) {
				this.CheckoutStatus = (String)document.getElementsByTagName("CheckoutStatus").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("PayPalAdjustment").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PayPalAdjustment").item(0))) {
				nodeList = document.getElementsByTagName("PayPalAdjustment");
				xmlString = convertToXML(nodeList.item(0));
				this.PayPalAdjustment =  new BasicAmountType(xmlString);
			}
		}
		if (document.getElementsByTagName("PaymentDetails").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentDetails").item(0))) {
				nodeList = document.getElementsByTagName("PaymentDetails");
				for(int i=0; i < nodeList.getLength(); i++) {
					xmlString = convertToXML(nodeList.item(i));
					this.PaymentDetails.add(new PaymentDetailsType(xmlString));
				}
			}
		}
		if(document.getElementsByTagName("UserSelectedOptions").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("UserSelectedOptions").item(0))) {
				nodeList = document.getElementsByTagName("UserSelectedOptions");
				xmlString = convertToXML(nodeList.item(0));
				this.UserSelectedOptions =  new UserSelectedOptionType(xmlString);
			}
		}
		if (document.getElementsByTagName("IncentiveDetails").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("IncentiveDetails").item(0))) {
				nodeList = document.getElementsByTagName("IncentiveDetails");
				for(int i=0; i < nodeList.getLength(); i++) {
					xmlString = convertToXML(nodeList.item(i));
					this.IncentiveDetails.add(new IncentiveDetailsType(xmlString));
				}
			}
		}
		if (document.getElementsByTagName("GiftMessage").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("GiftMessage").item(0))) {
				this.GiftMessage = (String)document.getElementsByTagName("GiftMessage").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("GiftReceiptEnable").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("GiftReceiptEnable").item(0))) {
				this.GiftReceiptEnable = (String)document.getElementsByTagName("GiftReceiptEnable").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("GiftWrapName").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("GiftWrapName").item(0))) {
				this.GiftWrapName = (String)document.getElementsByTagName("GiftWrapName").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("GiftWrapAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("GiftWrapAmount").item(0))) {
				nodeList = document.getElementsByTagName("GiftWrapAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.GiftWrapAmount =  new BasicAmountType(xmlString);
			}
		}
		if (document.getElementsByTagName("BuyerMarketingEmail").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BuyerMarketingEmail").item(0))) {
				this.BuyerMarketingEmail = (String)document.getElementsByTagName("BuyerMarketingEmail").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("SurveyQuestion").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SurveyQuestion").item(0))) {
				this.SurveyQuestion = (String)document.getElementsByTagName("SurveyQuestion").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("SurveyChoiceSelected").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SurveyChoiceSelected").item(0))) {
				nodeList = document.getElementsByTagName("SurveyChoiceSelected");
				for(int i=0; i < nodeList.getLength(); i++) {
					String value = nodeList.item(i).getTextContent();
					this.SurveyChoiceSelected.add(value);
					
				}
			}
		}
		if (document.getElementsByTagName("PaymentRequestInfo").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentRequestInfo").item(0))) {
				nodeList = document.getElementsByTagName("PaymentRequestInfo");
				for(int i=0; i < nodeList.getLength(); i++) {
					xmlString = convertToXML(nodeList.item(i));
					this.PaymentRequestInfo.add(new PaymentRequestInfoType(xmlString));
				}
			}
		}
		if(document.getElementsByTagName("ExternalRememberMeStatusDetails").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ExternalRememberMeStatusDetails").item(0))) {
				nodeList = document.getElementsByTagName("ExternalRememberMeStatusDetails");
				xmlString = convertToXML(nodeList.item(0));
				this.ExternalRememberMeStatusDetails =  new ExternalRememberMeStatusDetailsType(xmlString);
			}
		}
	}
 
}