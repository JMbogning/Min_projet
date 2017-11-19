package Java;

public class Service_commerciaux extends Employe{
    protected double Chiffre_affaire;
    private final static double Pourcentage_vendeur= 0.2;
    private final static int Bonus_vendeur= 100;
    
    public Service_commerciaux(String nom, String prenom, int age, String matricule, double date_Entre, double Chriffre_affaire){
        super(nom, prenom, age, matricule, date_Entre);
        this.Chiffre_affaire= Chiffre_affaire;
    }
    
    public double getChiffre_affaire() {
        return Chiffre_affaire;
    }

   
    public double Calculer_salaire() {
        salaire = (Chiffre_affaire * Pourcentage_vendeur)+salaire;
        return salaire;
        
    }
    
}
