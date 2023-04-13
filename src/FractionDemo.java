public class FractionDemo {
    public static void main(String[] args) {
        Fraction fr = new Fraction(1,5);
        System.out.println(fr.doubleToDecimal());
        fr.print();
        Fraction fr1 = new Fraction(1,5);
        fr1.multiplicate(fr1).print();
        Fraction fr2 = new Fraction(1,5);
        fr2.multiplicate(fr1,fr2).print();
    }
}
