import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.firefly-iii.org/')

WebUI.click(findTestObject('Object Repository/GUI_Create_New_Bill/TC_9.14/a_Demo'))

WebUI.click(findTestObject('Object Repository/GUI_Create_New_Bill/TC_9.14/button_Sign in'))

WebUI.click(findTestObject('Object Repository/GUI_Create_New_Bill/TC_9.14/span_demofirefly_fa fa-plus-circle'))

WebUI.click(findTestObject('Object Repository/GUI_Create_New_Bill/TC_9.14/h4_New bill'))

WebUI.click(findTestObject('Object Repository/GUI_Create_New_Bill/TC_9.14/input_After storing, return here to create _4fc2e2'))

actual_return_here = WebUI.getAttribute(findTestObject('Object Repository/GUI_Create_New_Bill/TC_9.14/input_After storing, return here to create _4fc2e2'), 
    'value')

WebUI.verifyEqual(actual_return_here, expected_return_here)

WebUI.closeBrowser()

