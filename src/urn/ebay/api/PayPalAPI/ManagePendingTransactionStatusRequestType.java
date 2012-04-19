
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.FMFPendingTransactionActionType;


/**
 */
public class ManagePendingTransactionStatusRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private String TransactionID;
	public String getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(String value) {
		this.TransactionID = value;
	}

	/**
	 *
	 * @Required
	 */
	private FMFPendingTransactionActionType Action;
	public FMFPendingTransactionActionType getAction() {
		return Action;
	}
	public void setAction(FMFPendingTransactionActionType value) {
		this.Action = value;
	}


	public ManagePendingTransactionStatusRequestType(String TransactionID, FMFPendingTransactionActionType Action) {
		this.TransactionID = TransactionID;
		this.Action = Action;
	}
	public ManagePendingTransactionStatusRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( TransactionID != null ) {
			sb.append("<urn:TransactionID>").append(TransactionID);
			sb.append("</urn:TransactionID>");
		}
		if( Action != null ) {
			sb.append("<urn:Action>").append( Action.getValue());
			sb.append("</urn:Action>");
		}
		return sb.toString();
	}

}
