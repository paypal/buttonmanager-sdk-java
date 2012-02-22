
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import java.util.ArrayList;
import java.util.List;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.ItemTrackingDetailsType;
import urn.ebay.apis.eBLBaseComponents.OptionTrackingDetailsType;


/**
 * Hosted Button ID of button you wish to change.
 * Required
 * Character length and limitations: 10 single-byte numeric characters
 */
public class BMSetInventoryRequestType extends AbstractRequestType{

	/**
	 * Hosted Button ID of button you wish to change.
	 * Required
	 * Character length and limitations: 10 single-byte numeric characters
	 *
	 * @Required
	 */
	private String HostedButtonID;
	public String getHostedButtonID() {
		return HostedButtonID;
	}
	public void setHostedButtonID(String value) {
		this.HostedButtonID = value;
	}

	/**
	 * Is Inventory tracked.
	 * Required
	 * 0 or 1
	 *
	 * @Required
	 */
	private String TrackInv;
	public String getTrackInv() {
		return TrackInv;
	}
	public void setTrackInv(String value) {
		this.TrackInv = value;
	}

	/**
	 * Is PNL Tracked.
	 * Required
	 * 0 or 1
	 *
	 * @Required
	 */
	private String TrackPnl;
	public String getTrackPnl() {
		return TrackPnl;
	}
	public void setTrackPnl(String value) {
		this.TrackPnl = value;
	}

	/**
	 */
	private ItemTrackingDetailsType ItemTrackingDetails;
	public ItemTrackingDetailsType getItemTrackingDetails() {
		return ItemTrackingDetails;
	}
	public void setItemTrackingDetails(ItemTrackingDetailsType value) {
		this.ItemTrackingDetails = value;
	}

	/**
	 * Option Index.
	 * Optional
	 * Character length and limitations: 1 single-byte alphanumeric characters
	 */
	private String OptionIndex;
	public String getOptionIndex() {
		return OptionIndex;
	}
	public void setOptionIndex(String value) {
		this.OptionIndex = value;
	}

	/**
	 */
	private List<OptionTrackingDetailsType> OptionTrackingDetails = new ArrayList<OptionTrackingDetailsType>();
	public List<OptionTrackingDetailsType> getOptionTrackingDetails() {
		return OptionTrackingDetails;
	}
	public void setOptionTrackingDetails(List<OptionTrackingDetailsType> value) {
		this.OptionTrackingDetails = value;
	}

	/**
	 * URL of page to display when an item is soldout.
	 * Optional
	 * Character length and limitations: 127 single-byte alphanumeric characters
	 */
	private String SoldoutURL;
	public String getSoldoutURL() {
		return SoldoutURL;
	}
	public void setSoldoutURL(String value) {
		this.SoldoutURL = value;
	}

	/**
	 * Whether to use the same digital download key repeatedly.
	 * Optional
	 */
	private String ReuseDigitalDownloadKeys;
	public String getReuseDigitalDownloadKeys() {
		return ReuseDigitalDownloadKeys;
	}
	public void setReuseDigitalDownloadKeys(String value) {
		this.ReuseDigitalDownloadKeys = value;
	}

	/**
	 * Whether to append these keys to the list or not (replace).
	 * Optional
	 */
	private String AppendDigitalDownloadKeys;
	public String getAppendDigitalDownloadKeys() {
		return AppendDigitalDownloadKeys;
	}
	public void setAppendDigitalDownloadKeys(String value) {
		this.AppendDigitalDownloadKeys = value;
	}

	/**
	 * Zero or more digital download keys to distribute to customers after transaction is completed.
	 * Optional
	 * Character length and limitations: 1000 single-byte alphanumeric characters
	 */
	private List<String> DigitalDownloadKeys = new ArrayList<String>();
	public List<String> getDigitalDownloadKeys() {
		return DigitalDownloadKeys;
	}
	public void setDigitalDownloadKeys(List<String> value) {
		this.DigitalDownloadKeys = value;
	}


	public BMSetInventoryRequestType(String HostedButtonID, String TrackInv, String TrackPnl) {
		this.HostedButtonID = HostedButtonID;
		this.TrackInv = TrackInv;
		this.TrackPnl = TrackPnl;
	}
	public BMSetInventoryRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( HostedButtonID != null ) {
			sb.append("<urn:HostedButtonID>").append(HostedButtonID);
			sb.append("</urn:HostedButtonID>");
		}
		if( TrackInv != null ) {
			sb.append("<urn:TrackInv>").append(TrackInv);
			sb.append("</urn:TrackInv>");
		}
		if( TrackPnl != null ) {
			sb.append("<urn:TrackPnl>").append(TrackPnl);
			sb.append("</urn:TrackPnl>");
		}
		if( ItemTrackingDetails != null ) {
			sb.append("<ebl:ItemTrackingDetails>");
			sb.append(ItemTrackingDetails.toXMLString());
			sb.append("</ebl:ItemTrackingDetails>");
		}
		if( OptionIndex != null ) {
			sb.append("<urn:OptionIndex>").append(OptionIndex);
			sb.append("</urn:OptionIndex>");
		}
		if( OptionTrackingDetails != null ) {
			for(int i=0; i<OptionTrackingDetails.size(); i++) {
				sb.append("<ebl:OptionTrackingDetails>");
				sb.append(OptionTrackingDetails.get(i).toXMLString());
				sb.append("</ebl:OptionTrackingDetails>");
			}
		}
		if( SoldoutURL != null ) {
			sb.append("<urn:SoldoutURL>").append(SoldoutURL);
			sb.append("</urn:SoldoutURL>");
		}
		if( ReuseDigitalDownloadKeys != null ) {
			sb.append("<urn:ReuseDigitalDownloadKeys>").append(ReuseDigitalDownloadKeys);
			sb.append("</urn:ReuseDigitalDownloadKeys>");
		}
		if( AppendDigitalDownloadKeys != null ) {
			sb.append("<urn:AppendDigitalDownloadKeys>").append(AppendDigitalDownloadKeys);
			sb.append("</urn:AppendDigitalDownloadKeys>");
		}
		if( DigitalDownloadKeys != null ) {
			for(int i=0; i<DigitalDownloadKeys.size(); i++) {
				sb.append("<urn:DigitalDownloadKeys>").append(DigitalDownloadKeys.get(i));
				sb.append("</urn:DigitalDownloadKeys>");
			}
		}
		return sb.toString();
	}

}
