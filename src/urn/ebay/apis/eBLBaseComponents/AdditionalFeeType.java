
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;


/**
 */
public class AdditionalFeeType {

	/**
	 */
	private String Type;
	public String getType() {
		return Type;
	}
	public void setType(String value) {
		this.Type = value;
	}

	/**
	 */
	private BasicAmountType Amount;
	public BasicAmountType getAmount() {
		return Amount;
	}
	public void setAmount(BasicAmountType value) {
		this.Amount = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( Type != null ) {
			sb.append("<ebl:Type>").append(Type);
			sb.append("</ebl:Type>");
		}
		if( Amount != null ) {
			sb.append("<ebl:Amount ");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		return sb.toString();
	}

}
