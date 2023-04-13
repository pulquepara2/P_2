public class ClassApp {
    public static void main(String[] args) {


        Class cl = new Class("P2", 20, 15, 10, Wochentag.MONTAG);
        cl.enroll();
        System.out.println(cl.maxCapacityReached());
        Class cl1= new Class("Modelle", 15,14, 13, Wochentag.MITTWOCH);

        Student s = new Student("Hansi", "Huber");
        Student s1 = new Student("Liese", "Lotte");
        Student s2 = new Student("Klara", "Kuh");
        s.enroll(cl);
        s.printClasses();

        System.out.println("Bereits " + Student.getCounter()+ " Studenten da!");
        System.out.println(s1.getNonStaticcounter());
        //im nonstatic bleibt auf eins, weil für jedes objekt wieder auf null
        //im static nur einmal
        int val = 4;
        String str= String.valueOf(val);

        System.out.println(s1.getId());
        System.out.println(String.format("%03d", s2.getId()));
        s.printClasses();
        s.printStudyDays();

    }
}