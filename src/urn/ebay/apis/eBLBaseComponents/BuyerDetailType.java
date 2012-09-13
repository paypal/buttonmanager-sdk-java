package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.IdentificationInfoType;
import com.paypal.core.SDKUtil;

/**
 * Information that is used to indentify the Buyer. This is
 * used for auto authorization. Mandatory if Authorization is
 * requested. 
 */
public class BuyerDetailType{


	/**
	 * Information that is used to indentify the Buyer. This is
	 * used for auto authorization. Mandatory if Authorization is
	 * requested.	 
	 */ 
	private IdentificationInfoType IdentificationInfo;

	

	/**
	 * Default Constructor
	 */
	public BuyerDetailType (){
	}	

	/**
	 * Getter for IdentificationInfo
	 */
	 public IdentificationInfoType getIdentificationInfo() {
	 	return IdentificationInfo;
	 }
	 
	/**
	 * Setter for IdentificationInfo
	 */
	 public void setIdentificationInfo(IdentificationInfoType IdentificationInfo) {
	 	this.IdentificationInfo = IdentificationInfo;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(IdentificationInfo != null) {
			sb.append("<ebl:IdentificationInfo>");
			sb.append(IdentificationInfo.toXMLString());
			sb.append("</ebl:IdentificationInfo>");
		}
		return sb.toString();
	}

}