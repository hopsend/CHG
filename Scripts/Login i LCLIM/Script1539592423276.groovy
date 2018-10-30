import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("http://hartwig-so/ShippingOperation/Edit/42713")
selenium.click("link=Operacje spedycyjne")
selenium.click("link=Nowa operacja spedycyjna LCLI-matka")
selenium.click("name=cfsOrigin")
selenium.type("name=cfsOrigin", "Gdańsk - Solid Logistics, Kontenerowa 21, Gdańsk")
selenium.click("name=loadingPort")
selenium.type("name=loadingPort", "FREDERICIA")
selenium.click("name=unloadingPort")
selenium.type("name=unloadingPort", "FREDERIKSVAERK")
selenium.click("name=cfsDestination")
selenium.type("name=cfsDestination", "Gdańsk - DCT - Deepwater Container Terminal, Kontenerowa 7, Gdańsk")
selenium.click("name=comment")
selenium.type("name=comment", "123wes")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='koszty portowe THC (koszty zagraniczne)'])[2]/following::span[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Wybierz'])[4]/following::span[5]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='fracht morski ALL IN'])[2]/following::span[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Wybierz'])[8]/following::span[5]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='koszty portowe THC (koszty portowe)'])[2]/following::span[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Wybierz'])[13]/following::span[5]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='opłata dokumentacyjna / spedycyjna (opłaty armatorskie)'])[2]/following::span[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Wybierz'])[17]/following::span[5]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='formowanie / rozformowanie kontenera'])[2]/following::span[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Wybierz'])[22]/following::span[5]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='transport kontenerowy'])[2]/following::span[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Wybierz'])[26]/following::span[5]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Inne'])[2]/following::span[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Wybierz'])[30]/following::span[5]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Anuluj'])[2]/following::button[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Automatycznie anulowane czynności:'])[1]/following::button[1]")
selenium.waitForPageToLoad("30000")
