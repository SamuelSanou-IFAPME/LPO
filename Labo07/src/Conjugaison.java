import java.util.ArrayList;

public class Conjugaison extends Verbe {
    private ArrayList<String> sujet;
    private ArrayList<String> terminaison;

    public Conjugaison(String leVerbe) {
        super(leVerbe);

        sujet = new ArrayList<>();
        sujet.add("je");
        sujet.add("tu");
        sujet.add("il/elle");
        sujet.add("nous");
        sujet.add("vous");
        sujet.add("ils/elles");

        terminaison = new ArrayList<>();
        terminaison.add("e");
        terminaison.add("es");
        terminaison.add("e");
        terminaison.add("ons");
        terminaison.add("ez");
        terminaison.add("ent");
    }

    public void affichePresent() {
        String radical = getLeVerbe().substring(0, getLeVerbe().length() - 2);

        for (int i = 0; i < sujet.size(); i++) {
            System.out.println(sujet.get(i) + " " + radical + terminaison.get(i));
        }
    }
}