package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.CoupleType;
import java.util.List;
import java.util.ArrayList;
import com.paypal.core.SDKUtil;

/**
 * Defines relationship between buckets 
 */
public class CoupledBucketsType{


	/**
	 * Relationship Type - LifeTime (default) 	 
	 */ 
	private CoupleType CoupleType;

	/**
	 * Identifier for this relation 	 
	 */ 
	private String CoupledPaymentRequestID;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private List<String> PaymentRequestID = new ArrayList<String>();

	

	/**
	 * Constructor with arguments
	 */
	public CoupledBucketsType (List<String> PaymentRequestID){
		this.PaymentRequestID = PaymentRequestID;
	}	

	/**
	 * Default Constructor
	 */
	public CoupledBucketsType (){
	}	

	/**
	 * Getter for CoupleType
	 */
	 public CoupleType getCoupleType() {
	 	return CoupleType;
	 }
	 
	/**
	 * Setter for CoupleType
	 */
	 public void setCoupleType(CoupleType CoupleType) {
	 	this.CoupleType = CoupleType;
	 }
	 
	/**
	 * Getter for CoupledPaymentRequestID
	 */
	 public String getCoupledPaymentRequestID() {
	 	return CoupledPaymentRequestID;
	 }
	 
	/**
	 * Setter for CoupledPaymentRequestID
	 */
	 public void setCoupledPaymentRequestID(String CoupledPaymentRequestID) {
	 	this.CoupledPaymentRequestID = CoupledPaymentRequestID;
	 }
	 
	/**
	 * Getter for PaymentRequestID
	 */
	 public List<String> getPaymentRequestID() {
	 	return PaymentRequestID;
	 }
	 
	/**
	 * Setter for PaymentRequestID
	 */
	 public void setPaymentRequestID(List<String> PaymentRequestID) {
	 	this.PaymentRequestID = PaymentRequestID;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(CoupleType != null) {
			sb.append("<ebl:CoupleType>").append(SDKUtil.escapeInvalidXmlCharsRegex(CoupleType.getValue()));
			sb.append("</ebl:CoupleType>");
		}
		if(CoupledPaymentRequestID != null) {
			sb.append("<ebl:CoupledPaymentRequestID>").append(SDKUtil.escapeInvalidXmlCharsRegex(CoupledPaymentRequestID));
			sb.append("</ebl:CoupledPaymentRequestID>");
		}
		if(PaymentRequestID != null) {
			for(int i=0; i < PaymentRequestID.size(); i++) {
				sb.append("<ebl:PaymentRequestID>").append(SDKUtil.escapeInvalidXmlCharsRegex(PaymentRequestID.get(i)));
				sb.append("</ebl:PaymentRequestID>");
			}
		}
		return sb.toString();
	}

}