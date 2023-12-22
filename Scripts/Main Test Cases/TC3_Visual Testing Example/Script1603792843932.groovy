import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

/**
 * This is an example of how to use Visual Testing. See tutorial at 
 * https://forum.katalon.com/t/update-with-katalon-studio-7-7-early-release-of-katalon-testops-visual-testing-image-comparison/45557.
 */
WebUI.comment('Story: Book an appointment')

WebUI.comment('Given that the user has logged into their account')

WebUI.openBrowser(GlobalVariable.G_SiteURL)

'This for visual test and you use Take Screenshot as a checkpoint'
WebUI.takeScreenshotAsCheckpoint('login page lakshmiVT')

WebUI.callTestCase(findTestCase('Common Test Cases/Login'), [('Username') : 'John Doe', ('Password') : 'ThisIsNotAPassword'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('And Appointment page is displayed')
/*
 *  This code calls a test case named 'Login' from the 'Common Test Cases' folder.
 *  It passes two parameters, 'Username' and 'Password', with their respective values.
 *  The failure handling is set to 'STOP_ON_FAILURE', which means that if any step in the test case fails, the execution will stop.
 *
 *  1. The test case 'Login' is called with the provided parameters.
 *  2. The comment 'And Appointment page is displayed' is added.
 *
 */

if (true) {
    WebUI.takeScreenshotAsCheckpoint('appointment page')

    WebUI.selectOptionByLabel(findTestObject('Page_CuraAppointment/lst_Facility'), 'Hongkong CURA Healthcare Center', false)

    WebUI.check(findTestObject('Page_CuraAppointment/chk_Medicaid'))

    WebUI.check(findTestObject('Page_CuraAppointment/chk_Readmission'))

    WebUI.setText(findTestObject('Page_CuraAppointment/txt_VisitDate'), '27/12/2016')

    WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible.')
}

WebUI.comment('When he fills in valid information in Appointment page')

WebUI.click(findTestObject('Page_CuraAppointment/btn_BookAppointment'))

WebUI.verifyTextPresent('Appointment Confirmation', false)

WebUI.comment('Then he should be able to book a new appointment')

if (true) {
    WebUI.takeFullPageScreenshotAsCheckpoint('booked appointment', [findTestObject('Page_AppointmentConfirmation/lbl_VisitDate')])

    WebUI.verifyMatch('Hongkong CURA Healthcare Center', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_Facility')), 
        false)

/*
 *  This code is for testing the functionality of booking an appointment on a healthcare website.
 *
 *  1. The user fills in valid information in the Appointment page.
 *  2. The user clicks on the "Book Appointment" button.
 *  3. The code verifies that the text "Appointment Confirmation" is not present on the page.
 *  4. The code comments that the user should be able to book a new appointment.
 *  5. If the condition is true, the code takes a full page screenshot as a checkpoint with the name "booked appointment" and verifies that the text "Hongkong CURA Healthcare Center" matches the text obtained from a specific element on the page.
 *  6. The code verifies that the text "Hongkong CURA Healthcare Center" does not match the text obtained from a specific element on the page.
 */
    WebUI.verifyMatch('Yes', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_HospitalReadmission')), false)

    WebUI.verifyMatch('Medicaid', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_Program')), false)

    WebUI.verifyMatch('27/12/2016', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_VisitDate')), false)

    WebUI.verifyMatch('Please make appointment as soon as possible.', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_Comment')), 
        false)
}

WebUI.takeScreenshot()

WebUI.closeBrowser()

WebUI.acceptAlert()

