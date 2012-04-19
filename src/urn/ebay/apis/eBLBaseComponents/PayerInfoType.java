
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
import urn.ebay.apis.EnhancedDataTypes.EnhancedPayerInfoType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.CountryCodeType;
import urn.ebay.apis.eBLBaseComponents.PayPalUserStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.PersonNameType;
import urn.ebay.apis.eBLBaseComponents.TaxIdDetailsType;


/**
 * PayerInfoType 
 * Payer information
 */
public class PayerInfoType {

	/**
	 * Email address of payer 
Character length and limitations: 127 single-byte characters
	 */
	private String Payer;
	public String getPayer() {
		return Payer;
	}
	public void setPayer(String value) {
		this.Payer = value;
	}

	/**
	 * Unique customer ID 
Character length and limitations: 17 single-byte characters
	 */
	private String PayerID;
	public String getPayerID() {
		return PayerID;
	}
	public void setPayerID(String value) {
		this.PayerID = value;
	}

	/**
	 * Status of payer's email address
	 */
	private PayPalUserStatusCodeType PayerStatus;
	public PayPalUserStatusCodeType getPayerStatus() {
		return PayerStatus;
	}
	public void setPayerStatus(PayPalUserStatusCodeType value) {
		this.PayerStatus = value;
	}

	/**
	 * Name of payer 	 */
	private PersonNameType PayerName;
	public PersonNameType getPayerName() {
		return PayerName;
	}
	public void setPayerName(PersonNameType value) {
		this.PayerName = value;
	}

	/**
	 * Payment sender's country of residence using standard two-character ISO 3166 country codes. 
Character length and limitations: Two single-byte characters
	 */
	private CountryCodeType PayerCountry;
	public CountryCodeType getPayerCountry() {
		return PayerCountry;
	}
	public void setPayerCountry(CountryCodeType value) {
		this.PayerCountry = value;
	}

	/**
	 * Payer's business name. 
Character length and limitations: 127 single-byte characters	 */
	private String PayerBusiness;
	public String getPayerBusiness() {
		return PayerBusiness;
	}
	public void setPayerBusiness(String value) {
		this.PayerBusiness = value;
	}

	/**
	 * Payer's business address	 */
	private AddressType Address;
	public AddressType getAddress() {
		return Address;
	}
	public void setAddress(AddressType value) {
		this.Address = value;
	}

	/**
Business contact telephone number	 */
	private String ContactPhone;
	public String getContactPhone() {
		return ContactPhone;
	}
	public void setContactPhone(String value) {
		this.ContactPhone = value;
	}

	/**
	 * Details about payer's tax info.
	 * Refer to the TaxIdDetailsType for more details.
	 */
	private TaxIdDetailsType TaxIdDetails;
	public TaxIdDetailsType getTaxIdDetails() {
		return TaxIdDetails;
	}
	public void setTaxIdDetails(TaxIdDetailsType value) {
		this.TaxIdDetails = value;
	}

	/**
Holds any enhanced information about the payer	 */
	private EnhancedPayerInfoType EnhancedPayerInfo;
	public EnhancedPayerInfoType getEnhancedPayerInfo() {
		return EnhancedPayerInfo;
	}
	public void setEnhancedPayerInfo(EnhancedPayerInfoType value) {
		this.EnhancedPayerInfo = value;
	}


	public PayerInfoType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( Payer != null ) {
			sb.append("<ebl:Payer>").append(Payer);
			sb.append("</ebl:Payer>");
		}
		if( PayerID != null ) {
			sb.append("<ebl:PayerID>").append(PayerID);
			sb.append("</ebl:PayerID>");
		}
		if( PayerStatus != null ) {
			sb.append("<ebl:PayerStatus>").append( PayerStatus.getValue());
			sb.append("</ebl:PayerStatus>");
		}
		if( PayerName != null ) {
			sb.append("<ebl:PayerName>");
			sb.append(PayerName.toXMLString());
			sb.append("</ebl:PayerName>");
		}
		if( PayerCountry != null ) {
			sb.append("<ebl:PayerCountry>").append( PayerCountry.getValue());
			sb.append("</ebl:PayerCountry>");
		}
		if( PayerBusiness != null ) {
			sb.append("<ebl:PayerBusiness>").append(PayerBusiness);
			sb.append("</ebl:PayerBusiness>");
		}
		if( Address != null ) {
			sb.append("<ebl:Address>");
			sb.append(Address.toXMLString());
			sb.append("</ebl:Address>");
		}
		if( ContactPhone != null ) {
			sb.append("<ebl:ContactPhone>").append(ContactPhone);
			sb.append("</ebl:ContactPhone>");
		}
		if( TaxIdDetails != null ) {
			sb.append("<ebl:TaxIdDetails>");
			sb.append(TaxIdDetails.toXMLString());
			sb.append("</ebl:TaxIdDetails>");
		}
		if( EnhancedPayerInfo != null ) {
			sb.append("<ebl:EnhancedPayerInfo>");
			sb.append(EnhancedPayerInfo.toXMLString());
			sb.append("</ebl:EnhancedPayerInfo>");
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
	 public PayerInfoType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("Payer").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Payer").item(0))){ 
		 this.Payer =(String)document.getElementsByTagName("Payer").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PayerID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PayerID").item(0))){ 
		 this.PayerID =(String)document.getElementsByTagName("PayerID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PayerStatus").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PayerStatus").item(0))){ 
		 this.PayerStatus = PayPalUserStatusCodeType.fromValue(document.getElementsByTagName("PayerStatus").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("PayerName").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PayerName").item(0))){ 
		 nodeList = document.getElementsByTagName("PayerName");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.PayerName =  new PersonNameType(xmlString);

}
	}
		 if(document.getElementsByTagName("PayerCountry").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PayerCountry").item(0))){ 
		 this.PayerCountry = CountryCodeType.fromValue(document.getElementsByTagName("PayerCountry").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("PayerBusiness").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PayerBusiness").item(0))){ 
		 this.PayerBusiness =(String)document.getElementsByTagName("PayerBusiness").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Address").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Address").item(0))){ 
		 nodeList = document.getElementsByTagName("Address");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.Address =  new AddressType(xmlString);

}
	}
		 if(document.getElementsByTagName("ContactPhone").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ContactPhone").item(0))){ 
		 this.ContactPhone =(String)document.getElementsByTagName("ContactPhone").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("TaxIdDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TaxIdDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("TaxIdDetails");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.TaxIdDetails =  new TaxIdDetailsType(xmlString);

}
	}
		 if(document.getElementsByTagName("EnhancedPayerInfo").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("EnhancedPayerInfo").item(0))){ 
		 nodeList = document.getElementsByTagName("EnhancedPayerInfo");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.EnhancedPayerInfo =  new EnhancedPayerInfoType(xmlString);

}
	}
	}
}
