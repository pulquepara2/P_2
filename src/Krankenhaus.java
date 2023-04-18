import java.util.ArrayList;

public class Krankenhaus {
    ArrayList<Arzt> aerzte = new ArrayList<>();


    @Override
    public String toString() {
        return "Krankenhaus{" +
                "aerzte=" + aerzte +
                ", kh=" +
                '}';
    }

    public void addArzt(Arzt arzt) {
        aerzte.add(arzt);
    }

    public ArrayList<Arzt> getAerzte() {
        return aerzte;
    }

    public void print() {
        for (Arzt a : aerzte) {
            System.out.println(a.getName() + " verdient " + a.getGehalt());
        }
    }
}