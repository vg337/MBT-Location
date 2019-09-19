package TestSuite;

import org.junit.Assert;
import org.testng.annotations.Test;

import Pages.EcranFirstPage;
import Pages.EcranAccueil;
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
		
		// 2 Cliquer sur mot de passe oublié
		eConnexion.clickBtnMdpOublie();
		
		// 3 Renseigner nom, prenom, email pour réinitialisation de mdp
		eMdpOublie.remplirChampPrenom(prenomErrone);
		eMdpOublie.remplirChampNom(nomErrone);
		eMdpOublie.remplirChampEmail(adresseEmailErrone);
		
		// 4 Est-ce que le nom et le prénom et le mail sont  connus  ? = Non
		eMdpOublie.clickEnvoyer();
		
		// 5 Pop up Contacter une agence ou annuler ?
		eMdpOublie.popUpExists();
		
		// 6 Annuler 
		eMdpOublie.clickAnnuler();
		
		// 7 Renseigner nom, prenom, email pour demander la réinitialisation de mdp
		eMdpOublie.remplirChampPrenom(prenom);
		eMdpOublie.remplirChampNom(nom);
		eMdpOublie.remplirChampEmail(adresseEmail);
		
		// 8 Est-ce que le nom et le prénom et l'émail sont  connus  ? = Oui
		eMdpOublie.clickEnvoyer();		
		
	}
	
	
	@Test
	public void us1cdt2() {

		EcranConnexion eConnex = new EcranConnexion();
		EcranFirstPage eFirstPage= new EcranFirstPage();
		EcranAccueil eAccueil = new EcranAccueil();
		
		String adresseEmail = "wcstesteur19@gmail.com";
		String motDePasse = "testing2019";
		String motDePasseErrone = "abcdefg99";
		
		boolean eAfficheeOK;
		
		// 1 Lancer l'application = la page FirstPage est affichée
		eConnex.verifEcranConnexion();
		Assert.assertTrue(eAfficheeOK);
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : First Page Passed -------------------------|");
		System.out.println("|---------------------------------------------------|");
		
		// 2 Cliquer sur Se Connecter
		eFirstPage.clickSeConnecter();
		Assert.assertTrue(eAfficheeOK);
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : seConnecter Passed ------------------------|");
		System.out.println("|---------------------------------------------------|");
		
		// 3 Renseigner email et mot de passe erroné
		
		eConnex.remplirChampMail(adresseEmail);
		eConnex.remplirChampMdp(motDePasseErrone);
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : Remplissage Mail + MDP Passed -------------|");
		System.out.println("|---------------------------------------------------|");
		
		// 4 Cliquer sur SE CONNECTER
		eConnex.clickBtnConnexion();
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : btn SE CONNECTER Passed -------------------|");
		System.out.println("|---------------------------------------------------|");
		
		// 5 Affichage du message d'erreur "Echec de connexion"
		eConnex.verifAffichageMsgErreur();
		Assert.assertTrue(eAfficheeOK);
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : Msg Erreur Passed -------------------------|");
		System.out.println("|---------------------------------------------------|");
		
		// 6 Renseigner email et mot de passe
		eConnex.remplirChampMail(adresseEmail);
		eConnex.remplirChampMdp(motDePasse);
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : Remplissage Mail + MDP Passed -------------|");
		System.out.println("|---------------------------------------------------|");
		
		// 7 Cliquer sur SE CONNECTER
		eConnex.clickBtnConnexion();
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : btn SE CONNECTER Passed -------------------|");
		System.out.println("|---------------------------------------------------|");
		
		// 8 Connexion réussie , page d'accueil  réservation affichée
		eReservation.verifPageReservationAffichee();
		Assert.assertTrue(eAfficheeOK);
		eConnex.clickBtnConnexion();
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : CONNEXION Passed --------------------------|");
		System.out.println("|---------------------------------------------------|");
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : FIN US 1 CAS 2 Passed ---------------------|");
		System.out.println("|---------------------------------------------------|");
	}
}