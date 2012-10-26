package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * Store IDOptional Character length and limits: 50 single-byte
 * characters 
 */
public class MerchantStoreDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Store IDOptional Character length and limits: 50 single-byte
	 * characters 	  
	 *@Required	 
	 */ 
	private String storeID;

	/**
	 * Terminal IDOptional Character length and limits: 50
	 * single-byte characters 	 
	 */ 
	private String terminalID;

	

	/**
	 * Constructor with arguments
	 */
	public MerchantStoreDetailsType (String storeID){
		this.storeID = storeID;
	}	

	/**
	 * Default Constructor
	 */
	public MerchantStoreDetailsType (){
	}	

	/**
	 * Getter for storeID
	 */
	 public String getStoreID() {
	 	return storeID;
	 }
	 
	/**
	 * Setter for storeID
	 */
	 public void setStoreID(String storeID) {
	 	this.storeID = storeID;
	 }
	 
	/**
	 * Getter for terminalID
	 */
	 public String getTerminalID() {
	 	return terminalID;
	 }
	 
	/**
	 * Setter for terminalID
	 */
	 public void setTerminalID(String terminalID) {
	 	this.terminalID = terminalID;
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
		if(storeID != null) {
			sb.append("<").append(preferredPrefix).append(":StoreID>").append(SDKUtil.escapeInvalidXmlCharsRegex(storeID));
			sb.append("</").append(preferredPrefix).append(":StoreID>");
		}
		if(terminalID != null) {
			sb.append("<").append(preferredPrefix).append(":TerminalID>").append(SDKUtil.escapeInvalidXmlCharsRegex(terminalID));
			sb.append("</").append(preferredPrefix).append(":TerminalID>");
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