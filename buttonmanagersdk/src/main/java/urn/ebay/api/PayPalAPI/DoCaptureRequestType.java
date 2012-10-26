package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.CompleteCodeType;
import urn.ebay.apis.eBLBaseComponents.EnhancedDataType;
import urn.ebay.apis.eBLBaseComponents.MerchantStoreDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * The authorization identification number of the payment you
 * want to capture. Required Character length and limits: 19
 * single-byte characters maximum 
 */
public class DoCaptureRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * The authorization identification number of the payment you
	 * want to capture. Required Character length and limits: 19
	 * single-byte characters maximum	  
	 *@Required	 
	 */ 
	private String authorizationID;

	/**
	 * Amount to authorize. You must set the currencyID attribute
	 * to USD. Required Limitations: Must not exceed $10,000 USD in
	 * any currency. No currency symbol. Decimal separator must be
	 * a period (.), and the thousands separator must be a comma
	 * (,)	  
	 *@Required	 
	 */ 
	private BasicAmountType amount;

	/**
	 * Indicates if this capture is the last capture you intend to
	 * make. The default is Complete. If CompleteType is Complete,
	 * any remaining amount of the original reauthorized
	 * transaction is automatically voided. Required Character
	 * length and limits: 12 single-byte alphanumeric characters	  
	 *@Required	 
	 */ 
	private CompleteCodeType completeType;

	/**
	 * An informational note about this settlement that is
	 * displayed to the payer in email and in transaction history.
	 * Optional Character length and limits: 255 single-byte
	 * characters	 
	 */ 
	private String note;

	/**
	 * Your invoice number or other identification number. The
	 * InvoiceID value is recorded only if the authorization you
	 * are capturing is an order authorization, not a basic
	 * authorization. Optional Character length and limits: 127
	 * single-byte alphanumeric characters	 
	 */ 
	private String invoiceID;

	/**
	 * Contains enhanced data like airline itinerary information.
	 * Not Required 	 
	 */ 
	private EnhancedDataType enhancedData;

	/**
	 * dynamic descriptor Dynamic descriptor is used for merchant
	 * to provide detail of a transaction appears on statement
	 * Optional Character length and limits: <18 characters
	 * alphanumeric characters	 
	 */ 
	private String descriptor;

	/**
	 * To pass the Merchant store informationOptional 	 
	 */ 
	private MerchantStoreDetailsType merchantStoreDetails;

	/**
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String msgSubID;

	

	/**
	 * Constructor with arguments
	 */
	public DoCaptureRequestType (String authorizationID, BasicAmountType amount, CompleteCodeType completeType){
		this.authorizationID = authorizationID;
		this.amount = amount;
		this.completeType = completeType;
	}	

	/**
	 * Default Constructor
	 */
	public DoCaptureRequestType (){
	}	

	/**
	 * Getter for authorizationID
	 */
	 public String getAuthorizationID() {
	 	return authorizationID;
	 }
	 
	/**
	 * Setter for authorizationID
	 */
	 public void setAuthorizationID(String authorizationID) {
	 	this.authorizationID = authorizationID;
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
	 * Getter for completeType
	 */
	 public CompleteCodeType getCompleteType() {
	 	return completeType;
	 }
	 
	/**
	 * Setter for completeType
	 */
	 public void setCompleteType(CompleteCodeType completeType) {
	 	this.completeType = completeType;
	 }
	 
	/**
	 * Getter for note
	 */
	 public String getNote() {
	 	return note;
	 }
	 
	/**
	 * Setter for note
	 */
	 public void setNote(String note) {
	 	this.note = note;
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
	 * Getter for enhancedData
	 */
	 public EnhancedDataType getEnhancedData() {
	 	return enhancedData;
	 }
	 
	/**
	 * Setter for enhancedData
	 */
	 public void setEnhancedData(EnhancedDataType enhancedData) {
	 	this.enhancedData = enhancedData;
	 }
	 
	/**
	 * Getter for descriptor
	 */
	 public String getDescriptor() {
	 	return descriptor;
	 }
	 
	/**
	 * Setter for descriptor
	 */
	 public void setDescriptor(String descriptor) {
	 	this.descriptor = descriptor;
	 }
	 
	/**
	 * Getter for merchantStoreDetails
	 */
	 public MerchantStoreDetailsType getMerchantStoreDetails() {
	 	return merchantStoreDetails;
	 }
	 
	/**
	 * Setter for merchantStoreDetails
	 */
	 public void setMerchantStoreDetails(MerchantStoreDetailsType merchantStoreDetails) {
	 	this.merchantStoreDetails = merchantStoreDetails;
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
		sb.append(super.toXMLString(prefix, null));
		if(authorizationID != null) {
			sb.append("<").append(preferredPrefix).append(":AuthorizationID>").append(SDKUtil.escapeInvalidXmlCharsRegex(authorizationID));
			sb.append("</").append(preferredPrefix).append(":AuthorizationID>");
		}
		if(amount != null) {
			sb.append(amount.toXMLString(preferredPrefix,"Amount"));
		}
		if(completeType != null) {
			sb.append("<").append(preferredPrefix).append(":CompleteType>").append(SDKUtil.escapeInvalidXmlCharsRegex(completeType.getValue()));
			sb.append("</").append(preferredPrefix).append(":CompleteType>");
		}
		if(note != null) {
			sb.append("<").append(preferredPrefix).append(":Note>").append(SDKUtil.escapeInvalidXmlCharsRegex(note));
			sb.append("</").append(preferredPrefix).append(":Note>");
		}
		if(invoiceID != null) {
			sb.append("<").append(preferredPrefix).append(":InvoiceID>").append(SDKUtil.escapeInvalidXmlCharsRegex(invoiceID));
			sb.append("</").append(preferredPrefix).append(":InvoiceID>");
		}
		if(enhancedData != null) {
			sb.append(enhancedData.toXMLString(null,"EnhancedData"));
		}
		if(descriptor != null) {
			sb.append("<").append(preferredPrefix).append(":Descriptor>").append(SDKUtil.escapeInvalidXmlCharsRegex(descriptor));
			sb.append("</").append(preferredPrefix).append(":Descriptor>");
		}
		if(merchantStoreDetails != null) {
			sb.append(merchantStoreDetails.toXMLString(null,"MerchantStoreDetails"));
		}
		if(msgSubID != null) {
			sb.append("<").append(preferredPrefix).append(":MsgSubID>").append(SDKUtil.escapeInvalidXmlCharsRegex(msgSubID));
			sb.append("</").append(preferredPrefix).append(":MsgSubID>");
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