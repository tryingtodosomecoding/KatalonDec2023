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

WebUI.navigateToUrl('https://marvell.wd2.myworkdayjobs-impl.com/MarvellCareers')

not_run: WebUI.setText(findTestObject('Object Repository/Marvell/Page_Marvell Careers/input_Search for Jobs_ac7r2'), '')

WebUI.click(findTestObject('Object Repository/Marvell/Page_Marvell Careers/a_Senior Staff Systems Applications Enginee_9828fd'))

WebUI.click(findTestObject('Object Repository/Marvell/Page_Marvell Careers/a_Apply'))

WebUI.click(findTestObject('Object Repository/Marvell/Page_Marvell Careers/a_Apply Manually'))

WebUI.setText(findTestObject('Object Repository/Marvell/Page_Marvell Careers - Workday/input_Email Address_input-4'), 'sampleone@yopmail.com')

WebUI.closeBrowser()

