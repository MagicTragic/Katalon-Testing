import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://novareteam.outsystemscloud.com/PartnerPortal/Registration_Login.aspx')

WebUI.setText(findTestObject('Homepage - Client/Page_Registration Login/Input_Login_Username'), 'Client')

WebUI.setEncryptedText(findTestObject('Homepage - Client/Page_Registration Login/Input_Login_Password'), '1cjy193v/5g=')

WebUI.click(findTestObject('Homepage - Client/Page_Registration Login/Button_Login'))

WebUI.click(findTestObject('Homepage - Client/Page_HomePage_Client/ClientComposeEmail/Button_ComposeEmail'))

WebUI.doubleClick(findTestObject('Homepage - Client/Page_HomePage_Client/ClientComposeEmail/Input_Recipient'))

WebUI.setText(findTestObject('Homepage - Client/Page_HomePage_Client/ClientComposeEmail/Input_Recipient'), 'RichardRepolona@NP.com', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Homepage - Client/Page_HomePage_Client/ClientComposeEmail/Input_Subject'), 'Create Read Katalon Data')

WebUI.setText(findTestObject('Homepage - Client/Page_HomePage_Client/ClientComposeEmail/Input_Body'), 'Testing Email Body for Katalon (Create Read)')

WebUI.click(findTestObject('Homepage - Client/Page_HomePage_Client/ClientComposeEmail/Button_SendEmail'))

WebUI.refresh()

