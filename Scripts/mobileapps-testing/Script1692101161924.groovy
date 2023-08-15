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

Mobile.startApplication('/Users/lidya/Downloads/Wina/automation-katalon/ABSGLobal-AutomationAPI/Data Files/com.mpayror.www_2018-01-09.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - REGISTRATION'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - Referal Code'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText'), '123456', 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - First Name'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText (1)'), 'Dwinata', 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - Last Name'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText (2)'), 'Saragih', 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - Mobile No'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText (3)'), '085216522397', 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - Password'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText (4)'), 'Testing123456', 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - Confirm Password'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - 085216522397 (1)'), '1234567890', 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - SUBMIT (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - arrow back'), 0)

Mobile.closeApplication()

