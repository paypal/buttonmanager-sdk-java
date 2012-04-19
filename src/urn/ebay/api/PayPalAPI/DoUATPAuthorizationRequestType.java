
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.TransactionEntityType;
import urn.ebay.apis.eBLBaseComponents.UATPDetailsType;


/**
 * UATP card details
 * Required
 */
public class DoUATPAuthorizationRequestType extends AbstractRequestType{

	/**
UATP card details
	 * Required
	 *
	 * @Required
	 */
	private UATPDetailsType UATPDetails;
	public UATPDetailsType getUATPDetails() {
		return UATPDetails;
	}
	public void setUATPDetails(UATPDetailsType value) {
		this.UATPDetails = value;
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

	/**
	 * Invoice ID. A pass through.
	 */
	private String InvoiceID;
	public String getInvoiceID() {
		return InvoiceID;
	}
	public void setInvoiceID(String value) {
		this.InvoiceID = value;
	}


	public DoUATPAuthorizationRequestType(UATPDetailsType UATPDetails, BasicAmountType Amount) {
		this.UATPDetails = UATPDetails;
		this.Amount = Amount;
	}
	public DoUATPAuthorizationRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( UATPDetails != null ) {
			sb.append("<ebl:UATPDetails>");
			sb.append(UATPDetails.toXMLString());
			sb.append("</ebl:UATPDetails>");
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
		if( InvoiceID != null ) {
			sb.append("<urn:InvoiceID>").append(InvoiceID);
			sb.append("</urn:InvoiceID>");
		}
		return sb.toString();
	}

}
