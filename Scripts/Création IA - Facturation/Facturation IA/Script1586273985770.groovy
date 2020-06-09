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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Authentification Gestionnaire'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.openBrowser('')

not_run: WebUI.delay(10)

not_run: WebUI.navigateToUrl('https://p13.demo.iadholding.com/')

not_run: WebUI.click(findTestObject('Object Repository/Création partenaire/Page_Welcome page/button_Accder'))

not_run: WebUI.setText(findTestObject('Object Repository/Création partenaire/Page_IAD/input_Identifiant_username'), '12455@iadfrance.fr')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Création partenaire/Page_IAD/input_Mot de passe_password'), 
    'M1qipU8GjAM=')

not_run: WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/input_Mot de passe_submit'))

WebUI.click(findTestObject('Object Repository/FACTURATION IA/Page_IAD Intranet/a_Factures  Paiement'))

WebUI.click(findTestObject('MENU facturation IA/Page_IAD/a_Facturation Indication daffaire'))

WebUI.click(findTestObject('champ recherche IA/Page_IAD/input_concat(N de l  indication d  affaire)_biNumber'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('champ recherche IA/Page_IAD/input_concat(N de l  indication d  affaire)_biNumber'), 
    GlobalVariable.num_ia)

not_run: WebUI.click(findTestObject('Object Repository/Facturation IA 2/Page_IAD/button_Rechercher'))

not_run: WebUI.click(findTestObject('Object Repository/Facturation IA 2/Page_IAD/span_Rechercher'))

not_run: WebUI.click(findTestObject('Object Repository/Facturation IA 2/Page_IAD/div_Gestionnaire  POUDRIER Laura (37660)_my_599f81'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Facturation IA 2/Page_IAD/a_Facturer'))

not_run: WebUI.setText(findTestObject('Object Repository/Facturation IA 2/Page_IAD/input__form-control ng-pristine ng-untouche_31098f'), 
    '123000')

not_run: WebUI.click(findTestObject('Object Repository/Facturation IA 2/Page_IAD/i_Partenaire_fa fa-times fa-2x iad-cb-modal-close'))

not_run: WebUI.closeBrowser()

