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
import com.kms.katalon.plugin.keyword.connection.DatabaseKeywords
import groovy.json.JsonSlurper
import com.kms.katalon.core.testobject.ResponseObject

/*Sending the POST request*/ 

RequestObject request = findTestObject('API_Endpoints_Flask_BookStore/POST Add Book')
ResponseObject response = WS.sendRequest(request)
KeywordUtil.logInfo(response.getResponseBodyContent())

/*Extracting title and author from body*/ 
String requestBody = request.getHttpBody()
def jsonSlurper = new JsonSlurper()
def requestData = jsonSlurper.parseText(requestBody)
String titleFromRequest = requestData.title
String authorFromRequest = requestData.author

/*using custom keyword DBJsonFetcher*/
def fetcher = new lakshmi.DBJsonFetcher()
def bookFromDB = fetcher.fetchBookByTitleAndAuthor(titleFromRequest, authorFromRequest)

if (bookFromDB != null) {
	assert bookFromDB.title == titleFromRequest
	assert bookFromDB.author == authorFromRequest
} else {
	KeywordUtil.markFailed("Book not found in the database.")
}