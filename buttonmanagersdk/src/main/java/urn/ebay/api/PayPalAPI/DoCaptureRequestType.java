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


	/**
	 * The authorization identification number of the payment you
	 * want to capture. Required Character length and limits: 19
	 * single-byte characters maximum	  
	 *@Required	 
	 */ 
	private String AuthorizationID;

	/**
	 * Amount to authorize. You must set the currencyID attribute
	 * to USD. Required Limitations: Must not exceed $10,000 USD in
	 * any currency. No currency symbol. Decimal separator must be
	 * a period (.), and the thousands separator must be a comma
	 * (,)	  
	 *@Required	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * Indicates if this capture is the last capture you intend to
	 * make. The default is Complete. If CompleteType is Complete,
	 * any remaining amount of the original reauthorized
	 * transaction is automatically voided. Required Character
	 * length and limits: 12 single-byte alphanumeric characters	  
	 *@Required	 
	 */ 
	private CompleteCodeType CompleteType;

	/**
	 * An informational note about this settlement that is
	 * displayed to the payer in email and in transaction history.
	 * Optional Character length and limits: 255 single-byte
	 * characters	 
	 */ 
	private String Note;

	/**
	 * Your invoice number or other identification number. The
	 * InvoiceID value is recorded only if the authorization you
	 * are capturing is an order authorization, not a basic
	 * authorization. Optional Character length and limits: 127
	 * single-byte alphanumeric characters	 
	 */ 
	private String InvoiceID;

	/**
	 * Contains enhanced data like airline itinerary information.
	 * Not Required 	 
	 */ 
	private EnhancedDataType EnhancedData;

	/**
	 * dynamic descriptor Dynamic descriptor is used for merchant
	 * to provide detail of a transaction appears on statement
	 * Optional Character length and limits: <18 characters
	 * alphanumeric characters	 
	 */ 
	private String Descriptor;

	/**
	 * To pass the Merchant store informationOptional 	 
	 */ 
	private MerchantStoreDetailsType MerchantStoreDetails;

	/**
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String MsgSubID;

	

	/**
	 * Constructor with arguments
	 */
	public DoCaptureRequestType (String AuthorizationID, BasicAmountType Amount, CompleteCodeType CompleteType){
		this.AuthorizationID = AuthorizationID;
		this.Amount = Amount;
		this.CompleteType = CompleteType;
	}	

	/**
	 * Default Constructor
	 */
	public DoCaptureRequestType (){
	}	

	/**
	 * Getter for AuthorizationID
	 */
	 public String getAuthorizationID() {
	 	return AuthorizationID;
	 }
	 
	/**
	 * Setter for AuthorizationID
	 */
	 public void setAuthorizationID(String AuthorizationID) {
	 	this.AuthorizationID = AuthorizationID;
	 }
	 
	/**
	 * Getter for Amount
	 */
	 public BasicAmountType getAmount() {
	 	return Amount;
	 }
	 
	/**
	 * Setter for Amount
	 */
	 public void setAmount(BasicAmountType Amount) {
	 	this.Amount = Amount;
	 }
	 
	/**
	 * Getter for CompleteType
	 */
	 public CompleteCodeType getCompleteType() {
	 	return CompleteType;
	 }
	 
	/**
	 * Setter for CompleteType
	 */
	 public void setCompleteType(CompleteCodeType CompleteType) {
	 	this.CompleteType = CompleteType;
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
	 * Getter for EnhancedData
	 */
	 public EnhancedDataType getEnhancedData() {
	 	return EnhancedData;
	 }
	 
	/**
	 * Setter for EnhancedData
	 */
	 public void setEnhancedData(EnhancedDataType EnhancedData) {
	 	this.EnhancedData = EnhancedData;
	 }
	 
	/**
	 * Getter for Descriptor
	 */
	 public String getDescriptor() {
	 	return Descriptor;
	 }
	 
	/**
	 * Setter for Descriptor
	 */
	 public void setDescriptor(String Descriptor) {
	 	this.Descriptor = Descriptor;
	 }
	 
	/**
	 * Getter for MerchantStoreDetails
	 */
	 public MerchantStoreDetailsType getMerchantStoreDetails() {
	 	return MerchantStoreDetails;
	 }
	 
	/**
	 * Setter for MerchantStoreDetails
	 */
	 public void setMerchantStoreDetails(MerchantStoreDetailsType MerchantStoreDetails) {
	 	this.MerchantStoreDetails = MerchantStoreDetails;
	 }
	 
	/**
	 * Getter for MsgSubID
	 */
	 public String getMsgSubID() {
	 	return MsgSubID;
	 }
	 
	/**
	 * Setter for MsgSubID
	 */
	 public void setMsgSubID(String MsgSubID) {
	 	this.MsgSubID = MsgSubID;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(AuthorizationID != null) {
			sb.append("<urn:AuthorizationID>").append(SDKUtil.escapeInvalidXmlCharsRegex(AuthorizationID));
			sb.append("</urn:AuthorizationID>");
		}
		if(Amount != null) {
			sb.append("<urn:Amount");
			sb.append(Amount.toXMLString());
			sb.append("</urn:Amount>");
		}
		if(CompleteType != null) {
			sb.append("<urn:CompleteType>").append(SDKUtil.escapeInvalidXmlCharsRegex(CompleteType.getValue()));
			sb.append("</urn:CompleteType>");
		}
		if(Note != null) {
			sb.append("<urn:Note>").append(SDKUtil.escapeInvalidXmlCharsRegex(Note));
			sb.append("</urn:Note>");
		}
		if(InvoiceID != null) {
			sb.append("<urn:InvoiceID>").append(SDKUtil.escapeInvalidXmlCharsRegex(InvoiceID));
			sb.append("</urn:InvoiceID>");
		}
		if(EnhancedData != null) {
			sb.append("<ebl:EnhancedData>");
			sb.append(EnhancedData.toXMLString());
			sb.append("</ebl:EnhancedData>");
		}
		if(Descriptor != null) {
			sb.append("<urn:Descriptor>").append(SDKUtil.escapeInvalidXmlCharsRegex(Descriptor));
			sb.append("</urn:Descriptor>");
		}
		if(MerchantStoreDetails != null) {
			sb.append("<ebl:MerchantStoreDetails>");
			sb.append(MerchantStoreDetails.toXMLString());
			sb.append("</ebl:MerchantStoreDetails>");
		}
		if(MsgSubID != null) {
			sb.append("<urn:MsgSubID>").append(SDKUtil.escapeInvalidXmlCharsRegex(MsgSubID));
			sb.append("</urn:MsgSubID>");
		}
		return sb.toString();
	}


}