package profiles

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ChromeProfiles {

	public void chrome_profile_login(String profile_path, String profileDirectory) {
		String pathToChromeDriver = DriverFactory.getChromeDriverPath()
		System.setProperty("webdriver.chrome.driver", pathToChromeDriver)
		ChromeOptions chromeProfile = new ChromeOptions();
		chromeProfile.addArguments("user-data-dir=" + profile_path);
		chromeProfile.addArguments("profile-directory=" + profileDirectory)
		WebDriver driver = new ChromeDriver(chromeProfile);
		driver.get(GlobalVariable.G_SiteURL);
		DriverFactory.changeWebDriver(driver)
		WebUI.maximizeWindow()
	}
}
