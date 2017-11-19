
package Java;

public class Technicien extends Employe{
    private final static double Facteur_unite= 5.0;
    private int unites;

   public Technicien(String nom, String prenom, int age,String matricule, double Date_entre, int unites){
        super(nom, prenom, age, matricule, Date_entre);
        this.unites= unites;
    
    }
 
    public double Calculer_salaire() {
       return (Facteur_unite * unites) + salaire; 
    }

    
    
}
