package models;

import java.util.ArrayList;

public class Compte {

    private String code;
    private float solde;
    private ArrayList<Operation> operation = new ArrayList<Operation>();

    float montantTVersement = 0;
    float montantTRetrait = 0;


    public Compte(String code, float solde, ArrayList<Operation> operation) {
        this.code = code;
        this.solde = solde;
        this.operation = operation;
    }

    public String getCode() {
        return code;
    }

    public float getSolde() {
        return solde;
    }

    public ArrayList<Operation> getOperation() {
        return operation;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public void setOperation(ArrayList<Operation> operation) {
        this.operation = operation;
    }

    // methode de versement


    public void versement(Versement versement){

        this.solde += versement.getMontant();
        this.setSolde(this.solde);

        this.operation.add(versement);
        this.montantTVersement += versement.getMontant();

        System.out.println("versement éffectué avec succés !!");

    }


    // les methodes de retrait


    public void retraitCompteEpargne(Retrait retrait){

        if (this.solde < retrait.getMontant()) {

            System.out.println("Désolé solde inssufisant pour ce retrait !!");
            
        } else {

            this.solde -= retrait.getMontant();
            this.setSolde(this.solde);
            this.operation.add(retrait);
            this.montantTRetrait += retrait.getMontant();
            System.out.println("retrait éffectué avec succés !! \n \n il vous reste "+this.solde);
            
        }

    }


    public void retraitCompteCourant(Retrait retrait,CompteCourant compteCourant){

        if (compteCourant.getSolde() < compteCourant.getDecouvert()) {

            System.out.println("Désolé solde inférieur au découvert !!");
            
        } else {

            this.solde -= retrait.getMontant();
            this.setSolde(this.solde);
            this.operation.add(retrait);
            this.montantTRetrait += retrait.getMontant();
            System.out.println("retrait éffectué avec succés !! \n \n il vous reste "+this.solde);
            
        }

    }


    // methode de virement

    public void fairevirement(Virement virement){

        if (this.solde<virement.getMontant()) {
            System.out.println("solde insufisant pour ce virement !!");
            
        } else {

            this.solde -= virement.getMontant();
            virement.getCompteEncaisseur().setSolde(virement.getCompteEncaisseur().getSolde()+ virement.getMontant());
            this.operation.add(virement);
            System.out.println("virement éffectué avec succés !!");
            
        }
        

    }

    //  consultation du solde d'un comte 


    public void consultation (){

        System.out.println("le solde de ce compte s'éléve à : "+this.getSolde());

    }

    // consultation des opérations éffectuées sur un compte


    public void consultaionOperation(){
        
        System.out.println("\n\n\t\t ************ liste des opérations : ********\n");

        // for (int i = 0; i < this.operation.size(); i++) {

        //     System.out.println(i);
            
        // }

        for (Operation action : operation) {

            System.out.println(action);
            
        }

    }

    // consuletion des monatant totaux

    public void consultaionMontant(){
        
        System.out.println("\n\n total des versements : "+ this.montantTVersement);
        System.out.println("\n\n total des retraits : "+ this.montantTRetrait);
    }



    

   
  
}
