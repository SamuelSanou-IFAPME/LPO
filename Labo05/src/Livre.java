public class Livre {
    private String titre;
    private String auteur;
    private boolean emprunte;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Boolean getEmprunte() {
        return emprunte;
    }

    public void setEmprunte() {
        this.emprunte = true;
    }

    public void retourner(){
        this.emprunte = false;
    }


    public String decrire() {
        return this.getTitre()+" "+this.getAuteur() +" "+ this.getEmprunte();

    }
}
