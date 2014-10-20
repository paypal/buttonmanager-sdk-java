package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.BillingApprovalDetailsType;
import urn.ebay.apis.eBLBaseComponents.BuyerDetailType;
import urn.ebay.apis.eBLBaseComponents.InfoSharingDirectivesType;
import urn.ebay.apis.eBLBaseComponents.UserChannelCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsType;
import urn.ebay.apis.eBLBaseComponents.ExternalPartnerTrackingDetailsType;
import com.paypal.core.SDKUtil;

/**
 * Details about Billing Agreements requested to be created. 
 */
public class SetDataRequestType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Details about Billing Agreements requested to be created. 	 
	 */ 
	private List<BillingApprovalDetailsType> billingApprovalDetails = new ArrayList<BillingApprovalDetailsType>();

	/**
	 * Only needed if Auto Authorization is requested. The
	 * authentication session token will be passed in here. 	 
	 */ 
	private BuyerDetailType buyerDetail;

	/**
	 * Requests for specific buyer information like Billing Address
	 * to be returned through GetExpressCheckoutDetails should be
	 * specified under this. 	 
	 */ 
	private InfoSharingDirectivesType infoSharingDirectives;

	/**
	 * The value 1 indicates that you require to retrieve the
	 * customer's shipping address on file with PayPal. Any value
	 * other than 1 indicates that no such requirement. 	 
	 */ 
	private Boolean retrieveShippingAddress;

	/**
	 * the value is required by ACS team to specify the channel
	 * which the partners are in. the channel will be used for risk
	 * assessment the value is defined in
	 * biz/User/value_object/Channel.oml Optional 	 
	 */ 
	private UserChannelCodeType userChannel;

	/**
	 * The value 1 indicates that you require that the customer's
	 * shipping address on file with PayPal be a confirmed address.
	 * Any value other than 1 indicates that the customer's
	 * shipping address on file with PayPal need NOT be a confirmed
	 * address. Setting this element overrides the setting you have
	 * specified in the recipient's Merchant Account Profile.
	 * Optional 	 
	 */ 
	private Boolean reqConfirmShipping;

	/**
	 * Information about the payment. 	 
	 */ 
	private List<PaymentDetailsType> paymentDetails = new ArrayList<PaymentDetailsType>();

	/**
	 * An optional set of values related to tracking for external
	 * partner. 	 
	 */ 
	private ExternalPartnerTrackingDetailsType externalPartnerTrackingDetails;

	/**
	 * URI(uniform resource identifier), the source from which the
	 * request is initiated. 	 
	 */ 
	private String uRI;

	

	/**
	 * Default Constructor
	 */
	public SetDataRequestType (){
	}	

	/**
	 * Getter for billingApprovalDetails
	 */
	 public List<BillingApprovalDetailsType> getBillingApprovalDetails() {
	 	return billingApprovalDetails;
	 }
	 
	/**
	 * Setter for billingApprovalDetails
	 */
	 public void setBillingApprovalDetails(List<BillingApprovalDetailsType> billingApprovalDetails) {
	 	this.billingApprovalDetails = billingApprovalDetails;
	 }
	 
	/**
	 * Getter for buyerDetail
	 */
	 public BuyerDetailType getBuyerDetail() {
	 	return buyerDetail;
	 }
	 
	/**
	 * Setter for buyerDetail
	 */
	 public void setBuyerDetail(BuyerDetailType buyerDetail) {
	 	this.buyerDetail = buyerDetail;
	 }
	 
	/**
	 * Getter for infoSharingDirectives
	 */
	 public InfoSharingDirectivesType getInfoSharingDirectives() {
	 	return infoSharingDirectives;
	 }
	 
	/**
	 * Setter for infoSharingDirectives
	 */
	 public void setInfoSharingDirectives(InfoSharingDirectivesType infoSharingDirectives) {
	 	this.infoSharingDirectives = infoSharingDirectives;
	 }
	 
	/**
	 * Getter for retrieveShippingAddress
	 */
	 public Boolean getRetrieveShippingAddress() {
	 	return retrieveShippingAddress;
	 }
	 
	/**
	 * Setter for retrieveShippingAddress
	 */
	 public void setRetrieveShippingAddress(Boolean retrieveShippingAddress) {
	 	this.retrieveShippingAddress = retrieveShippingAddress;
	 }
	 
	/**
	 * Getter for userChannel
	 */
	 public UserChannelCodeType getUserChannel() {
	 	return userChannel;
	 }
	 
	/**
	 * Setter for userChannel
	 */
	 public void setUserChannel(UserChannelCodeType userChannel) {
	 	this.userChannel = userChannel;
	 }
	 
	/**
	 * Getter for reqConfirmShipping
	 */
	 public Boolean getReqConfirmShipping() {
	 	return reqConfirmShipping;
	 }
	 
	/**
	 * Setter for reqConfirmShipping
	 */
	 public void setReqConfirmShipping(Boolean reqConfirmShipping) {
	 	this.reqConfirmShipping = reqConfirmShipping;
	 }
	 
	/**
	 * Getter for paymentDetails
	 */
	 public List<PaymentDetailsType> getPaymentDetails() {
	 	return paymentDetails;
	 }
	 
	/**
	 * Setter for paymentDetails
	 */
	 public void setPaymentDetails(List<PaymentDetailsType> paymentDetails) {
	 	this.paymentDetails = paymentDetails;
	 }
	 
	/**
	 * Getter for externalPartnerTrackingDetails
	 */
	 public ExternalPartnerTrackingDetailsType getExternalPartnerTrackingDetails() {
	 	return externalPartnerTrackingDetails;
	 }
	 
	/**
	 * Setter for externalPartnerTrackingDetails
	 */
	 public void setExternalPartnerTrackingDetails(ExternalPartnerTrackingDetailsType externalPartnerTrackingDetails) {
	 	this.externalPartnerTrackingDetails = externalPartnerTrackingDetails;
	 }
	 
	/**
	 * Getter for uRI
	 */
	 public String getURI() {
	 	return uRI;
	 }
	 
	/**
	 * Setter for uRI
	 */
	 public void setURI(String uRI) {
	 	this.uRI = uRI;
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
		if(billingApprovalDetails != null) {
			for(int i=0; i < billingApprovalDetails.size(); i++) {
				sb.append(billingApprovalDetails.get(i).toXMLString(preferredPrefix,"BillingApprovalDetails"));
			}
		}
		if(buyerDetail != null) {
			sb.append(buyerDetail.toXMLString(preferredPrefix,"BuyerDetail"));
		}
		if(infoSharingDirectives != null) {
			sb.append(infoSharingDirectives.toXMLString(preferredPrefix,"InfoSharingDirectives"));
		}
		if(retrieveShippingAddress != null) {
			sb.append("<").append(preferredPrefix).append(":RetrieveShippingAddress>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.retrieveShippingAddress));
			sb.append("</").append(preferredPrefix).append(":RetrieveShippingAddress>");
		}
		if(userChannel != null) {
			sb.append("<").append(preferredPrefix).append(":UserChannel>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.userChannel.getValue()));
			sb.append("</").append(preferredPrefix).append(":UserChannel>");
		}
		if(reqConfirmShipping != null) {
			sb.append("<").append(preferredPrefix).append(":ReqConfirmShipping>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.reqConfirmShipping));
			sb.append("</").append(preferredPrefix).append(":ReqConfirmShipping>");
		}
		if(paymentDetails != null) {
			for(int i=0; i < paymentDetails.size(); i++) {
				sb.append(paymentDetails.get(i).toXMLString(preferredPrefix,"PaymentDetails"));
			}
		}
		if(externalPartnerTrackingDetails != null) {
			sb.append(externalPartnerTrackingDetails.toXMLString(preferredPrefix,"ExternalPartnerTrackingDetails"));
		}
		if(uRI != null) {
			sb.append("<").append(preferredPrefix).append(":URI>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.uRI));
			sb.append("</").append(preferredPrefix).append(":URI>");
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