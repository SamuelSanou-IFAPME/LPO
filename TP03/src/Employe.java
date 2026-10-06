public class Employe {
    // 1. Déclaration des attributs d'instance
    private String nom;
    private boolean acompte;
    private int nbHeures;
    private float salaireHoraire;

    // Constructeur
    public Employe(String nom, boolean acompte, int nbHeures, float salaireHoraire) {
        this.nom = nom;
        this.acompte = acompte;
        this.nbHeures = nbHeures;
        this.salaireHoraire = salaireHoraire;
    }

    public void initialise(String nom, boolean acompte, int nbHeures, float salaireHoraire) {
        this.nom = nom;
        this.acompte = acompte;
        this.nbHeures = nbHeures;
        this.salaireHoraire = salaireHoraire;
    }

    // Utilise les attributs de l'objet (this) au lieu de passer des arguments
    public void demandeAcompte() {
        if (!this.acompte) {
            System.out.println("Ok, " + this.nom + " on vous verse 500€");
            this.acompte = true;
        } else {
            System.out.println("Désolé, " + this.nom + " : un seul acompte par mois !!!");
        }
    }

    // Ajoute le nombre d'heures effectuées au cumul du mois
    public void travaille(int heuresAjoutees) {
        this.nbHeures += heuresAjoutees;
        System.out.println(this.nom + " : " + this.nbHeures + " heures ce mois-ci");
    }

    // Calcule et affiche le salaire total
    public float salaire() {
        float salaire = this.acompte
                ? (this.nbHeures * this.salaireHoraire) - 500
                : (this.nbHeures * this.salaireHoraire);
        return salaire;
    }

    public static void main(String[] args) {
        Employe moi = new Employe("Samuel", false, 0, 55.25f);

        moi.travaille(10);
        moi.travaille(8);
        System.out.println("Salaire de " + moi.nom + " : " + moi.salaire() + "€");
        moi.demandeAcompte();
        System.out.println("Salaire de " + moi.nom + " : " + moi.salaire() + "€");
        moi.demandeAcompte();
        System.out.println("Salaire de " + moi.nom + " : " + moi.salaire() + "€");
    }
}