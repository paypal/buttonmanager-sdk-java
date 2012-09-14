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
			PayPalAPIInterfaceServiceService service = new PayPalAPIInterfaceServiceService(
					this.getServletContext().getRealPath("/")
							+ "/WEB-INF/sdk_config.properties");
			if (req.getRequestURI().contains("BMCreateButton")) {

				BMCreateButtonReq request = new BMCreateButtonReq();
				BMCreateButtonRequestType reqType = new BMCreateButtonRequestType();

				reqType.setButtonType(ButtonTypeType.fromValue(req
						.getParameter("buttonType")));
				reqType.setButtonCode(ButtonCodeType.fromValue(req
						.getParameter("buttonCode")));

				List<String> lst = new ArrayList<String>();

				lst.add("item_name=" + req.getParameter("itemName"));
				lst.add("return=" + req.getParameter("returnURL"));
				lst.add("business=" + req.getParameter("businessMail"));
				lst.add("amount=" + req.getParameter("amt"));

				reqType.setButtonVar(lst);
				// Construct the request values according to the Button Type and
				// Button Code. To know more about that
				if (req.getParameter("buttonType").equalsIgnoreCase(
						"PAYMENTPLAN")) {
					OptionSelectionDetailsType detailsType = new OptionSelectionDetailsType(
							"CreateButton");

					List<InstallmentDetailsType> insList = new ArrayList<InstallmentDetailsType>();
					InstallmentDetailsType insType = new InstallmentDetailsType();
					insType.setTotalBillingCycles(Integer.parseInt(req
							.getParameter("billingCycles")));
					insType.setAmount(req.getParameter("installmentAmt"));
					insType.setBillingFrequency(Integer.parseInt(req
							.getParameter("billingFreq")));

					insType.setBillingPeriod(BillingPeriodType.fromValue(req
							.getParameter("billingPeriod")));
					insList.add(insType);
					detailsType.setOptionType(OptionTypeListType.fromValue(req
							.getParameter("optionType")));
					detailsType.setPaymentPeriod(insList);
					OptionDetailsType optType = new OptionDetailsType(
							"CreateButton");
					List<OptionSelectionDetailsType> optSelectList = new ArrayList<OptionSelectionDetailsType>();
					optSelectList.add(detailsType);
					List<OptionDetailsType> optList = new ArrayList<OptionDetailsType>();
					optType.setOptionSelectionDetails(optSelectList);

					optList.add(optType);
					reqType.setOptionDetails(optList);
				} else if (req.getParameter("buttonType").equalsIgnoreCase(
						"AUTOBILLING")) {
					lst.add("min_amount=" + req.getParameter("minAmt"));
				} else if (req.getParameter("buttonType").equalsIgnoreCase(
						"GIFTCERTIFICATE")) {
					lst.add("shopping_url=" + req.getParameter("shoppingUrl"));
				} else if (req.getParameter("buttonType").equalsIgnoreCase(
						"PAYMENT")) {
					lst.add("subtotal=" + req.getParameter("subTotal"));

				} else if (req.getParameter("buttonType").equalsIgnoreCase(
						"SUBSCRIBE")) {
					lst.add("a3=" + req.getParameter("subAmt"));
					lst.add("p3=" + req.getParameter("subPeriod"));
					lst.add("t3=" + req.getParameter("subInterval"));
				}
				request.setBMCreateButtonRequest(reqType);
				BMCreateButtonResponseType resp = service
						.bMCreateButton(request);

				if (resp != null) {
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getAck().toString().equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getAck());
						map.put("Hosted Button ID", resp.getHostedButtonID());
						session.setAttribute("map", map);
						res.sendRedirect("/buttonmanager-sample/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getErrors());
						res.sendRedirect("/buttonmanager-sample/Error.jsp");
					}
				}
			} else if (req.getRequestURI().contains("BMUpdateButton")) {
				BMUpdateButtonReq request = new BMUpdateButtonReq();
				BMUpdateButtonRequestType reqType = new BMUpdateButtonRequestType();

				reqType.setButtonType(ButtonTypeType.fromValue(req
						.getParameter("buttonType")));
				reqType.setButtonCode(ButtonCodeType.fromValue(req
						.getParameter("buttonCode")));

				List<String> lst = new ArrayList<String>();

				lst.add("item_name=" + req.getParameter("itemName"));
				lst.add("amount=" + req.getParameter("amt"));
				lst.add("return=" + req.getParameter("returnURL"));
				lst.add("business=" + req.getParameter("businessMail"));

				reqType.setButtonVar(lst);
				// Construct the request values according to the Button Type and
				// Button Code
				if (req.getParameter("buttonType").equalsIgnoreCase(
						"PAYMENTPLAN")) {
					OptionSelectionDetailsType detailsType = new OptionSelectionDetailsType(
							"CreateButton");

					List<InstallmentDetailsType> insList = new ArrayList<InstallmentDetailsType>();
					InstallmentDetailsType insType = new InstallmentDetailsType();
					insType.setTotalBillingCycles(3);
					insType.setAmount("2.00");
					insType.setBillingFrequency(2);

					insType.setBillingPeriod(BillingPeriodType.MONTH);
					insList.add(insType);
					detailsType.setOptionType(OptionTypeListType.EMI);
					detailsType.setPaymentPeriod(insList);
					OptionDetailsType optType = new OptionDetailsType(
							"CreateButton");
					List<OptionSelectionDetailsType> optSelectList = new ArrayList<OptionSelectionDetailsType>();
					optSelectList.add(detailsType);
					List<OptionDetailsType> optList = new ArrayList<OptionDetailsType>();
					optType.setOptionSelectionDetails(optSelectList);

					optList.add(optType);
					reqType.setOptionDetails(optList);
				} else if (req.getParameter("buttonType").equalsIgnoreCase(
						"AUTOBILLING")) {
					lst.add("min_amount=4.00");
				} else if (req.getParameter("buttonType").equalsIgnoreCase(
						"GIFTCERTIFICATE")) {
					lst.add("shopping_url=http://www.ebay.com");
				} else if (req.getParameter("buttonType").equalsIgnoreCase(
						"PAYMENT")) {
					lst.add("subtotal=2.00");
				} else if (req.getParameter("buttonType").equalsIgnoreCase(
						"SUBSCRIBE")) {
					lst.add("a3=2.00");
					lst.add("p3=3");
					lst.add("t3=W");
				}
				reqType.setHostedButtonID(req.getParameter("hostedID"));
				request.setBMUpdateButtonRequest(reqType);

				BMUpdateButtonResponseType resp = service
						.bMUpdateButton(request);

				if (resp != null) {
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getAck().toString().equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getAck());
						map.put("Hosted Button ID", resp.getHostedButtonID());
						session.setAttribute("map", map);
						res.sendRedirect("/buttonmanager-sample/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getErrors());
						res.sendRedirect("/buttonmanager-sample/Error.jsp");
					}
				}
			} else if (req.getRequestURI().contains("BMButtonSearch")) {
				BMButtonSearchReq request = new BMButtonSearchReq();
				BMButtonSearchRequestType reqType = new BMButtonSearchRequestType();
				reqType.setStartDate(req.getParameter("startDate")
						+ "T00:00:00.000Z");
				reqType.setEndDate(req.getParameter("endDate")
						+ "T23:59:59.000Z");
				request.setBMButtonSearchRequest(reqType);
				BMButtonSearchResponseType resp = service
						.bMButtonSearch(request);
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
							map.put("ButtonType", result.getButtonType());
							map.put("Hosted Button ID",
									result.getHostedButtonID());
							map.put("Item Name", result.getItemName());
						}

						session.setAttribute("map", map);
						res.sendRedirect("/buttonmanager-sample/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getErrors());
						res.sendRedirect("/buttonmanager-sample/Error.jsp");
					}
				}

			} else if (req.getRequestURI().contains("BMGetButtonDetails")) {
				BMGetButtonDetailsReq request = new BMGetButtonDetailsReq();
				BMGetButtonDetailsRequestType reqType = new BMGetButtonDetailsRequestType();

				reqType.setHostedButtonID(req.getParameter("hostedID"));

				request.setBMGetButtonDetailsRequest(reqType);
				BMGetButtonDetailsResponseType resp = service
						.bMGetButtonDetails(request);
				if (resp != null) {
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getAck().toString().equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getAck());
						map.put("ButtonType", resp.getButtonType());
						map.put("ButtonCode", resp.getButtonCode());
						map.put("Website", resp.getWebsite());
						session.setAttribute("map", map);
						res.sendRedirect("/buttonmanager-sample/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getErrors());
						res.sendRedirect("/buttonmanager-sample/Error.jsp");
					}
				}

			} else if (req.getRequestURI().contains("BMManageButtonStatus")) {
				BMManageButtonStatusReq request = new BMManageButtonStatusReq();
				BMManageButtonStatusRequestType reqType = new BMManageButtonStatusRequestType();
				reqType.setHostedButtonID(req.getParameter("hostedID"));
				reqType.setButtonStatus(ButtonStatusType.fromValue(req
						.getParameter("buttonStatus")));
				request.setBMManageButtonStatusRequest(reqType);
				BMManageButtonStatusResponseType resp = service
						.bMManageButtonStatus(request);
				if (resp != null) {
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getAck().toString().equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getAck());
						session.setAttribute("map", map);
						res.sendRedirect("/buttonmanager-sample/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getErrors());
						res.sendRedirect("/buttonmanager-sample/Error.jsp");
					}
				}

			} else if (req.getRequestURI().contains("BMGetInventory")) {
				BMGetInventoryReq request = new BMGetInventoryReq();
				BMGetInventoryRequestType reqType = new BMGetInventoryRequestType();
				reqType.setHostedButtonID(req.getParameter("hostedID"));
				request.setBMGetInventoryRequest(reqType);
				BMGetInventoryResponseType resp = service
						.bMGetInventory(request);

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
							map.put("TrackInv", resp.getTrackInv());
							map.put("TrackPnl", resp.getTrackPnl());
							map.put("Hosted Button ID",
									resp.getHostedButtonID());
							map.put("Item Cost", resp.getItemTrackingDetails()
									.getItemCost());
							map.put("Item Quantity", resp
									.getItemTrackingDetails().getItemQty());
							session.setAttribute("map", map);
							res.sendRedirect("/buttonmanager-sample/Response.jsp");
						}

					} else {
						session.setAttribute("Error", resp.getErrors());
						res.sendRedirect("/buttonmanager-sample/Error.jsp");
					}
				}
			} else if (req.getRequestURI().contains("BMSetInventory")) {
				BMSetInventoryReq request = new BMSetInventoryReq();
				BMSetInventoryRequestType reqType = new BMSetInventoryRequestType();

				reqType.setVersion("82");

				reqType.setHostedButtonID(req.getParameter("hostedID"));
				reqType.setTrackInv(req.getParameter("trackInv"));
				reqType.setTrackPnl(req.getParameter("trackPnl"));
				ItemTrackingDetailsType itemTrackDetails = new ItemTrackingDetailsType();
				itemTrackDetails.setItemQty(req.getParameter("itemQty"));
				itemTrackDetails.setItemCost(req.getParameter("itemCost"));
				reqType.setItemTrackingDetails(itemTrackDetails);
				request.setBMSetInventoryRequest(reqType);
				BMSetInventoryResponseType resp = service
						.bMSetInventory(request);
				res.setContentType("text/html");
				if (resp != null) {
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getAck().toString().equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getAck());
						session.setAttribute("map", map);
						res.sendRedirect("/buttonmanager-sample/Response.jsp");
					} else {

						session.setAttribute("Error", resp.getErrors());
						res.sendRedirect("/buttonmanager-sample/Error.jsp");
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
