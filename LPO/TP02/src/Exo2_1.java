import java.util.Scanner;

public class Exo2_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un entier");
        int n = sc.nextInt();
        for (int i = 1; i < 11; i++) {

            System.out.println(i + " x " + n + " = "+i * n);


        }
    }
}