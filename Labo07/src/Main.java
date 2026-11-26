import java.util.*;
void main() {

    Scanner sc = new Scanner(System.in);
    System.out.println("Donner un verbe régulier du 1er groupe : ");
    String in =  sc.next();


    while (! (in.length()>3 && in.endsWith("er"))) {
        System.out.println("Verbe invalide , rééssayer");
        in = sc.next();
    }
    Verbe verbe =  new Verbe(in);
    Conjugaison.affichePresent(verbe);
    sc.close();



}