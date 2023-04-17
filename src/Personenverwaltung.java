public class Personenverwaltung {
    private Person[] personen;
    private int anzahl = 0;

    public Personenverwaltung(int anzahl) {
        personen = new Person[anzahl];
    }

    // public void fuegePersonHinzu (Person p){
    //   for (int i = 0; i < personen.length ; i++) {
    //     if (personen[i] == null){
    //       personen[i] = p;
    //     break;
    // }
    //}

    public void fuegePersonHinzu(Person p) {
        if (anzahl < personen.length) {
            personen[anzahl] = p;
            anzahl++;
        }
    }
    public Person lieferePersonmitID(int id){
        for (int i = 0; i < personen.length ; i++) {
            if (personen[i].getId() == id){
                return personen[i];
            }

        }
        return null;
    }
    public void entfernePersonmitID(int id){
        for (int i = 0; i < personen.length ; i++) {
            if(personen[i].getId() == id){
                personen[i] = null;
                break;
        }

        }
    }
}
