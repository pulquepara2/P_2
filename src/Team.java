import java.util.ArrayList;
import java.util.Iterator;

public class Team {
    private ArrayList<Player> players = new ArrayList<>();

    private String name;

    public Team( String name) {

        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "players=" + players +
                ", name='" + name + '\'' + getPointsPerTeam() +
                '}';
    }
    public void add (Player p){
        players.add(p);
    }


    public void print(){

        Iterator<Player> it = players.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
    }
    public int getPointsPerTeam(){
        int sum = 0;
       // Iterator<Player> it = players.iterator();
        //while (it.hasNext()){
        //    sum = sum + it.next().getPoints();
        for (Player p : players){
            sum = sum + p.getPoints();
        }
        return sum;
    }

}
