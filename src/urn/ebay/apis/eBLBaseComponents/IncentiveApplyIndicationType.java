package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * Defines which bucket or item that the incentive should be
 * applied to. 
 */
public class IncentiveApplyIndicationType{


	/**
	 * The Bucket ID that the incentive is applied to. 	 
	 */ 
	private String PaymentRequestID;

	/**
	 * The item that the incentive is applied to. 	 
	 */ 
	private String ItemId;

	

	/**
	 * Default Constructor
	 */
	public IncentiveApplyIndicationType (){
	}	

	/**
	 * Getter for PaymentRequestID
	 */
	 public String getPaymentRequestID() {
	 	return PaymentRequestID;
	 }
	 
	/**
	 * Setter for PaymentRequestID
	 */
	 public void setPaymentRequestID(String PaymentRequestID) {
	 	this.PaymentRequestID = PaymentRequestID;
	 }
	 
	/**
	 * Getter for ItemId
	 */
	 public String getItemId() {
	 	return ItemId;
	 }
	 
	/**
	 * Setter for ItemId
	 */
	 public void setItemId(String ItemId) {
	 	this.ItemId = ItemId;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(PaymentRequestID != null) {
			sb.append("<ebl:PaymentRequestID>").append(SDKUtil.escapeInvalidXmlCharsRegex(PaymentRequestID));
			sb.append("</ebl:PaymentRequestID>");
		}
		if(ItemId != null) {
			sb.append("<ebl:ItemId>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemId));
			sb.append("</ebl:ItemId>");
		}
		return sb.toString();
	}


}