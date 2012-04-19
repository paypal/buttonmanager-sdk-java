
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;



/**
 * Store IDOptional
 * Character length and limits: 50 single-byte characters
 */
public class MerchantStoreDetailsType {

	/**
Store IDOptional
	 * Character length and limits: 50 single-byte characters
	 *
	 * @Required
	 */
	private String StoreID;
	public String getStoreID() {
		return StoreID;
	}
	public void setStoreID(String value) {
		this.StoreID = value;
	}

	/**
Terminal IDOptional
	 * Character length and limits: 50 single-byte characters
	 */
	private String TerminalID;
	public String getTerminalID() {
		return TerminalID;
	}
	public void setTerminalID(String value) {
		this.TerminalID = value;
	}


	public MerchantStoreDetailsType(String StoreID) {
		this.StoreID = StoreID;
	}
	public MerchantStoreDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( StoreID != null ) {
			sb.append("<ebl:StoreID>").append(StoreID);
			sb.append("</ebl:StoreID>");
		}
		if( TerminalID != null ) {
			sb.append("<ebl:TerminalID>").append(TerminalID);
			sb.append("</ebl:TerminalID>");
		}
		return sb.toString();
	}

}
