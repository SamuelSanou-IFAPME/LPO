import java.util.*;

public class Exo9
{
    static void main() {
        Scanner sc = new Scanner(System.in);
        float c1;

        System.out.println("Entrez le score du candidat 1");
        c1=sc.nextFloat();


        if(c1 >50){
            System.out.println("Candidat élu !!!");

        }
        else if (c1 <=50 && c1 >= 12.5){
            System.out.println("Le candidat passe au deuxième tour");
        }
        else System.out.println("Le candiidat est battu");


    }
}
