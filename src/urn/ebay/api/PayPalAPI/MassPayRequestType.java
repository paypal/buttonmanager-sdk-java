package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ReceiverInfoCodeType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.api.PayPalAPI.MassPayRequestItemType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * Subject line of the email sent to all recipients. This
 * subject is not contained in the input file; you must create
 * it with your application. Optional Character length and
 * limitations: 255 single-byte alphanumeric characters 
 */
public class MassPayRequestType extends AbstractRequestType {


	/**
	 * Subject line of the email sent to all recipients. This
	 * subject is not contained in the input file; you must create
	 * it with your application. Optional Character length and
	 * limitations: 255 single-byte alphanumeric characters	 
	 */ 
	private String EmailSubject;

	/**
	 * Indicates how you identify the recipients of payments in all
	 * MassPayItems: either by EmailAddress (ReceiverEmail in
	 * MassPayItem), PhoneNumber (ReceiverPhone in MassPayItem), or
	 * by UserID (ReceiverID in MassPayItem). Required. You must
	 * specify one or the other of EmailAddress or UserID.	 
	 */ 
	private ReceiverInfoCodeType ReceiverType;

	/**
	 * Known as BN code, to track the partner referred merchant
	 * transactions. OptionalCharacter length and limitations: 32
	 * single-byte alphanumeric characters	 
	 */ 
	private String ButtonSource;

	/**
	 * Details of each payment. A single MassPayRequest can include
	 * up to 250 MassPayItems. Required 	  
	 *@Required	 
	 */ 
	private List<MassPayRequestItemType> MassPayItem = new ArrayList<MassPayRequestItemType>();

	

	/**
	 * Constructor with arguments
	 */
	public MassPayRequestType (List<MassPayRequestItemType> MassPayItem){
		this.MassPayItem = MassPayItem;
	}	

	/**
	 * Default Constructor
	 */
	public MassPayRequestType (){
	}	

	/**
	 * Getter for EmailSubject
	 */
	 public String getEmailSubject() {
	 	return EmailSubject;
	 }
	 
	/**
	 * Setter for EmailSubject
	 */
	 public void setEmailSubject(String EmailSubject) {
	 	this.EmailSubject = EmailSubject;
	 }
	 
	/**
	 * Getter for ReceiverType
	 */
	 public ReceiverInfoCodeType getReceiverType() {
	 	return ReceiverType;
	 }
	 
	/**
	 * Setter for ReceiverType
	 */
	 public void setReceiverType(ReceiverInfoCodeType ReceiverType) {
	 	this.ReceiverType = ReceiverType;
	 }
	 
	/**
	 * Getter for ButtonSource
	 */
	 public String getButtonSource() {
	 	return ButtonSource;
	 }
	 
	/**
	 * Setter for ButtonSource
	 */
	 public void setButtonSource(String ButtonSource) {
	 	this.ButtonSource = ButtonSource;
	 }
	 
	/**
	 * Getter for MassPayItem
	 */
	 public List<MassPayRequestItemType> getMassPayItem() {
	 	return MassPayItem;
	 }
	 
	/**
	 * Setter for MassPayItem
	 */
	 public void setMassPayItem(List<MassPayRequestItemType> MassPayItem) {
	 	this.MassPayItem = MassPayItem;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(EmailSubject != null) {
			sb.append("<urn:EmailSubject>").append(EmailSubject);
			sb.append("</urn:EmailSubject>");
		}
		if(ReceiverType != null) {
			sb.append("<urn:ReceiverType>").append(ReceiverType.getValue());
			sb.append("</urn:ReceiverType>");
		}
		if(ButtonSource != null) {
			sb.append("<urn:ButtonSource>").append(ButtonSource);
			sb.append("</urn:ButtonSource>");
		}
		if(MassPayItem != null) {
			for(int i=0; i < MassPayItem.size(); i++) {
				sb.append("<urn:MassPayItem>");
				sb.append(MassPayItem.get(i).toXMLString());
				sb.append("</urn:MassPayItem>");
			}
		}
		return sb.toString();
	}

}