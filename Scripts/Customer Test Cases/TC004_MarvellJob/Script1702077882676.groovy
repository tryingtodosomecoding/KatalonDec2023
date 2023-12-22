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

not_run: WebUI.setText(findTestObject('Object Repository/Applyforjob/Page_Marvell Careers/input_Search for Jobs_mm4z2'), 
    '')

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Marvell Careers/a_Senior Staff Systems Applications Enginee_9828fd'))

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Marvell Careers/a_Apply'))

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Marvell Careers/a_Apply Manually'))

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Marvell Careers - Workday/button_Create Account'))

WebUI.setText(findTestObject('Object Repository/Applyforjob/Page_Marvell Careers - Workday/input_Email Address_input-6'), 
    'myname1@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Applyforjob/Page_Marvell Careers - Workday/input_Password_input-7'), 
    'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Applyforjob/Page_Marvell Careers - Workday/input_Verify New Password_input-8'), 
    'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Marvell Careers - Workday/input_Read More_input-10'))

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Marvell Careers - Workday/div_Yes, I have read and consent to the ter_cf053d'))

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/button_select one'))

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/div_51Job'))

WebUI.setText(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/input_select one_css-77hcv'), 
    '65dea26481d001c51009f36f2c17fc1f')

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/button_United States of America'))

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/div_United States of America'))

WebUI.setText(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/input_select one_css-77hcv'), 
    'bc33aa3152ec42d4995f4791a106ed09')

WebUI.setText(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/input_First Name_input-3'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/input_Last Name_input-4'), 
    'User')

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/input_Last Name_input-5'))

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/input_First Name_input-15'))

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/input_Last Name_input-16'))

WebUI.setText(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/input_Address Line 1_input-6'), 
    '123 ')

WebUI.setText(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/input_City_input-7'), 
    'Dallas')

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/button_select one_1'))

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/div_Texas'))

WebUI.setText(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/input_select one_css-77hcv'), 
    'fc77e3a1ab36487f9646d14f7242dd77')

WebUI.setText(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/input_Postal Code_input-9'), 
    '08052')

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/button_select one_1_2'))

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/div_Home'))

WebUI.setText(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/input_select one_css-77hcv'), 
    '65dea26481d00154a7b6e24627177b0e')

WebUI.setText(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/input_Phone Number_input-13'), 
    '1234567890')

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/button_Save and Continue'))

WebUI.setText(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/input_Phone Number_input-13'), 
    '7209387777')

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/button_Save and Continue'))

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_f41f47/button_Save and Continue'))

WebUI.click(findTestObject('Object Repository/Applyforjob/Page_Senior Staff Systems Applications Engi_b3da00/div_Review'))

WebUI.closeBrowser()

