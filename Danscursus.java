public class Danscursus {
    private String naam;
    private int Lessen;
    private String niveau;
    private boolean groepscursus;


    public Danscursus() {
        this.naam = "";
        this.Lessen = 0;
        this.niveau = "";
        this.groepscursus = false;
    }
    public Danscursus(String naam, int Lessen, String niveau, boolean groepscursus) {
        this.naam = naam;
        this.Lessen = Lessen;
        this.niveau = niveau;
        this.groepscursus = groepscursus;

    }
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLessen(int Lessen) {
        this.Lessen = Lessen;
    }

    public int getLessen() {
        return Lessen;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }


    public boolean Groepscursus() {
        return groepscursus;
    }

    public void setGroepscursus(boolean groepscursus) {
        this.groepscursus = groepscursus;
    }
}
 public class DanscursusApp {
    public static void main(String[] args) {
        Danscursus cursus = new Danscursus();
        cursus.setNaam("Tango intensief");
        cursus.setNiveau("gevorderd");
        cursus.setGroepscursus(true);
        cursus.setLessen(10);

        Danscursus cursus2 = new Danscursus("Zumba beginners", 15, "beginner", false);


        System.out.println("Naam cursus: " + cursus.getNaam());
        System.out.println("Niveau: " + cursus.getNiveau());
        System.out.println("Groepscursus? " + (cursus.Groepscursus() ? "Ja" : "Nee"));
        System.out.println("Aantal lessen: " + cursus.getLessen());
        System.out.println("Naam cursus: " + cursus2.getNaam());
        System.out.println("Niveau: " + cursus2.getNiveau());
        System.out.println("Groepscursus? " + (cursus2.Groepscursus() ? "Ja" : "Nee"));
        System.out.println("Aantal lessen: " + cursus2.getLessen());

    }
}

