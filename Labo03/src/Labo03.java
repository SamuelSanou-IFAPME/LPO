import java.util.ArrayList;
import java.util.Collections;

public class Labo03 {



    static void main() {
        ArrayList<Integer> list = new ArrayList(0);

        list.add(5);
        list.add(0);
        list.add(8);
        list.add(0);
        list.add(12);
        list.add(3);
        Integer count = 0;
        for( Integer i : list){

            if (i == 0){
                count++;
            }
        }
        System.out.println(list);
        System.out.println("Nombre de 0 : "+count);
        list.removeIf(n -> n ==0);
        System.out.println(list);
        list.add(1,7);
        System.out.println(list);
        int index = list.indexOf(8);
        list.set(index,10);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
