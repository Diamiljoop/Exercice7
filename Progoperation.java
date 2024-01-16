import java.util.Scanner;

public class Progoperation{
    public static void main(String[] args) {
        // Creation d'une tableau de 50 objets
        Operation[] tabOperation=new Operation[50];
        Scanner sc=null;
        int choix;
       
        do{
            sc=new Scanner(System.in);
            // apercu du menu
            System.out.println("0.Quitter");
            System.out.println("1.Voir les operations");
            System.out.println("2.Ajouter une operation");
            System.out.println("Donner votre choix: ");
            choix=sc.nextInt();
            switch (choix) {
                case 1:
                for(int i=0;i<50;i++){
                    System.out.println(tabOperation[i]);
                    if(tabOperation[i]==null){
                        break;
                    }
                }
                break;
                case 2:
                // demander a l'utilisateur de donner le montant 
                System.out.println("Donner votre montant");
                double montantuser=sc.nextDouble();
                 //creation d'objet al'indice se referant du deuxieme constructeur
                tabOperation[0]=new Operation(montantuser);
                // appel de la methode tostring pour l'affichage de la case
                tabOperation[0].toString();

                break;
                
               
            }

        }while(choix!=0);
    }
}