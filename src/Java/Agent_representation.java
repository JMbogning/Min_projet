package Java;

public class Agent_representation extends Service_commerciaux {
    private final static double Pourcentage_representant= 0.2;
    private final static int Bonus_representant= 200;

    public Agent_representation(String nom, String prenom, int age, String matricule, double Date_Entre, double Chriffre_affaire) {
        super(nom, prenom, age, matricule, Date_Entre, Chriffre_affaire);
    }
    
    public double CalculerSalaire(){
        return (Pourcentage_representant * getChiffre_affaire() + Bonus_representant + salaire);
    }
    
}
