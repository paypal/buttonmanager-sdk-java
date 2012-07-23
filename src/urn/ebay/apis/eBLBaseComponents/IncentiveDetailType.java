package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.IncentiveTypeCodeType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.IncentiveAppliedToType;
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
 * No Document Comments
 */
public class IncentiveDetailType{


	/**
	 * No Document Comments	 
	 */ 
	private String RedemptionCode;

	/**
	 * No Document Comments	 
	 */ 
	private String DisplayCode;

	/**
	 * No Document Comments	 
	 */ 
	private String ProgramId;

	/**
	 * No Document Comments	 
	 */ 
	private IncentiveTypeCodeType IncentiveType;

	/**
	 * No Document Comments	 
	 */ 
	private String IncentiveDescription;

	/**
	 * No Document Comments	 
	 */ 
	private List<IncentiveAppliedToType> AppliedTo = new ArrayList<IncentiveAppliedToType>();

	/**
	 * No Document Comments	 
	 */ 
	private String Status;

	/**
	 * No Document Comments	 
	 */ 
	private String ErrorCode;

	

	/**
	 * Default Constructor
	 */
	public IncentiveDetailType (){
	}	

	/**
	 * Getter for RedemptionCode
	 */
	 public String getRedemptionCode() {
	 	return RedemptionCode;
	 }
	 
	/**
	 * Setter for RedemptionCode
	 */
	 public void setRedemptionCode(String RedemptionCode) {
	 	this.RedemptionCode = RedemptionCode;
	 }
	 
	/**
	 * Getter for DisplayCode
	 */
	 public String getDisplayCode() {
	 	return DisplayCode;
	 }
	 
	/**
	 * Setter for DisplayCode
	 */
	 public void setDisplayCode(String DisplayCode) {
	 	this.DisplayCode = DisplayCode;
	 }
	 
	/**
	 * Getter for ProgramId
	 */
	 public String getProgramId() {
	 	return ProgramId;
	 }
	 
	/**
	 * Setter for ProgramId
	 */
	 public void setProgramId(String ProgramId) {
	 	this.ProgramId = ProgramId;
	 }
	 
	/**
	 * Getter for IncentiveType
	 */
	 public IncentiveTypeCodeType getIncentiveType() {
	 	return IncentiveType;
	 }
	 
	/**
	 * Setter for IncentiveType
	 */
	 public void setIncentiveType(IncentiveTypeCodeType IncentiveType) {
	 	this.IncentiveType = IncentiveType;
	 }
	 
	/**
	 * Getter for IncentiveDescription
	 */
	 public String getIncentiveDescription() {
	 	return IncentiveDescription;
	 }
	 
	/**
	 * Setter for IncentiveDescription
	 */
	 public void setIncentiveDescription(String IncentiveDescription) {
	 	this.IncentiveDescription = IncentiveDescription;
	 }
	 
	/**
	 * Getter for AppliedTo
	 */
	 public List<IncentiveAppliedToType> getAppliedTo() {
	 	return AppliedTo;
	 }
	 
	/**
	 * Setter for AppliedTo
	 */
	 public void setAppliedTo(List<IncentiveAppliedToType> AppliedTo) {
	 	this.AppliedTo = AppliedTo;
	 }
	 
	/**
	 * Getter for Status
	 */
	 public String getStatus() {
	 	return Status;
	 }
	 
	/**
	 * Setter for Status
	 */
	 public void setStatus(String Status) {
	 	this.Status = Status;
	 }
	 
	/**
	 * Getter for ErrorCode
	 */
	 public String getErrorCode() {
	 	return ErrorCode;
	 }
	 
	/**
	 * Setter for ErrorCode
	 */
	 public void setErrorCode(String ErrorCode) {
	 	this.ErrorCode = ErrorCode;
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
	
	public IncentiveDetailType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("RedemptionCode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("RedemptionCode").item(0))) {
				this.RedemptionCode = (String)document.getElementsByTagName("RedemptionCode").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("DisplayCode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("DisplayCode").item(0))) {
				this.DisplayCode = (String)document.getElementsByTagName("DisplayCode").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ProgramId").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ProgramId").item(0))) {
				this.ProgramId = (String)document.getElementsByTagName("ProgramId").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("IncentiveType").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("IncentiveType").item(0))) {
				this.IncentiveType = IncentiveTypeCodeType.fromValue(document.getElementsByTagName("IncentiveType").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("IncentiveDescription").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("IncentiveDescription").item(0))) {
				this.IncentiveDescription = (String)document.getElementsByTagName("IncentiveDescription").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("AppliedTo").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("AppliedTo").item(0))) {
				nodeList = document.getElementsByTagName("AppliedTo");
				for(int i=0; i < nodeList.getLength(); i++) {
					xmlString = convertToXML(nodeList.item(i));
					this.AppliedTo.add(new IncentiveAppliedToType(xmlString));
				}
			}
		}
		if (document.getElementsByTagName("Status").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Status").item(0))) {
				this.Status = (String)document.getElementsByTagName("Status").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ErrorCode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ErrorCode").item(0))) {
				this.ErrorCode = (String)document.getElementsByTagName("ErrorCode").item(0).getTextContent();
			}
		}
	
	}

}