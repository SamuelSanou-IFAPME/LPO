public class CompteCourant extends Compte{
    private float seuil;
    public CompteCourant(String numero, float solde, float seuil, float taux) {
        super(numero, solde,taux);
        this.seuil = seuil;

    }

    public float getSeuil() {
        return seuil;
    }

    public void setSeuil(float seuil) {
        this.seuil = seuil;
    }

    @Override
    public void debiter(float montant) {

        if (this.getSolde()-montant < getSeuil()){
            System.out.println("Le montant demandé passe en dessous du seuil défini");
        }
        else {
            this.setSolde(this.getSolde()-montant);
            afficherSolde();
        }
    }
}
