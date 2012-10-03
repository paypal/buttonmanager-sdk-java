package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  AverageTransactionPriceType
 * 
 *  Enumeration
 *  Meaning
 * 
 *  AverageTransactionPrice-Not-Applicable 
 * 
 *  AverageTransactionPrice-Range1
 *  Less than $25 USD
 * 
 *  AverageTransactionPrice-Range2
 *  $25 USD to $50 USD
 * 
 *  AverageTransactionPrice-Range3
 *  $50 USD to $100 USD
 * 
 *  AverageTransactionPrice-Range4
 *  $100 USD to $250 USD
 * 
 *  AverageTransactionPrice-Range5
 *  $250 USD to $500 USD
 * 
 *  AverageTransactionPrice-Range6
 *  $500 USD to $1,000 USD
 * 
 *  AverageTransactionPrice-Range7
 *  $1,000 USD to $2,000 USD
 * 
 *  AverageTransactionPrice-Range8
 *  $2,000 USD to $5,000 USD
 * 
 *  AverageTransactionPrice-Range9
 *  $5,000 USD to $10,000 USD
 * 
 *  AverageTransactionPrice-Range10
 *  More than $10,000 USD
 * 
 */
public enum  AverageTransactionPriceType {

	AVERAGETRANSACTIONPRICENOTAPPLICABLE("AverageTransactionPrice-Not-Applicable"),

	AVERAGETRANSACTIONPRICERANGE1("AverageTransactionPrice-Range1"),

	AVERAGETRANSACTIONPRICERANGE2("AverageTransactionPrice-Range2"),

	AVERAGETRANSACTIONPRICERANGE3("AverageTransactionPrice-Range3"),

	AVERAGETRANSACTIONPRICERANGE4("AverageTransactionPrice-Range4"),

	AVERAGETRANSACTIONPRICERANGE5("AverageTransactionPrice-Range5"),

	AVERAGETRANSACTIONPRICERANGE6("AverageTransactionPrice-Range6"),

	AVERAGETRANSACTIONPRICERANGE7("AverageTransactionPrice-Range7"),

	AVERAGETRANSACTIONPRICERANGE8("AverageTransactionPrice-Range8"),

	AVERAGETRANSACTIONPRICERANGE9("AverageTransactionPrice-Range9"),

	AVERAGETRANSACTIONPRICERANGE10("AverageTransactionPrice-Range10");

	private String value;

	private AverageTransactionPriceType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static AverageTransactionPriceType fromValue(String v) {
		for (AverageTransactionPriceType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}