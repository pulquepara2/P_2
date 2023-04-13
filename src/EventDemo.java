import java.util.ArrayList;

public class EventDemo {
    public static void main(String[] args) {
        EventCalendar kalender = new EventCalendar();
        kalender.add(new Event("Requiem", Eventtype.KONZERT, "Wien", 73.49));
        kalender.add(new Event("Schottische Highlands",Eventtype.REISE, "Inverness",1760 ));
        kalender.add(new Event("Java verstehen", Eventtype.KONZERT, "Graz", 39));
        kalender.add(new Event("NocheinEvent", Eventtype.VORTRAG, "Graz", 102));

        System.out.println("Kalender:");
        kalender.print();
        System.out.println("nach Ort");
        System.out.println(kalender.getByOrt("Graz"));
        System.out.println("nach Typ");

        ArrayList<Event> typ = kalender.getByType(Eventtype.KONZERT);
        kalender.print(typ);

        System.out.println("Nach Titel");
        System.out.println(kalender.getByTitle("haha"));


    }
}
