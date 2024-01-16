import java.util.Random;  // import du package
class Exemplecompte{
    public static void main(String []args){
        //creation d'un objer par defaut
        Compte exemple1=new Compte();
        // creation d'un objet avec parametre
        Compte exemple2=new Compte(01,'g',10000);
        System.out.println(exemple1.toString());
        System.out.println(exemple2.toString());


    }
}