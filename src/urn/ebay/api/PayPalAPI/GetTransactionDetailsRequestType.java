
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


/**
Unique identifier of a transaction. 
 * Required
 * The details for some kinds of transactions cannot be retrieved with GetTransactionDetailsRequest. You cannot obtain details of bank transfer withdrawals, for example. 
 * Character length and limitations: 17 single-byte alphanumeric characters
 */
public class GetTransactionDetailsRequestType extends AbstractRequestType{

	/**
Unique identifier of a transaction. 
	 * Required
	 * The details for some kinds of transactions cannot be retrieved with GetTransactionDetailsRequest. You cannot obtain details of bank transfer withdrawals, for example. 
	 * Character length and limitations: 17 single-byte alphanumeric characters
	 */
	private String TransactionID;
	public String getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(String value) {
		this.TransactionID = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( TransactionID != null ) {
			sb.append("<urn:TransactionID>").append(TransactionID);
			sb.append("</urn:TransactionID>");
		}
		return sb.toString();
	}

}
