package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.MerchantPullStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
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
public class BAUpdateResponseDetailsType{


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private String BillingAgreementID;

	/**
	 * No Document Comments	 
	 */ 
	private String BillingAgreementDescription;

	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private MerchantPullStatusCodeType BillingAgreementStatus;

	/**
	 * No Document Comments	 
	 */ 
	private String BillingAgreementCustom;

	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private PayerInfoType PayerInfo;

	/**
	 * No Document Comments	 
	 */ 
	private BasicAmountType BillingAgreementMax;

	/**
	 * Customer's billing address. Optional If you have credit card
	 * mapped in your account then billing address of the credit
	 * card is returned otherwise your primary address is returned
	 * , PayPal returns this address in BAUpdateResponseDetails. 	 
	 */ 
	private AddressType BillingAddress;

	

	/**
	 * Default Constructor
	 */
	public BAUpdateResponseDetailsType (){
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
	 * Getter for BillingAgreementDescription
	 */
	 public String getBillingAgreementDescription() {
	 	return BillingAgreementDescription;
	 }
	 
	/**
	 * Setter for BillingAgreementDescription
	 */
	 public void setBillingAgreementDescription(String BillingAgreementDescription) {
	 	this.BillingAgreementDescription = BillingAgreementDescription;
	 }
	 
	/**
	 * Getter for BillingAgreementStatus
	 */
	 public MerchantPullStatusCodeType getBillingAgreementStatus() {
	 	return BillingAgreementStatus;
	 }
	 
	/**
	 * Setter for BillingAgreementStatus
	 */
	 public void setBillingAgreementStatus(MerchantPullStatusCodeType BillingAgreementStatus) {
	 	this.BillingAgreementStatus = BillingAgreementStatus;
	 }
	 
	/**
	 * Getter for BillingAgreementCustom
	 */
	 public String getBillingAgreementCustom() {
	 	return BillingAgreementCustom;
	 }
	 
	/**
	 * Setter for BillingAgreementCustom
	 */
	 public void setBillingAgreementCustom(String BillingAgreementCustom) {
	 	this.BillingAgreementCustom = BillingAgreementCustom;
	 }
	 
	/**
	 * Getter for PayerInfo
	 */
	 public PayerInfoType getPayerInfo() {
	 	return PayerInfo;
	 }
	 
	/**
	 * Setter for PayerInfo
	 */
	 public void setPayerInfo(PayerInfoType PayerInfo) {
	 	this.PayerInfo = PayerInfo;
	 }
	 
	/**
	 * Getter for BillingAgreementMax
	 */
	 public BasicAmountType getBillingAgreementMax() {
	 	return BillingAgreementMax;
	 }
	 
	/**
	 * Setter for BillingAgreementMax
	 */
	 public void setBillingAgreementMax(BasicAmountType BillingAgreementMax) {
	 	this.BillingAgreementMax = BillingAgreementMax;
	 }
	 
	/**
	 * Getter for BillingAddress
	 */
	 public AddressType getBillingAddress() {
	 	return BillingAddress;
	 }
	 
	/**
	 * Setter for BillingAddress
	 */
	 public void setBillingAddress(AddressType BillingAddress) {
	 	this.BillingAddress = BillingAddress;
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
	
	public BAUpdateResponseDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
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
	
		if (document.getElementsByTagName("BillingAgreementDescription").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BillingAgreementDescription").item(0))) {
				this.BillingAgreementDescription = (String)document.getElementsByTagName("BillingAgreementDescription").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("BillingAgreementStatus").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BillingAgreementStatus").item(0))) {
				this.BillingAgreementStatus = MerchantPullStatusCodeType.fromValue(document.getElementsByTagName("BillingAgreementStatus").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("BillingAgreementCustom").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BillingAgreementCustom").item(0))) {
				this.BillingAgreementCustom = (String)document.getElementsByTagName("BillingAgreementCustom").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("PayerInfo").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PayerInfo").item(0))) {
				nodeList = document.getElementsByTagName("PayerInfo");
				xmlString = convertToXML(nodeList.item(0));
				this.PayerInfo =  new PayerInfoType(xmlString);
			}
		}
		if(document.getElementsByTagName("BillingAgreementMax").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BillingAgreementMax").item(0))) {
				nodeList = document.getElementsByTagName("BillingAgreementMax");
				xmlString = convertToXML(nodeList.item(0));
				this.BillingAgreementMax =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("BillingAddress").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BillingAddress").item(0))) {
				nodeList = document.getElementsByTagName("BillingAddress");
				xmlString = convertToXML(nodeList.item(0));
				this.BillingAddress =  new AddressType(xmlString);
			}
		}
	}

}