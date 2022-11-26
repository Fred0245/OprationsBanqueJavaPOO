package models;

import java.util.ArrayList;

public class CompteCourant extends Compte {

    private float decouvert;

    
    public CompteCourant(String code, float solde, ArrayList<Operation> operation, float decouvert) {
        super(code, solde, operation);
        this.decouvert = decouvert;
    }


    public float getDecouvert() {
        return decouvert;
    }

   
    public void setDecouvert(float decouvert) {
        this.decouvert = decouvert;
    }
   
    
}
