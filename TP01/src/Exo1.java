import java.util.*;
import java.lang.*;


public class Exo1 {


    public static void main(String[] args)

    {
        double h,b,s;

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez introduire la hauteur du triangle");
        h=sc.nextDouble();
        System.out.println("Veuillez intrdouire la base du triangle");
        b=sc.nextDouble();
        s=(h*b)/2;

        System.out.println("La surface du triangle est de " + s);
    }
}