
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.util.ArrayList;
import java.util.List;
import urn.ebay.apis.eBLBaseComponents.DetailLevelCodeType;


/**
 * Base type definition of request payload that can carry any type 
 * of payload content with optional versioning information and detail level
 * requirements.
 */
public class AbstractRequestType {

	/**
	 * This specifies the required detail level that is needed by a client application pertaining to
	 * a particular data component (e.g., Item, Transaction, etc.). The detail level is specified in
	 * the DetailLevelCodeType which has all the enumerated values of the detail level for 
	 * each component.  
	 */
	private List<DetailLevelCodeType> DetailLevel = new ArrayList<DetailLevelCodeType>();
	public List<DetailLevelCodeType> getDetailLevel() {
		return DetailLevel;
	}
	public void setDetailLevel(List<DetailLevelCodeType> value) {
		this.DetailLevel = value;
	}

	/**
	 * This should be the standard RFC 3066 language identification tag, e.g., en_US.
	 */
	private String ErrorLanguage;
	public String getErrorLanguage() {
		return ErrorLanguage;
	}
	public void setErrorLanguage(String value) {
		this.ErrorLanguage = value;
	}

	/**
	 * This refers to the version of the request payload schema.
	 */
	private String Version;
	public String getVersion() {
		return Version;
	}
	public void setVersion(String value) {
		this.Version = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( DetailLevel != null ) {
			for(int i=0; i<DetailLevel.size(); i++) {
				sb.append("<ebl:DetailLevel>").append(DetailLevel.get(i)).append("</ebl:DetailLevel>");
			}
		}
		if( ErrorLanguage != null ) {
			sb.append("<ebl:ErrorLanguage>").append(ErrorLanguage);
			sb.append("</ebl:ErrorLanguage>");
		}
		if( Version != null ) {
			sb.append("<ebl:Version>").append(Version);
			sb.append("</ebl:Version>");
		}
		return sb.toString();
	}

}
