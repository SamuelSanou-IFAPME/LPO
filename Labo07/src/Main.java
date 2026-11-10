import java.util.*;
void main() {

    Scanner sc = new Scanner(System.in);
    System.out.println("Donner un verbe régulier du 1er groupe : ");
    Verbe verbe = new Verbe(sc.next());

    while (!verbe.isValide()) {
        System.out.println("Verbe invalide , rééssayer");
        verbe.setLeVerbe(sc.next());
    }

    Conjugaison conj = new Conjugaison(verbe.getLeVerbe());
    conj.affichePresent();
    sc.close();



}