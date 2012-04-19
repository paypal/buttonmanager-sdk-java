
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.DoReferenceTransactionRequestDetailsType;


/**
 * This flag indicates that the response should include FMFDetails
 */
public class DoReferenceTransactionRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private DoReferenceTransactionRequestDetailsType DoReferenceTransactionRequestDetails;
	public DoReferenceTransactionRequestDetailsType getDoReferenceTransactionRequestDetails() {
		return DoReferenceTransactionRequestDetails;
	}
	public void setDoReferenceTransactionRequestDetails(DoReferenceTransactionRequestDetailsType value) {
		this.DoReferenceTransactionRequestDetails = value;
	}

	/**
This flag indicates that the response should include FMFDetails	 */
	private Integer ReturnFMFDetails;
	public Integer getReturnFMFDetails() {
		return ReturnFMFDetails;
	}
	public void setReturnFMFDetails(Integer value) {
		this.ReturnFMFDetails = value;
	}


	public DoReferenceTransactionRequestType(DoReferenceTransactionRequestDetailsType DoReferenceTransactionRequestDetails) {
		this.DoReferenceTransactionRequestDetails = DoReferenceTransactionRequestDetails;
	}
	public DoReferenceTransactionRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( DoReferenceTransactionRequestDetails != null ) {
			sb.append("<ebl:DoReferenceTransactionRequestDetails>");
			sb.append(DoReferenceTransactionRequestDetails.toXMLString());
			sb.append("</ebl:DoReferenceTransactionRequestDetails>");
		}
		if( ReturnFMFDetails != null ) {
			sb.append("<urn:ReturnFMFDetails>").append(ReturnFMFDetails);
			sb.append("</urn:ReturnFMFDetails>");
		}
		return sb.toString();
	}

}
