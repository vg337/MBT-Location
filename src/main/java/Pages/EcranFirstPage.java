package Pages;

/*
 * 
 * Méthode pour la first page (accueil première fois sur l'appli).
 * 
 * @Author Jorys Bensch
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;


public class EcranFirstPage extends AppliManager{

	// Variables
	private By btnConnexion = By.xpath("//*[contains(text(), 'SE CONNECTER')]");
	private By textBienvenue = By.xpath("//*[contains(text(), 'BIENVENUE!')]");
	private By btnInscription = By.xpath("//*[contains(text(), 'S'INSCRIRE')]");
	private By btnInvite = By.xpath("//*[contains(text(), 'POURSUIVRE EN TANT QU’INVITÉ')]");

	/*
	 * Méthode pour vérifier qu'on soit bien sur FirstPage.
	 */

	public boolean verifFirstPage() {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBienvenue));
		boolean textBienvenueExist = driver.findElement(textBienvenue).isDisplayed();
        Assert.assertTrue(textBienvenueExist);
		
		return textBienvenueExist;
		
	}

	/*
	 * Méthode pour cliquer sur le bouton se connecter.
	 */

	public void clickSeConnecter() {

		driver.findElement(btnConnexion).click();
		
	}

	/*
	 * Méthode pour cliquer sur le bouton se connecter.
	 */

	public void clickPoursuivreInvite() {


		
	}

}
