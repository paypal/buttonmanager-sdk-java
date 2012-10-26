package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ReceiverInfoCodeType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.api.PayPalAPI.MassPayRequestItemType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * Subject line of the email sent to all recipients. This
 * subject is not contained in the input file; you must create
 * it with your application. Optional Character length and
 * limitations: 255 single-byte alphanumeric characters 
 */
public class MassPayRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * Subject line of the email sent to all recipients. This
	 * subject is not contained in the input file; you must create
	 * it with your application. Optional Character length and
	 * limitations: 255 single-byte alphanumeric characters	 
	 */ 
	private String emailSubject;

	/**
	 * Indicates how you identify the recipients of payments in all
	 * MassPayItems: either by EmailAddress (ReceiverEmail in
	 * MassPayItem), PhoneNumber (ReceiverPhone in MassPayItem), or
	 * by UserID (ReceiverID in MassPayItem). Required. You must
	 * specify one or the other of EmailAddress or UserID.	 
	 */ 
	private ReceiverInfoCodeType receiverType;

	/**
	 * Known as BN code, to track the partner referred merchant
	 * transactions. OptionalCharacter length and limitations: 32
	 * single-byte alphanumeric characters	 
	 */ 
	private String buttonSource;

	/**
	 * Details of each payment. A single MassPayRequest can include
	 * up to 250 MassPayItems. Required 	  
	 *@Required	 
	 */ 
	private List<MassPayRequestItemType> massPayItem = new ArrayList<MassPayRequestItemType>();

	

	/**
	 * Constructor with arguments
	 */
	public MassPayRequestType (List<MassPayRequestItemType> massPayItem){
		this.massPayItem = massPayItem;
	}	

	/**
	 * Default Constructor
	 */
	public MassPayRequestType (){
	}	

	/**
	 * Getter for emailSubject
	 */
	 public String getEmailSubject() {
	 	return emailSubject;
	 }
	 
	/**
	 * Setter for emailSubject
	 */
	 public void setEmailSubject(String emailSubject) {
	 	this.emailSubject = emailSubject;
	 }
	 
	/**
	 * Getter for receiverType
	 */
	 public ReceiverInfoCodeType getReceiverType() {
	 	return receiverType;
	 }
	 
	/**
	 * Setter for receiverType
	 */
	 public void setReceiverType(ReceiverInfoCodeType receiverType) {
	 	this.receiverType = receiverType;
	 }
	 
	/**
	 * Getter for buttonSource
	 */
	 public String getButtonSource() {
	 	return buttonSource;
	 }
	 
	/**
	 * Setter for buttonSource
	 */
	 public void setButtonSource(String buttonSource) {
	 	this.buttonSource = buttonSource;
	 }
	 
	/**
	 * Getter for massPayItem
	 */
	 public List<MassPayRequestItemType> getMassPayItem() {
	 	return massPayItem;
	 }
	 
	/**
	 * Setter for massPayItem
	 */
	 public void setMassPayItem(List<MassPayRequestItemType> massPayItem) {
	 	this.massPayItem = massPayItem;
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
		sb.append(super.toXMLString(prefix, null));
		if(emailSubject != null) {
			sb.append("<").append(preferredPrefix).append(":EmailSubject>").append(SDKUtil.escapeInvalidXmlCharsRegex(emailSubject));
			sb.append("</").append(preferredPrefix).append(":EmailSubject>");
		}
		if(receiverType != null) {
			sb.append("<").append(preferredPrefix).append(":ReceiverType>").append(SDKUtil.escapeInvalidXmlCharsRegex(receiverType.getValue()));
			sb.append("</").append(preferredPrefix).append(":ReceiverType>");
		}
		if(buttonSource != null) {
			sb.append("<").append(preferredPrefix).append(":ButtonSource>").append(SDKUtil.escapeInvalidXmlCharsRegex(buttonSource));
			sb.append("</").append(preferredPrefix).append(":ButtonSource>");
		}
		if(massPayItem != null) {
			for(int i=0; i < massPayItem.size(); i++) {
				sb.append(massPayItem.get(i).toXMLString(preferredPrefix,"MassPayItem"));
			}
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