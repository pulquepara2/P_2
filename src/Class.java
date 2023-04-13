public class Class {
    private String name;
    private int hours;
    private int maxCapacity;
    private int enrolledStudents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public Class(String name, int hours, int maxCapacity, int enrolledStudents) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = 0;
    }

    public int enroll() {
        enrolledStudents++;
        return enrolledStudents;
    }

    public boolean maxCapacityReached() {
        return enrolledStudents >= maxCapacity;
    }
}


