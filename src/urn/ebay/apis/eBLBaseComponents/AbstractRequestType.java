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


	/**
	 * This specifies the required detail level that is needed by a
	 * client application pertaining to a particular data component
	 * (e.g., Item, Transaction, etc.). The detail level is
	 * specified in the DetailLevelCodeType which has all the
	 * enumerated values of the detail level for each component. 	 
	 */ 
	private List<DetailLevelCodeType> DetailLevel = new ArrayList<DetailLevelCodeType>();

	/**
	 * This should be the standard RFC 3066 language identification
	 * tag, e.g., en_US. 	 
	 */ 
	private String ErrorLanguage;

	/**
	 * This refers to the version of the request payload schema. 	 
	 */ 
	private String Version;

	

	/**
	 * Default Constructor
	 */
	public AbstractRequestType (){
	}	

	/**
	 * Getter for DetailLevel
	 */
	 public List<DetailLevelCodeType> getDetailLevel() {
	 	return DetailLevel;
	 }
	 
	/**
	 * Setter for DetailLevel
	 */
	 public void setDetailLevel(List<DetailLevelCodeType> DetailLevel) {
	 	this.DetailLevel = DetailLevel;
	 }
	 
	/**
	 * Getter for ErrorLanguage
	 */
	 public String getErrorLanguage() {
	 	return ErrorLanguage;
	 }
	 
	/**
	 * Setter for ErrorLanguage
	 */
	 public void setErrorLanguage(String ErrorLanguage) {
	 	this.ErrorLanguage = ErrorLanguage;
	 }
	 
	/**
	 * Getter for Version
	 */
	 public String getVersion() {
	 	return Version;
	 }
	 
	/**
	 * Setter for Version
	 */
	 public void setVersion(String Version) {
	 	this.Version = Version;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(DetailLevel != null) {
			for(int i=0; i < DetailLevel.size(); i++) {
				sb.append("<ebl:DetailLevel>").append(SDKUtil.escapeInvalidXmlCharsRegex(DetailLevel.get(i).getValue())).append("</ebl:DetailLevel>");
			}
		}
		if(ErrorLanguage != null) {
			sb.append("<ebl:ErrorLanguage>").append(SDKUtil.escapeInvalidXmlCharsRegex(ErrorLanguage));
			sb.append("</ebl:ErrorLanguage>");
		}
		if(Version != null) {
			sb.append("<ebl:Version>").append(SDKUtil.escapeInvalidXmlCharsRegex(Version));
			sb.append("</ebl:Version>");
		}
		return sb.toString();
	}

}