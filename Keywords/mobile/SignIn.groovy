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

public class SignIn extends BasePageObject{
	private TestObject btnSignInHome
	private TestObject setUsername
	private TestObject setPassword
	private TestObject btnSignIn
	private TestObject verifySuccessLogin

	public SignIn() {
		btnSignInHome = createTestObjectByXpath("btnSignInHome", "//android.widget.Button[@resource-id = 'id.co.okhome.okhomeapp:id/btnSignIn']")
		setUsername = createTestObjectByXpath("setUsername", "//android.widget.EditText[@resource-id = 'id.co.okhome.okhomeapp:id/textInputEditText' and @text = 'Ex. jhon@mail.com']")
		setPassword = createTestObjectByXpath("setPassword", "//android.widget.EditText[@resource-id = 'id.co.okhome.okhomeapp:id/textInputEditText' and @text = '*****']")
		btnSignIn = createTestObjectByXpath("btnSignIn", "//android.widget.Button[@resource-id = 'id.co.okhome.okhomeapp:id/btnSignUp']")
		verifySuccessLogin = createTestObjectByXpath("verifySuccessLogin", "//android.widget.TextView[@resource-id = 'id.co.okhome.okhomeapp:id/navigation_bar_item_large_label_view' and @text = 'Home']")
	}

	public void TapBtnSignInHome() {
		Mobile.waitForElementPresent(btnSignInHome, 10)
		Mobile.takeScreenshot()
		Mobile.tap(btnSignInHome, 1)
		Mobile.waitForElementPresent(setUsername, 10)
		Mobile.takeScreenshot()
	}

	public void SetTextUsername(dtUsername) {
		Mobile.waitForElementPresent(setUsername, 5)
		Mobile.takeScreenshot()
		Mobile.setText(setUsername, dtUsername, 1)
		Mobile.takeScreenshot()
	}

	public void SetTextPassword(dtPassword) {
		Mobile.waitForElementPresent(setPassword, 5)
		Mobile.takeScreenshot()
		Mobile.setText(setPassword, dtPassword, 1)
		Mobile.takeScreenshot()
	}

	public void TapBtnSignIn() {
		Mobile.waitForElementPresent(btnSignIn, 5)
		Mobile.takeScreenshot()
		Mobile.tap(btnSignIn, 1)
		Mobile.waitForElementPresent(verifySuccessLogin, 10)
		Mobile.takeScreenshot()
	}
}
