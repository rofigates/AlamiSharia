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

public class Verifikasi {

	// Proses Verify Tombol Verifikasi

	@Keyword
	def verifyButtonVerifikasi(Boolean btnVerifikasi) {
		if(btnVerifikasi) {
			WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/btn_lengkapiProfilmu'))
		}else {
			WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/btn_lengkapiData'))
		}
	}

	// Dropdown tipe Akun

	@Keyword
	def dropdown_tipeAkun(String tipeAkun) {
		switch(tipeAkun) {
			case 'Individual - WNI' :
				WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Tipe Akun/ddl_individualWNI'))
				break
			case 'Individual - WNA' :
				WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Tipe Akun/ddl_individualWNA'))
				break
			case 'Badan Hukum - WNI' :
				WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Tipe Akun/ddl_badanHukumWNI'))
				break
		}
	}

	// Radio Button Jenis Kelamin

	@Keyword
	def radioButton_JenisKelamin(String jk) {
		switch(jk) {
			case 'Laki-laki' :
				WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Data Pemberi Dana/rb_jkLakiLaki'))
				break
			case 'Perempuan' :
				WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Data Pemberi Dana/rb_jkPerempuan'))
				break
		}
	}

	// Dropdown Gelar

	@Keyword
	def dropdown_gelar(String gelar) {
		switch(gelar) {
			case 'Bpk' :
				WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Data Pemberi Dana/dd_bpk'))
				break
			case 'Ibu' :
				WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Data Pemberi Dana/dd_Ibu'))
				break
			case 'Sdr' :
				WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Data Pemberi Dana/dd_sdr'))
				break
			case 'Sdri' :
				WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Data Pemberi Dana/dd_sdri'))
				break
		}
	}
}
