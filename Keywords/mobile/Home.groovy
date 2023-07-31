package mobile

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

import global.BasePageObject

public class Home extends BasePageObject{
	private TestObject serviceMenu

	private TestObject verifyHourly
	private TestObject verifySubs
	private TestObject verifyAC

	public Home() {
		verifyHourly = createTestObjectByXpath("verifyHourly", "//android.widget.TextView[@resource-id = 'id.co.okhome.okhomeapp:id/txtTitle' and @text = 'Address & Contact']")
		verifySubs = createTestObjectByXpath("verifySubs", "//android.widget.TextView[@resource-id = 'id.co.okhome.okhomeapp:id/txtTitle' and @text = 'Subscription & Ticket']")
		verifyAC = createTestObjectByXpath("verifyAC", "//android.widget.TextView[@resource-id = 'id.co.okhome.okhomeapp:id/txtTitle' and @text = 'Air Conditioner Maintenance']")
	}

	public void ChooseService(dtChooseService) {
		serviceMenu = createTestObjectByXpath("serviceMenu", "//android.widget.TextView[@resource-id = 'id.co.okhome.okhomeapp:id/txtDescription' and @text = '${dtChooseService}']")

		Mobile.waitForElementPresent(serviceMenu, 5)
		Mobile.takeScreenshot()
		Mobile.tap(serviceMenu, 1)
		if (dtChooseService == 'Hourly Cleaning') {
			Mobile.waitForElementPresent(verifyHourly, 10)
			Mobile.takeScreenshot()
		} else if (dtChooseService == 'Cleaning Subscription') {
			Mobile.waitForElementPresent(verifySubs, 10)
			Mobile.takeScreenshot()
		} else if (dtChooseService == 'AC Maintenance') {
			Mobile.waitForElementPresent(verifyAC, 10)
			Mobile.takeScreenshot()
		}
	}
}
