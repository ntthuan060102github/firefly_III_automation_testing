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

WebUI.click(findTestObject('Object Repository/GUI_Create_New_Liability/TC_10.03/a_Demo'))

WebUI.click(findTestObject('Object Repository/GUI_Create_New_Liability/TC_10.03/button_Sign in'))

WebUI.click(findTestObject('Object Repository/GUI_Create_New_Liability/TC_10.03/span_demofirefly_fa fa-plus-circle'))

WebUI.click(findTestObject('Object Repository/GUI_Create_New_Liability/TC_10.03/h4_New liability'))

WebUI.selectOptionByValue(findTestObject('Object Repository/GUI_Create_New_Liability/TC_10.03/select_Chinese yuan ()Euro ()British Pound _e5e925'), 
    '1', true)

actual_currency = WebUI.getAttribute(findTestObject('Object Repository/GUI_Create_New_Liability/TC_10.03/select_Chinese yuan ()Euro ()British Pound _e5e925'), 
    'value', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(actual_currency, expected_currency)

WebUI.closeBrowser()

