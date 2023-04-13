import java.util.ArrayList;

public class Verwaltung {
    private ArrayList<Player> players = new ArrayList<>();

    public void add(Player p){
        players.add(p);
    }
    public void remove(Player p){
        players.remove(p);
    }
    public Player getPlayerById(int id){
        Player result = players.get(0);
        int playerWithId = 0;
        for(Player p : players){
            if(p.getId() == id){
                playerWithId = p.getId();
                result = p;
            }
        }
     return result;
    }


}
