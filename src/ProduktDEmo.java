public class ProduktDEmo {
    public static void main(String[] args) {


        Produkt produkt1 = new Produkt("Produkt 1", 800);
        produkt1.setDiscount(20);
        produkt1.setDescription("Produkt 1 aus Shop A");
        System.out.println(produkt1.getPriceWithDiscount());
        System.out.println(produkt1);

        Produkt p2 = new Produkt("Produkt 2", 1250);
        p2.setDescription("Produkt 2 aus Shop B");
        p2.setDiscount(10);
        System.out.println(p2.getPriceWithDiscount());
        System.out.println(p2);
        System.out.println(produkt1.equals(p2));

        ProduktShop shop = new ProduktShop();
        shop.add(produkt1);
        shop.add(p2);
        System.out.println(shop.gibtsGratis());
        System.out.println(shop.getPriceFrom(1000));
        System.out.println(shop.getPriceTo(800));

        System.out.println(shop.toString());
        shop.removeProductsFromByIterator(1000);
        System.out.println(shop.toString());

    }
}