public class Verbe {
    private String leVerbe;


    public Verbe(String leVerbe) {
        this.leVerbe=leVerbe;
    }

    public String getLeVerbe() {
        return leVerbe;
    }

    public void setLeVerbe(String leVerbe) {
        this.leVerbe = leVerbe;
    }

    public boolean isValide() {
        return leVerbe.endsWith("er");
    }
}