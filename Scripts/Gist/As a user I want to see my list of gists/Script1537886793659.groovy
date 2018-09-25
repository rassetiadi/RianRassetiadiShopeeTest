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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.comment('Open Gist URL')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.verifyElementPresent(findTestObject('GistDiscover/After Login/Button-New gist'), 0)

WebUI.verifyElementPresent(findTestObject('GistDiscover/After Login/Button-Sign out'), 0)

WebUI.click(findTestObject('GistDiscover/After Login/Button-Menu'))

WebUI.click(findTestObject('GistDiscover/After Login/Button-YourGist'))

WebUI.comment('Ensure latest gist is exist')

TestObject myGistTitle = new TestObject()

myGistTitle.addProperty('xpath', ConditionType.EQUALS, ('//strong[contains(.,"' + GlobalVariable.fileName) + '")]')

WebUI.verifyElementPresent(myGistTitle, 0)

