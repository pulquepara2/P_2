import java.util.Objects;

public class Produkt {
    private String title;
    private double price;
    private double discount;
    private String description;

    public Produkt(String title, double price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public Produkt(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Double.compare(produkt.price, price) == 0 && title.equals(produkt.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }
    public double getPriceWithDiscount(){
        double priceWithDiscount = price - ((price/100)*discount);
        return priceWithDiscount;
    }



    @Override
    public String toString() {
        String result = "title=" + title + " " +
                "price=" + getPriceWithDiscount() + " EUR" + " "+"discount="+discount+"% ";
        if (description != null) {
            result += "description=" + description;
        }
        return result;

    }
}

