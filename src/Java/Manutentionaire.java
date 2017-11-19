
package Java;

public class Manutentionaire extends Employe{
    private final static double Salaire_horaire= 65.0;
    private int heures;
    
    public Manutentionaire(String nom, String prenom, int age, String matricule, double Date_entre, int heures){
        super(nom, prenom, age, matricule, Date_entre);
        this.heures= heures;
        
    }
    
    public double Calculer_salaire(){
        return (int)(Salaire_horaire * heures) + salaire;
    }
    

    
}
