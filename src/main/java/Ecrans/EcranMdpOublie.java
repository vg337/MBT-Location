package Ecrans;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;

/**
 * Méthodes pour l'Ã©cran mot de passe oublié
 */

public class EcranMdpOublie extends AppliManager{

	// Variables
	private By champPrenom = By.xpath("//*[contains(@resource-id, 'first_name')]");
	private By champNom = By.xpath("//*[contains(@resource-id, 'last_name')]");
	private By champEmail = By.xpath("//*[contains(@resource-id, 'email_address')]");
	private By btnEnvoyer = By.xpath("//*[contains(@text, 'ENVOYER')]");
	private By popUp = By.xpath("//*[contains(@text, 'Nous Appeler')]");
	private By btnAnnuler = By.xpath("//*[contains(@text, 'ANNULER')]");
	private By affMdppOubliePage= By.id("password_header");
	

	private boolean existMdpOubliePage;
	private int p_wait = 30;
	 
	public boolean verifMdpOubliePage() { 

		try {
			wait = new WebDriverWait(driver, p_wait).ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOfElementLocated(affMdppOubliePage));
			existMdpOubliePage = driver.findElement(affMdppOubliePage).isDisplayed();

		} catch (Exception e) {

			System.out.println("Cause is :" + e.getCause());
			System.out.println("Message is : " + e.getMessage());
			e.printStackTrace();
		}

		return existMdpOubliePage;

	}
	
	// Fonction pour remplir le champ "Prénom"
	public void remplirChampPrenom(String prenom) {
		wait = new WebDriverWait(driver, p_wait).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(champPrenom));
		wait.until(ExpectedConditions.elementToBeClickable(champPrenom));
		driver.findElement(champPrenom).clear();
		driver.findElement(champPrenom).sendKeys(prenom);
	}
	
	// Fonction pour remplir le champ "Nom"
	public void remplirChampNom(String nom) {
		wait = new WebDriverWait(driver, p_wait).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(champNom));
		wait.until(ExpectedConditions.elementToBeClickable(champNom));
		driver.findElement(champNom).clear();
		driver.findElement(champNom).sendKeys(nom);
	}
	
	// Fonction pour remplir le champ "Email"
	public void remplirChampEmail(String email) {
		wait = new WebDriverWait(driver, p_wait).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(champEmail));
		wait.until(ExpectedConditions.elementToBeClickable(champEmail));
		driver.findElement(champEmail).clear();
		driver.findElement(champEmail).sendKeys(email);
	}
	
	// Fonction pour tenter de se connecter
	public void clickEnvoyer() {
		wait = new WebDriverWait(driver, p_wait).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnEnvoyer));
		wait.until(ExpectedConditions.elementToBeClickable(btnEnvoyer));
		driver.findElement(btnEnvoyer).click();
	}
	
	// Fonction pour vÃ©rifier l'existence de la popup d'erreur
	public void popUpExists() {
		wait = new WebDriverWait(driver, p_wait).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(popUp));
		driver.findElement(popUp).isDisplayed();
	}
	
	// Fonction pour fermer la popup d'erreur
	public void clickAnnuler() {
		wait = new WebDriverWait(driver, p_wait).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnAnnuler));
		wait.until(ExpectedConditions.elementToBeClickable(btnAnnuler));
		driver.findElement(btnAnnuler).click();		
	}
}
