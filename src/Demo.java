import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {


        Info<String> name = new Info<>("Max", 1);
        Info<Integer> age = new Info<>(30, 2);
        Info<String> adr = new Info<>("Graz", 2);


        Profil profil = new Profil(name, age, adr);
        profil.print();
    }
}