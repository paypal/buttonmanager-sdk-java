
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
import urn.ebay.apis.EnhancedDataTypes.EnhancedPaymentDataType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.AllowedPaymentMethodType;
import urn.ebay.apis.eBLBaseComponents.OfferDetailsType;
import urn.ebay.apis.eBLBaseComponents.PaymentActionCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsItemType;
import urn.ebay.apis.eBLBaseComponents.RecurringFlagType;
import urn.ebay.apis.eBLBaseComponents.SellerDetailsType;
import urn.ebay.apis.eBLBaseComponents.ShippingServiceCodeType;


/**
 * PaymentDetailsType 
 * Information about a payment.  Used by DCC and Express Checkout.
 */
public class PaymentDetailsType {

	/**
	 * Total of order, including shipping, handling, and tax. 
You must set the currencyID attribute to one of the three-character currency codes for any of the supported PayPal currencies.
	 * Limitations: Must not exceed $10,000 USD in any currency. No currency symbol. Decimal separator must be a period (.), and the thousands separator must be a comma (,). 	 */
	private BasicAmountType OrderTotal;
	public BasicAmountType getOrderTotal() {
		return OrderTotal;
	}
	public void setOrderTotal(BasicAmountType value) {
		this.OrderTotal = value;
	}

	/**
	 * Sum of cost of all items in this order. 
You must set the currencyID attribute to one of the three-character currency codes for any of the supported PayPal currencies.
	 * Optional
	 * separator must be a comma (,).
	 */
	private BasicAmountType ItemTotal;
	public BasicAmountType getItemTotal() {
		return ItemTotal;
	}
	public void setItemTotal(BasicAmountType value) {
		this.ItemTotal = value;
	}

	/**
	 * Total shipping costs for this order. 
You must set the currencyID attribute to one of the three-character currency codes for any of the supported PayPal currencies.
	 * Optional
	 * Limitations: Must not exceed $10,000 USD in any currency. No currency symbol. Decimal separator must be a period (.), and the thousands separator must be a comma (,).
	 */
	private BasicAmountType ShippingTotal;
	public BasicAmountType getShippingTotal() {
		return ShippingTotal;
	}
	public void setShippingTotal(BasicAmountType value) {
		this.ShippingTotal = value;
	}

	/**
	 * Total handling costs for this order. 
You must set the currencyID attribute to one of the three-character currency codes for any of the supported PayPal currencies.
	 * Optional
	 * Limitations: Must not exceed $10,000 USD in any currency. No currency symbol. Decimal separator must be a period (.), and the thousands separator must be a comma (,).
	 */
	private BasicAmountType HandlingTotal;
	public BasicAmountType getHandlingTotal() {
		return HandlingTotal;
	}
	public void setHandlingTotal(BasicAmountType value) {
		this.HandlingTotal = value;
	}

	/**
	 * Sum of tax for all items in this order. 
You must set the currencyID attribute to one of the three-character currency codes for any of the supported PayPal currencies.
	 * Optional
	 * Limitations: Must not exceed $10,000 USD in any currency. No currency symbol. Decimal separator must be a period (.), and the thousands separator must be a comma (,).
	 */
	private BasicAmountType TaxTotal;
	public BasicAmountType getTaxTotal() {
		return TaxTotal;
	}
	public void setTaxTotal(BasicAmountType value) {
		this.TaxTotal = value;
	}

	/**
	 * Description of items the customer is purchasing. 
	 * Optional
	 * Character length and limitations: 127 single-byte alphanumeric characters
	 */
	private String OrderDescription;
	public String getOrderDescription() {
		return OrderDescription;
	}
	public void setOrderDescription(String value) {
		this.OrderDescription = value;
	}

	/**
	 * A free-form field for your own use. 
	 * Optional
	 * Character length and limitations: 256 single-byte alphanumeric characters
	 */
	private String Custom;
	public String getCustom() {
		return Custom;
	}
	public void setCustom(String value) {
		this.Custom = value;
	}

	/**
	 * Your own invoice or tracking number. 
	 * Optional
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
	 * An identification code for use by third-party applications to identify transactions. 
	 * Optional
	 * Character length and limitations: 32 single-byte alphanumeric characters
	 */
	private String ButtonSource;
	public String getButtonSource() {
		return ButtonSource;
	}
	public void setButtonSource(String value) {
		this.ButtonSource = value;
	}

	/**
	 * Your URL for receiving Instant Payment Notification (IPN) about this transaction. 
	 * Optional
	 * If you do not specify NotifyURL in the request, the notification URL from your Merchant Profile is used, if one exists. 
	 * Character length and limitations: 2,048 single-byte alphanumeric characters
	 */
	private String NotifyURL;
	public String getNotifyURL() {
		return NotifyURL;
	}
	public void setNotifyURL(String value) {
		this.NotifyURL = value;
	}

	/**
	 * Address the order will be shipped to. 
	 * Optional
	 * If you include the ShipToAddress element, the AddressType elements are required: 
	 * Name
	 * Street1
	 * CityName
	 * CountryCode
	 * Do not set set the CountryName element.
	 */
	private AddressType ShipToAddress;
	public AddressType getShipToAddress() {
		return ShipToAddress;
	}
	public void setShipToAddress(AddressType value) {
		this.ShipToAddress = value;
	}

	/**
	 */
	private ShippingServiceCodeType ShippingMethod;
	public ShippingServiceCodeType getShippingMethod() {
		return ShippingMethod;
	}
	public void setShippingMethod(ShippingServiceCodeType value) {
		this.ShippingMethod = value;
	}

	/**
	 * Date and time (in GMT in the format yyyy-MM-ddTHH:mm:ssZ) at which address was changed by the user. 
	 */
	private String ProfileAddressChangeDate;
	public String getProfileAddressChangeDate() {
		return ProfileAddressChangeDate;
	}
	public void setProfileAddressChangeDate(String value) {
		this.ProfileAddressChangeDate = value;
	}

	/**
	 * Information about the individual purchased items	 */
	private List<PaymentDetailsItemType> PaymentDetailsItem = new ArrayList<PaymentDetailsItemType>();
	public List<PaymentDetailsItemType> getPaymentDetailsItem() {
		return PaymentDetailsItem;
	}
	public void setPaymentDetailsItem(List<PaymentDetailsItemType> value) {
		this.PaymentDetailsItem = value;
	}

	/**
	 * Total shipping insurance costs for this order.
	 * Optional
	 */
	private BasicAmountType InsuranceTotal;
	public BasicAmountType getInsuranceTotal() {
		return InsuranceTotal;
	}
	public void setInsuranceTotal(BasicAmountType value) {
		this.InsuranceTotal = value;
	}

	/**
	 * Shipping discount for this order, specified as a negative number.
	 * Optional
	 */
	private BasicAmountType ShippingDiscount;
	public BasicAmountType getShippingDiscount() {
		return ShippingDiscount;
	}
	public void setShippingDiscount(BasicAmountType value) {
		this.ShippingDiscount = value;
	}

	/**
	 * Information about the Insurance options.
	 */
	private String InsuranceOptionOffered;
	public String getInsuranceOptionOffered() {
		return InsuranceOptionOffered;
	}
	public void setInsuranceOptionOffered(String value) {
		this.InsuranceOptionOffered = value;
	}

	/**
	 * Allowed payment methods for this transaction.
	 */
	private AllowedPaymentMethodType AllowedPaymentMethod;
	public AllowedPaymentMethodType getAllowedPaymentMethod() {
		return AllowedPaymentMethod;
	}
	public void setAllowedPaymentMethod(AllowedPaymentMethodType value) {
		this.AllowedPaymentMethod = value;
	}

	/**
	 * Enhanced Data section to accept channel specific data.
	 * Optional
	 * Refer to EnhancedPaymentDataType for details.
	 */
	private EnhancedPaymentDataType EnhancedPaymentData;
	public EnhancedPaymentDataType getEnhancedPaymentData() {
		return EnhancedPaymentData;
	}
	public void setEnhancedPaymentData(EnhancedPaymentDataType value) {
		this.EnhancedPaymentData = value;
	}

	/**
	 * Details about the seller.
	 * Optional 
	 */
	private SellerDetailsType SellerDetails;
	public SellerDetailsType getSellerDetails() {
		return SellerDetails;
	}
	public void setSellerDetails(SellerDetailsType value) {
		this.SellerDetails = value;
	}

	/**
	 * Note to recipient/seller. 
	 * Optional 
	 * Character length and limitations: 127 single-byte alphanumeric characters.
	 */
	private String NoteText;
	public String getNoteText() {
		return NoteText;
	}
	public void setNoteText(String value) {
		this.NoteText = value;
	}

	/**
	 * PayPal Transaction Id, returned once DoExpressCheckout is completed. 
	 */
	private String TransactionId;
	public String getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(String value) {
		this.TransactionId = value;
	}

	/**
	 * How you want to obtain payment.
	 * This payment action input will be used for split payments
	 * Authorization indicates that this payment is a basic authorization subject to settlement with PayPal Authorization and Capture.
	 * Order indicates that this payment is is an order authorization subject to settlement with PayPal Authorization and Capture.
	 * Sale indicates that this is a final sale for which you are requesting payment.
	 * IMPORTANT: You cannot set PaymentAction to Sale on SetExpressCheckoutRequest and then change PaymentAction to Authorization on the final Express Checkout API, DoExpressCheckoutPaymentRequest.
	 * Character length and limit: Up to 13 single-byte alphabetic characters
	 */
	private PaymentActionCodeType PaymentAction;
	public PaymentActionCodeType getPaymentAction() {
		return PaymentAction;
	}
	public void setPaymentAction(PaymentActionCodeType value) {
		this.PaymentAction = value;
	}

	/**
	 * Unique identifier and mandatory for the particular payment request in case of multiple payment
	 */
	private String PaymentRequestID;
	public String getPaymentRequestID() {
		return PaymentRequestID;
	}
	public void setPaymentRequestID(String value) {
		this.PaymentRequestID = value;
	}

	/**
	 * URL on Merchant site pertaining to this invoice. 
	 * Optional
	 */
	private String OrderURL;
	public String getOrderURL() {
		return OrderURL;
	}
	public void setOrderURL(String value) {
		this.OrderURL = value;
	}

	/**
	 * Soft Descriptor supported for Sale and Auth in DEC only. For Order this will be ignored.
	 */
	private String SoftDescriptor;
	public String getSoftDescriptor() {
		return SoftDescriptor;
	}
	public void setSoftDescriptor(String value) {
		this.SoftDescriptor = value;
	}

	/**
	 * BranchLevel is used to identify chain payment.
	 * If BranchLevel is 0 or 1, this payment is where money moves to.
	 * If BranchLevel greater than 1, this payment contains the actual seller info.	
	 * Optional
	 */
	private Integer BranchLevel;
	public Integer getBranchLevel() {
		return BranchLevel;
	}
	public void setBranchLevel(Integer value) {
		this.BranchLevel = value;
	}

	/**
	 * Soft Descriptor supported for Sale and Auth in DEC only. For Order this will be ignored.
	 */
	private OfferDetailsType OfferDetails;
	public OfferDetailsType getOfferDetails() {
		return OfferDetails;
	}
	public void setOfferDetails(OfferDetailsType value) {
		this.OfferDetails = value;
	}

	/**
	 * Flag to indicate the recurring transaction
	 */
	private RecurringFlagType Recurring;
	public RecurringFlagType getRecurring() {
		return Recurring;
	}
	public void setRecurring(RecurringFlagType value) {
		this.Recurring = value;
	}


	public PaymentDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( OrderTotal != null ) {
			sb.append("<ebl:OrderTotal ");
			sb.append(OrderTotal.toXMLString());
			sb.append("</ebl:OrderTotal>");
		}
		if( ItemTotal != null ) {
			sb.append("<ebl:ItemTotal ");
			sb.append(ItemTotal.toXMLString());
			sb.append("</ebl:ItemTotal>");
		}
		if( ShippingTotal != null ) {
			sb.append("<ebl:ShippingTotal ");
			sb.append(ShippingTotal.toXMLString());
			sb.append("</ebl:ShippingTotal>");
		}
		if( HandlingTotal != null ) {
			sb.append("<ebl:HandlingTotal ");
			sb.append(HandlingTotal.toXMLString());
			sb.append("</ebl:HandlingTotal>");
		}
		if( TaxTotal != null ) {
			sb.append("<ebl:TaxTotal ");
			sb.append(TaxTotal.toXMLString());
			sb.append("</ebl:TaxTotal>");
		}
		if( OrderDescription != null ) {
			sb.append("<ebl:OrderDescription>").append(OrderDescription);
			sb.append("</ebl:OrderDescription>");
		}
		if( Custom != null ) {
			sb.append("<ebl:Custom>").append(Custom);
			sb.append("</ebl:Custom>");
		}
		if( InvoiceID != null ) {
			sb.append("<ebl:InvoiceID>").append(InvoiceID);
			sb.append("</ebl:InvoiceID>");
		}
		if( ButtonSource != null ) {
			sb.append("<ebl:ButtonSource>").append(ButtonSource);
			sb.append("</ebl:ButtonSource>");
		}
		if( NotifyURL != null ) {
			sb.append("<ebl:NotifyURL>").append(NotifyURL);
			sb.append("</ebl:NotifyURL>");
		}
		if( ShipToAddress != null ) {
			sb.append("<ebl:ShipToAddress>");
			sb.append(ShipToAddress.toXMLString());
			sb.append("</ebl:ShipToAddress>");
		}
		if( ShippingMethod != null ) {
			sb.append("<ebl:ShippingMethod>").append( ShippingMethod.getValue());
			sb.append("</ebl:ShippingMethod>");
		}
		if( ProfileAddressChangeDate != null ) {
			sb.append("<ebl:ProfileAddressChangeDate>").append(ProfileAddressChangeDate);
			sb.append("</ebl:ProfileAddressChangeDate>");
		}
		if( PaymentDetailsItem != null ) {
			for(int i=0; i<PaymentDetailsItem.size(); i++) {
				sb.append("<ebl:PaymentDetailsItem>");
				sb.append(PaymentDetailsItem.get(i).toXMLString());
				sb.append("</ebl:PaymentDetailsItem>");
			}
		}
		if( InsuranceTotal != null ) {
			sb.append("<ebl:InsuranceTotal ");
			sb.append(InsuranceTotal.toXMLString());
			sb.append("</ebl:InsuranceTotal>");
		}
		if( ShippingDiscount != null ) {
			sb.append("<ebl:ShippingDiscount ");
			sb.append(ShippingDiscount.toXMLString());
			sb.append("</ebl:ShippingDiscount>");
		}
		if( InsuranceOptionOffered != null ) {
			sb.append("<ebl:InsuranceOptionOffered>").append(InsuranceOptionOffered);
			sb.append("</ebl:InsuranceOptionOffered>");
		}
		if( AllowedPaymentMethod != null ) {
			sb.append("<ebl:AllowedPaymentMethod>").append( AllowedPaymentMethod.getValue());
			sb.append("</ebl:AllowedPaymentMethod>");
		}
		if( EnhancedPaymentData != null ) {
			sb.append("<ebl:EnhancedPaymentData>");
			sb.append(EnhancedPaymentData.toXMLString());
			sb.append("</ebl:EnhancedPaymentData>");
		}
		if( SellerDetails != null ) {
			sb.append("<ebl:SellerDetails>");
			sb.append(SellerDetails.toXMLString());
			sb.append("</ebl:SellerDetails>");
		}
		if( NoteText != null ) {
			sb.append("<ebl:NoteText>").append(NoteText);
			sb.append("</ebl:NoteText>");
		}
		if( TransactionId != null ) {
			sb.append("<ebl:TransactionId>").append(TransactionId);
			sb.append("</ebl:TransactionId>");
		}
		if( PaymentAction != null ) {
			sb.append("<ebl:PaymentAction>").append( PaymentAction.getValue());
			sb.append("</ebl:PaymentAction>");
		}
		if( PaymentRequestID != null ) {
			sb.append("<ebl:PaymentRequestID>").append(PaymentRequestID);
			sb.append("</ebl:PaymentRequestID>");
		}
		if( OrderURL != null ) {
			sb.append("<ebl:OrderURL>").append(OrderURL);
			sb.append("</ebl:OrderURL>");
		}
		if( SoftDescriptor != null ) {
			sb.append("<ebl:SoftDescriptor>").append(SoftDescriptor);
			sb.append("</ebl:SoftDescriptor>");
		}
		if( BranchLevel != null ) {
			sb.append("<ebl:BranchLevel>").append(BranchLevel);
			sb.append("</ebl:BranchLevel>");
		}
		if( OfferDetails != null ) {
			sb.append("<ebl:OfferDetails>");
			sb.append(OfferDetails.toXMLString());
			sb.append("</ebl:OfferDetails>");
		}
		if( Recurring != null ) {
			sb.append("<ebl:Recurring>").append( Recurring.getValue());
			sb.append("</ebl:Recurring>");
		}
		return sb.toString();
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
	 public PaymentDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("OrderTotal").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OrderTotal").item(0))){ 
		 nodeList = document.getElementsByTagName("OrderTotal");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.OrderTotal =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("ItemTotal").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ItemTotal").item(0))){ 
		 nodeList = document.getElementsByTagName("ItemTotal");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.ItemTotal =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("ShippingTotal").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ShippingTotal").item(0))){ 
		 nodeList = document.getElementsByTagName("ShippingTotal");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.ShippingTotal =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("HandlingTotal").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("HandlingTotal").item(0))){ 
		 nodeList = document.getElementsByTagName("HandlingTotal");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.HandlingTotal =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("TaxTotal").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TaxTotal").item(0))){ 
		 nodeList = document.getElementsByTagName("TaxTotal");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.TaxTotal =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("OrderDescription").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OrderDescription").item(0))){ 
		 this.OrderDescription =(String)document.getElementsByTagName("OrderDescription").item(0).getTextContent();

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
		 if(document.getElementsByTagName("ButtonSource").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ButtonSource").item(0))){ 
		 this.ButtonSource =(String)document.getElementsByTagName("ButtonSource").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("NotifyURL").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("NotifyURL").item(0))){ 
		 this.NotifyURL =(String)document.getElementsByTagName("NotifyURL").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ShipToAddress").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ShipToAddress").item(0))){ 
		 nodeList = document.getElementsByTagName("ShipToAddress");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.ShipToAddress =  new AddressType(xmlString);

}
	}
		 if(document.getElementsByTagName("ShippingMethod").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ShippingMethod").item(0))){ 
		 this.ShippingMethod = ShippingServiceCodeType.fromValue(document.getElementsByTagName("ShippingMethod").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("ProfileAddressChangeDate").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ProfileAddressChangeDate").item(0))){ 
		 this.ProfileAddressChangeDate =(String)document.getElementsByTagName("ProfileAddressChangeDate").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PaymentDetailsItem").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentDetailsItem").item(0))){ 
		 nodeList = document.getElementsByTagName("PaymentDetailsItem");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 xmlString = convertToXML(nodeList.item(i)); 
				this.PaymentDetailsItem.add(new PaymentDetailsItemType(xmlString));
			}

}
	}
		 if(document.getElementsByTagName("InsuranceTotal").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("InsuranceTotal").item(0))){ 
		 nodeList = document.getElementsByTagName("InsuranceTotal");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.InsuranceTotal =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("ShippingDiscount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ShippingDiscount").item(0))){ 
		 nodeList = document.getElementsByTagName("ShippingDiscount");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.ShippingDiscount =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("InsuranceOptionOffered").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("InsuranceOptionOffered").item(0))){ 
		 this.InsuranceOptionOffered =(String)document.getElementsByTagName("InsuranceOptionOffered").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("AllowedPaymentMethod").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AllowedPaymentMethod").item(0))){ 
		 this.AllowedPaymentMethod = AllowedPaymentMethodType.fromValue(document.getElementsByTagName("AllowedPaymentMethod").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("EnhancedPaymentData").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("EnhancedPaymentData").item(0))){ 
		 nodeList = document.getElementsByTagName("EnhancedPaymentData");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.EnhancedPaymentData =  new EnhancedPaymentDataType(xmlString);

}
	}
		 if(document.getElementsByTagName("SellerDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("SellerDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("SellerDetails");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.SellerDetails =  new SellerDetailsType(xmlString);

}
	}
		 if(document.getElementsByTagName("NoteText").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("NoteText").item(0))){ 
		 this.NoteText =(String)document.getElementsByTagName("NoteText").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("TransactionId").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TransactionId").item(0))){ 
		 this.TransactionId =(String)document.getElementsByTagName("TransactionId").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PaymentAction").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentAction").item(0))){ 
		 this.PaymentAction = PaymentActionCodeType.fromValue(document.getElementsByTagName("PaymentAction").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("PaymentRequestID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentRequestID").item(0))){ 
		 this.PaymentRequestID =(String)document.getElementsByTagName("PaymentRequestID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("OrderURL").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OrderURL").item(0))){ 
		 this.OrderURL =(String)document.getElementsByTagName("OrderURL").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("SoftDescriptor").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("SoftDescriptor").item(0))){ 
		 this.SoftDescriptor =(String)document.getElementsByTagName("SoftDescriptor").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("BranchLevel").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BranchLevel").item(0))){ 
		 this.BranchLevel =Integer.valueOf(document.getElementsByTagName("BranchLevel").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("OfferDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OfferDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("OfferDetails");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.OfferDetails =  new OfferDetailsType(xmlString);

}
	}
		 if(document.getElementsByTagName("Recurring").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Recurring").item(0))){ 
		 this.Recurring = RecurringFlagType.fromValue(document.getElementsByTagName("Recurring").item(0).getTextContent());

}
	}
	}
}
