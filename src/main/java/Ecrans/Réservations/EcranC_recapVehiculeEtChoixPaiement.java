package Ecrans.Réservations;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class EcranC_recapVehiculeEtChoixPaiement extends AppliManager{
	
	private By payerMtn = By.xpath("//*[contains(text(),'Payer maintenant']");
		
	public void payerMaintenant() {
		
		wait = new WebDriverWait(driver, 60).ignoring(NoSuchElementException.class);
		//Je selectionne le véhicule 1 :
		wait.until(ExpectedConditions.elementToBeClickable(payerMtn));
		driver.findElement(payerMtn).click();
	}
	
}
