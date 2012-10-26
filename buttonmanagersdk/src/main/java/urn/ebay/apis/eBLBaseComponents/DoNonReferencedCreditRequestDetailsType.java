package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.CreditCardDetailsType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoNonReferencedCreditRequestDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private BasicAmountType amount;

	/**
	 * 	 
	 */ 
	private BasicAmountType netAmount;

	/**
	 * 	 
	 */ 
	private BasicAmountType taxAmount;

	/**
	 * 	 
	 */ 
	private BasicAmountType shippingAmount;

	/**
	 * 	 
	 */ 
	private CreditCardDetailsType creditCard;

	/**
	 * 	 
	 */ 
	private String receiverEmail;

	/**
	 * 	 
	 */ 
	private String comment;

	

	/**
	 * Default Constructor
	 */
	public DoNonReferencedCreditRequestDetailsType (){
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
	 * Getter for netAmount
	 */
	 public BasicAmountType getNetAmount() {
	 	return netAmount;
	 }
	 
	/**
	 * Setter for netAmount
	 */
	 public void setNetAmount(BasicAmountType netAmount) {
	 	this.netAmount = netAmount;
	 }
	 
	/**
	 * Getter for taxAmount
	 */
	 public BasicAmountType getTaxAmount() {
	 	return taxAmount;
	 }
	 
	/**
	 * Setter for taxAmount
	 */
	 public void setTaxAmount(BasicAmountType taxAmount) {
	 	this.taxAmount = taxAmount;
	 }
	 
	/**
	 * Getter for shippingAmount
	 */
	 public BasicAmountType getShippingAmount() {
	 	return shippingAmount;
	 }
	 
	/**
	 * Setter for shippingAmount
	 */
	 public void setShippingAmount(BasicAmountType shippingAmount) {
	 	this.shippingAmount = shippingAmount;
	 }
	 
	/**
	 * Getter for creditCard
	 */
	 public CreditCardDetailsType getCreditCard() {
	 	return creditCard;
	 }
	 
	/**
	 * Setter for creditCard
	 */
	 public void setCreditCard(CreditCardDetailsType creditCard) {
	 	this.creditCard = creditCard;
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
	 * Getter for comment
	 */
	 public String getComment() {
	 	return comment;
	 }
	 
	/**
	 * Setter for comment
	 */
	 public void setComment(String comment) {
	 	this.comment = comment;
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
		if(amount != null) {
			sb.append(amount.toXMLString(preferredPrefix,"Amount"));
		}
		if(netAmount != null) {
			sb.append(netAmount.toXMLString(preferredPrefix,"NetAmount"));
		}
		if(taxAmount != null) {
			sb.append(taxAmount.toXMLString(preferredPrefix,"TaxAmount"));
		}
		if(shippingAmount != null) {
			sb.append(shippingAmount.toXMLString(preferredPrefix,"ShippingAmount"));
		}
		if(creditCard != null) {
			sb.append(creditCard.toXMLString(preferredPrefix,"CreditCard"));
		}
		if(receiverEmail != null) {
			sb.append("<").append(preferredPrefix).append(":ReceiverEmail>").append(SDKUtil.escapeInvalidXmlCharsRegex(receiverEmail));
			sb.append("</").append(preferredPrefix).append(":ReceiverEmail>");
		}
		if(comment != null) {
			sb.append("<").append(preferredPrefix).append(":Comment>").append(SDKUtil.escapeInvalidXmlCharsRegex(comment));
			sb.append("</").append(preferredPrefix).append(":Comment>");
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