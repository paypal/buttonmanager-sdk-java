
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
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
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.ExternalRememberMeStatusDetailsType;
import urn.ebay.apis.eBLBaseComponents.IncentiveDetailsType;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsType;
import urn.ebay.apis.eBLBaseComponents.PaymentRequestInfoType;
import urn.ebay.apis.eBLBaseComponents.UserSelectedOptionType;


/**
 * The timestamped token value that was returned by SetExpressCheckoutResponse and passed on GetExpressCheckoutDetailsRequest. 
 * Character length and limitations: 20 single-byte characters
 */
public class GetExpressCheckoutDetailsResponseDetailsType {

	/**
	 * The timestamped token value that was returned by SetExpressCheckoutResponse and passed on GetExpressCheckoutDetailsRequest. 
	 * Character length and limitations: 20 single-byte characters	 */
	private String Token;
	public String getToken() {
		return Token;
	}
	public void setToken(String value) {
		this.Token = value;
	}

	/**
	 * Information about the payer	 */
	private PayerInfoType PayerInfo;
	public PayerInfoType getPayerInfo() {
		return PayerInfo;
	}
	public void setPayerInfo(PayerInfoType value) {
		this.PayerInfo = value;
	}

	/**
	 * A free-form field for your own use, as set by you in the Custom element of SetExpressCheckoutRequest. 
	 * Character length and limitations: 256 single-byte alphanumeric characters	 */
	private String Custom;
	public String getCustom() {
		return Custom;
	}
	public void setCustom(String value) {
		this.Custom = value;
	}

	/**
	 * Your own invoice or tracking number, as set by you in the InvoiceID element of SetExpressCheckoutRequest. 
	 * Character length and limitations: 127 single-byte alphanumeric characters
	 */
	private String InvoiceID;
	public String getInvoiceID() {
		return InvoiceID;
	}
	public void setInvoiceID(String value) {
		this.InvoiceID = value;
	}

	/**
	 * Payer's contact telephone number. PayPal returns a contact telephone number only if your Merchant account profile settings require that the buyer enter one.	 */
	private String ContactPhone;
	public String getContactPhone() {
		return ContactPhone;
	}
	public void setContactPhone(String value) {
		this.ContactPhone = value;
	}

	/**
	 */
	private Boolean BillingAgreementAcceptedStatus;
	public Boolean getBillingAgreementAcceptedStatus() {
		return BillingAgreementAcceptedStatus;
	}
	public void setBillingAgreementAcceptedStatus(Boolean value) {
		this.BillingAgreementAcceptedStatus = value;
	}

	/**
	 */
	private String RedirectRequired;
	public String getRedirectRequired() {
		return RedirectRequired;
	}
	public void setRedirectRequired(String value) {
		this.RedirectRequired = value;
	}

	/**
Customer's billing address.
	 * Optional
	 * If you have credit card mapped in your account then billing address of the credit card is returned otherwise your primary address is returned , PayPal returns this address in GetExpressCheckoutDetailsResponse.
	 */
	private AddressType BillingAddress;
	public AddressType getBillingAddress() {
		return BillingAddress;
	}
	public void setBillingAddress(AddressType value) {
		this.BillingAddress = value;
	}

	/**
	 * Text note entered by the buyer in PayPal flow.
	 */
	private String Note;
	public String getNote() {
		return Note;
	}
	public void setNote(String value) {
		this.Note = value;
	}

	/**
	 * Returns the status of the EC checkout session.
	 * Values include 'PaymentActionNotInitiated', 'PaymentActionFailed', 'PaymentActionInProgress', 'PaymentCompleted'.
	 */
	private String CheckoutStatus;
	public String getCheckoutStatus() {
		return CheckoutStatus;
	}
	public void setCheckoutStatus(String value) {
		this.CheckoutStatus = value;
	}

	/**
	 * PayPal may offer a discount or gift certificate to the buyer, which will be represented by a negativeamount. If the buyer has a negative balance, PayPal will add that amount to the current charges, which will be represented as a positive amount.
	 */
	private BasicAmountType PayPalAdjustment;
	public BasicAmountType getPayPalAdjustment() {
		return PayPalAdjustment;
	}
	public void setPayPalAdjustment(BasicAmountType value) {
		this.PayPalAdjustment = value;
	}

	/**
	 * Information about the individual purchased items.
	 */
	private List<PaymentDetailsType> PaymentDetails = new ArrayList<PaymentDetailsType>();
	public List<PaymentDetailsType> getPaymentDetails() {
		return PaymentDetails;
	}
	public void setPaymentDetails(List<PaymentDetailsType> value) {
		this.PaymentDetails = value;
	}

	/**
	 * Information about the user selected options.
	 */
	private UserSelectedOptionType UserSelectedOptions;
	public UserSelectedOptionType getUserSelectedOptions() {
		return UserSelectedOptions;
	}
	public void setUserSelectedOptions(UserSelectedOptionType value) {
		this.UserSelectedOptions = value;
	}

	/**
	 * Information about the incentives that were applied from Ebay RYP page and PayPal RYP page.
	 */
	private List<IncentiveDetailsType> IncentiveDetails = new ArrayList<IncentiveDetailsType>();
	public List<IncentiveDetailsType> getIncentiveDetails() {
		return IncentiveDetails;
	}
	public void setIncentiveDetails(List<IncentiveDetailsType> value) {
		this.IncentiveDetails = value;
	}

	/**
	 * Information about the Gift message.
	 */
	private String GiftMessage;
	public String getGiftMessage() {
		return GiftMessage;
	}
	public void setGiftMessage(String value) {
		this.GiftMessage = value;
	}

	/**
	 * Information about the Gift receipt enable.
	 */
	private String GiftReceiptEnable;
	public String getGiftReceiptEnable() {
		return GiftReceiptEnable;
	}
	public void setGiftReceiptEnable(String value) {
		this.GiftReceiptEnable = value;
	}

	/**
	 * Information about the Gift Wrap name.
	 */
	private String GiftWrapName;
	public String getGiftWrapName() {
		return GiftWrapName;
	}
	public void setGiftWrapName(String value) {
		this.GiftWrapName = value;
	}

	/**
	 * Information about the Gift Wrap amount.
	 */
	private BasicAmountType GiftWrapAmount;
	public BasicAmountType getGiftWrapAmount() {
		return GiftWrapAmount;
	}
	public void setGiftWrapAmount(BasicAmountType value) {
		this.GiftWrapAmount = value;
	}

	/**
	 * Information about the Buyer marketing email.
	 */
	private String BuyerMarketingEmail;
	public String getBuyerMarketingEmail() {
		return BuyerMarketingEmail;
	}
	public void setBuyerMarketingEmail(String value) {
		this.BuyerMarketingEmail = value;
	}

	/**
	 * Information about the survey question.
	 */
	private String SurveyQuestion;
	public String getSurveyQuestion() {
		return SurveyQuestion;
	}
	public void setSurveyQuestion(String value) {
		this.SurveyQuestion = value;
	}

	/**
	 * Information about the survey choice selected by the user.
	 */
	private List<String> SurveyChoiceSelected = new ArrayList<String>();
	public List<String> getSurveyChoiceSelected() {
		return SurveyChoiceSelected;
	}
	public void setSurveyChoiceSelected(List<String> value) {
		this.SurveyChoiceSelected = value;
	}

	/**
	 * Contains payment request information about each bucket in the cart.
	 */
	private List<PaymentRequestInfoType> PaymentRequestInfo = new ArrayList<PaymentRequestInfoType>();
	public List<PaymentRequestInfoType> getPaymentRequestInfo() {
		return PaymentRequestInfo;
	}
	public void setPaymentRequestInfo(List<PaymentRequestInfoType> value) {
		this.PaymentRequestInfo = value;
	}

	/**
	 * Response information resulting from opt-in operation or current login bypass status.
	 */
	private ExternalRememberMeStatusDetailsType ExternalRememberMeStatusDetails;
	public ExternalRememberMeStatusDetailsType getExternalRememberMeStatusDetails() {
		return ExternalRememberMeStatusDetails;
	}
	public void setExternalRememberMeStatusDetails(ExternalRememberMeStatusDetailsType value) {
		this.ExternalRememberMeStatusDetails = value;
	}


	public GetExpressCheckoutDetailsResponseDetailsType() {
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
	 public GetExpressCheckoutDetailsResponseDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("Token").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Token").item(0))){ 
		 this.Token =(String)document.getElementsByTagName("Token").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PayerInfo").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PayerInfo").item(0))){ 
		 nodeList = document.getElementsByTagName("PayerInfo");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.PayerInfo =  new PayerInfoType(xmlString);

}
	}
		 if(document.getElementsByTagName("Custom").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Custom").item(0))){ 
		 this.Custom =(String)document.getElementsByTagName("Custom").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("InvoiceID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("InvoiceID").item(0))){ 
		 this.InvoiceID =(String)document.getElementsByTagName("InvoiceID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ContactPhone").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ContactPhone").item(0))){ 
		 this.ContactPhone =(String)document.getElementsByTagName("ContactPhone").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("BillingAgreementAcceptedStatus").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BillingAgreementAcceptedStatus").item(0))){ 
		 this.BillingAgreementAcceptedStatus =Boolean.valueOf(document.getElementsByTagName("BillingAgreementAcceptedStatus").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("RedirectRequired").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("RedirectRequired").item(0))){ 
		 this.RedirectRequired =(String)document.getElementsByTagName("RedirectRequired").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("BillingAddress").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BillingAddress").item(0))){ 
		 nodeList = document.getElementsByTagName("BillingAddress");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.BillingAddress =  new AddressType(xmlString);

}
	}
		 if(document.getElementsByTagName("Note").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Note").item(0))){ 
		 this.Note =(String)document.getElementsByTagName("Note").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("CheckoutStatus").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("CheckoutStatus").item(0))){ 
		 this.CheckoutStatus =(String)document.getElementsByTagName("CheckoutStatus").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PayPalAdjustment").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PayPalAdjustment").item(0))){ 
		 nodeList = document.getElementsByTagName("PayPalAdjustment");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.PayPalAdjustment =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("PaymentDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("PaymentDetails");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 xmlString = convertToXML(nodeList.item(i)); 
				this.PaymentDetails.add(new PaymentDetailsType(xmlString));
			}

}
	}
		 if(document.getElementsByTagName("UserSelectedOptions").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("UserSelectedOptions").item(0))){ 
		 nodeList = document.getElementsByTagName("UserSelectedOptions");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.UserSelectedOptions =  new UserSelectedOptionType(xmlString);

}
	}
		 if(document.getElementsByTagName("IncentiveDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("IncentiveDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("IncentiveDetails");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 xmlString = convertToXML(nodeList.item(i)); 
				this.IncentiveDetails.add(new IncentiveDetailsType(xmlString));
			}

}
	}
		 if(document.getElementsByTagName("GiftMessage").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("GiftMessage").item(0))){ 
		 this.GiftMessage =(String)document.getElementsByTagName("GiftMessage").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("GiftReceiptEnable").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("GiftReceiptEnable").item(0))){ 
		 this.GiftReceiptEnable =(String)document.getElementsByTagName("GiftReceiptEnable").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("GiftWrapName").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("GiftWrapName").item(0))){ 
		 this.GiftWrapName =(String)document.getElementsByTagName("GiftWrapName").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("GiftWrapAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("GiftWrapAmount").item(0))){ 
		 nodeList = document.getElementsByTagName("GiftWrapAmount");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.GiftWrapAmount =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("BuyerMarketingEmail").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BuyerMarketingEmail").item(0))){ 
		 this.BuyerMarketingEmail =(String)document.getElementsByTagName("BuyerMarketingEmail").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("SurveyQuestion").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("SurveyQuestion").item(0))){ 
		 this.SurveyQuestion =(String)document.getElementsByTagName("SurveyQuestion").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("SurveyChoiceSelected").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("SurveyChoiceSelected").item(0))){ 
		 nodeList = document.getElementsByTagName("SurveyChoiceSelected");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 String value = nodeList.item(i).getTextContent(); 
			 this.SurveyChoiceSelected.add(value);
		}

}
	}
		 if(document.getElementsByTagName("PaymentRequestInfo").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentRequestInfo").item(0))){ 
		 nodeList = document.getElementsByTagName("PaymentRequestInfo");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 xmlString = convertToXML(nodeList.item(i)); 
				this.PaymentRequestInfo.add(new PaymentRequestInfoType(xmlString));
			}

}
	}
		 if(document.getElementsByTagName("ExternalRememberMeStatusDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ExternalRememberMeStatusDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("ExternalRememberMeStatusDetails");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.ExternalRememberMeStatusDetails =  new ExternalRememberMeStatusDetailsType(xmlString);

}
	}
	}
}
