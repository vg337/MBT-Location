package Pages;

import org.openqa.selenium.By;

public class EcranReservation {
    
    private By champSaisieAgence = By.xpath("//*[contains(@class, 'EditText')]");
    private By validationSaisieAgence = By.xpath("//*[contains(text(), 'SÉLECTION')]/parent::*"); // SÉLECTION
    private By selectionDateDepart = By.xpath("//*[contains(@id, 'select_pickup_date_view')]");
    private By dateDepart = By.xpath("//*[contains(text(), '25')]"); // remplacer '25' par la date de départ choisie
    private By dateArrivee = By.xpath("//*[contains(text(), '28')]"); // remplacer '28' par la date d'arrivée choisie
    private By continuerReservation = By.xpath("//*[contains(text(), 'CONTINUER')]");
    private By heureDepart = By.xpath("//*[contains(text(), '11:30')]"); // remplacer '11:30' par l'heure de départ choisie
    private By heureArrivee = By.xpath("//*[contains(text(), '14:30')]"); // remplacer '14:30' par l'heure d'arrivée choisie
    private By selectionVehicule = By.xpath("//*[contains(@id, 'price_container')][1]"); // remplacer [1] par le numéro du véhicule souhaité
    
}