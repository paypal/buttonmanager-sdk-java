
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
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.IncentiveAppliedDetailsType;
import urn.ebay.apis.eBLBaseComponents.IncentiveAppliedStatusType;
import urn.ebay.apis.eBLBaseComponents.IncentiveSiteAppliedOnType;


/**
 * Information about the incentives that were applied from Ebay RYP page and PayPal RYP page.
 */
public class IncentiveDetailsType {

	/**
	 * Unique Identifier consisting of redemption code, user friendly descripotion, incentive type, campaign code, incenitve application order and site redeemed o
n.
	 */
	private String UniqueIdentifier;
	public String getUniqueIdentifier() {
		return UniqueIdentifier;
	}
	public void setUniqueIdentifier(String value) {
		this.UniqueIdentifier = value;
	}

	/**
	 * Defines if the incentive has been applied on Ebay or PayPal.
	 */
	private IncentiveSiteAppliedOnType SiteAppliedOn;
	public IncentiveSiteAppliedOnType getSiteAppliedOn() {
		return SiteAppliedOn;
	}
	public void setSiteAppliedOn(IncentiveSiteAppliedOnType value) {
		this.SiteAppliedOn = value;
	}

	/**
	 * The total discount amount for the incentive, summation of discounts up across all the buckets/items.
	 */
	private BasicAmountType TotalDiscountAmount;
	public BasicAmountType getTotalDiscountAmount() {
		return TotalDiscountAmount;
	}
	public void setTotalDiscountAmount(BasicAmountType value) {
		this.TotalDiscountAmount = value;
	}

	/**
	 * Status of incentive processing. Sussess or Error.
	 */
	private IncentiveAppliedStatusType Status;
	public IncentiveAppliedStatusType getStatus() {
		return Status;
	}
	public void setStatus(IncentiveAppliedStatusType value) {
		this.Status = value;
	}

	/**
	 * Error code if there are any errors. Zero otherwise.
	 */
	private Integer ErrorCode;
	public Integer getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(Integer value) {
		this.ErrorCode = value;
	}

	/**
	 * Details of incentive application on individual bucket/item.  
	 */
	private List<IncentiveAppliedDetailsType> IncentiveAppliedDetails = new ArrayList<IncentiveAppliedDetailsType>();
	public List<IncentiveAppliedDetailsType> getIncentiveAppliedDetails() {
		return IncentiveAppliedDetails;
	}
	public void setIncentiveAppliedDetails(List<IncentiveAppliedDetailsType> value) {
		this.IncentiveAppliedDetails = value;
	}


	public IncentiveDetailsType() {
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
	 public IncentiveDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("UniqueIdentifier").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("UniqueIdentifier").item(0))){ 
		 this.UniqueIdentifier =(String)document.getElementsByTagName("UniqueIdentifier").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("SiteAppliedOn").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("SiteAppliedOn").item(0))){ 
		 this.SiteAppliedOn = IncentiveSiteAppliedOnType.fromValue(document.getElementsByTagName("SiteAppliedOn").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("TotalDiscountAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TotalDiscountAmount").item(0))){ 
		 nodeList = document.getElementsByTagName("TotalDiscountAmount");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.TotalDiscountAmount =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("Status").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Status").item(0))){ 
		 this.Status = IncentiveAppliedStatusType.fromValue(document.getElementsByTagName("Status").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("ErrorCode").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ErrorCode").item(0))){ 
		 this.ErrorCode =Integer.valueOf(document.getElementsByTagName("ErrorCode").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("IncentiveAppliedDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("IncentiveAppliedDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("IncentiveAppliedDetails");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 xmlString = convertToXML(nodeList.item(i)); 
				this.IncentiveAppliedDetails.add(new IncentiveAppliedDetailsType(xmlString));
			}

}
	}
	}
}
