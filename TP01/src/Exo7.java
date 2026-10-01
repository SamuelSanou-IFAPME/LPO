
import java.util.*;
import java.lang.*;
public class Exo7 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Introduire nombre 1");
        n1=sc.nextInt();
        System.out.println("Introduire nombre 2");
        n2 = sc.nextInt();

        int max = Math.max(n1,n2);
        System.out.println("Le plus grand est "+max);
    }
}
