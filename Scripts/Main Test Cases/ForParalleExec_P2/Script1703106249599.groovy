import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.seleniumhq.jetty9.server.Authentication.User as User
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import profiles.ChromeProfiles as ChromeProfiles

WebUI.comment('Story: Login to CURA system')

WebUI.comment('Given that the user has the valid login information')

//WebUI.openBrowser(GlobalVariable.G_SiteURL)
ChromeProfiles profile = new ChromeProfiles()

profile.chrome_profile_login(userdatadirectory,profiledirectory )

WebUI.click(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))

WebUI.setText(findTestObject('Page_Login/txt_UserName'), 'John Doe')

WebUI.setText(findTestObject('Page_Login/txt_Password'), Pass)

WebUI.comment('When he logins to CURA system')

WebUI.click(findTestObject('Page_Login/btn_Login'))

WebUI.comment('Then he should be able to login successfully')

landingPage = WebUI.verifyElementPresent(findTestObject('Page_CuraAppointment/div_Appointment'), 5)

WebUI.delay(5)

WebUI.closeBrowser()

