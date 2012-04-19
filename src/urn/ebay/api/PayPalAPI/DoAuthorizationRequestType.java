
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.TransactionEntityType;


/**
 * The value of the order’s transaction identification number returned by a PayPal product. 
 * Required
 * Character length and limits: 19 single-byte characters maximum
 */
public class DoAuthorizationRequestType extends AbstractRequestType{

	/**
The value of the order’s transaction identification number returned by a PayPal product. 
	 * Required
	 * Character length and limits: 19 single-byte characters maximum
	 *
	 * @Required
	 */
	private String TransactionID;
	public String getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(String value) {
		this.TransactionID = value;
	}

	/**
Type of transaction to authorize. The only allowable value is Order, which means that the transaction represents a customer order that can be fulfilled over 29 days. 
	 * Optional
	 */
	private TransactionEntityType TransactionEntity;
	public TransactionEntityType getTransactionEntity() {
		return TransactionEntity;
	}
	public void setTransactionEntity(TransactionEntityType value) {
		this.TransactionEntity = value;
	}

	/**
Amount to authorize. 
	 * Required
	 * Limitations: Must not exceed $10,000 USD in any currency. No currency symbol. Decimal separator must be a period (.), and the thousands separator must be a comma (,).
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


	public DoAuthorizationRequestType(String TransactionID, BasicAmountType Amount) {
		this.TransactionID = TransactionID;
		this.Amount = Amount;
	}
	public DoAuthorizationRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( TransactionID != null ) {
			sb.append("<urn:TransactionID>").append(TransactionID);
			sb.append("</urn:TransactionID>");
		}
		if( TransactionEntity != null ) {
			sb.append("<urn:TransactionEntity>").append( TransactionEntity.getValue());
			sb.append("</urn:TransactionEntity>");
		}
		if( Amount != null ) {
			sb.append("<urn:Amount ");
			sb.append(Amount.toXMLString());
			sb.append("</urn:Amount>");
		}
		return sb.toString();
	}

}
