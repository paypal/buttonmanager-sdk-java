package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.OptionType;
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
 * PaymentItemType Information about a Payment Item. 
 */
public class PaymentItemType{


	/**
	 * eBay Auction Transaction ID of the Item Optional Character
	 * length and limitations: 255 single-byte characters 	 
	 */ 
	private String EbayItemTxnId;

	/**
	 * Item name set by you or entered by the customer. Character
	 * length and limitations: 127 single-byte alphanumeric
	 * characters	 
	 */ 
	private String Name;

	/**
	 * Item number set by you. Character length and limitations:
	 * 127 single-byte alphanumeric characters	 
	 */ 
	private String Number;

	/**
	 * Quantity set by you or entered by the customer. Character
	 * length and limitations: no limit	 
	 */ 
	private String Quantity;

	/**
	 * Amount of tax charged on payment 	 
	 */ 
	private String SalesTax;

	/**
	 * Amount of shipping charged on payment 	 
	 */ 
	private String ShippingAmount;

	/**
	 * Amount of handling charged on payment 	 
	 */ 
	private String HandlingAmount;

	/**
	 * Coupon ID Number 	 
	 */ 
	private String CouponID;

	/**
	 * Amount Value of The Coupon 	 
	 */ 
	private String CouponAmount;

	/**
	 * Currency of the Coupon Amount 	 
	 */ 
	private String CouponAmountCurrency;

	/**
	 * Amount of Discount on this Loyalty Card	 
	 */ 
	private String LoyaltyCardDiscountAmount;

	/**
	 * Currency of the Discount	 
	 */ 
	private String LoyaltyCardDiscountCurrency;

	/**
	 * Cost of item 	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * Item options selected in PayPal shopping cart 	 
	 */ 
	private List<OptionType> Options = new ArrayList<OptionType>();

	

	/**
	 * Default Constructor
	 */
	public PaymentItemType (){
	}	

	/**
	 * Getter for EbayItemTxnId
	 */
	 public String getEbayItemTxnId() {
	 	return EbayItemTxnId;
	 }
	 
	/**
	 * Setter for EbayItemTxnId
	 */
	 public void setEbayItemTxnId(String EbayItemTxnId) {
	 	this.EbayItemTxnId = EbayItemTxnId;
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
	 * Getter for Number
	 */
	 public String getNumber() {
	 	return Number;
	 }
	 
	/**
	 * Setter for Number
	 */
	 public void setNumber(String Number) {
	 	this.Number = Number;
	 }
	 
	/**
	 * Getter for Quantity
	 */
	 public String getQuantity() {
	 	return Quantity;
	 }
	 
	/**
	 * Setter for Quantity
	 */
	 public void setQuantity(String Quantity) {
	 	this.Quantity = Quantity;
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
	 * Getter for ShippingAmount
	 */
	 public String getShippingAmount() {
	 	return ShippingAmount;
	 }
	 
	/**
	 * Setter for ShippingAmount
	 */
	 public void setShippingAmount(String ShippingAmount) {
	 	this.ShippingAmount = ShippingAmount;
	 }
	 
	/**
	 * Getter for HandlingAmount
	 */
	 public String getHandlingAmount() {
	 	return HandlingAmount;
	 }
	 
	/**
	 * Setter for HandlingAmount
	 */
	 public void setHandlingAmount(String HandlingAmount) {
	 	this.HandlingAmount = HandlingAmount;
	 }
	 
	/**
	 * Getter for CouponID
	 */
	 public String getCouponID() {
	 	return CouponID;
	 }
	 
	/**
	 * Setter for CouponID
	 */
	 public void setCouponID(String CouponID) {
	 	this.CouponID = CouponID;
	 }
	 
	/**
	 * Getter for CouponAmount
	 */
	 public String getCouponAmount() {
	 	return CouponAmount;
	 }
	 
	/**
	 * Setter for CouponAmount
	 */
	 public void setCouponAmount(String CouponAmount) {
	 	this.CouponAmount = CouponAmount;
	 }
	 
	/**
	 * Getter for CouponAmountCurrency
	 */
	 public String getCouponAmountCurrency() {
	 	return CouponAmountCurrency;
	 }
	 
	/**
	 * Setter for CouponAmountCurrency
	 */
	 public void setCouponAmountCurrency(String CouponAmountCurrency) {
	 	this.CouponAmountCurrency = CouponAmountCurrency;
	 }
	 
	/**
	 * Getter for LoyaltyCardDiscountAmount
	 */
	 public String getLoyaltyCardDiscountAmount() {
	 	return LoyaltyCardDiscountAmount;
	 }
	 
	/**
	 * Setter for LoyaltyCardDiscountAmount
	 */
	 public void setLoyaltyCardDiscountAmount(String LoyaltyCardDiscountAmount) {
	 	this.LoyaltyCardDiscountAmount = LoyaltyCardDiscountAmount;
	 }
	 
	/**
	 * Getter for LoyaltyCardDiscountCurrency
	 */
	 public String getLoyaltyCardDiscountCurrency() {
	 	return LoyaltyCardDiscountCurrency;
	 }
	 
	/**
	 * Setter for LoyaltyCardDiscountCurrency
	 */
	 public void setLoyaltyCardDiscountCurrency(String LoyaltyCardDiscountCurrency) {
	 	this.LoyaltyCardDiscountCurrency = LoyaltyCardDiscountCurrency;
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
	 * Getter for Options
	 */
	 public List<OptionType> getOptions() {
	 	return Options;
	 }
	 
	/**
	 * Setter for Options
	 */
	 public void setOptions(List<OptionType> Options) {
	 	this.Options = Options;
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
	
	public PaymentItemType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("EbayItemTxnId").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("EbayItemTxnId").item(0))) {
				this.EbayItemTxnId = (String)document.getElementsByTagName("EbayItemTxnId").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Name").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Name").item(0))) {
				this.Name = (String)document.getElementsByTagName("Name").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Number").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Number").item(0))) {
				this.Number = (String)document.getElementsByTagName("Number").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Quantity").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Quantity").item(0))) {
				this.Quantity = (String)document.getElementsByTagName("Quantity").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("SalesTax").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SalesTax").item(0))) {
				this.SalesTax = (String)document.getElementsByTagName("SalesTax").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ShippingAmount").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ShippingAmount").item(0))) {
				this.ShippingAmount = (String)document.getElementsByTagName("ShippingAmount").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("HandlingAmount").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("HandlingAmount").item(0))) {
				this.HandlingAmount = (String)document.getElementsByTagName("HandlingAmount").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("CouponID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("CouponID").item(0))) {
				this.CouponID = (String)document.getElementsByTagName("CouponID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("CouponAmount").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("CouponAmount").item(0))) {
				this.CouponAmount = (String)document.getElementsByTagName("CouponAmount").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("CouponAmountCurrency").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("CouponAmountCurrency").item(0))) {
				this.CouponAmountCurrency = (String)document.getElementsByTagName("CouponAmountCurrency").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("LoyaltyCardDiscountAmount").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("LoyaltyCardDiscountAmount").item(0))) {
				this.LoyaltyCardDiscountAmount = (String)document.getElementsByTagName("LoyaltyCardDiscountAmount").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("LoyaltyCardDiscountCurrency").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("LoyaltyCardDiscountCurrency").item(0))) {
				this.LoyaltyCardDiscountCurrency = (String)document.getElementsByTagName("LoyaltyCardDiscountCurrency").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("Amount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Amount").item(0))) {
				nodeList = document.getElementsByTagName("Amount");
				xmlString = convertToXML(nodeList.item(0));
				this.Amount =  new BasicAmountType(xmlString);
			}
		}
		if (document.getElementsByTagName("Options").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Options").item(0))) {
				nodeList = document.getElementsByTagName("Options");
				for(int i=0; i < nodeList.getLength(); i++) {
					xmlString = convertToXML(nodeList.item(i));
					this.Options.add(new OptionType(xmlString));
				}
			}
		}
	}

}