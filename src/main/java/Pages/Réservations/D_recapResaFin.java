package Pages.Réservations;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

public class D_recapResaFin {

	private By annulerResa = By.xpath("\"//*[contains(text(), 'ANNULER')]");
	
	
	public void annulerResa() {
		WebDriverWait wait = WebDriverWait(driver, 60);
		
		//Je selectionne le véhicule 1 :
		wait.until(ExpectedConditions.elementToBeClickable(selectVehicule));
		driver.findElement(selectVehicule).click;
	}
	
}
