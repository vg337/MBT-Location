package TestSuite;

import Generic.TestManager;

public class US2 extends TestManager {
		
		/*
		
		
		RESERVATION OK/ US2
		
		//Liste des étapes 
	PROJET 7 Automatisation		
			
	RESERVATION	OK	
	Liste des étapes 		
			
1	Début		
2	Sélectionner une agence Bordeaux		
3	Sélectionner Aéroport de Bordeaux BOD		
4	cliquer sur sélection		
5	Renseigner les dates et heures de début et de fin		
6	Est-ce que la date et l'heure de début est postérieure à la date du jour ? = Oui		
7	Est-ce que la date et l'heure de fin est postérieure à la date de début ? = Oui		
8	affichage du récapitulatif 		
9	Y a-t-il un véhicule disponible ? = Oui		
10	Afficher la liste des véhicules disponibles avec immatriculation		
11	Choisir un des véhicules disponibles		
12	sélectionner payer maintenant		
13	affichage du récapitulatif de la réservation		
14	Retour à la page d'accueil		
	
	A_newResa
	selectAgenceRetour
	selectDatesHeures
	B_categorieVehicule
	selectVehicule
	C_recapVehiculeEtChoixPaiement
	payerMaintenant
	D_recapResaFin
	annulerResa

			 
			 */
		// Lancer l'application = la page FirstPage est affichée
					// 1 Cliquer sur Se Connecter
		
				
		// 1 Réserver à la Page d' accueil sans se connecter
		
		 EcranAccueil reserMtn = new  EcranAccueil();
					reserMtn.remplirVilleAgence();
					
				// aller sur la first page
		
	           EcranFirstPage firstP = new EcranFirstPage();
	           firstP.clickPoursuivreInvite();
				
				
				
				// 2 Sélectionner Aéroport de Bordeaux BOD
				
				A_newResa Bordeaux = new A_newResa();
				Bordeaux.selectAgenceRetour();			
				
				
				
				// 4 Renseigner les dates et heures de début et de fin
				
				Bordeaux.selectDatesHeures();
				
				
				B_categorieVehicule catVehicule = new B_categorieVehicule();
				catVehicule.coutTotal();
				
				// 11  sélectionner payer maintenant
				
				C_recapVehiculeEtChoixPaiement recapVehi = new C_recapVehiculeEtChoixPaiement();
				recapVehi.payerMaintenant();
				
				// 12 affichage du récapitulatif de la réservation
				
				D_recapResaFin recapFin = new D_recapResaFin();
				recapFin.annulerResa();
				
			
				
			
		}

}

