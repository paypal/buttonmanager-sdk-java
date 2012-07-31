package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.MerchantPullStatusCodeType;
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
 * MerchantPullInfoType Information about the merchant pull. 
 */
public class MerchantPullInfoType{


	/**
	 * Current status of billing agreement 	 
	 */ 
	private MerchantPullStatusCodeType MpStatus;

	/**
	 * Monthly maximum payment amount	 
	 */ 
	private BasicAmountType MpMax;

	/**
	 * The value of the mp_custom variable that you specified in a
	 * FORM submission to PayPal during the creation or updating of
	 * a customer billing agreement 	 
	 */ 
	private String MpCustom;

	/**
	 * The value of the mp_desc variable (description of goods or
	 * services) associated with the billing agreement 	 
	 */ 
	private String Desc;

	/**
	 * Invoice value as set by BillUserRequest API call 	 
	 */ 
	private String Invoice;

	/**
	 * Custom field as set by BillUserRequest API call 	 
	 */ 
	private String Custom;

	/**
	 * Note: This field is no longer used and is always empty.	 
	 */ 
	private String PaymentSourceID;

	

	/**
	 * Default Constructor
	 */
	public MerchantPullInfoType (){
	}	

	/**
	 * Getter for MpStatus
	 */
	 public MerchantPullStatusCodeType getMpStatus() {
	 	return MpStatus;
	 }
	 
	/**
	 * Setter for MpStatus
	 */
	 public void setMpStatus(MerchantPullStatusCodeType MpStatus) {
	 	this.MpStatus = MpStatus;
	 }
	 
	/**
	 * Getter for MpMax
	 */
	 public BasicAmountType getMpMax() {
	 	return MpMax;
	 }
	 
	/**
	 * Setter for MpMax
	 */
	 public void setMpMax(BasicAmountType MpMax) {
	 	this.MpMax = MpMax;
	 }
	 
	/**
	 * Getter for MpCustom
	 */
	 public String getMpCustom() {
	 	return MpCustom;
	 }
	 
	/**
	 * Setter for MpCustom
	 */
	 public void setMpCustom(String MpCustom) {
	 	this.MpCustom = MpCustom;
	 }
	 
	/**
	 * Getter for Desc
	 */
	 public String getDesc() {
	 	return Desc;
	 }
	 
	/**
	 * Setter for Desc
	 */
	 public void setDesc(String Desc) {
	 	this.Desc = Desc;
	 }
	 
	/**
	 * Getter for Invoice
	 */
	 public String getInvoice() {
	 	return Invoice;
	 }
	 
	/**
	 * Setter for Invoice
	 */
	 public void setInvoice(String Invoice) {
	 	this.Invoice = Invoice;
	 }
	 
	/**
	 * Getter for Custom
	 */
	 public String getCustom() {
	 	return Custom;
	 }
	 
	/**
	 * Setter for Custom
	 */
	 public void setCustom(String Custom) {
	 	this.Custom = Custom;
	 }
	 
	/**
	 * Getter for PaymentSourceID
	 */
	 public String getPaymentSourceID() {
	 	return PaymentSourceID;
	 }
	 
	/**
	 * Setter for PaymentSourceID
	 */
	 public void setPaymentSourceID(String PaymentSourceID) {
	 	this.PaymentSourceID = PaymentSourceID;
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
	
	public MerchantPullInfoType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if(document.getElementsByTagName("MpStatus").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("MpStatus").item(0))) {
				this.MpStatus = MerchantPullStatusCodeType.fromValue(document.getElementsByTagName("MpStatus").item(0).getTextContent());
			}
		}
		if(document.getElementsByTagName("MpMax").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("MpMax").item(0))) {
				nodeList = document.getElementsByTagName("MpMax");
				xmlString = convertToXML(nodeList.item(0));
				this.MpMax =  new BasicAmountType(xmlString);
			}
		}
		if (document.getElementsByTagName("MpCustom").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("MpCustom").item(0))) {
				this.MpCustom = (String)document.getElementsByTagName("MpCustom").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Desc").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Desc").item(0))) {
				this.Desc = (String)document.getElementsByTagName("Desc").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Invoice").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Invoice").item(0))) {
				this.Invoice = (String)document.getElementsByTagName("Invoice").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Custom").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Custom").item(0))) {
				this.Custom = (String)document.getElementsByTagName("Custom").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("PaymentSourceID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentSourceID").item(0))) {
				this.PaymentSourceID = (String)document.getElementsByTagName("PaymentSourceID").item(0).getTextContent();
			}
		}
	
	}

}