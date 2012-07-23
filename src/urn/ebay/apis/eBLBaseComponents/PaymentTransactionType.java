package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.ReceiverInfoType;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import urn.ebay.apis.eBLBaseComponents.PaymentInfoType;
import urn.ebay.apis.eBLBaseComponents.PaymentItemInfoType;
import urn.ebay.apis.eBLBaseComponents.OfferCouponInfoType;
import urn.ebay.apis.eBLBaseComponents.UserSelectedOptionType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import java.util.List;
import java.util.ArrayList;
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
 * PaymentTransactionType Information about a PayPal payment
 * from the seller side 
 */
public class PaymentTransactionType{


	/**
	 * Information about the recipient of the payment 	 
	 */ 
	private ReceiverInfoType ReceiverInfo;

	/**
	 * Information about the payer 	 
	 */ 
	private PayerInfoType PayerInfo;

	/**
	 * Information about the transaction 	 
	 */ 
	private PaymentInfoType PaymentInfo;

	/**
	 * Information about an individual item in the transaction	 
	 */ 
	private PaymentItemInfoType PaymentItemInfo;

	/**
	 * Information about an individual Offer and Coupon information
	 * in the transaction	 
	 */ 
	private OfferCouponInfoType OfferCouponInfo;

	/**
	 * Information about the user selected options.  	 
	 */ 
	private UserSelectedOptionType UserSelectedOptions;

	/**
	 * Information about the Gift message.  	 
	 */ 
	private String GiftMessage;

	/**
	 * Information about the Gift receipt.  	 
	 */ 
	private String GiftReceipt;

	/**
	 * Information about the Gift Wrap name.  	 
	 */ 
	private String GiftWrapName;

	/**
	 * Information about the Gift Wrap amount.  	 
	 */ 
	private BasicAmountType GiftWrapAmount;

	/**
	 * Information about the Buyer email.  	 
	 */ 
	private String BuyerEmailOptIn;

	/**
	 * Information about the survey question.  	 
	 */ 
	private String SurveyQuestion;

	/**
	 * Information about the survey choice selected by the user.  	 
	 */ 
	private List<String> SurveyChoiceSelected = new ArrayList<String>();

	

	/**
	 * Default Constructor
	 */
	public PaymentTransactionType (){
	}	

	/**
	 * Getter for ReceiverInfo
	 */
	 public ReceiverInfoType getReceiverInfo() {
	 	return ReceiverInfo;
	 }
	 
	/**
	 * Setter for ReceiverInfo
	 */
	 public void setReceiverInfo(ReceiverInfoType ReceiverInfo) {
	 	this.ReceiverInfo = ReceiverInfo;
	 }
	 
	/**
	 * Getter for PayerInfo
	 */
	 public PayerInfoType getPayerInfo() {
	 	return PayerInfo;
	 }
	 
	/**
	 * Setter for PayerInfo
	 */
	 public void setPayerInfo(PayerInfoType PayerInfo) {
	 	this.PayerInfo = PayerInfo;
	 }
	 
	/**
	 * Getter for PaymentInfo
	 */
	 public PaymentInfoType getPaymentInfo() {
	 	return PaymentInfo;
	 }
	 
	/**
	 * Setter for PaymentInfo
	 */
	 public void setPaymentInfo(PaymentInfoType PaymentInfo) {
	 	this.PaymentInfo = PaymentInfo;
	 }
	 
	/**
	 * Getter for PaymentItemInfo
	 */
	 public PaymentItemInfoType getPaymentItemInfo() {
	 	return PaymentItemInfo;
	 }
	 
	/**
	 * Setter for PaymentItemInfo
	 */
	 public void setPaymentItemInfo(PaymentItemInfoType PaymentItemInfo) {
	 	this.PaymentItemInfo = PaymentItemInfo;
	 }
	 
	/**
	 * Getter for OfferCouponInfo
	 */
	 public OfferCouponInfoType getOfferCouponInfo() {
	 	return OfferCouponInfo;
	 }
	 
	/**
	 * Setter for OfferCouponInfo
	 */
	 public void setOfferCouponInfo(OfferCouponInfoType OfferCouponInfo) {
	 	this.OfferCouponInfo = OfferCouponInfo;
	 }
	 
	/**
	 * Getter for UserSelectedOptions
	 */
	 public UserSelectedOptionType getUserSelectedOptions() {
	 	return UserSelectedOptions;
	 }
	 
	/**
	 * Setter for UserSelectedOptions
	 */
	 public void setUserSelectedOptions(UserSelectedOptionType UserSelectedOptions) {
	 	this.UserSelectedOptions = UserSelectedOptions;
	 }
	 
	/**
	 * Getter for GiftMessage
	 */
	 public String getGiftMessage() {
	 	return GiftMessage;
	 }
	 
	/**
	 * Setter for GiftMessage
	 */
	 public void setGiftMessage(String GiftMessage) {
	 	this.GiftMessage = GiftMessage;
	 }
	 
	/**
	 * Getter for GiftReceipt
	 */
	 public String getGiftReceipt() {
	 	return GiftReceipt;
	 }
	 
	/**
	 * Setter for GiftReceipt
	 */
	 public void setGiftReceipt(String GiftReceipt) {
	 	this.GiftReceipt = GiftReceipt;
	 }
	 
	/**
	 * Getter for GiftWrapName
	 */
	 public String getGiftWrapName() {
	 	return GiftWrapName;
	 }
	 
	/**
	 * Setter for GiftWrapName
	 */
	 public void setGiftWrapName(String GiftWrapName) {
	 	this.GiftWrapName = GiftWrapName;
	 }
	 
	/**
	 * Getter for GiftWrapAmount
	 */
	 public BasicAmountType getGiftWrapAmount() {
	 	return GiftWrapAmount;
	 }
	 
	/**
	 * Setter for GiftWrapAmount
	 */
	 public void setGiftWrapAmount(BasicAmountType GiftWrapAmount) {
	 	this.GiftWrapAmount = GiftWrapAmount;
	 }
	 
	/**
	 * Getter for BuyerEmailOptIn
	 */
	 public String getBuyerEmailOptIn() {
	 	return BuyerEmailOptIn;
	 }
	 
	/**
	 * Setter for BuyerEmailOptIn
	 */
	 public void setBuyerEmailOptIn(String BuyerEmailOptIn) {
	 	this.BuyerEmailOptIn = BuyerEmailOptIn;
	 }
	 
	/**
	 * Getter for SurveyQuestion
	 */
	 public String getSurveyQuestion() {
	 	return SurveyQuestion;
	 }
	 
	/**
	 * Setter for SurveyQuestion
	 */
	 public void setSurveyQuestion(String SurveyQuestion) {
	 	this.SurveyQuestion = SurveyQuestion;
	 }
	 
	/**
	 * Getter for SurveyChoiceSelected
	 */
	 public List<String> getSurveyChoiceSelected() {
	 	return SurveyChoiceSelected;
	 }
	 
	/**
	 * Setter for SurveyChoiceSelected
	 */
	 public void setSurveyChoiceSelected(List<String> SurveyChoiceSelected) {
	 	this.SurveyChoiceSelected = SurveyChoiceSelected;
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
	
	public PaymentTransactionType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if(document.getElementsByTagName("ReceiverInfo").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ReceiverInfo").item(0))) {
				nodeList = document.getElementsByTagName("ReceiverInfo");
				xmlString = convertToXML(nodeList.item(0));
				this.ReceiverInfo =  new ReceiverInfoType(xmlString);
			}
		}
		if(document.getElementsByTagName("PayerInfo").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PayerInfo").item(0))) {
				nodeList = document.getElementsByTagName("PayerInfo");
				xmlString = convertToXML(nodeList.item(0));
				this.PayerInfo =  new PayerInfoType(xmlString);
			}
		}
		if(document.getElementsByTagName("PaymentInfo").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentInfo").item(0))) {
				nodeList = document.getElementsByTagName("PaymentInfo");
				xmlString = convertToXML(nodeList.item(0));
				this.PaymentInfo =  new PaymentInfoType(xmlString);
			}
		}
		if(document.getElementsByTagName("PaymentItemInfo").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentItemInfo").item(0))) {
				nodeList = document.getElementsByTagName("PaymentItemInfo");
				xmlString = convertToXML(nodeList.item(0));
				this.PaymentItemInfo =  new PaymentItemInfoType(xmlString);
			}
		}
		if(document.getElementsByTagName("OfferCouponInfo").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OfferCouponInfo").item(0))) {
				nodeList = document.getElementsByTagName("OfferCouponInfo");
				xmlString = convertToXML(nodeList.item(0));
				this.OfferCouponInfo =  new OfferCouponInfoType(xmlString);
			}
		}
		if(document.getElementsByTagName("UserSelectedOptions").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("UserSelectedOptions").item(0))) {
				nodeList = document.getElementsByTagName("UserSelectedOptions");
				xmlString = convertToXML(nodeList.item(0));
				this.UserSelectedOptions =  new UserSelectedOptionType(xmlString);
			}
		}
		if (document.getElementsByTagName("GiftMessage").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("GiftMessage").item(0))) {
				this.GiftMessage = (String)document.getElementsByTagName("GiftMessage").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("GiftReceipt").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("GiftReceipt").item(0))) {
				this.GiftReceipt = (String)document.getElementsByTagName("GiftReceipt").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("GiftWrapName").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("GiftWrapName").item(0))) {
				this.GiftWrapName = (String)document.getElementsByTagName("GiftWrapName").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("GiftWrapAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("GiftWrapAmount").item(0))) {
				nodeList = document.getElementsByTagName("GiftWrapAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.GiftWrapAmount =  new BasicAmountType(xmlString);
			}
		}
		if (document.getElementsByTagName("BuyerEmailOptIn").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("BuyerEmailOptIn").item(0))) {
				this.BuyerEmailOptIn = (String)document.getElementsByTagName("BuyerEmailOptIn").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("SurveyQuestion").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SurveyQuestion").item(0))) {
				this.SurveyQuestion = (String)document.getElementsByTagName("SurveyQuestion").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("SurveyChoiceSelected").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SurveyChoiceSelected").item(0))) {
				nodeList = document.getElementsByTagName("SurveyChoiceSelected");
				for(int i=0; i < nodeList.getLength(); i++) {
					String value = nodeList.item(i).getTextContent();
					this.SurveyChoiceSelected.add(value);
					
				}
			}
		}
	}

}