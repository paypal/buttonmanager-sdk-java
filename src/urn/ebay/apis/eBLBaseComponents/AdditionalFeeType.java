package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;

/**
 * 
 */
public class AdditionalFeeType{


	/**
	 * 	 
	 */ 
	private String Type;

	/**
	 * 	 
	 */ 
	private BasicAmountType Amount;

	

	/**
	 * Default Constructor
	 */
	public AdditionalFeeType (){
	}	

	/**
	 * Getter for Type
	 */
	 public String getType() {
	 	return Type;
	 }
	 
	/**
	 * Setter for Type
	 */
	 public void setType(String Type) {
	 	this.Type = Type;
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
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Type != null) {
			sb.append("<ebl:Type>").append(Type);
			sb.append("</ebl:Type>");
		}
		if(Amount != null) {
			sb.append("<ebl:Amount");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		return sb.toString();
	}

}