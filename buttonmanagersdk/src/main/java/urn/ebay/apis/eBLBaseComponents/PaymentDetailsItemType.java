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

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Item name. Optional Character length and limitations: 127
	 * single-byte characters	 
	 */ 
	private String name;

	/**
	 * Item number. Optional Character length and limitations: 127
	 * single-byte characters	 
	 */ 
	private String number;

	/**
	 * Item quantity. Optional Character length and limitations:
	 * Any positive integer	 
	 */ 
	private Integer quantity;

	/**
	 * Item sales tax. Optional Character length and limitations:
	 * any valid currency amount; currency code is set the same as
	 * for OrderTotal.	 
	 */ 
	private BasicAmountType tax;

	/**
	 * Cost of item You must set the currencyID attribute to one of
	 * the three-character currency codes for any of the supported
	 * PayPal currencies. Optional Limitations: Must not exceed
	 * $10,000 USD in any currency. No currency symbol. Decimal
	 * separator must be a period (.), and the thousands separator
	 * must be a comma (,).	 
	 */ 
	private BasicAmountType amount;

	/**
	 * Ebay specific details. Optional 	 
	 */ 
	private EbayItemPaymentDetailsItemType ebayItemPaymentDetailsItem;

	/**
	 * Promotional financing code for item. Part of the Merchant
	 * Services Promotion Financing feature. 	 
	 */ 
	private String promoCode;

	/**
	 * 	 
	 */ 
	private ProductCategoryType productCategory;

	/**
	 * Item description. Optional Character length and limitations:
	 * 127 single-byte characters 	 
	 */ 
	private String description;

	/**
	 * Information about the Item weight. 	 
	 */ 
	private MeasureType itemWeight;

	/**
	 * Information about the Item length. 	 
	 */ 
	private MeasureType itemLength;

	/**
	 * Information about the Item width. 	 
	 */ 
	private MeasureType itemWidth;

	/**
	 * Information about the Item height. 	 
	 */ 
	private MeasureType itemHeight;

	/**
	 * URL for the item. Optional Character length and limitations:
	 * no limit. 	 
	 */ 
	private String itemURL;

	/**
	 * Enhanced data for each item in the cart. Optional 	 
	 */ 
	private EnhancedItemDataType enhancedItemData;

	/**
	 * Item category - physical or digital. Optional 	 
	 */ 
	private ItemCategoryType itemCategory;

	

	/**
	 * Default Constructor
	 */
	public PaymentDetailsItemType (){
	}	

	/**
	 * Getter for name
	 */
	 public String getName() {
	 	return name;
	 }
	 
	/**
	 * Setter for name
	 */
	 public void setName(String name) {
	 	this.name = name;
	 }
	 
	/**
	 * Getter for number
	 */
	 public String getNumber() {
	 	return number;
	 }
	 
	/**
	 * Setter for number
	 */
	 public void setNumber(String number) {
	 	this.number = number;
	 }
	 
	/**
	 * Getter for quantity
	 */
	 public Integer getQuantity() {
	 	return quantity;
	 }
	 
	/**
	 * Setter for quantity
	 */
	 public void setQuantity(Integer quantity) {
	 	this.quantity = quantity;
	 }
	 
	/**
	 * Getter for tax
	 */
	 public BasicAmountType getTax() {
	 	return tax;
	 }
	 
	/**
	 * Setter for tax
	 */
	 public void setTax(BasicAmountType tax) {
	 	this.tax = tax;
	 }
	 
	/**
	 * Getter for amount
	 */
	 public BasicAmountType getAmount() {
	 	return amount;
	 }
	 
	/**
	 * Setter for amount
	 */
	 public void setAmount(BasicAmountType amount) {
	 	this.amount = amount;
	 }
	 
	/**
	 * Getter for ebayItemPaymentDetailsItem
	 */
	 public EbayItemPaymentDetailsItemType getEbayItemPaymentDetailsItem() {
	 	return ebayItemPaymentDetailsItem;
	 }
	 
	/**
	 * Setter for ebayItemPaymentDetailsItem
	 */
	 public void setEbayItemPaymentDetailsItem(EbayItemPaymentDetailsItemType ebayItemPaymentDetailsItem) {
	 	this.ebayItemPaymentDetailsItem = ebayItemPaymentDetailsItem;
	 }
	 
	/**
	 * Getter for promoCode
	 */
	 public String getPromoCode() {
	 	return promoCode;
	 }
	 
	/**
	 * Setter for promoCode
	 */
	 public void setPromoCode(String promoCode) {
	 	this.promoCode = promoCode;
	 }
	 
	/**
	 * Getter for productCategory
	 */
	 public ProductCategoryType getProductCategory() {
	 	return productCategory;
	 }
	 
	/**
	 * Setter for productCategory
	 */
	 public void setProductCategory(ProductCategoryType productCategory) {
	 	this.productCategory = productCategory;
	 }
	 
	/**
	 * Getter for description
	 */
	 public String getDescription() {
	 	return description;
	 }
	 
	/**
	 * Setter for description
	 */
	 public void setDescription(String description) {
	 	this.description = description;
	 }
	 
	/**
	 * Getter for itemWeight
	 */
	 public MeasureType getItemWeight() {
	 	return itemWeight;
	 }
	 
	/**
	 * Setter for itemWeight
	 */
	 public void setItemWeight(MeasureType itemWeight) {
	 	this.itemWeight = itemWeight;
	 }
	 
	/**
	 * Getter for itemLength
	 */
	 public MeasureType getItemLength() {
	 	return itemLength;
	 }
	 
	/**
	 * Setter for itemLength
	 */
	 public void setItemLength(MeasureType itemLength) {
	 	this.itemLength = itemLength;
	 }
	 
	/**
	 * Getter for itemWidth
	 */
	 public MeasureType getItemWidth() {
	 	return itemWidth;
	 }
	 
	/**
	 * Setter for itemWidth
	 */
	 public void setItemWidth(MeasureType itemWidth) {
	 	this.itemWidth = itemWidth;
	 }
	 
	/**
	 * Getter for itemHeight
	 */
	 public MeasureType getItemHeight() {
	 	return itemHeight;
	 }
	 
	/**
	 * Setter for itemHeight
	 */
	 public void setItemHeight(MeasureType itemHeight) {
	 	this.itemHeight = itemHeight;
	 }
	 
	/**
	 * Getter for itemURL
	 */
	 public String getItemURL() {
	 	return itemURL;
	 }
	 
	/**
	 * Setter for itemURL
	 */
	 public void setItemURL(String itemURL) {
	 	this.itemURL = itemURL;
	 }
	 
	/**
	 * Getter for enhancedItemData
	 */
	 public EnhancedItemDataType getEnhancedItemData() {
	 	return enhancedItemData;
	 }
	 
	/**
	 * Setter for enhancedItemData
	 */
	 public void setEnhancedItemData(EnhancedItemDataType enhancedItemData) {
	 	this.enhancedItemData = enhancedItemData;
	 }
	 
	/**
	 * Getter for itemCategory
	 */
	 public ItemCategoryType getItemCategory() {
	 	return itemCategory;
	 }
	 
	/**
	 * Setter for itemCategory
	 */
	 public void setItemCategory(ItemCategoryType itemCategory) {
	 	this.itemCategory = itemCategory;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(name != null) {
			sb.append("<").append(preferredPrefix).append(":Name>").append(SDKUtil.escapeInvalidXmlCharsRegex(name));
			sb.append("</").append(preferredPrefix).append(":Name>");
		}
		if(number != null) {
			sb.append("<").append(preferredPrefix).append(":Number>").append(SDKUtil.escapeInvalidXmlCharsRegex(number));
			sb.append("</").append(preferredPrefix).append(":Number>");
		}
		if(quantity != null) {
			sb.append("<").append(preferredPrefix).append(":Quantity>").append(SDKUtil.escapeInvalidXmlCharsRegex(quantity));
			sb.append("</").append(preferredPrefix).append(":Quantity>");
		}
		if(tax != null) {
			sb.append(tax.toXMLString(preferredPrefix,"Tax"));
		}
		if(amount != null) {
			sb.append(amount.toXMLString(preferredPrefix,"Amount"));
		}
		if(ebayItemPaymentDetailsItem != null) {
			sb.append(ebayItemPaymentDetailsItem.toXMLString(preferredPrefix,"EbayItemPaymentDetailsItem"));
		}
		if(promoCode != null) {
			sb.append("<").append(preferredPrefix).append(":PromoCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(promoCode));
			sb.append("</").append(preferredPrefix).append(":PromoCode>");
		}
		if(productCategory != null) {
			sb.append("<").append(preferredPrefix).append(":ProductCategory>").append(SDKUtil.escapeInvalidXmlCharsRegex(productCategory.getValue()));
			sb.append("</").append(preferredPrefix).append(":ProductCategory>");
		}
		if(description != null) {
			sb.append("<").append(preferredPrefix).append(":Description>").append(SDKUtil.escapeInvalidXmlCharsRegex(description));
			sb.append("</").append(preferredPrefix).append(":Description>");
		}
		if(itemWeight != null) {
			sb.append(itemWeight.toXMLString(preferredPrefix,"ItemWeight"));
		}
		if(itemLength != null) {
			sb.append(itemLength.toXMLString(preferredPrefix,"ItemLength"));
		}
		if(itemWidth != null) {
			sb.append(itemWidth.toXMLString(preferredPrefix,"ItemWidth"));
		}
		if(itemHeight != null) {
			sb.append(itemHeight.toXMLString(preferredPrefix,"ItemHeight"));
		}
		if(itemURL != null) {
			sb.append("<").append(preferredPrefix).append(":ItemURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemURL));
			sb.append("</").append(preferredPrefix).append(":ItemURL>");
		}
		if(enhancedItemData != null) {
			sb.append(enhancedItemData.toXMLString(preferredPrefix,"EnhancedItemData"));
		}
		if(itemCategory != null) {
			sb.append("<").append(preferredPrefix).append(":ItemCategory>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemCategory.getValue()));
			sb.append("</").append(preferredPrefix).append(":ItemCategory>");
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
			}
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
		    this.name = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Number", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.number = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Quantity", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.quantity = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("Tax", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.tax =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("Amount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.amount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("EbayItemPaymentDetailsItem", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ebayItemPaymentDetailsItem =  new EbayItemPaymentDetailsItemType(childNode);
		}
		childNode = (Node) xpath.evaluate("PromoCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.promoCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProductCategory", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.productCategory = ProductCategoryType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("Description", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.description = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemWeight", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemWeight =  new MeasureType(childNode);
		}
		childNode = (Node) xpath.evaluate("ItemLength", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemLength =  new MeasureType(childNode);
		}
		childNode = (Node) xpath.evaluate("ItemWidth", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemWidth =  new MeasureType(childNode);
		}
		childNode = (Node) xpath.evaluate("ItemHeight", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemHeight =  new MeasureType(childNode);
		}
		childNode = (Node) xpath.evaluate("ItemURL", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemURL = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("EnhancedItemData", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.enhancedItemData =  new EnhancedItemDataType(childNode);
		}
		childNode = (Node) xpath.evaluate("ItemCategory", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemCategory = ItemCategoryType.fromValue(childNode.getTextContent());
		}
	}
 
}