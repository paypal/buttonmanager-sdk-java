package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.UnitOfMeasure;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.DiscountType;
import urn.ebay.apis.eBLBaseComponents.AdditionalFeeType;
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
 * Describes an individual item for an invoice. 
 */
public class InvoiceItemType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * a human readable item nameOptional Character length and
	 * limits: 127 single-byte characters 	 
	 */ 
	private String name;

	/**
	 * a human readable item descriptionOptional Character length
	 * and limits: 127 single-byte characters 	 
	 */ 
	private String description;

	/**
	 * The International Article Number or Universal Product Code
	 * (UPC) for the item. Empty string is allowed. Character
	 * length and limits: 17 single-byte characters 	 
	 */ 
	private String eAN;

	/**
	 * The Stock-Keeping Unit or other identification code assigned
	 * to the item. Character length and limits: 64 single-byte
	 * characters 	 
	 */ 
	private String sKU;

	/**
	 * A retailer could apply different return policies on
	 * different items. Each return policy would be identified
	 * using a label or identifier. This return policy identifier
	 * should be set here. This identifier will be displayed next
	 * to the item in the e-Receipt. Character length and limits: 8
	 * single-byte characters 	 
	 */ 
	private String returnPolicyIdentifier;

	/**
	 * total price of this item 	 
	 */ 
	private BasicAmountType price;

	/**
	 * price per item quantity 	 
	 */ 
	private BasicAmountType itemPrice;

	/**
	 * quantity of the item (non-negative) 	 
	 */ 
	private Double itemCount;

	/**
	 * Unit of measure for the itemCount 	 
	 */ 
	private UnitOfMeasure itemCountUnit;

	/**
	 * discount applied to this item 	 
	 */ 
	private List<DiscountType> discount = new ArrayList<DiscountType>();

	/**
	 * identifies whether this item is taxable or not. If not
	 * passed, this will be assumed to be true. 	 
	 */ 
	private Boolean taxable;

	/**
	 * The tax percentage applied to the item. This is only used
	 * for displaying in the receipt, it is not used in pricing
	 * calculations. Note: we have totalTax at invoice level. It's
	 * up to the caller to do the calculations for setting that
	 * other element. 	 
	 */ 
	private Double taxRate;

	/**
	 * Additional fees to this item 	 
	 */ 
	private List<AdditionalFeeType> additionalFees = new ArrayList<AdditionalFeeType>();

	/**
	 * identifies whether this is reimbursable or not. If not pass,
	 * this will be assumed to be true. 	 
	 */ 
	private Boolean reimbursable;

	/**
	 * Manufacturer part number. 	 
	 */ 
	private String mPN;

	/**
	 * International Standard Book Number. Reference
	 * http://en.wikipedia.org/wiki/ISBN Character length and
	 * limits: 32 single-byte characters 	 
	 */ 
	private String iSBN;

	/**
	 * Price Look-Up code Reference
	 * http://en.wikipedia.org/wiki/Price_Look-Up_code Character
	 * length and limits: 5 single-byte characters 	 
	 */ 
	private String pLU;

	/**
	 * Character length and limits: 32 single-byte characters 	 
	 */ 
	private String modelNumber;

	/**
	 * Character length and limits: 32 single-byte characters 	 
	 */ 
	private String styleNumber;

	

	/**
	 * Default Constructor
	 */
	public InvoiceItemType (){
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
	 * Getter for eAN
	 */
	 public String getEAN() {
	 	return eAN;
	 }
	 
	/**
	 * Setter for eAN
	 */
	 public void setEAN(String eAN) {
	 	this.eAN = eAN;
	 }
	 
	/**
	 * Getter for sKU
	 */
	 public String getSKU() {
	 	return sKU;
	 }
	 
	/**
	 * Setter for sKU
	 */
	 public void setSKU(String sKU) {
	 	this.sKU = sKU;
	 }
	 
	/**
	 * Getter for returnPolicyIdentifier
	 */
	 public String getReturnPolicyIdentifier() {
	 	return returnPolicyIdentifier;
	 }
	 
	/**
	 * Setter for returnPolicyIdentifier
	 */
	 public void setReturnPolicyIdentifier(String returnPolicyIdentifier) {
	 	this.returnPolicyIdentifier = returnPolicyIdentifier;
	 }
	 
	/**
	 * Getter for price
	 */
	 public BasicAmountType getPrice() {
	 	return price;
	 }
	 
	/**
	 * Setter for price
	 */
	 public void setPrice(BasicAmountType price) {
	 	this.price = price;
	 }
	 
	/**
	 * Getter for itemPrice
	 */
	 public BasicAmountType getItemPrice() {
	 	return itemPrice;
	 }
	 
	/**
	 * Setter for itemPrice
	 */
	 public void setItemPrice(BasicAmountType itemPrice) {
	 	this.itemPrice = itemPrice;
	 }
	 
	/**
	 * Getter for itemCount
	 */
	 public Double getItemCount() {
	 	return itemCount;
	 }
	 
	/**
	 * Setter for itemCount
	 */
	 public void setItemCount(Double itemCount) {
	 	this.itemCount = itemCount;
	 }
	 
	/**
	 * Getter for itemCountUnit
	 */
	 public UnitOfMeasure getItemCountUnit() {
	 	return itemCountUnit;
	 }
	 
	/**
	 * Setter for itemCountUnit
	 */
	 public void setItemCountUnit(UnitOfMeasure itemCountUnit) {
	 	this.itemCountUnit = itemCountUnit;
	 }
	 
	/**
	 * Getter for discount
	 */
	 public List<DiscountType> getDiscount() {
	 	return discount;
	 }
	 
	/**
	 * Setter for discount
	 */
	 public void setDiscount(List<DiscountType> discount) {
	 	this.discount = discount;
	 }
	 
	/**
	 * Getter for taxable
	 */
	 public Boolean getTaxable() {
	 	return taxable;
	 }
	 
	/**
	 * Setter for taxable
	 */
	 public void setTaxable(Boolean taxable) {
	 	this.taxable = taxable;
	 }
	 
	/**
	 * Getter for taxRate
	 */
	 public Double getTaxRate() {
	 	return taxRate;
	 }
	 
	/**
	 * Setter for taxRate
	 */
	 public void setTaxRate(Double taxRate) {
	 	this.taxRate = taxRate;
	 }
	 
	/**
	 * Getter for additionalFees
	 */
	 public List<AdditionalFeeType> getAdditionalFees() {
	 	return additionalFees;
	 }
	 
	/**
	 * Setter for additionalFees
	 */
	 public void setAdditionalFees(List<AdditionalFeeType> additionalFees) {
	 	this.additionalFees = additionalFees;
	 }
	 
	/**
	 * Getter for reimbursable
	 */
	 public Boolean getReimbursable() {
	 	return reimbursable;
	 }
	 
	/**
	 * Setter for reimbursable
	 */
	 public void setReimbursable(Boolean reimbursable) {
	 	this.reimbursable = reimbursable;
	 }
	 
	/**
	 * Getter for mPN
	 */
	 public String getMPN() {
	 	return mPN;
	 }
	 
	/**
	 * Setter for mPN
	 */
	 public void setMPN(String mPN) {
	 	this.mPN = mPN;
	 }
	 
	/**
	 * Getter for iSBN
	 */
	 public String getISBN() {
	 	return iSBN;
	 }
	 
	/**
	 * Setter for iSBN
	 */
	 public void setISBN(String iSBN) {
	 	this.iSBN = iSBN;
	 }
	 
	/**
	 * Getter for pLU
	 */
	 public String getPLU() {
	 	return pLU;
	 }
	 
	/**
	 * Setter for pLU
	 */
	 public void setPLU(String pLU) {
	 	this.pLU = pLU;
	 }
	 
	/**
	 * Getter for modelNumber
	 */
	 public String getModelNumber() {
	 	return modelNumber;
	 }
	 
	/**
	 * Setter for modelNumber
	 */
	 public void setModelNumber(String modelNumber) {
	 	this.modelNumber = modelNumber;
	 }
	 
	/**
	 * Getter for styleNumber
	 */
	 public String getStyleNumber() {
	 	return styleNumber;
	 }
	 
	/**
	 * Setter for styleNumber
	 */
	 public void setStyleNumber(String styleNumber) {
	 	this.styleNumber = styleNumber;
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
		if(description != null) {
			sb.append("<").append(preferredPrefix).append(":Description>").append(SDKUtil.escapeInvalidXmlCharsRegex(description));
			sb.append("</").append(preferredPrefix).append(":Description>");
		}
		if(eAN != null) {
			sb.append("<").append(preferredPrefix).append(":EAN>").append(SDKUtil.escapeInvalidXmlCharsRegex(eAN));
			sb.append("</").append(preferredPrefix).append(":EAN>");
		}
		if(sKU != null) {
			sb.append("<").append(preferredPrefix).append(":SKU>").append(SDKUtil.escapeInvalidXmlCharsRegex(sKU));
			sb.append("</").append(preferredPrefix).append(":SKU>");
		}
		if(returnPolicyIdentifier != null) {
			sb.append("<").append(preferredPrefix).append(":ReturnPolicyIdentifier>").append(SDKUtil.escapeInvalidXmlCharsRegex(returnPolicyIdentifier));
			sb.append("</").append(preferredPrefix).append(":ReturnPolicyIdentifier>");
		}
		if(price != null) {
			sb.append(price.toXMLString(preferredPrefix,"Price"));
		}
		if(itemPrice != null) {
			sb.append(itemPrice.toXMLString(preferredPrefix,"ItemPrice"));
		}
		if(itemCount != null) {
			sb.append("<").append(preferredPrefix).append(":ItemCount>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemCount));
			sb.append("</").append(preferredPrefix).append(":ItemCount>");
		}
		if(itemCountUnit != null) {
			sb.append("<").append(preferredPrefix).append(":ItemCountUnit>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemCountUnit.getValue()));
			sb.append("</").append(preferredPrefix).append(":ItemCountUnit>");
		}
		if(discount != null) {
			for(int i=0; i < discount.size(); i++) {
				sb.append(discount.get(i).toXMLString(preferredPrefix,"Discount"));
			}
		}
		if(taxable != null) {
			sb.append("<").append(preferredPrefix).append(":Taxable>").append(SDKUtil.escapeInvalidXmlCharsRegex(taxable));
			sb.append("</").append(preferredPrefix).append(":Taxable>");
		}
		if(taxRate != null) {
			sb.append("<").append(preferredPrefix).append(":TaxRate>").append(SDKUtil.escapeInvalidXmlCharsRegex(taxRate));
			sb.append("</").append(preferredPrefix).append(":TaxRate>");
		}
		if(additionalFees != null) {
			for(int i=0; i < additionalFees.size(); i++) {
				sb.append(additionalFees.get(i).toXMLString(preferredPrefix,"AdditionalFees"));
			}
		}
		if(reimbursable != null) {
			sb.append("<").append(preferredPrefix).append(":Reimbursable>").append(SDKUtil.escapeInvalidXmlCharsRegex(reimbursable));
			sb.append("</").append(preferredPrefix).append(":Reimbursable>");
		}
		if(mPN != null) {
			sb.append("<").append(preferredPrefix).append(":MPN>").append(SDKUtil.escapeInvalidXmlCharsRegex(mPN));
			sb.append("</").append(preferredPrefix).append(":MPN>");
		}
		if(iSBN != null) {
			sb.append("<").append(preferredPrefix).append(":ISBN>").append(SDKUtil.escapeInvalidXmlCharsRegex(iSBN));
			sb.append("</").append(preferredPrefix).append(":ISBN>");
		}
		if(pLU != null) {
			sb.append("<").append(preferredPrefix).append(":PLU>").append(SDKUtil.escapeInvalidXmlCharsRegex(pLU));
			sb.append("</").append(preferredPrefix).append(":PLU>");
		}
		if(modelNumber != null) {
			sb.append("<").append(preferredPrefix).append(":ModelNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(modelNumber));
			sb.append("</").append(preferredPrefix).append(":ModelNumber>");
		}
		if(styleNumber != null) {
			sb.append("<").append(preferredPrefix).append(":StyleNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(styleNumber));
			sb.append("</").append(preferredPrefix).append(":StyleNumber>");
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
	
	public InvoiceItemType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Name", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.name = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Description", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.description = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("EAN", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.eAN = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SKU", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.sKU = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ReturnPolicyIdentifier", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.returnPolicyIdentifier = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Price", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.price =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("ItemPrice", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemPrice =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("ItemCount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.itemCount = Double.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("ItemCountUnit", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemCountUnit = UnitOfMeasure.fromValue(childNode.getTextContent());
		}
        nodeList = (NodeList) xpath.evaluate("Discount", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.discount.add(new DiscountType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("Taxable", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.taxable = Boolean.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("TaxRate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.taxRate = Double.valueOf(childNode.getTextContent());
		}
	
        nodeList = (NodeList) xpath.evaluate("AdditionalFees", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.additionalFees.add(new AdditionalFeeType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("Reimbursable", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.reimbursable = Boolean.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("MPN", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.mPN = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ISBN", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.iSBN = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PLU", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.pLU = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ModelNumber", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.modelNumber = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("StyleNumber", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.styleNumber = childNode.getTextContent();
		}
	
	}
 
}