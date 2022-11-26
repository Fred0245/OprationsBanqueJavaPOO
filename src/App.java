import java.util.ArrayList;

import models.CompteCourant;
import models.CompteEpargne;
import models.Operation;
import models.Retrait;
import models.Versement;
import models.Virement;

public class App {
    public static void main(String[] args) throws Exception {

    //    creation des comptes courant

        CompteCourant  compteCourant1 = new CompteCourant("001", 20000, new ArrayList<Operation>(), 500);
        CompteCourant  compteCourant2 = new CompteCourant("002", 70000, new ArrayList<Operation>(), 8000);

        // creation des comptes épargnes

        CompteEpargne  compteEpargne1 = new CompteEpargne("003", 450000, new ArrayList<Operation>(), 10);
        CompteEpargne  compteEpargne2 = new CompteEpargne("004", 9000, new ArrayList<Operation>(), 80);

        // instanciation des versements 

        Versement versement1 = new Versement(1,"11-05-2022",10000);
        Versement versement2 = new Versement(2,"11-07-2022",80000);

        // instanciation des retraits

        Retrait retrait1 = new Retrait(1,"11-04-2021",1000);
        Retrait retrait2 = new Retrait(2,"18-09-2021",9500);

        // opérations de versement 

        compteCourant1.versement(versement2);
        compteCourant1.versement(versement1);
        compteCourant2.versement(versement1);
        compteCourant1.consultaionOperation();

        Virement v = new Virement(1, "17-06-2021", 7000, compteEpargne2);

        compteEpargne1.fairevirement(v);

       
        
    }
}
