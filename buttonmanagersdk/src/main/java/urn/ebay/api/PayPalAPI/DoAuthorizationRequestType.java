package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.TransactionEntityType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsItemType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * The value of the order’s transaction identification number
 * returned by a PayPal product. Required Character length and
 * limits: 19 single-byte characters maximum 
 */
public class DoAuthorizationRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * The value of the order’s transaction identification number
	 * returned by a PayPal product. Required Character length and
	 * limits: 19 single-byte characters maximum	  
	 *@Required	 
	 */ 
	private String transactionID;

	/**
	 * Type of transaction to authorize. The only allowable value
	 * is Order, which means that the transaction represents a
	 * customer order that can be fulfilled over 29 days. Optional	 
	 */ 
	private TransactionEntityType transactionEntity;

	/**
	 * Amount to authorize. Required Limitations: Must not exceed
	 * $10,000 USD in any currency. No currency symbol. Decimal
	 * separator must be a period (.), and the thousands separator
	 * must be a comma (,).	  
	 *@Required	 
	 */ 
	private BasicAmountType amount;

	/**
	 * Address the order will be shipped to. Optional 	 
	 */ 
	private AddressType shipToAddress;

	/**
	 * Information about the individual purchased items 	 
	 */ 
	private List<PaymentDetailsItemType> paymentDetailsItem = new ArrayList<PaymentDetailsItemType>();

	/**
	 * Sum of cost of all items in this order. You must set the
	 * currencyID attribute to one of the three-character currency
	 * codes for any of the supported PayPal currencies. Optional
	 * Limitations: Must not exceed $10,000 USD in any currency. No
	 * currency symbol. Decimal separator must be a period (.), and
	 * the thousands separator must be a comma (,). 	 
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
	 * Total shipping insurance costs for this order. Optional 	 
	 */ 
	private BasicAmountType insuranceTotal;

	/**
	 * Shipping discount for this order, specified as a negative
	 * number. Optional 	 
	 */ 
	private BasicAmountType shippingDiscount;

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
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String msgSubID;

	/**
	 * IP Address of the buyer 	 
	 */ 
	private String iPAddress;

	/**
	 * A flag indicating that this transaction is a Ship to Store
	 * transaction. Optional 	 
	 */ 
	private String shipToStore;

	

	/**
	 * Constructor with arguments
	 */
	public DoAuthorizationRequestType (String transactionID, BasicAmountType amount){
		this.transactionID = transactionID;
		this.amount = amount;
	}	

	/**
	 * Default Constructor
	 */
	public DoAuthorizationRequestType (){
	}	

	/**
	 * Getter for transactionID
	 */
	 public String getTransactionID() {
	 	return transactionID;
	 }
	 
	/**
	 * Setter for transactionID
	 */
	 public void setTransactionID(String transactionID) {
	 	this.transactionID = transactionID;
	 }
	 
	/**
	 * Getter for transactionEntity
	 */
	 public TransactionEntityType getTransactionEntity() {
	 	return transactionEntity;
	 }
	 
	/**
	 * Setter for transactionEntity
	 */
	 public void setTransactionEntity(TransactionEntityType transactionEntity) {
	 	this.transactionEntity = transactionEntity;
	 }
	 
	/**
	 * Getter for amount
	 */
	 public BasicAmountType getAmount() {
	 	return amount;
	 }
	 
	/**
	 * Setter for amount
	 */
	 public void setAmount(BasicAmountType amount) {
	 	this.amount = amount;
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
	 * Getter for msgSubID
	 */
	 public String getMsgSubID() {
	 	return msgSubID;
	 }
	 
	/**
	 * Setter for msgSubID
	 */
	 public void setMsgSubID(String msgSubID) {
	 	this.msgSubID = msgSubID;
	 }
	 
	/**
	 * Getter for iPAddress
	 */
	 public String getIPAddress() {
	 	return iPAddress;
	 }
	 
	/**
	 * Setter for iPAddress
	 */
	 public void setIPAddress(String iPAddress) {
	 	this.iPAddress = iPAddress;
	 }
	 
	/**
	 * Getter for shipToStore
	 */
	 public String getShipToStore() {
	 	return shipToStore;
	 }
	 
	/**
	 * Setter for shipToStore
	 */
	 public void setShipToStore(String shipToStore) {
	 	this.shipToStore = shipToStore;
	 }
	 


	public String toXMLString(String prefix, String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		sb.append(super.toXMLString(prefix, null));
		if(transactionID != null) {
			sb.append("<").append(preferredPrefix).append(":TransactionID>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.transactionID));
			sb.append("</").append(preferredPrefix).append(":TransactionID>");
		}
		if(transactionEntity != null) {
			sb.append("<").append(preferredPrefix).append(":TransactionEntity>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.transactionEntity.getValue()));
			sb.append("</").append(preferredPrefix).append(":TransactionEntity>");
		}
		if(amount != null) {
			sb.append(amount.toXMLString(preferredPrefix,"Amount"));
		}
		if(shipToAddress != null) {
			sb.append(shipToAddress.toXMLString(null,"ShipToAddress"));
		}
		if(paymentDetailsItem != null) {
			for(int i=0; i < paymentDetailsItem.size(); i++) {
				sb.append(paymentDetailsItem.get(i).toXMLString(null,"PaymentDetailsItem"));
			}
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
		if(insuranceTotal != null) {
			sb.append(insuranceTotal.toXMLString(preferredPrefix,"InsuranceTotal"));
		}
		if(shippingDiscount != null) {
			sb.append(shippingDiscount.toXMLString(preferredPrefix,"ShippingDiscount"));
		}
		if(orderDescription != null) {
			sb.append("<").append(preferredPrefix).append(":OrderDescription>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.orderDescription));
			sb.append("</").append(preferredPrefix).append(":OrderDescription>");
		}
		if(custom != null) {
			sb.append("<").append(preferredPrefix).append(":Custom>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.custom));
			sb.append("</").append(preferredPrefix).append(":Custom>");
		}
		if(msgSubID != null) {
			sb.append("<").append(preferredPrefix).append(":MsgSubID>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.msgSubID));
			sb.append("</").append(preferredPrefix).append(":MsgSubID>");
		}
		if(iPAddress != null) {
			sb.append("<").append(preferredPrefix).append(":IPAddress>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.iPAddress));
			sb.append("</").append(preferredPrefix).append(":IPAddress>");
		}
		if(shipToStore != null) {
			sb.append("<").append(preferredPrefix).append(":ShipToStore>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.shipToStore));
			sb.append("</").append(preferredPrefix).append(":ShipToStore>");
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


}