package urn.ebay.apis.eBLBaseComponents;
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
 * PaymentTransactionSearchResultType Results from a
 * PaymentTransaction search 
 */
public class PaymentTransactionSearchResultType{


	/**
	 * The date and time (in UTC/GMT format) the transaction
	 * occurred	 
	 */ 
	private String Timestamp;

	/**
	 * The time zone of the transaction 	 
	 */ 
	private String Timezone;

	/**
	 * The type of the transaction	 
	 */ 
	private String Type;

	/**
	 * The email address of the payer	 
	 */ 
	private String Payer;

	/**
	 * Display name of the payer	 
	 */ 
	private String PayerDisplayName;

	/**
	 * The transaction ID of the seller	 
	 */ 
	private String TransactionID;

	/**
	 * The status of the transaction	 
	 */ 
	private String Status;

	/**
	 * The total gross amount charged, including any profile
	 * shipping cost and taxes	 
	 */ 
	private BasicAmountType GrossAmount;

	/**
	 * The fee that PayPal charged for the transaction 	 
	 */ 
	private BasicAmountType FeeAmount;

	/**
	 * The net amount of the transaction 	 
	 */ 
	private BasicAmountType NetAmount;

	

	/**
	 * Default Constructor
	 */
	public PaymentTransactionSearchResultType (){
	}	

	/**
	 * Getter for Timestamp
	 */
	 public String getTimestamp() {
	 	return Timestamp;
	 }
	 
	/**
	 * Setter for Timestamp
	 */
	 public void setTimestamp(String Timestamp) {
	 	this.Timestamp = Timestamp;
	 }
	 
	/**
	 * Getter for Timezone
	 */
	 public String getTimezone() {
	 	return Timezone;
	 }
	 
	/**
	 * Setter for Timezone
	 */
	 public void setTimezone(String Timezone) {
	 	this.Timezone = Timezone;
	 }
	 
	/**
	 * Getter for Type
	 */
	 public String getType() {
	 	return Type;
	 }
	 
	/**
	 * Setter for Type
	 */
	 public void setType(String Type) {
	 	this.Type = Type;
	 }
	 
	/**
	 * Getter for Payer
	 */
	 public String getPayer() {
	 	return Payer;
	 }
	 
	/**
	 * Setter for Payer
	 */
	 public void setPayer(String Payer) {
	 	this.Payer = Payer;
	 }
	 
	/**
	 * Getter for PayerDisplayName
	 */
	 public String getPayerDisplayName() {
	 	return PayerDisplayName;
	 }
	 
	/**
	 * Setter for PayerDisplayName
	 */
	 public void setPayerDisplayName(String PayerDisplayName) {
	 	this.PayerDisplayName = PayerDisplayName;
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
	 * Getter for Status
	 */
	 public String getStatus() {
	 	return Status;
	 }
	 
	/**
	 * Setter for Status
	 */
	 public void setStatus(String Status) {
	 	this.Status = Status;
	 }
	 
	/**
	 * Getter for GrossAmount
	 */
	 public BasicAmountType getGrossAmount() {
	 	return GrossAmount;
	 }
	 
	/**
	 * Setter for GrossAmount
	 */
	 public void setGrossAmount(BasicAmountType GrossAmount) {
	 	this.GrossAmount = GrossAmount;
	 }
	 
	/**
	 * Getter for FeeAmount
	 */
	 public BasicAmountType getFeeAmount() {
	 	return FeeAmount;
	 }
	 
	/**
	 * Setter for FeeAmount
	 */
	 public void setFeeAmount(BasicAmountType FeeAmount) {
	 	this.FeeAmount = FeeAmount;
	 }
	 
	/**
	 * Getter for NetAmount
	 */
	 public BasicAmountType getNetAmount() {
	 	return NetAmount;
	 }
	 
	/**
	 * Setter for NetAmount
	 */
	 public void setNetAmount(BasicAmountType NetAmount) {
	 	this.NetAmount = NetAmount;
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
	
	public PaymentTransactionSearchResultType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("Timestamp").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Timestamp").item(0))) {
				this.Timestamp = (String)document.getElementsByTagName("Timestamp").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Timezone").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Timezone").item(0))) {
				this.Timezone = (String)document.getElementsByTagName("Timezone").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Type").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Type").item(0))) {
				this.Type = (String)document.getElementsByTagName("Type").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Payer").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Payer").item(0))) {
				this.Payer = (String)document.getElementsByTagName("Payer").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("PayerDisplayName").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PayerDisplayName").item(0))) {
				this.PayerDisplayName = (String)document.getElementsByTagName("PayerDisplayName").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("TransactionID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TransactionID").item(0))) {
				this.TransactionID = (String)document.getElementsByTagName("TransactionID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Status").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Status").item(0))) {
				this.Status = (String)document.getElementsByTagName("Status").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("GrossAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("GrossAmount").item(0))) {
				nodeList = document.getElementsByTagName("GrossAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.GrossAmount =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("FeeAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("FeeAmount").item(0))) {
				nodeList = document.getElementsByTagName("FeeAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.FeeAmount =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("NetAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("NetAmount").item(0))) {
				nodeList = document.getElementsByTagName("NetAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.NetAmount =  new BasicAmountType(xmlString);
			}
		}
	}

}