package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.EbayItemPaymentDetailsItemType;
import urn.ebay.apis.eBLBaseComponents.ProductCategoryType;
import urn.ebay.apis.CoreComponentTypes.MeasureType;
import urn.ebay.apis.EnhancedDataTypes.EnhancedItemDataType;
import urn.ebay.apis.eBLBaseComponents.ItemCategoryType;
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
			sb.append("<ebl:Name>").append(Name);
			sb.append("</ebl:Name>");
		}
		if(Number != null) {
			sb.append("<ebl:Number>").append(Number);
			sb.append("</ebl:Number>");
		}
		if(Quantity != null) {
			sb.append("<ebl:Quantity>").append(Quantity);
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
			sb.append("<ebl:PromoCode>").append(PromoCode);
			sb.append("</ebl:PromoCode>");
		}
		if(ProductCategory != null) {
			sb.append("<ebl:ProductCategory>").append(ProductCategory.getValue());
			sb.append("</ebl:ProductCategory>");
		}
		if(Description != null) {
			sb.append("<ebl:Description>").append(Description);
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
			sb.append("<ebl:ItemURL>").append(ItemURL);
			sb.append("</ebl:ItemURL>");
		}
		if(EnhancedItemData != null) {
			sb.append("<ebl:EnhancedItemData>");
			sb.append(EnhancedItemData.toXMLString());
			sb.append("</ebl:EnhancedItemData>");
		}
		if(ItemCategory != null) {
			sb.append("<ebl:ItemCategory>").append(ItemCategory.getValue());
			sb.append("</ebl:ItemCategory>");
		}
		return sb.toString();
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
	
	public PaymentDetailsItemType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
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
				this.Quantity = Integer.valueOf(document.getElementsByTagName("Quantity").item(0).getTextContent());
			}
		}
	
		if(document.getElementsByTagName("Tax").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Tax").item(0))) {
				nodeList = document.getElementsByTagName("Tax");
				xmlString = convertToXML(nodeList.item(0));
				this.Tax =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("Amount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Amount").item(0))) {
				nodeList = document.getElementsByTagName("Amount");
				xmlString = convertToXML(nodeList.item(0));
				this.Amount =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("EbayItemPaymentDetailsItem").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("EbayItemPaymentDetailsItem").item(0))) {
				nodeList = document.getElementsByTagName("EbayItemPaymentDetailsItem");
				xmlString = convertToXML(nodeList.item(0));
				this.EbayItemPaymentDetailsItem =  new EbayItemPaymentDetailsItemType(xmlString);
			}
		}
		if (document.getElementsByTagName("PromoCode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PromoCode").item(0))) {
				this.PromoCode = (String)document.getElementsByTagName("PromoCode").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("ProductCategory").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ProductCategory").item(0))) {
				this.ProductCategory = ProductCategoryType.fromValue(document.getElementsByTagName("ProductCategory").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("Description").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Description").item(0))) {
				this.Description = (String)document.getElementsByTagName("Description").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("ItemWeight").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ItemWeight").item(0))) {
				nodeList = document.getElementsByTagName("ItemWeight");
				xmlString = convertToXML(nodeList.item(0));
				this.ItemWeight =  new MeasureType(xmlString);
			}
		}
		if(document.getElementsByTagName("ItemLength").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ItemLength").item(0))) {
				nodeList = document.getElementsByTagName("ItemLength");
				xmlString = convertToXML(nodeList.item(0));
				this.ItemLength =  new MeasureType(xmlString);
			}
		}
		if(document.getElementsByTagName("ItemWidth").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ItemWidth").item(0))) {
				nodeList = document.getElementsByTagName("ItemWidth");
				xmlString = convertToXML(nodeList.item(0));
				this.ItemWidth =  new MeasureType(xmlString);
			}
		}
		if(document.getElementsByTagName("ItemHeight").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ItemHeight").item(0))) {
				nodeList = document.getElementsByTagName("ItemHeight");
				xmlString = convertToXML(nodeList.item(0));
				this.ItemHeight =  new MeasureType(xmlString);
			}
		}
		if (document.getElementsByTagName("ItemURL").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ItemURL").item(0))) {
				this.ItemURL = (String)document.getElementsByTagName("ItemURL").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("EnhancedItemData").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("EnhancedItemData").item(0))) {
				nodeList = document.getElementsByTagName("EnhancedItemData");
				xmlString = convertToXML(nodeList.item(0));
				this.EnhancedItemData =  new EnhancedItemDataType(xmlString);
			}
		}
		if(document.getElementsByTagName("ItemCategory").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ItemCategory").item(0))) {
				this.ItemCategory = ItemCategoryType.fromValue(document.getElementsByTagName("ItemCategory").item(0).getTextContent());
			}
		}
	}

}