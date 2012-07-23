package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PaymentInfoType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
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
 * No Document Comments
 */
public class DoReferenceTransactionResponseDetailsType{


	/**
	 * No Document Comments	 
	 */ 
	private String BillingAgreementID;

	/**
	 * No Document Comments	 
	 */ 
	private PaymentInfoType PaymentInfo;

	/**
	 * No Document Comments	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * No Document Comments	 
	 */ 
	private String AVSCode;

	/**
	 * No Document Comments	 
	 */ 
	private String CVV2Code;

	/**
	 * No Document Comments	 
	 */ 
	private String TransactionID;

	/**
	 * Response code from the processor when a recurring
	 * transaction is declined 	 
	 */ 
	private String PaymentAdviceCode;

	

	/**
	 * Default Constructor
	 */
	public DoReferenceTransactionResponseDetailsType (){
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
	 * Getter for PaymentInfo
	 */
	 public PaymentInfoType getPaymentInfo() {
	 	return PaymentInfo;
	 }
	 
	/**
	 * Setter for PaymentInfo
	 */
	 public void setPaymentInfo(PaymentInfoType PaymentInfo) {
	 	this.PaymentInfo = PaymentInfo;
	 }
	 
	/**
	 * Getter for Amount
	 */
	 public BasicAmountType getAmount() {
	 	return Amount;
	 }
	 
	/**
	 * Setter for Amount
	 */
	 public void setAmount(BasicAmountType Amount) {
	 	this.Amount = Amount;
	 }
	 
	/**
	 * Getter for AVSCode
	 */
	 public String getAVSCode() {
	 	return AVSCode;
	 }
	 
	/**
	 * Setter for AVSCode
	 */
	 public void setAVSCode(String AVSCode) {
	 	this.AVSCode = AVSCode;
	 }
	 
	/**
	 * Getter for CVV2Code
	 */
	 public String getCVV2Code() {
	 	return CVV2Code;
	 }
	 
	/**
	 * Setter for CVV2Code
	 */
	 public void setCVV2Code(String CVV2Code) {
	 	this.CVV2Code = CVV2Code;
	 }
	 
	/**
	 * Getter for TransactionID
	 */
	 public String getTransactionID() {
	 	return TransactionID;
	 }
	 
	/**
	 * Setter for TransactionID
	 */
	 public void setTransactionID(String TransactionID) {
	 	this.TransactionID = TransactionID;
	 }
	 
	/**
	 * Getter for PaymentAdviceCode
	 */
	 public String getPaymentAdviceCode() {
	 	return PaymentAdviceCode;
	 }
	 
	/**
	 * Setter for PaymentAdviceCode
	 */
	 public void setPaymentAdviceCode(String PaymentAdviceCode) {
	 	this.PaymentAdviceCode = PaymentAdviceCode;
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
	
	public DoReferenceTransactionResponseDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("BillingAgreementID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BillingAgreementID").item(0))) {
				this.BillingAgreementID = (String)document.getElementsByTagName("BillingAgreementID").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("PaymentInfo").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentInfo").item(0))) {
				nodeList = document.getElementsByTagName("PaymentInfo");
				xmlString = convertToXML(nodeList.item(0));
				this.PaymentInfo =  new PaymentInfoType(xmlString);
			}
		}
		if(document.getElementsByTagName("Amount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Amount").item(0))) {
				nodeList = document.getElementsByTagName("Amount");
				xmlString = convertToXML(nodeList.item(0));
				this.Amount =  new BasicAmountType(xmlString);
			}
		}
		if (document.getElementsByTagName("AVSCode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("AVSCode").item(0))) {
				this.AVSCode = (String)document.getElementsByTagName("AVSCode").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("CVV2Code").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("CVV2Code").item(0))) {
				this.CVV2Code = (String)document.getElementsByTagName("CVV2Code").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("TransactionID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TransactionID").item(0))) {
				this.TransactionID = (String)document.getElementsByTagName("TransactionID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("PaymentAdviceCode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentAdviceCode").item(0))) {
				this.PaymentAdviceCode = (String)document.getElementsByTagName("PaymentAdviceCode").item(0).getTextContent();
			}
		}
	
	}

}