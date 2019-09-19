package Ecrans;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;

/**
 * Méthode pour la page D'Accueil après première connexion.
 * 
 * @author Yassine Skiba
 *
 */

public class EcranAccueil extends AppliManager {

	// Variables
	private By btnSeConnecter = By.xpath("//*[contains(text(),'SE CONNECTER')]");
	private By champAgenceDepart = By.xpath("//*[contains(text(),'Indiquez une agence de départ')]");
	private By textReserverMaintenant = By.xpath("//*[contains(text(),'RESERVER MAINTENANT')]");
	private boolean visibilitTextReserverMaintenante;

	/*
	 * Méthode pour cliquer sur "Se Connecter"
	 */
	public void clickSeConnecter() {
		//Vérifier qu'on est bien arriver sur EcranAccueil
		verifEcranAccueil();
		
		//Cliquer sur "Se connecter"
		driver.findElement(btnSeConnecter).click();
		
		//Vérifier qu'on est bien arriver sur EcranConnexion
		EcranConnexion eConnexion = new EcranConnexion();
		eConnexion.verifEcranConnexion();
	}

	/*
	 * Méthode pour choisir une ville / agence pour la réservation et lance la
	 * recherche
	 */
	public void remplirVilleAgence(String valeur) {
		// Remplir la valeur choisi dans le cas de test
		driver.findElement(champAgenceDepart).sendKeys(valeur);
	}

	/**
	 * Méthode pour vérifier que l'on est sur lebonne écran
	 */

	public boolean verifEcranAccueil() {
		
		try {
			wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(textReserverMaintenant));
			visibilitTextReserverMaintenante = driver.findElement(textReserverMaintenant).isDisplayed();

		} catch (Exception e) {			
			System.out.println("Cause is :" + e.getCause());
            System.out.println("Message is : " + e.getMessage());
            e.printStackTrace();
            return false;
		}
		return visibilitTextReserverMaintenante;
	}
}
