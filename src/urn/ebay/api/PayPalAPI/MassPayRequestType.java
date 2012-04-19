
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import java.util.ArrayList;
import java.util.List;
import urn.ebay.api.PayPalAPI.MassPayRequestItemType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.ReceiverInfoCodeType;


/**
 * Subject line of the email sent to all recipients. This subject is not contained in the input file; you must create it with your application. 
 * Optional
 * Character length and limitations: 255 single-byte alphanumeric characters
 */
public class MassPayRequestType extends AbstractRequestType{

	/**
Subject line of the email sent to all recipients. This subject is not contained in the input file; you must create it with your application. 
	 * Optional
	 * Character length and limitations: 255 single-byte alphanumeric characters
	 */
	private String EmailSubject;
	public String getEmailSubject() {
		return EmailSubject;
	}
	public void setEmailSubject(String value) {
		this.EmailSubject = value;
	}

	/**
Indicates how you identify the recipients of payments in all MassPayItems: either by EmailAddress (ReceiverEmail in MassPayItem), PhoneNumber (ReceiverPhone in MassPayItem), or by UserID (ReceiverID in MassPayItem). 
	 * Required. You must specify one or the other of EmailAddress or UserID.
	 */
	private ReceiverInfoCodeType ReceiverType;
	public ReceiverInfoCodeType getReceiverType() {
		return ReceiverType;
	}
	public void setReceiverType(ReceiverInfoCodeType value) {
		this.ReceiverType = value;
	}

	/**
Known as BN code, to track the partner referred merchant transactions. 
	 * Optional
	 * Character length and limitations: 32 single-byte alphanumeric characters
	 */
	private String ButtonSource;
	public String getButtonSource() {
		return ButtonSource;
	}
	public void setButtonSource(String value) {
		this.ButtonSource = value;
	}

	/**
Details of each payment. A single MassPayRequest can include up to 250 MassPayItems. 
	 * Required
	 *
	 * @Required
	 */
	private List<MassPayRequestItemType> MassPayItem = new ArrayList<MassPayRequestItemType>();
	public List<MassPayRequestItemType> getMassPayItem() {
		return MassPayItem;
	}
	public void setMassPayItem(List<MassPayRequestItemType> value) {
		this.MassPayItem = value;
	}


	public MassPayRequestType(List<MassPayRequestItemType> MassPayItem) {
		this.MassPayItem = MassPayItem;
	}
	public MassPayRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( EmailSubject != null ) {
			sb.append("<urn:EmailSubject>").append(EmailSubject);
			sb.append("</urn:EmailSubject>");
		}
		if( ReceiverType != null ) {
			sb.append("<urn:ReceiverType>").append( ReceiverType.getValue());
			sb.append("</urn:ReceiverType>");
		}
		if( ButtonSource != null ) {
			sb.append("<urn:ButtonSource>").append(ButtonSource);
			sb.append("</urn:ButtonSource>");
		}
		if( MassPayItem != null ) {
			for(int i=0; i<MassPayItem.size(); i++) {
				sb.append("<urn:MassPayItem>");
				sb.append(MassPayItem.get(i).toXMLString());
				sb.append("</urn:MassPayItem>");
			}
		}
		return sb.toString();
	}

}
