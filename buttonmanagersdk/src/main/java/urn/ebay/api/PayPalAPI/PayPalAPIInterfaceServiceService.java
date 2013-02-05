package urn.ebay.api.PayPalAPI;
import java.io.*;
import java.util.Properties;
import com.paypal.core.BaseService;
import com.paypal.exception.*;
import com.paypal.core.credential.ICredential;
import com.paypal.core.APICallPreHandler;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.xml.sax.InputSource;
import javax.xml.parsers.ParserConfigurationException;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import com.paypal.core.DefaultSOAPAPICallHandler;
import com.paypal.core.soap.MerchantAPICallPreHandler;
import urn.ebay.api.PayPalAPI.BMCreateButtonReq;
import urn.ebay.api.PayPalAPI.BMCreateButtonResponseType;
import urn.ebay.api.PayPalAPI.BMUpdateButtonReq;
import urn.ebay.api.PayPalAPI.BMUpdateButtonResponseType;
import urn.ebay.api.PayPalAPI.BMManageButtonStatusReq;
import urn.ebay.api.PayPalAPI.BMManageButtonStatusResponseType;
import urn.ebay.api.PayPalAPI.BMGetButtonDetailsReq;
import urn.ebay.api.PayPalAPI.BMGetButtonDetailsResponseType;
import urn.ebay.api.PayPalAPI.BMSetInventoryReq;
import urn.ebay.api.PayPalAPI.BMSetInventoryResponseType;
import urn.ebay.api.PayPalAPI.BMGetInventoryReq;
import urn.ebay.api.PayPalAPI.BMGetInventoryResponseType;
import urn.ebay.api.PayPalAPI.BMButtonSearchReq;
import urn.ebay.api.PayPalAPI.BMButtonSearchResponseType;
import com.paypal.sdk.exceptions.OAuthException;

public class PayPalAPIInterfaceServiceService extends BaseService {


	// Service Version
	public static final String SERVICE_VERSION = "98.0";

	// Service Name
	public static final String SERVICE_NAME = "PayPalAPIInterfaceService";

	//SDK Name
	private static final String SDK_NAME="buttonmanager-java-sdk";
	
	//SDK Version
	private static final String SDK_VERSION="2.2.98";

	
	public PayPalAPIInterfaceServiceService(File configFile) throws IOException {
		initConfig(configFile);
	}		

	public PayPalAPIInterfaceServiceService(InputStream config) throws IOException {
		initConfig(config);
	}

	public PayPalAPIInterfaceServiceService(String configFilePath) throws IOException {
		initConfig(configFilePath);
	}
	
	public PayPalAPIInterfaceServiceService(Properties properties) {
		initConfig(properties);
	}



	
	private void setStandardParams(AbstractRequestType request) {
		if (request.getVersion() == null) {
			request.setVersion(SERVICE_VERSION);
		}
	}
	/**	
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMCreateButtonResponseType bMCreateButton(BMCreateButtonReq bMCreateButtonReq, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException, IOException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "PayPalAPI";
		setStandardParams(bMCreateButtonReq.getBMCreateButtonRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMCreateButtonReq.toXMLString(null, "BMCreateButtonReq"), null, null);
		apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, apiUsername, getAccessToken(), getTokenSecret());
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((MerchantAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		Document document = builder.parse(inStream);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		try {
			Node node = (Node) xpath.evaluate("Envelope/Body/BMCreateButtonResponse", document, XPathConstants.NODE);
			return new BMCreateButtonResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	 }
	 
	/** 
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMCreateButtonResponseType bMCreateButton(BMCreateButtonReq bMCreateButtonReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException  {
	 	return bMCreateButton(bMCreateButtonReq, (String) null);
	 }

	/** 
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMCreateButtonResponseType bMCreateButton(BMCreateButtonReq bMCreateButtonReq, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException  {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "PayPalAPI";
		setStandardParams(bMCreateButtonReq.getBMCreateButtonRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMCreateButtonReq.toXMLString(null, "BMCreateButtonReq"), null, null);
		apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, credential);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((MerchantAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
 	
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		Document document = builder.parse(inStream);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		try {
			Node node = (Node) xpath.evaluate(
					"Envelope/Body/BMCreateButtonResponse", document,
					XPathConstants.NODE);
			return new BMCreateButtonResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}	
	}
	/**	
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMUpdateButtonResponseType bMUpdateButton(BMUpdateButtonReq bMUpdateButtonReq, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException, IOException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "PayPalAPI";
		setStandardParams(bMUpdateButtonReq.getBMUpdateButtonRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMUpdateButtonReq.toXMLString(null, "BMUpdateButtonReq"), null, null);
		apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, apiUsername, getAccessToken(), getTokenSecret());
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((MerchantAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		Document document = builder.parse(inStream);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		try {
			Node node = (Node) xpath.evaluate("Envelope/Body/BMUpdateButtonResponse", document, XPathConstants.NODE);
			return new BMUpdateButtonResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	 }
	 
	/** 
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMUpdateButtonResponseType bMUpdateButton(BMUpdateButtonReq bMUpdateButtonReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException  {
	 	return bMUpdateButton(bMUpdateButtonReq, (String) null);
	 }

	/** 
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMUpdateButtonResponseType bMUpdateButton(BMUpdateButtonReq bMUpdateButtonReq, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException  {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "PayPalAPI";
		setStandardParams(bMUpdateButtonReq.getBMUpdateButtonRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMUpdateButtonReq.toXMLString(null, "BMUpdateButtonReq"), null, null);
		apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, credential);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((MerchantAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
 	
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		Document document = builder.parse(inStream);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		try {
			Node node = (Node) xpath.evaluate(
					"Envelope/Body/BMUpdateButtonResponse", document,
					XPathConstants.NODE);
			return new BMUpdateButtonResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}	
	}
	/**	
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMManageButtonStatusResponseType bMManageButtonStatus(BMManageButtonStatusReq bMManageButtonStatusReq, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException, IOException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "PayPalAPI";
		setStandardParams(bMManageButtonStatusReq.getBMManageButtonStatusRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMManageButtonStatusReq.toXMLString(null, "BMManageButtonStatusReq"), null, null);
		apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, apiUsername, getAccessToken(), getTokenSecret());
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((MerchantAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		Document document = builder.parse(inStream);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		try {
			Node node = (Node) xpath.evaluate("Envelope/Body/BMManageButtonStatusResponse", document, XPathConstants.NODE);
			return new BMManageButtonStatusResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	 }
	 
	/** 
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMManageButtonStatusResponseType bMManageButtonStatus(BMManageButtonStatusReq bMManageButtonStatusReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException  {
	 	return bMManageButtonStatus(bMManageButtonStatusReq, (String) null);
	 }

	/** 
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMManageButtonStatusResponseType bMManageButtonStatus(BMManageButtonStatusReq bMManageButtonStatusReq, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException  {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "PayPalAPI";
		setStandardParams(bMManageButtonStatusReq.getBMManageButtonStatusRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMManageButtonStatusReq.toXMLString(null, "BMManageButtonStatusReq"), null, null);
		apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, credential);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((MerchantAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
 	
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		Document document = builder.parse(inStream);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		try {
			Node node = (Node) xpath.evaluate(
					"Envelope/Body/BMManageButtonStatusResponse", document,
					XPathConstants.NODE);
			return new BMManageButtonStatusResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}	
	}
	/**	
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMGetButtonDetailsResponseType bMGetButtonDetails(BMGetButtonDetailsReq bMGetButtonDetailsReq, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException, IOException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "PayPalAPI";
		setStandardParams(bMGetButtonDetailsReq.getBMGetButtonDetailsRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMGetButtonDetailsReq.toXMLString(null, "BMGetButtonDetailsReq"), null, null);
		apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, apiUsername, getAccessToken(), getTokenSecret());
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((MerchantAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		Document document = builder.parse(inStream);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		try {
			Node node = (Node) xpath.evaluate("Envelope/Body/BMGetButtonDetailsResponse", document, XPathConstants.NODE);
			return new BMGetButtonDetailsResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	 }
	 
	/** 
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMGetButtonDetailsResponseType bMGetButtonDetails(BMGetButtonDetailsReq bMGetButtonDetailsReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException  {
	 	return bMGetButtonDetails(bMGetButtonDetailsReq, (String) null);
	 }

	/** 
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMGetButtonDetailsResponseType bMGetButtonDetails(BMGetButtonDetailsReq bMGetButtonDetailsReq, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException  {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "PayPalAPI";
		setStandardParams(bMGetButtonDetailsReq.getBMGetButtonDetailsRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMGetButtonDetailsReq.toXMLString(null, "BMGetButtonDetailsReq"), null, null);
		apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, credential);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((MerchantAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
 	
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		Document document = builder.parse(inStream);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		try {
			Node node = (Node) xpath.evaluate(
					"Envelope/Body/BMGetButtonDetailsResponse", document,
					XPathConstants.NODE);
			return new BMGetButtonDetailsResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}	
	}
	/**	
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMSetInventoryResponseType bMSetInventory(BMSetInventoryReq bMSetInventoryReq, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException, IOException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "PayPalAPI";
		setStandardParams(bMSetInventoryReq.getBMSetInventoryRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMSetInventoryReq.toXMLString(null, "BMSetInventoryReq"), null, null);
		apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, apiUsername, getAccessToken(), getTokenSecret());
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((MerchantAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		Document document = builder.parse(inStream);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		try {
			Node node = (Node) xpath.evaluate("Envelope/Body/BMSetInventoryResponse", document, XPathConstants.NODE);
			return new BMSetInventoryResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	 }
	 
	/** 
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMSetInventoryResponseType bMSetInventory(BMSetInventoryReq bMSetInventoryReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException  {
	 	return bMSetInventory(bMSetInventoryReq, (String) null);
	 }

	/** 
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMSetInventoryResponseType bMSetInventory(BMSetInventoryReq bMSetInventoryReq, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException  {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "PayPalAPI";
		setStandardParams(bMSetInventoryReq.getBMSetInventoryRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMSetInventoryReq.toXMLString(null, "BMSetInventoryReq"), null, null);
		apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, credential);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((MerchantAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
 	
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		Document document = builder.parse(inStream);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		try {
			Node node = (Node) xpath.evaluate(
					"Envelope/Body/BMSetInventoryResponse", document,
					XPathConstants.NODE);
			return new BMSetInventoryResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}	
	}
	/**	
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMGetInventoryResponseType bMGetInventory(BMGetInventoryReq bMGetInventoryReq, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException, IOException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "PayPalAPI";
		setStandardParams(bMGetInventoryReq.getBMGetInventoryRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMGetInventoryReq.toXMLString(null, "BMGetInventoryReq"), null, null);
		apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, apiUsername, getAccessToken(), getTokenSecret());
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((MerchantAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		Document document = builder.parse(inStream);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		try {
			Node node = (Node) xpath.evaluate("Envelope/Body/BMGetInventoryResponse", document, XPathConstants.NODE);
			return new BMGetInventoryResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	 }
	 
	/** 
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMGetInventoryResponseType bMGetInventory(BMGetInventoryReq bMGetInventoryReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException  {
	 	return bMGetInventory(bMGetInventoryReq, (String) null);
	 }

	/** 
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMGetInventoryResponseType bMGetInventory(BMGetInventoryReq bMGetInventoryReq, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException  {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "PayPalAPI";
		setStandardParams(bMGetInventoryReq.getBMGetInventoryRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMGetInventoryReq.toXMLString(null, "BMGetInventoryReq"), null, null);
		apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, credential);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((MerchantAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
 	
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		Document document = builder.parse(inStream);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		try {
			Node node = (Node) xpath.evaluate(
					"Envelope/Body/BMGetInventoryResponse", document,
					XPathConstants.NODE);
			return new BMGetInventoryResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}	
	}
	/**	
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMButtonSearchResponseType bMButtonSearch(BMButtonSearchReq bMButtonSearchReq, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException, IOException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "PayPalAPI";
		setStandardParams(bMButtonSearchReq.getBMButtonSearchRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMButtonSearchReq.toXMLString(null, "BMButtonSearchReq"), null, null);
		apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, apiUsername, getAccessToken(), getTokenSecret());
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((MerchantAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		Document document = builder.parse(inStream);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		try {
			Node node = (Node) xpath.evaluate("Envelope/Body/BMButtonSearchResponse", document, XPathConstants.NODE);
			return new BMButtonSearchResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	 }
	 
	/** 
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMButtonSearchResponseType bMButtonSearch(BMButtonSearchReq bMButtonSearchReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException  {
	 	return bMButtonSearch(bMButtonSearchReq, (String) null);
	 }

	/** 
	 * AUTO_GENERATED
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public BMButtonSearchResponseType bMButtonSearch(BMButtonSearchReq bMButtonSearchReq, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException  {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "PayPalAPI";
		setStandardParams(bMButtonSearchReq.getBMButtonSearchRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMButtonSearchReq.toXMLString(null, "BMButtonSearchReq"), null, null);
		apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, credential);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((MerchantAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((MerchantAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
 	
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		Document document = builder.parse(inStream);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		try {
			Node node = (Node) xpath.evaluate(
					"Envelope/Body/BMButtonSearchResponse", document,
					XPathConstants.NODE);
			return new BMButtonSearchResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}	
	}

}