
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.BillingPeriodType;


/**
 * Unit of meausre for billing cycle
 */
public class BillingPeriodDetailsType_Update {

	/**
	 * Unit of meausre for billing cycle
	 */
	private BillingPeriodType BillingPeriod;
	public BillingPeriodType getBillingPeriod() {
		return BillingPeriod;
	}
	public void setBillingPeriod(BillingPeriodType value) {
		this.BillingPeriod = value;
	}

	/**
	 * Number of BillingPeriod that make up one billing cycle
	 */
	private Integer BillingFrequency;
	public Integer getBillingFrequency() {
		return BillingFrequency;
	}
	public void setBillingFrequency(Integer value) {
		this.BillingFrequency = value;
	}

	/**
	 * Total billing cycles in this portion of the schedule
	 */
	private Integer TotalBillingCycles;
	public Integer getTotalBillingCycles() {
		return TotalBillingCycles;
	}
	public void setTotalBillingCycles(Integer value) {
		this.TotalBillingCycles = value;
	}

	/**
	 * Amount to charge
	 */
	private BasicAmountType Amount;
	public BasicAmountType getAmount() {
		return Amount;
	}
	public void setAmount(BasicAmountType value) {
		this.Amount = value;
	}

	/**
	 * Additional shipping amount to charge
	 */
	private BasicAmountType ShippingAmount;
	public BasicAmountType getShippingAmount() {
		return ShippingAmount;
	}
	public void setShippingAmount(BasicAmountType value) {
		this.ShippingAmount = value;
	}

	/**
	 * Additional tax amount to charge
	 */
	private BasicAmountType TaxAmount;
	public BasicAmountType getTaxAmount() {
		return TaxAmount;
	}
	public void setTaxAmount(BasicAmountType value) {
		this.TaxAmount = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( BillingPeriod != null ) {
			sb.append("<ebl:BillingPeriod>").append( BillingPeriod.getValue());
			sb.append("</ebl:BillingPeriod>");
		}
		if( BillingFrequency != null ) {
			sb.append("<ebl:BillingFrequency>").append(BillingFrequency);
			sb.append("</ebl:BillingFrequency>");
		}
		if( TotalBillingCycles != null ) {
			sb.append("<ebl:TotalBillingCycles>").append(TotalBillingCycles);
			sb.append("</ebl:TotalBillingCycles>");
		}
		if( Amount != null ) {
			sb.append("<ebl:Amount ");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		if( ShippingAmount != null ) {
			sb.append("<ebl:ShippingAmount ");
			sb.append(ShippingAmount.toXMLString());
			sb.append("</ebl:ShippingAmount>");
		}
		if( TaxAmount != null ) {
			sb.append("<ebl:TaxAmount ");
			sb.append(TaxAmount.toXMLString());
			sb.append("</ebl:TaxAmount>");
		}
		return sb.toString();
	}

}
