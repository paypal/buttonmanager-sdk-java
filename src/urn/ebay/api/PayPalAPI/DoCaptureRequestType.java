
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.CompleteCodeType;
import urn.ebay.apis.eBLBaseComponents.EnhancedDataType;
import urn.ebay.apis.eBLBaseComponents.MerchantStoreDetailsType;


/**
 * The authorization identification number of the payment you want to capture. 
 * Required
 * Character length and limits: 19 single-byte characters maximum
 */
public class DoCaptureRequestType extends AbstractRequestType{

	/**
The authorization identification number of the payment you want to capture. 
	 * Required
	 * Character length and limits: 19 single-byte characters maximum
	 *
	 * @Required
	 */
	private String AuthorizationID;
	public String getAuthorizationID() {
		return AuthorizationID;
	}
	public void setAuthorizationID(String value) {
		this.AuthorizationID = value;
	}

	/**
Amount to authorize. You must set the currencyID attribute to USD. 
	 * Required
	 * Limitations: Must not exceed $10,000 USD in any currency. No currency symbol. Decimal separator must be a period (.), and the thousands separator must be a comma (,)
	 *
	 * @Required
	 */
	private BasicAmountType Amount;
	public BasicAmountType getAmount() {
		return Amount;
	}
	public void setAmount(BasicAmountType value) {
		this.Amount = value;
	}

	/**
Indicates if this capture is the last capture you intend to make. The default is Complete. If CompleteType is Complete, any remaining amount of the original reauthorized transaction is automatically voided. 
	 * Required
	 * Character length and limits: 12 single-byte alphanumeric characters
	 *
	 * @Required
	 */
	private CompleteCodeType CompleteType;
	public CompleteCodeType getCompleteType() {
		return CompleteType;
	}
	public void setCompleteType(CompleteCodeType value) {
		this.CompleteType = value;
	}

	/**
An informational note about this settlement that is displayed to the payer in email and in  transaction history. 
	 * Optional
	 * Character length and limits: 255 single-byte characters
	 */
	private String Note;
	public String getNote() {
		return Note;
	}
	public void setNote(String value) {
		this.Note = value;
	}

	/**
Your invoice number or other identification number. 
	 * The InvoiceID value is recorded only if the authorization you are capturing is an order authorization, not a basic authorization.
	 * Optional
	 * Character length and limits: 127 single-byte alphanumeric characters
	 */
	private String InvoiceID;
	public String getInvoiceID() {
		return InvoiceID;
	}
	public void setInvoiceID(String value) {
		this.InvoiceID = value;
	}

	/**
Contains enhanced data like airline itinerary information.
	 * Not Required
	 */
	private EnhancedDataType EnhancedData;
	public EnhancedDataType getEnhancedData() {
		return EnhancedData;
	}
	public void setEnhancedData(EnhancedDataType value) {
		this.EnhancedData = value;
	}

	/**
dynamic descriptor
	 * Dynamic descriptor is used for merchant to provide detail of a transaction appears on statement
	 * Optional
	 * Character length and limits: <18 characters alphanumeric characters
	 */
	private String Descriptor;
	public String getDescriptor() {
		return Descriptor;
	}
	public void setDescriptor(String value) {
		this.Descriptor = value;
	}

	/**
To pass the Merchant store informationOptional
	 */
	private MerchantStoreDetailsType MerchantStoreDetails;
	public MerchantStoreDetailsType getMerchantStoreDetails() {
		return MerchantStoreDetails;
	}
	public void setMerchantStoreDetails(MerchantStoreDetailsType value) {
		this.MerchantStoreDetails = value;
	}


	public DoCaptureRequestType(String AuthorizationID, BasicAmountType Amount, CompleteCodeType CompleteType) {
		this.AuthorizationID = AuthorizationID;
		this.Amount = Amount;
		this.CompleteType = CompleteType;
	}
	public DoCaptureRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( AuthorizationID != null ) {
			sb.append("<urn:AuthorizationID>").append(AuthorizationID);
			sb.append("</urn:AuthorizationID>");
		}
		if( Amount != null ) {
			sb.append("<urn:Amount ");
			sb.append(Amount.toXMLString());
			sb.append("</urn:Amount>");
		}
		if( CompleteType != null ) {
			sb.append("<urn:CompleteType>").append( CompleteType.getValue());
			sb.append("</urn:CompleteType>");
		}
		if( Note != null ) {
			sb.append("<urn:Note>").append(Note);
			sb.append("</urn:Note>");
		}
		if( InvoiceID != null ) {
			sb.append("<urn:InvoiceID>").append(InvoiceID);
			sb.append("</urn:InvoiceID>");
		}
		if( EnhancedData != null ) {
			sb.append("<ebl:EnhancedData>");
			sb.append(EnhancedData.toXMLString());
			sb.append("</ebl:EnhancedData>");
		}
		if( Descriptor != null ) {
			sb.append("<urn:Descriptor>").append(Descriptor);
			sb.append("</urn:Descriptor>");
		}
		if( MerchantStoreDetails != null ) {
			sb.append("<ebl:MerchantStoreDetails>");
			sb.append(MerchantStoreDetails.toXMLString());
			sb.append("</ebl:MerchantStoreDetails>");
		}
		return sb.toString();
	}

}
