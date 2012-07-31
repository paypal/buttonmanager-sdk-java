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
public class RecurringPaymentsSummaryType{


	/**
	 * 	 
	 */ 
	private String NextBillingDate;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private Integer NumberCyclesCompleted;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private Integer NumberCyclesRemaining;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private BasicAmountType OutstandingBalance;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private Integer FailedPaymentCount;

	/**
	 * 	 
	 */ 
	private String LastPaymentDate;

	/**
	 * 	 
	 */ 
	private BasicAmountType LastPaymentAmount;

	

	/**
	 * Default Constructor
	 */
	public RecurringPaymentsSummaryType (){
	}	

	/**
	 * Getter for NextBillingDate
	 */
	 public String getNextBillingDate() {
	 	return NextBillingDate;
	 }
	 
	/**
	 * Setter for NextBillingDate
	 */
	 public void setNextBillingDate(String NextBillingDate) {
	 	this.NextBillingDate = NextBillingDate;
	 }
	 
	/**
	 * Getter for NumberCyclesCompleted
	 */
	 public Integer getNumberCyclesCompleted() {
	 	return NumberCyclesCompleted;
	 }
	 
	/**
	 * Setter for NumberCyclesCompleted
	 */
	 public void setNumberCyclesCompleted(Integer NumberCyclesCompleted) {
	 	this.NumberCyclesCompleted = NumberCyclesCompleted;
	 }
	 
	/**
	 * Getter for NumberCyclesRemaining
	 */
	 public Integer getNumberCyclesRemaining() {
	 	return NumberCyclesRemaining;
	 }
	 
	/**
	 * Setter for NumberCyclesRemaining
	 */
	 public void setNumberCyclesRemaining(Integer NumberCyclesRemaining) {
	 	this.NumberCyclesRemaining = NumberCyclesRemaining;
	 }
	 
	/**
	 * Getter for OutstandingBalance
	 */
	 public BasicAmountType getOutstandingBalance() {
	 	return OutstandingBalance;
	 }
	 
	/**
	 * Setter for OutstandingBalance
	 */
	 public void setOutstandingBalance(BasicAmountType OutstandingBalance) {
	 	this.OutstandingBalance = OutstandingBalance;
	 }
	 
	/**
	 * Getter for FailedPaymentCount
	 */
	 public Integer getFailedPaymentCount() {
	 	return FailedPaymentCount;
	 }
	 
	/**
	 * Setter for FailedPaymentCount
	 */
	 public void setFailedPaymentCount(Integer FailedPaymentCount) {
	 	this.FailedPaymentCount = FailedPaymentCount;
	 }
	 
	/**
	 * Getter for LastPaymentDate
	 */
	 public String getLastPaymentDate() {
	 	return LastPaymentDate;
	 }
	 
	/**
	 * Setter for LastPaymentDate
	 */
	 public void setLastPaymentDate(String LastPaymentDate) {
	 	this.LastPaymentDate = LastPaymentDate;
	 }
	 
	/**
	 * Getter for LastPaymentAmount
	 */
	 public BasicAmountType getLastPaymentAmount() {
	 	return LastPaymentAmount;
	 }
	 
	/**
	 * Setter for LastPaymentAmount
	 */
	 public void setLastPaymentAmount(BasicAmountType LastPaymentAmount) {
	 	this.LastPaymentAmount = LastPaymentAmount;
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
	
	public RecurringPaymentsSummaryType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("NextBillingDate").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("NextBillingDate").item(0))) {
				this.NextBillingDate = (String)document.getElementsByTagName("NextBillingDate").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("NumberCyclesCompleted").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("NumberCyclesCompleted").item(0))) {
				this.NumberCyclesCompleted = Integer.valueOf(document.getElementsByTagName("NumberCyclesCompleted").item(0).getTextContent());
			}
		}
	
		if (document.getElementsByTagName("NumberCyclesRemaining").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("NumberCyclesRemaining").item(0))) {
				this.NumberCyclesRemaining = Integer.valueOf(document.getElementsByTagName("NumberCyclesRemaining").item(0).getTextContent());
			}
		}
	
		if(document.getElementsByTagName("OutstandingBalance").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OutstandingBalance").item(0))) {
				nodeList = document.getElementsByTagName("OutstandingBalance");
				xmlString = convertToXML(nodeList.item(0));
				this.OutstandingBalance =  new BasicAmountType(xmlString);
			}
		}
		if (document.getElementsByTagName("FailedPaymentCount").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("FailedPaymentCount").item(0))) {
				this.FailedPaymentCount = Integer.valueOf(document.getElementsByTagName("FailedPaymentCount").item(0).getTextContent());
			}
		}
	
		if (document.getElementsByTagName("LastPaymentDate").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("LastPaymentDate").item(0))) {
				this.LastPaymentDate = (String)document.getElementsByTagName("LastPaymentDate").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("LastPaymentAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("LastPaymentAmount").item(0))) {
				nodeList = document.getElementsByTagName("LastPaymentAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.LastPaymentAmount =  new BasicAmountType(xmlString);
			}
		}
	}

}