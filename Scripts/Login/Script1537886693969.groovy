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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.verifyElementPresent(findTestObject('GistDiscover/Button-SignIn'), 0)

WebUI.click(findTestObject('GistDiscover/Button-SignIn'))

WebUI.verifyElementPresent(findTestObject('login Page/Message-Welcome'), 0)

WebUI.verifyElementPresent(findTestObject('login Page/TextField-Username'), 0)

WebUI.verifyElementPresent(findTestObject('login Page/TextField-Password'), 0)

WebUI.verifyElementPresent(findTestObject('login Page/Button-Sign in'), 0)

WebUI.setText(findTestObject('login Page/TextField-Username'), username)

WebUI.setText(findTestObject('login Page/TextField-Password'), pasword)

WebUI.click(findTestObject('login Page/Button-Sign in'))

WebUI.verifyElementPresent(findTestObject('GistDiscover/After Login/Button-New gist'), 0)

WebUI.verifyElementPresent(findTestObject('GistDiscover/After Login/Button-Sign out'), 0)

