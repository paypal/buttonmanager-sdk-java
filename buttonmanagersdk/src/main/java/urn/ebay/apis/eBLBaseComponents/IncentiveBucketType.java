package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.IncentiveItemType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class IncentiveBucketType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private List<IncentiveItemType> items = new ArrayList<IncentiveItemType>();

	/**
	 * 	 
	 */ 
	private String bucketId;

	/**
	 * 	 
	 */ 
	private String sellerId;

	/**
	 * 	 
	 */ 
	private String externalSellerId;

	/**
	 * 	 
	 */ 
	private BasicAmountType bucketSubtotalAmt;

	/**
	 * 	 
	 */ 
	private BasicAmountType bucketShippingAmt;

	/**
	 * 	 
	 */ 
	private BasicAmountType bucketInsuranceAmt;

	/**
	 * 	 
	 */ 
	private BasicAmountType bucketSalesTaxAmt;

	/**
	 * 	 
	 */ 
	private BasicAmountType bucketTotalAmt;

	

	/**
	 * Default Constructor
	 */
	public IncentiveBucketType (){
	}	

	/**
	 * Getter for items
	 */
	 public List<IncentiveItemType> getItems() {
	 	return items;
	 }
	 
	/**
	 * Setter for items
	 */
	 public void setItems(List<IncentiveItemType> items) {
	 	this.items = items;
	 }
	 
	/**
	 * Getter for bucketId
	 */
	 public String getBucketId() {
	 	return bucketId;
	 }
	 
	/**
	 * Setter for bucketId
	 */
	 public void setBucketId(String bucketId) {
	 	this.bucketId = bucketId;
	 }
	 
	/**
	 * Getter for sellerId
	 */
	 public String getSellerId() {
	 	return sellerId;
	 }
	 
	/**
	 * Setter for sellerId
	 */
	 public void setSellerId(String sellerId) {
	 	this.sellerId = sellerId;
	 }
	 
	/**
	 * Getter for externalSellerId
	 */
	 public String getExternalSellerId() {
	 	return externalSellerId;
	 }
	 
	/**
	 * Setter for externalSellerId
	 */
	 public void setExternalSellerId(String externalSellerId) {
	 	this.externalSellerId = externalSellerId;
	 }
	 
	/**
	 * Getter for bucketSubtotalAmt
	 */
	 public BasicAmountType getBucketSubtotalAmt() {
	 	return bucketSubtotalAmt;
	 }
	 
	/**
	 * Setter for bucketSubtotalAmt
	 */
	 public void setBucketSubtotalAmt(BasicAmountType bucketSubtotalAmt) {
	 	this.bucketSubtotalAmt = bucketSubtotalAmt;
	 }
	 
	/**
	 * Getter for bucketShippingAmt
	 */
	 public BasicAmountType getBucketShippingAmt() {
	 	return bucketShippingAmt;
	 }
	 
	/**
	 * Setter for bucketShippingAmt
	 */
	 public void setBucketShippingAmt(BasicAmountType bucketShippingAmt) {
	 	this.bucketShippingAmt = bucketShippingAmt;
	 }
	 
	/**
	 * Getter for bucketInsuranceAmt
	 */
	 public BasicAmountType getBucketInsuranceAmt() {
	 	return bucketInsuranceAmt;
	 }
	 
	/**
	 * Setter for bucketInsuranceAmt
	 */
	 public void setBucketInsuranceAmt(BasicAmountType bucketInsuranceAmt) {
	 	this.bucketInsuranceAmt = bucketInsuranceAmt;
	 }
	 
	/**
	 * Getter for bucketSalesTaxAmt
	 */
	 public BasicAmountType getBucketSalesTaxAmt() {
	 	return bucketSalesTaxAmt;
	 }
	 
	/**
	 * Setter for bucketSalesTaxAmt
	 */
	 public void setBucketSalesTaxAmt(BasicAmountType bucketSalesTaxAmt) {
	 	this.bucketSalesTaxAmt = bucketSalesTaxAmt;
	 }
	 
	/**
	 * Getter for bucketTotalAmt
	 */
	 public BasicAmountType getBucketTotalAmt() {
	 	return bucketTotalAmt;
	 }
	 
	/**
	 * Setter for bucketTotalAmt
	 */
	 public void setBucketTotalAmt(BasicAmountType bucketTotalAmt) {
	 	this.bucketTotalAmt = bucketTotalAmt;
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
		if(items != null) {
			for(int i=0; i < items.size(); i++) {
				sb.append(items.get(i).toXMLString(preferredPrefix,"Items"));
			}
		}
		if(bucketId != null) {
			sb.append("<").append(preferredPrefix).append(":BucketId>").append(SDKUtil.escapeInvalidXmlCharsRegex(bucketId));
			sb.append("</").append(preferredPrefix).append(":BucketId>");
		}
		if(sellerId != null) {
			sb.append("<").append(preferredPrefix).append(":SellerId>").append(SDKUtil.escapeInvalidXmlCharsRegex(sellerId));
			sb.append("</").append(preferredPrefix).append(":SellerId>");
		}
		if(externalSellerId != null) {
			sb.append("<").append(preferredPrefix).append(":ExternalSellerId>").append(SDKUtil.escapeInvalidXmlCharsRegex(externalSellerId));
			sb.append("</").append(preferredPrefix).append(":ExternalSellerId>");
		}
		if(bucketSubtotalAmt != null) {
			sb.append(bucketSubtotalAmt.toXMLString(preferredPrefix,"BucketSubtotalAmt"));
		}
		if(bucketShippingAmt != null) {
			sb.append(bucketShippingAmt.toXMLString(preferredPrefix,"BucketShippingAmt"));
		}
		if(bucketInsuranceAmt != null) {
			sb.append(bucketInsuranceAmt.toXMLString(preferredPrefix,"BucketInsuranceAmt"));
		}
		if(bucketSalesTaxAmt != null) {
			sb.append(bucketSalesTaxAmt.toXMLString(preferredPrefix,"BucketSalesTaxAmt"));
		}
		if(bucketTotalAmt != null) {
			sb.append(bucketTotalAmt.toXMLString(preferredPrefix,"BucketTotalAmt"));
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