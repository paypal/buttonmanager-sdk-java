
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import urn.ebay.apis.eBLBaseComponents.PaymentInfoType;
import urn.ebay.apis.eBLBaseComponents.UserSelectedOptionType;


/**
 * The timestamped token value that was returned by SetExpressCheckoutResponse and passed on GetExpressCheckoutDetailsRequest. 
 * Character length and limitations:20 single-byte characters
 */
public class DoExpressCheckoutPaymentResponseDetailsType {

	/**
	 * The timestamped token value that was returned by SetExpressCheckoutResponse and passed on GetExpressCheckoutDetailsRequest. 
	 * Character length and limitations:20 single-byte characters
	 */
	private String Token;
	public String getToken() {
		return Token;
	}
	public void setToken(String value) {
		this.Token = value;
	}

	/**
Information about the transaction 	 */
	private List<PaymentInfoType> PaymentInfo = new ArrayList<PaymentInfoType>();
	public List<PaymentInfoType> getPaymentInfo() {
		return PaymentInfo;
	}
	public void setPaymentInfo(List<PaymentInfoType> value) {
		this.PaymentInfo = value;
	}

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
	private String RedirectRequired;
	public String getRedirectRequired() {
		return RedirectRequired;
	}
	public void setRedirectRequired(String value) {
		this.RedirectRequired = value;
	}

	/**
Memo entered by sender in PayPal Review Page note field.
	 * Optional
	 * Character length and limitations: 255 single-byte alphanumeric characters
	 */
	private String Note;
	public String getNote() {
		return Note;
	}
	public void setNote(String value) {
		this.Note = value;
	}

	/**
	 * Redirect back to PayPal, PayPal can host the success page. 	          
	 */
	private String SuccessPageRedirectRequested;
	public String getSuccessPageRedirectRequested() {
		return SuccessPageRedirectRequested;
	}
	public void setSuccessPageRedirectRequested(String value) {
		this.SuccessPageRedirectRequested = value;
	}

	/**
	 * Information about the user selected options.
	 */
	private UserSelectedOptionType UserSelectedOptions;
	public UserSelectedOptionType getUserSelectedOptions() {
		return UserSelectedOptions;
	}
	public void setUserSelectedOptions(UserSelectedOptionType value) {
		this.UserSelectedOptions = value;
	}


	public DoExpressCheckoutPaymentResponseDetailsType() {
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
	 public DoExpressCheckoutPaymentResponseDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("Token").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Token").item(0))){ 
		 this.Token =(String)document.getElementsByTagName("Token").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PaymentInfo").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentInfo").item(0))){ 
		 nodeList = document.getElementsByTagName("PaymentInfo");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 xmlString = convertToXML(nodeList.item(i)); 
				this.PaymentInfo.add(new PaymentInfoType(xmlString));
			}

}
	}
		 if(document.getElementsByTagName("BillingAgreementID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BillingAgreementID").item(0))){ 
		 this.BillingAgreementID =(String)document.getElementsByTagName("BillingAgreementID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("RedirectRequired").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("RedirectRequired").item(0))){ 
		 this.RedirectRequired =(String)document.getElementsByTagName("RedirectRequired").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Note").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Note").item(0))){ 
		 this.Note =(String)document.getElementsByTagName("Note").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("SuccessPageRedirectRequested").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("SuccessPageRedirectRequested").item(0))){ 
		 this.SuccessPageRedirectRequested =(String)document.getElementsByTagName("SuccessPageRedirectRequested").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("UserSelectedOptions").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("UserSelectedOptions").item(0))){ 
		 nodeList = document.getElementsByTagName("UserSelectedOptions");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.UserSelectedOptions =  new UserSelectedOptionType(xmlString);

}
	}
	}
}
