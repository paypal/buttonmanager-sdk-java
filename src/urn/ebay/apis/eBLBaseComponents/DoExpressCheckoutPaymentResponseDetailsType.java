package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.PaymentInfoType;
import urn.ebay.apis.eBLBaseComponents.UserSelectedOptionType;
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
 * The timestamped token value that was returned by
 * SetExpressCheckoutResponse and passed on
 * GetExpressCheckoutDetailsRequest. Character length and
 * limitations:20 single-byte characters 
 */
public class DoExpressCheckoutPaymentResponseDetailsType{


	/**
	 * The timestamped token value that was returned by
	 * SetExpressCheckoutResponse and passed on
	 * GetExpressCheckoutDetailsRequest. Character length and
	 * limitations:20 single-byte characters	 
	 */ 
	private String Token;

	/**
	 * Information about the transaction 	 
	 */ 
	private List<PaymentInfoType> PaymentInfo = new ArrayList<PaymentInfoType>();

	/**
	 * No Document Comments	 
	 */ 
	private String BillingAgreementID;

	/**
	 * No Document Comments	 
	 */ 
	private String RedirectRequired;

	/**
	 * Memo entered by sender in PayPal Review Page note field.
	 * Optional Character length and limitations: 255 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String Note;

	/**
	 * Redirect back to PayPal, PayPal can host the success page. 	 
	 */ 
	private String SuccessPageRedirectRequested;

	/**
	 * Information about the user selected options. 	 
	 */ 
	private UserSelectedOptionType UserSelectedOptions;

	

	/**
	 * Default Constructor
	 */
	public DoExpressCheckoutPaymentResponseDetailsType (){
	}	

	/**
	 * Getter for Token
	 */
	 public String getToken() {
	 	return Token;
	 }
	 
	/**
	 * Setter for Token
	 */
	 public void setToken(String Token) {
	 	this.Token = Token;
	 }
	 
	/**
	 * Getter for PaymentInfo
	 */
	 public List<PaymentInfoType> getPaymentInfo() {
	 	return PaymentInfo;
	 }
	 
	/**
	 * Setter for PaymentInfo
	 */
	 public void setPaymentInfo(List<PaymentInfoType> PaymentInfo) {
	 	this.PaymentInfo = PaymentInfo;
	 }
	 
	/**
	 * Getter for BillingAgreementID
	 */
	 public String getBillingAgreementID() {
	 	return BillingAgreementID;
	 }
	 
	/**
	 * Setter for BillingAgreementID
	 */
	 public void setBillingAgreementID(String BillingAgreementID) {
	 	this.BillingAgreementID = BillingAgreementID;
	 }
	 
	/**
	 * Getter for RedirectRequired
	 */
	 public String getRedirectRequired() {
	 	return RedirectRequired;
	 }
	 
	/**
	 * Setter for RedirectRequired
	 */
	 public void setRedirectRequired(String RedirectRequired) {
	 	this.RedirectRequired = RedirectRequired;
	 }
	 
	/**
	 * Getter for Note
	 */
	 public String getNote() {
	 	return Note;
	 }
	 
	/**
	 * Setter for Note
	 */
	 public void setNote(String Note) {
	 	this.Note = Note;
	 }
	 
	/**
	 * Getter for SuccessPageRedirectRequested
	 */
	 public String getSuccessPageRedirectRequested() {
	 	return SuccessPageRedirectRequested;
	 }
	 
	/**
	 * Setter for SuccessPageRedirectRequested
	 */
	 public void setSuccessPageRedirectRequested(String SuccessPageRedirectRequested) {
	 	this.SuccessPageRedirectRequested = SuccessPageRedirectRequested;
	 }
	 
	/**
	 * Getter for UserSelectedOptions
	 */
	 public UserSelectedOptionType getUserSelectedOptions() {
	 	return UserSelectedOptions;
	 }
	 
	/**
	 * Setter for UserSelectedOptions
	 */
	 public void setUserSelectedOptions(UserSelectedOptionType UserSelectedOptions) {
	 	this.UserSelectedOptions = UserSelectedOptions;
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
			return "&lt![CDATA[\" + n.getNodeValue() + \"]]&gt";
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
	
	public DoExpressCheckoutPaymentResponseDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("Token").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Token").item(0))) {
				this.Token = (String)document.getElementsByTagName("Token").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("PaymentInfo").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentInfo").item(0))) {
				nodeList = document.getElementsByTagName("PaymentInfo");
				for(int i=0; i < nodeList.getLength(); i++) {
					xmlString = convertToXML(nodeList.item(i));
					this.PaymentInfo.add(new PaymentInfoType(xmlString));
				}
			}
		}
		if (document.getElementsByTagName("BillingAgreementID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BillingAgreementID").item(0))) {
				this.BillingAgreementID = (String)document.getElementsByTagName("BillingAgreementID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("RedirectRequired").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("RedirectRequired").item(0))) {
				this.RedirectRequired = (String)document.getElementsByTagName("RedirectRequired").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Note").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Note").item(0))) {
				this.Note = (String)document.getElementsByTagName("Note").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("SuccessPageRedirectRequested").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SuccessPageRedirectRequested").item(0))) {
				this.SuccessPageRedirectRequested = (String)document.getElementsByTagName("SuccessPageRedirectRequested").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("UserSelectedOptions").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("UserSelectedOptions").item(0))) {
				nodeList = document.getElementsByTagName("UserSelectedOptions");
				xmlString = convertToXML(nodeList.item(0));
				this.UserSelectedOptions =  new UserSelectedOptionType(xmlString);
			}
		}
	}

}