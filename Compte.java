class Compte{
    //declaration des attributs.
    private int numero;
    private char type_compte;
    private double solde;
    private int code_secret;
    // creation d'une constructeur par defaut sans argument.
    public Compte(){
        this.numero=999999;
        this.type_compte=' ';
        this.solde=0;
        this.code_secret=0;
    }
    // creation d'une methode qui genere une code entre 100 et 9999.
    public int attribucode(){
        code_secret=100+((int) Math.random()*9999);
        return code_secret;
    }
    // creation d'une constructeur avec argument .
    public Compte(int unnumero, char untype_compte, double unsolde){
        this.numero=unnumero;
        if(untype_compte=='E' || untype_compte=='D'){
            this.type_compte=untype_compte;
        }
        else{
            this.type_compte=' ';

        }
        this.solde=unsolde;
        this.code_secret=attribucode();
    }
    // creation d'une modificateur qui modifie le numero
    public void setNumero(int numero){
        this.numero=numero;    
    }
    // creation d'une modificateur qui modifie le type de compte
    public void setNumero(char type_compte){
        this.type_compte=type_compte;    
    }

    // cretion d'une accesseur pour le numero 
    public int getNumero(){
        return numero;
    }
    // cretion d'une accesseur pour  le code secret
    public int getCodesecret(){
        return code_secret;
    }
    //methode supplementaire tostring pour verifier les differents methodes
    public String toString(){
        return (numero+" "+type_compte+" "+solde+" "+code_secret);
        }



}