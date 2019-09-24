package Ecrans.Reservations;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;

public class EcranB_categorieVehicule extends AppliManager {
	
	private By pageCategorie = By.xpath("//*[contains(@text,'gorie de v�hicule')]"); 
	private By selectVehicule = By.xpath("//*[contains(@resource-id, 'price_container')][1]"); // remplacer [1] par le numéro du véhicule souhaité
	
		
	Integer p_wait=30;
	
	public void coutTotal() {
		wait = new WebDriverWait(driver, p_wait).ignoring(NoSuchElementException.class);
		//Je selectionne le véhicule 1 :
		wait.until(ExpectedConditions.elementToBeClickable(selectVehicule));
		driver.findElement(selectVehicule).click();
		
	}
	
	public boolean verifPageCategorie() {
		
		boolean visibilitePageCat;
		try {
			wait = new WebDriverWait(driver, p_wait);
			wait.until(ExpectedConditions.visibilityOfElementLocated(pageCategorie));
			visibilitePageCat = driver.findElement(pageCategorie).isDisplayed();

		} catch (Exception e) {			
			System.out.println("Cause is :" + e.getCause());
            System.out.println("Message is : " + e.getMessage());
            e.printStackTrace();
            return false;
		}
		return visibilitePageCat;
	}

}
