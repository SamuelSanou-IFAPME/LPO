public class CompteEpargne extends Compte{

    public CompteEpargne(String numero, float solde,float taux) {
        super(numero, solde,taux);

    }




    @Override
    public void debiter(float montant) {

        if(this.getSolde()-montant <0){
            System.out.println("Le solde ne peut pas passer en dessous de 0 !");
        }
        else{
            this.setSolde(this.getSolde()-montant);
            afficherSolde();
        }
    }
}

