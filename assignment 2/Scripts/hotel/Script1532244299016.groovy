import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.phptravels.net/login')

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Login/input_username'), 'user@phptravels.com')

WebUI.setText(findTestObject('Page_Login/input_password'), 'demouser')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_My Account/a_Hotels'))

WebUI.navigateToUrl('https://www.phptravels.net/hotels', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Search Results/i_star text-warning fa fa-star'), 20)

WebUI.click(findTestObject('Page_Search Results/i_star text-warning fa fa-star'))

WebUI.click(findTestObject('Page_Search Results/label_Hotel'))

WebUI.click(findTestObject('Page_Search Results/button_Search'))

WebUI.waitForPageLoad(10)

WebUI.verifyElementPresent(findTestObject('Page_Search Results/i_star text-warning fa fa-star'), 10)

WebUI.callTestCase(findTestCase('account page'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

