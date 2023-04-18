public class ProduktDEmo {
    public static void main(String[] args) {


        Produkt produkt1 = new Produkt("Produkt 1", 1200);
        produkt1.setDiscount(20);
        produkt1.setDescription("Produkt 1 aus Shop A");
        System.out.println(produkt1.getPriceWithDiscount());
        System.out.println(produkt1);

        Produkt p2 = new Produkt("Produkt 1", 1200);
        p2.setDescription("Produkt 1 aus Shop B");
        p2.setDiscount(10);
        System.out.println(p2.getPriceWithDiscount());
        System.out.println(p2);
        System.out.println(produkt1.equals(p2));

    }
}