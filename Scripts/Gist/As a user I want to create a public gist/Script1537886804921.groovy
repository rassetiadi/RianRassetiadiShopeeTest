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

WebUI.comment('Open Gist URL')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.comment('Ensure that gist page is opened')

WebUI.verifyElementPresent(findTestObject('GistDiscover/After Login/Button-New gist'), 0)

WebUI.verifyElementPresent(findTestObject('GistDiscover/After Login/Button-Sign out'), 0)

WebUI.comment('Open new gist page')

WebUI.click(findTestObject('GistDiscover/After Login/Button-New gist'))

WebUI.verifyElementPresent(findTestObject('New Gist/TextField-Gist Description'), 0)

WebUI.verifyElementPresent(findTestObject('New Gist/TextField-Filename'), 0)

WebUI.verifyElementPresent(findTestObject('New Gist/TextArea-Content'), 0)

WebUI.verifyElementPresent(findTestObject('New Gist/Button-AddFile'), 0)

WebUI.verifyElementPresent(findTestObject('New Gist/Button-Create public gist'), 0)

WebUI.comment('Input Gist description, filename and content')

WebUI.setText(findTestObject('New Gist/TextField-Gist Description'), description)

WebUI.setText(findTestObject('New Gist/TextField-Filename'), filename)

WebUI.click(findTestObject('New Gist/TextArea-Content'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('New Gist/TextArea-Content'), content, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('New Gist/Button-Create public gist'))

WebUI.comment('Verify that input data and result must be the same')

desc = WebUI.getText(findTestObject('Gist/Message-Description'))

file = WebUI.getText(findTestObject('Gist/Message-Filename'))

WebUI.verifyEqual(desc, description)

WebUI.verifyEqual(file, filename)

WebUI.verifyTextPresent(content, false)

GlobalVariable.fileName = filename

