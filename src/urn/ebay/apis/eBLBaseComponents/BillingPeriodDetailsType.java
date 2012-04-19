
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
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
import urn.ebay.apis.eBLBaseComponents.BillingPeriodType;


/**
 * Unit of meausre for billing cycle
 */
public class BillingPeriodDetailsType {

	/**
	 * Unit of meausre for billing cycle
	 *
	 * @Required
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
	 *
	 * @Required
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
	 *
	 * @Required
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


	public BillingPeriodDetailsType(BillingPeriodType BillingPeriod, Integer BillingFrequency, BasicAmountType Amount) {
		this.BillingPeriod = BillingPeriod;
		this.BillingFrequency = BillingFrequency;
		this.Amount = Amount;
	}
	public BillingPeriodDetailsType() {
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
	 public BillingPeriodDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("BillingPeriod").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BillingPeriod").item(0))){ 
		 this.BillingPeriod = BillingPeriodType.fromValue(document.getElementsByTagName("BillingPeriod").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("BillingFrequency").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BillingFrequency").item(0))){ 
		 this.BillingFrequency =Integer.valueOf(document.getElementsByTagName("BillingFrequency").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("TotalBillingCycles").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TotalBillingCycles").item(0))){ 
		 this.TotalBillingCycles =Integer.valueOf(document.getElementsByTagName("TotalBillingCycles").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("Amount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Amount").item(0))){ 
		 nodeList = document.getElementsByTagName("Amount");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.Amount =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("ShippingAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ShippingAmount").item(0))){ 
		 nodeList = document.getElementsByTagName("ShippingAmount");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.ShippingAmount =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("TaxAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TaxAmount").item(0))){ 
		 nodeList = document.getElementsByTagName("TaxAmount");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.TaxAmount =  new BasicAmountType(xmlString);

}
	}
	}
}
