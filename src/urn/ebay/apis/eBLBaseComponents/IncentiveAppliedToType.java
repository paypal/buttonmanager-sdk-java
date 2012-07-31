package urn.ebay.apis.eBLBaseComponents;
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
 * 
 */
public class IncentiveAppliedToType{


	/**
	 * 	 
	 */ 
	private String BucketId;

	/**
	 * 	 
	 */ 
	private String ItemId;

	/**
	 * 	 
	 */ 
	private BasicAmountType IncentiveAmount;

	/**
	 * 	 
	 */ 
	private String SubType;

	

	/**
	 * Default Constructor
	 */
	public IncentiveAppliedToType (){
	}	

	/**
	 * Getter for BucketId
	 */
	 public String getBucketId() {
	 	return BucketId;
	 }
	 
	/**
	 * Setter for BucketId
	 */
	 public void setBucketId(String BucketId) {
	 	this.BucketId = BucketId;
	 }
	 
	/**
	 * Getter for ItemId
	 */
	 public String getItemId() {
	 	return ItemId;
	 }
	 
	/**
	 * Setter for ItemId
	 */
	 public void setItemId(String ItemId) {
	 	this.ItemId = ItemId;
	 }
	 
	/**
	 * Getter for IncentiveAmount
	 */
	 public BasicAmountType getIncentiveAmount() {
	 	return IncentiveAmount;
	 }
	 
	/**
	 * Setter for IncentiveAmount
	 */
	 public void setIncentiveAmount(BasicAmountType IncentiveAmount) {
	 	this.IncentiveAmount = IncentiveAmount;
	 }
	 
	/**
	 * Getter for SubType
	 */
	 public String getSubType() {
	 	return SubType;
	 }
	 
	/**
	 * Setter for SubType
	 */
	 public void setSubType(String SubType) {
	 	this.SubType = SubType;
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
	
	public IncentiveAppliedToType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("BucketId").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BucketId").item(0))) {
				this.BucketId = (String)document.getElementsByTagName("BucketId").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ItemId").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ItemId").item(0))) {
				this.ItemId = (String)document.getElementsByTagName("ItemId").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("IncentiveAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("IncentiveAmount").item(0))) {
				nodeList = document.getElementsByTagName("IncentiveAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.IncentiveAmount =  new BasicAmountType(xmlString);
			}
		}
		if (document.getElementsByTagName("SubType").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SubType").item(0))) {
				this.SubType = (String)document.getElementsByTagName("SubType").item(0).getTextContent();
			}
		}
	
	}

}