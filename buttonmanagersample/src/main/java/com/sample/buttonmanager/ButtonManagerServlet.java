package com.sample.buttonmanager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import urn.ebay.api.PayPalAPI.BMButtonSearchReq;
import urn.ebay.api.PayPalAPI.BMButtonSearchRequestType;
import urn.ebay.api.PayPalAPI.BMButtonSearchResponseType;
import urn.ebay.api.PayPalAPI.BMCreateButtonReq;
import urn.ebay.api.PayPalAPI.BMCreateButtonRequestType;
import urn.ebay.api.PayPalAPI.BMCreateButtonResponseType;
import urn.ebay.api.PayPalAPI.BMGetButtonDetailsReq;
import urn.ebay.api.PayPalAPI.BMGetButtonDetailsRequestType;
import urn.ebay.api.PayPalAPI.BMGetButtonDetailsResponseType;
import urn.ebay.api.PayPalAPI.BMGetInventoryReq;
import urn.ebay.api.PayPalAPI.BMGetInventoryRequestType;
import urn.ebay.api.PayPalAPI.BMGetInventoryResponseType;
import urn.ebay.api.PayPalAPI.BMManageButtonStatusReq;
import urn.ebay.api.PayPalAPI.BMManageButtonStatusRequestType;
import urn.ebay.api.PayPalAPI.BMManageButtonStatusResponseType;
import urn.ebay.api.PayPalAPI.BMSetInventoryReq;
import urn.ebay.api.PayPalAPI.BMSetInventoryRequestType;
import urn.ebay.api.PayPalAPI.BMSetInventoryResponseType;
import urn.ebay.api.PayPalAPI.BMUpdateButtonReq;
import urn.ebay.api.PayPalAPI.BMUpdateButtonRequestType;
import urn.ebay.api.PayPalAPI.BMUpdateButtonResponseType;
import urn.ebay.api.PayPalAPI.InstallmentDetailsType;
import urn.ebay.api.PayPalAPI.OptionDetailsType;
import urn.ebay.api.PayPalAPI.OptionSelectionDetailsType;
import urn.ebay.api.PayPalAPI.PayPalAPIInterfaceServiceService;
import urn.ebay.apis.eBLBaseComponents.BillingPeriodType;
import urn.ebay.apis.eBLBaseComponents.ButtonCodeType;
import urn.ebay.apis.eBLBaseComponents.ButtonSearchResultType;
import urn.ebay.apis.eBLBaseComponents.ButtonStatusType;
import urn.ebay.apis.eBLBaseComponents.ButtonTypeType;
import urn.ebay.apis.eBLBaseComponents.ItemTrackingDetailsType;
import urn.ebay.apis.eBLBaseComponents.OptionTypeListType;

import com.paypal.exception.ClientActionRequiredException;
import com.paypal.exception.HttpErrorException;
import com.paypal.exception.InvalidCredentialException;
import com.paypal.exception.InvalidResponseDataException;
import com.paypal.exception.MissingCredentialException;
import com.paypal.exception.SSLConfigurationException;
import com.paypal.sdk.exceptions.OAuthException;

public class ButtonManagerServlet extends HttpServlet {

	private static final long serialVersionUID = 12345456723541232L;

	public ButtonManagerServlet() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		if (req.getRequestURI().contains("BMCreateButton"))
			getServletConfig().getServletContext()
					.getRequestDispatcher("/ButtonManager/BMCreateButton.jsp")
					.forward(req, res);
		else if (req.getRequestURI().contains("BMUpdateButton"))
			getServletConfig().getServletContext()
					.getRequestDispatcher("/ButtonManager/BMUpdateButton.jsp")
					.forward(req, res);
		else if (req.getRequestURI().contains("BMButtonSearch"))
			getServletConfig().getServletContext()
					.getRequestDispatcher("/ButtonManager/BMButtonSearch.jsp")
					.forward(req, res);
		else if (req.getRequestURI().contains("BMGetButtonDetails"))
			getServletConfig()
					.getServletContext()
					.getRequestDispatcher(
							"/ButtonManager/BMGetButtonDetails.jsp")
					.forward(req, res);
		else if (req.getRequestURI().contains("BMManageButtonStatus"))
			getServletConfig()
					.getServletContext()
					.getRequestDispatcher(
							"/ButtonManager/BMManageButtonStatus.jsp")
					.forward(req, res);
		else if (req.getRequestURI().contains("BMGetInventory"))
			getServletConfig().getServletContext()
					.getRequestDispatcher("/ButtonManager/BMGetInventory.jsp")
					.forward(req, res);
		else if (req.getRequestURI().contains("BMSetInventory"))
			getServletConfig().getServletContext()
					.getRequestDispatcher("/ButtonManager/BMSetInventory.jsp")
					.forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.setAttribute("url", req.getRequestURI());
		session.setAttribute(
				"relatedUrl",
				"<ul><li><a href='BM/BMCreateButton'>BMCreateButton</a></li><li><a href='BM/BMUpdateButton'>BMUpdateButton</a></li><li><a href='BM/BMButtonSearch'>BMButtonSearch</a></li><li><a href='BM/BMGetButtonDetails'>BMGetButtonDetails</a></li><li><a href='BM/BMManageButtonStatus'>BMManageButtonStatus</a></li><li><a href='BM/BMSetInventory'>BMSetInventory</a></li><li><a href='BM/BMGetInventory'>BMGetInventory</a></li></ul>");
		res.setContentType("text/html");
		try {
			// Configuration map containing signature credentials and other required configuration.
			// For a full list of configuration parameters refer in wiki page. 
			// (https://github.com/paypal/sdk-core-java/wiki/SDK-Configuration-Parameters)
			Map<String,String> configurationMap =  Configuration.getAcctAndConfig();
			
			// Creating service wrapper object to make an API call by loading configuration map. 
			PayPalAPIInterfaceServiceService service = new PayPalAPIInterfaceServiceService(configurationMap);
			
			if (req.getRequestURI().contains("BMCreateButton")) {

				BMCreateButtonReq request = new BMCreateButtonReq();
				BMCreateButtonRequestType reqType = new BMCreateButtonRequestType();
				
				/*
				 *  (Required) The kind of button you want to create. 
				 *  It is one of the following values:

				    BUYNOW - Buy Now button
				    CART - Add to Cart button
				    GIFTCERTIFICATE - Gift Certificate button
				    SUBSCRIBE - Subscribe button
				    DONATE - Donate button
				    UNSUBSCRIBE - Unsubscribe button
				    VIEWCART - View Cart button
				    PAYMENTPLAN - Installment Plan button; since version 63.0
				    AUTOBILLING - Automatic Billing button; since version 63.0
				    PAYMENT - Pay Now button; since version 65.1

					Note: Do not specify BUYNOW if BUTTONCODE=TOKEN; specify PAYMENT instead. 
					Do not specify PAYMENT if BUTTONCODE=HOSTED. 
				 */
				reqType.setButtonType(ButtonTypeType.fromValue(req.getParameter("buttonType")));
				
				/*
				 *  (Optional) The kind of button code to create. 
				 *  It is one of the following values:

				    1.HOSTED - A secure button stored on PayPal; default for all buttons 
				      except View Cart, Unsubscribe, and Pay Now
				    2.ENCRYPTED - An encrypted button, not stored on PayPal; default for 
				       View Cart button
				    3.CLEARTEXT - An unencrypted button, not stored on PayPal; default for 
				      Unsubscribe button
				    4.TOKEN - A secure button, not stored on PayPal, used only to initiate the Hosted 
				      Solution checkout flow; default for Pay Now button. Since version 65.1
				 */
				reqType.setButtonCode(ButtonCodeType.fromValue(req.getParameter("buttonCode")));
				
				//(Optional) HTML standard button variables
				List<String> lst = new ArrayList<String>();
				lst.add("item_name=" + req.getParameter("itemName"));
				lst.add("return=" + req.getParameter("returnURL"));
				lst.add("business=" + req.getParameter("businessMail"));
				lst.add("amount=" + req.getParameter("amt"));
				lst.add("notify_url=" + req.getParameter("notifyURL"));
				reqType.setButtonVar(lst);
				
				/* 
				 * Construct the request values according to the Button Type and
				   Button Code.
				 */
				if (req.getParameter("buttonType").equalsIgnoreCase("PAYMENTPLAN")) {
					
					OptionSelectionDetailsType detailsType = new OptionSelectionDetailsType("CreateButton");

					List<InstallmentDetailsType> insList = new ArrayList<InstallmentDetailsType>();
					InstallmentDetailsType insType = new InstallmentDetailsType();
					/*
					 * (Optional) The total number of billing cycles, regardless of the duration 
					 * of a cycle; 1 is the default
					 */
					insType.setTotalBillingCycles(Integer.parseInt(req.getParameter("billingCycles")));
					
					//(Optional) The base amount to bill for the cycle.
					insType.setAmount(req.getParameter("installmentAmt"));
					
					/*
					 * (Optional) The installment cycle frequency in units, e.g. if the billing frequency is 2 
					 * and the billing period is Month, the billing cycle is every 2 months. 
					 * The default billing frequency is 1.
					 */
					insType.setBillingFrequency(Integer.parseInt(req.getParameter("billingFreq")));
					
					/*
					 *  (Optional) The installment cycle unit, 
					 *  which is one of the following values:

					    NoBillingPeriodType - None (default)
					    Day
					    Week
					    SemiMonth
					    Month
					    Year
					 */
					insType.setBillingPeriod(BillingPeriodType.fromValue(req.getParameter("billingPeriod")));
					insList.add(insType);
					
					/*
					 *  (Optional) The installment option type for an OPTIONnNAME, 
					 *  which is one of the following values:

					    FULL - Payment in full
					    VARIABLE - Variable installments
					    EMI - Equal installments
					 */
					detailsType.setOptionType(OptionTypeListType.fromValue(req.getParameter("optionType")));
					
					//(Optional) Information about an installment option
					detailsType.setPaymentPeriod(insList);
					
					//Option Details created with Menu name
					OptionDetailsType optType = new OptionDetailsType("CreateButton");
					List<OptionSelectionDetailsType> optSelectList = new ArrayList<OptionSelectionDetailsType>();
					optSelectList.add(detailsType);
					List<OptionDetailsType> optList = new ArrayList<OptionDetailsType>();
					
					//(Optional) Menu items
					optType.setOptionSelectionDetails(optSelectList);

					optList.add(optType);
					reqType.setOptionDetails(optList);
				} else if (req.getParameter("buttonType").equalsIgnoreCase("AUTOBILLING")) {
					
					//(Optional) HTML standard button variables
					lst.add("min_amount=" + req.getParameter("minAmt"));
				} else if (req.getParameter("buttonType").equalsIgnoreCase("GIFTCERTIFICATE")) {
					
					//(Optional) HTML standard button variables
					lst.add("shopping_url=" + req.getParameter("shoppingUrl"));
				} else if (req.getParameter("buttonType").equalsIgnoreCase("PAYMENT")) {
					
					//(Optional) HTML standard button variables
					lst.add("subtotal=" + req.getParameter("subTotal"));

				} else if (req.getParameter("buttonType").equalsIgnoreCase("SUBSCRIBE")) {
					
					//(Optional) HTML standard button variables
					lst.add("a3=" + req.getParameter("subAmt"));
					lst.add("p3=" + req.getParameter("subPeriod"));
					lst.add("t3=" + req.getParameter("subInterval"));
				}
				request.setBMCreateButtonRequest(reqType);
				BMCreateButtonResponseType resp = service.bMCreateButton(request);

				if (resp != null) {
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getAck().toString().equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getAck());
						
						//ID of a PayPal-hosted button or a Hosted Solution token
						map.put("Hosted Button ID", resp.getHostedButtonID());
						
						session.setAttribute("map", map);
						res.sendRedirect(this.getServletContext().getContextPath()+"/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getErrors());
						res.sendRedirect(this.getServletContext().getContextPath()+"/Error.jsp");
					}
				}
				
			} else if (req.getRequestURI().contains("BMUpdateButton")) {
				
				BMUpdateButtonReq request = new BMUpdateButtonReq();
				BMUpdateButtonRequestType reqType = new BMUpdateButtonRequestType();
				/*
				 *  (Required) The kind of button you want to update. It is one of the following values:

				    BUYNOW - Buy Now button
				    CART - Add to Cart button
				    GIFTCERTIFICATE - Gift Certificate button
				    SUBSCRIBE - Subscribe button
				    DONATE - Donate button
				    UNSUBSCRIBE - Unsubscribe button
				    VIEWCART - View Cart button
				    PAYMENTPLAN - Installment Plan button; since version 63.0
				    AUTOBILLING - Automatic Billing button; since version 63.0

				Note:
				 You cannot change the kind of button after the button has been created.

				 */
				reqType.setButtonType(ButtonTypeType.fromValue(req.getParameter("buttonType")));
				/*
				 *  (Optional) The kind of button code to create. 
				 *  It is one of the following values:

				    HOSTED - A secure button stored on PayPal; default for all buttons except View Cart and Unsubscribe
				    ENCRYPTED - An encrypted button, not stored on PayPal; default for View Cart button
				    CLEARTEXT - An unencrypted button, not stored on PayPal; default for Unsubscribe button
    				Note:
    					You cannot change the kind of button code after after the button has been created.
				 */
				reqType.setButtonCode(ButtonCodeType.fromValue(req.getParameter("buttonCode")));
				
				//(Optional) HTML standard button variables
				List<String> lst = new ArrayList<String>();
				lst.add("item_name=" + req.getParameter("itemName"));
				lst.add("amount=" + req.getParameter("amt"));
				lst.add("return=" + req.getParameter("returnURL"));
				lst.add("business=" + req.getParameter("businessMail"));
				lst.add("notify_url=" + req.getParameter("notifyURL"));
				
				reqType.setButtonVar(lst);
				// Construct the request values according to the Button Type and
				// Button Code
				if (req.getParameter("buttonType").equalsIgnoreCase("PAYMENTPLAN")) {
					
					OptionSelectionDetailsType detailsType = new OptionSelectionDetailsType(
							"CreateButton");

					List<InstallmentDetailsType> insList = new ArrayList<InstallmentDetailsType>();
					InstallmentDetailsType insType = new InstallmentDetailsType();
					
					/*
					 * (Optional) The total number of billing cycles, regardless of the duration 
					 * of a cycle; 1 is the default
					 */
					insType.setTotalBillingCycles(3);
					
					//(Optional) The base amount to bill for the cycle.
					insType.setAmount("2.00");
					
					/*
					 * (Optional) The installment cycle frequency in units, e.g. 
					 * if the billing frequency is 2 and the billing period is Month, 
					 * the billing cycle is every 2 months. The default billing frequency is 1.
					 */
					insType.setBillingFrequency(2);
					
					/*
					 *  (Optional) The installment cycle unit, which is one of the following values:

					    NoBillingPeriodType - None (default)
					    Day
					    Week
					    SemiMonth
					    Month
					    Year
					 */
					insType.setBillingPeriod(BillingPeriodType.MONTH);
					insList.add(insType);
					/*
					 *  (Optional) The installment option type for an OPTIONnNAME, 
					 *  which is one of the following values:
						
					    FULL - Payment in full
					    VARIABLE - Variable installments
					    EMI - Equal installments
					    
						Note:
						Only available for Installment Plan buttons.
					 */
					detailsType.setOptionType(OptionTypeListType.EMI);
					
					//(Optional) Information about an installment option
					detailsType.setPaymentPeriod(insList);
					
					//Option Details created with Menu name
					OptionDetailsType optType = new OptionDetailsType("CreateButton");
					List<OptionSelectionDetailsType> optSelectList = new ArrayList<OptionSelectionDetailsType>();
					optSelectList.add(detailsType);
					List<OptionDetailsType> optList = new ArrayList<OptionDetailsType>();
					
					//(Optional) Menu items
					optType.setOptionSelectionDetails(optSelectList);

					optList.add(optType);
					reqType.setOptionDetails(optList);
				} else if (req.getParameter("buttonType").equalsIgnoreCase("AUTOBILLING")) {
					//(Optional) HTML standard button variables
					lst.add("min_amount=4.00");
				} else if (req.getParameter("buttonType").equalsIgnoreCase("GIFTCERTIFICATE")) {
					//(Optional) HTML standard button variables
					lst.add("shopping_url=http://www.ebay.com");
				} else if (req.getParameter("buttonType").equalsIgnoreCase("PAYMENT")) {
					//(Optional) HTML standard button variables
					lst.add("subtotal=2.00");
				} else if (req.getParameter("buttonType").equalsIgnoreCase("SUBSCRIBE")) {
					//(Optional) HTML standard button variables
					lst.add("a3=2.00");
					lst.add("p3=3");
					lst.add("t3=W");
				}
				
				//(Required) The ID of the hosted button you want to modify.
				reqType.setHostedButtonID(req.getParameter("hostedID"));
				request.setBMUpdateButtonRequest(reqType);
				
				// ## Making API call
				// Invoke the appropriate method corresponding to API in service
				// wrapper object
				BMUpdateButtonResponseType resp = service.bMUpdateButton(request);

				if (resp != null) {
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getAck().toString().equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getAck());
						
						//ID of a PayPal hosted button
						map.put("Hosted Button ID", resp.getHostedButtonID());
						session.setAttribute("map", map);
						res.sendRedirect(this.getServletContext().getContextPath()+"/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getErrors());
						res.sendRedirect(this.getServletContext().getContextPath()+"/Error.jsp");
					}
				}
			} else if (req.getRequestURI().contains("BMButtonSearch")) {
				BMButtonSearchReq request = new BMButtonSearchReq();
				BMButtonSearchRequestType reqType = new BMButtonSearchRequestType();
				
				/*
				 * (Required) Starting date for the search. The value must be in UTC/GMT format; 
				 * for example, 2009-08-24T05:38:48Z. No wildcards are allowed. 
				 */
				reqType.setStartDate(req.getParameter("startDate") + "T00:00:00.000Z");
				/*
				 * (Optional) Ending date for the search. The value must be in UTC/GMT format; 
				 * for example, 2010-05-01T05:38:48Z. No wildcards are allowed.
				 */
				reqType.setEndDate(req.getParameter("endDate")+ "T23:59:59.000Z");
				
				request.setBMButtonSearchRequest(reqType);
				
				// ## Making API call
				// Invoke the appropriate method corresponding to API in service
				// wrapper object
				BMButtonSearchResponseType resp = service.bMButtonSearch(request);
				if (resp != null) {
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getAck().toString().equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getAck());
						Iterator<ButtonSearchResultType> iterator = resp
								.getButtonSearchResult().iterator();
						while (iterator.hasNext()) {
							ButtonSearchResultType result = (ButtonSearchResultType) iterator
									.next();
							
							//The hosted button ID
							map.put("ButtonType", result.getButtonType());
							
							//The hosted button ID
							map.put("Hosted Button ID",result.getHostedButtonID());
							
							//The item name
							map.put("Item Name", result.getItemName());
						}

						session.setAttribute("map", map);
						res.sendRedirect(this.getServletContext().getContextPath()+"/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getErrors());
						res.sendRedirect(this.getServletContext().getContextPath()+"/Error.jsp");
					}
				}

			} else if (req.getRequestURI().contains("BMGetButtonDetails")) {
				
				BMGetButtonDetailsReq request = new BMGetButtonDetailsReq();
				BMGetButtonDetailsRequestType reqType = new BMGetButtonDetailsRequestType();
				
				//(Required) The ID of the hosted button whose details you want to obtain.
				reqType.setHostedButtonID(req.getParameter("hostedID"));

				request.setBMGetButtonDetailsRequest(reqType);
				
				// ## Making API call
				// Invoke the appropriate method corresponding to API in service
				// wrapper object
				BMGetButtonDetailsResponseType resp = service.bMGetButtonDetails(request);
				if (resp != null) {
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getAck().toString().equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getAck());
						/*
						 * The kind of button. It is one of the following values:

						    BUYNOW - Buy Now button
						    CART - Add to Cart button
						    GIFTCERTIFICATE - Gift Certificate button
						    SUBSCRIBE - Subscribe button
						    DONATE - Donate button
						    UNSUBSCRIBE - Unsubscribe button
						    VIEWCART - View Cart button
						    PAYMENTPLAN - Installment Plan button; since version 63.0
						    AUTOBILLING - Automatic Billing button; since version 63.0
						 */
						map.put("ButtonType", resp.getButtonType());
						
						/*
						 * The kind of button code. It is one of the following values:

						    HOSTED - A secure button stored on PayPal
						    ENCRYPTED - An encrypted button, not stored on PayPal
						    CLEARTEXT - An unencrypted button, not stored on PayPal
						 */
						map.put("ButtonCode", resp.getButtonCode());
						
						//HTML code for web pages
						map.put("Website", resp.getWebsite());
						session.setAttribute("map", map);
						res.sendRedirect(this.getServletContext().getContextPath()+"/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getErrors());
						res.sendRedirect(this.getServletContext().getContextPath()+"/Error.jsp");
					}
				}

			} else if (req.getRequestURI().contains("BMManageButtonStatus")) {
				BMManageButtonStatusReq request = new BMManageButtonStatusReq();
				BMManageButtonStatusRequestType reqType = new BMManageButtonStatusRequestType();
				
				//(Required) The ID of the hosted button whose status you want to change.
				reqType.setHostedButtonID(req.getParameter("hostedID"));
				
				/*
				 *  (Required) The new status of the button. It is one of the following values:
    				 DELETE - the button is deleted from PayPal
				 */
				reqType.setButtonStatus(ButtonStatusType.fromValue(req.getParameter("buttonStatus")));
				request.setBMManageButtonStatusRequest(reqType);
				
				// ## Making API call
				// Invoke the appropriate method corresponding to API in service
				// wrapper object
				BMManageButtonStatusResponseType resp = service.bMManageButtonStatus(request);
				
				if (resp != null) {
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getAck().toString().equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getAck());
						session.setAttribute("map", map);
						res.sendRedirect(this.getServletContext().getContextPath()+"/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getErrors());
						res.sendRedirect(this.getServletContext().getContextPath()+"/Error.jsp");
					}
				}

			} else if (req.getRequestURI().contains("BMGetInventory")) {
				BMGetInventoryReq request = new BMGetInventoryReq();
				BMGetInventoryRequestType reqType = new BMGetInventoryRequestType();
				//(Required) The ID of the hosted button whose inventory information you want to obtain.
				reqType.setHostedButtonID(req.getParameter("hostedID"));
				request.setBMGetInventoryRequest(reqType);
				
				// ## Making API call
				// Invoke the appropriate method corresponding to API in service
				// wrapper object
				BMGetInventoryResponseType resp = service.bMGetInventory(request);

				if (resp != null) {
					if (resp.getAck().toString().equalsIgnoreCase("SUCCESS")) {
						session.setAttribute("lastReq",
								service.getLastRequest());
						session.setAttribute("lastResp",
								service.getLastResponse());
						if (resp.getAck().toString()
								.equalsIgnoreCase("SUCCESS")) {
							Map<Object, Object> map = new LinkedHashMap<Object, Object>();
							map.put("Ack", resp.getAck());
							/*
							 * Whether to track inventory levels associated with the button. 
							 * It is one of the following values:

							    0 - do not track inventory
							    1 - track inventory
							 */
							map.put("TrackInv", resp.getTrackInv());
							
							/*
							 * Whether to track the gross profit associated with inventory changes. 
							 * It is one of the following values:
							
							    0 - do not track the gross profit
							    1 - track the gross profit
							
							Note:
							The gross profit is calculated as the price of the item less its cost, 
							multiplied by the change in the inventory level since the last call to 
							BMSetInventory.
							 */
							map.put("TrackPnl", resp.getTrackPnl());
							//The ID of the hosted button whose inventory you want to set.
							map.put("Hosted Button ID",resp.getHostedButtonID());
							
							//The cost of the item associated with this button 
							map.put("Item Cost", resp.getItemTrackingDetails().getItemCost());
							
							//The current inventory level of the item associated with this button 
							map.put("Item Quantity", resp.getItemTrackingDetails().getItemQty());
							session.setAttribute("map", map);
							res.sendRedirect(this.getServletContext().getContextPath()+"/Response.jsp");
						}

					} else {
						session.setAttribute("Error", resp.getErrors());
						res.sendRedirect(this.getServletContext().getContextPath()+"/Error.jsp");
					}
				}
			} else if (req.getRequestURI().contains("BMSetInventory")) {
				BMSetInventoryReq request = new BMSetInventoryReq();
				BMSetInventoryRequestType reqType = new BMSetInventoryRequestType();
				
				//API Version
				reqType.setVersion("82");	
				
				//(Required) The ID of the hosted button whose inventory you want to set.
				reqType.setHostedButtonID(req.getParameter("hostedID"));
				
				/*
				 *  (Required) Whether to track inventory levels associated with the button. 
				 *  It is one of the following values:

				    0 - do not track inventory
				    1 - track inventory
				 */
				reqType.setTrackInv(req.getParameter("trackInv"));
				
				/*
				 *  (Required) Whether to track the gross profit associated with inventory changes. 
				 *  It is one of the following values:

				    0 - do not track the gross profit
				    1 - track the gross profit
					Note: The gross profit is calculated as the price of the item less its cost, 
					multiplied by the change in the inventory level since the last call to 
					BMSetInventory
				 */
				reqType.setTrackPnl(req.getParameter("trackPnl"));
				ItemTrackingDetailsType itemTrackDetails = new ItemTrackingDetailsType();
				
				/*
				 * The quantity you want to specify for the item associated with this button. 
				 * Specify either the absolute quantity in this field or the change in quantity in 
				 * the quantity delta field
				 */
				itemTrackDetails.setItemQty(req.getParameter("itemQty"));
				
				//(Optional) The cost of the item associated with this button
				itemTrackDetails.setItemCost(req.getParameter("itemCost"));
				reqType.setItemTrackingDetails(itemTrackDetails);
				request.setBMSetInventoryRequest(reqType);
				
				// ## Making API call
				// Invoke the appropriate method corresponding to API in service
				// wrapper object
				BMSetInventoryResponseType resp = service.bMSetInventory(request);
				res.setContentType("text/html");
				if (resp != null) {
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getAck().toString().equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getAck());
						session.setAttribute("map", map);
						res.sendRedirect(this.getServletContext()
								.getContextPath() + "/Response.jsp");
					} else {

						session.setAttribute("Error", resp.getErrors());
						res.sendRedirect(this.getServletContext()
								.getContextPath() + "/Error.jsp");
					}
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SSLConfigurationException e) {
			e.printStackTrace();
		} catch (InvalidCredentialException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (HttpErrorException e) {
			e.printStackTrace();
		} catch (InvalidResponseDataException e) {
			e.printStackTrace();
		} catch (ClientActionRequiredException e) {
			e.printStackTrace();
		} catch (MissingCredentialException e) {
			e.printStackTrace();
		} catch (OAuthException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
