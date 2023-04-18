public class Arzt {
    protected String name;
    private double Gehalt;

    public Arzt(String name, int gehalt) {
        this.name = name;
        Gehalt = gehalt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGehalt() {
        return Gehalt;
    }

    public void setGehalt(double gehalt) {
        Gehalt = gehalt;
    }

    @Override
    public String toString() {
        return "Arzt{" +
                "name='" + name + '\'' +
                ", Gehalt=" + Gehalt +
                '}';
    }
}
