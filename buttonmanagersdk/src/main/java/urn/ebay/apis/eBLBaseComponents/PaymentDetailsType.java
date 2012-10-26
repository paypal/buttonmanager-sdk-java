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

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Total of order, including shipping, handling, and tax. You
	 * must set the currencyID attribute to one of the
	 * three-character currency codes for any of the supported
	 * PayPal currencies. Limitations: Must not exceed $10,000 USD
	 * in any currency. No currency symbol. Decimal separator must
	 * be a period (.), and the thousands separator must be a comma
	 * (,). 	 
	 */ 
	private BasicAmountType orderTotal;

	/**
	 * Sum of cost of all items in this order. You must set the
	 * currencyID attribute to one of the three-character currency
	 * codes for any of the supported PayPal currencies. Optional
	 * separator must be a comma (,).	 
	 */ 
	private BasicAmountType itemTotal;

	/**
	 * Total shipping costs for this order. You must set the
	 * currencyID attribute to one of the three-character currency
	 * codes for any of the supported PayPal currencies. Optional
	 * Limitations: Must not exceed $10,000 USD in any currency. No
	 * currency symbol. Decimal separator must be a period (.), and
	 * the thousands separator must be a comma (,).	 
	 */ 
	private BasicAmountType shippingTotal;

	/**
	 * Total handling costs for this order. You must set the
	 * currencyID attribute to one of the three-character currency
	 * codes for any of the supported PayPal currencies. Optional
	 * Limitations: Must not exceed $10,000 USD in any currency. No
	 * currency symbol. Decimal separator must be a period (.), and
	 * the thousands separator must be a comma (,).	 
	 */ 
	private BasicAmountType handlingTotal;

	/**
	 * Sum of tax for all items in this order. You must set the
	 * currencyID attribute to one of the three-character currency
	 * codes for any of the supported PayPal currencies. Optional
	 * Limitations: Must not exceed $10,000 USD in any currency. No
	 * currency symbol. Decimal separator must be a period (.), and
	 * the thousands separator must be a comma (,).	 
	 */ 
	private BasicAmountType taxTotal;

	/**
	 * Description of items the customer is purchasing. Optional
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters	 
	 */ 
	private String orderDescription;

	/**
	 * A free-form field for your own use. Optional Character
	 * length and limitations: 256 single-byte alphanumeric
	 * characters	 
	 */ 
	private String custom;

	/**
	 * Your own invoice or tracking number. Optional Character
	 * length and limitations: 127 single-byte alphanumeric
	 * characters	 
	 */ 
	private String invoiceID;

	/**
	 * An identification code for use by third-party applications
	 * to identify transactions. Optional Character length and
	 * limitations: 32 single-byte alphanumeric characters	 
	 */ 
	private String buttonSource;

	/**
	 * Your URL for receiving Instant Payment Notification (IPN)
	 * about this transaction. Optional If you do not specify
	 * NotifyURL in the request, the notification URL from your
	 * Merchant Profile is used, if one exists. Character length
	 * and limitations: 2,048 single-byte alphanumeric characters	 
	 */ 
	private String notifyURL;

	/**
	 * Address the order will be shipped to. Optional If you
	 * include the ShipToAddress element, the AddressType elements
	 * are required: Name Street1 CityName CountryCode Do not set
	 * set the CountryName element. 	 
	 */ 
	private AddressType shipToAddress;

	/**
	 * Thirdparty Fulfillment Reference Number. Optional Character
	 * length and limitations: 32 alphanumeric characters. 	 
	 */ 
	private String fulfillmentReferenceNumber;

	/**
	 * 	 
	 */ 
	private AddressType fulfillmentAddress;

	/**
	 * 	 
	 */ 
	private PaymentCategoryType paymentCategoryType;

	/**
	 * 	 
	 */ 
	private ShippingServiceCodeType shippingMethod;

	/**
	 * Date and time (in GMT in the format yyyy-MM-ddTHH:mm:ssZ) at
	 * which address was changed by the user. 	 
	 */ 
	private String profileAddressChangeDate;

	/**
	 * Information about the individual purchased items	 
	 */ 
	private List<PaymentDetailsItemType> paymentDetailsItem = new ArrayList<PaymentDetailsItemType>();

	/**
	 * Total shipping insurance costs for this order. Optional 	 
	 */ 
	private BasicAmountType insuranceTotal;

	/**
	 * Shipping discount for this order, specified as a negative
	 * number. Optional 	 
	 */ 
	private BasicAmountType shippingDiscount;

	/**
	 * Information about the Insurance options. 	 
	 */ 
	private String insuranceOptionOffered;

	/**
	 * Allowed payment methods for this transaction. 	 
	 */ 
	private AllowedPaymentMethodType allowedPaymentMethod;

	/**
	 * Enhanced Data section to accept channel specific data.
	 * Optional Refer to EnhancedPaymentDataType for details. 	 
	 */ 
	private EnhancedPaymentDataType enhancedPaymentData;

	/**
	 * Details about the seller. Optional 	 
	 */ 
	private SellerDetailsType sellerDetails;

	/**
	 * Note to recipient/seller. Optional Character length and
	 * limitations: 127 single-byte alphanumeric characters. 	 
	 */ 
	private String noteText;

	/**
	 * PayPal Transaction Id, returned once DoExpressCheckout is
	 * completed. 	 
	 */ 
	private String transactionId;

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
	private PaymentActionCodeType paymentAction;

	/**
	 * Unique identifier and mandatory for the particular payment
	 * request in case of multiple payment 	 
	 */ 
	private String paymentRequestID;

	/**
	 * URL on Merchant site pertaining to this invoice. Optional 	 
	 */ 
	private String orderURL;

	/**
	 * Soft Descriptor supported for Sale and Auth in DEC only. For
	 * Order this will be ignored. 	 
	 */ 
	private String softDescriptor;

	/**
	 * BranchLevel is used to identify chain payment. If
	 * BranchLevel is 0 or 1, this payment is where money moves to.
	 * If BranchLevel greater than 1, this payment contains the
	 * actual seller info. Optional 	 
	 */ 
	private Integer branchLevel;

	/**
	 * Soft Descriptor supported for Sale and Auth in DEC only. For
	 * Order this will be ignored. 	 
	 */ 
	private OfferDetailsType offerDetails;

	/**
	 * Flag to indicate the recurring transaction 	 
	 */ 
	private RecurringFlagType recurring;

	/**
	 * Indicates the purpose of this payment like Refund 	 
	 */ 
	private PaymentReasonType paymentReason;

	

	/**
	 * Default Constructor
	 */
	public PaymentDetailsType (){
	}	

	/**
	 * Getter for orderTotal
	 */
	 public BasicAmountType getOrderTotal() {
	 	return orderTotal;
	 }
	 
	/**
	 * Setter for orderTotal
	 */
	 public void setOrderTotal(BasicAmountType orderTotal) {
	 	this.orderTotal = orderTotal;
	 }
	 
	/**
	 * Getter for itemTotal
	 */
	 public BasicAmountType getItemTotal() {
	 	return itemTotal;
	 }
	 
	/**
	 * Setter for itemTotal
	 */
	 public void setItemTotal(BasicAmountType itemTotal) {
	 	this.itemTotal = itemTotal;
	 }
	 
	/**
	 * Getter for shippingTotal
	 */
	 public BasicAmountType getShippingTotal() {
	 	return shippingTotal;
	 }
	 
	/**
	 * Setter for shippingTotal
	 */
	 public void setShippingTotal(BasicAmountType shippingTotal) {
	 	this.shippingTotal = shippingTotal;
	 }
	 
	/**
	 * Getter for handlingTotal
	 */
	 public BasicAmountType getHandlingTotal() {
	 	return handlingTotal;
	 }
	 
	/**
	 * Setter for handlingTotal
	 */
	 public void setHandlingTotal(BasicAmountType handlingTotal) {
	 	this.handlingTotal = handlingTotal;
	 }
	 
	/**
	 * Getter for taxTotal
	 */
	 public BasicAmountType getTaxTotal() {
	 	return taxTotal;
	 }
	 
	/**
	 * Setter for taxTotal
	 */
	 public void setTaxTotal(BasicAmountType taxTotal) {
	 	this.taxTotal = taxTotal;
	 }
	 
	/**
	 * Getter for orderDescription
	 */
	 public String getOrderDescription() {
	 	return orderDescription;
	 }
	 
	/**
	 * Setter for orderDescription
	 */
	 public void setOrderDescription(String orderDescription) {
	 	this.orderDescription = orderDescription;
	 }
	 
	/**
	 * Getter for custom
	 */
	 public String getCustom() {
	 	return custom;
	 }
	 
	/**
	 * Setter for custom
	 */
	 public void setCustom(String custom) {
	 	this.custom = custom;
	 }
	 
	/**
	 * Getter for invoiceID
	 */
	 public String getInvoiceID() {
	 	return invoiceID;
	 }
	 
	/**
	 * Setter for invoiceID
	 */
	 public void setInvoiceID(String invoiceID) {
	 	this.invoiceID = invoiceID;
	 }
	 
	/**
	 * Getter for buttonSource
	 */
	 public String getButtonSource() {
	 	return buttonSource;
	 }
	 
	/**
	 * Setter for buttonSource
	 */
	 public void setButtonSource(String buttonSource) {
	 	this.buttonSource = buttonSource;
	 }
	 
	/**
	 * Getter for notifyURL
	 */
	 public String getNotifyURL() {
	 	return notifyURL;
	 }
	 
	/**
	 * Setter for notifyURL
	 */
	 public void setNotifyURL(String notifyURL) {
	 	this.notifyURL = notifyURL;
	 }
	 
	/**
	 * Getter for shipToAddress
	 */
	 public AddressType getShipToAddress() {
	 	return shipToAddress;
	 }
	 
	/**
	 * Setter for shipToAddress
	 */
	 public void setShipToAddress(AddressType shipToAddress) {
	 	this.shipToAddress = shipToAddress;
	 }
	 
	/**
	 * Getter for fulfillmentReferenceNumber
	 */
	 public String getFulfillmentReferenceNumber() {
	 	return fulfillmentReferenceNumber;
	 }
	 
	/**
	 * Setter for fulfillmentReferenceNumber
	 */
	 public void setFulfillmentReferenceNumber(String fulfillmentReferenceNumber) {
	 	this.fulfillmentReferenceNumber = fulfillmentReferenceNumber;
	 }
	 
	/**
	 * Getter for fulfillmentAddress
	 */
	 public AddressType getFulfillmentAddress() {
	 	return fulfillmentAddress;
	 }
	 
	/**
	 * Setter for fulfillmentAddress
	 */
	 public void setFulfillmentAddress(AddressType fulfillmentAddress) {
	 	this.fulfillmentAddress = fulfillmentAddress;
	 }
	 
	/**
	 * Getter for paymentCategoryType
	 */
	 public PaymentCategoryType getPaymentCategoryType() {
	 	return paymentCategoryType;
	 }
	 
	/**
	 * Setter for paymentCategoryType
	 */
	 public void setPaymentCategoryType(PaymentCategoryType paymentCategoryType) {
	 	this.paymentCategoryType = paymentCategoryType;
	 }
	 
	/**
	 * Getter for shippingMethod
	 */
	 public ShippingServiceCodeType getShippingMethod() {
	 	return shippingMethod;
	 }
	 
	/**
	 * Setter for shippingMethod
	 */
	 public void setShippingMethod(ShippingServiceCodeType shippingMethod) {
	 	this.shippingMethod = shippingMethod;
	 }
	 
	/**
	 * Getter for profileAddressChangeDate
	 */
	 public String getProfileAddressChangeDate() {
	 	return profileAddressChangeDate;
	 }
	 
	/**
	 * Setter for profileAddressChangeDate
	 */
	 public void setProfileAddressChangeDate(String profileAddressChangeDate) {
	 	this.profileAddressChangeDate = profileAddressChangeDate;
	 }
	 
	/**
	 * Getter for paymentDetailsItem
	 */
	 public List<PaymentDetailsItemType> getPaymentDetailsItem() {
	 	return paymentDetailsItem;
	 }
	 
	/**
	 * Setter for paymentDetailsItem
	 */
	 public void setPaymentDetailsItem(List<PaymentDetailsItemType> paymentDetailsItem) {
	 	this.paymentDetailsItem = paymentDetailsItem;
	 }
	 
	/**
	 * Getter for insuranceTotal
	 */
	 public BasicAmountType getInsuranceTotal() {
	 	return insuranceTotal;
	 }
	 
	/**
	 * Setter for insuranceTotal
	 */
	 public void setInsuranceTotal(BasicAmountType insuranceTotal) {
	 	this.insuranceTotal = insuranceTotal;
	 }
	 
	/**
	 * Getter for shippingDiscount
	 */
	 public BasicAmountType getShippingDiscount() {
	 	return shippingDiscount;
	 }
	 
	/**
	 * Setter for shippingDiscount
	 */
	 public void setShippingDiscount(BasicAmountType shippingDiscount) {
	 	this.shippingDiscount = shippingDiscount;
	 }
	 
	/**
	 * Getter for insuranceOptionOffered
	 */
	 public String getInsuranceOptionOffered() {
	 	return insuranceOptionOffered;
	 }
	 
	/**
	 * Setter for insuranceOptionOffered
	 */
	 public void setInsuranceOptionOffered(String insuranceOptionOffered) {
	 	this.insuranceOptionOffered = insuranceOptionOffered;
	 }
	 
	/**
	 * Getter for allowedPaymentMethod
	 */
	 public AllowedPaymentMethodType getAllowedPaymentMethod() {
	 	return allowedPaymentMethod;
	 }
	 
	/**
	 * Setter for allowedPaymentMethod
	 */
	 public void setAllowedPaymentMethod(AllowedPaymentMethodType allowedPaymentMethod) {
	 	this.allowedPaymentMethod = allowedPaymentMethod;
	 }
	 
	/**
	 * Getter for enhancedPaymentData
	 */
	 public EnhancedPaymentDataType getEnhancedPaymentData() {
	 	return enhancedPaymentData;
	 }
	 
	/**
	 * Setter for enhancedPaymentData
	 */
	 public void setEnhancedPaymentData(EnhancedPaymentDataType enhancedPaymentData) {
	 	this.enhancedPaymentData = enhancedPaymentData;
	 }
	 
	/**
	 * Getter for sellerDetails
	 */
	 public SellerDetailsType getSellerDetails() {
	 	return sellerDetails;
	 }
	 
	/**
	 * Setter for sellerDetails
	 */
	 public void setSellerDetails(SellerDetailsType sellerDetails) {
	 	this.sellerDetails = sellerDetails;
	 }
	 
	/**
	 * Getter for noteText
	 */
	 public String getNoteText() {
	 	return noteText;
	 }
	 
	/**
	 * Setter for noteText
	 */
	 public void setNoteText(String noteText) {
	 	this.noteText = noteText;
	 }
	 
	/**
	 * Getter for transactionId
	 */
	 public String getTransactionId() {
	 	return transactionId;
	 }
	 
	/**
	 * Setter for transactionId
	 */
	 public void setTransactionId(String transactionId) {
	 	this.transactionId = transactionId;
	 }
	 
	/**
	 * Getter for paymentAction
	 */
	 public PaymentActionCodeType getPaymentAction() {
	 	return paymentAction;
	 }
	 
	/**
	 * Setter for paymentAction
	 */
	 public void setPaymentAction(PaymentActionCodeType paymentAction) {
	 	this.paymentAction = paymentAction;
	 }
	 
	/**
	 * Getter for paymentRequestID
	 */
	 public String getPaymentRequestID() {
	 	return paymentRequestID;
	 }
	 
	/**
	 * Setter for paymentRequestID
	 */
	 public void setPaymentRequestID(String paymentRequestID) {
	 	this.paymentRequestID = paymentRequestID;
	 }
	 
	/**
	 * Getter for orderURL
	 */
	 public String getOrderURL() {
	 	return orderURL;
	 }
	 
	/**
	 * Setter for orderURL
	 */
	 public void setOrderURL(String orderURL) {
	 	this.orderURL = orderURL;
	 }
	 
	/**
	 * Getter for softDescriptor
	 */
	 public String getSoftDescriptor() {
	 	return softDescriptor;
	 }
	 
	/**
	 * Setter for softDescriptor
	 */
	 public void setSoftDescriptor(String softDescriptor) {
	 	this.softDescriptor = softDescriptor;
	 }
	 
	/**
	 * Getter for branchLevel
	 */
	 public Integer getBranchLevel() {
	 	return branchLevel;
	 }
	 
	/**
	 * Setter for branchLevel
	 */
	 public void setBranchLevel(Integer branchLevel) {
	 	this.branchLevel = branchLevel;
	 }
	 
	/**
	 * Getter for offerDetails
	 */
	 public OfferDetailsType getOfferDetails() {
	 	return offerDetails;
	 }
	 
	/**
	 * Setter for offerDetails
	 */
	 public void setOfferDetails(OfferDetailsType offerDetails) {
	 	this.offerDetails = offerDetails;
	 }
	 
	/**
	 * Getter for recurring
	 */
	 public RecurringFlagType getRecurring() {
	 	return recurring;
	 }
	 
	/**
	 * Setter for recurring
	 */
	 public void setRecurring(RecurringFlagType recurring) {
	 	this.recurring = recurring;
	 }
	 
	/**
	 * Getter for paymentReason
	 */
	 public PaymentReasonType getPaymentReason() {
	 	return paymentReason;
	 }
	 
	/**
	 * Setter for paymentReason
	 */
	 public void setPaymentReason(PaymentReasonType paymentReason) {
	 	this.paymentReason = paymentReason;
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
		if(orderTotal != null) {
			sb.append(orderTotal.toXMLString(preferredPrefix,"OrderTotal"));
		}
		if(itemTotal != null) {
			sb.append(itemTotal.toXMLString(preferredPrefix,"ItemTotal"));
		}
		if(shippingTotal != null) {
			sb.append(shippingTotal.toXMLString(preferredPrefix,"ShippingTotal"));
		}
		if(handlingTotal != null) {
			sb.append(handlingTotal.toXMLString(preferredPrefix,"HandlingTotal"));
		}
		if(taxTotal != null) {
			sb.append(taxTotal.toXMLString(preferredPrefix,"TaxTotal"));
		}
		if(orderDescription != null) {
			sb.append("<").append(preferredPrefix).append(":OrderDescription>").append(SDKUtil.escapeInvalidXmlCharsRegex(orderDescription));
			sb.append("</").append(preferredPrefix).append(":OrderDescription>");
		}
		if(custom != null) {
			sb.append("<").append(preferredPrefix).append(":Custom>").append(SDKUtil.escapeInvalidXmlCharsRegex(custom));
			sb.append("</").append(preferredPrefix).append(":Custom>");
		}
		if(invoiceID != null) {
			sb.append("<").append(preferredPrefix).append(":InvoiceID>").append(SDKUtil.escapeInvalidXmlCharsRegex(invoiceID));
			sb.append("</").append(preferredPrefix).append(":InvoiceID>");
		}
		if(buttonSource != null) {
			sb.append("<").append(preferredPrefix).append(":ButtonSource>").append(SDKUtil.escapeInvalidXmlCharsRegex(buttonSource));
			sb.append("</").append(preferredPrefix).append(":ButtonSource>");
		}
		if(notifyURL != null) {
			sb.append("<").append(preferredPrefix).append(":NotifyURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(notifyURL));
			sb.append("</").append(preferredPrefix).append(":NotifyURL>");
		}
		if(shipToAddress != null) {
			sb.append(shipToAddress.toXMLString(preferredPrefix,"ShipToAddress"));
		}
		if(fulfillmentReferenceNumber != null) {
			sb.append("<").append(preferredPrefix).append(":FulfillmentReferenceNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(fulfillmentReferenceNumber));
			sb.append("</").append(preferredPrefix).append(":FulfillmentReferenceNumber>");
		}
		if(fulfillmentAddress != null) {
			sb.append(fulfillmentAddress.toXMLString(preferredPrefix,"FulfillmentAddress"));
		}
		if(paymentCategoryType != null) {
			sb.append("<").append(preferredPrefix).append(":PaymentCategoryType>").append(SDKUtil.escapeInvalidXmlCharsRegex(paymentCategoryType.getValue()));
			sb.append("</").append(preferredPrefix).append(":PaymentCategoryType>");
		}
		if(shippingMethod != null) {
			sb.append("<").append(preferredPrefix).append(":ShippingMethod>").append(SDKUtil.escapeInvalidXmlCharsRegex(shippingMethod.getValue()));
			sb.append("</").append(preferredPrefix).append(":ShippingMethod>");
		}
		if(profileAddressChangeDate != null) {
			sb.append("<").append(preferredPrefix).append(":ProfileAddressChangeDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(profileAddressChangeDate));
			sb.append("</").append(preferredPrefix).append(":ProfileAddressChangeDate>");
		}
		if(paymentDetailsItem != null) {
			for(int i=0; i < paymentDetailsItem.size(); i++) {
				sb.append(paymentDetailsItem.get(i).toXMLString(preferredPrefix,"PaymentDetailsItem"));
			}
		}
		if(insuranceTotal != null) {
			sb.append(insuranceTotal.toXMLString(preferredPrefix,"InsuranceTotal"));
		}
		if(shippingDiscount != null) {
			sb.append(shippingDiscount.toXMLString(preferredPrefix,"ShippingDiscount"));
		}
		if(insuranceOptionOffered != null) {
			sb.append("<").append(preferredPrefix).append(":InsuranceOptionOffered>").append(SDKUtil.escapeInvalidXmlCharsRegex(insuranceOptionOffered));
			sb.append("</").append(preferredPrefix).append(":InsuranceOptionOffered>");
		}
		if(allowedPaymentMethod != null) {
			sb.append("<").append(preferredPrefix).append(":AllowedPaymentMethod>").append(SDKUtil.escapeInvalidXmlCharsRegex(allowedPaymentMethod.getValue()));
			sb.append("</").append(preferredPrefix).append(":AllowedPaymentMethod>");
		}
		if(enhancedPaymentData != null) {
			sb.append(enhancedPaymentData.toXMLString(preferredPrefix,"EnhancedPaymentData"));
		}
		if(sellerDetails != null) {
			sb.append(sellerDetails.toXMLString(preferredPrefix,"SellerDetails"));
		}
		if(noteText != null) {
			sb.append("<").append(preferredPrefix).append(":NoteText>").append(SDKUtil.escapeInvalidXmlCharsRegex(noteText));
			sb.append("</").append(preferredPrefix).append(":NoteText>");
		}
		if(transactionId != null) {
			sb.append("<").append(preferredPrefix).append(":TransactionId>").append(SDKUtil.escapeInvalidXmlCharsRegex(transactionId));
			sb.append("</").append(preferredPrefix).append(":TransactionId>");
		}
		if(paymentAction != null) {
			sb.append("<").append(preferredPrefix).append(":PaymentAction>").append(SDKUtil.escapeInvalidXmlCharsRegex(paymentAction.getValue()));
			sb.append("</").append(preferredPrefix).append(":PaymentAction>");
		}
		if(paymentRequestID != null) {
			sb.append("<").append(preferredPrefix).append(":PaymentRequestID>").append(SDKUtil.escapeInvalidXmlCharsRegex(paymentRequestID));
			sb.append("</").append(preferredPrefix).append(":PaymentRequestID>");
		}
		if(orderURL != null) {
			sb.append("<").append(preferredPrefix).append(":OrderURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(orderURL));
			sb.append("</").append(preferredPrefix).append(":OrderURL>");
		}
		if(softDescriptor != null) {
			sb.append("<").append(preferredPrefix).append(":SoftDescriptor>").append(SDKUtil.escapeInvalidXmlCharsRegex(softDescriptor));
			sb.append("</").append(preferredPrefix).append(":SoftDescriptor>");
		}
		if(branchLevel != null) {
			sb.append("<").append(preferredPrefix).append(":BranchLevel>").append(SDKUtil.escapeInvalidXmlCharsRegex(branchLevel));
			sb.append("</").append(preferredPrefix).append(":BranchLevel>");
		}
		if(offerDetails != null) {
			sb.append(offerDetails.toXMLString(preferredPrefix,"OfferDetails"));
		}
		if(recurring != null) {
			sb.append("<").append(preferredPrefix).append(":Recurring>").append(SDKUtil.escapeInvalidXmlCharsRegex(recurring.getValue()));
			sb.append("</").append(preferredPrefix).append(":Recurring>");
		}
		if(paymentReason != null) {
			sb.append("<").append(preferredPrefix).append(":PaymentReason>").append(SDKUtil.escapeInvalidXmlCharsRegex(paymentReason.getValue()));
			sb.append("</").append(preferredPrefix).append(":PaymentReason>");
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
	
	public PaymentDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("OrderTotal", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.orderTotal =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("ItemTotal", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemTotal =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("ShippingTotal", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.shippingTotal =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("HandlingTotal", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.handlingTotal =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("TaxTotal", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.taxTotal =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("OrderDescription", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.orderDescription = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Custom", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.custom = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InvoiceID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.invoiceID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ButtonSource", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.buttonSource = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("NotifyURL", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.notifyURL = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ShipToAddress", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.shipToAddress =  new AddressType(childNode);
		}
		childNode = (Node) xpath.evaluate("FulfillmentReferenceNumber", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.fulfillmentReferenceNumber = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("FulfillmentAddress", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.fulfillmentAddress =  new AddressType(childNode);
		}
		childNode = (Node) xpath.evaluate("PaymentCategoryType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentCategoryType = PaymentCategoryType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ShippingMethod", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.shippingMethod = ShippingServiceCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ProfileAddressChangeDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.profileAddressChangeDate = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("PaymentDetailsItem", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.paymentDetailsItem.add(new PaymentDetailsItemType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("InsuranceTotal", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.insuranceTotal =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("ShippingDiscount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.shippingDiscount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("InsuranceOptionOffered", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.insuranceOptionOffered = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AllowedPaymentMethod", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.allowedPaymentMethod = AllowedPaymentMethodType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("EnhancedPaymentData", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.enhancedPaymentData =  new EnhancedPaymentDataType(childNode);
		}
		childNode = (Node) xpath.evaluate("SellerDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.sellerDetails =  new SellerDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("NoteText", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.noteText = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TransactionId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.transactionId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PaymentAction", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentAction = PaymentActionCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PaymentRequestID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentRequestID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OrderURL", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.orderURL = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SoftDescriptor", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.softDescriptor = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BranchLevel", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.branchLevel = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("OfferDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.offerDetails =  new OfferDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("Recurring", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.recurring = RecurringFlagType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PaymentReason", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentReason = PaymentReasonType.fromValue(childNode.getTextContent());
		}
	}
 
}