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
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.nio.file.WatchService as WatchService
import java.time.LocalDateTime as LocalDateTime
import lakshmi.JsonExtractor as JsonExtractor

response = WS.sendRequest(findTestObject('API_Endpoints_Flask_BookStore/GET Books'))

authorname = WS.getElementPropertyValue(response, '[0].author')

//WS.verifyMatch(authorname, findTestData('DBTesting_BookStore').getValue('author', 1), false)

println(authorname)

id = WS.getElementPropertyValue(response, '[0].id')

//String.valueOf(id);
WS.verifyMatch(id.toString(), findTestData('DBTesting_BookStore').getValue('id', 1), false)

println(id)

title = WS.getElementPropertyValue(response, '[0].title')

WS.verifyMatch(title, findTestData('DBTesting_BookStore').getValue('title', 1), false)

println(title)

Con = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection'()

//CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection'(null, '', '', '', '', '')
rs = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(Con, 'select * from book where id =1;')

bookname = CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue'(rs, 1, 2)


assert (bookname.equals(title))

