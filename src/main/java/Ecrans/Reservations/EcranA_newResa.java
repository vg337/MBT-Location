package Ecrans.Reservations;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Outils.AppliManager;

public class EcranA_newResa extends AppliManager {
	
	//Selection agence retour :
	private By saisieAgenceRetour = By.xpath("//*[contains(@class, 'EditText')]");
    private By validationAgenceRetour = By.xpath("//*[contains(@text, 'SÉLECTION')]/parent::*"); //Selection agence retour
    
	//Selection dates :
	private By selectDateDepart = By.xpath("//*[contains(@id, 'select_pickup_date_view')]");
	private By choixDateDepart (String dateChoisie) { 
		return By.xpath("//*[contains(@text, '" + dateChoisie + "')]"); 
	}
	private By choixDateRetour(String dateChoisie) { 
		return By.xpath("//*[contains(@text, '" + dateChoisie + "')]"); 
	}
	private By continuerVersHeures = By.xpath("//*[contains(@text, 'CONTINUER')]"); //Continuer vers heures
	
	//Selection heures :
	private By choixHeureDepart(String heureChoisie) {
		return By.xpath("//*[contains(@text, '" + heureChoisie + " ')]"); 
	}
	private By choixHeureRetour(String heureChoisie) {
		return By.xpath("//*[contains(@text, '"+ heureChoisie +" ')]");
	}
	
	
	public void selectAgenceRetour(){
		wait = new WebDriverWait(driver, 60).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(saisieAgenceRetour));
		
		driver.findElement(saisieAgenceRetour).click(); //click agenceRetour
		driver.findElement(validationAgenceRetour).click(); //click "Selection"
		
	}
	
	public void selectDatesHeures(String dateDepartChoisie, String dateRetourChoisie, String heureDepartChoisie, String heureRetourChoisie) {
		wait = new WebDriverWait(driver, 60).ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(selectDateDepart));
		driver.findElement(selectDateDepart).click(); 
		//click date départ
		
		//sélection des dates
		wait.until(ExpectedConditions.elementToBeClickable(choixDateDepart(dateDepartChoisie)));
		driver.findElement(continuerVersHeures).click();//click "Continuer"
		selectDateDepart(dateDepartChoisie);
		selectDateRetour(dateRetourChoisie);
		
		//Sélection des heures
		wait.until(ExpectedConditions.elementToBeClickable(choixHeureDepart(heureDepartChoisie)));
		selectHeureDepart(heureDepartChoisie);
		selectHeureRetour(heureRetourChoisie);

	}

	//fonctions de sélection unitaire
	public void selectDateDepart ( String DateChoisie) {
		driver.findElement(choixDateDepart(DateChoisie)).click(); // choix date départ
	}
	public void selectDateRetour ( String DateChoisie) {
		driver.findElement(choixDateRetour(DateChoisie)).click(); // choix date départ
	}
	
	public void selectHeureDepart( String HeureChoisie) {
		driver.findElement(choixHeureDepart(HeureChoisie)).click();//choix heure départ
		driver.findElement(choixHeureDepart(HeureChoisie)).click();//validation heure depart
	}
	
	public void selectHeureRetour ( String HeureChoisie) {
		driver.findElement(choixHeureRetour(HeureChoisie)).click();//choix heure retour
		driver.findElement(choixHeureRetour(HeureChoisie)).click();//validation heure retour
	}
	
}