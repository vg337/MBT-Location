package TestSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.EcranFirstPage;
import Pages.EcranConnexion;
import Pages.EcranMdpOublie;

public class US1 extends TestSuite {
	
	@Test
	public void us1cdt1() {

		final String prenomErrone = "Ab";
		final String nomErrone = "Cd";
		final String adresseEmailErrone = "ab.cd@gmail.com";
		final String prenom = "Marilou";
		final String nom = "Prevot";
		final String adresseEmail = "loc.arboree@gmail.com";

		EcranFirstPage eFirstPage = new EcranFirstPage();
		EcranConnexion eConnexion = new EcranConnexion();
		EcranMdpOublie eMdpOublie = new EcranMdpOublie();
		
		// 1 Cliquer sur Se Connecter
		eFirstPage.clickSeConnecter();
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|Step : Click se connecter Passed					    |");
		System.out.println("|-------------------------------------------------------|");
		
		// 2 Cliquer sur mot de passe oublié
		eConnexion.clickBtnMdpOublie();
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|Step : Click mot de passe oublié Passed			    |");
		System.out.println("|-------------------------------------------------------|");
		
		// 3 Renseigner nom, prenom, email pour réinitialisation de mdp
		eMdpOublie.remplirChampPrenom(prenomErrone);
		eMdpOublie.remplirChampNom(nomErrone);
		eMdpOublie.remplirChampEmail(adresseEmailErrone);
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|Step : Remplissage champs Passed					    |");
		System.out.println("|-------------------------------------------------------|");
		
		// 4 Est-ce que le nom et le prénom et le mail sont  connus  ? = Non
		eMdpOublie.clickEnvoyer();
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|Step : Click envoyer Passed		     			    |");
		System.out.println("|-------------------------------------------------------|");
		
		// 5 Pop up Contacter une agence ou annuler ?
		eMdpOublie.popUpExists();
		
		// 6 Annuler 
		eMdpOublie.clickAnnuler();
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|Step : Click annuler Passed					        |");
		System.out.println("|-------------------------------------------------------|");
		
		// 7 Renseigner nom, prenom, email pour demander la réinitialisation de mdp
		eMdpOublie.remplirChampPrenom(prenom);
		eMdpOublie.remplirChampNom(nom);
		eMdpOublie.remplirChampEmail(adresseEmail);
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|Step : Remplissage champs Passed					    |");
		System.out.println("|-------------------------------------------------------|");
		
		// 8 Est-ce que le nom et le prénom et l'émail sont  connus  ? = Oui
		eMdpOublie.clickEnvoyer();		
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|Step : Click envoyer Passed					        |");
		System.out.println("|-------------------------------------------------------|");
	}
	
	
	@Test
	public void us1cdt2() {

		EcranConnexion eConnex = new EcranConnexion();
		EcranFirstPage eFirstPage= new EcranFirstPage();
		EcranReservation eReservation = new EcranReservation();
		
		String adresseEmail = "wcstesteur19@gmail.com";
		String motDePasse = "testing2019";
		String motDePasseErrone = "abcdefg99";
		
		// 1 Lancer l'application = la page FirstPage est affichée
		// 2 Cliquer sur Se Connecter
		eFirstPage.clickSeConnecter();
		
		// 3 Renseigner email et mot de passe erroné
		eConnex.remplirChampMail(adresseEmail);
		eConnex.remplirChampMdp(motDePasseErrone);
		
		// 4 Cliquer sur SE CONNECTER
		eConnex.clickBtnConnexion();
		
		// 5 Affichage du message d'erreur "Echec de connexion"
		eConnex.verifMsgErreurConnexion();
		
		// 6 Renseigner email et mot de passe
		eConnex.remplirChampMail(adresseEmail);
		eConnex.remplirChampMdp(motDePasse);
		
		// 7 Cliquer sur SE CONNECTER
		eConnex.clickBtnConnexion();
		
		// 8 Connexion réussie , page d'accueil  réservation affichée
		eReservation.verifPageReservationAffichee();
	}
}