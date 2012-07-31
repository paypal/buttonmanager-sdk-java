package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.FMFPendingTransactionActionType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * 
 */
public class ManagePendingTransactionStatusRequestType extends AbstractRequestType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private String TransactionID;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private FMFPendingTransactionActionType Action;

	

	/**
	 * Constructor with arguments
	 */
	public ManagePendingTransactionStatusRequestType (String TransactionID, FMFPendingTransactionActionType Action){
		this.TransactionID = TransactionID;
		this.Action = Action;
	}	

	/**
	 * Default Constructor
	 */
	public ManagePendingTransactionStatusRequestType (){
	}	

	/**
	 * Getter for TransactionID
	 */
	 public String getTransactionID() {
	 	return TransactionID;
	 }
	 
	/**
	 * Setter for TransactionID
	 */
	 public void setTransactionID(String TransactionID) {
	 	this.TransactionID = TransactionID;
	 }
	 
	/**
	 * Getter for Action
	 */
	 public FMFPendingTransactionActionType getAction() {
	 	return Action;
	 }
	 
	/**
	 * Setter for Action
	 */
	 public void setAction(FMFPendingTransactionActionType Action) {
	 	this.Action = Action;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(TransactionID != null) {
			sb.append("<urn:TransactionID>").append(TransactionID);
			sb.append("</urn:TransactionID>");
		}
		if(Action != null) {
			sb.append("<urn:Action>").append(Action.getValue());
			sb.append("</urn:Action>");
		}
		return sb.toString();
	}

}