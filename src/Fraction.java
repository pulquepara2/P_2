public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double doubleToDecimal() {
        return (double) numerator / denominator;
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction multiplicate(Fraction b2) {
        return new Fraction(b2.getNumerator() * this.numerator, b2.getDenominator() * this.denominator);

    }

    public Fraction multiplicate(Fraction b2, Fraction b3) {

        return this.multiplicate(b2).multiplicate(b3);
    }
    public Fraction add(Fraction b2){
        return null;
    }
}
