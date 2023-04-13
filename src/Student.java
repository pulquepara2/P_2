public class Student {
    private String firstname;
    private String lastname;
    private Class[] classes;

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.classes = new Class[3];
    }

    public void enroll(Class c) {
        if (alreadyEnrolled(c)) return;
        //Kurs noch frei?
        if (!c.maxCapacityReached()) {
            //Hat Student noch Platz für einen neuen Kurs?
            for (int i = 0; i < this.classes.length; i++) {

                classes[i] = c;
                System.out.println("Kurs angemeldet");
                break;
            }
        }
    }

    private boolean alreadyEnrolled(Class c) {
        for (int i = 0; i < classes.length; i++) {
            if (classes[i] == null) {
                if (classes[i].getName().equals(c.getName())) {
                    System.out.println(c.getName() + "Bereits angemeldet");
                    return true;
                }
            }
        }
        return false;
    }

    {
        System.out.println("Keine Anmeldung möglich");
    }
    private Class[] increaseClassArray(){
        Class[] temp = new Class[classes.length +1];
        for(int i = 0; i < classes.length; i++){
            temp[i] = classes[i];
        }
        return classes;
    }

    public void printClasses() {
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
