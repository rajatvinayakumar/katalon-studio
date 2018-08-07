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
import org.apache.pdfbox.pdmodel.PDDocument as PDDocument
import org.apache.pdfbox.text.PDFTextStripper as PDFTextStripper
import java.io.File as File
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

PDDocument doc = new PDDocument().load(new File('C:/Users/rajat/Downloads/invoice_110.pdf'))

PDFTextStripper stripper = new PDFTextStripper()

String pdfFileInText = stripper.getText(doc)

int index = pdfFileInText.indexOf('Rendezvous Hotels')

doc.close()

KeywordLogger logger = new Keywordlogger()

if (index > 0) {
    logger.logPassed('Found the word')
} else {
    logger.logFailed('Did not find the word')
}

WebUI.openBrowser('http://www.google.in')

