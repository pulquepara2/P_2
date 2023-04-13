public class ClassApp {
    public static void main(String[] args) {


        Class cl = new Class("P2", 20, 15, 10);
        cl.enroll();
        System.out.println(cl.maxCapacityReached());

        Student s = new Student("Hansi", "Huber");
        s.enroll(cl);
        s.printClasses();
    }
}