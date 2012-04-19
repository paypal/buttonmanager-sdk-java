
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;



/**
 * Defines which bucket or item that the incentive should be applied to.  
 */
public class IncentiveApplyIndicationType {

	/**
	 * The Bucket ID that the incentive is applied to.
	 */
	private String PaymentRequestID;
	public String getPaymentRequestID() {
		return PaymentRequestID;
	}
	public void setPaymentRequestID(String value) {
		this.PaymentRequestID = value;
	}

	/**
	 * The item that the incentive is applied to. 
	 */
	private String ItemId;
	public String getItemId() {
		return ItemId;
	}
	public void setItemId(String value) {
		this.ItemId = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( PaymentRequestID != null ) {
			sb.append("<ebl:PaymentRequestID>").append(PaymentRequestID);
			sb.append("</ebl:PaymentRequestID>");
		}
		if( ItemId != null ) {
			sb.append("<ebl:ItemId>").append(ItemId);
			sb.append("</ebl:ItemId>");
		}
		return sb.toString();
	}

}
