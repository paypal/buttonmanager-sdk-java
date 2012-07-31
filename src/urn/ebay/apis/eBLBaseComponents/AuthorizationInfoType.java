package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PaymentStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.PendingStatusCodeType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;
import java.io.FileInputStream;
import java.io.StringReader;
import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Authorization details 
 */
public class AuthorizationInfoType{


	/**
	 * The status of the payment: Pending: The payment is pending.
	 * See "PendingReason" for more information.	 
	 */ 
	private PaymentStatusCodeType PaymentStatus;

	/**
	 * The reason the payment is pending:none: No pending reason
	 * address: The payment is pending because your customer did
	 * not include a confirmed shipping address and your Payment
	 * Receiving Preferences is set such that you want to manually
	 * accept or deny each of these payments. To change your
	 * preference, go to the Preferences section of your Profile.
	 * authorization: The authorization is pending at time of
	 * creation if payment is not under review echeck: The payment
	 * is pending because it was made by an eCheck that has not yet
	 * cleared. intl: The payment is pending because you hold a
	 * non-U.S. account and do not have a withdrawal mechanism. You
	 * must manually accept or deny this payment from your Account
	 * Overview. multi-currency: You do not have a balance in the
	 * currency sent, and you do not have your Payment Receiving
	 * Preferences set to automatically convert and accept this
	 * payment. You must manually accept or deny this payment.
	 * unilateral: The payment is pending because it was made to an
	 * email address that is not yet registered or confirmed.
	 * upgrade: The payment is pending because it was made via
	 * credit card and you must upgrade your account to Business or
	 * Premier status in order to receive the funds. upgrade can
	 * also mean that you have reached the monthly limit for
	 * transactions on your account. verify: The payment is pending
	 * because you are not yet verified. You must verify your
	 * account before you can accept this payment. payment_review:
	 * The payment is pending because it is under payment review.
	 * other: The payment is pending for a reason other than those
	 * listed above. For more information, contact PayPal Customer
	 * Service.	 
	 */ 
	private PendingStatusCodeType PendingReason;

	/**
	 * Protection Eligibility for this Transaction - None, SPP or
	 * ESPP 	 
	 */ 
	private String ProtectionEligibility;

	/**
	 * Protection Eligibility Type for this Transaction 	 
	 */ 
	private String ProtectionEligibilityType;

	

	/**
	 * Default Constructor
	 */
	public AuthorizationInfoType (){
	}	

	/**
	 * Getter for PaymentStatus
	 */
	 public PaymentStatusCodeType getPaymentStatus() {
	 	return PaymentStatus;
	 }
	 
	/**
	 * Setter for PaymentStatus
	 */
	 public void setPaymentStatus(PaymentStatusCodeType PaymentStatus) {
	 	this.PaymentStatus = PaymentStatus;
	 }
	 
	/**
	 * Getter for PendingReason
	 */
	 public PendingStatusCodeType getPendingReason() {
	 	return PendingReason;
	 }
	 
	/**
	 * Setter for PendingReason
	 */
	 public void setPendingReason(PendingStatusCodeType PendingReason) {
	 	this.PendingReason = PendingReason;
	 }
	 
	/**
	 * Getter for ProtectionEligibility
	 */
	 public String getProtectionEligibility() {
	 	return ProtectionEligibility;
	 }
	 
	/**
	 * Setter for ProtectionEligibility
	 */
	 public void setProtectionEligibility(String ProtectionEligibility) {
	 	this.ProtectionEligibility = ProtectionEligibility;
	 }
	 
	/**
	 * Getter for ProtectionEligibilityType
	 */
	 public String getProtectionEligibilityType() {
	 	return ProtectionEligibilityType;
	 }
	 
	/**
	 * Setter for ProtectionEligibilityType
	 */
	 public void setProtectionEligibilityType(String ProtectionEligibilityType) {
	 	this.ProtectionEligibilityType = ProtectionEligibilityType;
	 }
	 


	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else {
			return false;
		}
	}
	
	private String convertToXML(Node n){
		String name = n.getNodeName();
		short type = n.getNodeType();
		if (Node.CDATA_SECTION_NODE == type) {
			return "<![CDATA[" + n.getNodeValue() + "]]&gt;";
		}
		if (name.startsWith("#")) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		sb.append("<").append(name);
		NamedNodeMap attrs = n.getAttributes();
		if (attrs != null) {
			for (int i = 0; i < attrs.getLength(); i++) {
				Node attr = attrs.item(i);
				sb.append(" ").append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
			}
		}
		String textContent = null;
		NodeList children = n.getChildNodes();
		if (children.getLength() == 0) {
			if (((textContent = n.getTextContent())) != null && (!"".equals(textContent))) {
				sb.append(textContent).append("</").append(name).append(">");
			} else {
				sb.append("/>");
			}
		} else {
			sb.append(">");
			boolean hasValidChildren = false;
			for (int i = 0; i < children.getLength(); i++) {
				String childToString = convertToXML(children.item(i));
				if (!"".equals(childToString)) {
					sb.append(childToString);
					hasValidChildren = true;
				}
			}
			if (!hasValidChildren && ((textContent = n.getTextContent()) != null)) {
				sb.append(textContent);
			}
			sb.append("</").append(name).append(">");
		}
		return sb.toString();
	}
	
	public AuthorizationInfoType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if(document.getElementsByTagName("PaymentStatus").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentStatus").item(0))) {
				this.PaymentStatus = PaymentStatusCodeType.fromValue(document.getElementsByTagName("PaymentStatus").item(0).getTextContent());
			}
		}
		if(document.getElementsByTagName("PendingReason").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PendingReason").item(0))) {
				this.PendingReason = PendingStatusCodeType.fromValue(document.getElementsByTagName("PendingReason").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("ProtectionEligibility").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ProtectionEligibility").item(0))) {
				this.ProtectionEligibility = (String)document.getElementsByTagName("ProtectionEligibility").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ProtectionEligibilityType").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ProtectionEligibilityType").item(0))) {
				this.ProtectionEligibilityType = (String)document.getElementsByTagName("ProtectionEligibilityType").item(0).getTextContent();
			}
		}
	
	}

}