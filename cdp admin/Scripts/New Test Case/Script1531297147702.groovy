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

WebUI.navigateToUrl('http://10.10.0.122:7000/admin/login/?next=/admin/')

WebUI.setText(findTestObject('Page_Log in  Beagle Admin/input_username'), 'admin')

WebUI.setText(findTestObject('Page_Log in  Beagle Admin/input_password'), 'admin')

WebUI.click(findTestObject('Page_Log in  Beagle Admin/input'))

WebUI.click(findTestObject('Page_Admin Dashboard  Beagle Admin/a_Organizations'))

WebUI.click(findTestObject('Page_Select organization to change/a_Add organization'))

WebUI.setText(findTestObject('Page_Add organization  Beagle Admin/input_name'), 'Barca')

WebUI.setText(findTestObject('Page_Add organization  Beagle Admin/textarea_address'), 'spain')

WebUI.setText(findTestObject('Page_Add organization  Beagle Admin/input_email'), 'bara@gmail.com')

WebUI.setText(findTestObject('Page_Add organization  Beagle Admin/input_phone'), '9745678923')

WebUI.click(findTestObject('Page_Add organization  Beagle Admin/input__save'))

WebUI.click(findTestObject('Page_Select organization to change/a_Home'))

WebUI.click(findTestObject('Page_Admin Dashboard  Beagle Admin/a_Organization users'))

WebUI.click(findTestObject('Page_Select organization user to ch/a_Add organization user'))

WebUI.setText(findTestObject('Page_Add organization user  Beagle/input_username'), 'renju')

WebUI.setText(findTestObject('Page_Add organization user  Beagle/input_email'), 'renju@inapp.com')

WebUI.click(findTestObject('Page_Add organization user  Beagle/a_Organization Info'))

WebUI.click(findTestObject('Page_Add organization user  Beagle/li_barcelona'))

WebUI.click(findTestObject('Page_Add organization user  Beagle/input__save'))

WebUI.click(findTestObject('Page_Select organization user to ch/a_Home'))

WebUI.click(findTestObject('Page_Admin Dashboard  Beagle Admin/a_Products'))

WebUI.click(findTestObject('Page_Select Product to change  Beag/a_Add Product'))

WebUI.setText(findTestObject('Page_Add Product  Beagle Admin/input_name'), '3p')

WebUI.click(findTestObject('Page_Add Product  Beagle Admin/li_Printer'))

WebUI.setText(findTestObject('Page_Add Product  Beagle Admin/input_count'), '2')

WebUI.click(findTestObject('Page_Add Product  Beagle Admin/input__save'))

WebUI.click(findTestObject('Page_Select Product to change  Beag/a_Home'))

WebUI.click(findTestObject('Page_Admin Dashboard  Beagle Admin/a_Plans'))

WebUI.click(findTestObject('Page_Select Plan to change  Beagle/a_Add Plan'))

WebUI.setText(findTestObject('Page_Add Plan  Beagle Admin/input_name'), '3 user 2 print')

WebUI.click(findTestObject('Page_Add Plan  Beagle Admin/ul_select2-selection__rendered'))

WebUI.click(findTestObject('Page_Add Plan  Beagle Admin/li_3p'))

WebUI.setText(findTestObject('Page_Add Plan  Beagle Admin/input_price'), '0.02')

WebUI.doubleClick(findTestObject('Page_Add Plan  Beagle Admin/input_price'))

WebUI.setText(findTestObject('Page_Add Plan  Beagle Admin/input_price'), '1000')

WebUI.click(findTestObject('Page_Add Plan  Beagle Admin/input__save'))

WebUI.click(findTestObject('Page_Select Plan to change  Beagle/a_Home'))

WebUI.click(findTestObject('Page_Admin Dashboard  Beagle Admin/a_Subscriptions'))

WebUI.click(findTestObject('Page_Select Subscription to change/a_Add Subscription'))

WebUI.click(findTestObject('Page_Add Subscription  Beagle Admin/li_barcelona'))

WebUI.click(findTestObject('Page_Add Subscription  Beagle Admin/li_renju'))

WebUI.click(findTestObject('Page_Add Subscription  Beagle Admin/li_3 user 2 print'))

WebUI.click(findTestObject('Page_Add Subscription  Beagle Admin/li_Days'))

WebUI.setText(findTestObject('Page_Add Subscription  Beagle Admin/input_recurrence_period'), '1')

WebUI.click(findTestObject('Page_Add Subscription  Beagle Admin/span_icon-calendar'))

WebUI.click(findTestObject('Page_Add Subscription  Beagle Admin/a_6'))

WebUI.click(findTestObject('Page_Add Subscription  Beagle Admin/input__save'))

WebUI.click(findTestObject('Page_Select Subscription to change/span_jq-dropdown-caret'))

WebUI.click(findTestObject('Page_Select Subscription to change/a_Download License'))

WebUI.closeBrowser()

