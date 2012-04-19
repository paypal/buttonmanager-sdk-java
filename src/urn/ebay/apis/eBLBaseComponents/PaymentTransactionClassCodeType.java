/**
 * Auto generated code
 * PaymentTransactionClassCodeType 
 * The Type of PayPal payment.
 */
package urn.ebay.apis.eBLBaseComponents;

public enum PaymentTransactionClassCodeType {

 		ALL("All"),
 		SENT("Sent"),
 		RECEIVED("Received"),
 		MASSPAY("MassPay"),
 		MONEYREQUEST("MoneyRequest"),
 		FUNDSADDED("FundsAdded"),
 		FUNDSWITHDRAWN("FundsWithdrawn"),
 		PAYPALDEBITCARD("PayPalDebitCard"),
 		REFERRAL("Referral"),
 		FEE("Fee"),
 		SUBSCRIPTION("Subscription"),
 		DIVIDEND("Dividend"),
 		BILLPAY("Billpay"),
 		REFUND("Refund"),
 		CURRENCYCONVERSIONS("CurrencyConversions"),
 		BALANCETRANSFER("BalanceTransfer"),
 		REVERSAL("Reversal"),
 		SHIPPING("Shipping"),
 		BALANCEAFFECTING("BalanceAffecting"),
 		ECHECK("ECheck"),
		;
		private String value;
		PaymentTransactionClassCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static PaymentTransactionClassCodeType fromValue(String v) {
			for (PaymentTransactionClassCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
