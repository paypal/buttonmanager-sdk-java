package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * Identifier of the transaction to reverse. Required Character
 * length and limitations: 17 single-byte alphanumeric
 * characters 
 */
public class ReverseTransactionRequestDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Identifier of the transaction to reverse. Required Character
	 * length and limitations: 17 single-byte alphanumeric
	 * characters 	 
	 */ 
	private String transactionID;

	

	/**
	 * Default Constructor
	 */
	public ReverseTransactionRequestDetailsType (){
	}	

	/**
	 * Getter for transactionID
	 */
	 public String getTransactionID() {
	 	return transactionID;
	 }
	 
	/**
	 * Setter for transactionID
	 */
	 public void setTransactionID(String transactionID) {
	 	this.transactionID = transactionID;
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
		if(transactionID != null) {
			sb.append("<").append(preferredPrefix).append(":TransactionID>").append(SDKUtil.escapeInvalidXmlCharsRegex(transactionID));
			sb.append("</").append(preferredPrefix).append(":TransactionID>");
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