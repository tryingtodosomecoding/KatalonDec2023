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
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.RequestObject as RequestObject

// Send the request
ResponseObject ro = WS.sendRequest(findTestObject('API_Endpoints_HealthCareApp/API_Endpoints_Flask_Cars/GET_Cars'))

String combinedString = ''

// Check if the request was successful
if (ro.getStatusCode() == 200) {
    // Parse the JSON response
    def jsonSlurper = new JsonSlurper()

    def responseObject = jsonSlurper.parseText(ro.getResponseText())

    // Extract 'make' and 'model' values
    String make = responseObject[0].make

    String model = responseObject[0].model

    // Combine and store them in a string
    combinedString = ((make + ' ') + model)

    println(combinedString // Outputs: Toyota Camry
        )
} else {
    println("API request failed with status code: $ro.getStatusCode()")
}

WebUI.openBrowser('google.com')

WebUI.click(findTestObject('Google/Page_Google/textarea__q'))

// WebUI.setText(findTestObject('Google/Page_Google/textarea__q'), combinedString)
WebUI.sendKeys(findTestObject('Google/Page_Google/textarea__q'), ((combinedString + Keys.ENTER) as String))

WebUI.closeBrowser()

