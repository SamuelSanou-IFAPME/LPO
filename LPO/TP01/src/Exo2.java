import java.util.*;
import java.lang.*;
public class Exo2
{
    public static void main(String[] args){
        int s,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez une valeur en secondes");
        s=sc.nextInt();
        m = s/60;
        s=s%60;
        System.out.println("Cela vaut "+m+" min utes et "+s+" secondes");
}
}
