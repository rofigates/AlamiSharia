package main
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Registrasi {

	// This is For Check Radio Button Jenis Akun
	@Keyword
	def RB_JenisAkun(String jenisAkun) {
		switch(jenisAkun){
			case 'Individual':
				WebUI.click(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 1/rb_individual'))
				break
			case 'Institusi':
				WebUI.click(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 1/rb_institusi'))
				break
		}
	}

	@Keyword
	def CB_BagaimanaKamuTahuAlami(String bagaimanaKamuTahuAlami, String lainnyaValue) {
		if(bagaimanaKamuTahuAlami.equals('Lainnya')) {
			WebUI.setText(findTestObject('Object Repository/Registrasi Pemberi Dana/Step 1/txt_lainnya'), lainnyaValue, FailureHandling.OPTIONAL)
		}
	}
}
