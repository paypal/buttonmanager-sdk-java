package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.PaymentCategoryType;
import urn.ebay.apis.eBLBaseComponents.ShippingServiceCodeType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsItemType;
import urn.ebay.apis.eBLBaseComponents.AllowedPaymentMethodType;
import urn.ebay.apis.EnhancedDataTypes.EnhancedPaymentDataType;
import urn.ebay.apis.eBLBaseComponents.SellerDetailsType;
import urn.ebay.apis.eBLBaseComponents.PaymentActionCodeType;
import urn.ebay.apis.eBLBaseComponents.OfferDetailsType;
import urn.ebay.apis.eBLBaseComponents.RecurringFlagType;
import urn.ebay.apis.eBLBaseComponents.PaymentReasonType;
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
 * PaymentDetailsType Information about a payment. Used by DCC
 * and Express Checkout. 
 */
public class PaymentDetailsType{


	/**
	 * Total of order, including shipping, handling, and tax. You
	 * must set the currencyID attribute to one of the
	 * three-character currency codes for any of the supported
	 * PayPal currencies. Limitations: Must not exceed $10,000 USD
	 * in any currency. No currency symbol. Decimal separator must
	 * be a period (.), and the thousands separator must be a comma
	 * (,). 	 
	 */ 
	private BasicAmountType OrderTotal;

	/**
	 * Sum of cost of all items in this order. You must set the
	 * currencyID attribute to one of the three-character currency
	 * codes for any of the supported PayPal currencies. Optional
	 * separator must be a comma (,).	 
	 */ 
	private BasicAmountType ItemTotal;

	/**
	 * Total shipping costs for this order. You must set the
	 * currencyID attribute to one of the three-character currency
	 * codes for any of the supported PayPal currencies. Optional
	 * Limitations: Must not exceed $10,000 USD in any currency. No
	 * currency symbol. Decimal separator must be a period (.), and
	 * the thousands separator must be a comma (,).	 
	 */ 
	private BasicAmountType ShippingTotal;

	/**
	 * Total handling costs for this order. You must set the
	 * currencyID attribute to one of the three-character currency
	 * codes for any of the supported PayPal currencies. Optional
	 * Limitations: Must not exceed $10,000 USD in any currency. No
	 * currency symbol. Decimal separator must be a period (.), and
	 * the thousands separator must be a comma (,).	 
	 */ 
	private BasicAmountType HandlingTotal;

	/**
	 * Sum of tax for all items in this order. You must set the
	 * currencyID attribute to one of the three-character currency
	 * codes for any of the supported PayPal currencies. Optional
	 * Limitations: Must not exceed $10,000 USD in any currency. No
	 * currency symbol. Decimal separator must be a period (.), and
	 * the thousands separator must be a comma (,).	 
	 */ 
	private BasicAmountType TaxTotal;

	/**
	 * Description of items the customer is purchasing. Optional
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters	 
	 */ 
	private String OrderDescription;

	/**
	 * A free-form field for your own use. Optional Character
	 * length and limitations: 256 single-byte alphanumeric
	 * characters	 
	 */ 
	private String Custom;

	/**
	 * Your own invoice or tracking number. Optional Character
	 * length and limitations: 127 single-byte alphanumeric
	 * characters	 
	 */ 
	private String InvoiceID;

	/**
	 * An identification code for use by third-party applications
	 * to identify transactions. Optional Character length and
	 * limitations: 32 single-byte alphanumeric characters	 
	 */ 
	private String ButtonSource;

	/**
	 * Your URL for receiving Instant Payment Notification (IPN)
	 * about this transaction. Optional If you do not specify
	 * NotifyURL in the request, the notification URL from your
	 * Merchant Profile is used, if one exists. Character length
	 * and limitations: 2,048 single-byte alphanumeric characters	 
	 */ 
	private String NotifyURL;

	/**
	 * Address the order will be shipped to. Optional If you
	 * include the ShipToAddress element, the AddressType elements
	 * are required: Name Street1 CityName CountryCode Do not set
	 * set the CountryName element. 	 
	 */ 
	private AddressType ShipToAddress;

	/**
	 * 	 
	 */ 
	private AddressType FulfillmentAddress;

	/**
	 * 	 
	 */ 
	private PaymentCategoryType PaymentCategoryType;

	/**
	 * 	 
	 */ 
	private ShippingServiceCodeType ShippingMethod;

	/**
	 * Date and time (in GMT in the format yyyy-MM-ddTHH:mm:ssZ) at
	 * which address was changed by the user. 	 
	 */ 
	private String ProfileAddressChangeDate;

	/**
	 * Information about the individual purchased items	 
	 */ 
	private List<PaymentDetailsItemType> PaymentDetailsItem = new ArrayList<PaymentDetailsItemType>();

	/**
	 * Total shipping insurance costs for this order. Optional 	 
	 */ 
	private BasicAmountType InsuranceTotal;

	/**
	 * Shipping discount for this order, specified as a negative
	 * number. Optional 	 
	 */ 
	private BasicAmountType ShippingDiscount;

	/**
	 * Information about the Insurance options. 	 
	 */ 
	private String InsuranceOptionOffered;

	/**
	 * Allowed payment methods for this transaction. 	 
	 */ 
	private AllowedPaymentMethodType AllowedPaymentMethod;

	/**
	 * Enhanced Data section to accept channel specific data.
	 * Optional Refer to EnhancedPaymentDataType for details. 	 
	 */ 
	private EnhancedPaymentDataType EnhancedPaymentData;

	/**
	 * Details about the seller. Optional 	 
	 */ 
	private SellerDetailsType SellerDetails;

	/**
	 * Note to recipient/seller. Optional Character length and
	 * limitations: 127 single-byte alphanumeric characters. 	 
	 */ 
	private String NoteText;

	/**
	 * PayPal Transaction Id, returned once DoExpressCheckout is
	 * completed. 	 
	 */ 
	private String TransactionId;

	/**
	 * How you want to obtain payment. This payment action input
	 * will be used for split payments Authorization indicates that
	 * this payment is a basic authorization subject to settlement
	 * with PayPal Authorization and Capture. Order indicates that
	 * this payment is is an order authorization subject to
	 * settlement with PayPal Authorization and Capture. Sale
	 * indicates that this is a final sale for which you are
	 * requesting payment. IMPORTANT: You cannot set PaymentAction
	 * to Sale on SetExpressCheckoutRequest and then change
	 * PaymentAction to Authorization on the final Express Checkout
	 * API, DoExpressCheckoutPaymentRequest. Character length and
	 * limit: Up to 13 single-byte alphabetic characters 	 
	 */ 
	private PaymentActionCodeType PaymentAction;

	/**
	 * Unique identifier and mandatory for the particular payment
	 * request in case of multiple payment 	 
	 */ 
	private String PaymentRequestID;

	/**
	 * URL on Merchant site pertaining to this invoice. Optional 	 
	 */ 
	private String OrderURL;

	/**
	 * Soft Descriptor supported for Sale and Auth in DEC only. For
	 * Order this will be ignored. 	 
	 */ 
	private String SoftDescriptor;

	/**
	 * BranchLevel is used to identify chain payment. If
	 * BranchLevel is 0 or 1, this payment is where money moves to.
	 * If BranchLevel greater than 1, this payment contains the
	 * actual seller info. Optional 	 
	 */ 
	private Integer BranchLevel;

	/**
	 * Soft Descriptor supported for Sale and Auth in DEC only. For
	 * Order this will be ignored. 	 
	 */ 
	private OfferDetailsType OfferDetails;

	/**
	 * Flag to indicate the recurring transaction 	 
	 */ 
	private RecurringFlagType Recurring;

	/**
	 * Indicates the purpose of this payment like Refund 	 
	 */ 
	private PaymentReasonType PaymentReason;

	

	/**
	 * Default Constructor
	 */
	public PaymentDetailsType (){
	}	

	/**
	 * Getter for OrderTotal
	 */
	 public BasicAmountType getOrderTotal() {
	 	return OrderTotal;
	 }
	 
	/**
	 * Setter for OrderTotal
	 */
	 public void setOrderTotal(BasicAmountType OrderTotal) {
	 	this.OrderTotal = OrderTotal;
	 }
	 
	/**
	 * Getter for ItemTotal
	 */
	 public BasicAmountType getItemTotal() {
	 	return ItemTotal;
	 }
	 
	/**
	 * Setter for ItemTotal
	 */
	 public void setItemTotal(BasicAmountType ItemTotal) {
	 	this.ItemTotal = ItemTotal;
	 }
	 
	/**
	 * Getter for ShippingTotal
	 */
	 public BasicAmountType getShippingTotal() {
	 	return ShippingTotal;
	 }
	 
	/**
	 * Setter for ShippingTotal
	 */
	 public void setShippingTotal(BasicAmountType ShippingTotal) {
	 	this.ShippingTotal = ShippingTotal;
	 }
	 
	/**
	 * Getter for HandlingTotal
	 */
	 public BasicAmountType getHandlingTotal() {
	 	return HandlingTotal;
	 }
	 
	/**
	 * Setter for HandlingTotal
	 */
	 public void setHandlingTotal(BasicAmountType HandlingTotal) {
	 	this.HandlingTotal = HandlingTotal;
	 }
	 
	/**
	 * Getter for TaxTotal
	 */
	 public BasicAmountType getTaxTotal() {
	 	return TaxTotal;
	 }
	 
	/**
	 * Setter for TaxTotal
	 */
	 public void setTaxTotal(BasicAmountType TaxTotal) {
	 	this.TaxTotal = TaxTotal;
	 }
	 
	/**
	 * Getter for OrderDescription
	 */
	 public String getOrderDescription() {
	 	return OrderDescription;
	 }
	 
	/**
	 * Setter for OrderDescription
	 */
	 public void setOrderDescription(String OrderDescription) {
	 	this.OrderDescription = OrderDescription;
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
	 * Getter for ButtonSource
	 */
	 public String getButtonSource() {
	 	return ButtonSource;
	 }
	 
	/**
	 * Setter for ButtonSource
	 */
	 public void setButtonSource(String ButtonSource) {
	 	this.ButtonSource = ButtonSource;
	 }
	 
	/**
	 * Getter for NotifyURL
	 */
	 public String getNotifyURL() {
	 	return NotifyURL;
	 }
	 
	/**
	 * Setter for NotifyURL
	 */
	 public void setNotifyURL(String NotifyURL) {
	 	this.NotifyURL = NotifyURL;
	 }
	 
	/**
	 * Getter for ShipToAddress
	 */
	 public AddressType getShipToAddress() {
	 	return ShipToAddress;
	 }
	 
	/**
	 * Setter for ShipToAddress
	 */
	 public void setShipToAddress(AddressType ShipToAddress) {
	 	this.ShipToAddress = ShipToAddress;
	 }
	 
	/**
	 * Getter for FulfillmentAddress
	 */
	 public AddressType getFulfillmentAddress() {
	 	return FulfillmentAddress;
	 }
	 
	/**
	 * Setter for FulfillmentAddress
	 */
	 public void setFulfillmentAddress(AddressType FulfillmentAddress) {
	 	this.FulfillmentAddress = FulfillmentAddress;
	 }
	 
	/**
	 * Getter for PaymentCategoryType
	 */
	 public PaymentCategoryType getPaymentCategoryType() {
	 	return PaymentCategoryType;
	 }
	 
	/**
	 * Setter for PaymentCategoryType
	 */
	 public void setPaymentCategoryType(PaymentCategoryType PaymentCategoryType) {
	 	this.PaymentCategoryType = PaymentCategoryType;
	 }
	 
	/**
	 * Getter for ShippingMethod
	 */
	 public ShippingServiceCodeType getShippingMethod() {
	 	return ShippingMethod;
	 }
	 
	/**
	 * Setter for ShippingMethod
	 */
	 public void setShippingMethod(ShippingServiceCodeType ShippingMethod) {
	 	this.ShippingMethod = ShippingMethod;
	 }
	 
	/**
	 * Getter for ProfileAddressChangeDate
	 */
	 public String getProfileAddressChangeDate() {
	 	return ProfileAddressChangeDate;
	 }
	 
	/**
	 * Setter for ProfileAddressChangeDate
	 */
	 public void setProfileAddressChangeDate(String ProfileAddressChangeDate) {
	 	this.ProfileAddressChangeDate = ProfileAddressChangeDate;
	 }
	 
	/**
	 * Getter for PaymentDetailsItem
	 */
	 public List<PaymentDetailsItemType> getPaymentDetailsItem() {
	 	return PaymentDetailsItem;
	 }
	 
	/**
	 * Setter for PaymentDetailsItem
	 */
	 public void setPaymentDetailsItem(List<PaymentDetailsItemType> PaymentDetailsItem) {
	 	this.PaymentDetailsItem = PaymentDetailsItem;
	 }
	 
	/**
	 * Getter for InsuranceTotal
	 */
	 public BasicAmountType getInsuranceTotal() {
	 	return InsuranceTotal;
	 }
	 
	/**
	 * Setter for InsuranceTotal
	 */
	 public void setInsuranceTotal(BasicAmountType InsuranceTotal) {
	 	this.InsuranceTotal = InsuranceTotal;
	 }
	 
	/**
	 * Getter for ShippingDiscount
	 */
	 public BasicAmountType getShippingDiscount() {
	 	return ShippingDiscount;
	 }
	 
	/**
	 * Setter for ShippingDiscount
	 */
	 public void setShippingDiscount(BasicAmountType ShippingDiscount) {
	 	this.ShippingDiscount = ShippingDiscount;
	 }
	 
	/**
	 * Getter for InsuranceOptionOffered
	 */
	 public String getInsuranceOptionOffered() {
	 	return InsuranceOptionOffered;
	 }
	 
	/**
	 * Setter for InsuranceOptionOffered
	 */
	 public void setInsuranceOptionOffered(String InsuranceOptionOffered) {
	 	this.InsuranceOptionOffered = InsuranceOptionOffered;
	 }
	 
	/**
	 * Getter for AllowedPaymentMethod
	 */
	 public AllowedPaymentMethodType getAllowedPaymentMethod() {
	 	return AllowedPaymentMethod;
	 }
	 
	/**
	 * Setter for AllowedPaymentMethod
	 */
	 public void setAllowedPaymentMethod(AllowedPaymentMethodType AllowedPaymentMethod) {
	 	this.AllowedPaymentMethod = AllowedPaymentMethod;
	 }
	 
	/**
	 * Getter for EnhancedPaymentData
	 */
	 public EnhancedPaymentDataType getEnhancedPaymentData() {
	 	return EnhancedPaymentData;
	 }
	 
	/**
	 * Setter for EnhancedPaymentData
	 */
	 public void setEnhancedPaymentData(EnhancedPaymentDataType EnhancedPaymentData) {
	 	this.EnhancedPaymentData = EnhancedPaymentData;
	 }
	 
	/**
	 * Getter for SellerDetails
	 */
	 public SellerDetailsType getSellerDetails() {
	 	return SellerDetails;
	 }
	 
	/**
	 * Setter for SellerDetails
	 */
	 public void setSellerDetails(SellerDetailsType SellerDetails) {
	 	this.SellerDetails = SellerDetails;
	 }
	 
	/**
	 * Getter for NoteText
	 */
	 public String getNoteText() {
	 	return NoteText;
	 }
	 
	/**
	 * Setter for NoteText
	 */
	 public void setNoteText(String NoteText) {
	 	this.NoteText = NoteText;
	 }
	 
	/**
	 * Getter for TransactionId
	 */
	 public String getTransactionId() {
	 	return TransactionId;
	 }
	 
	/**
	 * Setter for TransactionId
	 */
	 public void setTransactionId(String TransactionId) {
	 	this.TransactionId = TransactionId;
	 }
	 
	/**
	 * Getter for PaymentAction
	 */
	 public PaymentActionCodeType getPaymentAction() {
	 	return PaymentAction;
	 }
	 
	/**
	 * Setter for PaymentAction
	 */
	 public void setPaymentAction(PaymentActionCodeType PaymentAction) {
	 	this.PaymentAction = PaymentAction;
	 }
	 
	/**
	 * Getter for PaymentRequestID
	 */
	 public String getPaymentRequestID() {
	 	return PaymentRequestID;
	 }
	 
	/**
	 * Setter for PaymentRequestID
	 */
	 public void setPaymentRequestID(String PaymentRequestID) {
	 	this.PaymentRequestID = PaymentRequestID;
	 }
	 
	/**
	 * Getter for OrderURL
	 */
	 public String getOrderURL() {
	 	return OrderURL;
	 }
	 
	/**
	 * Setter for OrderURL
	 */
	 public void setOrderURL(String OrderURL) {
	 	this.OrderURL = OrderURL;
	 }
	 
	/**
	 * Getter for SoftDescriptor
	 */
	 public String getSoftDescriptor() {
	 	return SoftDescriptor;
	 }
	 
	/**
	 * Setter for SoftDescriptor
	 */
	 public void setSoftDescriptor(String SoftDescriptor) {
	 	this.SoftDescriptor = SoftDescriptor;
	 }
	 
	/**
	 * Getter for BranchLevel
	 */
	 public Integer getBranchLevel() {
	 	return BranchLevel;
	 }
	 
	/**
	 * Setter for BranchLevel
	 */
	 public void setBranchLevel(Integer BranchLevel) {
	 	this.BranchLevel = BranchLevel;
	 }
	 
	/**
	 * Getter for OfferDetails
	 */
	 public OfferDetailsType getOfferDetails() {
	 	return OfferDetails;
	 }
	 
	/**
	 * Setter for OfferDetails
	 */
	 public void setOfferDetails(OfferDetailsType OfferDetails) {
	 	this.OfferDetails = OfferDetails;
	 }
	 
	/**
	 * Getter for Recurring
	 */
	 public RecurringFlagType getRecurring() {
	 	return Recurring;
	 }
	 
	/**
	 * Setter for Recurring
	 */
	 public void setRecurring(RecurringFlagType Recurring) {
	 	this.Recurring = Recurring;
	 }
	 
	/**
	 * Getter for PaymentReason
	 */
	 public PaymentReasonType getPaymentReason() {
	 	return PaymentReason;
	 }
	 
	/**
	 * Setter for PaymentReason
	 */
	 public void setPaymentReason(PaymentReasonType PaymentReason) {
	 	this.PaymentReason = PaymentReason;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(OrderTotal != null) {
			sb.append("<ebl:OrderTotal");
			sb.append(OrderTotal.toXMLString());
			sb.append("</ebl:OrderTotal>");
		}
		if(ItemTotal != null) {
			sb.append("<ebl:ItemTotal");
			sb.append(ItemTotal.toXMLString());
			sb.append("</ebl:ItemTotal>");
		}
		if(ShippingTotal != null) {
			sb.append("<ebl:ShippingTotal");
			sb.append(ShippingTotal.toXMLString());
			sb.append("</ebl:ShippingTotal>");
		}
		if(HandlingTotal != null) {
			sb.append("<ebl:HandlingTotal");
			sb.append(HandlingTotal.toXMLString());
			sb.append("</ebl:HandlingTotal>");
		}
		if(TaxTotal != null) {
			sb.append("<ebl:TaxTotal");
			sb.append(TaxTotal.toXMLString());
			sb.append("</ebl:TaxTotal>");
		}
		if(OrderDescription != null) {
			sb.append("<ebl:OrderDescription>").append(SDKUtil.escapeInvalidXmlCharsRegex(OrderDescription));
			sb.append("</ebl:OrderDescription>");
		}
		if(Custom != null) {
			sb.append("<ebl:Custom>").append(SDKUtil.escapeInvalidXmlCharsRegex(Custom));
			sb.append("</ebl:Custom>");
		}
		if(InvoiceID != null) {
			sb.append("<ebl:InvoiceID>").append(SDKUtil.escapeInvalidXmlCharsRegex(InvoiceID));
			sb.append("</ebl:InvoiceID>");
		}
		if(ButtonSource != null) {
			sb.append("<ebl:ButtonSource>").append(SDKUtil.escapeInvalidXmlCharsRegex(ButtonSource));
			sb.append("</ebl:ButtonSource>");
		}
		if(NotifyURL != null) {
			sb.append("<ebl:NotifyURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(NotifyURL));
			sb.append("</ebl:NotifyURL>");
		}
		if(ShipToAddress != null) {
			sb.append("<ebl:ShipToAddress>");
			sb.append(ShipToAddress.toXMLString());
			sb.append("</ebl:ShipToAddress>");
		}
		if(FulfillmentAddress != null) {
			sb.append("<ebl:FulfillmentAddress>");
			sb.append(FulfillmentAddress.toXMLString());
			sb.append("</ebl:FulfillmentAddress>");
		}
		if(PaymentCategoryType != null) {
			sb.append("<ebl:PaymentCategoryType>").append(SDKUtil.escapeInvalidXmlCharsRegex(PaymentCategoryType.getValue()));
			sb.append("</ebl:PaymentCategoryType>");
		}
		if(ShippingMethod != null) {
			sb.append("<ebl:ShippingMethod>").append(SDKUtil.escapeInvalidXmlCharsRegex(ShippingMethod.getValue()));
			sb.append("</ebl:ShippingMethod>");
		}
		if(ProfileAddressChangeDate != null) {
			sb.append("<ebl:ProfileAddressChangeDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(ProfileAddressChangeDate));
			sb.append("</ebl:ProfileAddressChangeDate>");
		}
		if(PaymentDetailsItem != null) {
			for(int i=0; i < PaymentDetailsItem.size(); i++) {
				sb.append("<ebl:PaymentDetailsItem>");
				sb.append(PaymentDetailsItem.get(i).toXMLString());
				sb.append("</ebl:PaymentDetailsItem>");
			}
		}
		if(InsuranceTotal != null) {
			sb.append("<ebl:InsuranceTotal");
			sb.append(InsuranceTotal.toXMLString());
			sb.append("</ebl:InsuranceTotal>");
		}
		if(ShippingDiscount != null) {
			sb.append("<ebl:ShippingDiscount");
			sb.append(ShippingDiscount.toXMLString());
			sb.append("</ebl:ShippingDiscount>");
		}
		if(InsuranceOptionOffered != null) {
			sb.append("<ebl:InsuranceOptionOffered>").append(SDKUtil.escapeInvalidXmlCharsRegex(InsuranceOptionOffered));
			sb.append("</ebl:InsuranceOptionOffered>");
		}
		if(AllowedPaymentMethod != null) {
			sb.append("<ebl:AllowedPaymentMethod>").append(SDKUtil.escapeInvalidXmlCharsRegex(AllowedPaymentMethod.getValue()));
			sb.append("</ebl:AllowedPaymentMethod>");
		}
		if(EnhancedPaymentData != null) {
			sb.append("<ebl:EnhancedPaymentData>");
			sb.append(EnhancedPaymentData.toXMLString());
			sb.append("</ebl:EnhancedPaymentData>");
		}
		if(SellerDetails != null) {
			sb.append("<ebl:SellerDetails>");
			sb.append(SellerDetails.toXMLString());
			sb.append("</ebl:SellerDetails>");
		}
		if(NoteText != null) {
			sb.append("<ebl:NoteText>").append(SDKUtil.escapeInvalidXmlCharsRegex(NoteText));
			sb.append("</ebl:NoteText>");
		}
		if(TransactionId != null) {
			sb.append("<ebl:TransactionId>").append(SDKUtil.escapeInvalidXmlCharsRegex(TransactionId));
			sb.append("</ebl:TransactionId>");
		}
		if(PaymentAction != null) {
			sb.append("<ebl:PaymentAction>").append(SDKUtil.escapeInvalidXmlCharsRegex(PaymentAction.getValue()));
			sb.append("</ebl:PaymentAction>");
		}
		if(PaymentRequestID != null) {
			sb.append("<ebl:PaymentRequestID>").append(SDKUtil.escapeInvalidXmlCharsRegex(PaymentRequestID));
			sb.append("</ebl:PaymentRequestID>");
		}
		if(OrderURL != null) {
			sb.append("<ebl:OrderURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(OrderURL));
			sb.append("</ebl:OrderURL>");
		}
		if(SoftDescriptor != null) {
			sb.append("<ebl:SoftDescriptor>").append(SDKUtil.escapeInvalidXmlCharsRegex(SoftDescriptor));
			sb.append("</ebl:SoftDescriptor>");
		}
		if(BranchLevel != null) {
			sb.append("<ebl:BranchLevel>").append(SDKUtil.escapeInvalidXmlCharsRegex(BranchLevel));
			sb.append("</ebl:BranchLevel>");
		}
		if(OfferDetails != null) {
			sb.append("<ebl:OfferDetails>");
			sb.append(OfferDetails.toXMLString());
			sb.append("</ebl:OfferDetails>");
		}
		if(Recurring != null) {
			sb.append("<ebl:Recurring>").append(SDKUtil.escapeInvalidXmlCharsRegex(Recurring.getValue()));
			sb.append("</ebl:Recurring>");
		}
		if(PaymentReason != null) {
			sb.append("<ebl:PaymentReason>").append(SDKUtil.escapeInvalidXmlCharsRegex(PaymentReason.getValue()));
			sb.append("</ebl:PaymentReason>");
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
	
	public PaymentDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("OrderTotal", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OrderTotal =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("ItemTotal", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ItemTotal =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("ShippingTotal", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ShippingTotal =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("HandlingTotal", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.HandlingTotal =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("TaxTotal", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TaxTotal =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("OrderDescription", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OrderDescription = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Custom", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Custom = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InvoiceID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.InvoiceID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ButtonSource", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ButtonSource = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("NotifyURL", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.NotifyURL = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ShipToAddress", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ShipToAddress =  new AddressType(childNode);
		}
		childNode = (Node) xpath.evaluate("FulfillmentAddress", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.FulfillmentAddress =  new AddressType(childNode);
		}
		childNode = (Node) xpath.evaluate("PaymentCategoryType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PaymentCategoryType = PaymentCategoryType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ShippingMethod", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ShippingMethod = ShippingServiceCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ProfileAddressChangeDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ProfileAddressChangeDate = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("PaymentDetailsItem", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.PaymentDetailsItem.add(new PaymentDetailsItemType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("InsuranceTotal", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.InsuranceTotal =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("ShippingDiscount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ShippingDiscount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("InsuranceOptionOffered", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.InsuranceOptionOffered = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AllowedPaymentMethod", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AllowedPaymentMethod = AllowedPaymentMethodType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("EnhancedPaymentData", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.EnhancedPaymentData =  new EnhancedPaymentDataType(childNode);
		}
		childNode = (Node) xpath.evaluate("SellerDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SellerDetails =  new SellerDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("NoteText", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.NoteText = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TransactionId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TransactionId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PaymentAction", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PaymentAction = PaymentActionCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PaymentRequestID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PaymentRequestID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OrderURL", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OrderURL = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SoftDescriptor", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SoftDescriptor = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BranchLevel", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.BranchLevel = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("OfferDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OfferDetails =  new OfferDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("Recurring", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Recurring = RecurringFlagType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PaymentReason", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PaymentReason = PaymentReasonType.fromValue(childNode.getTextContent());
		}
	}
 
}