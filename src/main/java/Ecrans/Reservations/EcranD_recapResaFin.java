package Ecrans.Reservations;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class EcranD_recapResaFin extends AppliManager {

	private By btnAnnulerResa = By.xpath("//*[contains(@resource-id,'action_cancel')]");
	private By btnConfirmAnnul = By.xpath("//*[contains(@resource-id,'button1')]");
	Integer p_wait =30;
	
	public void annulerResa() {
		wait = new WebDriverWait(driver, p_wait).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(btnAnnulerResa));
		driver.findElement(btnAnnulerResa).click();
		// confirmation 
		wait = new WebDriverWait(driver, p_wait).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmAnnul));
		driver.findElement(btnConfirmAnnul).click();
	}
	
}
