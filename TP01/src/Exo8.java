import java.util.Scanner;

import java.lang.*;


public class Exo8 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez une heure format 00h00");
     String input =    sc.next();
     String[] array = input.split("h");

     int h = Integer.parseInt(array[0]);
     int m = Integer.parseInt(array[1]);


     if (m == 59){
         m = 00;
         h +=1;

     }
     else {
         m ++;
     }

        System.out.println("Dans une minute , il sera : "+h+"h"+m);



    }

}
