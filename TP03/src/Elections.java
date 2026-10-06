public class Elections {
    private float a, b, c, d;

    public Elections(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void initialise(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }


    public String resultatCandidat1() {
        if (a > 50.0f) {
            return "Candidat 1 : Élu au premier tour";
        }
        if (b > 50.0f || c > 50.0f || d > 50.0f || a < 12.5f) {
            return "Candidat 1 : Éliminé au premier tour";
        }
        if (a >= b && a >= c && a >= d) {
            return "Candidat 1 : En ballottage favorable pour le 2d tour";
        } else {
            return "Candidat 1 : En ballottage défavorable pour le 2d tour";
        }
    }

    public void afficheTour2() {
        if (a > 50.0f || b > 50.0f || c > 50.0f || d > 50.0f) {
            System.out.println("Pas de second tour : un candidat est déjà élu.");
            return;
        }

        System.out.println("Candidats qualifiés pour le 2d tour (>= 12.5%) :");
        if (a >= 12.5f) System.out.println("- Candidat 1 (" + a + "%)");
        if (b >= 12.5f) System.out.println("- Candidat 2 (" + b + "%)");
        if (c >= 12.5f) System.out.println("- Candidat 3 (" + c + "%)");
        if (d >= 12.5f) System.out.println("- Candidat 4 (" + d + "%)");
    }

    public static void main(String[] args) {

        Elections e = new Elections(35.5f, 34.6f, 20.0f, 9.9f);

        System.out.println(e.resultatCandidat1());
        System.out.println();
        e.afficheTour2();
    }
}