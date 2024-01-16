import java.util.*;
public class Tabmontant{

    public static void main(String [] args){
      
       int [] tabelement=new int[5];
       //instanciation del classe Random 
       Random nombrealeatoire=new Random();
       
        
        for(int i=0;i<5;i++){
            // pour generer des nonmbre aleatoires entre 1 et 10 comme exemple 
            tabelement[i]=nombrealeatoire.nextInt((10-1)+1)+1; 
        }
        for(int i=0;i<5;i++){
            
            System.out.println(tabelement[i]);
        }
        //  array.sort permet le triage du tableau en ordre croissant source:javadoc
        Arrays.sort(tabelement);
        // array.tostring permet l'affichage 
        System.out.println("Apres triage");
        System.out.println(Arrays.toString(tabelement));
        


    }

}