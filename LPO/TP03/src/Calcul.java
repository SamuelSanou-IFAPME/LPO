public class Calcul {

    private int n1;
    private int n2;

    public Calcul(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int somme() {
        return this.n1 + this.n2;
    }

    public int produit() {
        return this.n1 * this.n2;
    }

    public void affiche(int valeur) {
        System.out.println(valeur);
    }

    public static void main(String[] args) {
        Calcul c = new Calcul(10, 15);
        c.affiche(c.somme());
        c.affiche(c.produit());
    }
}