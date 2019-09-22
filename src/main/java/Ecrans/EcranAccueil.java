package Ecrans;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;

/**
 * methode pour la page D'Accueil apres  connexion ou invite .
 * 
 * @author Yassine Skiba
 *
 */

public class EcranAccueil extends AppliManager {

	// Variables
	private By btnContinuer = By.xpath("//*[contains(@text, 'CONTINUER')]");
	private By btnSeConnecter = By.xpath("//*[contains(@text,'SE CONNECTER')]");
	private By champAgenceDepart = By.xpath("//*[contains(@text,'Indiquez')]");
	private By textReserverMaintenant = By.xpath("//*[contains(@text,'RESERVER MAINTENANT')]");
	
	private int p_wait = 30;

	/*
	 * Methode pour cliquer sur "Se Connecter"
	 */
	public void clickSeConnecter() {
		//Verifier qu'on est bien arriver sur EcranAccueil
		verifEcranAccueil();
		
		//Cliquer sur "Se connecter"
		driver.findElement(btnSeConnecter).click();
		
		//verifier qu'on est bien arrive sur EcranConnexion
		EcranConnexion eConnexion = new EcranConnexion();
		eConnexion.verifEcranConnexion();
	}

	/*
	 * Methode pour choisir une ville / agence pour la réservation et lance la
	 * recherche
	 */
	public void remplirVilleAgence(String valeur) {
		// cliquer et Remplir la valeur choisi dans le cas de test
		wait = new WebDriverWait(driver, p_wait);
		wait.until(ExpectedConditions.visibilityOfElementLocated(champAgenceDepart));
		driver.findElement(champAgenceDepart).clear();   
		driver.findElement(champAgenceDepart).sendKeys(valeur);
	}

	/**
	 * Methode pour vérifier que l'on est sur le bon ecran
	 */

	public boolean verifEcranAccueil() {
		
		boolean visibiliteTextReserverMaintenant;
		try {
			wait = new WebDriverWait(driver, p_wait);
			wait.until(ExpectedConditions.visibilityOfElementLocated(textReserverMaintenant));
			visibiliteTextReserverMaintenant = driver.findElement(textReserverMaintenant).isDisplayed();

		} catch (Exception e) {			
			System.out.println("Cause is :" + e.getCause());
            System.out.println("Message is : " + e.getMessage());
            e.printStackTrace();
            return false;
		}
		return visibiliteTextReserverMaintenant;
	}
	
	public void clickBtnContinuer() {
		
		wait = new WebDriverWait(driver, p_wait).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnContinuer));
		wait.until(ExpectedConditions.elementToBeClickable(btnContinuer));
		driver.findElement(btnContinuer).click();
	}

	
}
