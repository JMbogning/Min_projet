package Java;
import java.util.*;
public class salary {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Que voulez vous faire?");
        System.out.println("1.Afficher salaire de chaque employes");
        System.out.println("2.Afficher le salaire moyen des employes.");
        int a = scan.nextInt();
        
        Personnel p= new Personnel();
            p.ajouterEmploye (new Agent_vente(" MBOGNING ", " Junior ", 20 , " 16B101FS ", 2017 , 2500000));
            p.ajouterEmploye (new Agent_representation (" TCHUIGANG ", " Deric ", 23,  " 16A998FS ", 2017, 2100000 ));
            p.ajouterEmploye (new Technicien (" ANEMETA ", " Don Divin ", 19, " 16B007FS ", 2017, 80000));
            p.ajouterEmploye (new Manutentionaire(" OUSSOUMANOU ", " Benoit ", 19, " 16B187FS ", 2017, 20000));
            p.ajouterEmploye (new TechnicienRisque(" ZOUFANE ", " Z ", 19,  " 16A99FS ", 2017, 250000));
            p.ajouterEmploye (new ManutentionaireRisque(" TABOUA ", " Donald ", 17, " 16A021FS ", 2017, 30000));
        if (a==1){
            
            p.afficherSalaire();            
        }
        else if(a==2) {
            System.out.println(p.Salaire_moyen());
        }
        else{System.out.println("La valeur saisie est incorrecte");}
        
    }
}
    

