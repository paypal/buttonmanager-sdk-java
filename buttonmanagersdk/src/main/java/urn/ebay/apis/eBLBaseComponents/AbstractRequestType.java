package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.DetailLevelCodeType;
import com.paypal.core.SDKUtil;

/**
 * Base type definition of request payload that can carry any
 * type of payload content with optional versioning information
 * and detail level requirements. 
 */
public class AbstractRequestType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * This specifies the required detail level that is needed by a
	 * client application pertaining to a particular data component
	 * (e.g., Item, Transaction, etc.). The detail level is
	 * specified in the DetailLevelCodeType which has all the
	 * enumerated values of the detail level for each component. 	 
	 */ 
	private List<DetailLevelCodeType> detailLevel = new ArrayList<DetailLevelCodeType>();

	/**
	 * This should be the standard RFC 3066 language identification
	 * tag, e.g., en_US. 	 
	 */ 
	private String errorLanguage;

	/**
	 * This refers to the version of the request payload schema. 	 
	 */ 
	private String version;

	

	/**
	 * Default Constructor
	 */
	public AbstractRequestType (){
	}	

	/**
	 * Getter for detailLevel
	 */
	 public List<DetailLevelCodeType> getDetailLevel() {
	 	return detailLevel;
	 }
	 
	/**
	 * Setter for detailLevel
	 */
	 public void setDetailLevel(List<DetailLevelCodeType> detailLevel) {
	 	this.detailLevel = detailLevel;
	 }
	 
	/**
	 * Getter for errorLanguage
	 */
	 public String getErrorLanguage() {
	 	return errorLanguage;
	 }
	 
	/**
	 * Setter for errorLanguage
	 */
	 public void setErrorLanguage(String errorLanguage) {
	 	this.errorLanguage = errorLanguage;
	 }
	 
	/**
	 * Getter for version
	 */
	 public String getVersion() {
	 	return version;
	 }
	 
	/**
	 * Setter for version
	 */
	 public void setVersion(String version) {
	 	this.version = version;
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
		if(detailLevel != null) {
			for(int i=0; i < detailLevel.size(); i++) {
				sb.append("<").append(preferredPrefix).append(":DetailLevel>").append(SDKUtil.escapeInvalidXmlCharsRegex(detailLevel.get(i).getValue())).append("</").append(preferredPrefix).append(":DetailLevel>");
			}
		}
		if(errorLanguage != null) {
			sb.append("<").append(preferredPrefix).append(":ErrorLanguage>").append(SDKUtil.escapeInvalidXmlCharsRegex(errorLanguage));
			sb.append("</").append(preferredPrefix).append(":ErrorLanguage>");
		}
		if(version != null) {
			sb.append("<").append(preferredPrefix).append(":Version>").append(SDKUtil.escapeInvalidXmlCharsRegex(version));
			sb.append("</").append(preferredPrefix).append(":Version>");
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