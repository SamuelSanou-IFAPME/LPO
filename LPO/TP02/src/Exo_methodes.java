public class Exo_methodes {

        static void pourcentages(int n1, int n2, int n3) {
        System.out.println("Moyenne pondérée : ");

        double moyenne = ((n1 * 10) + (n2 * 20) + (n3 * 70)) / 100.0;
        System.out.println(moyenne);
    }

    static void factorielle(int n1) {
            int f =1;
            while(n1>1){
                f = f * n1;
                n1--;
        }
        System.out.println(f);
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = 12;


        pourcentages(n1, n2, n3);
        n1=4;
        factorielle(n1);
    }
}