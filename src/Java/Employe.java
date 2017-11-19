package Java;

public abstract class Employe  {
    String nom;
    String prenom;
    private int age;
    private double Date_entre;
    protected double  salaire=110000;
    private String matricule;
    
     public Employe(String nom, String prenom, int age,String matricule, double Date_entre ) {
        this.nom= nom;
        this.prenom= prenom;
        this.age= age;
        this.matricule= matricule;
        this.Date_entre= Date_entre;

    }
  

    public String getNom(){
        return "L'employe " +nom+ " " +prenom;
    }
    public abstract double Calculer_salaire();
   
}

  
