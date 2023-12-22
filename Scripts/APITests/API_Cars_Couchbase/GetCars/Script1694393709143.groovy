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

response1 = WS.sendRequest(findTestObject('API_Endpoints_HealthCareApp/API_Endpoints_Flask_Cars/GET_Cars'))

def id1 = WS.getElementPropertyValue(response1, '[0]._id')

def rev1 = WS.getElementPropertyValue(response1, '[0]._rev')

def engine1 = WS.getElementPropertyValue(response1, '[0].engine_type')

def make1 = WS.getElementPropertyValue(response1, '[0].make')

def model1 = WS.getElementPropertyValue(response1, '[0].model')

response2 = WS.sendRequest(findTestObject('API_Endpoints_HealthCareApp/API_Endpoints_Flask_Cars/GET_Cars_CouchDB'))

def id2 = WS.getElementPropertyValue(response2, 'rows[0].doc._id')

def rev2 = WS.getElementPropertyValue(response2, 'rows[0].doc._rev')

def make2 = WS.getElementPropertyValue(response2, 'rows[0].doc.make')

def model2 = WS.getElementPropertyValue(response2, 'rows[0].doc.model')

def engine2 = WS.getElementPropertyValue(response2, 'rows[0].doc.engine_type')

println((id1 + ' comparing to ') + id2)

WS.verifyMatch(id1, id2, false)

println((rev1 + ' comparing to ') + rev2)

WS.verifyMatch(rev1, rev2, false)

println((engine1 + ' comparing to ') + engine2)

WS.verifyMatch(engine1, engine2, false)

println((make1 + ' comparing to ') + make2)

WS.verifyMatch(make1, make2, false)

println((model1 + ' comparing to ') + model2)

WS.verifyMatch(model1, model2, false)

