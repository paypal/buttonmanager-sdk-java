package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;

/**
 * MassPayRequestItemType 
 */
public class MassPayRequestItemType{


	/**
	 * Email address of recipient. Required You must specify
	 * ReceiverEmail, ReceiverPhone, or ReceiverID, but all
	 * MassPayItems in a request must use the same field to specify
	 * recipients. Character length and limitations: 127
	 * single-byte characters maximum.	 
	 */ 
	private String ReceiverEmail;

	/**
	 * Phone number of recipient. Required You must specify
	 * ReceiverEmail, ReceiverPhone, or ReceiverID, but all
	 * MassPayItems in a request must use the same field to specify
	 * recipients.	 
	 */ 
	private String ReceiverPhone;

	/**
	 * Unique PayPal customer account number. This value
	 * corresponds to the value of PayerID returned by
	 * GetTransactionDetails. Required You must specify
	 * ReceiverEmail, ReceiverPhone, or ReceiverID, but all
	 * MassPayItems in a request must use the same field to specify
	 * recipients. Character length and limitations: 17 single-byte
	 * characters maximum.	 
	 */ 
	private String ReceiverID;

	/**
	 * Payment amount. You must set the currencyID attribute to one
	 * of the three-character currency codes for any of the
	 * supported PayPal currencies. Required You cannot mix
	 * currencies in a single MassPayRequest. A single request must
	 * include items that are of the same currency.	  
	 *@Required	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * Transaction-specific identification number for tracking in
	 * an accounting system. Optional Character length and
	 * limitations: 30 single-byte characters. No whitespace
	 * allowed.	 
	 */ 
	private String UniqueId;

	/**
	 * Custom note for each recipient. Optional Character length
	 * and limitations: 4,000 single-byte alphanumeric characters	 
	 */ 
	private String Note;

	

	/**
	 * Constructor with arguments
	 */
	public MassPayRequestItemType (BasicAmountType Amount){
		this.Amount = Amount;
	}	

	/**
	 * Default Constructor
	 */
	public MassPayRequestItemType (){
	}	

	/**
	 * Getter for ReceiverEmail
	 */
	 public String getReceiverEmail() {
	 	return ReceiverEmail;
	 }
	 
	/**
	 * Setter for ReceiverEmail
	 */
	 public void setReceiverEmail(String ReceiverEmail) {
	 	this.ReceiverEmail = ReceiverEmail;
	 }
	 
	/**
	 * Getter for ReceiverPhone
	 */
	 public String getReceiverPhone() {
	 	return ReceiverPhone;
	 }
	 
	/**
	 * Setter for ReceiverPhone
	 */
	 public void setReceiverPhone(String ReceiverPhone) {
	 	this.ReceiverPhone = ReceiverPhone;
	 }
	 
	/**
	 * Getter for ReceiverID
	 */
	 public String getReceiverID() {
	 	return ReceiverID;
	 }
	 
	/**
	 * Setter for ReceiverID
	 */
	 public void setReceiverID(String ReceiverID) {
	 	this.ReceiverID = ReceiverID;
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
	 * Getter for UniqueId
	 */
	 public String getUniqueId() {
	 	return UniqueId;
	 }
	 
	/**
	 * Setter for UniqueId
	 */
	 public void setUniqueId(String UniqueId) {
	 	this.UniqueId = UniqueId;
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
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ReceiverEmail != null) {
			sb.append("<urn:ReceiverEmail>").append(ReceiverEmail);
			sb.append("</urn:ReceiverEmail>");
		}
		if(ReceiverPhone != null) {
			sb.append("<urn:ReceiverPhone>").append(ReceiverPhone);
			sb.append("</urn:ReceiverPhone>");
		}
		if(ReceiverID != null) {
			sb.append("<urn:ReceiverID>").append(ReceiverID);
			sb.append("</urn:ReceiverID>");
		}
		if(Amount != null) {
			sb.append("<urn:Amount");
			sb.append(Amount.toXMLString());
			sb.append("</urn:Amount>");
		}
		if(UniqueId != null) {
			sb.append("<urn:UniqueId>").append(UniqueId);
			sb.append("</urn:UniqueId>");
		}
		if(Note != null) {
			sb.append("<urn:Note>").append(Note);
			sb.append("</urn:Note>");
		}
		return sb.toString();
	}

}