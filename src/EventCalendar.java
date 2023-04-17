import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EventCalendar {
    private ArrayList<Event> events = new ArrayList<>();


    public void add(Event e) {
        events.add(e);
    }



    public void print(ArrayList<Event> events) {
       Iterator<Event> it = events.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
       }
        System.out.println();
      //  for (Event e : events) {
        //    System.out.println(e);
       // }
    }

    public Event getByTitle(String title) {
        Event withthistitle = null;
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getTitle().equals(title)) {
                withthistitle = events.get(i);
            }

        }
        return withthistitle;
    }

    public ArrayList<Event> getByType(Eventtype type) {
        ArrayList<Event> result = new ArrayList<>();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getType() == (type)) {
                result.add(events.get(i));
            }

        }
        return result;
    }

    public ArrayList<Event> getByOrt(String ort) {
        ArrayList<Event> result = new ArrayList<>();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getOrt().equals(ort)) {
                result.add(events.get(i));
            }
        }
        return result;
    }

    public Event getMostExpensive() {
        double price = 0;
        Event result = events.get(0);
        for (Event e : events) {
            if (e.getPreis() > price) {
                price = e.getPreis();
                result = e;
            }
        }
        return result;
    }

    public void removeExpensiveEvent(double limit) {
        Iterator<Event> it = events.iterator();
        while (it.hasNext()) {
            Event event = it.next();
            if (event.getPreis() > limit) {
                it.remove();
            }
        }
    }


}