package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * The value of the authorizationâtransaction identification
 * number returned by a PayPal product. Required Character
 * length and limits: 19 single-byte characters maximum 
 */
public class UpdateAuthorizationRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * The value of the authorizationâtransaction identification
	 * number returned by a PayPal product. Required Character
	 * length and limits: 19 single-byte characters maximum 	  
	 *@Required	 
	 */ 
	private String transactionID;

	/**
	 * Shipping Address for this transaction. 	 
	 */ 
	private AddressType shipToAddress;

	/**
	 * IP Address of the buyer 	 
	 */ 
	private String iPAddress;

	/**
	 * A flag indicating that this transaction is a Ship to Store
	 * transaction. Optional 	 
	 */ 
	private String shipToStore;

	

	/**
	 * Constructor with arguments
	 */
	public UpdateAuthorizationRequestType (String transactionID){
		this.transactionID = transactionID;
	}	

	/**
	 * Default Constructor
	 */
	public UpdateAuthorizationRequestType (){
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
	 
	/**
	 * Getter for shipToAddress
	 */
	 public AddressType getShipToAddress() {
	 	return shipToAddress;
	 }
	 
	/**
	 * Setter for shipToAddress
	 */
	 public void setShipToAddress(AddressType shipToAddress) {
	 	this.shipToAddress = shipToAddress;
	 }
	 
	/**
	 * Getter for iPAddress
	 */
	 public String getIPAddress() {
	 	return iPAddress;
	 }
	 
	/**
	 * Setter for iPAddress
	 */
	 public void setIPAddress(String iPAddress) {
	 	this.iPAddress = iPAddress;
	 }
	 
	/**
	 * Getter for shipToStore
	 */
	 public String getShipToStore() {
	 	return shipToStore;
	 }
	 
	/**
	 * Setter for shipToStore
	 */
	 public void setShipToStore(String shipToStore) {
	 	this.shipToStore = shipToStore;
	 }
	 


	public String toXMLString(String prefix, String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		sb.append(super.toXMLString(prefix, null));
		if(transactionID != null) {
			sb.append("<").append(preferredPrefix).append(":TransactionID>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.transactionID));
			sb.append("</").append(preferredPrefix).append(":TransactionID>");
		}
		if(shipToAddress != null) {
			sb.append(shipToAddress.toXMLString(null,"ShipToAddress"));
		}
		if(iPAddress != null) {
			sb.append("<").append(preferredPrefix).append(":IPAddress>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.iPAddress));
			sb.append("</").append(preferredPrefix).append(":IPAddress>");
		}
		if(shipToStore != null) {
			sb.append("<").append(preferredPrefix).append(":ShipToStore>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.shipToStore));
			sb.append("</").append(preferredPrefix).append(":ShipToStore>");
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