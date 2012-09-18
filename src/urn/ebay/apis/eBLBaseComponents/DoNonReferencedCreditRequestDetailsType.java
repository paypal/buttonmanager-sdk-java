package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.CreditCardDetailsType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoNonReferencedCreditRequestDetailsType{


	/**
	 * 	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * 	 
	 */ 
	private BasicAmountType NetAmount;

	/**
	 * 	 
	 */ 
	private BasicAmountType TaxAmount;

	/**
	 * 	 
	 */ 
	private BasicAmountType ShippingAmount;

	/**
	 * 	 
	 */ 
	private CreditCardDetailsType CreditCard;

	/**
	 * 	 
	 */ 
	private String ReceiverEmail;

	/**
	 * 	 
	 */ 
	private String Comment;

	

	/**
	 * Default Constructor
	 */
	public DoNonReferencedCreditRequestDetailsType (){
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
	 * Getter for NetAmount
	 */
	 public BasicAmountType getNetAmount() {
	 	return NetAmount;
	 }
	 
	/**
	 * Setter for NetAmount
	 */
	 public void setNetAmount(BasicAmountType NetAmount) {
	 	this.NetAmount = NetAmount;
	 }
	 
	/**
	 * Getter for TaxAmount
	 */
	 public BasicAmountType getTaxAmount() {
	 	return TaxAmount;
	 }
	 
	/**
	 * Setter for TaxAmount
	 */
	 public void setTaxAmount(BasicAmountType TaxAmount) {
	 	this.TaxAmount = TaxAmount;
	 }
	 
	/**
	 * Getter for ShippingAmount
	 */
	 public BasicAmountType getShippingAmount() {
	 	return ShippingAmount;
	 }
	 
	/**
	 * Setter for ShippingAmount
	 */
	 public void setShippingAmount(BasicAmountType ShippingAmount) {
	 	this.ShippingAmount = ShippingAmount;
	 }
	 
	/**
	 * Getter for CreditCard
	 */
	 public CreditCardDetailsType getCreditCard() {
	 	return CreditCard;
	 }
	 
	/**
	 * Setter for CreditCard
	 */
	 public void setCreditCard(CreditCardDetailsType CreditCard) {
	 	this.CreditCard = CreditCard;
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
	 * Getter for Comment
	 */
	 public String getComment() {
	 	return Comment;
	 }
	 
	/**
	 * Setter for Comment
	 */
	 public void setComment(String Comment) {
	 	this.Comment = Comment;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Amount != null) {
			sb.append("<ebl:Amount");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		if(NetAmount != null) {
			sb.append("<ebl:NetAmount");
			sb.append(NetAmount.toXMLString());
			sb.append("</ebl:NetAmount>");
		}
		if(TaxAmount != null) {
			sb.append("<ebl:TaxAmount");
			sb.append(TaxAmount.toXMLString());
			sb.append("</ebl:TaxAmount>");
		}
		if(ShippingAmount != null) {
			sb.append("<ebl:ShippingAmount");
			sb.append(ShippingAmount.toXMLString());
			sb.append("</ebl:ShippingAmount>");
		}
		if(CreditCard != null) {
			sb.append("<ebl:CreditCard>");
			sb.append(CreditCard.toXMLString());
			sb.append("</ebl:CreditCard>");
		}
		if(ReceiverEmail != null) {
			sb.append("<ebl:ReceiverEmail>").append(SDKUtil.escapeInvalidXmlCharsRegex(ReceiverEmail));
			sb.append("</ebl:ReceiverEmail>");
		}
		if(Comment != null) {
			sb.append("<ebl:Comment>").append(SDKUtil.escapeInvalidXmlCharsRegex(Comment));
			sb.append("</ebl:Comment>");
		}
		return sb.toString();
	}

}