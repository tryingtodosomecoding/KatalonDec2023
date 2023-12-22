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

'Step 1 : Extract Data from the request 1'
response = WS.sendRequest(findTestObject('ETL Testing/ExtractData'))

firstName = WS.getElementPropertyValue(response, 'data[0].first_name')

lastName = WS.getElementPropertyValue(response, 'data[0].last_name')

'Step 2: Transform Data'
String fullName = (firstName + ' ') + lastName

'Step 3 : Load Data from Request 2'
response2 = WS.sendRequest(findTestObject('ETL Testing/Load Data Book', [('fullName') : fullName]))

WS.verifyElementPropertyValue(response2, 'message', 'Book added successfully!')

'Step 4 : Verify data'
response3 = WS.sendRequest(findTestObject('ETL Testing/GET Books ETL'))

authorCount = WS.getElementsCount(response3, 'author')

println(authorCount)

for (int i = 0; i < authorCount; i++) 
	{
	String author = WS.getElementPropertyValue(response3, ('[' + i) + '].author')
   if(author.equalsIgnoreCase(fullName))
	{
		println(author)
	}
}



