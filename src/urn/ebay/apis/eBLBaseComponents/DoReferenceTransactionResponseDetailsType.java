
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
import urn.ebay.apis.eBLBaseComponents.PaymentInfoType;


/**
 */
public class DoReferenceTransactionResponseDetailsType {

	/**
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
	private PaymentInfoType PaymentInfo;
	public PaymentInfoType getPaymentInfo() {
		return PaymentInfo;
	}
	public void setPaymentInfo(PaymentInfoType value) {
		this.PaymentInfo = value;
	}

	/**
	 */
	private BasicAmountType Amount;
	public BasicAmountType getAmount() {
		return Amount;
	}
	public void setAmount(BasicAmountType value) {
		this.Amount = value;
	}

	/**
	 */
	private String AVSCode;
	public String getAVSCode() {
		return AVSCode;
	}
	public void setAVSCode(String value) {
		this.AVSCode = value;
	}

	/**
	 */
	private String CVV2Code;
	public String getCVV2Code() {
		return CVV2Code;
	}
	public void setCVV2Code(String value) {
		this.CVV2Code = value;
	}

	/**
	 */
	private String TransactionID;
	public String getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(String value) {
		this.TransactionID = value;
	}

	/**
	 * Response code from the processor when a recurring transaction is declined
	 */
	private String PaymentAdviceCode;
	public String getPaymentAdviceCode() {
		return PaymentAdviceCode;
	}
	public void setPaymentAdviceCode(String value) {
		this.PaymentAdviceCode = value;
	}


	public DoReferenceTransactionResponseDetailsType() {
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
	 public DoReferenceTransactionResponseDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
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
		 if(document.getElementsByTagName("PaymentInfo").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentInfo").item(0))){ 
		 nodeList = document.getElementsByTagName("PaymentInfo");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.PaymentInfo =  new PaymentInfoType(xmlString);

}
	}
		 if(document.getElementsByTagName("Amount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Amount").item(0))){ 
		 nodeList = document.getElementsByTagName("Amount");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.Amount =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("AVSCode").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AVSCode").item(0))){ 
		 this.AVSCode =(String)document.getElementsByTagName("AVSCode").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("CVV2Code").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("CVV2Code").item(0))){ 
		 this.CVV2Code =(String)document.getElementsByTagName("CVV2Code").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("TransactionID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TransactionID").item(0))){ 
		 this.TransactionID =(String)document.getElementsByTagName("TransactionID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PaymentAdviceCode").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentAdviceCode").item(0))){ 
		 this.PaymentAdviceCode =(String)document.getElementsByTagName("PaymentAdviceCode").item(0).getTextContent();

}
	}
	}
}
