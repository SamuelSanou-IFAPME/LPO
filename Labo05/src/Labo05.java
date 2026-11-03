import java.util.*;

public class Labo05 {
    static void main() {
        ArrayList<Livre> catalogue = new ArrayList();
       Livre livre1 = new Livre("java pour débuter","A.Martin");
       Livre livre2 = new Livre ("Comprendre les réseaux","S.Diallo");
       Livre livre3 =new Livre ("Sql pratique","L.Bernard");

        catalogue.add(livre1);
        catalogue.add(livre2);
        catalogue.add(livre3);
        System.out.println("Catalogue complet :");
        for(Livre l : catalogue){
            System.out.println("- "+l.decrire());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Chercher un livre par son titre :");
        for ( Livre l : catalogue){
            if(l.getTitre().contains(sc.nextLine())){
                System.out.println("Livre trouvé : ");
                System.out.println(l.decrire());
                l.setEmprunte();
                System.out.println("Le livre est désormais emprunté");
                break;
            }
        }
        System.out.println("Catalogue disponible :");
        int nonDispo = 0;
        for (Livre l : catalogue){

            if(l.getEmprunte()==false){
                System.out.println(l.decrire());
            }
            else nonDispo++;

        }
        System.out.println("Nombre de livres non disponible : "+nonDispo);
    }
}
