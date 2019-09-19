package TestSuite;

import org.testng.annotations.Test;

import Pages.EcranFirstPage;
import Pages.EcranConnexion;
import Pages.EcranMdpOublie;

public class US1 extends TestSuite {
	
	@Test
	public void motDePasseOublie() {

		final String prenomErrone = "Ab";
		final String nomErrone = "Cd";
		final String adresseEmailErrone = "ab.cd@gmail.com";
		final String prenom = "Marilou";
		final String nom = "Prevot";
		final String adresseEmail = "loc.arboree@gmail.com";

		EcranFirstPage eFirstPage = new EcranFirstPage();
		EcranConnexion eConnexion = new EcranConnexion();
		EcranMdpOublie eMdpOublie = new EcranMdpOublie();
		
		// Cliquer sur Se Connecter
		eFirstPage.clickBtnConnexion();
		
		// Cliquer sur mot de passe oublié
		eConnexion.clickMotDePasseOublie();
		
		// Renseigner nom, prenom, email pour réinitialisation de mdp
		eMdpOublie.remplirChampPrenom(prenomErrone);
		eMdpOublie.remplirChampNom(nomErrone);
		eMdpOublie.remplirChampMail(adresseEmailErrone);
		
		// Est-ce que le nom et le prénom et le mail sont  connus  ? = Non
		eMdpOublie.clickEnvoyer();
		
		// Pop up Contacter une agence ou annuler ?
		eMdpOublie.popUpExists();
		
		// Annuler 
		eMdpOublie.clickAnnuler();
		
		// Renseigner nom, prenom, email pour demander la réinitialisation de mdp
		eMdpOublie.remplirChampPrenom(prenom);
		eMdpOublie.remplirChampNom(nom);
		eMdpOublie.remplirChampMail(adresseEmail);
		
		// Est-ce que le nom et le prénom et l'émail sont  connus  ? = Oui
		eMdpOublie.clickEnvoyer();		
		
	}
}