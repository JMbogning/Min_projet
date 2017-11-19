package Java;

public class TechnicienRisque extends Technicien implements Risque{

    public TechnicienRisque(String nom, String prenom, int age, String matricule, double Date_entre, int unites) {
        super(nom, prenom, age, matricule, Date_entre,unites);
    }
    
    public double Calculer_salaire(){
        return super.Calculer_salaire() + prime + salaire;
    }
    
}
