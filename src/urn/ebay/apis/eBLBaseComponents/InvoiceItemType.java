package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.UnitOfMeasure;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.DiscountType;
import urn.ebay.apis.eBLBaseComponents.AdditionalFeeType;
import com.paypal.core.SDKUtil;

/**
 * Describes an individual item for an invoice. 
 */
public class InvoiceItemType{


	/**
	 * a human readable item nameOptional Character length and
	 * limits: 127 single-byte characters 	 
	 */ 
	private String Name;

	/**
	 * a human readable item descriptionOptional Character length
	 * and limits: 127 single-byte characters 	 
	 */ 
	private String Description;

	/**
	 * The International Article Number or Universal Product Code
	 * (UPC) for the item. Empty string is allowed. Character
	 * length and limits: 17 single-byte characters 	 
	 */ 
	private String EAN;

	/**
	 * The Stock-Keeping Unit or other identification code assigned
	 * to the item. Character length and limits: 64 single-byte
	 * characters 	 
	 */ 
	private String SKU;

	/**
	 * A retailer could apply different return policies on
	 * different items. Each return policy would be identified
	 * using a label or identifier. This return policy identifier
	 * should be set here. This identifier will be displayed next
	 * to the item in the e-Receipt. Character length and limits: 8
	 * single-byte characters 	 
	 */ 
	private String ReturnPolicyIdentifier;

	/**
	 * total price of this item 	 
	 */ 
	private BasicAmountType Price;

	/**
	 * price per item quantity 	 
	 */ 
	private BasicAmountType ItemPrice;

	/**
	 * quantity of the item (non-negative) 	 
	 */ 
	private Double ItemCount;

	/**
	 * Unit of measure for the itemCount 	 
	 */ 
	private UnitOfMeasure ItemCountUnit;

	/**
	 * discount applied to this item 	 
	 */ 
	private List<DiscountType> Discount = new ArrayList<DiscountType>();

	/**
	 * identifies whether this item is taxable or not. If not
	 * passed, this will be assumed to be true. 	 
	 */ 
	private Boolean Taxable;

	/**
	 * The tax percentage applied to the item. This is only used
	 * for displaying in the receipt, it is not used in pricing
	 * calculations. Note: we have totalTax at invoice level. It's
	 * up to the caller to do the calculations for setting that
	 * other element. 	 
	 */ 
	private Double TaxRate;

	/**
	 * Additional fees to this item 	 
	 */ 
	private List<AdditionalFeeType> AdditionalFees = new ArrayList<AdditionalFeeType>();

	/**
	 * identifies whether this is reimbursable or not. If not pass,
	 * this will be assumed to be true. 	 
	 */ 
	private Boolean Reimbursable;

	/**
	 * Manufacturer part number. 	 
	 */ 
	private String MPN;

	/**
	 * International Standard Book Number. Reference
	 * http://en.wikipedia.org/wiki/ISBN Character length and
	 * limits: 32 single-byte characters 	 
	 */ 
	private String ISBN;

	/**
	 * Price Look-Up code Reference
	 * http://en.wikipedia.org/wiki/Price_Look-Up_code Character
	 * length and limits: 5 single-byte characters 	 
	 */ 
	private String PLU;

	/**
	 * Character length and limits: 32 single-byte characters 	 
	 */ 
	private String ModelNumber;

	/**
	 * Character length and limits: 32 single-byte characters 	 
	 */ 
	private String StyleNumber;

	

	/**
	 * Default Constructor
	 */
	public InvoiceItemType (){
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
	 * Getter for EAN
	 */
	 public String getEAN() {
	 	return EAN;
	 }
	 
	/**
	 * Setter for EAN
	 */
	 public void setEAN(String EAN) {
	 	this.EAN = EAN;
	 }
	 
	/**
	 * Getter for SKU
	 */
	 public String getSKU() {
	 	return SKU;
	 }
	 
	/**
	 * Setter for SKU
	 */
	 public void setSKU(String SKU) {
	 	this.SKU = SKU;
	 }
	 
	/**
	 * Getter for ReturnPolicyIdentifier
	 */
	 public String getReturnPolicyIdentifier() {
	 	return ReturnPolicyIdentifier;
	 }
	 
	/**
	 * Setter for ReturnPolicyIdentifier
	 */
	 public void setReturnPolicyIdentifier(String ReturnPolicyIdentifier) {
	 	this.ReturnPolicyIdentifier = ReturnPolicyIdentifier;
	 }
	 
	/**
	 * Getter for Price
	 */
	 public BasicAmountType getPrice() {
	 	return Price;
	 }
	 
	/**
	 * Setter for Price
	 */
	 public void setPrice(BasicAmountType Price) {
	 	this.Price = Price;
	 }
	 
	/**
	 * Getter for ItemPrice
	 */
	 public BasicAmountType getItemPrice() {
	 	return ItemPrice;
	 }
	 
	/**
	 * Setter for ItemPrice
	 */
	 public void setItemPrice(BasicAmountType ItemPrice) {
	 	this.ItemPrice = ItemPrice;
	 }
	 
	/**
	 * Getter for ItemCount
	 */
	 public Double getItemCount() {
	 	return ItemCount;
	 }
	 
	/**
	 * Setter for ItemCount
	 */
	 public void setItemCount(Double ItemCount) {
	 	this.ItemCount = ItemCount;
	 }
	 
	/**
	 * Getter for ItemCountUnit
	 */
	 public UnitOfMeasure getItemCountUnit() {
	 	return ItemCountUnit;
	 }
	 
	/**
	 * Setter for ItemCountUnit
	 */
	 public void setItemCountUnit(UnitOfMeasure ItemCountUnit) {
	 	this.ItemCountUnit = ItemCountUnit;
	 }
	 
	/**
	 * Getter for Discount
	 */
	 public List<DiscountType> getDiscount() {
	 	return Discount;
	 }
	 
	/**
	 * Setter for Discount
	 */
	 public void setDiscount(List<DiscountType> Discount) {
	 	this.Discount = Discount;
	 }
	 
	/**
	 * Getter for Taxable
	 */
	 public Boolean getTaxable() {
	 	return Taxable;
	 }
	 
	/**
	 * Setter for Taxable
	 */
	 public void setTaxable(Boolean Taxable) {
	 	this.Taxable = Taxable;
	 }
	 
	/**
	 * Getter for TaxRate
	 */
	 public Double getTaxRate() {
	 	return TaxRate;
	 }
	 
	/**
	 * Setter for TaxRate
	 */
	 public void setTaxRate(Double TaxRate) {
	 	this.TaxRate = TaxRate;
	 }
	 
	/**
	 * Getter for AdditionalFees
	 */
	 public List<AdditionalFeeType> getAdditionalFees() {
	 	return AdditionalFees;
	 }
	 
	/**
	 * Setter for AdditionalFees
	 */
	 public void setAdditionalFees(List<AdditionalFeeType> AdditionalFees) {
	 	this.AdditionalFees = AdditionalFees;
	 }
	 
	/**
	 * Getter for Reimbursable
	 */
	 public Boolean getReimbursable() {
	 	return Reimbursable;
	 }
	 
	/**
	 * Setter for Reimbursable
	 */
	 public void setReimbursable(Boolean Reimbursable) {
	 	this.Reimbursable = Reimbursable;
	 }
	 
	/**
	 * Getter for MPN
	 */
	 public String getMPN() {
	 	return MPN;
	 }
	 
	/**
	 * Setter for MPN
	 */
	 public void setMPN(String MPN) {
	 	this.MPN = MPN;
	 }
	 
	/**
	 * Getter for ISBN
	 */
	 public String getISBN() {
	 	return ISBN;
	 }
	 
	/**
	 * Setter for ISBN
	 */
	 public void setISBN(String ISBN) {
	 	this.ISBN = ISBN;
	 }
	 
	/**
	 * Getter for PLU
	 */
	 public String getPLU() {
	 	return PLU;
	 }
	 
	/**
	 * Setter for PLU
	 */
	 public void setPLU(String PLU) {
	 	this.PLU = PLU;
	 }
	 
	/**
	 * Getter for ModelNumber
	 */
	 public String getModelNumber() {
	 	return ModelNumber;
	 }
	 
	/**
	 * Setter for ModelNumber
	 */
	 public void setModelNumber(String ModelNumber) {
	 	this.ModelNumber = ModelNumber;
	 }
	 
	/**
	 * Getter for StyleNumber
	 */
	 public String getStyleNumber() {
	 	return StyleNumber;
	 }
	 
	/**
	 * Setter for StyleNumber
	 */
	 public void setStyleNumber(String StyleNumber) {
	 	this.StyleNumber = StyleNumber;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Name != null) {
			sb.append("<ebl:Name>").append(SDKUtil.escapeInvalidXmlCharsRegex(Name));
			sb.append("</ebl:Name>");
		}
		if(Description != null) {
			sb.append("<ebl:Description>").append(SDKUtil.escapeInvalidXmlCharsRegex(Description));
			sb.append("</ebl:Description>");
		}
		if(EAN != null) {
			sb.append("<ebl:EAN>").append(SDKUtil.escapeInvalidXmlCharsRegex(EAN));
			sb.append("</ebl:EAN>");
		}
		if(SKU != null) {
			sb.append("<ebl:SKU>").append(SDKUtil.escapeInvalidXmlCharsRegex(SKU));
			sb.append("</ebl:SKU>");
		}
		if(ReturnPolicyIdentifier != null) {
			sb.append("<ebl:ReturnPolicyIdentifier>").append(SDKUtil.escapeInvalidXmlCharsRegex(ReturnPolicyIdentifier));
			sb.append("</ebl:ReturnPolicyIdentifier>");
		}
		if(Price != null) {
			sb.append("<ebl:Price");
			sb.append(Price.toXMLString());
			sb.append("</ebl:Price>");
		}
		if(ItemPrice != null) {
			sb.append("<ebl:ItemPrice");
			sb.append(ItemPrice.toXMLString());
			sb.append("</ebl:ItemPrice>");
		}
		if(ItemCount != null) {
			sb.append("<ebl:ItemCount>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemCount));
			sb.append("</ebl:ItemCount>");
		}
		if(ItemCountUnit != null) {
			sb.append("<ebl:ItemCountUnit>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemCountUnit.getValue()));
			sb.append("</ebl:ItemCountUnit>");
		}
		if(Discount != null) {
			for(int i=0; i < Discount.size(); i++) {
				sb.append("<ebl:Discount>");
				sb.append(Discount.get(i).toXMLString());
				sb.append("</ebl:Discount>");
			}
		}
		if(Taxable != null) {
			sb.append("<ebl:Taxable>").append(SDKUtil.escapeInvalidXmlCharsRegex(Taxable));
			sb.append("</ebl:Taxable>");
		}
		if(TaxRate != null) {
			sb.append("<ebl:TaxRate>").append(SDKUtil.escapeInvalidXmlCharsRegex(TaxRate));
			sb.append("</ebl:TaxRate>");
		}
		if(AdditionalFees != null) {
			for(int i=0; i < AdditionalFees.size(); i++) {
				sb.append("<ebl:AdditionalFees>");
				sb.append(AdditionalFees.get(i).toXMLString());
				sb.append("</ebl:AdditionalFees>");
			}
		}
		if(Reimbursable != null) {
			sb.append("<ebl:Reimbursable>").append(SDKUtil.escapeInvalidXmlCharsRegex(Reimbursable));
			sb.append("</ebl:Reimbursable>");
		}
		if(MPN != null) {
			sb.append("<ebl:MPN>").append(SDKUtil.escapeInvalidXmlCharsRegex(MPN));
			sb.append("</ebl:MPN>");
		}
		if(ISBN != null) {
			sb.append("<ebl:ISBN>").append(SDKUtil.escapeInvalidXmlCharsRegex(ISBN));
			sb.append("</ebl:ISBN>");
		}
		if(PLU != null) {
			sb.append("<ebl:PLU>").append(SDKUtil.escapeInvalidXmlCharsRegex(PLU));
			sb.append("</ebl:PLU>");
		}
		if(ModelNumber != null) {
			sb.append("<ebl:ModelNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(ModelNumber));
			sb.append("</ebl:ModelNumber>");
		}
		if(StyleNumber != null) {
			sb.append("<ebl:StyleNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(StyleNumber));
			sb.append("</ebl:StyleNumber>");
		}
		return sb.toString();
	}


}