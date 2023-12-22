package lakshmi

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testobject.RequestObject
//import com.kms.katalon.plugin.keyword.connection.DatabaseKeywords
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.keyword.BuiltinKeywords as Builtin
import com.kms.katalon.core.util.KeywordUtil
//import com.kms.katalon.plugin.keyword.connection.DatabaseKeywords as DatabaseKeywords
public class DBJsonFetcher {

	public def fetchBookByTitleAndAuthor(String title, String author) {
		String query = "SELECT title, author FROM lakshmimukkur WHERE title = ? AND author = ?"
		def connection = DatabaseKeywords.getGlobalConnection()
		def resultSet = DatabaseKeywords.executeQuery(connection, query, [title, author])

		if (resultSet.next()) {
			String dbTitle = resultSet.getString("title")
			String dbAuthor = resultSet.getString("author")
			return [title: dbTitle, author: dbAuthor]
		} else {
			return null
		}
	}
}



