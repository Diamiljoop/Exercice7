
import java.util.Scanner;
public class Operation{
    String date;
    double montant;
    String datetoday="aujourd'hui";
    //creation d'une contructeur avec 2 arguments
    public Operation(String undate, double unmontant){
        this.date=undate;
        this.montant=unmontant;
    }
    // creation d'une seconde constructeur avec montant comme seul argument
    public Operation(double unmontant){
        this.date=datetoday;
        this.montant=unmontant;
    }
    // creation d'une methode tostring
    public String toString(){
        return (montant+" |||"+datetoday);
    }



    
}