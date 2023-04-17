import java.util.*;

public class FriendDemo {
    public static void main(String[] args) {
        Friend adam = new Friend("Adam", 45, "graz", "Austria", 1985);
        Friend bertl = new Friend("Bertl", 65, "Wien", "Austria", 1987);
        Friend julius = new Friend("Julius", 25, "Paris", "France", 2013);

        Friendlist friendlist = new Friendlist();
        friendlist.addFriend(adam);
        friendlist.print();
        friendlist.addFriend(bertl);
        friendlist.print();
        friendlist.addFriend(julius);
        friendlist.print();
        System.out.println("---------------");
        ArrayList<Friend> from = friendlist.friendsfrom("Paris");
        for (Friend f : from) {
            friendlist.print(from);
        }
        System.out.println(friendlist.findOldestFriend());
        System.out.println("------------------------");
        friendlist.removeFriend(adam);
        friendlist.print();
        System.out.println("------------------------");

        ArrayList<Friend> friendsabroad = friendlist.friendsAbroad("Austria");
        for (Friend f : friendsabroad) {
            friendlist.print(friendsabroad);
        }
        System.out.println(adam.equals(bertl));

        Set<String> names = new HashSet<>();
        names.add("Anna");
        names.add("Bert");
        names.add("Helena");
        names.add("Anna");
        System.out.println(names);

        Map<String, Integer> phonenr = new HashMap<>();
        phonenr.put("David", 123654);
        phonenr.put("Emanuel", 9854632);
        phonenr.put("Rudi", 5429652);

        System.out.println(phonenr);
        System.out.println(phonenr.entrySet());
        System.out.println(phonenr.keySet());
        System.out.println(phonenr.values());


}
}