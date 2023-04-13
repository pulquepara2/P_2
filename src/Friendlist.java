import java.util.ArrayList;
import java.util.List;

public class Friendlist {
    private List<Friend> friends = new ArrayList<>();

    public List<Friend> getFriends() {
        return friends;
    }

    public void addFriend(Friend f) {
        friends.add(f);
    }

    public void print() {
        for (Friend f : friends) {
            System.out.println(f);
        }
        // size() anstatt length (array)
        // for (int i = 0; i <friends.size() ; i++) {
        //    System.out.println(friends.get(i));

    }
    public void print(ArrayList<Friend> friends) {
        for (Friend f : friends) {
            System.out.println(f);
        }
        // print Methode überladen

    }

    public ArrayList<Friend> friendsfrom(String city) {
        ArrayList<Friend> result = new ArrayList<>();
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getCity().equals(city)) {
                result.add(friends.get(i));
            }

        }
        return result;
    }
}


