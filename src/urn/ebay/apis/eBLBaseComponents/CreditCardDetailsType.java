package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.CreditCardTypeType;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import urn.ebay.apis.eBLBaseComponents.ThreeDSecureRequestType;
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
 * CreditCardDetailsType Information about a Credit Card. 
 */
public class CreditCardDetailsType{


	/**
	 * No Document Comments	 
	 */ 
	private CreditCardTypeType CreditCardType;

	/**
	 * No Document Comments	 
	 */ 
	private String CreditCardNumber;

	/**
	 * No Document Comments	 
	 */ 
	private Integer ExpMonth;

	/**
	 * No Document Comments	 
	 */ 
	private Integer ExpYear;

	/**
	 * No Document Comments	 
	 */ 
	private PayerInfoType CardOwner;

	/**
	 * No Document Comments	 
	 */ 
	private String CVV2;

	/**
	 * No Document Comments	 
	 */ 
	private Integer StartMonth;

	/**
	 * No Document Comments	 
	 */ 
	private Integer StartYear;

	/**
	 * No Document Comments	 
	 */ 
	private String IssueNumber;

	/**
	 * No Document Comments	 
	 */ 
	private ThreeDSecureRequestType ThreeDSecureRequest;

	

	/**
	 * Default Constructor
	 */
	public CreditCardDetailsType (){
	}	

	/**
	 * Getter for CreditCardType
	 */
	 public CreditCardTypeType getCreditCardType() {
	 	return CreditCardType;
	 }
	 
	/**
	 * Setter for CreditCardType
	 */
	 public void setCreditCardType(CreditCardTypeType CreditCardType) {
	 	this.CreditCardType = CreditCardType;
	 }
	 
	/**
	 * Getter for CreditCardNumber
	 */
	 public String getCreditCardNumber() {
	 	return CreditCardNumber;
	 }
	 
	/**
	 * Setter for CreditCardNumber
	 */
	 public void setCreditCardNumber(String CreditCardNumber) {
	 	this.CreditCardNumber = CreditCardNumber;
	 }
	 
	/**
	 * Getter for ExpMonth
	 */
	 public Integer getExpMonth() {
	 	return ExpMonth;
	 }
	 
	/**
	 * Setter for ExpMonth
	 */
	 public void setExpMonth(Integer ExpMonth) {
	 	this.ExpMonth = ExpMonth;
	 }
	 
	/**
	 * Getter for ExpYear
	 */
	 public Integer getExpYear() {
	 	return ExpYear;
	 }
	 
	/**
	 * Setter for ExpYear
	 */
	 public void setExpYear(Integer ExpYear) {
	 	this.ExpYear = ExpYear;
	 }
	 
	/**
	 * Getter for CardOwner
	 */
	 public PayerInfoType getCardOwner() {
	 	return CardOwner;
	 }
	 
	/**
	 * Setter for CardOwner
	 */
	 public void setCardOwner(PayerInfoType CardOwner) {
	 	this.CardOwner = CardOwner;
	 }
	 
	/**
	 * Getter for CVV2
	 */
	 public String getCVV2() {
	 	return CVV2;
	 }
	 
	/**
	 * Setter for CVV2
	 */
	 public void setCVV2(String CVV2) {
	 	this.CVV2 = CVV2;
	 }
	 
	/**
	 * Getter for StartMonth
	 */
	 public Integer getStartMonth() {
	 	return StartMonth;
	 }
	 
	/**
	 * Setter for StartMonth
	 */
	 public void setStartMonth(Integer StartMonth) {
	 	this.StartMonth = StartMonth;
	 }
	 
	/**
	 * Getter for StartYear
	 */
	 public Integer getStartYear() {
	 	return StartYear;
	 }
	 
	/**
	 * Setter for StartYear
	 */
	 public void setStartYear(Integer StartYear) {
	 	this.StartYear = StartYear;
	 }
	 
	/**
	 * Getter for IssueNumber
	 */
	 public String getIssueNumber() {
	 	return IssueNumber;
	 }
	 
	/**
	 * Setter for IssueNumber
	 */
	 public void setIssueNumber(String IssueNumber) {
	 	this.IssueNumber = IssueNumber;
	 }
	 
	/**
	 * Getter for ThreeDSecureRequest
	 */
	 public ThreeDSecureRequestType getThreeDSecureRequest() {
	 	return ThreeDSecureRequest;
	 }
	 
	/**
	 * Setter for ThreeDSecureRequest
	 */
	 public void setThreeDSecureRequest(ThreeDSecureRequestType ThreeDSecureRequest) {
	 	this.ThreeDSecureRequest = ThreeDSecureRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(CreditCardType != null) {
			sb.append("<ebl:CreditCardType>").append(CreditCardType.getValue());
			sb.append("</ebl:CreditCardType>");
		}
		if(CreditCardNumber != null) {
			sb.append("<ebl:CreditCardNumber>").append(CreditCardNumber);
			sb.append("</ebl:CreditCardNumber>");
		}
		if(ExpMonth != null) {
			sb.append("<ebl:ExpMonth>").append(ExpMonth);
			sb.append("</ebl:ExpMonth>");
		}
		if(ExpYear != null) {
			sb.append("<ebl:ExpYear>").append(ExpYear);
			sb.append("</ebl:ExpYear>");
		}
		if(CardOwner != null) {
			sb.append("<ebl:CardOwner>");
			sb.append(CardOwner.toXMLString());
			sb.append("</ebl:CardOwner>");
		}
		if(CVV2 != null) {
			sb.append("<ebl:CVV2>").append(CVV2);
			sb.append("</ebl:CVV2>");
		}
		if(StartMonth != null) {
			sb.append("<ebl:StartMonth>").append(StartMonth);
			sb.append("</ebl:StartMonth>");
		}
		if(StartYear != null) {
			sb.append("<ebl:StartYear>").append(StartYear);
			sb.append("</ebl:StartYear>");
		}
		if(IssueNumber != null) {
			sb.append("<ebl:IssueNumber>").append(IssueNumber);
			sb.append("</ebl:IssueNumber>");
		}
		if(ThreeDSecureRequest != null) {
			sb.append("<ebl:ThreeDSecureRequest>");
			sb.append(ThreeDSecureRequest.toXMLString());
			sb.append("</ebl:ThreeDSecureRequest>");
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
			return "&lt![CDATA[\" + n.getNodeValue() + \"]]&gt";
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
	
	public CreditCardDetailsType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if(document.getElementsByTagName("CreditCardType").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("CreditCardType").item(0))) {
				this.CreditCardType = CreditCardTypeType.fromValue(document.getElementsByTagName("CreditCardType").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("CreditCardNumber").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("CreditCardNumber").item(0))) {
				this.CreditCardNumber = (String)document.getElementsByTagName("CreditCardNumber").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ExpMonth").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ExpMonth").item(0))) {
				this.ExpMonth = Integer.valueOf(document.getElementsByTagName("ExpMonth").item(0).getTextContent());
			}
		}
	
		if (document.getElementsByTagName("ExpYear").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ExpYear").item(0))) {
				this.ExpYear = Integer.valueOf(document.getElementsByTagName("ExpYear").item(0).getTextContent());
			}
		}
	
		if(document.getElementsByTagName("CardOwner").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("CardOwner").item(0))) {
				nodeList = document.getElementsByTagName("CardOwner");
				xmlString = convertToXML(nodeList.item(0));
				this.CardOwner =  new PayerInfoType(xmlString);
			}
		}
		if (document.getElementsByTagName("CVV2").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("CVV2").item(0))) {
				this.CVV2 = (String)document.getElementsByTagName("CVV2").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("StartMonth").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("StartMonth").item(0))) {
				this.StartMonth = Integer.valueOf(document.getElementsByTagName("StartMonth").item(0).getTextContent());
			}
		}
	
		if (document.getElementsByTagName("StartYear").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("StartYear").item(0))) {
				this.StartYear = Integer.valueOf(document.getElementsByTagName("StartYear").item(0).getTextContent());
			}
		}
	
		if (document.getElementsByTagName("IssueNumber").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("IssueNumber").item(0))) {
				this.IssueNumber = (String)document.getElementsByTagName("IssueNumber").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("ThreeDSecureRequest").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ThreeDSecureRequest").item(0))) {
				nodeList = document.getElementsByTagName("ThreeDSecureRequest");
				xmlString = convertToXML(nodeList.item(0));
				this.ThreeDSecureRequest =  new ThreeDSecureRequestType(xmlString);
			}
		}
	}

}