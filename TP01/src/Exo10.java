import java.util.Scanner;

public class Exo10 {
    static void main() {
        int age, sexe;
        String cat;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez l'age");
        age = sc.nextInt();
        System.out.println("Entrez le sexe (homme : 1 , femme : 2");
        sexe = sc.nextInt();
        if (age >= 25) {

            cat = (sexe == 1) ? "Senior" : "Ainée";


        }else if (age >= 16) {
                cat = (sexe == 1) ? "Jeune homme" : "Jeune dame";
            }
        else cat = (sexe == 1) ? "Espoir homme" : "Espoir femme";
        System.out.println("Votre catégorie est : " +cat);
    }

    }
