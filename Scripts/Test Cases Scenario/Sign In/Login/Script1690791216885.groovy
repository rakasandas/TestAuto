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

import global.ExecutionController
import global.TestDataLoader

def testData = TestDataLoader.LoadTestData('Login','C:/Data Binding Katalon/TestAuto.xlsx')
def dataRow = ExecutionController.getTestCaseData(testData,"Row01")

//Start Application
Mobile.callTestCase(findTestCase('Test Cases Global/Start Application'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Tap Button Masuk Home
Mobile.callTestCase(findTestCase('Test Cases Details/SignIn/Button SignIn Home'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set Username
Mobile.callTestCase(findTestCase('Test Cases Details/SignIn/Set Text Username'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set Password
Mobile.callTestCase(findTestCase('Test Cases Details/SignIn/Set Text Password'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Tap Button Masuk
Mobile.callTestCase(findTestCase('Test Cases Details/SignIn/Button SignIn'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)



