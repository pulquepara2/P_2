import java.util.ArrayList;

public class FriendDemo {
    public static void main(String[] args) {
        Friend adam = new Friend("Adam", 30, "graz", "Austria", 1985);
        Friend bertl = new Friend("Bertl", 65, "Wien","Austria", 1987);
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
        for(Friend f : from){
            System.out.println(f);
        }
    }
}
