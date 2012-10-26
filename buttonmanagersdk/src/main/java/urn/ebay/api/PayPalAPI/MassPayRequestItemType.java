package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import com.paypal.core.SDKUtil;

/**
 * MassPayRequestItemType 
 */
public class MassPayRequestItemType{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * Email address of recipient. Required You must specify
	 * ReceiverEmail, ReceiverPhone, or ReceiverID, but all
	 * MassPayItems in a request must use the same field to specify
	 * recipients. Character length and limitations: 127
	 * single-byte characters maximum.	 
	 */ 
	private String receiverEmail;

	/**
	 * Phone number of recipient. Required You must specify
	 * ReceiverEmail, ReceiverPhone, or ReceiverID, but all
	 * MassPayItems in a request must use the same field to specify
	 * recipients.	 
	 */ 
	private String receiverPhone;

	/**
	 * Unique PayPal customer account number. This value
	 * corresponds to the value of PayerID returned by
	 * GetTransactionDetails. Required You must specify
	 * ReceiverEmail, ReceiverPhone, or ReceiverID, but all
	 * MassPayItems in a request must use the same field to specify
	 * recipients. Character length and limitations: 17 single-byte
	 * characters maximum.	 
	 */ 
	private String receiverID;

	/**
	 * Payment amount. You must set the currencyID attribute to one
	 * of the three-character currency codes for any of the
	 * supported PayPal currencies. Required You cannot mix
	 * currencies in a single MassPayRequest. A single request must
	 * include items that are of the same currency.	  
	 *@Required	 
	 */ 
	private BasicAmountType amount;

	/**
	 * Transaction-specific identification number for tracking in
	 * an accounting system. Optional Character length and
	 * limitations: 30 single-byte characters. No whitespace
	 * allowed.	 
	 */ 
	private String uniqueId;

	/**
	 * Custom note for each recipient. Optional Character length
	 * and limitations: 4,000 single-byte alphanumeric characters	 
	 */ 
	private String note;

	

	/**
	 * Constructor with arguments
	 */
	public MassPayRequestItemType (BasicAmountType amount){
		this.amount = amount;
	}	

	/**
	 * Default Constructor
	 */
	public MassPayRequestItemType (){
	}	

	/**
	 * Getter for receiverEmail
	 */
	 public String getReceiverEmail() {
	 	return receiverEmail;
	 }
	 
	/**
	 * Setter for receiverEmail
	 */
	 public void setReceiverEmail(String receiverEmail) {
	 	this.receiverEmail = receiverEmail;
	 }
	 
	/**
	 * Getter for receiverPhone
	 */
	 public String getReceiverPhone() {
	 	return receiverPhone;
	 }
	 
	/**
	 * Setter for receiverPhone
	 */
	 public void setReceiverPhone(String receiverPhone) {
	 	this.receiverPhone = receiverPhone;
	 }
	 
	/**
	 * Getter for receiverID
	 */
	 public String getReceiverID() {
	 	return receiverID;
	 }
	 
	/**
	 * Setter for receiverID
	 */
	 public void setReceiverID(String receiverID) {
	 	this.receiverID = receiverID;
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
	 * Getter for uniqueId
	 */
	 public String getUniqueId() {
	 	return uniqueId;
	 }
	 
	/**
	 * Setter for uniqueId
	 */
	 public void setUniqueId(String uniqueId) {
	 	this.uniqueId = uniqueId;
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
		if(receiverEmail != null) {
			sb.append("<").append(preferredPrefix).append(":ReceiverEmail>").append(SDKUtil.escapeInvalidXmlCharsRegex(receiverEmail));
			sb.append("</").append(preferredPrefix).append(":ReceiverEmail>");
		}
		if(receiverPhone != null) {
			sb.append("<").append(preferredPrefix).append(":ReceiverPhone>").append(SDKUtil.escapeInvalidXmlCharsRegex(receiverPhone));
			sb.append("</").append(preferredPrefix).append(":ReceiverPhone>");
		}
		if(receiverID != null) {
			sb.append("<").append(preferredPrefix).append(":ReceiverID>").append(SDKUtil.escapeInvalidXmlCharsRegex(receiverID));
			sb.append("</").append(preferredPrefix).append(":ReceiverID>");
		}
		if(amount != null) {
			sb.append(amount.toXMLString(preferredPrefix,"Amount"));
		}
		if(uniqueId != null) {
			sb.append("<").append(preferredPrefix).append(":UniqueId>").append(SDKUtil.escapeInvalidXmlCharsRegex(uniqueId));
			sb.append("</").append(preferredPrefix).append(":UniqueId>");
		}
		if(note != null) {
			sb.append("<").append(preferredPrefix).append(":Note>").append(SDKUtil.escapeInvalidXmlCharsRegex(note));
			sb.append("</").append(preferredPrefix).append(":Note>");
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