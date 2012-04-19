
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
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.MerchantPullStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;


/**
 */
public class BAUpdateResponseDetailsType {

	/**
	 *
	 * @Required
	 */
	private String BillingAgreementID;
	public String getBillingAgreementID() {
		return BillingAgreementID;
	}
	public void setBillingAgreementID(String value) {
		this.BillingAgreementID = value;
	}

	/**
	 */
	private String BillingAgreementDescription;
	public String getBillingAgreementDescription() {
		return BillingAgreementDescription;
	}
	public void setBillingAgreementDescription(String value) {
		this.BillingAgreementDescription = value;
	}

	/**
	 *
	 * @Required
	 */
	private MerchantPullStatusCodeType BillingAgreementStatus;
	public MerchantPullStatusCodeType getBillingAgreementStatus() {
		return BillingAgreementStatus;
	}
	public void setBillingAgreementStatus(MerchantPullStatusCodeType value) {
		this.BillingAgreementStatus = value;
	}

	/**
	 */
	private String BillingAgreementCustom;
	public String getBillingAgreementCustom() {
		return BillingAgreementCustom;
	}
	public void setBillingAgreementCustom(String value) {
		this.BillingAgreementCustom = value;
	}

	/**
	 *
	 * @Required
	 */
	private PayerInfoType PayerInfo;
	public PayerInfoType getPayerInfo() {
		return PayerInfo;
	}
	public void setPayerInfo(PayerInfoType value) {
		this.PayerInfo = value;
	}

	/**
	 */
	private BasicAmountType BillingAgreementMax;
	public BasicAmountType getBillingAgreementMax() {
		return BillingAgreementMax;
	}
	public void setBillingAgreementMax(BasicAmountType value) {
		this.BillingAgreementMax = value;
	}

	/**
Customer's billing address.
	 * Optional
	 * If you have credit card mapped in your account then billing address of the 
	 * credit card is returned otherwise your primary address is returned , PayPal 
	 * returns this address in BAUpdateResponseDetails.
	 */
	private AddressType BillingAddress;
	public AddressType getBillingAddress() {
		return BillingAddress;
	}
	public void setBillingAddress(AddressType value) {
		this.BillingAddress = value;
	}


	public BAUpdateResponseDetailsType() {
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
	 public BAUpdateResponseDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("BillingAgreementID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BillingAgreementID").item(0))){ 
		 this.BillingAgreementID =(String)document.getElementsByTagName("BillingAgreementID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("BillingAgreementDescription").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BillingAgreementDescription").item(0))){ 
		 this.BillingAgreementDescription =(String)document.getElementsByTagName("BillingAgreementDescription").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("BillingAgreementStatus").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BillingAgreementStatus").item(0))){ 
		 this.BillingAgreementStatus = MerchantPullStatusCodeType.fromValue(document.getElementsByTagName("BillingAgreementStatus").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("BillingAgreementCustom").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BillingAgreementCustom").item(0))){ 
		 this.BillingAgreementCustom =(String)document.getElementsByTagName("BillingAgreementCustom").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PayerInfo").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PayerInfo").item(0))){ 
		 nodeList = document.getElementsByTagName("PayerInfo");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.PayerInfo =  new PayerInfoType(xmlString);

}
	}
		 if(document.getElementsByTagName("BillingAgreementMax").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BillingAgreementMax").item(0))){ 
		 nodeList = document.getElementsByTagName("BillingAgreementMax");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.BillingAgreementMax =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("BillingAddress").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BillingAddress").item(0))){ 
		 nodeList = document.getElementsByTagName("BillingAddress");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.BillingAddress =  new AddressType(xmlString);

}
	}
	}
}
