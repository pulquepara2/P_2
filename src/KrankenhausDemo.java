public class KrankenhausDemo {
    public static void main(String[] args) {
        Arzt a1 = new Arzt("Morin", 5000);
        SpezialisierterArzt a2 = new SpezialisierterArzt("Müller", 5000,0.2);

        Krankenhaus kh = new Krankenhaus();
        kh.addArzt(a1);
        kh.addArzt(a2);

        kh.print();
    }

}
