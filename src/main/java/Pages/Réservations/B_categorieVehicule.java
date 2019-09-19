package Pages.Réservations;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B_categorieVehicule {
	
	private By selectVehicule = By.xpath("//*[contains(@id, 'price_container')][1]"); // remplacer [1] par le numéro du véhicule souhaité
	
	public void coutTotal() {
		
		WebDriverWait wait = WebDriverWait(driver, 60);
		
		//Je selectionne le véhicule 1 :
		wait.until(ExpectedConditions.elementToBeClickable(selectVehicule));
		driver.findElement(selectVehicule).click;
		
	}

}
