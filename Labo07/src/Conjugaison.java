import java.util.ArrayList;
import java.util.List;

public class Conjugaison  {
    public static ArrayList<String> terminaison = new ArrayList<>(List.of("e","es","e","ons","ez","ent"));
    public static ArrayList<String> sujet = new ArrayList<>(List.of("je","tu","il/elle","nous","vous","ils/elles"));


    public static void affichePresent(Verbe verbe) {
        String radical = verbe.getLeVerbe().substring(0, verbe.getLeVerbe().length() - 2);

        for (int i = 0; i < sujet.size(); i++) {
            System.out.println(sujet.get(i) + " " + radical + terminaison.get(i));
        }
    }
}