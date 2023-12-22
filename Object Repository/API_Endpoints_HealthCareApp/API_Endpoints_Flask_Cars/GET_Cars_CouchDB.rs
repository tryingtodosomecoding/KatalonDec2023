<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET_Cars_CouchDB</name>
   <tag></tag>
   <elementGuidId>67271555-d004-4e01-bf3e-e6b2fad9e270</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic YWRtaW46cGFzczEyMw==</value>
      <webElementGuid>b19b6478-7d86-41f6-837b-c866d86d2f41</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>http://127.0.0.1:5984/cars/_all_docs?include_docs=true</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
WS.verifyElementPropertyValue(response, 'rows[0].doc._id', &quot;f9da3198e5d42d54ebf3c7a684000b04&quot;)
WS.verifyElementPropertyValue(response, 'rows[0].doc._rev', &quot;1-f7b4735a1c4e6f475546debe9aecccfe&quot;)
WS.verifyElementPropertyValue(response, 'rows[0].doc.make', &quot;Toyota&quot;)
WS.verifyElementPropertyValue(response, 'rows[0].doc.model', &quot;Camry&quot;)
WS.verifyElementPropertyValue(response, 'rows[0].doc.model', &quot;Hybrid&quot;)
WS.verifyElementPropertyValue(response, 'rows[0].doc.engine_type', &quot;Hybrid&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
