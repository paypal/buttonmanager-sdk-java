package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.EbayItemPaymentDetailsItemType;
import urn.ebay.apis.eBLBaseComponents.ProductCategoryType;
import urn.ebay.apis.CoreComponentTypes.MeasureType;
import urn.ebay.apis.EnhancedDataTypes.EnhancedItemDataType;
import urn.ebay.apis.eBLBaseComponents.ItemCategoryType;
import com.paypal.core.SDKUtil;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
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
 * PaymentDetailsItemType Information about a Payment Item. 
 */
public class PaymentDetailsItemType{


	/**
	 * Item name. Optional Character length and limitations: 127
	 * single-byte characters	 
	 */ 
	private String Name;

	/**
	 * Item number. Optional Character length and limitations: 127
	 * single-byte characters	 
	 */ 
	private String Number;

	/**
	 * Item quantity. Optional Character length and limitations:
	 * Any positive integer	 
	 */ 
	private Integer Quantity;

	/**
	 * Item sales tax. Optional Character length and limitations:
	 * any valid currency amount; currency code is set the same as
	 * for OrderTotal.	 
	 */ 
	private BasicAmountType Tax;

	/**
	 * Cost of item You must set the currencyID attribute to one of
	 * the three-character currency codes for any of the supported
	 * PayPal currencies. Optional Limitations: Must not exceed
	 * $10,000 USD in any currency. No currency symbol. Decimal
	 * separator must be a period (.), and the thousands separator
	 * must be a comma (,).	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * Ebay specific details. Optional 	 
	 */ 
	private EbayItemPaymentDetailsItemType EbayItemPaymentDetailsItem;

	/**
	 * Promotional financing code for item. Part of the Merchant
	 * Services Promotion Financing feature. 	 
	 */ 
	private String PromoCode;

	/**
	 * 	 
	 */ 
	private ProductCategoryType ProductCategory;

	/**
	 * Item description. Optional Character length and limitations:
	 * 127 single-byte characters 	 
	 */ 
	private String Description;

	/**
	 * Information about the Item weight. 	 
	 */ 
	private MeasureType ItemWeight;

	/**
	 * Information about the Item length. 	 
	 */ 
	private MeasureType ItemLength;

	/**
	 * Information about the Item width. 	 
	 */ 
	private MeasureType ItemWidth;

	/**
	 * Information about the Item height. 	 
	 */ 
	private MeasureType ItemHeight;

	/**
	 * URL for the item. Optional Character length and limitations:
	 * no limit. 	 
	 */ 
	private String ItemURL;

	/**
	 * Enhanced data for each item in the cart. Optional 	 
	 */ 
	private EnhancedItemDataType EnhancedItemData;

	/**
	 * Item category - physical or digital. Optional 	 
	 */ 
	private ItemCategoryType ItemCategory;

	

	/**
	 * Default Constructor
	 */
	public PaymentDetailsItemType (){
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
	 public Integer getQuantity() {
	 	return Quantity;
	 }
	 
	/**
	 * Setter for Quantity
	 */
	 public void setQuantity(Integer Quantity) {
	 	this.Quantity = Quantity;
	 }
	 
	/**
	 * Getter for Tax
	 */
	 public BasicAmountType getTax() {
	 	return Tax;
	 }
	 
	/**
	 * Setter for Tax
	 */
	 public void setTax(BasicAmountType Tax) {
	 	this.Tax = Tax;
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
	 * Getter for EbayItemPaymentDetailsItem
	 */
	 public EbayItemPaymentDetailsItemType getEbayItemPaymentDetailsItem() {
	 	return EbayItemPaymentDetailsItem;
	 }
	 
	/**
	 * Setter for EbayItemPaymentDetailsItem
	 */
	 public void setEbayItemPaymentDetailsItem(EbayItemPaymentDetailsItemType EbayItemPaymentDetailsItem) {
	 	this.EbayItemPaymentDetailsItem = EbayItemPaymentDetailsItem;
	 }
	 
	/**
	 * Getter for PromoCode
	 */
	 public String getPromoCode() {
	 	return PromoCode;
	 }
	 
	/**
	 * Setter for PromoCode
	 */
	 public void setPromoCode(String PromoCode) {
	 	this.PromoCode = PromoCode;
	 }
	 
	/**
	 * Getter for ProductCategory
	 */
	 public ProductCategoryType getProductCategory() {
	 	return ProductCategory;
	 }
	 
	/**
	 * Setter for ProductCategory
	 */
	 public void setProductCategory(ProductCategoryType ProductCategory) {
	 	this.ProductCategory = ProductCategory;
	 }
	 
	/**
	 * Getter for Description
	 */
	 public String getDescription() {
	 	return Description;
	 }
	 
	/**
	 * Setter for Description
	 */
	 public void setDescription(String Description) {
	 	this.Description = Description;
	 }
	 
	/**
	 * Getter for ItemWeight
	 */
	 public MeasureType getItemWeight() {
	 	return ItemWeight;
	 }
	 
	/**
	 * Setter for ItemWeight
	 */
	 public void setItemWeight(MeasureType ItemWeight) {
	 	this.ItemWeight = ItemWeight;
	 }
	 
	/**
	 * Getter for ItemLength
	 */
	 public MeasureType getItemLength() {
	 	return ItemLength;
	 }
	 
	/**
	 * Setter for ItemLength
	 */
	 public void setItemLength(MeasureType ItemLength) {
	 	this.ItemLength = ItemLength;
	 }
	 
	/**
	 * Getter for ItemWidth
	 */
	 public MeasureType getItemWidth() {
	 	return ItemWidth;
	 }
	 
	/**
	 * Setter for ItemWidth
	 */
	 public void setItemWidth(MeasureType ItemWidth) {
	 	this.ItemWidth = ItemWidth;
	 }
	 
	/**
	 * Getter for ItemHeight
	 */
	 public MeasureType getItemHeight() {
	 	return ItemHeight;
	 }
	 
	/**
	 * Setter for ItemHeight
	 */
	 public void setItemHeight(MeasureType ItemHeight) {
	 	this.ItemHeight = ItemHeight;
	 }
	 
	/**
	 * Getter for ItemURL
	 */
	 public String getItemURL() {
	 	return ItemURL;
	 }
	 
	/**
	 * Setter for ItemURL
	 */
	 public void setItemURL(String ItemURL) {
	 	this.ItemURL = ItemURL;
	 }
	 
	/**
	 * Getter for EnhancedItemData
	 */
	 public EnhancedItemDataType getEnhancedItemData() {
	 	return EnhancedItemData;
	 }
	 
	/**
	 * Setter for EnhancedItemData
	 */
	 public void setEnhancedItemData(EnhancedItemDataType EnhancedItemData) {
	 	this.EnhancedItemData = EnhancedItemData;
	 }
	 
	/**
	 * Getter for ItemCategory
	 */
	 public ItemCategoryType getItemCategory() {
	 	return ItemCategory;
	 }
	 
	/**
	 * Setter for ItemCategory
	 */
	 public void setItemCategory(ItemCategoryType ItemCategory) {
	 	this.ItemCategory = ItemCategory;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Name != null) {
			sb.append("<ebl:Name>").append(SDKUtil.escapeInvalidXmlCharsRegex(Name));
			sb.append("</ebl:Name>");
		}
		if(Number != null) {
			sb.append("<ebl:Number>").append(SDKUtil.escapeInvalidXmlCharsRegex(Number));
			sb.append("</ebl:Number>");
		}
		if(Quantity != null) {
			sb.append("<ebl:Quantity>").append(SDKUtil.escapeInvalidXmlCharsRegex(Quantity));
			sb.append("</ebl:Quantity>");
		}
		if(Tax != null) {
			sb.append("<ebl:Tax");
			sb.append(Tax.toXMLString());
			sb.append("</ebl:Tax>");
		}
		if(Amount != null) {
			sb.append("<ebl:Amount");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		if(EbayItemPaymentDetailsItem != null) {
			sb.append("<ebl:EbayItemPaymentDetailsItem>");
			sb.append(EbayItemPaymentDetailsItem.toXMLString());
			sb.append("</ebl:EbayItemPaymentDetailsItem>");
		}
		if(PromoCode != null) {
			sb.append("<ebl:PromoCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(PromoCode));
			sb.append("</ebl:PromoCode>");
		}
		if(ProductCategory != null) {
			sb.append("<ebl:ProductCategory>").append(SDKUtil.escapeInvalidXmlCharsRegex(ProductCategory.getValue()));
			sb.append("</ebl:ProductCategory>");
		}
		if(Description != null) {
			sb.append("<ebl:Description>").append(SDKUtil.escapeInvalidXmlCharsRegex(Description));
			sb.append("</ebl:Description>");
		}
		if(ItemWeight != null) {
			sb.append("<ebl:ItemWeight");
			sb.append(ItemWeight.toXMLString());
			sb.append("</ebl:ItemWeight>");
		}
		if(ItemLength != null) {
			sb.append("<ebl:ItemLength");
			sb.append(ItemLength.toXMLString());
			sb.append("</ebl:ItemLength>");
		}
		if(ItemWidth != null) {
			sb.append("<ebl:ItemWidth");
			sb.append(ItemWidth.toXMLString());
			sb.append("</ebl:ItemWidth>");
		}
		if(ItemHeight != null) {
			sb.append("<ebl:ItemHeight");
			sb.append(ItemHeight.toXMLString());
			sb.append("</ebl:ItemHeight>");
		}
		if(ItemURL != null) {
			sb.append("<ebl:ItemURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemURL));
			sb.append("</ebl:ItemURL>");
		}
		if(EnhancedItemData != null) {
			sb.append("<ebl:EnhancedItemData>");
			sb.append(EnhancedItemData.toXMLString());
			sb.append("</ebl:EnhancedItemData>");
		}
		if(ItemCategory != null) {
			sb.append("<ebl:ItemCategory>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemCategory.getValue()));
			sb.append("</ebl:ItemCategory>");
		}
		return sb.toString();
	}
	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else if (n.getNodeType() == Node.ELEMENT_NODE ) {
			return (n.getChildNodes().getLength() == 0);
		} else {
			return false;
		}
	}
	
	public PaymentDetailsItemType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Name", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Name = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Number", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Number = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Quantity", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.Quantity = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("Tax", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Tax =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("Amount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Amount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("EbayItemPaymentDetailsItem", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.EbayItemPaymentDetailsItem =  new EbayItemPaymentDetailsItemType(childNode);
		}
		childNode = (Node) xpath.evaluate("PromoCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PromoCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProductCategory", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ProductCategory = ProductCategoryType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("Description", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Description = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemWeight", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ItemWeight =  new MeasureType(childNode);
		}
		childNode = (Node) xpath.evaluate("ItemLength", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ItemLength =  new MeasureType(childNode);
		}
		childNode = (Node) xpath.evaluate("ItemWidth", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ItemWidth =  new MeasureType(childNode);
		}
		childNode = (Node) xpath.evaluate("ItemHeight", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ItemHeight =  new MeasureType(childNode);
		}
		childNode = (Node) xpath.evaluate("ItemURL", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ItemURL = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("EnhancedItemData", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.EnhancedItemData =  new EnhancedItemDataType(childNode);
		}
		childNode = (Node) xpath.evaluate("ItemCategory", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ItemCategory = ItemCategoryType.fromValue(childNode.getTextContent());
		}
	}
 
}