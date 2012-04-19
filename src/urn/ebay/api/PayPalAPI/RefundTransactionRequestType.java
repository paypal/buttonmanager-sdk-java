
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import java.util.ArrayList;
import java.util.List;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.InvoiceItemType;
import urn.ebay.apis.eBLBaseComponents.MerchantStoreDetailsType;
import urn.ebay.apis.eBLBaseComponents.RefundSourceCodeType;
import urn.ebay.apis.eBLBaseComponents.RefundType;


/**
 * Unique identifier of the  transaction you are refunding.
 * Required
 * Character length and limitations: 17 single-byte alphanumeric characters 
 */
public class RefundTransactionRequestType extends AbstractRequestType{

	/**
Unique identifier of the  transaction you are refunding.
	 * Required
	 * Character length and limitations: 17 single-byte alphanumeric characters 
	 */
	private String TransactionID;
	public String getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(String value) {
		this.TransactionID = value;
	}

	/**
Invoice number corresponding to transaction details for tracking the refund of a payment. This parameter is passed by the merchant or recipient while refunding the transaction. This parameter does not affect the business logic, it is persisted in the DB for transaction reference
	 * Optional
	 */
	private String InvoiceID;
	public String getInvoiceID() {
		return InvoiceID;
	}
	public void setInvoiceID(String value) {
		this.InvoiceID = value;
	}

	/**
Type of refund you are making
	 * Required
	 */
	private RefundType RefundType;
	public RefundType getRefundType() {
		return RefundType;
	}
	public void setRefundType(RefundType value) {
		this.RefundType = value;
	}

	/**
Refund amount. 
	 * Amount is required  if RefundType is Partial.
	 * NOTE: If RefundType is Full, do not set Amount.
	 */
	private BasicAmountType Amount;
	public BasicAmountType getAmount() {
		return Amount;
	}
	public void setAmount(BasicAmountType value) {
		this.Amount = value;
	}

	/**
Custom memo about the refund. 
	 * Optional
	 * Character length and limitations: 255 single-byte alphanumeric characters
	 */
	private String Memo;
	public String getMemo() {
		return Memo;
	}
	public void setMemo(String value) {
		this.Memo = value;
	}

	/**
The maximum time till which refund must be tried.
	 * Optional
	 */
	private String RetryUntil;
	public String getRetryUntil() {
		return RetryUntil;
	}
	public void setRetryUntil(String value) {
		this.RetryUntil = value;
	}

	/**
The type of funding source for refund.
	 * Optional
	 */
	private RefundSourceCodeType RefundSource;
	public RefundSourceCodeType getRefundSource() {
		return RefundSource;
	}
	public void setRefundSource(RefundSourceCodeType value) {
		this.RefundSource = value;
	}

	/**
Flag to indicate that the customer was already given store credit for a given transaction. This will allow us to make sure we do not double refund.
	 * Optional
	 */
	private Boolean RefundAdvice;
	public Boolean getRefundAdvice() {
		return RefundAdvice;
	}
	public void setRefundAdvice(Boolean value) {
		this.RefundAdvice = value;
	}

	/**
To pass the Merchant store informationOptional
	 */
	private MerchantStoreDetailsType MerchantStoreDetails;
	public MerchantStoreDetailsType getMerchantStoreDetails() {
		return MerchantStoreDetails;
	}
	public void setMerchantStoreDetails(MerchantStoreDetailsType value) {
		this.MerchantStoreDetails = value;
	}

	/**
Information about the individual details of the items to be refunded.Optional
	 */
	private List<InvoiceItemType> RefundItemDetails = new ArrayList<InvoiceItemType>();
	public List<InvoiceItemType> getRefundItemDetails() {
		return RefundItemDetails;
	}
	public void setRefundItemDetails(List<InvoiceItemType> value) {
		this.RefundItemDetails = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( TransactionID != null ) {
			sb.append("<urn:TransactionID>").append(TransactionID);
			sb.append("</urn:TransactionID>");
		}
		if( InvoiceID != null ) {
			sb.append("<urn:InvoiceID>").append(InvoiceID);
			sb.append("</urn:InvoiceID>");
		}
		if( RefundType != null ) {
			sb.append("<urn:RefundType>").append( RefundType.getValue());
			sb.append("</urn:RefundType>");
		}
		if( Amount != null ) {
			sb.append("<urn:Amount ");
			sb.append(Amount.toXMLString());
			sb.append("</urn:Amount>");
		}
		if( Memo != null ) {
			sb.append("<urn:Memo>").append(Memo);
			sb.append("</urn:Memo>");
		}
		if( RetryUntil != null ) {
			sb.append("<urn:RetryUntil>").append(RetryUntil);
			sb.append("</urn:RetryUntil>");
		}
		if( RefundSource != null ) {
			sb.append("<urn:RefundSource>").append( RefundSource.getValue());
			sb.append("</urn:RefundSource>");
		}
		if( RefundAdvice != null ) {
			sb.append("<urn:RefundAdvice>").append(RefundAdvice);
			sb.append("</urn:RefundAdvice>");
		}
		if( MerchantStoreDetails != null ) {
			sb.append("<ebl:MerchantStoreDetails>");
			sb.append(MerchantStoreDetails.toXMLString());
			sb.append("</ebl:MerchantStoreDetails>");
		}
		if( RefundItemDetails != null ) {
			for(int i=0; i<RefundItemDetails.size(); i++) {
				sb.append("<ebl:RefundItemDetails>");
				sb.append(RefundItemDetails.get(i).toXMLString());
				sb.append("</ebl:RefundItemDetails>");
			}
		}
		return sb.toString();
	}

}
