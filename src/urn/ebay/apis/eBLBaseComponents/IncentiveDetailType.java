
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
import urn.ebay.apis.eBLBaseComponents.IncentiveAppliedToType;
import urn.ebay.apis.eBLBaseComponents.IncentiveTypeCodeType;


/**
 */
public class IncentiveDetailType {

	/**
	 */
	private String RedemptionCode;
	public String getRedemptionCode() {
		return RedemptionCode;
	}
	public void setRedemptionCode(String value) {
		this.RedemptionCode = value;
	}

	/**
	 */
	private String DisplayCode;
	public String getDisplayCode() {
		return DisplayCode;
	}
	public void setDisplayCode(String value) {
		this.DisplayCode = value;
	}

	/**
	 */
	private String ProgramId;
	public String getProgramId() {
		return ProgramId;
	}
	public void setProgramId(String value) {
		this.ProgramId = value;
	}

	/**
	 */
	private IncentiveTypeCodeType IncentiveType;
	public IncentiveTypeCodeType getIncentiveType() {
		return IncentiveType;
	}
	public void setIncentiveType(IncentiveTypeCodeType value) {
		this.IncentiveType = value;
	}

	/**
	 */
	private String IncentiveDescription;
	public String getIncentiveDescription() {
		return IncentiveDescription;
	}
	public void setIncentiveDescription(String value) {
		this.IncentiveDescription = value;
	}

	/**
	 */
	private List<IncentiveAppliedToType> AppliedTo = new ArrayList<IncentiveAppliedToType>();
	public List<IncentiveAppliedToType> getAppliedTo() {
		return AppliedTo;
	}
	public void setAppliedTo(List<IncentiveAppliedToType> value) {
		this.AppliedTo = value;
	}

	/**
	 */
	private String Status;
	public String getStatus() {
		return Status;
	}
	public void setStatus(String value) {
		this.Status = value;
	}

	/**
	 */
	private String ErrorCode;
	public String getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(String value) {
		this.ErrorCode = value;
	}


	public IncentiveDetailType() {
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
	 public IncentiveDetailType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("RedemptionCode").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("RedemptionCode").item(0))){ 
		 this.RedemptionCode =(String)document.getElementsByTagName("RedemptionCode").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("DisplayCode").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("DisplayCode").item(0))){ 
		 this.DisplayCode =(String)document.getElementsByTagName("DisplayCode").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ProgramId").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ProgramId").item(0))){ 
		 this.ProgramId =(String)document.getElementsByTagName("ProgramId").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("IncentiveType").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("IncentiveType").item(0))){ 
		 this.IncentiveType = IncentiveTypeCodeType.fromValue(document.getElementsByTagName("IncentiveType").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("IncentiveDescription").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("IncentiveDescription").item(0))){ 
		 this.IncentiveDescription =(String)document.getElementsByTagName("IncentiveDescription").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("AppliedTo").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AppliedTo").item(0))){ 
		 nodeList = document.getElementsByTagName("AppliedTo");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 xmlString = convertToXML(nodeList.item(i)); 
				this.AppliedTo.add(new IncentiveAppliedToType(xmlString));
			}

}
	}
		 if(document.getElementsByTagName("Status").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Status").item(0))){ 
		 this.Status =(String)document.getElementsByTagName("Status").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ErrorCode").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ErrorCode").item(0))){ 
		 this.ErrorCode =(String)document.getElementsByTagName("ErrorCode").item(0).getTextContent();

}
	}
	}
}
