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
import com.sun.org.apache.xalan.internal.xsltc.compiler.ContainsCall as ContainsCall
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

'Define Custom Path where file needs to be downloaded'
String downloadPath = 'C:/Users/rajat/Downloads/invoice_110.pdf'

'Launch a browser and Navigate to URL'
WebUI.openBrowser('https://www.phptravels.net/invoice?id=110&sessid=0875')

'Clicking on a Link text to download a file'
WebUI.click(findTestObject('Object Repository/account/Page_Invoice/a_Download PDF'))

'Navigate to URL'
WebUI.navigateToUrl('file:///C:/Users/rajat/Downloads/invoice_110.pdf')

'Wait for Some time so that file gets downloaded and Stored in user defined path'
WebUI.delay(10)

'Verifying the file is download in the User defined Path'
Assert.assertTrue(isFileDownloaded(downloadPath, Contains(text(),'invoice_11.pdf')))

'If the file is found then it will return a value as true'
return flag = true;

'If the file is found then it will return a value as false'
return flag;

