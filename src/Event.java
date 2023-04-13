public class Event {
   private String title;
   private Eventtype type;
   private String Ort;
   private double Preis;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Eventtype getType() {
        return type;
    }

    public void setType(Eventtype type) {
        this.type = type;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public double getPreis() {
        return Preis;
    }

    public void setPreis(double preis) {
        Preis = preis;
    }

    public Event(String title, Eventtype type, String ort, double preis) {
        this.title = title;
        this.type = type;
        Ort = ort;
        Preis = preis;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", type=" + type +
                ", Ort='" + Ort + '\'' +
                ", Preis=" + Preis +
                '}';
    }
}
