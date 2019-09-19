package Pages;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
/**
 * Méthodes pour l'écran mot de passe oublié
 */


public class EcranMdpOublie {

	// Variables
	private By champPrenom = By.xpath("//*[contains(@resource-id, 'first_name')]");
	private By champNom = By.xpath("//*[contains(@resource-id, 'last_name')]");
	private By champEmail = By.xpath("//*[contains(@resource-id, 'email_address')]");
	private By btnEnvoyer = By.xpath("//*[contains(text(), 'ENVOYER')]");
	private By popUp = By.xpath("//*[contains(text(), 'Nous sommes désolés')]");
	private By btnAnnuler = By.xpath("//*[contains(text(), 'ANNULER')]");
	protected static AppiumDriver<MobileElement> driver;

	// Fonction pour remplir le champ "Prénom"
	public void remplirChampPrenom(String prenom) {
		driver.findElement(champPrenom).sendKeys(prenom);
	}
	
	// Fonction pour remplir le champ "Nom"
	public void remplirChampNom(String nom) {
		driver.findElement(champNom).sendKeys(nom);
	}
	
	// Fonction pour remplir le champ "Email"
	public void remplirChampEmail(String email) {
		driver.findElement(champEmail).sendKeys(email);
	}
	
	// Fonction pour tenter de se connecter
	public void clickEnvoyer() {
		driver.findElement(btnEnvoyer).click();
	}
	
	// Fonction pour vérifier l'existence de la popup d'erreur
	public void popUpExists() {
		driver.findElement(popUp).isDisplayed();
	}
	
	// Fonction pour fermer la popup d'erreur
	public void clickAnnuler() {
		driver.findElement(btnAnnuler).click();		
	}
}
