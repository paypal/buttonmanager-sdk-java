
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.OptionType;


/**
 * PaymentItemType 
 * Information about a Payment Item.
 */
public class PaymentItemType {

	/**
	 * eBay Auction Transaction ID of the Item 
	 * Optional
	 * Character length and limitations: 255 single-byte characters
	 */
	private String EbayItemTxnId;
	public String getEbayItemTxnId() {
		return EbayItemTxnId;
	}
	public void setEbayItemTxnId(String value) {
		this.EbayItemTxnId = value;
	}

	/**
	 * Item name set by you or entered by the customer. 
Character length and limitations: 127 single-byte alphanumeric characters
	 */
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String value) {
		this.Name = value;
	}

	/**
	 * Item number set by you. 
	 * Character length and limitations: 127 single-byte alphanumeric characters	 */
	private String Number;
	public String getNumber() {
		return Number;
	}
	public void setNumber(String value) {
		this.Number = value;
	}

	/**
	 * Quantity set by you or entered by the customer. 
	 * Character length and limitations: no limit	 */
	private String Quantity;
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String value) {
		this.Quantity = value;
	}

	/**
	 * Amount of tax charged on payment 	 */
	private String SalesTax;
	public String getSalesTax() {
		return SalesTax;
	}
	public void setSalesTax(String value) {
		this.SalesTax = value;
	}

	/**
	 * Amount of shipping charged on payment 	 */
	private String ShippingAmount;
	public String getShippingAmount() {
		return ShippingAmount;
	}
	public void setShippingAmount(String value) {
		this.ShippingAmount = value;
	}

	/**
	 * Amount of handling charged on payment 	 */
	private String HandlingAmount;
	public String getHandlingAmount() {
		return HandlingAmount;
	}
	public void setHandlingAmount(String value) {
		this.HandlingAmount = value;
	}

	/**
	 * Coupon ID Number 	 */
	private String CouponID;
	public String getCouponID() {
		return CouponID;
	}
	public void setCouponID(String value) {
		this.CouponID = value;
	}

	/**
	 * Amount Value of The Coupon 	 */
	private String CouponAmount;
	public String getCouponAmount() {
		return CouponAmount;
	}
	public void setCouponAmount(String value) {
		this.CouponAmount = value;
	}

	/**
	 * Currency of the Coupon Amount 	 */
	private String CouponAmountCurrency;
	public String getCouponAmountCurrency() {
		return CouponAmountCurrency;
	}
	public void setCouponAmountCurrency(String value) {
		this.CouponAmountCurrency = value;
	}

	/**
	 * Amount of Discount on this Loyality Card	 */
	private String LoyalityCardDiscountAmount;
	public String getLoyalityCardDiscountAmount() {
		return LoyalityCardDiscountAmount;
	}
	public void setLoyalityCardDiscountAmount(String value) {
		this.LoyalityCardDiscountAmount = value;
	}

	/**
	 * Currency of the Discount	 */
	private String LoyalityCardDiscountCurrency;
	public String getLoyalityCardDiscountCurrency() {
		return LoyalityCardDiscountCurrency;
	}
	public void setLoyalityCardDiscountCurrency(String value) {
		this.LoyalityCardDiscountCurrency = value;
	}

	/**
	 * Cost of item 	 */
	private BasicAmountType Amount;
	public BasicAmountType getAmount() {
		return Amount;
	}
	public void setAmount(BasicAmountType value) {
		this.Amount = value;
	}

	/**
	 * Item options selected in PayPal shopping cart 	 */
	private List<OptionType> Options = new ArrayList<OptionType>();
	public List<OptionType> getOptions() {
		return Options;
	}
	public void setOptions(List<OptionType> value) {
		this.Options = value;
	}


	public PaymentItemType() {
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
		 sb.append('<').append(name);
		 NamedNodeMap attrs = n.getAttributes();
		 if (attrs != null) { 
		  for (int i = 0; i < attrs.getLength(); i++) { 
			    Node attr = attrs.item(i);
			    sb.append(' ').append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
		  }
		 } 
		 String textContent = null; 
		 NodeList children = n.getChildNodes(); 
		 if (children.getLength() == 0) { 
		  if ((textContent = n.getTextContent()) != null && !"".equals(textContent)) {
		    sb.append(textContent).append("</").append(name).append('>'); 
		  } else { 
		    sb.append("/>"); 
		  } 
		 } else { 
		  sb.append('>'); 
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
		  sb.append("</").append(name).append('>');
		 }
		 return sb.toString();
	 } 
	 public PaymentItemType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("EbayItemTxnId").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("EbayItemTxnId").item(0))){ 
		 this.EbayItemTxnId =(String)document.getElementsByTagName("EbayItemTxnId").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Name").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Name").item(0))){ 
		 this.Name =(String)document.getElementsByTagName("Name").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Number").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Number").item(0))){ 
		 this.Number =(String)document.getElementsByTagName("Number").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Quantity").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Quantity").item(0))){ 
		 this.Quantity =(String)document.getElementsByTagName("Quantity").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("SalesTax").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("SalesTax").item(0))){ 
		 this.SalesTax =(String)document.getElementsByTagName("SalesTax").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ShippingAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ShippingAmount").item(0))){ 
		 this.ShippingAmount =(String)document.getElementsByTagName("ShippingAmount").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("HandlingAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("HandlingAmount").item(0))){ 
		 this.HandlingAmount =(String)document.getElementsByTagName("HandlingAmount").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("CouponID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("CouponID").item(0))){ 
		 this.CouponID =(String)document.getElementsByTagName("CouponID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("CouponAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("CouponAmount").item(0))){ 
		 this.CouponAmount =(String)document.getElementsByTagName("CouponAmount").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("CouponAmountCurrency").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("CouponAmountCurrency").item(0))){ 
		 this.CouponAmountCurrency =(String)document.getElementsByTagName("CouponAmountCurrency").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("LoyalityCardDiscountAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("LoyalityCardDiscountAmount").item(0))){ 
		 this.LoyalityCardDiscountAmount =(String)document.getElementsByTagName("LoyalityCardDiscountAmount").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("LoyalityCardDiscountCurrency").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("LoyalityCardDiscountCurrency").item(0))){ 
		 this.LoyalityCardDiscountCurrency =(String)document.getElementsByTagName("LoyalityCardDiscountCurrency").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Amount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Amount").item(0))){ 
		 nodeList = document.getElementsByTagName("Amount");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.Amount =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("Options").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Options").item(0))){ 
		 nodeList = document.getElementsByTagName("Options");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 xmlString = convertToXML(nodeList.item(i)); 
				this.Options.add(new OptionType(xmlString));
			}

}
	}
	}
}
