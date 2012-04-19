
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

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
import urn.ebay.apis.eBLBaseComponents.AbstractResponseType;
import urn.ebay.apis.eBLBaseComponents.FMFDetailsType;
import urn.ebay.apis.eBLBaseComponents.PaymentStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.PendingStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.ThreeDSecureResponseType;


/**
 * The amount of the payment as specified by you on DoDirectPaymentRequest. */
public class DoDirectPaymentResponseType extends AbstractResponseType{

	/**
	 * The amount of the payment as specified by you on DoDirectPaymentRequest.	 *
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
	 * Address Verification System response code. Character limit: One single-byte alphanumeric character
	 * AVS CodeMeaningMatched Details 
A AddressAddress only (no ZIP)  
B International “A”Address only (no ZIP)  
CInternational “N” None  
DInternational “X” Address and Postal Code  
E Not allowed for MOTO (Internet/Phone) transactions Not applicable 
F UK-specific “X”Address and Postal Code  
G Global Unavailable Not applicable 
I International UnavailableNot applicable  
N NoNone  
PPostal (International “Z”)Postal Code only (no Address)   
RRetryNot applicable   
S Service not Supported Not applicable 
U UnavailableNot applicable  
W Whole ZIPNine-digit ZIP code (no Address)  
X Exact match Address and nine-digit ZIP code 
Y YesAddress and five-digit ZIP  
Z ZIP Five-digit ZIP code (no Address) 
All others Error Not applicable
	 *
	 * @Required
	 */
	private String AVSCode;
	public String getAVSCode() {
		return AVSCode;
	}
	public void setAVSCode(String value) {
		this.AVSCode = value;
	}

	/**
	 * Result of the CVV2 check by PayPal.
	 * CVV2 CodeMeaningMatched Details   
M MatchCVV2  
N No match None 
P Not ProcessedNot applicable  
SService not SupportedNot applicable   
U UnavailableNot applicable  
XNo response  Not applicable 
All others ErrorNot applicable  
	 *
	 * @Required
	 */
	private String CVV2Code;
	public String getCVV2Code() {
		return CVV2Code;
	}
	public void setCVV2Code(String value) {
		this.CVV2Code = value;
	}

	/**
	 * Transaction identification number.
	 * Character length and limitations: 19 characters maximum.	 *
	 * @Required
	 */
	private String TransactionID;
	public String getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(String value) {
		this.TransactionID = value;
	}

	/**
	 * The reason why a particular transaction went in pending.
	 */
	private PendingStatusCodeType PendingReason;
	public PendingStatusCodeType getPendingReason() {
		return PendingReason;
	}
	public void setPendingReason(PendingStatusCodeType value) {
		this.PendingReason = value;
	}

	/**
	 * This will identify the actual transaction status.
	 */
	private PaymentStatusCodeType PaymentStatus;
	public PaymentStatusCodeType getPaymentStatus() {
		return PaymentStatus;
	}
	public void setPaymentStatus(PaymentStatusCodeType value) {
		this.PaymentStatus = value;
	}

	/**
	 */
	private FMFDetailsType FMFDetails;
	public FMFDetailsType getFMFDetails() {
		return FMFDetails;
	}
	public void setFMFDetails(FMFDetailsType value) {
		this.FMFDetails = value;
	}

	/**
	 */
	private ThreeDSecureResponseType ThreeDSecureResponse;
	public ThreeDSecureResponseType getThreeDSecureResponse() {
		return ThreeDSecureResponse;
	}
	public void setThreeDSecureResponse(ThreeDSecureResponseType value) {
		this.ThreeDSecureResponse = value;
	}

	/**
	 * Response code from the processor when a recurring transaction is declined.
	 */
	private String PaymentAdviceCode;
	public String getPaymentAdviceCode() {
		return PaymentAdviceCode;
	}
	public void setPaymentAdviceCode(String value) {
		this.PaymentAdviceCode = value;
	}


	public DoDirectPaymentResponseType() {
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
	 public DoDirectPaymentResponseType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 super(xmlSoap); 
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
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
		 if(document.getElementsByTagName("PendingReason").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PendingReason").item(0))){ 
		 this.PendingReason = PendingStatusCodeType.fromValue(document.getElementsByTagName("PendingReason").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("PaymentStatus").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentStatus").item(0))){ 
		 this.PaymentStatus = PaymentStatusCodeType.fromValue(document.getElementsByTagName("PaymentStatus").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("FMFDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("FMFDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("FMFDetails");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.FMFDetails =  new FMFDetailsType(xmlString);

}
	}
		 if(document.getElementsByTagName("ThreeDSecureResponse").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ThreeDSecureResponse").item(0))){ 
		 nodeList = document.getElementsByTagName("ThreeDSecureResponse");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.ThreeDSecureResponse =  new ThreeDSecureResponseType(xmlString);

}
	}
		 if(document.getElementsByTagName("PaymentAdviceCode").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentAdviceCode").item(0))){ 
		 this.PaymentAdviceCode =(String)document.getElementsByTagName("PaymentAdviceCode").item(0).getTextContent();

}
	}
	}
}
