package urn.ebay.apis.EnhancedDataTypes;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class EnhancedInitiateRecoupRequestDetailsType{

	private static final String nameSpace="urn:ebay:apis:EnhancedDataTypes";
	private static final String preferredPrefix="ed";

	

	/**
	 * Default Constructor
	 */
	public EnhancedInitiateRecoupRequestDetailsType (){
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