package Java;

public class ManutentionaireRisque extends Manutentionaire implements Risque{

    public ManutentionaireRisque(String nom, String prenom, int age, String matricule, double Date_entre, int heures) {
        super(nom, prenom, age, matricule, Date_entre, heures);
    }
    
    public double Calculer_salaire(){
        return super.Calculer_salaire() + prime + salaire;
    }
            
    
}
