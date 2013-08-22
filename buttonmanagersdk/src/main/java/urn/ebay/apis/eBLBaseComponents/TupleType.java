package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * This holds single key-value pair. 
 */
public class TupleType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Key Name.Optional	  
	 *@Required	 
	 */ 
	private String key;

	/**
	 * Value for the above key.Optional	  
	 *@Required	 
	 */ 
	private String value;

	

	/**
	 * Constructor with arguments
	 */
	public TupleType (String key, String value){
		this.key = key;
		this.value = value;
	}	

	/**
	 * Default Constructor
	 */
	public TupleType (){
	}	

	/**
	 * Getter for key
	 */
	 public String getKey() {
	 	return key;
	 }
	 
	/**
	 * Setter for key
	 */
	 public void setKey(String key) {
	 	this.key = key;
	 }
	 
	/**
	 * Getter for value
	 */
	 public String getValue() {
	 	return value;
	 }
	 
	/**
	 * Setter for value
	 */
	 public void setValue(String value) {
	 	this.value = value;
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
		if(key != null) {
			sb.append("<").append(preferredPrefix).append(":Key>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.key));
			sb.append("</").append(preferredPrefix).append(":Key>");
		}
		if(value != null) {
			sb.append("<").append(preferredPrefix).append(":Value>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.value));
			sb.append("</").append(preferredPrefix).append(":Value>");
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