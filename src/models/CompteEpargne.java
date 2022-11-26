package models;

import java.util.ArrayList;

public class CompteEpargne extends Compte {

    private float tauxInteret;

    public CompteEpargne(String code, float solde, ArrayList<Operation> operation, float tauxInteret) {
        super(code, solde, operation);
        this.tauxInteret = tauxInteret;
    }

    public float getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(float tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    //  methode de mis à jour du compte 

    public float miseAjourCompte(){

        return (this.getSolde()* this.tauxInteret)/100;
        
    }

   


    
    
}
