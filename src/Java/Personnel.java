package Java;

public class Personnel {
     
    private Employe[] collection;
    private int Nbre_employe; 
    private final static int Nbre_max_employe=100;
    
    public Personnel(){
        //mon tableau est appelé colection 
        
        collection= new Employe[Nbre_max_employe];
        Nbre_employe= 0;
    } 
    public void ajouterEmploye(Employe e){
        Nbre_employe++;
        
         if(Nbre_employe <= Nbre_max_employe)
        {
            collection[Nbre_employe-1]=e;
        } 
        else 
            System.out.println("pas plus de " +Nbre_max_employe + " employés "); 
    }
    public double Salaire_moyen(){
        double somme= 0.0;
        
        for(int i=0; i<Nbre_employe; i++){
            somme += collection[i].Calculer_salaire();
        } 
        return (somme/Nbre_employe);
    }
    public void afficherSalaire(){
         for(int i=0; i<Nbre_employe; i++){
            System.out.println(collection[i].getNom()+" à un salaire de: " + collection[i].Calculer_salaire()+ "FCFA");
        }
    }
}

    