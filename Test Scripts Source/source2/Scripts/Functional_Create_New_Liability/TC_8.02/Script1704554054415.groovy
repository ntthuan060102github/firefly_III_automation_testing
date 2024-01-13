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

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/a_Demo'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/span_demofirefly_fa fa-plus-circle'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/h4_New liability'))

WebUI.verifyElementText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/small_Create a new liability'), 
    'Create a new liability')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/input_Name_name'), 'Cadillaces Coola5')

WebUI.selectOptionByValue(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/select_Dansk krone (kr.)Euro ()British Poun_149727'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/select_Dansk krone (kr.)Euro ()British Poun_149727'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/select_DebtLoanMortgage'), 
    '12', true)

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/input_I owe amount_opening_balance'), 
    '2')

WebUI.selectOptionByValue(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/select_I owe this debt to somebody elseI am_93cb18'), 
    'debit', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/select_I owe this debt to somebody elseI am_93cb18'), 
    'credit', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/select_I owe this debt to somebody elseI am_93cb18'), 
    'debit', true)

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/input_Start date of debt_opening_balance_date'), 
    '02/25/2023')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/input_Interest_interest'), '91')

WebUI.selectOptionByValue(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/select_Per dayPer monthPer year'), 
    'daily', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/select_Per dayPer monthPer year'), 
    'yearly', true)

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/button_Store new liability'))

WebUI.verifyElementText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.02/strong_Success'), 'Success!')

WebUI.closeBrowser()

