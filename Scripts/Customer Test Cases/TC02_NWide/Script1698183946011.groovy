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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.nationwide.com/')

WebUI.click(findTestObject('Object Repository/NWideObjects/Page_Insurance and Financial Services Compa_5731d9/button_Vehicle'))

WebUI.click(findTestObject('Object Repository/NWideObjects/Page_Insurance and Financial Services Compa_5731d9/a_Auto'))

WebUI.setText(findTestObject('Object Repository/NWideObjects/Page_Car Insurance - Get a Free Auto Insura_f9bdc8/input_Get a quote for_Zip1'), 
    '08052')

WebUI.click(findTestObject('Object Repository/NWideObjects/Page_Car Insurance - Get a Free Auto Insura_f9bdc8/input_Enter your 5 or 9 digit ZIP Code_Star_fb0231'))

WebUI.closeBrowser()

