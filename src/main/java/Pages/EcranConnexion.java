package Pages;

import org.openqa.selenium.By;

public class EcranConnexion {
	
	
	private By btnMdpOublie = By.xpath("//*[contains(text(), 'Oublié ?')]");
	private By champEmail = By.xpath("//*[contains(@resource-id, 'login_edit_user_name')]");
	private By champMdp = By.xpath("//*[contains(@resource-id, 'login_edit_password')]");
	private By btnConnexion = By.xpath("//*[contains(text(), 'SE CONNECTER')]");
	private By textEchecCo = By.xpath("//*[contains(text(), 'Échec de connexion)]");
	
}
