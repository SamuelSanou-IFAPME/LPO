import java.util.*;

public class Exo2_2{

    static void main() {
        Scanner sc = new Scanner(System.in);

       // System.out.println("Entrez un entier");*/
        int n = 9;
        for (int i = 1; i <n ; i++) {
            System.out.println();
            for (int j = 1; j <n ; j++) {

                if(i==j){
                    System.out.print(" x ");
                }
               else System.out.print(" * ");
            }

        }
        System.out.println();
        System.out.println("-------------");
        System.out.println();
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <n ; j++) {
                if(i==j || i==n-1 || j == 1){
                    System.out.print(" * ");
                }
                else System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------");
        System.out.println();
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <n ; j++) {
                if( i>=j ){
                    System.out.print(" * ");
                }
                else System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------");
        System.out.println();
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <n ; j++) {
                if( i==1 || j==i|| j==n-1 ){
                    System.out.print(" * ");
                }
                else System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------");
        System.out.println();
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <n ; j++) {
                if( i==1 || j==i && i<=n/2|| j>=n/2  &&j+i == n ){
                    System.out.print(" * ");
                }
                else System.out.print("   ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("-------------");
        System.out.println();
        for (int i = 1; i <=n/2 ; i++) {
            for (int j = 1; j <n ; j++) {
                if(j+i <= n && j>=i ){
                    System.out.print(i+":"+j+" ");
                }
                else System.out.print("    ");
            }
            System.out.println();
        }
    }


}