public class Friend {
    private String friend;
    private int age;
    private String city;
    private String country;
    private int knownSince;

    public Friend(String friend, int age, String city, String country, int knownSince) {
        this.friend = friend;
        this.age = age;
        this.city = city;
        this.country = country;
        this.knownSince = knownSince;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
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
                "friend='" + friend + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", knownSince=" + knownSince +
                '}';
    }
}
