
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

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
import urn.ebay.api.PayPalAPI.InstallmentDetailsType;
import urn.ebay.apis.eBLBaseComponents.OptionTypeListType;


/**
 * Option Selection.
 * Required
 * Character length and limitations: 12 single-byte alphanumeric characters
 */
public class OptionSelectionDetailsType {

	/**
	 * Option Selection.
	 * Required
	 * Character length and limitations: 12 single-byte alphanumeric characters
	 *
	 * @Required
	 */
	private String OptionSelection;
	public String getOptionSelection() {
		return OptionSelection;
	}
	public void setOptionSelection(String value) {
		this.OptionSelection = value;
	}

	/**
	 * Option Price.
	 * Optional     
	 */
	private String Price;
	public String getPrice() {
		return Price;
	}
	public void setPrice(String value) {
		this.Price = value;
	}

	/**
	 * Option Type
	 * Optional
	 */
	private OptionTypeListType OptionType;
	public OptionTypeListType getOptionType() {
		return OptionType;
	}
	public void setOptionType(OptionTypeListType value) {
		this.OptionType = value;
	}

	/**
	 */
	private List<InstallmentDetailsType> PaymentPeriod = new ArrayList<InstallmentDetailsType>();
	public List<InstallmentDetailsType> getPaymentPeriod() {
		return PaymentPeriod;
	}
	public void setPaymentPeriod(List<InstallmentDetailsType> value) {
		this.PaymentPeriod = value;
	}


	public OptionSelectionDetailsType(String OptionSelection) {
		this.OptionSelection = OptionSelection;
	}
	public OptionSelectionDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( OptionSelection != null ) {
			sb.append("<urn:OptionSelection>").append(OptionSelection);
			sb.append("</urn:OptionSelection>");
		}
		if( Price != null ) {
			sb.append("<urn:Price>").append(Price);
			sb.append("</urn:Price>");
		}
		if( OptionType != null ) {
			sb.append("<urn:OptionType>").append( OptionType.getValue());
			sb.append("</urn:OptionType>");
		}
		if( PaymentPeriod != null ) {
			for(int i=0; i<PaymentPeriod.size(); i++) {
				sb.append("<urn:PaymentPeriod>");
				sb.append(PaymentPeriod.get(i).toXMLString());
				sb.append("</urn:PaymentPeriod>");
			}
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
	 public OptionSelectionDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("OptionSelection").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OptionSelection").item(0))){ 
		 this.OptionSelection =(String)document.getElementsByTagName("OptionSelection").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Price").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Price").item(0))){ 
		 this.Price =(String)document.getElementsByTagName("Price").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("OptionType").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OptionType").item(0))){ 
		 this.OptionType = OptionTypeListType.fromValue(document.getElementsByTagName("OptionType").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("PaymentPeriod").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentPeriod").item(0))){ 
		 nodeList = document.getElementsByTagName("PaymentPeriod");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 xmlString = convertToXML(nodeList.item(i)); 
				this.PaymentPeriod.add(new InstallmentDetailsType(xmlString));
			}

}
	}
	}
}
