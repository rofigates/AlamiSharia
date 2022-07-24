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
// 2. proses get tanggal lahir masih manual dikarenakan masih belum menemukan best solution untuk automationnya

// Untuk Tahap 2
// 1. Rubah dan sesuaikan filePath yang ada di globalvariable dengan direktory yang akan digunakan untuk upload gambar
// 2. pada data variable nama gambar cukup di tulis namanya saja
// 3. pada tahap ambil swa foto klik allow permission use camera secara manual untuk melanjutkan ke proses berikutnya

// ------------ Variable -------------

def verifyButtonVerifikasi

// ------------ Script -------------

// Proses Login

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url,FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

// Login Step

WebUI.setText(findTestObject('Object Repository/Login/txt_email'), email, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Login/txt_password'), password, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Login/btn_MasukKeAkunSaya'), FailureHandling.STOP_ON_FAILURE)

// ============== tahap 1 ===============

// Proses verifikasi (Custom Keyword)

//WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/btn_lengkapiProfilmu'))

// Tipe Akun Pemberi Dana

//WebUI.selectOptionByLabel(findTestObject('Object Repository/Verifikasi/Step 1/ddl_tipeAkun'), tipeAkun, false, FailureHandling.STOP_ON_FAILURE)

// ------- Data Pemberi Dana -------

//WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Data Pemberi Dana/dd_gelar'))

// get Gelar (Custom Keyword)

//CustomKeywords.'main.Verifikasi.dropdown_gelar'(gelar)
//
//WebUI.setText(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Data Pemberi Dana/txt_namaLengkap'), namaLengkap, FailureHandling.STOP_ON_FAILURE)
//
//CustomKeywords.'main.Verifikasi.radioButton_JenisKelamin'(jenisKelamin)
//
//WebUI.setText(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Data Pemberi Dana/txt_noHandphone'), noHandphone, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.selectOptionByLabel(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Data Pemberi Dana/ddl_tempatLahir'), tempatLahir, false, FailureHandling.STOP_ON_FAILURE)

// Notes : di saat Proses memilih tanggal lahir masih belum menemukan solusi untuk pilih otomatis, jadi untuk sementara masih menggunakan manual

//WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Data Pemberi Dana/txt_tanggalLahir'))
//
//WebUI.selectOptionByLabel(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Data Pemberi Dana/ddl_agama'), agama, false, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setText(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Data Pemberi Dana/txt_namaIbuKandung'), namaIbuKandung)
//
//WebUI.selectOptionByLabel(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Data Pemberi Dana/ddl_statusPenikahan'), statusPernikahan, false, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.selectOptionByLabel(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Data Pemberi Dana/ddl_pendidikanTerakhir'), pendidikanTerakhir, false, FailureHandling.STOP_ON_FAILURE)
//
//// ------- Alamat Pemberi Dana --------
//
//WebUI.setText(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Alamat Pemberi Dana/ta_alamat'), alamat)
//
//WebUI.setText(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Alamat Pemberi Dana/txt_rt'), rt, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setText(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Alamat Pemberi Dana/txt_rw'), rw, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.selectOptionByLabel(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Alamat Pemberi Dana/ddl_kabKota'), kabKota, false, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.selectOptionByLabel(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Alamat Pemberi Dana/ddl_kecamatan'), kecamatan, false, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.selectOptionByLabel(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Alamat Pemberi Dana/ddl_kelurahan'), kelurahan, false, FailureHandling.STOP_ON_FAILURE)
//
//// ------- Informasi Pekerjaan --------
//
//WebUI.selectOptionByLabel(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Informasi Pekerjaan/ddl_pekerjaan'), pekerjaan, false, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.selectOptionByLabel(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Informasi Pekerjaan/ddl_bidangPekerjaan'), bidangPekerjaan, false, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.selectOptionByLabel(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Informasi Pekerjaan/ddl_penghasilanPerbulan'), penghasilanBulanan, false, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.selectOptionByLabel(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Informasi Pekerjaan/ddl_sumberDana'), sumberDana, false, FailureHandling.STOP_ON_FAILURE)
//
//// ------- Informasi kontak Darurat
//
//WebUI.setText(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Informasi Kontak Darurat/txt_namaKontakDarurat'), namakontakDarurat, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setText(findTestObject('Object Repository/Verifikasi/Step 1/WNI/Informasi Kontak Darurat/txt_noHandphoneKontakDarurat'), noHandphoneKontakDarurat, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Verifikasi/Step 1/btn_lanjutkanKeTahap2'))

// ============== tahap 2 ===============

//WebUI.setText(findTestObject('Object Repository/Verifikasi/Step 2/txt_ktp'), nomorKTP, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.check(findTestObject('Object Repository/Verifikasi/Step 2/cb_ktpSeumurHidup'))
//
//WebUI.selectOptionByLabel(findTestObject('Object Repository/Verifikasi/Step 2/ddl_kotaPenerbitKTP'), kotaPenerbitKTP, false, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setText(findTestObject('Object Repository/Verifikasi/Step 2/txt_NPWP'), nomorNPWP, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.uploadFile(findTestObject('Object Repository/Verifikasi/Step 2/btn_uploadKTP'), GlobalVariable.filePath + uploadKTP + GlobalVariable.PNG_Format )
//
//WebUI.uploadFile(findTestObject('Object Repository/Verifikasi/Step 2/btn_uploadNPWP'), GlobalVariable.filePath + uploadNPWP + GlobalVariable.PNG_Format)
//
//WebUI.click(findTestObject('Object Repository/Verifikasi/Step 2/btn_swafoto'))
//
//// in swafoto click permission use foto to go to the next proccess
//
//WebUI.delay(GlobalVariable.time)
//
//WebUI.click(findTestObject('Object Repository/Verifikasi/Step 2/btn_ambilFoto'))

WebUI.click(findTestObject('Object Repository/Verifikasi/Step 2/btn_lanjutkanTahap3'))

// ============== tahap 3 ===============

WebUI.selectOptionByLabel(findTestObject('Object Repository/Verifikasi/Step 3/ddl_namaBank'), namaBank, false, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Verifikasi/Step 3/txt_nomorRekening'), nomorRekening, FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Object Repository/Verifikasi/Step 3/cb_potensiResiko'))

WebUI.click(findTestObject('Object Repository/Verifikasi/Step 3/alert_okPotensiResiko'))

WebUI.click(findTestObject('Object Repository/Verifikasi/Step 3/alert_sayaMengertiPotensiResiko'))

WebUI.click(findTestObject('Object Repository/Verifikasi/Step 3/cb_komitmenKeanggotaan'))

WebUI.click(findTestObject('Object Repository/Verifikasi/Step 3/alert_okKomitmenKeanggotaan'))

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('Object Repository/Verifikasi/Step 3/alert_sayaMengertiKomitmenKeanggotaan'))

WebUI.click(findTestObject('Object Repository/Verifikasi/Step 3/btn_daftar'))



WebUI.takeFullPageScreenshot()

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)
