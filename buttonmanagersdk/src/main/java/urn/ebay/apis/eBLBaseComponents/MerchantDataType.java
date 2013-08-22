package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.TupleType;
import com.paypal.core.SDKUtil;

/**
 * This holds all key-value pairs which merchants wants to pass
 * it to the open wallet(PLCC) processor. 
 */
public class MerchantDataType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private List<TupleType> merchantDataTuple = new ArrayList<TupleType>();

	

	/**
	 * Default Constructor
	 */
	public MerchantDataType (){
	}	

	/**
	 * Getter for merchantDataTuple
	 */
	 public List<TupleType> getMerchantDataTuple() {
	 	return merchantDataTuple;
	 }
	 
	/**
	 * Setter for merchantDataTuple
	 */
	 public void setMerchantDataTuple(List<TupleType> merchantDataTuple) {
	 	this.merchantDataTuple = merchantDataTuple;
	 }
	 


	public String toXMLString(String prefix, String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(merchantDataTuple != null) {
			for(int i=0; i < merchantDataTuple.size(); i++) {
				sb.append(merchantDataTuple.get(i).toXMLString(preferredPrefix,"MerchantDataTuple"));
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