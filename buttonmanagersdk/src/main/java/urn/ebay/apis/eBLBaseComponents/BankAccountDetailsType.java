package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BankAccountTypeType;
import com.paypal.core.SDKUtil;

/**
 * BankAccountDetailsType 
 */
public class BankAccountDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Name of bank Character length and limitations: 192
	 * alphanumeric characters	 
	 */ 
	private String name;

	/**
	 * Type of bank account: Checking or Savings	 
	 */ 
	private BankAccountTypeType type;

	/**
	 * Merchant’s bank routing number Character length and
	 * limitations: 23 alphanumeric characters	 
	 */ 
	private String routingNumber;

	/**
	 * Merchant’s bank account number Character length and
	 * limitations: 256 alphanumeric characters	 
	 */ 
	private String accountNumber;

	

	/**
	 * Default Constructor
	 */
	public BankAccountDetailsType (){
	}	

	/**
	 * Getter for name
	 */
	 public String getName() {
	 	return name;
	 }
	 
	/**
	 * Setter for name
	 */
	 public void setName(String name) {
	 	this.name = name;
	 }
	 
	/**
	 * Getter for type
	 */
	 public BankAccountTypeType getType() {
	 	return type;
	 }
	 
	/**
	 * Setter for type
	 */
	 public void setType(BankAccountTypeType type) {
	 	this.type = type;
	 }
	 
	/**
	 * Getter for routingNumber
	 */
	 public String getRoutingNumber() {
	 	return routingNumber;
	 }
	 
	/**
	 * Setter for routingNumber
	 */
	 public void setRoutingNumber(String routingNumber) {
	 	this.routingNumber = routingNumber;
	 }
	 
	/**
	 * Getter for accountNumber
	 */
	 public String getAccountNumber() {
	 	return accountNumber;
	 }
	 
	/**
	 * Setter for accountNumber
	 */
	 public void setAccountNumber(String accountNumber) {
	 	this.accountNumber = accountNumber;
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
		if(name != null) {
			sb.append("<").append(preferredPrefix).append(":Name>").append(SDKUtil.escapeInvalidXmlCharsRegex(name));
			sb.append("</").append(preferredPrefix).append(":Name>");
		}
		if(type != null) {
			sb.append("<").append(preferredPrefix).append(":Type>").append(SDKUtil.escapeInvalidXmlCharsRegex(type.getValue()));
			sb.append("</").append(preferredPrefix).append(":Type>");
		}
		if(routingNumber != null) {
			sb.append("<").append(preferredPrefix).append(":RoutingNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(routingNumber));
			sb.append("</").append(preferredPrefix).append(":RoutingNumber>");
		}
		if(accountNumber != null) {
			sb.append("<").append(preferredPrefix).append(":AccountNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(accountNumber));
			sb.append("</").append(preferredPrefix).append(":AccountNumber>");
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