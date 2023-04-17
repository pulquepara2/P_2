public class PersonTest {
    public static void main(String[] args) {
        Personenverwaltung personenverwaltung  = new Personenverwaltung(10);
        personenverwaltung.fuegePersonHinzu(new Person(1,"Max"));
        Person p = personenverwaltung.lieferePersonmitID(1);
        System.out.println(p);
        personenverwaltung.fuegePersonHinzu(new Person(2,"Luisa"));
        personenverwaltung.entfernePersonmitID(1);



    }
}
