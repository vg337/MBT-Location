package Pages.Réservations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A_newResa {
	
	//Selection agence retour :
	private By saisieAgenceRetour = By.xpath("//*[contains(@class, 'EditText')]");
    private By validationAgenceRetour = By.xpath("//*[contains(text(), 'SÉLECTION')]/parent::*"); //Selection agence retour
    private String agenceVoulue = "Aéroport de Bordeaux";
    
	//Selection dates :
	private By selectDateDepart = By.xpath("//*[contains(@id, 'select_pickup_date_view')]");
	private By choixDateDepart = By.xpath("//*[contains(text(), '25')]"); // remplacer '25' par la date de départ choisie
	private By choixDateRetour = By.xpath("//*[contains(text(), '28')]"); // remplacer '28' par la date d'arrivée
	private By continuerVersHeures = By.xpath("//*[contains(text(), 'CONTINUER')]"); //Continuer vers heures
	
	//Selection heures :
	private By choixHeureDepart = By.xpath("//*[contains(text(), '11:30')]"); // remplacer '11:30' par l'heure de départ
	private By choixHeureRetour = By.xpath("//*[contains(text(), '14:30')]"); // remplacer '14:30' par l'heure d'arrivée
	
	
	
	public void selectAgenceRetour(){
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(saisieAgenceRetour));
		
		driver.findElement(saisieAgenceRetour).click; //click agenceRetour
		driver.findElement(validationAgenceRetour).click; //click "Selection"
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : selectAgenceRetour Passed -----------------|");
		System.out.println("|---------------------------------------------------|");
		
	}
	
	public void selectDatesHeures() {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(selectDateDepart));
		driver.findElement(selectDateDepart).click; //click date départ
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : btn Date Départ Passed -----------------|");
		System.out.println("|---------------------------------------------------|");
		
		wait.until(ExpectedConditions.elementToBeClickable(choixDateDepart));
		driver.findElement(choixDateDepart).click; // choix date départ
		driver.findElement(choixDateRetour).click;//choix date retour
		driver.findElement(continuerVersHeures).click;//click "Continuer"
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : selection Dates Passed --------------------|");
		System.out.println("|---------------------------------------------------|");
		
		//actions.doubleClick(le webElement voulu).perform;
		
		wait.until(ExpectedConditions.elementToBeClickable(choixHeureDepart));
		driver.findElement(choixHeureDepart).doubleclick;//choix heure départ
		driver.findElement(choixHeureRetour).doubleclick;//choix heure retour
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : choix Heures Passed -----------------------|");
		System.out.println("|---------------------------------------------------|");
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : selectDatesHeures Passed ------------------|");
		System.out.println("|---------------------------------------------------|");
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : ------------ FIN DU STEP ------------------|");
		System.out.println("|---------------------------------------------------|");
	}

}