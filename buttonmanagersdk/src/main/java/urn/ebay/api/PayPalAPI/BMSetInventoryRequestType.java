package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ItemTrackingDetailsType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.OptionTrackingDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * Hosted Button ID of button you wish to change.  Required
 * Character length and limitations: 10 single-byte numeric
 * characters  
 */
public class BMSetInventoryRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * Hosted Button ID of button you wish to change.  Required
	 * Character length and limitations: 10 single-byte numeric
	 * characters 	  
	 *@Required	 
	 */ 
	private String hostedButtonID;

	/**
	 * Is Inventory tracked.  Required 0 or 1 	  
	 *@Required	 
	 */ 
	private String trackInv;

	/**
	 * Is PNL Tracked.  Required 0 or 1 	  
	 *@Required	 
	 */ 
	private String trackPnl;

	/**
	 * 	 
	 */ 
	private ItemTrackingDetailsType itemTrackingDetails;

	/**
	 * Option Index.  Optional Character length and limitations: 1
	 * single-byte alphanumeric characters 	 
	 */ 
	private String optionIndex;

	/**
	 * 	 
	 */ 
	private List<OptionTrackingDetailsType> optionTrackingDetails = new ArrayList<OptionTrackingDetailsType>();

	/**
	 * URL of page to display when an item is soldout.  Optional
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String soldoutURL;

	/**
	 * Whether to use the same digital download key repeatedly. 
	 * Optional 	 
	 */ 
	private String reuseDigitalDownloadKeys;

	/**
	 * Whether to append these keys to the list or not (replace). 
	 * Optional 	 
	 */ 
	private String appendDigitalDownloadKeys;

	/**
	 * Zero or more digital download keys to distribute to
	 * customers after transaction is completed.  Optional
	 * Character length and limitations: 1000 single-byte
	 * alphanumeric characters 	 
	 */ 
	private List<String> digitalDownloadKeys = new ArrayList<String>();

	

	/**
	 * Constructor with arguments
	 */
	public BMSetInventoryRequestType (String hostedButtonID, String trackInv, String trackPnl){
		this.hostedButtonID = hostedButtonID;
		this.trackInv = trackInv;
		this.trackPnl = trackPnl;
	}	

	/**
	 * Default Constructor
	 */
	public BMSetInventoryRequestType (){
	}	

	/**
	 * Getter for hostedButtonID
	 */
	 public String getHostedButtonID() {
	 	return hostedButtonID;
	 }
	 
	/**
	 * Setter for hostedButtonID
	 */
	 public void setHostedButtonID(String hostedButtonID) {
	 	this.hostedButtonID = hostedButtonID;
	 }
	 
	/**
	 * Getter for trackInv
	 */
	 public String getTrackInv() {
	 	return trackInv;
	 }
	 
	/**
	 * Setter for trackInv
	 */
	 public void setTrackInv(String trackInv) {
	 	this.trackInv = trackInv;
	 }
	 
	/**
	 * Getter for trackPnl
	 */
	 public String getTrackPnl() {
	 	return trackPnl;
	 }
	 
	/**
	 * Setter for trackPnl
	 */
	 public void setTrackPnl(String trackPnl) {
	 	this.trackPnl = trackPnl;
	 }
	 
	/**
	 * Getter for itemTrackingDetails
	 */
	 public ItemTrackingDetailsType getItemTrackingDetails() {
	 	return itemTrackingDetails;
	 }
	 
	/**
	 * Setter for itemTrackingDetails
	 */
	 public void setItemTrackingDetails(ItemTrackingDetailsType itemTrackingDetails) {
	 	this.itemTrackingDetails = itemTrackingDetails;
	 }
	 
	/**
	 * Getter for optionIndex
	 */
	 public String getOptionIndex() {
	 	return optionIndex;
	 }
	 
	/**
	 * Setter for optionIndex
	 */
	 public void setOptionIndex(String optionIndex) {
	 	this.optionIndex = optionIndex;
	 }
	 
	/**
	 * Getter for optionTrackingDetails
	 */
	 public List<OptionTrackingDetailsType> getOptionTrackingDetails() {
	 	return optionTrackingDetails;
	 }
	 
	/**
	 * Setter for optionTrackingDetails
	 */
	 public void setOptionTrackingDetails(List<OptionTrackingDetailsType> optionTrackingDetails) {
	 	this.optionTrackingDetails = optionTrackingDetails;
	 }
	 
	/**
	 * Getter for soldoutURL
	 */
	 public String getSoldoutURL() {
	 	return soldoutURL;
	 }
	 
	/**
	 * Setter for soldoutURL
	 */
	 public void setSoldoutURL(String soldoutURL) {
	 	this.soldoutURL = soldoutURL;
	 }
	 
	/**
	 * Getter for reuseDigitalDownloadKeys
	 */
	 public String getReuseDigitalDownloadKeys() {
	 	return reuseDigitalDownloadKeys;
	 }
	 
	/**
	 * Setter for reuseDigitalDownloadKeys
	 */
	 public void setReuseDigitalDownloadKeys(String reuseDigitalDownloadKeys) {
	 	this.reuseDigitalDownloadKeys = reuseDigitalDownloadKeys;
	 }
	 
	/**
	 * Getter for appendDigitalDownloadKeys
	 */
	 public String getAppendDigitalDownloadKeys() {
	 	return appendDigitalDownloadKeys;
	 }
	 
	/**
	 * Setter for appendDigitalDownloadKeys
	 */
	 public void setAppendDigitalDownloadKeys(String appendDigitalDownloadKeys) {
	 	this.appendDigitalDownloadKeys = appendDigitalDownloadKeys;
	 }
	 
	/**
	 * Getter for digitalDownloadKeys
	 */
	 public List<String> getDigitalDownloadKeys() {
	 	return digitalDownloadKeys;
	 }
	 
	/**
	 * Setter for digitalDownloadKeys
	 */
	 public void setDigitalDownloadKeys(List<String> digitalDownloadKeys) {
	 	this.digitalDownloadKeys = digitalDownloadKeys;
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
		if(hostedButtonID != null) {
			sb.append("<").append(preferredPrefix).append(":HostedButtonID>").append(SDKUtil.escapeInvalidXmlCharsRegex(hostedButtonID));
			sb.append("</").append(preferredPrefix).append(":HostedButtonID>");
		}
		if(trackInv != null) {
			sb.append("<").append(preferredPrefix).append(":TrackInv>").append(SDKUtil.escapeInvalidXmlCharsRegex(trackInv));
			sb.append("</").append(preferredPrefix).append(":TrackInv>");
		}
		if(trackPnl != null) {
			sb.append("<").append(preferredPrefix).append(":TrackPnl>").append(SDKUtil.escapeInvalidXmlCharsRegex(trackPnl));
			sb.append("</").append(preferredPrefix).append(":TrackPnl>");
		}
		if(itemTrackingDetails != null) {
			sb.append(itemTrackingDetails.toXMLString(null,"ItemTrackingDetails"));
		}
		if(optionIndex != null) {
			sb.append("<").append(preferredPrefix).append(":OptionIndex>").append(SDKUtil.escapeInvalidXmlCharsRegex(optionIndex));
			sb.append("</").append(preferredPrefix).append(":OptionIndex>");
		}
		if(optionTrackingDetails != null) {
			for(int i=0; i < optionTrackingDetails.size(); i++) {
				sb.append(optionTrackingDetails.get(i).toXMLString(null,"OptionTrackingDetails"));
			}
		}
		if(soldoutURL != null) {
			sb.append("<").append(preferredPrefix).append(":SoldoutURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(soldoutURL));
			sb.append("</").append(preferredPrefix).append(":SoldoutURL>");
		}
		if(reuseDigitalDownloadKeys != null) {
			sb.append("<").append(preferredPrefix).append(":ReuseDigitalDownloadKeys>").append(SDKUtil.escapeInvalidXmlCharsRegex(reuseDigitalDownloadKeys));
			sb.append("</").append(preferredPrefix).append(":ReuseDigitalDownloadKeys>");
		}
		if(appendDigitalDownloadKeys != null) {
			sb.append("<").append(preferredPrefix).append(":AppendDigitalDownloadKeys>").append(SDKUtil.escapeInvalidXmlCharsRegex(appendDigitalDownloadKeys));
			sb.append("</").append(preferredPrefix).append(":AppendDigitalDownloadKeys>");
		}
		if(digitalDownloadKeys != null) {
			for(int i=0; i < digitalDownloadKeys.size(); i++) {
				sb.append("<").append(preferredPrefix).append(":DigitalDownloadKeys>").append(SDKUtil.escapeInvalidXmlCharsRegex(digitalDownloadKeys.get(i)));
				sb.append("</").append(preferredPrefix).append(":DigitalDownloadKeys>");
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