package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.IdentificationInfoType;
import com.paypal.core.SDKUtil;

/**
 * Information that is used to indentify the Buyer. This is
 * used for auto authorization. Mandatory if Authorization is
 * requested. 
 */
public class BuyerDetailType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Information that is used to indentify the Buyer. This is
	 * used for auto authorization. Mandatory if Authorization is
	 * requested.	 
	 */ 
	private IdentificationInfoType identificationInfo;

	

	/**
	 * Default Constructor
	 */
	public BuyerDetailType (){
	}	

	/**
	 * Getter for identificationInfo
	 */
	 public IdentificationInfoType getIdentificationInfo() {
	 	return identificationInfo;
	 }
	 
	/**
	 * Setter for identificationInfo
	 */
	 public void setIdentificationInfo(IdentificationInfoType identificationInfo) {
	 	this.identificationInfo = identificationInfo;
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
		if(identificationInfo != null) {
			sb.append(identificationInfo.toXMLString(preferredPrefix,"IdentificationInfo"));
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