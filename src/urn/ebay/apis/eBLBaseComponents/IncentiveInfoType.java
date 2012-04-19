
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.util.ArrayList;
import java.util.List;
import urn.ebay.apis.eBLBaseComponents.IncentiveApplyIndicationType;


/**
 * Details of incentive application on individual bucket.  
 */
public class IncentiveInfoType {

	/**
	 * Incentive redemption code.
	 */
	private String IncentiveCode;
	public String getIncentiveCode() {
		return IncentiveCode;
	}
	public void setIncentiveCode(String value) {
		this.IncentiveCode = value;
	}

	/**
	 * Defines which bucket or item that the incentive should be applied to. 
	 */
	private List<IncentiveApplyIndicationType> ApplyIndication = new ArrayList<IncentiveApplyIndicationType>();
	public List<IncentiveApplyIndicationType> getApplyIndication() {
		return ApplyIndication;
	}
	public void setApplyIndication(List<IncentiveApplyIndicationType> value) {
		this.ApplyIndication = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( IncentiveCode != null ) {
			sb.append("<ebl:IncentiveCode>").append(IncentiveCode);
			sb.append("</ebl:IncentiveCode>");
		}
		if( ApplyIndication != null ) {
			for(int i=0; i<ApplyIndication.size(); i++) {
				sb.append("<ebl:ApplyIndication>");
				sb.append(ApplyIndication.get(i).toXMLString());
				sb.append("</ebl:ApplyIndication>");
			}
		}
		return sb.toString();
	}

}
