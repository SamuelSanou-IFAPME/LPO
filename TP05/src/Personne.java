public class Personne {
    private int age;
    private String nom;

    public Personne(int age, String nom) {
        this.age = age;
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }
    public void afficherPersonne(){
        System.out.println("Nome : "+nom+" Age : "+age);
    }
    public void comparePersonne(Personne a ,Personne b ){
        System.out.println((a.getAge()>b.getAge())?a.getNom()+"Est plus agé que "+b.getAge():a.getNom()+"Est plus jeune que "+b.getAge());
    }
}

