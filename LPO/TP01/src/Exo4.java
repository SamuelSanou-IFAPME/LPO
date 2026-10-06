import java.util.*;

public class Exo4 {
    public static void main(){
        float n1,n2,n3,moyFloat;
        int moyInt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduire note 1");
        n1 = sc.nextInt();
        System.out.println("Introduire note 2");
        n2 = sc.nextInt();
        System.out.println("Introduire note 3");
        n3 = sc.nextInt();

        moyInt = (int)((n1 +n2 +n3)*5)/3;
        moyFloat=(n1 +n2 +n3)/3;
        System.out.println("Moyenne sur 20 "+moyFloat);
        System.out.println("moyenne sur 100 "+moyInt);

    }
}
