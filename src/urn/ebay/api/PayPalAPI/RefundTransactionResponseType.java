package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.RefundInfoType;
import urn.ebay.apis.eBLBaseComponents.AbstractResponseType;
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
 * Unique transaction ID of the refund. Character length and
 * limitations:17 single-byte characters 
 */
public class RefundTransactionResponseType extends AbstractResponseType {


	/**
	 * Unique transaction ID of the refund. Character length and
	 * limitations:17 single-byte characters	 
	 */ 
	private String RefundTransactionID;

	/**
	 * Amount subtracted from PayPal balance of original recipient
	 * of payment to make this refund 	 
	 */ 
	private BasicAmountType NetRefundAmount;

	/**
	 * Transaction fee refunded to original recipient of payment 	 
	 */ 
	private BasicAmountType FeeRefundAmount;

	/**
	 * Amount of money refunded to original payer 	 
	 */ 
	private BasicAmountType GrossRefundAmount;

	/**
	 * Total of all previous refunds	 
	 */ 
	private BasicAmountType TotalRefundedAmount;

	/**
	 * Contains Refund Payment status information.	 
	 */ 
	private RefundInfoType RefundInfo;

	/**
	 * Any general information like offer details that is
	 * reinstated or any other marketing data	 
	 */ 
	private String ReceiptData;

	/**
	 * Return msgsubid back to merchant	 
	 */ 
	private String MsgSubID;

	

	/**
	 * Default Constructor
	 */
	public RefundTransactionResponseType (){
	}	

	/**
	 * Getter for RefundTransactionID
	 */
	 public String getRefundTransactionID() {
	 	return RefundTransactionID;
	 }
	 
	/**
	 * Setter for RefundTransactionID
	 */
	 public void setRefundTransactionID(String RefundTransactionID) {
	 	this.RefundTransactionID = RefundTransactionID;
	 }
	 
	/**
	 * Getter for NetRefundAmount
	 */
	 public BasicAmountType getNetRefundAmount() {
	 	return NetRefundAmount;
	 }
	 
	/**
	 * Setter for NetRefundAmount
	 */
	 public void setNetRefundAmount(BasicAmountType NetRefundAmount) {
	 	this.NetRefundAmount = NetRefundAmount;
	 }
	 
	/**
	 * Getter for FeeRefundAmount
	 */
	 public BasicAmountType getFeeRefundAmount() {
	 	return FeeRefundAmount;
	 }
	 
	/**
	 * Setter for FeeRefundAmount
	 */
	 public void setFeeRefundAmount(BasicAmountType FeeRefundAmount) {
	 	this.FeeRefundAmount = FeeRefundAmount;
	 }
	 
	/**
	 * Getter for GrossRefundAmount
	 */
	 public BasicAmountType getGrossRefundAmount() {
	 	return GrossRefundAmount;
	 }
	 
	/**
	 * Setter for GrossRefundAmount
	 */
	 public void setGrossRefundAmount(BasicAmountType GrossRefundAmount) {
	 	this.GrossRefundAmount = GrossRefundAmount;
	 }
	 
	/**
	 * Getter for TotalRefundedAmount
	 */
	 public BasicAmountType getTotalRefundedAmount() {
	 	return TotalRefundedAmount;
	 }
	 
	/**
	 * Setter for TotalRefundedAmount
	 */
	 public void setTotalRefundedAmount(BasicAmountType TotalRefundedAmount) {
	 	this.TotalRefundedAmount = TotalRefundedAmount;
	 }
	 
	/**
	 * Getter for RefundInfo
	 */
	 public RefundInfoType getRefundInfo() {
	 	return RefundInfo;
	 }
	 
	/**
	 * Setter for RefundInfo
	 */
	 public void setRefundInfo(RefundInfoType RefundInfo) {
	 	this.RefundInfo = RefundInfo;
	 }
	 
	/**
	 * Getter for ReceiptData
	 */
	 public String getReceiptData() {
	 	return ReceiptData;
	 }
	 
	/**
	 * Setter for ReceiptData
	 */
	 public void setReceiptData(String ReceiptData) {
	 	this.ReceiptData = ReceiptData;
	 }
	 
	/**
	 * Getter for MsgSubID
	 */
	 public String getMsgSubID() {
	 	return MsgSubID;
	 }
	 
	/**
	 * Setter for MsgSubID
	 */
	 public void setMsgSubID(String MsgSubID) {
	 	this.MsgSubID = MsgSubID;
	 }
	 


	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else if (n.getNodeType() == Node.ELEMENT_NODE ){
			return (n.getChildNodes().getLength() == 0);
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
	
	public RefundTransactionResponseType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		super(xmlSoap);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("RefundTransactionID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("RefundTransactionID").item(0))) {
				this.RefundTransactionID = (String)document.getElementsByTagName("RefundTransactionID").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("NetRefundAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("NetRefundAmount").item(0))) {
				nodeList = document.getElementsByTagName("NetRefundAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.NetRefundAmount =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("FeeRefundAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("FeeRefundAmount").item(0))) {
				nodeList = document.getElementsByTagName("FeeRefundAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.FeeRefundAmount =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("GrossRefundAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("GrossRefundAmount").item(0))) {
				nodeList = document.getElementsByTagName("GrossRefundAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.GrossRefundAmount =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("TotalRefundedAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TotalRefundedAmount").item(0))) {
				nodeList = document.getElementsByTagName("TotalRefundedAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.TotalRefundedAmount =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("RefundInfo").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("RefundInfo").item(0))) {
				nodeList = document.getElementsByTagName("RefundInfo");
				xmlString = convertToXML(nodeList.item(0));
				this.RefundInfo =  new RefundInfoType(xmlString);
			}
		}
		if (document.getElementsByTagName("ReceiptData").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ReceiptData").item(0))) {
				this.ReceiptData = (String)document.getElementsByTagName("ReceiptData").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("MsgSubID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("MsgSubID").item(0))) {
				this.MsgSubID = (String)document.getElementsByTagName("MsgSubID").item(0).getTextContent();
			}
		}
	
	}
 
}