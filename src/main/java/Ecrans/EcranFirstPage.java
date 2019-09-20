package Ecrans;

/*
 * 
 * Méthode pour la first page (accueil première fois sur l'appli).
 * 
 * @Author Jorys Bensch
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;

public class EcranFirstPage extends AppliManager {

	// Variables
	private By btnConnexion = By.xpath("//*[contains(text(), 'SE CONNECTER')]");
	private By textBienvenue = By.xpath("//*[contains(text(), 'BIENVENUE!')]");
	private By btnInscription = By.xpath("//*[contains(text(), 'S'INSCRIRE')]");
	private By btnInvite = By.xpath("//*[contains(text(), 'POURSUIVRE EN TANT QU’INVITÉ')]");
	private boolean visibiliteTextBienvenue;

	/*
	 * Méthode pour vérifier qu'on soit bien sur FirstPage.
	 */

	public boolean verifFirstPage() {

		try {
			wait = new WebDriverWait(driver, 6000).ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOfElementLocated(textBienvenue));
			visibiliteTextBienvenue = driver.findElement(textBienvenue).isDisplayed();

		} catch (Exception e) {

			System.out.println("Cause is :" + e.getCause());
			System.out.println("Message is : " + e.getMessage());
			e.printStackTrace();
		}

		return visibiliteTextBienvenue;

	}

	/*
	 * Méthode pour cliquer sur le bouton se connecter.
	 */

	public void clickSeConnecter() {

		driver.findElement(btnConnexion).click();

	}

	/*
	 * Méthode pour cliquer sur le bouton poursuivre en tant qu'invite.
	 */

	public void clickPoursuivreInvite() {

		driver.findElement(btnInvite).click();
		
	}

}
