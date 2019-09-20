package Ecrans;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;

public class EcranSpinner extends AppliManager {
	private By ecranSpinner = By.id("spinner");
	
//constructeur ecran EcranSpinner
	public EcranSpinner() {
		
	}
		
	public boolean attendreChargement() {
		try {
			wait = new WebDriverWait(driver, 60).ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOfElementLocated(ecranSpinner));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(ecranSpinner));
			return true;
		}
		catch (Exception e) {
			return false;
			
		}
	}
}
