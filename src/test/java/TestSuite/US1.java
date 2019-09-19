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

/*
	
Cas de test 1 : Mot de passe oublié 

0	Début
	Lancer l'application = la page FirstPage est affichée
	Cliquer sur Se Connecter
1	Quelle action faire ? = Mot de passe oublié
2	Renseigner nom, prenom, email pour réinitialisation de mdp
3	Est-ce que le nom et le prénom et le mail sont  connus  ? = Non
4	Pop up Contacter une agence ou annuler ?
5	Annuler 
6	Renseigner nom, prenom, email pour demander la réinitialisation de mdp
7	Est-ce que le nom et le prénom et l'émail sont  connus  ? = Oui
8	Envoi d'un mail de réinitialisation de mot de passe	 					  HORS SYSTEME
9		Est-ce que le mail a été reçu ? = Oui    							  HORS SYSTEME
10		Cliquer sur le lien reçu 											  HORS SYSTEME
11		Renseigner mail, et mot de passe , et confirmation du mot de passe 	  HORS SYSTEME
12  Quelle action faire ? = Connexion			  	  						  HORS SYSTEME
13	Renseigner email et mot de passe           	 							  HORS SYSTEME
 
 */
