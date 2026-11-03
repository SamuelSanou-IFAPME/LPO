public class Ticket {
    private int id;
    private String description;
    private boolean traite;

    public Ticket(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isTraite() {
        return traite;
    }
    public void marquerTraite(){
        this.traite = true;
    }
    public void decrire(){
        System.out.println(this.getId()+" "+this.getDescription()+" "+this.isTraite());
    }

}
