package Pages.Réservations;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;

import org.openqa.selenium.By;

public class D_recapResaFin extends AppliManager {

	private By annulerResa = By.xpath("//*[contains(text(),'ANNULER']");
	
	
	public void annulerResa() {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		//Je selectionne le véhicule 1 :
		wait.until(ExpectedConditions.elementToBeClickable(annulerResa));
		driver.findElement(annulerResa).click();
	}
	
}
