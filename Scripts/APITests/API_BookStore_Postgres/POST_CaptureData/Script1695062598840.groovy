import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webservice.verification.WSResponseManager 
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.util.KeywordUtil
import org.json.JSONObject
import lakshmi.JsonExtractor as JsonExtractor


RequestObject request = findTestObject('API_Endpoints_Flask_BookStore/POST Add Book')
response = WS.sendRequest(request)

//title = WS.getElementPropertyValue(response, '[0].title') 
//Get element property value 

 //request body would be pre-available 
KeywordUtil.logInfo(response.getResponseBodyContent()) //for response to be in report
println(request)

println(request.bodyContent.toString())

println(request.bodyContent.contentType)

println(requestBody = request.getHttpBody())

// def extractedData = JsonExtractor.extractTitleAndAuthor(requestBody)
def extractor = new JsonExtractor()
def extractedData = extractor.extractTitleAndAuthor(requestBody)

println("Title: " + extractedData.title)
println("Author: " + extractedData.author)

/*************/

