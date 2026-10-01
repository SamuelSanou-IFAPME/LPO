import java.util.*;
public class Exo3 {
    public static void main(){
        int n ;
        System.out.println("Entrez un nombre entier");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        if(n%2 == 0){
            System.out.println(n+ " est pair");
        }
        else System.out.println(n+" est impair");
    }
}
