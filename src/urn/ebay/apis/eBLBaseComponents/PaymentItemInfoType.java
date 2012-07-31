package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.PaymentItemType;
import urn.ebay.apis.eBLBaseComponents.SubscriptionInfoType;
import urn.ebay.apis.eBLBaseComponents.AuctionInfoType;
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
 * PaymentItemInfoType Information about a PayPal item. 
 */
public class PaymentItemInfoType{


	/**
	 * Invoice number you set in the original transaction.
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String InvoiceID;

	/**
	 * Custom field you set in the original transaction. Character
	 * length and limitations: 127 single-byte alphanumeric
	 * characters	 
	 */ 
	private String Custom;

	/**
	 * Memo entered by your customer in PayPal Website Payments
	 * note field. Character length and limitations: 255
	 * single-byte alphanumeric characters	 
	 */ 
	private String Memo;

	/**
	 * Amount of tax charged on transaction	 
	 */ 
	private String SalesTax;

	/**
	 * Details about the indivudal purchased item	 
	 */ 
	private List<PaymentItemType> PaymentItem = new ArrayList<PaymentItemType>();

	/**
	 * Information about the transaction if it was created via
	 * PayPal Subcriptions	 
	 */ 
	private SubscriptionInfoType Subscription;

	/**
	 * Information about the transaction if it was created via an
	 * auction	 
	 */ 
	private AuctionInfoType Auction;

	

	/**
	 * Default Constructor
	 */
	public PaymentItemInfoType (){
	}	

	/**
	 * Getter for InvoiceID
	 */
	 public String getInvoiceID() {
	 	return InvoiceID;
	 }
	 
	/**
	 * Setter for InvoiceID
	 */
	 public void setInvoiceID(String InvoiceID) {
	 	this.InvoiceID = InvoiceID;
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
	 * Getter for Memo
	 */
	 public String getMemo() {
	 	return Memo;
	 }
	 
	/**
	 * Setter for Memo
	 */
	 public void setMemo(String Memo) {
	 	this.Memo = Memo;
	 }
	 
	/**
	 * Getter for SalesTax
	 */
	 public String getSalesTax() {
	 	return SalesTax;
	 }
	 
	/**
	 * Setter for SalesTax
	 */
	 public void setSalesTax(String SalesTax) {
	 	this.SalesTax = SalesTax;
	 }
	 
	/**
	 * Getter for PaymentItem
	 */
	 public List<PaymentItemType> getPaymentItem() {
	 	return PaymentItem;
	 }
	 
	/**
	 * Setter for PaymentItem
	 */
	 public void setPaymentItem(List<PaymentItemType> PaymentItem) {
	 	this.PaymentItem = PaymentItem;
	 }
	 
	/**
	 * Getter for Subscription
	 */
	 public SubscriptionInfoType getSubscription() {
	 	return Subscription;
	 }
	 
	/**
	 * Setter for Subscription
	 */
	 public void setSubscription(SubscriptionInfoType Subscription) {
	 	this.Subscription = Subscription;
	 }
	 
	/**
	 * Getter for Auction
	 */
	 public AuctionInfoType getAuction() {
	 	return Auction;
	 }
	 
	/**
	 * Setter for Auction
	 */
	 public void setAuction(AuctionInfoType Auction) {
	 	this.Auction = Auction;
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
	
	public PaymentItemInfoType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("InvoiceID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("InvoiceID").item(0))) {
				this.InvoiceID = (String)document.getElementsByTagName("InvoiceID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Custom").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Custom").item(0))) {
				this.Custom = (String)document.getElementsByTagName("Custom").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Memo").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Memo").item(0))) {
				this.Memo = (String)document.getElementsByTagName("Memo").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("SalesTax").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SalesTax").item(0))) {
				this.SalesTax = (String)document.getElementsByTagName("SalesTax").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("PaymentItem").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentItem").item(0))) {
				nodeList = document.getElementsByTagName("PaymentItem");
				for(int i=0; i < nodeList.getLength(); i++) {
					xmlString = convertToXML(nodeList.item(i));
					this.PaymentItem.add(new PaymentItemType(xmlString));
				}
			}
		}
		if(document.getElementsByTagName("Subscription").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Subscription").item(0))) {
				nodeList = document.getElementsByTagName("Subscription");
				xmlString = convertToXML(nodeList.item(0));
				this.Subscription =  new SubscriptionInfoType(xmlString);
			}
		}
		if(document.getElementsByTagName("Auction").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Auction").item(0))) {
				nodeList = document.getElementsByTagName("Auction");
				xmlString = convertToXML(nodeList.item(0));
				this.Auction =  new AuctionInfoType(xmlString);
			}
		}
	}

}