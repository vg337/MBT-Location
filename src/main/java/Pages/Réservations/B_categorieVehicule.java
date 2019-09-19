package Pages.Réservations;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;

public class B_categorieVehicule extends AppliManager {
	
	private By selectVehicule = By.xpath("//*[contains(@id, 'price_container')][1]"); // remplacer [1] par le numéro du véhicule souhaité
	
	public void coutTotal() {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		//Je selectionne le véhicule 1 :
		wait.until(ExpectedConditions.elementToBeClickable(selectVehicule));
		driver.findElement(selectVehicule).click();
		
	}

}
