package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Outils.AppliManager;

public class EcranConnexion extends AppliManager {
	
	
	private By btnMdpOublie = By.xpath("//*[contains(text(), 'Oublié ?')]");
	private By champEmail = By.xpath("//*[contains(@resource-id, 'login_edit_user_name')]");
	private By champMdp = By.xpath("//*[contains(@resource-id, 'login_edit_password')]");
	private By btnConnexion = By.xpath("//*[contains(text(), 'SE CONNECTER')]");
	private By textEchecCo = By.xpath("//*[contains(text(), 'Échec de connexion)]");
	
	public void remplirChampMail(String Email) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(champEmail));
		wait.until(ExpectedConditions.elementToBeClickable(champEmail));
		driver.findElement(champEmail).clear();
		driver.findElement(champEmail).sendKeys(Email);
	}
	
	public void remplirChampMdp(String mdp) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(champMdp));
		wait.until(ExpectedConditions.elementToBeClickable(champMdp));
		driver.findElement(champMdp).clear();		
		driver.findElement(champMdp).sendKeys(mdp);
	}
	
	public void clickBtnConnexion() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnConnexion));
		wait.until(ExpectedConditions.elementToBeClickable(btnConnexion));
		driver.findElement(btnConnexion).click();
	}
	
}