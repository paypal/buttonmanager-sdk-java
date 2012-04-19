
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.IdentificationInfoType;


/**
 * Information that is used to indentify the Buyer. This is used for auto authorization. Mandatory if Authorization is requested.
 */
public class BuyerDetailType {

	/**
Information that is used to indentify the Buyer. This is used for auto authorization. Mandatory if Authorization is requested.	 */
	private IdentificationInfoType IdentificationInfo;
	public IdentificationInfoType getIdentificationInfo() {
		return IdentificationInfo;
	}
	public void setIdentificationInfo(IdentificationInfoType value) {
		this.IdentificationInfo = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( IdentificationInfo != null ) {
			sb.append("<ebl:IdentificationInfo>");
			sb.append(IdentificationInfo.toXMLString());
			sb.append("</ebl:IdentificationInfo>");
		}
		return sb.toString();
	}

}
