package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.CoupleType;
import java.util.List;
import java.util.ArrayList;
import com.paypal.core.SDKUtil;

/**
 * Defines relationship between buckets 
 */
public class CoupledBucketsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Relationship Type - LifeTime (default) 	 
	 */ 
	private CoupleType coupleType;

	/**
	 * Identifier for this relation 	 
	 */ 
	private String coupledPaymentRequestID;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private List<String> paymentRequestID = new ArrayList<String>();

	

	/**
	 * Constructor with arguments
	 */
	public CoupledBucketsType (List<String> paymentRequestID){
		this.paymentRequestID = paymentRequestID;
	}	

	/**
	 * Default Constructor
	 */
	public CoupledBucketsType (){
	}	

	/**
	 * Getter for coupleType
	 */
	 public CoupleType getCoupleType() {
	 	return coupleType;
	 }
	 
	/**
	 * Setter for coupleType
	 */
	 public void setCoupleType(CoupleType coupleType) {
	 	this.coupleType = coupleType;
	 }
	 
	/**
	 * Getter for coupledPaymentRequestID
	 */
	 public String getCoupledPaymentRequestID() {
	 	return coupledPaymentRequestID;
	 }
	 
	/**
	 * Setter for coupledPaymentRequestID
	 */
	 public void setCoupledPaymentRequestID(String coupledPaymentRequestID) {
	 	this.coupledPaymentRequestID = coupledPaymentRequestID;
	 }
	 
	/**
	 * Getter for paymentRequestID
	 */
	 public List<String> getPaymentRequestID() {
	 	return paymentRequestID;
	 }
	 
	/**
	 * Setter for paymentRequestID
	 */
	 public void setPaymentRequestID(List<String> paymentRequestID) {
	 	this.paymentRequestID = paymentRequestID;
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
		if(coupleType != null) {
			sb.append("<").append(preferredPrefix).append(":CoupleType>").append(SDKUtil.escapeInvalidXmlCharsRegex(coupleType.getValue()));
			sb.append("</").append(preferredPrefix).append(":CoupleType>");
		}
		if(coupledPaymentRequestID != null) {
			sb.append("<").append(preferredPrefix).append(":CoupledPaymentRequestID>").append(SDKUtil.escapeInvalidXmlCharsRegex(coupledPaymentRequestID));
			sb.append("</").append(preferredPrefix).append(":CoupledPaymentRequestID>");
		}
		if(paymentRequestID != null) {
			for(int i=0; i < paymentRequestID.size(); i++) {
				sb.append("<").append(preferredPrefix).append(":PaymentRequestID>").append(SDKUtil.escapeInvalidXmlCharsRegex(paymentRequestID.get(i)));
				sb.append("</").append(preferredPrefix).append(":PaymentRequestID>");
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