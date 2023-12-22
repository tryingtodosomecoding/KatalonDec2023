import com.katalon.KatalonHelper
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.context.TestSuiteContext

class TestListener {
	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite. - testSuiteContext is the actual interceptor.
	 * Before and After Test Case and Test Suites
	 * Eg. you can do the new initiation of driver, test cleanup, data retrieval 
	 */
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		/*testSuiteContext - Test suite status and test suite id same with test case - from what is running*/
		KatalonHelper.updateInfo()
	}
}