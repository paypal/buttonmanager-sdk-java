package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.SeverityCodeType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.ErrorParameterType;
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
 * Error code can be used by a receiving application to
 * debugging a response message. These codes will need to be
 * uniquely defined for each application. 
 */
public class ErrorType{


	/**
	 * 	 
	 */ 
	private String ShortMessage;

	/**
	 * 	 
	 */ 
	private String LongMessage;

	/**
	 * Error code can be used by a receiving application to
	 * debugging a response message. These codes will need to be
	 * uniquely defined for each application. 	 
	 */ 
	private String ErrorCode;

	/**
	 * SeverityCode indicates whether the error is an application 
	 * level error or if it is informational error, i.e., warning. 
	 * 	 
	 */ 
	private SeverityCodeType SeverityCode;

	/**
	 * This optional element may carry additional
	 * application-specific error variables that indicate specific
	 * information about the error condition particularly in the
	 * cases where there are multiple instances of the ErrorType
	 * which require additional context.  	 
	 */ 
	private List<ErrorParameterType> ErrorParameters = new ArrayList<ErrorParameterType>();

	

	/**
	 * Default Constructor
	 */
	public ErrorType (){
	}	

	/**
	 * Getter for ShortMessage
	 */
	 public String getShortMessage() {
	 	return ShortMessage;
	 }
	 
	/**
	 * Setter for ShortMessage
	 */
	 public void setShortMessage(String ShortMessage) {
	 	this.ShortMessage = ShortMessage;
	 }
	 
	/**
	 * Getter for LongMessage
	 */
	 public String getLongMessage() {
	 	return LongMessage;
	 }
	 
	/**
	 * Setter for LongMessage
	 */
	 public void setLongMessage(String LongMessage) {
	 	this.LongMessage = LongMessage;
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
	 
	/**
	 * Getter for SeverityCode
	 */
	 public SeverityCodeType getSeverityCode() {
	 	return SeverityCode;
	 }
	 
	/**
	 * Setter for SeverityCode
	 */
	 public void setSeverityCode(SeverityCodeType SeverityCode) {
	 	this.SeverityCode = SeverityCode;
	 }
	 
	/**
	 * Getter for ErrorParameters
	 */
	 public List<ErrorParameterType> getErrorParameters() {
	 	return ErrorParameters;
	 }
	 
	/**
	 * Setter for ErrorParameters
	 */
	 public void setErrorParameters(List<ErrorParameterType> ErrorParameters) {
	 	this.ErrorParameters = ErrorParameters;
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
	
	public ErrorType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("ShortMessage").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ShortMessage").item(0))) {
				this.ShortMessage = (String)document.getElementsByTagName("ShortMessage").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("LongMessage").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("LongMessage").item(0))) {
				this.LongMessage = (String)document.getElementsByTagName("LongMessage").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ErrorCode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ErrorCode").item(0))) {
				this.ErrorCode = (String)document.getElementsByTagName("ErrorCode").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("SeverityCode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SeverityCode").item(0))) {
				this.SeverityCode = SeverityCodeType.fromValue(document.getElementsByTagName("SeverityCode").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("ErrorParameters").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ErrorParameters").item(0))) {
				nodeList = document.getElementsByTagName("ErrorParameters");
				for(int i=0; i < nodeList.getLength(); i++) {
					xmlString = convertToXML(nodeList.item(i));
					this.ErrorParameters.add(new ErrorParameterType(xmlString));
				}
			}
		}
	}

}