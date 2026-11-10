import java.util.*;
void main() {

    ArrayList<Compte> tab = new ArrayList<>(0);

    CompteCourant cc = new CompteCourant("BE124586646",1000,150,1f);
    CompteEpargne ce = new CompteEpargne("DE9999888899",50000,2.5f);
    tab.add(cc);
    tab.add(ce);

    for (Compte compte : tab){

        compte.afficherSolde();
        System.out.println(compte.calculInteret());
        compte.debiter(10000);



    }
}
