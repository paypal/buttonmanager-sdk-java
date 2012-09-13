package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BankAccountTypeType;
import com.paypal.core.SDKUtil;

/**
 * BankAccountDetailsType 
 */
public class BankAccountDetailsType{


	/**
	 * Name of bank Character length and limitations: 192
	 * alphanumeric characters	 
	 */ 
	private String Name;

	/**
	 * Type of bank account: Checking or Savings	 
	 */ 
	private BankAccountTypeType Type;

	/**
	 * Merchant’s bank routing number Character length and
	 * limitations: 23 alphanumeric characters	 
	 */ 
	private String RoutingNumber;

	/**
	 * Merchant’s bank account number Character length and
	 * limitations: 256 alphanumeric characters	 
	 */ 
	private String AccountNumber;

	

	/**
	 * Default Constructor
	 */
	public BankAccountDetailsType (){
	}	

	/**
	 * Getter for Name
	 */
	 public String getName() {
	 	return Name;
	 }
	 
	/**
	 * Setter for Name
	 */
	 public void setName(String Name) {
	 	this.Name = Name;
	 }
	 
	/**
	 * Getter for Type
	 */
	 public BankAccountTypeType getType() {
	 	return Type;
	 }
	 
	/**
	 * Setter for Type
	 */
	 public void setType(BankAccountTypeType Type) {
	 	this.Type = Type;
	 }
	 
	/**
	 * Getter for RoutingNumber
	 */
	 public String getRoutingNumber() {
	 	return RoutingNumber;
	 }
	 
	/**
	 * Setter for RoutingNumber
	 */
	 public void setRoutingNumber(String RoutingNumber) {
	 	this.RoutingNumber = RoutingNumber;
	 }
	 
	/**
	 * Getter for AccountNumber
	 */
	 public String getAccountNumber() {
	 	return AccountNumber;
	 }
	 
	/**
	 * Setter for AccountNumber
	 */
	 public void setAccountNumber(String AccountNumber) {
	 	this.AccountNumber = AccountNumber;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Name != null) {
			sb.append("<ebl:Name>").append(SDKUtil.escapeInvalidXmlCharsRegex(Name));
			sb.append("</ebl:Name>");
		}
		if(Type != null) {
			sb.append("<ebl:Type>").append(SDKUtil.escapeInvalidXmlCharsRegex(Type.getValue()));
			sb.append("</ebl:Type>");
		}
		if(RoutingNumber != null) {
			sb.append("<ebl:RoutingNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(RoutingNumber));
			sb.append("</ebl:RoutingNumber>");
		}
		if(AccountNumber != null) {
			sb.append("<ebl:AccountNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(AccountNumber));
			sb.append("</ebl:AccountNumber>");
		}
		return sb.toString();
	}

}