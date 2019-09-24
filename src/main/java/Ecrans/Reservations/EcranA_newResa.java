package Ecrans.Reservations;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;
import io.appium.java_client.functions.ExpectedCondition;

public class EcranA_newResa extends AppliManager {
	
	
	private By validationAgence = By.xpath("//*[contains(@text, 'LECTION')]"); //Selection agence 
	
	private By BtnSelectionDate = By.xpath("//*[contains(@resource-id,'select_pickup_date_view')]//*[contains(@text,'LECTIONNER LA DATE')]");
	private By BtnContinuer = By.xpath("//*[contains(@text, 'CONTINUER')]"); //Continuer 
	
	
	private By choixDateDepart = By.xpath("//*[contains(@resource-id,'com.ehi.enterprise.android:id/calendar_grid')]//*[contains(@text, '29')]"); 
	private By choixDateRetour = By.xpath("//*[contains(@resource-id,'com.ehi.enterprise.android:id/calendar_grid')]//*[contains(@text, '30')]"); 
	private By btnSelectHeure= By.xpath("//*[contains(@resource-id,'com.ehi.enterprise.android:id/select_time_button')]");
	
	private By btnChoixDateRetour= By.xpath("//*[contains(@text,'RETOUR')]//*[contains(@text, 'tionner une date')]"); 
			
	 
	 
	private By choixHeureDepart= By.xpath("(//*[contains(@text,'12:00')]"); 
	private By choixHeureRetour= By.xpath("(//*[contains(@text,'12:00')]"); 
	
	/*
	private By choixDateDepart (String dateChoisie) { 
	
		return By.xpath("//*[contains(@text, '" + dateChoisie + "')]"); 
	}
	private By choixDateRetour(String dateChoisie) { 
		return By.xpath("//*[contains(@text, '" + dateChoisie + "')]"); 
	}
	private By choixHeureDepart(String heureChoisie) {
		return By.xpath("//*[contains(@text, '" + heureChoisie + "')]"); 
	}
	private By choixHeureRetour(String heureChoisie) {
		return By.xpath("//*[contains(@text, '" + heureChoisie +"')]");
	}
	*/
	
	Integer p_wait=60;
	
	
	public void selectAgence(){    // selection de la premiere agence affichee
		wait = new WebDriverWait(driver, p_wait).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(validationAgence));
		driver.findElement(validationAgence).click();          //click "Selection"
		
	}
	
	public void clickBtnDate(){    // click sur le bouton selectionner la date 
		wait = new WebDriverWait(driver, p_wait).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(BtnSelectionDate));
		driver.findElement(BtnSelectionDate).click();          //click "Selection"
	}
	
	public void selectDateDepart (String DateChoisie)  {
		//driver.findElement(choixDateDepart(DateChoisie)).click(); // choix date depart
		driver.findElement(choixDateDepart).click(); // choix date depart
		driver.findElement(choixDateDepart).click(); // choix date depart
		// waits for the element to be selected
		wait.until(ExpectedConditions.elementSelectionStateToBe(choixDateDepart, true));
		
	}
	
	public void clickChoixDateRetour () {
		driver.findElement(btnChoixDateRetour).click(); // choix date retour
	}
	
		
	public void selectDateRetour ( String DateChoisie) {
		//driver.findElement(choixDateRetour(DateChoisie)).click();
		driver.findElement(choixDateRetour).click(); // choix date retour sans parametrage 
	}
	
	public void selectHeureDepart( String HeureChoisie) {
		//driver.findElement(choixHeureDepart(HeureChoisie)).click();//choix heure départ
		//driver.findElement(choixHeureDepart(HeureChoisie)).click();//validation heure 
		//driver.findElement(choixHeureDepart).click();//choix heure départ
		
		driver.findElement(btnSelectHeure).click();//validation heure depart   // heure par defaut 12:00
	}
	
	public void selectHeureRetour ( String HeureChoisie) {
		//driver.findElement(choixHeureRetour(HeureChoisie)).click();//choix heure retour
		//driver.findElement(choixHeureRetour(HeureChoisie)).click();//validation heure retour
		//driver.findElement(choixHeureRetour).click();// heure retour
		
		driver.findElement(btnSelectHeure).click();//validation heure retour    // heure par defaut 12:00
	}
	
	public void continuer() {
		wait = new WebDriverWait(driver, p_wait).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(BtnContinuer));
		
		driver.findElement(BtnContinuer).click();       
	}

}