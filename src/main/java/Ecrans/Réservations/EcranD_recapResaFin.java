package Ecrans.Réservations;

import org.openqa.selenium.support.ui.ExpectedConditions;

import Outils.AppliManager;

import org.openqa.selenium.By;

public class EcranD_recapResaFin extends AppliManager {

	private By annulerResa = By.xpath("//*[contains(text(),'ANNULER']");
	
	
	public void annulerResa() {
		
		//Je selectionne le véhicule 1 :
		wait.until(ExpectedConditions.elementToBeClickable(annulerResa));
		driver.findElement(annulerResa).click();
	}
	
}
