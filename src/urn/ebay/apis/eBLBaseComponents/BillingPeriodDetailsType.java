package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BillingPeriodType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
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
 * Unit of meausre for billing cycle 
 */
public class BillingPeriodDetailsType{


	/**
	 * Unit of meausre for billing cycle 	  
	 *@Required	 
	 */ 
	private BillingPeriodType BillingPeriod;

	/**
	 * Number of BillingPeriod that make up one billing cycle 	  
	 *@Required	 
	 */ 
	private Integer BillingFrequency;

	/**
	 * Total billing cycles in this portion of the schedule 	 
	 */ 
	private Integer TotalBillingCycles;

	/**
	 * Amount to charge 	  
	 *@Required	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * Additional shipping amount to charge 	 
	 */ 
	private BasicAmountType ShippingAmount;

	/**
	 * Additional tax amount to charge 	 
	 */ 
	private BasicAmountType TaxAmount;

	

	/**
	 * Constructor with arguments
	 */
	public BillingPeriodDetailsType (BillingPeriodType BillingPeriod, Integer BillingFrequency, BasicAmountType Amount){
		this.BillingPeriod = BillingPeriod;
		this.BillingFrequency = BillingFrequency;
		this.Amount = Amount;
	}	

	/**
	 * Default Constructor
	 */
	public BillingPeriodDetailsType (){
	}	

	/**
	 * Getter for BillingPeriod
	 */
	 public BillingPeriodType getBillingPeriod() {
	 	return BillingPeriod;
	 }
	 
	/**
	 * Setter for BillingPeriod
	 */
	 public void setBillingPeriod(BillingPeriodType BillingPeriod) {
	 	this.BillingPeriod = BillingPeriod;
	 }
	 
	/**
	 * Getter for BillingFrequency
	 */
	 public Integer getBillingFrequency() {
	 	return BillingFrequency;
	 }
	 
	/**
	 * Setter for BillingFrequency
	 */
	 public void setBillingFrequency(Integer BillingFrequency) {
	 	this.BillingFrequency = BillingFrequency;
	 }
	 
	/**
	 * Getter for TotalBillingCycles
	 */
	 public Integer getTotalBillingCycles() {
	 	return TotalBillingCycles;
	 }
	 
	/**
	 * Setter for TotalBillingCycles
	 */
	 public void setTotalBillingCycles(Integer TotalBillingCycles) {
	 	this.TotalBillingCycles = TotalBillingCycles;
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
	 * Getter for ShippingAmount
	 */
	 public BasicAmountType getShippingAmount() {
	 	return ShippingAmount;
	 }
	 
	/**
	 * Setter for ShippingAmount
	 */
	 public void setShippingAmount(BasicAmountType ShippingAmount) {
	 	this.ShippingAmount = ShippingAmount;
	 }
	 
	/**
	 * Getter for TaxAmount
	 */
	 public BasicAmountType getTaxAmount() {
	 	return TaxAmount;
	 }
	 
	/**
	 * Setter for TaxAmount
	 */
	 public void setTaxAmount(BasicAmountType TaxAmount) {
	 	this.TaxAmount = TaxAmount;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(BillingPeriod != null) {
			sb.append("<ebl:BillingPeriod>").append(BillingPeriod.getValue());
			sb.append("</ebl:BillingPeriod>");
		}
		if(BillingFrequency != null) {
			sb.append("<ebl:BillingFrequency>").append(BillingFrequency);
			sb.append("</ebl:BillingFrequency>");
		}
		if(TotalBillingCycles != null) {
			sb.append("<ebl:TotalBillingCycles>").append(TotalBillingCycles);
			sb.append("</ebl:TotalBillingCycles>");
		}
		if(Amount != null) {
			sb.append("<ebl:Amount");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		if(ShippingAmount != null) {
			sb.append("<ebl:ShippingAmount");
			sb.append(ShippingAmount.toXMLString());
			sb.append("</ebl:ShippingAmount>");
		}
		if(TaxAmount != null) {
			sb.append("<ebl:TaxAmount");
			sb.append(TaxAmount.toXMLString());
			sb.append("</ebl:TaxAmount>");
		}
		return sb.toString();
	}
	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else if (n.getNodeType() == Node.ELEMENT_NODE ){
			return (n.getChildNodes().getLength() == 0);
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
	
	public BillingPeriodDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if(document.getElementsByTagName("BillingPeriod").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BillingPeriod").item(0))) {
				this.BillingPeriod = BillingPeriodType.fromValue(document.getElementsByTagName("BillingPeriod").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("BillingFrequency").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BillingFrequency").item(0))) {
				this.BillingFrequency = Integer.valueOf(document.getElementsByTagName("BillingFrequency").item(0).getTextContent());
			}
		}
	
		if (document.getElementsByTagName("TotalBillingCycles").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TotalBillingCycles").item(0))) {
				this.TotalBillingCycles = Integer.valueOf(document.getElementsByTagName("TotalBillingCycles").item(0).getTextContent());
			}
		}
	
		if(document.getElementsByTagName("Amount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Amount").item(0))) {
				nodeList = document.getElementsByTagName("Amount");
				xmlString = convertToXML(nodeList.item(0));
				this.Amount =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("ShippingAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ShippingAmount").item(0))) {
				nodeList = document.getElementsByTagName("ShippingAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.ShippingAmount =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("TaxAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TaxAmount").item(0))) {
				nodeList = document.getElementsByTagName("TaxAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.TaxAmount =  new BasicAmountType(xmlString);
			}
		}
	}
 
}