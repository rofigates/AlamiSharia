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

// -------- Guideline ----------

// 1. change value in local variable to test in Test Case and change Test Data Driven Excel to Test in Test Suites

// ------------ Variable -------------

def verifyLogin, lblVerifyLogin

lblVerifyLogin = 'Email atau kata sandi kamu salah'

// ------------ Script -------------

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url,FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

// Login Step

WebUI.setText(findTestObject('Object Repository/Login/txt_email'), email, FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/Login/txt_password'), password, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Login/btn_MasukKeAkunSaya'), FailureHandling.STOP_ON_FAILURE)

verifyLogin = WebUI.verifyElementText(findTestObject('Object Repository/Login/lbl_verifyLogin'), lblVerifyLogin, FailureHandling.OPTIONAL)

CustomKeywords.'common.Utils.CheckFailed'('Login', verifyLogin)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/btn_lengkapiProfilmu'))

WebUI.click(findTestObject('Object Repository/Login/btn_tab'))

WebUI.click(findTestObject('Object Repository/Login/btn_logout'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)