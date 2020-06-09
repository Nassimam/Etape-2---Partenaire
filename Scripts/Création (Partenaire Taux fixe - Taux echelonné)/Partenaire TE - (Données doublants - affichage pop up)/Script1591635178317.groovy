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

WebUI.openBrowser('')

WebUI.delay(10)

WebUI.navigateToUrl('https://p13.demo.iadholding.com/')

WebUI.click(findTestObject('Object Repository/Création partenaire/Page_Welcome page/button_Accder'))

WebUI.setText(findTestObject('Object Repository/Création partenaire/Page_IAD/input_Identifiant_username'), '16803@iadfrance.fr')

WebUI.setEncryptedText(findTestObject('Object Repository/Création partenaire/Page_IAD/input_Mot de passe_password'), 'M1qipU8GjAM=')

WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/input_Mot de passe_submit'))

not_run: WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/button_Dmarrer'))

not_run: WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/div_Quitter'))

WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/a_Production'))

WebUI.click(findTestObject('Création partenaire/Page_IAD/a_Financia BO'))

WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/span_Ajouter'))

WebUI.setText(findTestObject('Création partenaire/Page_IAD/input__partnerName'), GlobalVariable.nom_part)

WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/span_Slectionner un type de partenaire'))

WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/span_Banques'))

WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/span_Slectionner une forme juridique'))

WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/span_SARL'))

CustomKeywords.'com.kms.katalon.UploadImg.uploadImg'(findTestObject('PARCOURIR/Page_IAD/div_Parcourir'), 'C:\\Users\\Nassima.m\\logoo.jpg')

WebUI.setText(findTestObject('ADRESSS/Page_IAD/input__address1'), 'P')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('ADRESSS/Page_IAD/input__address1'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('ADRESSS/Page_IAD/input__address1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/span_Accords'))

WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/span_Slectionner une nature de convention'))

WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/span_Nationale'))

WebUI.click(findTestObject('TYPE DE CONVENTION/Page_IAD/span_Slectionner un type de convention'))

WebUI.click(findTestObject('TYPE DE CONVENTION/Page_IAD/span_Indtermin'))

WebUI.click(findTestObject('Date de signature de partenaire/date de signature partenaire nouvelle/Page_IAD/input_Date de signature_form-control ng-pristine ng-valid ng-isolate-scope ng-empty ng-valid-date ng-touched'))

WebUI.click(findTestObject('Date de signature de partenaire/Page_IAD/i_Date de signature_glyphicon glyphicon-chevron-left'))

WebUI.click(findTestObject('Date de signature de partenaire/Page_IAD/span_10'))

WebUI.click(findTestObject('les dates partenaires/Page_IAD/input_Date de fin de convention_form-control ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty ng-valid-date'))

WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/span_26'))

WebUI.click(findTestObject('Taux échelonné/Page_IAD/span_Taux chelonn'))

CustomKeywords.'com.kms.katalon.UploadFile.uploadPDF'(findTestObject('Création partenaire/Page_IAD/span_Glisser un fichier ici ou cliquer pour_5320bf'), 
    'C:\\Users\\Nassima.m\\OneDrive\\Bureau\\jeux donnée teste\\ACTE.pdf')

WebUI.verifyElementPresent(findTestObject('Message Erreur partenaire/Page_IAD/div_Votre import a t effectu avec succs'), 
    30)

WebUI.click(findTestObject('Taux échelonné/Page_IAD/span_Ajouter un taux_fa fa-plus'))

WebUI.setText(findTestObject('Taux échelonné/Page_IAD/input__value'), '10')

WebUI.verifyElementPresent(findTestObject('Message Erreur partenaire/Message taux inférieur/Page_IAD/p_Le taux doit tre infrieur  9'), 
    30)

not_run: WebUI.delay(6)

WebUI.setText(findTestObject('Taux échelonné/Page_IAD/input__value'), '2')

WebUI.setText(findTestObject('Taux échelonné/Page_IAD/input__minAmount'), '5')

WebUI.verifyElementPresent(findTestObject('Message Erreur partenaire/min du premier taux doit être de 0/Page_IAD/p_Le montant min du premier taux doit tre de 0'), 
    30)

WebUI.setText(findTestObject('Taux échelonné/Page_IAD/input__minAmount'), '0')

WebUI.setText(findTestObject('Taux échelonné/Page_IAD/input__maxAmount'), GlobalVariable.taux_min2)

WebUI.setText(findTestObject('Taux échelonné/Page_IAD/input_Plafond_ceilingAmount'), '1000')

WebUI.click(findTestObject('Taux échelonné/Page_IAD/span_Ajouter un taux_fa fa-plus'))

WebUI.setText(findTestObject('Taux échelonné/taux echelonne 2/Page_IAD/input__value'), '4')

WebUI.setText(findTestObject('Taux échelonné/taux echelonne 2/Page_IAD/input__minAmount'), '601')

WebUI.verifyElementPresent(findTestObject('Message Erreur partenaire/min du taux doit être égal au montant max du taux précédent/Page_IAD/p_Le montant min du taux doit tre gal au montant max du taux prcdent'), 
    30)

WebUI.setText(findTestObject('Taux échelonné/taux echelonne 2/Page_IAD/input__minAmount'), GlobalVariable.taux_min2)

WebUI.setText(findTestObject('Taux échelonné/taux echelonne 2/Page_IAD/input__maxAmount'), '800')

WebUI.setText(findTestObject('Taux échelonné/taux echelonne 2/Page_IAD/input_Plafond_ceilingAmount'), '3000')

WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/span_Sauvegarder'))

if (WebUI.verifyElementPresent(findTestObject('Message Erreur partenaire/Partenaire avec memes informations/Page_IAD/div_Annuler  Confirmer'), 
    1, FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('Message Erreur partenaire/Partenaire avec memes informations/Page_IAD/button_Confirmer'))
}

WebUI.verifyElementPresent(findTestObject('Message Erreur partenaire/new/Page_IAD/div_Le partenaire a t cr avec succs'), 
    30)

WebUI.delay(3)

WebUI.click(findTestObject('Ajouter contact partenaire/Page_IAD/button_Nouveau contact'))

WebUI.setText(findTestObject('Création partenaire/Page_IAD/input__firstName'), 'test')

WebUI.setText(findTestObject('Création partenaire/Page_IAD/input__lastName'), 'lastname')

WebUI.setText(findTestObject('Object Repository/Création partenaire/Page_IAD/input__mobilePhone'), '06 12 45 67 11')

WebUI.setText(findTestObject('Object Repository/Création partenaire/Page_IAD/input__phone'), '01 23 70 12 58')

WebUI.setText(findTestObject('Création partenaire/Page_IAD/input__email'), 'test@nass.com')

WebUI.setText(findTestObject('INFOS Contact partenaire/Page_IAD/input_Secteur_email'), 'test@mail.com')

WebUI.click(findTestObject('Adrres contact/Page_IAD/input__address1'))

WebUI.setText(findTestObject('Adrres contact/Page_IAD/input__address1'), 'n')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Adrres contact/Page_IAD/input__address1'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Adrres contact/Page_IAD/input__address1'), Keys.chord(Keys.ENTER))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/span_Enregistrer le contact'))

if (WebUI.verifyElementPresent(findTestObject('Condirm contact partenaire/Page_IAD/div_Annuler  Confirmer'), 1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Condirm contact partenaire/Page_IAD/button_Confirmer'))
}

WebUI.verifyElementPresent(findTestObject('Message Erreur partenaire/Message de création/Page_IAD/div_Contact cre avec succs'), 
    2)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Création partenaire/Page_IAD/span_Sauvegarder'))

if (WebUI.verifyElementPresent(findTestObject('Message Erreur partenaire/Partenaire avec memes informations/Page_IAD/div_Annuler  Confirmer'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Message Erreur partenaire/Partenaire avec memes informations/Page_IAD/button_Confirmer'))
}

WebUI.verifyElementPresent(findTestObject('Message Erreur partenaire/new/Page_IAD/div_Le partenaire a t modifi avec succs'), 
    30)

WebUI.delay(3)

WebUI.setText(findTestObject('Statut partenaire/Page_IAD/input_Afficher_search'), GlobalVariable.nom_part)

WebUI.verifyElementText(findTestObject('Statut partenaire/Page_IAD/p_Valid'), 'Validé')

not_run: WebUI.closeBrowser()

