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

WebUI.callTestCase(findTestCase('Authentification Conseiller'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.openBrowser('')

not_run: WebUI.delay(10)

not_run: WebUI.navigateToUrl('https://p13.demo.iadholding.com/')

not_run: WebUI.click(findTestObject('Object Repository/Création partenaire/Page_Welcome page/button_Accder'))

not_run: WebUI.setText(findTestObject('Object Repository/Création partenaire/Page_IAD/input_Identifiant_username'), '2003@iadfrance.fr')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Création partenaire/Page_IAD/input_Mot de passe_password'), 
    'M1qipU8GjAM=')

not_run: WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/input_Mot de passe_submit'))

WebUI.click(findTestObject('Object Repository/Page_IAD/a_Production'))

WebUI.click(findTestObject('Object Repository/Page_IAD/a_Myiad contacts'))

WebUI.click(findTestObject('Object Repository/Page_IAD/span_Mes projets'))

WebUI.click(findTestObject('Object Repository/Page_IAD/button_Crer'))

WebUI.click(findTestObject('Object Repository/Page_IAD/button_Achat'))

WebUI.click(findTestObject('Object Repository/Page_IAD/button_Habitation'))

WebUI.click(findTestObject('Object Repository/Page_IAD/button_Traditionnel'))

WebUI.click(findTestObject('Object Repository/Page_IAD/button_Maison'))

WebUI.click(findTestObject('Object Repository/Page_IAD/button_Nouveau contact'))

WebUI.click(findTestObject('Object Repository/Page_IAD/div_Retour_myiad-avatar'))

WebUI.setText(findTestObject('Object Repository/Page_IAD/input_Prnom_firstName'), 'NASSIMA')

WebUI.setText(findTestObject('Object Repository/Page_IAD/input_Nom_lastName'), 'MARZOUGUI')

WebUI.click(findTestObject('Object Repository/Page_IAD/span_Enregistrer le contact'))

WebUI.click(findTestObject('Object Repository/Page_IAD/span_tape suivante'))

WebUI.click(findTestObject('Object Repository/Page_IAD/span_Enregistrer et quitter'))

num_projet = WebUI.getText(findTestObject('Object Repository/Page_IAD/div_Filtres_iad-list-item-title'))

WebUI.setText(findTestObject('Page_IAD/input_Afficher_search'), num_projet)

WebUI.click(findTestObject('Object Repository/Page_IAD/div_Filtres_iad-list-item-title'))

WebUI.click(findTestObject('Object Repository/Page_IAD/i_Maison_iad-nav-item-icon business_indicat_d23f64'))

WebUI.click(findTestObject('Object Repository/Page_IAD/button_Indication daffaires'))

WebUI.click(findTestObject('Object Repository/Page_IAD/button_Suivant'))

WebUI.setText(findTestObject('Object Repository/Page_IAD/input_MONTANT DU PRT_mat-input-0'), '123000')

WebUI.click(findTestObject('Object Repository/Page_IAD/span_Suivant'))

WebUI.click(findTestObject('Object Repository/Page_IAD/div_Entrer un nom_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_IAD/span_Choisir un contact'))

WebUI.click(findTestObject('Object Repository/Page_IAD/span_CASONATO Teddy  (21 Avenue de la Rsist_08f66d'))

WebUI.click(findTestObject('Object Repository/Page_IAD/span_Valider'))

WebUI.click(findTestObject('Object Repository/Page_IAD/span_Confirmer'))

WebUI.click(findTestObject('Object Repository/Page_IAD/i_Maison_iad-nav-item-icon business_indicat_d23f64'))

not_run: GlobalVariable.num_ia = WebUI.getText(findTestObject('Numéro IA/Page_IAD/strong_Marzougui Nassima - 18199 - 11042020'))

num_ia = WebUI.getText(findTestObject('NUM_ia/Page_IAD/strong_Marzougui Nassima - 18255 - 05052020'))

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Authentification Gestionnaire'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/FACTURATION IA/Page_IAD Intranet/a_Factures  Paiement'))

WebUI.click(findTestObject('MENU facturation IA/Page_IAD/a_Facturation Indication daffaire'))

not_run: WebUI.click(findTestObject('NUMPROJET/Page_IAD/input_N de projet_project'))

not_run: WebUI.setText(findTestObject('NUMPROJET/Page_IAD/input_N de projet_project'), num_projet)

WebUI.click(findTestObject('champ recherche IA/Page_IAD/input_concat(N de l  indication d  affaire)_biNumber'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('champ recherche IA/Page_IAD/input_concat(N de l  indication d  affaire)_biNumber'), GlobalVariable.num_ia)

