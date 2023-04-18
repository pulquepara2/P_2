public class StudentWG extends PersonWG{
    private String studium;
    private int matrikelnummer;

    public StudentWG(String name, int alter, String studium, int matrikelnummer) {
        super(name, alter);
        this.studium = studium;
        this.matrikelnummer = matrikelnummer;
    }
}
