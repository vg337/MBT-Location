package TestSuite;

import org.testng.annotations.Test;
import Pages.EcranConnexion;
// import Pages.EcranAccueil;


public class US1 extends TestSuite {
	
	
	@Test
    public void connexion() {
		
		EcranConnexion eConnex = new EcranConnexion();
		EcranFirstPage eAcceuil= new EcranFirstPage();
        
        String adresseEmail = "wcstesteur19@gmail.com";
        String motDePasse = "testing2019";
        String motDePasseErrone = "abcdefg99";
        
        // Lancer l'application = la page FirstPage est affichée
        
        // 2 Cliquer sur Se Connecter
        eAcceuil.clickSeConnecter();
        
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
                      
        // 8 Cliquer sur SE CONNECTER
    	eConnex.clickBtnConnexion();
        
        // 9 Connexion réussie , page d'accueil  réservation affichée
    	eConnex.verifPageReservationAffichee();
       
        
    }
    
}
