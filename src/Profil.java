public class Profil {
    private Info name;
    private Info age;
    private Info addr;

    public Profil(Info name, Info age, Info addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    private String checkSecurityLevel(Info info) {
        switch (info.getSecurityLevel()) {
            case 1:
                return "Zugriff gestattet: " + info.getData();
            case 2:
                return "Zugriff nicht gestattet.";

            case 3:
                return "Nicht erfasst";
            default:
                return "Ungültiger Status";
        }
    }
    public void print(){
        System.out.println("Name: ");
        System.out.println("\t" + checkSecurityLevel(name));
        System.out.println("Age: ");
        System.out.println("\t" + checkSecurityLevel(age));
        System.out.println("Adresse: ");
        System.out.println("\t" + checkSecurityLevel(addr));

    }
}