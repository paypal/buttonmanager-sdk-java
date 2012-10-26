package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.IncentiveApplyIndicationType;
import com.paypal.core.SDKUtil;

/**
 * Details of incentive application on individual bucket. 
 */
public class IncentiveInfoType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Incentive redemption code. 	 
	 */ 
	private String incentiveCode;

	/**
	 * Defines which bucket or item that the incentive should be
	 * applied to. 	 
	 */ 
	private List<IncentiveApplyIndicationType> applyIndication = new ArrayList<IncentiveApplyIndicationType>();

	

	/**
	 * Default Constructor
	 */
	public IncentiveInfoType (){
	}	

	/**
	 * Getter for incentiveCode
	 */
	 public String getIncentiveCode() {
	 	return incentiveCode;
	 }
	 
	/**
	 * Setter for incentiveCode
	 */
	 public void setIncentiveCode(String incentiveCode) {
	 	this.incentiveCode = incentiveCode;
	 }
	 
	/**
	 * Getter for applyIndication
	 */
	 public List<IncentiveApplyIndicationType> getApplyIndication() {
	 	return applyIndication;
	 }
	 
	/**
	 * Setter for applyIndication
	 */
	 public void setApplyIndication(List<IncentiveApplyIndicationType> applyIndication) {
	 	this.applyIndication = applyIndication;
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
		if(incentiveCode != null) {
			sb.append("<").append(preferredPrefix).append(":IncentiveCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(incentiveCode));
			sb.append("</").append(preferredPrefix).append(":IncentiveCode>");
		}
		if(applyIndication != null) {
			for(int i=0; i < applyIndication.size(); i++) {
				sb.append(applyIndication.get(i).toXMLString(preferredPrefix,"ApplyIndication"));
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