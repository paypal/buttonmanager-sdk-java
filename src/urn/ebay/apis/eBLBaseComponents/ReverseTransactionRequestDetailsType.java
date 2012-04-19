
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;



/**
 * Identifier of the transaction to reverse.
 * Required
 * Character length and limitations: 17 single-byte alphanumeric characters
 */
public class ReverseTransactionRequestDetailsType {

	/**
Identifier of the transaction to reverse.
	 * Required
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
		if( TransactionID != null ) {
			sb.append("<ebl:TransactionID>").append(TransactionID);
			sb.append("</ebl:TransactionID>");
		}
		return sb.toString();
	}

}
