package urn.ebay.api.PayPalAPI;
import java.io.*;
import java.util.Map;
import java.util.Properties;
import com.paypal.core.BaseService;
import com.paypal.exception.*;
import com.paypal.core.credential.ICredential;
import com.paypal.core.APICallPreHandler;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.xml.sax.InputSource;
import javax.xml.parsers.ParserConfigurationException;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import javax.xml.parsers.DocumentBuilderFactory;
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
	private static final String SDK_NAME = "buttonmanager-java-sdk";
	
	//SDK Version
	private static final String SDK_VERSION = "2.3.101";


	/**
	 * Default <code>PayPalAPIInterfaceServiceService</code> Constructor.
	 * Initializes the SDK system with the default configuration file named
	 * 'sdk_config.properties' found in the class-path
	 * 
	 */
	public PayPalAPIInterfaceServiceService() {
		super();
	}
	
	/**
	 * <code>PayPalAPIInterfaceServiceService</code> that uses the supplied path
	 * to initialize the SDK system. The initialization context is maintained
	 * only for this instance of the class. To initialize the SDK system
	 * globally use the default constructor.
	 * 
	 * @see PayPalAPIInterfaceServiceService
	 * @param configFilePath
	 *            Absolute path to a {@link Properties} file
	 * @throws IOException
	 */
	public PayPalAPIInterfaceServiceService(String configFilePath) throws IOException {
		this(new File(configFilePath));
	}
	
	/**
	 * <code>PayPalAPIInterfaceServiceService</code> that uses the supplied
	 * {@link File} object to initialize the SDK system. The initialization
	 * context is maintained only for this instance of the class. To initialize
	 * the SDK system globally use the default constructor
	 * 
	 * @see PayPalAPIInterfaceServiceService
	 * @param configFile
	 *            Configuration file in {@link Properties} format
	 * @throws IOException
	 */
	public PayPalAPIInterfaceServiceService(File configFile) throws IOException {
		this(new FileInputStream(configFile));
	}		

	/**
	 * <code>PayPalAPIInterfaceServiceService</code> that uses the supplied
	 * {@link InputStream} object to initialize the SDK system. The
	 * initialization context is maintained only for this instance of the class.
	 * To initialize the SDK system globally use the default constructor.
	 * 
	 * @see PayPalAPIInterfaceServiceService
	 * @param inputStream
	 *            InputStream of a {@link Properties} file
	 * @throws IOException
	 */
	public PayPalAPIInterfaceServiceService(InputStream inputStream) throws IOException {
		super(inputStream);
	}

	/**
	 * <code>PayPalAPIInterfaceServiceService</code> that uses the supplied
	 * {@link Properties} to initialize the SDK system. For values that the
	 * properties should hold consult the sample 'sdk_config.properties' file
	 * bundled with the SDK. The initialization context is maintained only for
	 * this instance of the class. To initialize the SDK system globally use the
	 * default constructor.
	 * 
	 * @see PayPalAPIInterfaceServiceService
	 * @param properties
	 *            {@link Properties} object
	 */	
	public PayPalAPIInterfaceServiceService(Properties properties) {
		super(properties);
	}
	
	/**
	 * <code>PayPalAPIInterfaceServiceService</code> that uses the supplied
	 * {@link Map} to initialize the SDK system. For values that the map should
	 * hold consult the sample 'sdk_config.properties' file bundled with the
	 * SDK. The initialization context is maintained only for this instance of
	 * the class. To initialize the SDK system globally use the default
	 * constructor.
	 * 
	 * @see PayPalAPIInterfaceServiceService
	 * @param configurationMap
	 *            {@link Map} object
	 */
	public PayPalAPIInterfaceServiceService(Map<String, String> configurationMap) {
		super(configurationMap);
	}



	/*
	 * Sets the version required for Merchant API calls
	 */
	private void setStandardParams(AbstractRequestType request) {
		if (request.getVersion() == null) {
			request.setVersion(SERVICE_VERSION);
		}
	}

	/** 
	*  
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
	*  
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
		setStandardParams(bMCreateButtonReq.getBMCreateButtonRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMCreateButtonReq.toXMLString(null, "BMCreateButtonReq"), null, null, this.configurationMap);
		APICallPreHandler apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, credential, SDK_NAME, SDK_VERSION, "PayPalAPI", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		try {
			Node node = (Node) XPathFactory.newInstance().newXPath().evaluate("Envelope/Body/BMCreateButtonResponse", DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inStream), XPathConstants.NODE);
			return new BMCreateButtonResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	}
	
	/**	
	*  
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
		setStandardParams(bMCreateButtonReq.getBMCreateButtonRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMCreateButtonReq.toXMLString(null, "BMCreateButtonReq"), null, null, this.configurationMap);
		APICallPreHandler apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "PayPalAPI", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		try {
			Node node = (Node) XPathFactory.newInstance().newXPath().evaluate("Envelope/Body/BMCreateButtonResponse", DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inStream), XPathConstants.NODE);
			return new BMCreateButtonResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	 }

	/** 
	*  
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
	*  
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
		setStandardParams(bMUpdateButtonReq.getBMUpdateButtonRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMUpdateButtonReq.toXMLString(null, "BMUpdateButtonReq"), null, null, this.configurationMap);
		APICallPreHandler apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, credential, SDK_NAME, SDK_VERSION, "PayPalAPI", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		try {
			Node node = (Node) XPathFactory.newInstance().newXPath().evaluate("Envelope/Body/BMUpdateButtonResponse", DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inStream), XPathConstants.NODE);
			return new BMUpdateButtonResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	}
	
	/**	
	*  
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
		setStandardParams(bMUpdateButtonReq.getBMUpdateButtonRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMUpdateButtonReq.toXMLString(null, "BMUpdateButtonReq"), null, null, this.configurationMap);
		APICallPreHandler apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "PayPalAPI", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		try {
			Node node = (Node) XPathFactory.newInstance().newXPath().evaluate("Envelope/Body/BMUpdateButtonResponse", DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inStream), XPathConstants.NODE);
			return new BMUpdateButtonResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	 }

	/** 
	*  
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
	*  
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
		setStandardParams(bMManageButtonStatusReq.getBMManageButtonStatusRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMManageButtonStatusReq.toXMLString(null, "BMManageButtonStatusReq"), null, null, this.configurationMap);
		APICallPreHandler apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, credential, SDK_NAME, SDK_VERSION, "PayPalAPI", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		try {
			Node node = (Node) XPathFactory.newInstance().newXPath().evaluate("Envelope/Body/BMManageButtonStatusResponse", DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inStream), XPathConstants.NODE);
			return new BMManageButtonStatusResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	}
	
	/**	
	*  
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
		setStandardParams(bMManageButtonStatusReq.getBMManageButtonStatusRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMManageButtonStatusReq.toXMLString(null, "BMManageButtonStatusReq"), null, null, this.configurationMap);
		APICallPreHandler apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "PayPalAPI", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		try {
			Node node = (Node) XPathFactory.newInstance().newXPath().evaluate("Envelope/Body/BMManageButtonStatusResponse", DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inStream), XPathConstants.NODE);
			return new BMManageButtonStatusResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	 }

	/** 
	*  
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
	*  
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
		setStandardParams(bMGetButtonDetailsReq.getBMGetButtonDetailsRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMGetButtonDetailsReq.toXMLString(null, "BMGetButtonDetailsReq"), null, null, this.configurationMap);
		APICallPreHandler apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, credential, SDK_NAME, SDK_VERSION, "PayPalAPI", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		try {
			Node node = (Node) XPathFactory.newInstance().newXPath().evaluate("Envelope/Body/BMGetButtonDetailsResponse", DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inStream), XPathConstants.NODE);
			return new BMGetButtonDetailsResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	}
	
	/**	
	*  
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
		setStandardParams(bMGetButtonDetailsReq.getBMGetButtonDetailsRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMGetButtonDetailsReq.toXMLString(null, "BMGetButtonDetailsReq"), null, null, this.configurationMap);
		APICallPreHandler apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "PayPalAPI", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		try {
			Node node = (Node) XPathFactory.newInstance().newXPath().evaluate("Envelope/Body/BMGetButtonDetailsResponse", DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inStream), XPathConstants.NODE);
			return new BMGetButtonDetailsResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	 }

	/** 
	*  
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
	*  
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
		setStandardParams(bMSetInventoryReq.getBMSetInventoryRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMSetInventoryReq.toXMLString(null, "BMSetInventoryReq"), null, null, this.configurationMap);
		APICallPreHandler apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, credential, SDK_NAME, SDK_VERSION, "PayPalAPI", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		try {
			Node node = (Node) XPathFactory.newInstance().newXPath().evaluate("Envelope/Body/BMSetInventoryResponse", DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inStream), XPathConstants.NODE);
			return new BMSetInventoryResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	}
	
	/**	
	*  
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
		setStandardParams(bMSetInventoryReq.getBMSetInventoryRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMSetInventoryReq.toXMLString(null, "BMSetInventoryReq"), null, null, this.configurationMap);
		APICallPreHandler apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "PayPalAPI", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		try {
			Node node = (Node) XPathFactory.newInstance().newXPath().evaluate("Envelope/Body/BMSetInventoryResponse", DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inStream), XPathConstants.NODE);
			return new BMSetInventoryResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	 }

	/** 
	*  
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
	*  
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
		setStandardParams(bMGetInventoryReq.getBMGetInventoryRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMGetInventoryReq.toXMLString(null, "BMGetInventoryReq"), null, null, this.configurationMap);
		APICallPreHandler apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, credential, SDK_NAME, SDK_VERSION, "PayPalAPI", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		try {
			Node node = (Node) XPathFactory.newInstance().newXPath().evaluate("Envelope/Body/BMGetInventoryResponse", DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inStream), XPathConstants.NODE);
			return new BMGetInventoryResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	}
	
	/**	
	*  
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
		setStandardParams(bMGetInventoryReq.getBMGetInventoryRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMGetInventoryReq.toXMLString(null, "BMGetInventoryReq"), null, null, this.configurationMap);
		APICallPreHandler apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "PayPalAPI", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		try {
			Node node = (Node) XPathFactory.newInstance().newXPath().evaluate("Envelope/Body/BMGetInventoryResponse", DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inStream), XPathConstants.NODE);
			return new BMGetInventoryResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	 }

	/** 
	*  
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
	*  
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
		setStandardParams(bMButtonSearchReq.getBMButtonSearchRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMButtonSearchReq.toXMLString(null, "BMButtonSearchReq"), null, null, this.configurationMap);
		APICallPreHandler apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, credential, SDK_NAME, SDK_VERSION, "PayPalAPI", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		try {
			Node node = (Node) XPathFactory.newInstance().newXPath().evaluate("Envelope/Body/BMButtonSearchResponse", DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inStream), XPathConstants.NODE);
			return new BMButtonSearchResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	}
	
	/**	
	*  
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
		setStandardParams(bMButtonSearchReq.getBMButtonSearchRequest());
		DefaultSOAPAPICallHandler defaultHandler = new DefaultSOAPAPICallHandler(bMButtonSearchReq.toXMLString(null, "BMButtonSearchReq"), null, null, this.configurationMap);
		APICallPreHandler apiCallPreHandler = new MerchantAPICallPreHandler(defaultHandler, apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "PayPalAPI", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String) response));
		try {
			Node node = (Node) XPathFactory.newInstance().newXPath().evaluate("Envelope/Body/BMButtonSearchResponse", DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inStream), XPathConstants.NODE);
			return new BMButtonSearchResponseType(node);
		} catch (XPathExpressionException exe) {
			throw new RuntimeException("Unable to parse response", exe);
		}
	 }

}