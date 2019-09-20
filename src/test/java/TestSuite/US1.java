package TestSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Ecrans.EcranAccueil;
import Ecrans.EcranConnexion;
import Ecrans.EcranFirstPage;
import Ecrans.EcranMdpOublie;
import Generic.TestManager;

public class US1 extends TestManager {
	
	@Test
	public void us1cdt1() {

		final String prenomErrone = "Ab";
		final String nomErrone = "Cd";
		final String adresseEmailErrone = "ab.cd@gmail.com";
		final String prenom = "Marilou";
		final String nom = "Prevot";
		final String adresseEmail = "loc.arboree@gmail.com";
		 
		boolean eAfficheeOK;

		EcranFirstPage eFirstPage = new EcranFirstPage();
		EcranConnexion eConnexion = new EcranConnexion();
		EcranMdpOublie eMdpOublie = new EcranMdpOublie();
		
		// 1 Cliquer sur Se Connecter
		eFirstPage.clickSeConnecter();
		test.log(Status.INFO, "Affichage de la page d'accueil");
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|Step : Click se connecter Passed					    |");
		System.out.println("|-------------------------------------------------------|");
				
		// 2 Cliquer sur mot de passe oublié
		      
		eConnexion.clickBtnMdpOublie();
		eAfficheeOK = eMdpOublie.verifMdpOubliePage();
		Assert.assertTrue(eAfficheeOK);
		test.log(Status.PASS, "Affichage de la page Réinitialisation du Mot de Passe");
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|Step : Click mot de passe oublié Passed/ page affichée |");
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
		test.log(Status.INFO, "Saisie du nom, prénom, mail erronés");
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|Step : Click envoyer Passed		     			    |");
		System.out.println("|-------------------------------------------------------|");
			
		// 5 Pop up Contacter une agence ou annuler ?
		eMdpOublie.popUpExists();
		test.log(Status.PASS, "Pop up erreur saisie nom oi prenom ou email affiché");
				
		// 6 Annuler 
		eMdpOublie.clickAnnuler();
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|Step : Click annuler Passed					        |");
		System.out.println("|-------------------------------------------------------|");
			
		// 7 Renseigner nom, prenom, email pour demander la réinitialisation de mdp
		eMdpOublie.remplirChampPrenom(prenom);
		eMdpOublie.remplirChampNom(nom);
		eMdpOublie.remplirChampEmail(adresseEmail);
		test.log(Status.INFO, "Saisie du nom, prénom, mail corrects");
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
		EcranAccueil eAccueil = new EcranAccueil();
		
		String adresseEmail = "wcstesteur19@gmail.com";
		String motDePasse = "testing2019";
		String motDePasseErrone = "abcdefg99";
		
		boolean eAfficheeOK;
		
		// 1 Lancer l'application = la page FirstPage est affichée
		eAfficheeOK =eFirstPage.verifFirstPage();
		Assert.assertTrue(eAfficheeOK);
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : First Page Passed -------------------------|");
		System.out.println("|---------------------------------------------------|");
		test.log(Status.INFO, "Step 1 done");
		
		// 2 Cliquer sur Se Connecter
		eFirstPage.clickSeConnecter();
		//Assert.assertTrue(eAfficheeOK);
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : seConnecter Passed ------------------------|");
		System.out.println("|---------------------------------------------------|");
		test.log(Status.INFO, "Step 2 done");
		
		// 3 Renseigner email et mot de passe erroné
		eConnex.remplirChampMail(adresseEmail);
		eConnex.remplirChampMdp(motDePasseErrone);
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : Remplissage Mail + MDP Passed -------------|");
		System.out.println("|---------------------------------------------------|");
		test.log(Status.INFO, "Step 3 done");
		
		// 4 Cliquer sur SE CONNECTER
		eConnex.clickBtnConnexion();
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : btn SE CONNECTER Passed -------------------|");
		System.out.println("|---------------------------------------------------|");
		test.log(Status.INFO, "Step 4 done");
		
		// 5 Affichage du message d'erreur "Echec de connexion"
		eAfficheeOK = eConnex.verifAffichageMsgErreur();
		Assert.assertTrue(eAfficheeOK);
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : Msg Erreur Passed -------------------------|");
		System.out.println("|---------------------------------------------------|");
		test.log(Status.INFO, "Step 5 done");
		
		// 6 Renseigner email et mot de passe
		eConnex.remplirChampMail(adresseEmail);
		eConnex.remplirChampMdp(motDePasse);
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : Remplissage Mail + MDP Passed -------------|");
		System.out.println("|---------------------------------------------------|");
		test.log(Status.INFO, "Step 6 done");
		
		// 7 Cliquer sur SE CONNECTER
		eConnex.clickBtnConnexion();
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : btn SE CONNECTER Passed -------------------|");
		System.out.println("|---------------------------------------------------|");
		test.log(Status.INFO, "Step 7 done");
		
		// 8 Connexion réussie , page d'accueil  réservation affichée
		eAfficheeOK = eAccueil.verifEcranAccueil();
		Assert.assertTrue(eAfficheeOK);
		//Note : les deux lignes ci-dessus peuvent aussi s' écrire Assert.assertTrue(eAccueil.verifEcranAccueil());
		//Mais c'est quand même moins lisible et plus compliqué à débugger :)
		eConnex.clickBtnConnexion();
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : CONNEXION Passed --------------------------|");
		System.out.println("|---------------------------------------------------|");
		test.log(Status.INFO, "Step 8 done");
		System.out.println("|---------------------------------------------------|");
		System.out.println("| STEP : FIN US 1 CAS 2 Passed ---------------------|");
		System.out.println("|---------------------------------------------------|");
	}
}