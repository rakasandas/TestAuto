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

def testData = TestDataLoader.LoadTestData('Address','C:/Data Binding Katalon/TestAuto.xlsx')
def dataRow = ExecutionController.getTestCaseData(testData,"Row01")

//Start Application
Mobile.callTestCase(findTestCase('Test Cases Global/Start Application'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Choose Service
Mobile.callTestCase(findTestCase('Test Cases Global/Choose Service'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Txt Address
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Txt Address'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Img Add New
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Img Add New'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Btn Confirm Address
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Btn Confirm Address'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set Address Title
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Set Address Title'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set Address Detail
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Set Address Detail'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Txt Home Type
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Txt Home Type'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Choose Home Type
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Choose Home Type'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Choose Home Size
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Choose Home Size'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Tap Button Confirm
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Btn Confirm Address Contact'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Tap Bedrooms. Bathrooms
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Bed Bath Rooms'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Add Bedrooms
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Add Bedrooms'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Add Bathrooms
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Add Bathrooms'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Tap Button Confirm
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Btn Confirm Address Contact'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Tap Pets
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Choose Pets'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Tap Button Confirm
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Btn Confirm Address Contact'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set Contact Name
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Set Contact Name'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set Phone Number
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Set Phone Number'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Tap Button Save Address
Mobile.callTestCase(findTestCase('Test Cases Details/Address/Btn Save Address'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)







