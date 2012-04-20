/**
 * PayPalAPIInterfaceServiceService wrapper class
 * Auto generated code
 */
package urn.ebay.api.PayPalAPI;

import com.paypal.core.BaseService;
import com.paypal.exception.ClientActionRequiredException;
import com.paypal.exception.HttpErrorException;
import com.paypal.exception.InvalidCredentialException;
import com.paypal.exception.InvalidResponseDataException;
import com.paypal.exception.MissingCredentialException;
import com.paypal.exception.SSLConfigurationException;
import com.paypal.sdk.exceptions.OAuthException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import urn.ebay.api.PayPalAPI.BMButtonSearchReq;
import urn.ebay.api.PayPalAPI.BMButtonSearchResponseType;
import urn.ebay.api.PayPalAPI.BMCreateButtonReq;
import urn.ebay.api.PayPalAPI.BMCreateButtonResponseType;
import urn.ebay.api.PayPalAPI.BMGetButtonDetailsReq;
import urn.ebay.api.PayPalAPI.BMGetButtonDetailsResponseType;
import urn.ebay.api.PayPalAPI.BMGetInventoryReq;
import urn.ebay.api.PayPalAPI.BMGetInventoryResponseType;
import urn.ebay.api.PayPalAPI.BMManageButtonStatusReq;
import urn.ebay.api.PayPalAPI.BMManageButtonStatusResponseType;
import urn.ebay.api.PayPalAPI.BMSetInventoryReq;
import urn.ebay.api.PayPalAPI.BMSetInventoryResponseType;
import urn.ebay.api.PayPalAPI.BMUpdateButtonReq;
import urn.ebay.api.PayPalAPI.BMUpdateButtonResponseType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


public class PayPalAPIInterfaceServiceService extends BaseService {

	private static final String SERVICE_VERSION = "87.0";
	private static final String SERVICE_NAME = "PayPalAPIInterfaceService";

	public PayPalAPIInterfaceServiceService(File configFile) throws IOException, FileNotFoundException {
		super(SERVICE_NAME, SERVICE_VERSION);
		initConfig(configFile);
	}
	public PayPalAPIInterfaceServiceService(InputStream config) throws IOException, FileNotFoundException {
		super(SERVICE_NAME, SERVICE_VERSION);
		initConfig(config);
	}
	public PayPalAPIInterfaceServiceService(String configFilePath) throws IOException, FileNotFoundException {
		super(SERVICE_NAME, SERVICE_VERSION);
		initConfig(configFilePath);
		
	}

	private void setStandardParams(AbstractRequestType request) {
		if (request.getVersion() == null) {
			request.setVersion(SERVICE_VERSION);
		}
	}
	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public BMCreateButtonResponseType bMCreateButton (BMCreateButtonReq BMCreateButtonReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(BMCreateButtonReq.getBMCreateButtonRequest());
		String response = call("BMCreateButton", BMCreateButtonReq.toXMLString(), apiUsername);
		return new BMCreateButtonResponseType(response);
	}

	public BMCreateButtonResponseType bMCreateButton (BMCreateButtonReq BMCreateButtonReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return bMCreateButton(BMCreateButtonReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public BMUpdateButtonResponseType bMUpdateButton (BMUpdateButtonReq BMUpdateButtonReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(BMUpdateButtonReq.getBMUpdateButtonRequest());
		String response = call("BMUpdateButton", BMUpdateButtonReq.toXMLString(), apiUsername);
		return new BMUpdateButtonResponseType(response);
	}

	public BMUpdateButtonResponseType bMUpdateButton (BMUpdateButtonReq BMUpdateButtonReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return bMUpdateButton(BMUpdateButtonReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public BMManageButtonStatusResponseType bMManageButtonStatus (BMManageButtonStatusReq BMManageButtonStatusReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(BMManageButtonStatusReq.getBMManageButtonStatusRequest());
		String response = call("BMManageButtonStatus", BMManageButtonStatusReq.toXMLString(), apiUsername);
		return new BMManageButtonStatusResponseType(response);
	}

	public BMManageButtonStatusResponseType bMManageButtonStatus (BMManageButtonStatusReq BMManageButtonStatusReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return bMManageButtonStatus(BMManageButtonStatusReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public BMGetButtonDetailsResponseType bMGetButtonDetails (BMGetButtonDetailsReq BMGetButtonDetailsReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(BMGetButtonDetailsReq.getBMGetButtonDetailsRequest());
		String response = call("BMGetButtonDetails", BMGetButtonDetailsReq.toXMLString(), apiUsername);
		return new BMGetButtonDetailsResponseType(response);
	}

	public BMGetButtonDetailsResponseType bMGetButtonDetails (BMGetButtonDetailsReq BMGetButtonDetailsReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return bMGetButtonDetails(BMGetButtonDetailsReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public BMSetInventoryResponseType bMSetInventory (BMSetInventoryReq BMSetInventoryReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(BMSetInventoryReq.getBMSetInventoryRequest());
		String response = call("BMSetInventory", BMSetInventoryReq.toXMLString(), apiUsername);
		return new BMSetInventoryResponseType(response);
	}

	public BMSetInventoryResponseType bMSetInventory (BMSetInventoryReq BMSetInventoryReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return bMSetInventory(BMSetInventoryReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public BMGetInventoryResponseType bMGetInventory (BMGetInventoryReq BMGetInventoryReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(BMGetInventoryReq.getBMGetInventoryRequest());
		String response = call("BMGetInventory", BMGetInventoryReq.toXMLString(), apiUsername);
		return new BMGetInventoryResponseType(response);
	}

	public BMGetInventoryResponseType bMGetInventory (BMGetInventoryReq BMGetInventoryReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return bMGetInventory(BMGetInventoryReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public BMButtonSearchResponseType bMButtonSearch (BMButtonSearchReq BMButtonSearchReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(BMButtonSearchReq.getBMButtonSearchRequest());
		String response = call("BMButtonSearch", BMButtonSearchReq.toXMLString(), apiUsername);
		return new BMButtonSearchResponseType(response);
	}

	public BMButtonSearchResponseType bMButtonSearch (BMButtonSearchReq BMButtonSearchReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return bMButtonSearch(BMButtonSearchReq, null);
	}

}
