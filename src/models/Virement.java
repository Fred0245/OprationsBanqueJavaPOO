package models;

public class Virement extends Operation {

    private Compte compteEncaisseur;


    public Virement(int numero, String date, float montant, Compte compteEncaisseur) {
        super(numero, date, montant);
        this.compteEncaisseur = compteEncaisseur;
      
    }

    public Compte getCompteEncaisseur() {
        return compteEncaisseur;
    }

  

    public void setCompteEncaisseur(Compte compteEncaisseur) {
        this.compteEncaisseur = compteEncaisseur;
    }

 
    
}
