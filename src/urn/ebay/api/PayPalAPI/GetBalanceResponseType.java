
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
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AbstractResponseType;


/**
 */
public class GetBalanceResponseType extends AbstractResponseType{

	/**
	 *
	 * @Required
	 */
	private BasicAmountType Balance;
	public BasicAmountType getBalance() {
		return Balance;
	}
	public void setBalance(BasicAmountType value) {
		this.Balance = value;
	}

	/**
	 *
	 * @Required
	 */
	private String BalanceTimeStamp;
	public String getBalanceTimeStamp() {
		return BalanceTimeStamp;
	}
	public void setBalanceTimeStamp(String value) {
		this.BalanceTimeStamp = value;
	}

	/**
	 */
	private List<BasicAmountType> BalanceHoldings = new ArrayList<BasicAmountType>();
	public List<BasicAmountType> getBalanceHoldings() {
		return BalanceHoldings;
	}
	public void setBalanceHoldings(List<BasicAmountType> value) {
		this.BalanceHoldings = value;
	}


	public GetBalanceResponseType() {
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
	 public GetBalanceResponseType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 super(xmlSoap); 
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("Balance").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Balance").item(0))){ 
		 nodeList = document.getElementsByTagName("Balance");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.Balance =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("BalanceTimeStamp").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BalanceTimeStamp").item(0))){ 
		 this.BalanceTimeStamp =(String)document.getElementsByTagName("BalanceTimeStamp").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("BalanceHoldings").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BalanceHoldings").item(0))){ 
		 nodeList = document.getElementsByTagName("BalanceHoldings");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 xmlString = convertToXML(nodeList.item(i)); 
				this.BalanceHoldings.add(new BasicAmountType(xmlString));
			}

}
	}
	}
}
