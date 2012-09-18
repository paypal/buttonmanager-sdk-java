package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.RiskFilterListType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
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
 * Thes are filters that could result in accept/deny/pending
 * action. 
 */
public class FMFDetailsType{


	/**
	 * 	 
	 */ 
	private RiskFilterListType AcceptFilters;

	/**
	 * 	 
	 */ 
	private RiskFilterListType PendingFilters;

	/**
	 * 	 
	 */ 
	private RiskFilterListType DenyFilters;

	/**
	 * 	 
	 */ 
	private RiskFilterListType ReportFilters;

	

	/**
	 * Default Constructor
	 */
	public FMFDetailsType (){
	}	

	/**
	 * Getter for AcceptFilters
	 */
	 public RiskFilterListType getAcceptFilters() {
	 	return AcceptFilters;
	 }
	 
	/**
	 * Setter for AcceptFilters
	 */
	 public void setAcceptFilters(RiskFilterListType AcceptFilters) {
	 	this.AcceptFilters = AcceptFilters;
	 }
	 
	/**
	 * Getter for PendingFilters
	 */
	 public RiskFilterListType getPendingFilters() {
	 	return PendingFilters;
	 }
	 
	/**
	 * Setter for PendingFilters
	 */
	 public void setPendingFilters(RiskFilterListType PendingFilters) {
	 	this.PendingFilters = PendingFilters;
	 }
	 
	/**
	 * Getter for DenyFilters
	 */
	 public RiskFilterListType getDenyFilters() {
	 	return DenyFilters;
	 }
	 
	/**
	 * Setter for DenyFilters
	 */
	 public void setDenyFilters(RiskFilterListType DenyFilters) {
	 	this.DenyFilters = DenyFilters;
	 }
	 
	/**
	 * Getter for ReportFilters
	 */
	 public RiskFilterListType getReportFilters() {
	 	return ReportFilters;
	 }
	 
	/**
	 * Setter for ReportFilters
	 */
	 public void setReportFilters(RiskFilterListType ReportFilters) {
	 	this.ReportFilters = ReportFilters;
	 }
	 


	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else if (n.getNodeType() == Node.ELEMENT_NODE ) {
			return (n.getChildNodes().getLength() == 0);
		} else {
			return false;
		}
	}
	
	public FMFDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("AcceptFilters", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AcceptFilters =  new RiskFilterListType(childNode);
		}
		childNode = (Node) xpath.evaluate("PendingFilters", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PendingFilters =  new RiskFilterListType(childNode);
		}
		childNode = (Node) xpath.evaluate("DenyFilters", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.DenyFilters =  new RiskFilterListType(childNode);
		}
		childNode = (Node) xpath.evaluate("ReportFilters", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ReportFilters =  new RiskFilterListType(childNode);
		}
	}
 
}