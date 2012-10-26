package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * Defines which bucket or item that the incentive should be
 * applied to. 
 */
public class IncentiveApplyIndicationType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * The Bucket ID that the incentive is applied to. 	 
	 */ 
	private String paymentRequestID;

	/**
	 * The item that the incentive is applied to. 	 
	 */ 
	private String itemId;

	

	/**
	 * Default Constructor
	 */
	public IncentiveApplyIndicationType (){
	}	

	/**
	 * Getter for paymentRequestID
	 */
	 public String getPaymentRequestID() {
	 	return paymentRequestID;
	 }
	 
	/**
	 * Setter for paymentRequestID
	 */
	 public void setPaymentRequestID(String paymentRequestID) {
	 	this.paymentRequestID = paymentRequestID;
	 }
	 
	/**
	 * Getter for itemId
	 */
	 public String getItemId() {
	 	return itemId;
	 }
	 
	/**
	 * Setter for itemId
	 */
	 public void setItemId(String itemId) {
	 	this.itemId = itemId;
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
		if(paymentRequestID != null) {
			sb.append("<").append(preferredPrefix).append(":PaymentRequestID>").append(SDKUtil.escapeInvalidXmlCharsRegex(paymentRequestID));
			sb.append("</").append(preferredPrefix).append(":PaymentRequestID>");
		}
		if(itemId != null) {
			sb.append("<").append(preferredPrefix).append(":ItemId>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemId));
			sb.append("</").append(preferredPrefix).append(":ItemId>");
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