import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.model.FailureHandling.STOP_ON_FAILURE
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

// 1. Please use different account email google to register
// 2. for email activation the process still manual
// 3. change value in local variable to test in Test Case and change Test Data Driven Excel to Test in Test Suites

// ------------ Variable -------------
 
def verifyRegistrasi

// ------------ Script -------------

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url,STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

// Register Step 1

WebUI.click(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 1/a_daftarDisini'))

WebUI.click(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 1/a_pemberiDana'))

WebUI.setText(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 1/txt_namaLengkap'), namaLengkap, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 1/txt_email'), email, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 1/txt_noHandphone'), noHandphone, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 1/txt_password'), password, FailureHandling.STOP_ON_FAILURE)

// Radio Button Jenis Akun (customKeywords)

CustomKeywords.'main.Registrasi.RB_JenisAkun'(jenisAkun)

WebUI.setText(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 1/txt_kodeReferral'), kodeReferral, FailureHandling.OPTIONAL)

// Condition if bagaimana kamu Tahu choose 'Lainnya' (customkeyword)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 1/ddl_bagaimanaKamuTahuAlami'), bagaimanaKamuTahuAlami, false, FailureHandling.OPTIONAL)

CustomKeywords.'main.Registrasi.CB_BagaimanaKamuTahuAlami'(bagaimanaKamuTahuAlami,lainnya)

// Take a Screenshoot Registrasi Step 1

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 1/btn_lanjut'), FailureHandling.STOP_ON_FAILURE)

// Register Step 2

WebUI.check(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 2/cb_updateInfoTerbaru'))

WebUI.scrollToElement(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 2/scroll_kontakDanMediaSosial'), GlobalVariable.time, FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 2/cb_sudahMembaca'))

// Take a Screenshoot Registrasi Step 2

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 2/btn_lanjutkan'), FailureHandling.STOP_ON_FAILURE)

// Check Condition Registration Proccess Step 2 Success or Not (customKeywords)

verifyRegistrasi = WebUI.verifyElementPresent(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 2/img_success'), GlobalVariable.time, FailureHandling.OPTIONAL)

CustomKeywords.'common.Utils.CheckSuccess'('Registrasi', verifyRegistrasi)

// delay for activation on email manual

WebUI.delay(10)

// ------ this is a script to get email content, but now it can't be used because gmail now when you want to access it requires more security and need setting to allow less secure apps access --------

//def emailContent = CustomKeywords.'com.testwithhari.katalon.plugins.Gmail.readLatestEMailBodyContent'('rofi@gmail.com', '*******', 'test')

//printf emailContent

// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)