public class SpezialisierterArzt extends Arzt {
   private double zuschlag;

    public SpezialisierterArzt(String name, int gehalt, double zuschlag) {
        super(name, gehalt);
        this.zuschlag = zuschlag;
    }

    public double getGehalt() {
        double neuesGehalt = super.getGehalt() * (1 + zuschlag);
        return neuesGehalt;
    }
}
