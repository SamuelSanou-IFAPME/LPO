import java.util.ArrayList;
import java.util.Scanner;

public class Labo04 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean actif = true;

        while (actif) {
            System.out.println("\n1 Ajouter / 2 Afficher / 3 Supprimer / 4 Rechercher / 0 Quitter");
            System.out.print("Votre choix : ");
            String choix = sc.nextLine();

            switch (choix) {
                case "2": // Afficher
                    if (list.isEmpty()) {
                        System.out.println("Liste vide");
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println("Tache numéro " + (i + 1) + " : " + list.get(i));
                        }
                    }
                    break;

                case "3": // Supprimer
                    if (list.isEmpty()) {
                        System.out.println("La liste est déjà vide.");
                        break;
                    }
                    System.out.print("Supprimer tache avec son numéro : ");
                    try {
                        int sup = Integer.parseInt(sc.nextLine()) - 1;
                        if (sup < 0 || sup >= list.size()) {
                            System.out.println("Numéro pas dans la liste");
                        } else {
                            String removed = list.remove(sup);
                            System.out.println("Tâche supprimée : " + removed);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Veuillez entrer un nombre valide.");
                    }
                    break;

                case "1": // Ajouter
                    System.out.print("Tache a ajouter : ");
                    String tache = sc.nextLine();
                    list.add(tache);
                    System.out.println("Tâche ajoutée avec succès !");
                    break;

                case "4": // Rechercher
                    System.out.print("Mot a rechercher : ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (String i : list) {
                        if (i.contains(search)) {
                            System.out.println("- " + i);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Aucune tâche ne correspond à cette recherche.");
                    }
                    break;

                case "0": // Quitter
                    actif = false;
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide");
            }
        }
        sc.close();
    }
}