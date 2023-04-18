import java.util.*;

public class ProduktShop {
    HashMap<String, Produkt> produkte = new HashMap<>();

    @Override
    public String toString() {
        return "ProduktShop{" +
                "produkte=" + produkte +
                '}';
    }

    public void add(Produkt p) {
        produkte.put(p.getTitle(), p);
    }

    public Produkt get(String title) {
        Produkt p = produkte.get(title);
        if (p == null) {
            System.out.println("Nicht gefunden");
        }

        return p;
    }

    public boolean gibtsGratis() {
        for (Produkt p : produkte.values()) {
            if (p.getDiscount() == 100) {
                return true;
            }
        }
        for (String key : produkte.keySet()) {
            Produkt p = produkte.get(key);
            if (p.getDiscount() == 100) {
                return true;
            }
        }
        for (Map.Entry<String, Produkt> e : produkte.entrySet()) {
            Produkt p = e.getValue();
            if (p.getDiscount() == 100) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Produkt> getPriceFrom(double from) {
        ArrayList<Produkt> result = new ArrayList<>();
        for (Produkt p : produkte.values()) {
            if (p.getPrice() >= from) {
                result.add(p);
            }

        }
        return result;
    }

    public ArrayList<Produkt> getPriceTo(double to) {
        ArrayList<Produkt> result = new ArrayList<>();
        for (Produkt p : produkte.values()) {
            if (p.getPrice() <= to) {
                result.add(p);
            }

        }
        return result;
    }

    public void removeProductsFromByIterator(double from) {
        Iterator<Map.Entry<String, Produkt>> it = produkte.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Produkt> e = it.next();
            Produkt p = e.getValue();
            if (p.getPrice() > from) {
                it.remove();
            }
        }
    }
    //beide Methoden machen das gleiche
    public void removeProductsByKeySet(double from){
        Set<String> keys = new HashSet<>();
        for(Produkt p : produkte.values()){
            if(p.getPrice() > from){
                keys.add(p.getTitle());
            }
        }
    }
}
