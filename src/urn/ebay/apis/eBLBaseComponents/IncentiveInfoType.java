package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.IncentiveApplyIndicationType;
import com.paypal.core.SDKUtil;

/**
 * Details of incentive application on individual bucket. 
 */
public class IncentiveInfoType{


	/**
	 * Incentive redemption code. 	 
	 */ 
	private String IncentiveCode;

	/**
	 * Defines which bucket or item that the incentive should be
	 * applied to. 	 
	 */ 
	private List<IncentiveApplyIndicationType> ApplyIndication = new ArrayList<IncentiveApplyIndicationType>();

	

	/**
	 * Default Constructor
	 */
	public IncentiveInfoType (){
	}	

	/**
	 * Getter for IncentiveCode
	 */
	 public String getIncentiveCode() {
	 	return IncentiveCode;
	 }
	 
	/**
	 * Setter for IncentiveCode
	 */
	 public void setIncentiveCode(String IncentiveCode) {
	 	this.IncentiveCode = IncentiveCode;
	 }
	 
	/**
	 * Getter for ApplyIndication
	 */
	 public List<IncentiveApplyIndicationType> getApplyIndication() {
	 	return ApplyIndication;
	 }
	 
	/**
	 * Setter for ApplyIndication
	 */
	 public void setApplyIndication(List<IncentiveApplyIndicationType> ApplyIndication) {
	 	this.ApplyIndication = ApplyIndication;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(IncentiveCode != null) {
			sb.append("<ebl:IncentiveCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(IncentiveCode));
			sb.append("</ebl:IncentiveCode>");
		}
		if(ApplyIndication != null) {
			for(int i=0; i < ApplyIndication.size(); i++) {
				sb.append("<ebl:ApplyIndication>");
				sb.append(ApplyIndication.get(i).toXMLString());
				sb.append("</ebl:ApplyIndication>");
			}
		}
		return sb.toString();
	}


}