

import java.util.*;
public class Labo06 {
    public static Ticket searchTiceket(int id, ArrayList<Ticket> list) {

        for (Ticket i : list) {
            if (i.getId() == id) {
                return i;

            }


        }
        return null;
    }

    static void main() {
        Ticket t1 = new Ticket(101,"pc ne démarre pas");
        Ticket t2 = new Ticket(102,"imprimante hors ligne");
        Ticket t3 = new Ticket (103,"acces réseau impossible");
        ArrayList<Ticket> liste = new ArrayList<>(0);
        liste.add(t1);
        liste.add(t2);
        liste.add(t3);
        for(Ticket t : liste){
            t.decrire();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Rechercher ticket :");
        int id = sc.nextInt();
        System.out.println(searchTiceket(id,liste));

    }
}
