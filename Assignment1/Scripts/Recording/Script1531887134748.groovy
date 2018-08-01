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

WebUI.navigateToUrl('https://www.phptravels.net/admin')

WebUI.setText(findTestObject('login and dashboard/Page_Administator Login/input_email'), 'admin@phptravels.com')

WebUI.setText(findTestObject('login and dashboard/Page_Administator Login/input_password'), 'demoadmin')

WebUI.click(findTestObject('login and dashboard/Page_Administator Login/span_Login'))

WebUI.click(findTestObject('login and dashboard/Page_Dashboard/a_Hotels'))

WebUI.click(findTestObject('login and dashboard/Page_Dashboard/a_Hotels_1'))

WebUI.click(findTestObject('login and dashboard/Page_Hotels Management/button_Add'))

WebUI.setText(findTestObject('hotel data/Page_Add Hotel/input_hotelname'), 'rajat vinayakumar')

WebUI.switchToFrame(findTestObject('sample/Page_Add Hotel/iframe_cke_wysiwyg_frame cke_r'), 30)

WebUI.setText(findTestObject('sample/Page_Add Hotel/p'), 'hai')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('New Folder 4/Page_Add Hotel/b'))

WebUI.setText(findTestObject('New Folder 4/Page_Add Hotel/input_select2-input select2-fo'), 'Bea')

WebUI.waitForElementPresent(findTestObject('New Folder 4/Page_Add Hotel/div_New Delhi India'), 10)

WebUI.click(findTestObject('New Folder 4/Page_Add Hotel/div_New Delhi India'))

WebUI.selectOptionByValue(findTestObject('hotel details 3/Page_Add Hotel/select_1'), '4', true)

WebUI.selectOptionByValue(findTestObject('hotel details 3/Page_Add Hotel/select_Apartment'), '102', true)

WebUI.selectOptionByValue(findTestObject('hotel details 3/Page_Add Hotel/select_Fixed                Pe'), 'percentage', 
    true)

WebUI.callTestCase(findTestCase('facilities'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Meta facility'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('policy'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('hotel details 3/Page_Add Hotel/button_Submit'))

WebUI.verifyElementPresent(findTestObject('verification'), 5)

WebUI.closeBrowser()

