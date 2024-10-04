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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://petstore.octoperf.com/')

WebUI.verifyElementPresent(findTestObject('Object Repository/ProductNavigation_Fish/Page_JPetStore Demo/a_Enter the Store'), 
    0)

WebUI.click(findTestObject('Object Repository/ProductNavigation_Fish/Page_JPetStore Demo/a_Enter the Store'))

WebUI.click(findTestObject('Object Repository/ProductNavigation_Fish/Page_JPetStore Demo/img'))

WebUI.click(findTestObject('Object Repository/ProductNavigation_Fish/Page_JPetStore Demo/a_FI-SW-01'))

WebUI.click(findTestObject('Object Repository/ProductNavigation_Fish/Page_JPetStore Demo/a_EST-1'))

WebUI.click(findTestObject('Object Repository/ProductNavigation_Fish/Page_JPetStore Demo/a_Add to Cart'))

WebUI.click(findTestObject('Object Repository/ProductNavigation_Fish/Page_JPetStore Demo/a_Proceed to Checkout'))

WebUI.click(findTestObject('Object Repository/ProductNavigation_Fish/Page_JPetStore Demo/img'))

WebUI.click(findTestObject('Object Repository/ProductNavigation_Fish/Page_JPetStore Demo/a_Return to Main Menu'))

WebUI.closeBrowser()


/* Write a Katalon Studio test case to perform the following steps.
 * 1. Open browser to the URL stored in G_SiteURL
 * 2. Click the make appointment button
 * 3. Fill in the username and password fields based on the variables
 * 4. Click the login button
 * 5. Verify that the appointment div exists
 * 6. Close the browser
 * */

