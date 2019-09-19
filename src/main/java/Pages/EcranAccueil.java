package Pages;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * Méthode pour la page D'Accueil après première connexion.
 * @author Yassine Skiba
 *
 */

public class EcranAccueil {

	//Variables
	private By btnSeConnecter = By.xpath("//*[contains(text(), SE CONNECTER')]");
	private By champAgenceDepart = By.xpath("//*[contains(text(), 'Indiquez une agence de départ')]");
	protected static AppiumDriver<MobileElement> driver;
	/*
	 * Méthode pour cliquer sur "Se Connecter"
	 */
	public void clickSeConnecter() {
		
	}
	
	/*
	 * Méthode pour choisir une ville / agence pour la réservation et lance la recherche
	 */
	public void remplirVilleAgence(String valeur) {
		
	}
	
	/**
	 * Méthode pour vérifier que l'on est sur lebonne écran
	 */
	
	public  boolean verifEcranAccueil(Boolean verif) {
		
		return verif;
	}
}
