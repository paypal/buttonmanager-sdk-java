This repository contains java sdk and samples for ButtonManager API.

Prerequisites:
---------------
*	Java jdk-1.5 or higher
*	Apache Maven 3 or higher
*	Please refer http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html for any help in Maven.

To build sdk and samples:
--------------------------
*	Build core files from https://github.com/paypal/sdk-core-java, as it is a dependency for sdk.
*	Then, run 'mvn install' to build sdk jar and sample war files.

SDK Integration:
----------------
*	Create a new maven application.

*	Add dependency to sdk in your application's pom.xml as below.
		
```xml
		<dependency>
			<groupId>com.paypal.sdk</groupId>
			<artifactId>buttonmanagersdk</artifactId>
			<version>2.2.98</version>
		</dependency>
```
To make an API call:
--------------------			
*	Import PayPalAPIInterfaceServiceService.java into your code.
		
*	Copy the configuration file 'sdk_config.properties' in 'merchantsample/src/main/resources' folder to your application 'src/main/resources'. Use the default constructor to run in default configuration.
		  
    ```java
    new PayPalAPIInterfaceServiceService();
    ```
	
*	Or load the configuration file from any location using absolute path with the below method calls as required.

    ```java
    new PayPalAPIInterfaceServiceService(new File("/pathto/custom.properties"));
                         Or
    new PayPalAPIInterfaceServiceService(new FileInputStream(new File("/pathto/custom.properties")));
                         Or
    new PayPalAPIInterfaceServiceService("/pathto/custom.properties");
    			 Or
    new PayPalAPIInterfaceServiceService(Map<String, String> customConfigurationMap);
    			 Or
    new PayPalAPIInterfaceServiceService(Properties customProperties);
    ```
*	The SDK assumes defaults for certain parameters(refer sdk_config.properties for defaults). Either 'mode' or 'service.Endpoint' is a mandatory configuration. Account credentials are treated as mandatory parameters.

*	Create a service wrapper object.

*	Create a request object as per your project needs. 

*	Invoke the appropriate method on the service wrapper object.

    For example,

          
    ```java
    import urn.ebay.api.PayPalAPI.*;
    ...
      
    BMCreateButtonReq request = new BMCreateButtonReq();
    BMCreateButtonRequestType reqType = new BMCreateButtonRequestType();

    reqType.setButtonType(ButtonTypeType.fromValue(req
                    .getParameter("buttonType")));
    reqType.setButtonCode(ButtonCodeType.fromValue(req
                    .getParameter("buttonCode")));
    reqType.setVersion("86.0");
    request.setBMCreateButtonRequest(reqType);


    PayPalAPIInterfaceServiceService service = new PayPalAPIInterfaceServiceService();
    //username is optional
    BMCreateButtonResponseType resp = service.bMCreateButton(request, username);
    ```

SDK Logging:
------------
*	For logging - java.util.logging has been used. To change the default configuration, edit the logging.properties file in 'jre/lib' folder under your JDK root.		  

		  
SDK Configuration:
------------------
The SDK uses .properties format configuration file. Sample of this file is at 
 
'buttonmanagersample/src/main/resources/'. You can use the 'sdk_config.properties' configuration file to configure

*	Mode is specified using the parameter name 'mode' with values 'sandbox' or 'live', if specified 'service.EndPoint' parameter is not required and the SDK chooses the sandbox or live endpoints automatically.

*	(Multiple) API account credentials, by appending a '.' (dot) character and the service name to 'service.EndPoint' parameter.

*	HTTP connection parameters, if certain connection parameters are not specified, the SDK will assume defaults for them.

*	Service configuration.

Multiple End-points Support
---------------------------
Multiple end-points configuration can be done by specifying mulitple end-points identified by specific property keys. 
When using multiple SDKs in combination, like Merchant and Permissions etc..configure the endpoints as shown below 
one for each service used, The existing service.EndPoint property is still supported for backward compatibility (using 
a single SDK). The list below specifies endpoints for different services, in SANDBOX and PRODUCTION, with their 
property keys and end-point as property values.

------------------------------SANDBOX------------------------------  
* Merchant/Button Manager Service (3 Token)  
service.EndPoint.PayPalAPI=https://api-3t.sandbox.paypal.com/2.0  
service.EndPoint.PayPalAPIAA=https://api-3t.sandbox.paypal.com/2.0  

* Merchant/Button Manager Service (Certificate)  
service.EndPoint.PayPalAPI=https://api.sandbox.paypal.com/2.0  
service.EndPoint.PayPalAPIAA=https://api.sandbox.paypal.com/2.0  

* AdaptiveAccounts Platform Service  
service.EndPoint.AdaptiveAccounts=https://svcs.sandbox.paypal.com/  

* AdaptivePayments Platform Service  
service.EndPoint.AdaptivePayments=https://svcs.sandbox.paypal.com/  

* Invoice Platform Service  
service.EndPoint.Invoice=https://svcs.sandbox.paypal.com/  

* Permissions Platform Service  
service.EndPoint.Permissions=https://svcs.sandbox.paypal.com/  

------------------------------PRODUCTION------------------------------  
* Merchant/Button Manager Service (3 Token)  
service.EndPoint.PayPalAPI=https://api-3t.paypal.com/2.0  
service.EndPoint.PayPalAPIAA=https://api-3t.paypal.com/2.0  

* Merchant/Button Manager Service (Certificate)  
service.EndPoint.PayPalAPI=https://api.paypal.com/2.0  
service.EndPoint.PayPalAPIAA=https://api.paypal.com/2.0  

* AdaptiveAccounts Platform Service  
service.EndPoint.AdaptiveAccounts=https://svcs.paypal.com/  

* AdaptivePayments Platform Service  
service.EndPoint.AdaptivePayments=https://svcs.paypal.com/  

* Invoice Platform Service  
service.EndPoint.Invoice=https://svcs.paypal.com/  

* Permissions Platform Service  
service.EndPoint.Permissions=https://svcs.paypal.com/  

For additional information on ButtonManager API, please refer to https://www.x.com/developers/paypal/documentation-tools/api

