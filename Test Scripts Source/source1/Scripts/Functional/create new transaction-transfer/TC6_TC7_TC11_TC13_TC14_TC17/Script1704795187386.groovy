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

WebUI.openBrowser('https://demo.firefly-iii.org/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/login/button_login'))

WebUI.click(findTestObject('Object Repository/sidebar/button_sidebar'))

WebUI.click(findTestObject('sidebar/sidebar_item_new_transfer'))

WebUI.setText(findTestObject('create_new_with_drawal/input_description'), description)

WebUI.setText(findTestObject('create_new_transfer/input_account_source'), source_account)

WebUI.sendKeys(findTestObject('create_new_transfer/input_account_source'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('create_new_transfer/input_amount'), ammount)

WebUI.setText(findTestObject('create_new_transfer/input_account_destination'), destination_account)

WebUI.sendKeys(findTestObject('create_new_transfer/input_account_destination'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('create_new_transfer/input_amount_foreign_amount'), foreign_account)

WebUI.click(findTestObject('create_new_transfer/button_Submit'))

WebUI.verifyTextPresent(expected_message, true)

WebUI.closeBrowser()

