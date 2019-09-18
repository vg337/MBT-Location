package Pages;

import org.openqa.selenium.By;

public class EcranMdpOublie {

	private By champPrenom = By.xpath("//*[contains(@resource-id, 'first_name')]");
	private By champNom = By.xpath("//*[contains(@resource-id, 'last_name')]");
	private By champEmail = By.xpath("//*[contains(@resource-id, 'email_address')]");
	private By btnEnvoyer = By.xpath("//*[contains(text(), 'ENVOYER')]");
	private By popUp = By.xpath("//*[contains(text(), 'Nous sommes désolés')]");
	private By btnAnnuler = By.xpath("//*[contains(text(), 'ANNULER')]");

}
