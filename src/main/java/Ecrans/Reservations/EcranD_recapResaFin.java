package Ecrans.Reservations;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class EcranD_recapResaFin extends AppliManager {

	private By annulerResa = By.xpath("//*[contains(@text,'ANNULER']");
	
	
	public void annulerResa() {
		wait = new WebDriverWait(driver, 60).ignoring(NoSuchElementException.class);
		//Je selectionne le véhicule 1 :
		wait.until(ExpectedConditions.elementToBeClickable(annulerResa));
		driver.findElement(annulerResa).click();
	}
	
}
