package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ItemTrackingDetailsType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.OptionTrackingDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * Hosted Button ID of button you wish to change.  Required
 * Character length and limitations: 10 single-byte numeric
 * characters  
 */
public class BMSetInventoryRequestType extends AbstractRequestType {


	/**
	 * Hosted Button ID of button you wish to change.  Required
	 * Character length and limitations: 10 single-byte numeric
	 * characters 	  
	 *@Required	 
	 */ 
	private String HostedButtonID;

	/**
	 * Is Inventory tracked.  Required 0 or 1 	  
	 *@Required	 
	 */ 
	private String TrackInv;

	/**
	 * Is PNL Tracked.  Required 0 or 1 	  
	 *@Required	 
	 */ 
	private String TrackPnl;

	/**
	 * No Document Comments	 
	 */ 
	private ItemTrackingDetailsType ItemTrackingDetails;

	/**
	 * Option Index.  Optional Character length and limitations: 1
	 * single-byte alphanumeric characters 	 
	 */ 
	private String OptionIndex;

	/**
	 * No Document Comments	 
	 */ 
	private List<OptionTrackingDetailsType> OptionTrackingDetails = new ArrayList<OptionTrackingDetailsType>();

	/**
	 * URL of page to display when an item is soldout.  Optional
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String SoldoutURL;

	/**
	 * Whether to use the same digital download key repeatedly. 
	 * Optional 	 
	 */ 
	private String ReuseDigitalDownloadKeys;

	/**
	 * Whether to append these keys to the list or not (replace). 
	 * Optional 	 
	 */ 
	private String AppendDigitalDownloadKeys;

	/**
	 * Zero or more digital download keys to distribute to
	 * customers after transaction is completed.  Optional
	 * Character length and limitations: 1000 single-byte
	 * alphanumeric characters 	 
	 */ 
	private List<String> DigitalDownloadKeys = new ArrayList<String>();

	

	/**
	 * Constructor with arguments
	 */
	public BMSetInventoryRequestType (String HostedButtonID, String TrackInv, String TrackPnl){
		this.HostedButtonID = HostedButtonID;
		this.TrackInv = TrackInv;
		this.TrackPnl = TrackPnl;
	}	

	/**
	 * Default Constructor
	 */
	public BMSetInventoryRequestType (){
	}	

	/**
	 * Getter for HostedButtonID
	 */
	 public String getHostedButtonID() {
	 	return HostedButtonID;
	 }
	 
	/**
	 * Setter for HostedButtonID
	 */
	 public void setHostedButtonID(String HostedButtonID) {
	 	this.HostedButtonID = HostedButtonID;
	 }
	 
	/**
	 * Getter for TrackInv
	 */
	 public String getTrackInv() {
	 	return TrackInv;
	 }
	 
	/**
	 * Setter for TrackInv
	 */
	 public void setTrackInv(String TrackInv) {
	 	this.TrackInv = TrackInv;
	 }
	 
	/**
	 * Getter for TrackPnl
	 */
	 public String getTrackPnl() {
	 	return TrackPnl;
	 }
	 
	/**
	 * Setter for TrackPnl
	 */
	 public void setTrackPnl(String TrackPnl) {
	 	this.TrackPnl = TrackPnl;
	 }
	 
	/**
	 * Getter for ItemTrackingDetails
	 */
	 public ItemTrackingDetailsType getItemTrackingDetails() {
	 	return ItemTrackingDetails;
	 }
	 
	/**
	 * Setter for ItemTrackingDetails
	 */
	 public void setItemTrackingDetails(ItemTrackingDetailsType ItemTrackingDetails) {
	 	this.ItemTrackingDetails = ItemTrackingDetails;
	 }
	 
	/**
	 * Getter for OptionIndex
	 */
	 public String getOptionIndex() {
	 	return OptionIndex;
	 }
	 
	/**
	 * Setter for OptionIndex
	 */
	 public void setOptionIndex(String OptionIndex) {
	 	this.OptionIndex = OptionIndex;
	 }
	 
	/**
	 * Getter for OptionTrackingDetails
	 */
	 public List<OptionTrackingDetailsType> getOptionTrackingDetails() {
	 	return OptionTrackingDetails;
	 }
	 
	/**
	 * Setter for OptionTrackingDetails
	 */
	 public void setOptionTrackingDetails(List<OptionTrackingDetailsType> OptionTrackingDetails) {
	 	this.OptionTrackingDetails = OptionTrackingDetails;
	 }
	 
	/**
	 * Getter for SoldoutURL
	 */
	 public String getSoldoutURL() {
	 	return SoldoutURL;
	 }
	 
	/**
	 * Setter for SoldoutURL
	 */
	 public void setSoldoutURL(String SoldoutURL) {
	 	this.SoldoutURL = SoldoutURL;
	 }
	 
	/**
	 * Getter for ReuseDigitalDownloadKeys
	 */
	 public String getReuseDigitalDownloadKeys() {
	 	return ReuseDigitalDownloadKeys;
	 }
	 
	/**
	 * Setter for ReuseDigitalDownloadKeys
	 */
	 public void setReuseDigitalDownloadKeys(String ReuseDigitalDownloadKeys) {
	 	this.ReuseDigitalDownloadKeys = ReuseDigitalDownloadKeys;
	 }
	 
	/**
	 * Getter for AppendDigitalDownloadKeys
	 */
	 public String getAppendDigitalDownloadKeys() {
	 	return AppendDigitalDownloadKeys;
	 }
	 
	/**
	 * Setter for AppendDigitalDownloadKeys
	 */
	 public void setAppendDigitalDownloadKeys(String AppendDigitalDownloadKeys) {
	 	this.AppendDigitalDownloadKeys = AppendDigitalDownloadKeys;
	 }
	 
	/**
	 * Getter for DigitalDownloadKeys
	 */
	 public List<String> getDigitalDownloadKeys() {
	 	return DigitalDownloadKeys;
	 }
	 
	/**
	 * Setter for DigitalDownloadKeys
	 */
	 public void setDigitalDownloadKeys(List<String> DigitalDownloadKeys) {
	 	this.DigitalDownloadKeys = DigitalDownloadKeys;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(HostedButtonID != null) {
			sb.append("<urn:HostedButtonID>").append(HostedButtonID);
			sb.append("</urn:HostedButtonID>");
		}
		if(TrackInv != null) {
			sb.append("<urn:TrackInv>").append(TrackInv);
			sb.append("</urn:TrackInv>");
		}
		if(TrackPnl != null) {
			sb.append("<urn:TrackPnl>").append(TrackPnl);
			sb.append("</urn:TrackPnl>");
		}
		if(ItemTrackingDetails != null) {
			sb.append("<ebl:ItemTrackingDetails>");
			sb.append(ItemTrackingDetails.toXMLString());
			sb.append("</ebl:ItemTrackingDetails>");
		}
		if(OptionIndex != null) {
			sb.append("<urn:OptionIndex>").append(OptionIndex);
			sb.append("</urn:OptionIndex>");
		}
		if(OptionTrackingDetails != null) {
			for(int i=0; i < OptionTrackingDetails.size(); i++) {
				sb.append("<ebl:OptionTrackingDetails>");
				sb.append(OptionTrackingDetails.get(i).toXMLString());
				sb.append("</ebl:OptionTrackingDetails>");
			}
		}
		if(SoldoutURL != null) {
			sb.append("<urn:SoldoutURL>").append(SoldoutURL);
			sb.append("</urn:SoldoutURL>");
		}
		if(ReuseDigitalDownloadKeys != null) {
			sb.append("<urn:ReuseDigitalDownloadKeys>").append(ReuseDigitalDownloadKeys);
			sb.append("</urn:ReuseDigitalDownloadKeys>");
		}
		if(AppendDigitalDownloadKeys != null) {
			sb.append("<urn:AppendDigitalDownloadKeys>").append(AppendDigitalDownloadKeys);
			sb.append("</urn:AppendDigitalDownloadKeys>");
		}
		if(DigitalDownloadKeys != null) {
			for(int i=0; i < DigitalDownloadKeys.size(); i++) {
				sb.append("<urn:DigitalDownloadKeys>").append(DigitalDownloadKeys.get(i));
				sb.append("</urn:DigitalDownloadKeys>");
			}
		}
		return sb.toString();
	}

}