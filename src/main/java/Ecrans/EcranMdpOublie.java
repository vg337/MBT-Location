package Ecrans;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;

/**
 * Méthodes pour l'écran mot de passe oublié
 */

public class EcranMdpOublie extends AppliManager{

	// Variables
	private By champPrenom = By.xpath("//*[contains(@resource-id, 'first_name')]");
	private By champNom = By.xpath("//*[contains(@resource-id, 'last_name')]");
	private By champEmail = By.xpath("//*[contains(@resource-id, 'email_address')]");
	private By btnEnvoyer = By.xpath("//*[contains(@text, 'ENVOYER')]");
	private By popUp = By.xpath("//*[contains(@text, 'Nous sommes désolés')]");
	private By btnAnnuler = By.xpath("//*[contains(@text, 'ANNULER')]");
	private By textMdpOubliePage = By.xpath("(/*[contains(@text, 'Vous avez oubli')]");

	private boolean existMdpOubliePage;
	 
	public boolean verifMdpOubliePage() {

		try {
			wait = new WebDriverWait(driver, 60).ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOfElementLocated(textMdpOubliePage));
			existMdpOubliePage = driver.findElement(textMdpOubliePage).isDisplayed();

		} catch (Exception e) {

			System.out.println("Cause is :" + e.getCause());
			System.out.println("Message is : " + e.getMessage());
			e.printStackTrace();
		}

		return existMdpOubliePage;

	}
	
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
