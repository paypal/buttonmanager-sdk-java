
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.util.ArrayList;
import java.util.List;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AdditionalFeeType;
import urn.ebay.apis.eBLBaseComponents.DiscountType;
import urn.ebay.apis.eBLBaseComponents.UnitOfMeasure;


/**
 * Describes an individual item for an invoice.
 */
public class InvoiceItemType {

	/**
a human readable item nameOptional
	 * Character length and limits: 127 single-byte characters
	 */
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String value) {
		this.Name = value;
	}

	/**
a human readable item descriptionOptional
	 * Character length and limits: 127 single-byte characters
	 */
	private String Description;
	public String getDescription() {
		return Description;
	}
	public void setDescription(String value) {
		this.Description = value;
	}

	/**
	 * The International Article Number or 
	 * Universal Product Code (UPC) for the item.
	 * Empty string is allowed.
	 * Character length and limits: 17 single-byte characters
	 */
	private String EAN;
	public String getEAN() {
		return EAN;
	}
	public void setEAN(String value) {
		this.EAN = value;
	}

	/**
	 * The Stock-Keeping Unit or other identification 
	 * code assigned to the item.
	 * Character length and limits: 64 single-byte characters
	 */
	private String SKU;
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String value) {
		this.SKU = value;
	}

	/**
	 * A retailer could apply different return policies on different items.
	 * Each return policy would be identified using a label or identifier.
	 * This return policy identifier should be set here.  
	 * This identifier will be displayed next to the item in the e-Receipt.
	 * Character length and limits: 8 single-byte characters
	 */
	private String ReturnPolicyIdentifier;
	public String getReturnPolicyIdentifier() {
		return ReturnPolicyIdentifier;
	}
	public void setReturnPolicyIdentifier(String value) {
		this.ReturnPolicyIdentifier = value;
	}

	/**
	 * total price of this item
	 */
	private BasicAmountType Price;
	public BasicAmountType getPrice() {
		return Price;
	}
	public void setPrice(BasicAmountType value) {
		this.Price = value;
	}

	/**
	 * price per item quantity
	 */
	private BasicAmountType ItemPrice;
	public BasicAmountType getItemPrice() {
		return ItemPrice;
	}
	public void setItemPrice(BasicAmountType value) {
		this.ItemPrice = value;
	}

	/**
	 * quantity of the item (non-negative)
	 */
	private Double ItemCount;
	public Double getItemCount() {
		return ItemCount;
	}
	public void setItemCount(Double value) {
		this.ItemCount = value;
	}

	/**
	 * Unit of measure for the itemCount
	 */
	private UnitOfMeasure ItemCountUnit;
	public UnitOfMeasure getItemCountUnit() {
		return ItemCountUnit;
	}
	public void setItemCountUnit(UnitOfMeasure value) {
		this.ItemCountUnit = value;
	}

	/**
	 * discount applied to this item
	 */
	private List<DiscountType> Discount = new ArrayList<DiscountType>();
	public List<DiscountType> getDiscount() {
		return Discount;
	}
	public void setDiscount(List<DiscountType> value) {
		this.Discount = value;
	}

	/**
	 * identifies whether this item is taxable or not.  
	 * If not passed, this will be assumed to be true.
	 */
	private Boolean Taxable;
	public Boolean getTaxable() {
		return Taxable;
	}
	public void setTaxable(Boolean value) {
		this.Taxable = value;
	}

	/**
	 * The tax percentage applied to the item.
	 * This is only used for displaying in the receipt, it is not used in pricing calculations.
	 * Note: we have totalTax at invoice level. It's up to the caller to do the calculations for setting that other element.
	 */
	private Double TaxRate;
	public Double getTaxRate() {
		return TaxRate;
	}
	public void setTaxRate(Double value) {
		this.TaxRate = value;
	}

	/**
	 * Additional fees to this item
	 */
	private List<AdditionalFeeType> AdditionalFees = new ArrayList<AdditionalFeeType>();
	public List<AdditionalFeeType> getAdditionalFees() {
		return AdditionalFees;
	}
	public void setAdditionalFees(List<AdditionalFeeType> value) {
		this.AdditionalFees = value;
	}

	/**
	 * identifies whether this is reimbursable or not.
	 * If not pass, this will be assumed to be true.
	 */
	private Boolean Reimbursable;
	public Boolean getReimbursable() {
		return Reimbursable;
	}
	public void setReimbursable(Boolean value) {
		this.Reimbursable = value;
	}

	/**
	 * Manufacturer part number.
	 */
	private String MPN;
	public String getMPN() {
		return MPN;
	}
	public void setMPN(String value) {
		this.MPN = value;
	}

	/**
	 * International Standard Book Number.
	 * Reference http://en.wikipedia.org/wiki/ISBN
	 * Character length and limits: 32 single-byte characters
	 */
	private String ISBN;
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String value) {
		this.ISBN = value;
	}

	/**
	 * Price Look-Up code
	 * Reference http://en.wikipedia.org/wiki/Price_Look-Up_code
	 * Character length and limits: 5 single-byte characters
	 */
	private String PLU;
	public String getPLU() {
		return PLU;
	}
	public void setPLU(String value) {
		this.PLU = value;
	}

	/**
	 * Character length and limits: 32 single-byte characters
	 */
	private String ModelNumber;
	public String getModelNumber() {
		return ModelNumber;
	}
	public void setModelNumber(String value) {
		this.ModelNumber = value;
	}

	/**
	 * Character length and limits: 32 single-byte characters
	 */
	private String StyleNumber;
	public String getStyleNumber() {
		return StyleNumber;
	}
	public void setStyleNumber(String value) {
		this.StyleNumber = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( Name != null ) {
			sb.append("<ebl:Name>").append(Name);
			sb.append("</ebl:Name>");
		}
		if( Description != null ) {
			sb.append("<ebl:Description>").append(Description);
			sb.append("</ebl:Description>");
		}
		if( EAN != null ) {
			sb.append("<ebl:EAN>").append(EAN);
			sb.append("</ebl:EAN>");
		}
		if( SKU != null ) {
			sb.append("<ebl:SKU>").append(SKU);
			sb.append("</ebl:SKU>");
		}
		if( ReturnPolicyIdentifier != null ) {
			sb.append("<ebl:ReturnPolicyIdentifier>").append(ReturnPolicyIdentifier);
			sb.append("</ebl:ReturnPolicyIdentifier>");
		}
		if( Price != null ) {
			sb.append("<ebl:Price ");
			sb.append(Price.toXMLString());
			sb.append("</ebl:Price>");
		}
		if( ItemPrice != null ) {
			sb.append("<ebl:ItemPrice ");
			sb.append(ItemPrice.toXMLString());
			sb.append("</ebl:ItemPrice>");
		}
		if( ItemCount != null ) {
			sb.append("<ebl:ItemCount>").append(ItemCount);
			sb.append("</ebl:ItemCount>");
		}
		if( ItemCountUnit != null ) {
			sb.append("<ebl:ItemCountUnit>").append( ItemCountUnit.getValue());
			sb.append("</ebl:ItemCountUnit>");
		}
		if( Discount != null ) {
			for(int i=0; i<Discount.size(); i++) {
				sb.append("<ebl:Discount>");
				sb.append(Discount.get(i).toXMLString());
				sb.append("</ebl:Discount>");
			}
		}
		if( Taxable != null ) {
			sb.append("<ebl:Taxable>").append(Taxable);
			sb.append("</ebl:Taxable>");
		}
		if( TaxRate != null ) {
			sb.append("<ebl:TaxRate>").append(TaxRate);
			sb.append("</ebl:TaxRate>");
		}
		if( AdditionalFees != null ) {
			for(int i=0; i<AdditionalFees.size(); i++) {
				sb.append("<ebl:AdditionalFees>");
				sb.append(AdditionalFees.get(i).toXMLString());
				sb.append("</ebl:AdditionalFees>");
			}
		}
		if( Reimbursable != null ) {
			sb.append("<ebl:Reimbursable>").append(Reimbursable);
			sb.append("</ebl:Reimbursable>");
		}
		if( MPN != null ) {
			sb.append("<ebl:MPN>").append(MPN);
			sb.append("</ebl:MPN>");
		}
		if( ISBN != null ) {
			sb.append("<ebl:ISBN>").append(ISBN);
			sb.append("</ebl:ISBN>");
		}
		if( PLU != null ) {
			sb.append("<ebl:PLU>").append(PLU);
			sb.append("</ebl:PLU>");
		}
		if( ModelNumber != null ) {
			sb.append("<ebl:ModelNumber>").append(ModelNumber);
			sb.append("</ebl:ModelNumber>");
		}
		if( StyleNumber != null ) {
			sb.append("<ebl:StyleNumber>").append(StyleNumber);
			sb.append("</ebl:StyleNumber>");
		}
		return sb.toString();
	}

}
