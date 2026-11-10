public class Compte {

    private String numero;
    private float solde;
    private float taux;
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSolde() {
        return solde;
    }
    public float getTaux(){
        return taux;
    }
    public void setSolde(float solde) {
        this.solde = solde;
    }

    public Compte(String numero, float solde, float taux) {
        this.numero = numero;
        this.solde = solde;
        this.taux=taux;
    }

    public void afficherSolde(){
        System.out.println("votre solde est : "+solde+" €");


    }
    public void crediter(float montant){

        this.setSolde(this.getSolde()+montant);
        afficherSolde();
    }
    public void debiter(float montant){
        this.setSolde(this.getSolde()-montant);
        afficherSolde();
    }
    public float calculInteret(){
        float val = this.getSolde();
        val = val*(this.getTaux()/100);

        return val;
    }


}
