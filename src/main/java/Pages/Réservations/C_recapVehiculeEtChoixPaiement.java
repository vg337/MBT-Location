package Pages.Réservations;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;

import org.openqa.selenium.By;

public class C_recapVehiculeEtChoixPaiement extends AppliManager{
	
	private By payerMtn = By.xpath("//*[contains(text(),'Payer maintenant']");
		
	public void payerMaintenant() {
		
		
		//Je selectionne le véhicule 1 :
		wait.until(ExpectedConditions.elementToBeClickable(payerMtn));
		driver.findElement(payerMtn).click();
	}
	
}
