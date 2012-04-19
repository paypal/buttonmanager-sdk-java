
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


/**
 * The Common 3DS fields. Common for both GTD and DCC API's.
 */
public class ThreeDSecureRequestType {

	/**
	 */
	private String Eci3ds;
	public String getEci3ds() {
		return Eci3ds;
	}
	public void setEci3ds(String value) {
		this.Eci3ds = value;
	}

	/**
	 */
	private String Cavv;
	public String getCavv() {
		return Cavv;
	}
	public void setCavv(String value) {
		this.Cavv = value;
	}

	/**
	 */
	private String Xid;
	public String getXid() {
		return Xid;
	}
	public void setXid(String value) {
		this.Xid = value;
	}

	/**
	 */
	private String MpiVendor3ds;
	public String getMpiVendor3ds() {
		return MpiVendor3ds;
	}
	public void setMpiVendor3ds(String value) {
		this.MpiVendor3ds = value;
	}

	/**
	 */
	private String AuthStatus3ds;
	public String getAuthStatus3ds() {
		return AuthStatus3ds;
	}
	public void setAuthStatus3ds(String value) {
		this.AuthStatus3ds = value;
	}


	public ThreeDSecureRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( Eci3ds != null ) {
			sb.append("<ebl:Eci3ds>").append(Eci3ds);
			sb.append("</ebl:Eci3ds>");
		}
		if( Cavv != null ) {
			sb.append("<ebl:Cavv>").append(Cavv);
			sb.append("</ebl:Cavv>");
		}
		if( Xid != null ) {
			sb.append("<ebl:Xid>").append(Xid);
			sb.append("</ebl:Xid>");
		}
		if( MpiVendor3ds != null ) {
			sb.append("<ebl:MpiVendor3ds>").append(MpiVendor3ds);
			sb.append("</ebl:MpiVendor3ds>");
		}
		if( AuthStatus3ds != null ) {
			sb.append("<ebl:AuthStatus3ds>").append(AuthStatus3ds);
			sb.append("</ebl:AuthStatus3ds>");
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
	 public ThreeDSecureRequestType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("Eci3ds").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Eci3ds").item(0))){ 
		 this.Eci3ds =(String)document.getElementsByTagName("Eci3ds").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Cavv").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Cavv").item(0))){ 
		 this.Cavv =(String)document.getElementsByTagName("Cavv").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Xid").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Xid").item(0))){ 
		 this.Xid =(String)document.getElementsByTagName("Xid").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("MpiVendor3ds").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("MpiVendor3ds").item(0))){ 
		 this.MpiVendor3ds =(String)document.getElementsByTagName("MpiVendor3ds").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("AuthStatus3ds").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AuthStatus3ds").item(0))){ 
		 this.AuthStatus3ds =(String)document.getElementsByTagName("AuthStatus3ds").item(0).getTextContent();

}
	}
	}
}
