package Java;

public class Agent_vente extends Service_commerciaux{
    private final static double Pourcentage_vendeur= 0.2;
    private final static int Bonus_vendeur= 100;
    
    public Agent_vente(String nom, String prenom, int age, String matricule, double Date_Entre, double Chiffre_affaire){
        super( nom, prenom, age, matricule, Date_Entre, Chiffre_affaire);
        
    }

    public double Calculer_salaire() {
        super.Calculer_salaire();
        return (Pourcentage_vendeur * Chiffre_affaire +Bonus_vendeur + salaire);
        
    }
    
            
    
    
}
