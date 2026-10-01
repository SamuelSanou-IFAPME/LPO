import java.util.Scanner;

public class Exo2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = 55;
        int max = 8;
        boolean trouve = false;

        while(!trouve && max!=0) {
            System.out.println("essai " + max + " :");
            int guess = sc.nextInt();
            System.out.println("guess : " + guess);

            if (guess == n) {
                System.out.println("Bravo ! Vous avez trouvé le nombre " + n);
                trouve = true;
            } else if (guess < n) {
                System.out.println("Trop petit !");
            } else {

                System.out.println("Trop grand !");
            }
            max--;
            System.out.println("Nombre d'essais restant : "+max);

        }

        if (!trouve) {
            System.out.println("Perdu ! Le nombre était " + n);
        }
    }
}