package Pages.Réservations;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

public class C_recapVehiculeEtChoixPaiement {

	private By payerMtn = By.xpath("");
	
	public void payerMaintenant() {
		WebDriverWait wait = WebDriverWait(driver, 60);
		
		//Je selectionne le véhicule 1 :
		wait.until(ExpectedConditions.elementToBeClickable(payerMtn));
		driver.findElement(payerMtn).click;
	}
	
}
