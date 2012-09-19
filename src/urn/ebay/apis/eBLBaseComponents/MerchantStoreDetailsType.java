package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * Store IDOptional Character length and limits: 50 single-byte
 * characters 
 */
public class MerchantStoreDetailsType{


	/**
	 * Store IDOptional Character length and limits: 50 single-byte
	 * characters 	  
	 *@Required	 
	 */ 
	private String StoreID;

	/**
	 * Terminal IDOptional Character length and limits: 50
	 * single-byte characters 	 
	 */ 
	private String TerminalID;

	

	/**
	 * Constructor with arguments
	 */
	public MerchantStoreDetailsType (String StoreID){
		this.StoreID = StoreID;
	}	

	/**
	 * Default Constructor
	 */
	public MerchantStoreDetailsType (){
	}	

	/**
	 * Getter for StoreID
	 */
	 public String getStoreID() {
	 	return StoreID;
	 }
	 
	/**
	 * Setter for StoreID
	 */
	 public void setStoreID(String StoreID) {
	 	this.StoreID = StoreID;
	 }
	 
	/**
	 * Getter for TerminalID
	 */
	 public String getTerminalID() {
	 	return TerminalID;
	 }
	 
	/**
	 * Setter for TerminalID
	 */
	 public void setTerminalID(String TerminalID) {
	 	this.TerminalID = TerminalID;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(StoreID != null) {
			sb.append("<ebl:StoreID>").append(SDKUtil.escapeInvalidXmlCharsRegex(StoreID));
			sb.append("</ebl:StoreID>");
		}
		if(TerminalID != null) {
			sb.append("<ebl:TerminalID>").append(SDKUtil.escapeInvalidXmlCharsRegex(TerminalID));
			sb.append("</ebl:TerminalID>");
		}
		return sb.toString();
	}


}