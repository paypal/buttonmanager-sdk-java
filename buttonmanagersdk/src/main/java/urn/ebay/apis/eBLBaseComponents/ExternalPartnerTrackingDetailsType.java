package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * Contains elements that allow tracking for an external
 * partner. 
 */
public class ExternalPartnerTrackingDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * PayPal will just log this string. There will NOT be any
	 * business logic around it, nor any decisions made based on
	 * the value of the string that is passed in. From a
	 * tracking/analytical perspective, PayPal would not infer any
	 * meaning to any specific value. We would just segment the
	 * traffic based on the value passed (Cart and None as an
	 * example) and track different metrics like risk/conversion
	 * etc based on these segments. The external partner would
	 * control the value of what gets passed and we take that value
	 * as is and generate data based on it. Optional 	 
	 */ 
	private String externalPartnerSegmentID;

	

	/**
	 * Default Constructor
	 */
	public ExternalPartnerTrackingDetailsType (){
	}	

	/**
	 * Getter for externalPartnerSegmentID
	 */
	 public String getExternalPartnerSegmentID() {
	 	return externalPartnerSegmentID;
	 }
	 
	/**
	 * Setter for externalPartnerSegmentID
	 */
	 public void setExternalPartnerSegmentID(String externalPartnerSegmentID) {
	 	this.externalPartnerSegmentID = externalPartnerSegmentID;
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
		if(externalPartnerSegmentID != null) {
			sb.append("<").append(preferredPrefix).append(":ExternalPartnerSegmentID>").append(SDKUtil.escapeInvalidXmlCharsRegex(externalPartnerSegmentID));
			sb.append("</").append(preferredPrefix).append(":ExternalPartnerSegmentID>");
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