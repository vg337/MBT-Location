package Ecrans.Reservations;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class EcranC_recapVehiculeEtChoixPaiement extends AppliManager{
	
	private By pagePaiement = By.xpath("//*[contains(@text,'options de paiement')]");
	private By payerPlusTard = By.xpath("//*[contains(@resource-id,'second_payment_button')]");
	private By BtnContinuer = By.xpath("//*[contains(@resource-id, 'continue_button')]"); //Continuer 
	private By pageSupplement = By.xpath("//*[contains(@resource-id,'root_animation_container')]");
	
	
	Integer p_wait=30;
		
	
	public boolean verifPagePaiement() {
		
		boolean visibilitePageCat;
		try {
			wait = new WebDriverWait(driver, p_wait);
			wait.until(ExpectedConditions.visibilityOfElementLocated(pagePaiement));
			visibilitePageCat = driver.findElement(pagePaiement).isDisplayed();

		} catch (Exception e) {			
			System.out.println("Cause is :" + e.getCause());
            System.out.println("Message is : " + e.getMessage());
            e.printStackTrace();
            return false;
		}
		return visibilitePageCat;
	}
	public void payerPlusTard() {
		
		wait = new WebDriverWait(driver, 60).ignoring(NoSuchElementException.class);
		driver.findElement(payerPlusTard).click();
	}
	
	public void continuer() {
		wait = new WebDriverWait(driver, p_wait).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(BtnContinuer));
		
		driver.findElement(BtnContinuer).click();       
	}
	
	public boolean verifPageSupplement() {
			
			boolean visibilitePageSuppl;
			try {
				wait = new WebDriverWait(driver, p_wait);
				wait.until(ExpectedConditions.visibilityOfElementLocated(pageSupplement));
				visibilitePageSuppl = driver.findElement(pageSupplement).isDisplayed();
	
			} catch (Exception e) {			
				System.out.println("Cause is :" + e.getCause());
	            System.out.println("Message is : " + e.getMessage());
	            e.printStackTrace();
	            return false;
			}
			return visibilitePageSuppl;
	}
	
}
