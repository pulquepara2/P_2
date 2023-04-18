import java.util.ArrayList;

public class Wohngemeinschaft {
   private Adresse adresse = new Adresse("Sandrockgasse", 4, "Wien", 1210);
   private ArrayList<Person> personen = new ArrayList<>();

    public Wohngemeinschaft(Adresse adresse, ArrayList<Person> personen) {
        this.adresse = adresse;
        this.personen = personen;
    }

    public void addAddress(Person p){
       personen.add(p);
   }

}
