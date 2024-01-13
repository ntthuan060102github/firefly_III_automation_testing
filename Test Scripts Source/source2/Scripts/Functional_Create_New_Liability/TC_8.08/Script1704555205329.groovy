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

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.08/a_Demo'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.08/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.08/span_demofirefly_fa fa-plus-circle'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.08/h4_New liability'))

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.08/input_Name_name'), 'Chevatero Maidio36')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.08/input_Start date of debt_opening_balance_date'), 
    '8/25/2023')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.08/input_Interest_interest'), '16')

WebUI.verifyElementText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.08/button_Store new liability'), 
    'Store new liability')

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.08/button_Store new liability'))

WebUI.closeBrowser()

