import java.util.Objects;

public class Friend {
    private String name;
    private int age;
    private String city;
    private String country;
    private int knownSince;

    public Friend(String name, int age, String city, String country, int knownSince) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
        this.knownSince = knownSince;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return age == friend.age && name.equals(friend.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getKnownSince() {
        return knownSince;
    }

    public void setKnownSince(int knownSince) {
        this.knownSince = knownSince;
    }


    @Override
    public String toString() {
        return "Friend{" +
                "friend='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", knownSince=" + knownSince +
                '}';
    }

}
