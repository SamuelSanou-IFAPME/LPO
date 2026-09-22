import java.util.*;
import java.lang.*;
void main() {

    Scanner sc = new Scanner(System.in);
    System.out.println("====== DISTRIBUTEUR DE BOISSONS ======\n" +
            "1. Eau : 1,00 €\n" +
            "2. Café : 1,50 €\n" +
            "3. Thé : 1,50 €\n" +
            "4. Chocolat chaud : 2,00 €\n" +
            "0. Annuler\n" +
            "404. Quitter le programme\n" +
            "=====================================\n" +
            "Votre choix :");
    int choice = sc.nextInt();
    double prix = 0;
    double pay = 0.0;
    boolean status = false;
    String name = "";
    double reste = 0;

    while (choice != 404) {
        while (!status) {

            switch (choice) {
                case 404:
                    System.out.println("Exit ...");
                    System.exit(0);
                case 0:
                    status = true;
                    System.out.println("Commande annulée");
                    break;

                case 1:
                    prix = 1;
                    status = true;
                    name = "Eau";
                    break;
                case 2:
                    prix = 1.50;
                    status = true;
                    name = "Café";
                    break;
                case 3:
                    prix = 1.50;
                    status = true;
                    name = "Thé";
                    break;
                case 4:
                    prix = 2;
                    status = true;
                    name = "Chocolat chaud";
                    break;
                default:
                    System.out.println("Choix invalide\n" + "Veuillez sélectionner un numéro de 1 a 4");
                    choice = sc.nextInt();
            }
        }


            if (choice != 0) {
                System.out.println(name + ": " + prix);
                System.out.println("Veuillez payer");
                pay = sc.nextDouble();
                if (pay >= prix) {
                    reste = pay - prix;
                    System.out.println("Voila votre " + name);
                    System.out.println("Monnaie rendue: " + reste);
                    status = false;
                    System.out.println("Votre choix : ");
                    choice = sc.nextInt();
                } else {
                    reste = prix - pay;
                    System.out.println("Montant insufisant, il manque : " + reste);
                    status = false;
                    System.out.println("Votre choix : ");
                    choice = sc.nextInt();


                }
            } else {
                status = false;
                System.out.println("Votre choix : ");
                choice = sc.nextInt();

            }
        }
    }


