package models;

public class Operation {

    private int numero;
    private String date;
    private float montant;

    public Operation(int numero, String date, float montant) {
        this.numero = numero;
        this.date = date;
        this.montant = montant;
    }

    public int getNumero() {
        return numero;
    }

    public String getDate() {
        return date;
    }

    public float getMontant() {
        return montant;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Operation [numero=" + numero + ", date=" + date + ", montant=" + montant + "]";
    }

    
    
    
}
