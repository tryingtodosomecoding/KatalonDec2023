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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.interactions.Actions as Actions

WebUI.openBrowser('')

WebUI.enableSmartWait()

WebUI.navigateToUrl('https://www.basspro.com/shop/en#')

WebUI.disableSmartWait()

WebUI.waitForElementClickable(findTestObject('BpShops_TC01/Page_The Best in Fishing, Hunting and Boati_8193e2/area_Shopping Cart Display Updated_SSCACloseBtn'), 
    10)

WebUI.click(findTestObject('BpShops_TC01/Page_The Best in Fishing, Hunting and Boati_8193e2/area_Shopping Cart Display Updated_SSCACloseBtn'))

WebUI.waitForElementClickable(findTestObject('BpShops_TC01/Page_The Best in Fishing, Hunting and Boati_8193e2/homePageBanner_ShopNow'), 
    5)

WebUI.click(findTestObject('Object Repository/BpShops_TC01/Page_The Best in Fishing, Hunting and Boati_8193e2/homePageBanner_ShopNow'))

WebUI.click(findTestObject('Object Repository/BpShops_TC01/Page_Great Outdoor Days Sale  Bass Pro Shops/cookieDisclousreButton'))

WebUI.click(findTestObject('Object Repository/BpShops_TC01/Page_Great Outdoor Days Sale  Bass Pro Shops/p_Shop Now'))

WebUI.click(findTestObject('Object Repository/BpShops_TC01/Page_Guns Pistols, Rifles, Shotguns  More  _20aae6/Gun_img'))

WebUI.click(findTestObject('Object Repository/BpShops_TC01/Page_Used Guns  Bass Pro Shops/div_Benelli  Nova  12GA'))

WebUI.verifyElementText(findTestObject('Object Repository/BpShops_TC01/Page_Benelli  Nova  12GA  Bass Pro Shops/div_Shiny bore, smooth pump and a 3.5 chamb_8880e4'), 
    'Shiny bore, smooth pump and a 3.5\'\' chamber make this Benelli nova, a great choice for hunting.')

WebUI.click(findTestObject('Object Repository/BpShops_TC01/Page_Benelli  Nova  12GA  Bass Pro Shops/a_Get More Info'))

WebUI.closeBrowser()

