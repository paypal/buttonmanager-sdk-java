IPN Overview :
------------
* PayPal Instant Payment Notification is a call back system that will get initiated once a tranction is completed(eg: When 
a payment transaction completed successfully).
* You will receive the transaction related ipn variables on your call back url that you have specified in your request.
* You have to send this ipn variable back to PayPal system for verification, Upon verification PayPal will send
a response string "VERIFIED" or "INVALID".
* PayPal will continuously resend this ipn, if a wrong ipn is sent.

IPN configuration :
-----------------
* Initialize IPNMessage constructor with a configuration map containing, mode (sandbox or live) and connection parameters as shown below.
   ```java
		Map<String,String> configMap = new HashMap<String,String>();
			
	    // Endpoints are varied depending on whether sandbox OR live is chosen for mode
	    configMap.put("mode", "sandbox");
			
		// Connection Information. These values are defaulted in SDK. If you want to override default values, uncomment it and add your value.
		// configMap.put("http.ConnectionTimeOut", "5000");
		// configMap.put("http.Retry", "2");
		// configMap.put("http.ReadTimeOut", "30000");
		// configMap.put("http.MaxConnection", "100");
				
		IPNMessage ipnlistener = new IPNMessage(request,configMap);
    ```
* IPNMessage is provided in 'sdk-core-java' repository. IPN Listener can use this class for message validation.
    
IPN How to run?
--------------
* Ipn Listener sample 'IPNListenerServlet.java' is provided under the package 'com/sample/ipn'.
* Deploy IPN Listener sample in Cloud environment or you can expose your server port using any third party 
  LocalTunneling software , so that you can receive PayPal IPN call back.
* Make a PayPal api call (eg: BMCreateButton request), setting the IpnNotificationUrl field of api request class
  to the url of deployed IPNListener sample (eg: http://DNS-Name/buttonmanagersample/IPNListener).
* You will receive ipn call back from PayPal , which will be logged into log file in case of IPN sample.   

       
IPN variables :
--------------

[TransactionType]
-----------------   
* txn_type    

[Transaction_Notification]
---------------------------
* business
* charset
* custom
* ipn_track_id
* notify_version
* parent_txn_id
* receipt_id
* receiver_email
* receiver_id
* resend
* residence_country
* test_ipn
* txn_id
* txn_type
* verify_sign
* transaction_subject
* btn_id 


[BuyerInfo]
------------
* address_country
* address_city
* address_country_code
* address_name
* address_state
* address_status
* address_street
* address_zip
* contact_phone
* first_name
* last_name
* payer_business_name
* payer_email
* payer_id



[Auction]
-----------
* auction_buyer_id
* auction_closing_date
* auction_multi_item
* for_auction

[MassPay]
----------
* masspay_txn_id_X
* mc_currency_X
* mc_fee_X
* mc_gross_X
* mc_handlingX
* payment_date
* payment_status
* reason_code
* receiver_email_X
* status_X
* unique_id_X

[RecurringPayment]
------------------
* amount
* amount_per_cycle
* initial_payment_amount
* next_payment_date
* outstanding_balance
* payment_cycle
* period_type
* product_name
* product_type
* profile_status
* recurring_payment_id
* rp_invoice_id
* time_created

[Subscription]
--------------
* amountX
* mc_amountX
* password
* periodX
* reattempt
* recur_times
* recurring
* retry_at
* subscr_date
* subscr_effective
* subscr_id
* username


[DisputeResolution]
-------------------
* case_creation_date
* case_id
* case_type
* reason_code
 
[Paymentinfo]
-------------
* exchange_rate
* fraud_managment_pending_filters_X
* invoice
* item_name
* item_nameX
* item_numberX
* mc_currency
* mc_fee
* mc_gross
* mc_gross_X
* mc_handling
* mc_shipping
* mc_shippingX
* memo
* num_cart_items
* option_nameX
* option_selectionX
* payer_status
* payment_date
* payment_fee
* payment_fee_X
* payment_gross
* payment_gross_X
* payment_status
* pending_reason
* protection_eligibility
* quantity
* reason_code
* remaining_settle
* settle_amount
* settle_currency
* shipping
* shipping_method
* tax
* transaction_entity
* payment_type
* handling_amount
* shipping_discount
* insurance_amount
* discount

[BillingAgreement]
------------------
* mp_currency
* mp_custom
* mp_cycle_start
* mp_desc
* mp_id
* mp_pay_type
* mp_status

      
 
* For a full list of ipn variables you need to check log file, that Ipn Listener is logging into.    

IPN Reference :
--------------
* You can refer IPN getting started guide at [https://www.x.com/developers/paypal/documentation-tools/ipn/gs_IPN]
