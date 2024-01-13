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

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/a_Demo'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/span_demofirefly_fa fa-plus-circle'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/h4_New liability'))

WebUI.verifyElementText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/small_Create a new liability'), 
    'Create a new liability')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/input_Name_name'), 'Forder Timnano6')

WebUI.selectOptionByValue(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/select_Dansk krone (kr.)Euro ()British Poun_149727'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/select_DebtLoanMortgage'), 
    '9', true)

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/input_I owe amount_opening_balance'), 
    '17')

WebUI.selectOptionByValue(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/select_I owe this debt to somebody elseI am_93cb18'), 
    'credit', true)

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/input_Start date of debt_opening_balance_date'), 
    '10/27/2023')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/input_Interest_interest'), '17')

WebUI.selectOptionByValue(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/select_Per dayPer monthPer year'), 
    'daily', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/select_Per dayPer monthPer year'), 
    'monthly', true)

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/input_IBAN_iban'), '14312920')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/input_BIC_BIC'), '401541210')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/input_IBAN_iban'), '')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/input_BIC_BIC'), '')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/input_Account number_account_number'), 
    '598-395-5417')

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/input_Include in net worth_include_net_worth'))

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/input_Include in net worth_include_net_worth'))

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/textarea_Notes_notes'), 'European shelduck')

WebUI.setText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/input_Attachments_attachments'), 
    'D:\\db.sql')

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/input_After storing, return here to create _4fc2e2'))

WebUI.verifyElementText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/button_Store new liability'), 
    'Store new liability')

WebUI.click(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/button_Store new liability'))

WebUI.verifyElementText(findTestObject('Object Repository/Functional_Create_New_Liability/TC_8.01/strong_Success'), 'Success!')

WebUI.closeBrowser()

