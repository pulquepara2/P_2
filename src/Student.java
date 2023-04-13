import java.util.Arrays;

public class Student {
    private String firstname;
    private String lastName;
    private Class[] classes;
    private static int counter=0;
    private int counter2=0;
    private int nonStaticcounter = 0;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNonStaticcounter() {
        return nonStaticcounter;
    }

    public void setNonStaticcounter(int nonStaticcounter) {
        this.nonStaticcounter = nonStaticcounter;
    }

    public Student(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.classes = new Class[3];
        this.id =  counter++;
        nonStaticcounter++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public int getCounter2() {
        return counter2;
    }

    public static int getCounter() {
        return counter;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Class[] getClasses() {
        return classes;
    }

    public void setClasses(Class[] classes) {
        this.classes = classes;
    }

    public void enroll(Class c) {
//kurs noch frei?
        if (alredyEnrolled(c)) return;


        if (!c.maxCapacityReached()) {
            if (classes[classes.length - 1] != null) {
                increaseClassArray();
                classes[classes.length - 1] = c;

            } else {
                for (int i = 0; i < classes.length; i++) {
                    if (classes[i] == null) {
                        c.enroll();
                        classes[i] = c;
                        System.out.println("Kurs angemeldet");
                        break;
                    } else {
                        System.out.println("Keine Anmeldung mehr möglich");
                    }
                }
            }
        }

    }

    private Class[] increaseClassArray() {
        Class[] temp = new Class[classes.length + 1];
        for (int i = 0; i < classes.length; i++) {
            temp[i] = classes[i];
        }
        return temp;
    }

    private boolean alredyEnrolled(Class c) {
        for (int i = 0; i < classes.length; i++) {
            if (classes[i] != null) {
                if (classes[i].getName().equals(c.getName())) {
                    System.out.println(c.getName() + " bereits angemeldet");
                    return true;
                }

            }
        }
        return false;
    }


    public void printClasses() {
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }
    }


}