
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;


/**
 * MassPayRequestItemType
 */
public class MassPayRequestItemType {

	/**
Email address of recipient. 
	 * Required
	 * You must specify ReceiverEmail, ReceiverPhone, or ReceiverID, but all MassPayItems in a request must use the same field to specify recipients.
	 * Character length and limitations: 127 single-byte characters maximum.
	 */
	private String ReceiverEmail;
	public String getReceiverEmail() {
		return ReceiverEmail;
	}
	public void setReceiverEmail(String value) {
		this.ReceiverEmail = value;
	}

	/**
Phone number of recipient. 
	 * Required
	 * You must specify ReceiverEmail, ReceiverPhone, or ReceiverID, but all MassPayItems in a request must use the same field to specify recipients.
	 */
	private String ReceiverPhone;
	public String getReceiverPhone() {
		return ReceiverPhone;
	}
	public void setReceiverPhone(String value) {
		this.ReceiverPhone = value;
	}

	/**
Unique PayPal customer account number. This value corresponds to the value of PayerID returned by GetTransactionDetails. 
	 * Required
	 * You must specify ReceiverEmail, ReceiverPhone, or ReceiverID, but all MassPayItems in a request must use the same field to specify recipients.
	 * Character length and limitations: 17 single-byte characters maximum.
	 */
	private String ReceiverID;
	public String getReceiverID() {
		return ReceiverID;
	}
	public void setReceiverID(String value) {
		this.ReceiverID = value;
	}

	/**
Payment amount. You must set the currencyID attribute to one of the three-character currency codes for any of the supported PayPal currencies. 
	 * Required
	 * You cannot mix currencies in a single MassPayRequest. A single request must include items that are of the same currency.
	 *
	 * @Required
	 */
	private BasicAmountType Amount;
	public BasicAmountType getAmount() {
		return Amount;
	}
	public void setAmount(BasicAmountType value) {
		this.Amount = value;
	}

	/**
Transaction-specific identification number for tracking in an accounting system. 
	 * Optional
	 * Character length and limitations: 30 single-byte characters. No whitespace allowed.
	 */
	private String UniqueId;
	public String getUniqueId() {
		return UniqueId;
	}
	public void setUniqueId(String value) {
		this.UniqueId = value;
	}

	/**
Custom note for each recipient. 
	 * Optional
	 * Character length and limitations: 4,000 single-byte alphanumeric characters
	 */
	private String Note;
	public String getNote() {
		return Note;
	}
	public void setNote(String value) {
		this.Note = value;
	}


	public MassPayRequestItemType(BasicAmountType Amount) {
		this.Amount = Amount;
	}
	public MassPayRequestItemType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ReceiverEmail != null ) {
			sb.append("<urn:ReceiverEmail>").append(ReceiverEmail);
			sb.append("</urn:ReceiverEmail>");
		}
		if( ReceiverPhone != null ) {
			sb.append("<urn:ReceiverPhone>").append(ReceiverPhone);
			sb.append("</urn:ReceiverPhone>");
		}
		if( ReceiverID != null ) {
			sb.append("<urn:ReceiverID>").append(ReceiverID);
			sb.append("</urn:ReceiverID>");
		}
		if( Amount != null ) {
			sb.append("<urn:Amount ");
			sb.append(Amount.toXMLString());
			sb.append("</urn:Amount>");
		}
		if( UniqueId != null ) {
			sb.append("<urn:UniqueId>").append(UniqueId);
			sb.append("</urn:UniqueId>");
		}
		if( Note != null ) {
			sb.append("<urn:Note>").append(Note);
			sb.append("</urn:Note>");
		}
		return sb.toString();
	}

}
