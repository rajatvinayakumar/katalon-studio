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

not_run: WebUI.openBrowser('')

WebUI.waitForElementPresent(findTestObject('facilities -label/Page_Add Hotel/label_Airport Transport'), 2)

WebUI.click(findTestObject('facilities -label/Page_Add Hotel (1)/a_Facilities'))

WebUI.click(findTestObject('facilities -label/Page_Add Hotel/label_Airport Transport'))

WebUI.waitForElementPresent(findTestObject('facilities -label/Page_Add Hotel/label_Business Center'), 2)

WebUI.click(findTestObject('facilities -label/Page_Add Hotel/label_Business Center'))

WebUI.waitForElementPresent(findTestObject('facilities -label/Page_Add Hotel/label_Laundry Service'), 2)

WebUI.click(findTestObject('facilities -label/Page_Add Hotel/label_Laundry Service'))

WebUI.waitForElementPresent(findTestObject('facilities -label/Page_Add Hotel/label_Bar Lounge'), 2)

WebUI.click(findTestObject('facilities -label/Page_Add Hotel/label_Bar Lounge'))

WebUI.waitForElementPresent(findTestObject('facilities -label/Page_Add Hotel/label_Air Conditioner'), 2)

WebUI.click(findTestObject('facilities -label/Page_Add Hotel/label_Air Conditioner'))

WebUI.waitForElementPresent(findTestObject('facilities -label/Page_Add Hotel/label_Elevator'), 2)

WebUI.click(findTestObject('facilities -label/Page_Add Hotel/label_Elevator'))

WebUI.waitForElementPresent(findTestObject('facilities -label/Page_Add Hotel/label_Swimming Pool'), 2)

WebUI.click(findTestObject('facilities -label/Page_Add Hotel/label_Swimming Pool'))

WebUI.waitForElementPresent(findTestObject('facilities -label/Page_Add Hotel/label_Fitness Center'), 2)

WebUI.click(findTestObject('facilities -label/Page_Add Hotel/label_Fitness Center'))

WebUI.waitForElementPresent(findTestObject('facilities -label/Page_Add Hotel/label_Restaurant'), 2)

WebUI.click(findTestObject('facilities -label/Page_Add Hotel/label_Restaurant'))

WebUI.waitForElementPresent(findTestObject('facilities -label/Page_Add Hotel/label_Disabled Facilities'), 2)

WebUI.click(findTestObject('facilities -label/Page_Add Hotel/label_Disabled Facilities'))

WebUI.waitForElementPresent(findTestObject('facilities -label/Page_Add Hotel/label_Children Activites'), 2)

WebUI.click(findTestObject('facilities -label/Page_Add Hotel/label_Children Activites'))

WebUI.waitForElementPresent(findTestObject('facilities -label/Page_Add Hotel/label_Pets Allowed'), 2)

WebUI.click(findTestObject('facilities -label/Page_Add Hotel/label_Pets Allowed'))

WebUI.waitForElementPresent(findTestObject('facilities -label/Page_Add Hotel/label_SPA'), 2)

WebUI.click(findTestObject('facilities -label/Page_Add Hotel/label_SPA'))

not_run: WebUI.click(findTestObject('facilities -label/Page_Add Hotel (1)/button_Submit'))

not_run: WebUI.closeBrowser()

