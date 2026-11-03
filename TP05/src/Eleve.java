public class Eleve {
    private String nom;
    private float pourcentage;

    public Eleve(String nom, float pourcentage) {
        this.nom = nom;
        this.pourcentage = pourcentage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(float pourcentage) {
        this.pourcentage = pourcentage;
    }
}
