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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import global.BasePageObject

public class Address extends BasePageObject{
	private TestObject address
	private TestObject imgAddNew
	private TestObject btnConfirmAddress

	private TestObject setAddressTitle
	private TestObject setAddressDetail

	private TestObject txtHomeType
	private TestObject chooseHomeType
	private TestObject homeTypeAppart
	private TestObject homeTypeHouse
	private TestObject chooseHomeSize
	private TestObject btnConfirmAddressContact
	private TestObject sizeType

	private TestObject txtBedBathrooms
	private TestObject imgPositiveBedrooms
	private TestObject imgPositiveBathrooms

	private TestObject txtPets
	private TestObject petsDog
	private TestObject petsCat
	private TestObject petsOthers
	private TestObject noPets

	private TestObject setContactName
	private TestObject setPhoneNumber
	private TestObject btnSaveAddress

	public Address() {
		address = createTestObjectByXpath("address", "//android.widget.TextView[@resource-id = 'id.co.okhome.okhomeapp:id/txtTitle' and @text = 'Address & Contact']")
		imgAddNew = createTestObjectByXpath("imgAddNew", "//android.widget.TextView[@resource-id = 'id.co.okhome.okhomeapp:id/txtTitleAddNew' and @text = 'Add New']")
		btnConfirmAddress = createTestObjectByXpath("btnConfirmAddress", "//android.widget.Button[@resource-id = 'id.co.okhome.okhomeapp:id/btnSave']")

		setAddressTitle = createTestObjectByXpath("setAddressTitle", "//android.widget.EditText[@resource-id = 'id.co.okhome.okhomeapp:id/etAddressName']")
		setAddressDetail = createTestObjectByXpath("setAddressDetail", "//android.widget.EditText[@resource-id = 'id.co.okhome.okhomeapp:id/etAddressNotes']")

		txtHomeType = createTestObjectByXpath("txtHomeType", "//android.widget.EditText[@resource-id = 'id.co.okhome.okhomeapp:id/etHomeType']")
		chooseHomeType = createTestObjectByXpath("chooseHomeType", "//android.widget.Spinner[@resource-id = 'id.co.okhome.okhomeapp:id/spinnerHomeType']")
		homeTypeAppart = createTestObjectByXpath("homeTypeAppart", "//android.widget.TextView[@resource-id = 'id.co.okhome.okhomeapp:id/textView' and @text = 'Apartment']")
		homeTypeHouse = createTestObjectByXpath("homeTypeHouse", "//android.widget.TextView[@resource-id = 'id.co.okhome.okhomeapp:id/textView' and @text = 'House']")
		chooseHomeSize = createTestObjectByXpath("chooseHomeSize", "//android.widget.Spinner[@resource-id = 'id.co.okhome.okhomeapp:id/spinnerHomeSize']")
		btnConfirmAddressContact = createTestObjectByXpath("btnConfirmAddressContact", "//android.widget.Button[@resource-id = 'id.co.okhome.okhomeapp:id/positiveButton']")
				
		txtBedBathrooms = createTestObjectByXpath("txtBedBathrooms", "//android.widget.EditText[@resource-id = 'id.co.okhome.okhomeapp:id/etBedroomBathroom']")
		imgPositiveBedrooms = createTestObjectByXpath("imgPositiveBedrooms", "//android.widget.ImageButton[@resource-id = 'id.co.okhome.okhomeapp:id/imgPositiveBedrooms']")
		imgPositiveBathrooms = createTestObjectByXpath("imgPositiveBathrooms", "//android.widget.ImageButton[@resource-id = 'id.co.okhome.okhomeapp:id/imgPositiveBathrooms']")

		txtPets = createTestObjectByXpath("txtPets", "//android.widget.EditText[@resource-id = 'id.co.okhome.okhomeapp:id/etPets']")
		petsDog = createTestObjectByXpath("petsDog", "//android.widget.CheckBox[@resource-id = 'id.co.okhome.okhomeapp:id/checkDog']")
		petsCat = createTestObjectByXpath("petsCat", "//android.widget.CheckBox[@resource-id = 'id.co.okhome.okhomeapp:id/checkCat']")
		petsOthers = createTestObjectByXpath("petsOthers", "//android.widget.CheckBox[@resource-id = 'id.co.okhome.okhomeapp:id/checkOthers']")
		noPets = createTestObjectByXpath("noPets", "//android.widget.CheckBox[@resource-id = 'id.co.okhome.okhomeapp:id/checkNoPets']")

		setContactName = createTestObjectByXpath("setContactName", "//android.widget.EditText[@resource-id = 'id.co.okhome.okhomeapp:id/etContactName']")
		setPhoneNumber = createTestObjectByXpath("setPhoneNumber", "//android.widget.EditText[@resource-id = 'id.co.okhome.okhomeapp:id/etContactPhone']")
		btnSaveAddress = createTestObjectByXpath("btnSaveAddress", "//android.widget.Button[@resource-id = 'id.co.okhome.okhomeapp:id/btnSave']")
	}

	public void TapTxtAddress() {
		Mobile.waitForElementPresent(address, 10)
		Mobile.takeScreenshot()
		Mobile.tap(address, 1)
		Mobile.waitForElementPresent(imgAddNew, 10)
		Mobile.takeScreenshot()
	}

	public void TapImgAddNew() {
		Mobile.waitForElementPresent(imgAddNew, 5)
		Mobile.takeScreenshot()
		Mobile.tap(imgAddNew, 1)
		Mobile.waitForElementPresent(btnConfirmAddress, 10)
		Mobile.takeScreenshot()
	}

	public void TapBtnConfirmAddress() {
		Mobile.waitForElementPresent(btnConfirmAddress, 5)
		Mobile.takeScreenshot()
		Mobile.tap(btnConfirmAddress, 1)
		Mobile.waitForElementPresent(setAddressTitle, 10)
		Mobile.takeScreenshot()
	}

	public void SetAddressTitle(dtAddressTitle) {
		Mobile.scrollToText('Save Address')
		Mobile.waitForElementPresent(setAddressTitle, 10)
		Mobile.takeScreenshot()
		Mobile.setText(setAddressTitle, dtAddressTitle, 1)
		Mobile.takeScreenshot()
	}

	public void SetAddressDetail(dtAddressDetail) {
		Mobile.waitForElementPresent(setAddressDetail, 10)
		Mobile.takeScreenshot()
		Mobile.setText(setAddressDetail, dtAddressDetail, 1)
		Mobile.takeScreenshot()
	}

	public void TapHomeType() {
		Mobile.waitForElementPresent(txtHomeType, 10)
		Mobile.takeScreenshot()
		Mobile.tap(txtHomeType, 1)
		Mobile.waitForElementPresent(chooseHomeType, 10)
		Mobile.takeScreenshot()
	}

	public void ChooseHomeType(dtHomeType) {
		Mobile.waitForElementPresent(chooseHomeType, 10)
		Mobile.takeScreenshot()
		Mobile.tap(chooseHomeType, 1)
		Mobile.waitForElementPresent(homeTypeAppart, 10)
		switch (dtHomeType) {
			case "No Data" :
				KeywordUtil.logInfo('Home Type Empty')
				break
			case "Apartment" :
				Mobile.waitForElementPresent(homeTypeAppart, 5)
				Mobile.takeScreenshot()
				Mobile.tap(homeTypeAppart, 1)
				Mobile.waitForElementPresent(chooseHomeType, 10)
				Mobile.takeScreenshot()
				break
			case "House" :
				Mobile.waitForElementPresent(homeTypeHouse, 5)
				Mobile.takeScreenshot()
				Mobile.tap(homeTypeHouse, 1)
				Mobile.waitForElementPresent(chooseHomeType, 10)
				Mobile.takeScreenshot()
				break
		}
	}

	public void ChooseHomeSize(dtHomeSize) {
		sizeType = createTestObjectByXpath("sizeType", "//android.widget.TextView[@resource-id = 'id.co.okhome.okhomeapp:id/textView' and @text = '${dtHomeSize}']")

		if (dtHomeSize == 'No Data') {
			KeywordUtil.logInfo('Home Size Empty')
		} else {
			Mobile.waitForElementPresent(chooseHomeSize, 10)
			Mobile.takeScreenshot()
			Mobile.tap(chooseHomeSize, 1)
			Mobile.waitForElementPresent(sizeType, 5)
			Mobile.takeScreenshot()
			Mobile.tap(sizeType, 1)
			Mobile.waitForElementPresent(chooseHomeSize, 10)
			Mobile.takeScreenshot()
		}
	}
	
	public void TapBtnConfirmAddressContact() {
		Mobile.waitForElementPresent(btnConfirmAddressContact, 10)
		Mobile.takeScreenshot()
		Mobile.tap(btnConfirmAddressContact, 1)
		Mobile.waitForElementPresent(setAddressTitle, 10)
		Mobile.takeScreenshot()
	}

	public void TapBedBathrooms() {
		Mobile.waitForElementPresent(txtBedBathrooms, 5)
		Mobile.takeScreenshot()
		Mobile.tap(txtBedBathrooms, 1)
		Mobile.waitForElementPresent(imgPositiveBathrooms, 10)
		Mobile.takeScreenshot()
	}

	public void AddBedrooms(dtAddBedrooms) {
		Mobile.waitForElementPresent(imgPositiveBedrooms, 5)
		Mobile.takeScreenshot()
		switch (dtAddBedrooms) {
			case "1" :
				KeywordUtil.logInfo('Bedrooms 1')
				Mobile.takeScreenshot()
				break
			case "2" :
				for (int i; i<= 1; i++) {
					Mobile.tap(imgPositiveBedrooms, 1)
				}
				Mobile.takeScreenshot()
				KeywordUtil.logInfo('Bedrooms 2')

				break
			case "3" :
				for (int i; i<= 2; i++) {
					Mobile.tap(imgPositiveBedrooms, 1)
				}
				Mobile.takeScreenshot()
				KeywordUtil.logInfo('Bedrooms 3')
				break
			case "4" :
				for (int i; i<= 3; i++) {
					Mobile.tap(imgPositiveBedrooms, 1)
				}
				Mobile.takeScreenshot()
				KeywordUtil.logInfo('Bedrooms 4')
				break
			case "5" :
				for (int i; i<= 4; i++) {
					Mobile.tap(imgPositiveBedrooms, 1)
				}
				Mobile.takeScreenshot()
				KeywordUtil.logInfo('Bedrooms 5')
				break
		}
	}

	public void AddBathrooms(dtAddBathrooms) {
		Mobile.waitForElementPresent(imgPositiveBathrooms, 5)
		Mobile.takeScreenshot()
		switch (dtAddBathrooms) {
			case "1" :
				KeywordUtil.logInfo('Bathrooms 1')
				Mobile.takeScreenshot()
				break
			case "2" :
				for (int i; i<= 1; i++) {
					Mobile.tap(imgPositiveBathrooms, 1)
				}
				Mobile.takeScreenshot()
				KeywordUtil.logInfo('Bathrooms 2')
				break
			case "3" :
				for (int i; i<= 1; i++) {
					Mobile.tap(imgPositiveBathrooms, 1)
				}
				Mobile.takeScreenshot()
				KeywordUtil.logInfo('Bathrooms 3')
				break
			case "4" :
				for (int i; i<= 1; i++) {
					Mobile.tap(imgPositiveBathrooms, 1)
				}
				Mobile.takeScreenshot()
				KeywordUtil.logInfo('Bathrooms 4')
				break
			case "5" :
				for (int i; i<= 1; i++) {
					Mobile.tap(imgPositiveBathrooms, 1)
				}
				Mobile.takeScreenshot()
				KeywordUtil.logInfo('Bathrooms 5')
				break
		}
	}

	public void ChoosePets(dtChoosePets) {
		Mobile.waitForElementPresent(txtPets, 5)
		Mobile.takeScreenshot()
		Mobile.tap(txtPets, 1)
		Mobile.waitForElementPresent(petsDog, 10)
		Mobile.takeScreenshot()
		switch (dtChoosePets) {
			case "No Data" :
				KeywordUtil.logInfo('Pets Empty')
				break
			case "Dog" :
				Mobile.waitForElementPresent(petsDog, 5)
				Mobile.takeScreenshot()
				Mobile.tap(petsDog, 1)
				break
			case "Cat" :
				Mobile.waitForElementPresent(petsCat, 5)
				Mobile.takeScreenshot()
				Mobile.tap(petsCat, 1)
				break
			case "Others" :
				Mobile.waitForElementPresent(petsOthers, 5)
				Mobile.takeScreenshot()
				Mobile.tap(petsOthers, 1)
				break
			case "No Pets" :
				Mobile.waitForElementPresent(noPets, 5)
				Mobile.takeScreenshot()
				Mobile.tap(noPets, 1)
				break
		}
	}

	public void SetContactName(dtContactName) {
		Mobile.waitForElementPresent(setContactName, 5)
		Mobile.takeScreenshot()
		Mobile.setText(setContactName, dtContactName, 1)
		Mobile.takeScreenshot()
	}

	public void SetPhoneNumber(dtPhoneNumber) {
		//Get Device Height and store in device_height variable
		int device_height = Mobile.getDeviceHeight()

		//Get device width and store in device_width variable
		int device_width = Mobile.getDeviceWidth()

		//Storing the startX,endX values by dividing device height by 2 Because Y coordinates are constant
		int startY = device_height / 2

		//'Here endY and startY values are equal for vertical Swiping for that assigning startY value to endY'
		int endY = startY * 0.70

		for (int i = 1; i <= 5; i++) {
			//'Storing the startX value'
			int startX = device_width * 0.90

			//'Storing the endX value'
			int endX = device_width * 0.90

			Mobile.swipe(startX, startY, endX, endY)
			if (Mobile.waitForElementPresent(btnSaveAddress, 3) == true) {
				break
			}
		}
		Mobile.waitForElementPresent(setPhoneNumber, 5)
		Mobile.takeScreenshot()
		Mobile.setText(setPhoneNumber, dtPhoneNumber, 1)
		Mobile.takeScreenshot()
	}

	public void TapBtnSaveAddress() {
		Mobile.waitForElementPresent(btnSaveAddress, 5)
		Mobile.tap(btnSaveAddress, 1)
		Mobile.waitForElementPresent(imgAddNew, 10)
		Mobile.takeScreenshot()
	}
}
