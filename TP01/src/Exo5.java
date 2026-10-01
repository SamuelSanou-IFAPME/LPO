import java.util.*;
import java.lang.*;

public class Exo5 {
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
        System.out.println("Introduire le rayon : ");
         float r = sc.nextFloat();
         float s, c;
         s = (float)(Math.PI*r*r);
         c = (float) (2*Math.PI*r);
        System.out.println("Surface : " + s);
        System.out.println("Circonférence : " + c);


    }
}
