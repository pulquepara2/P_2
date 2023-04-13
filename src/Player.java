public class Player {
    private static int counter = 0;
    private int id;
    private String name;
    private int points;
    private Enum team;

    public Player(String name, int points, Enum team) {
        this.name = name;
        this.points = points;
        this.team = team;
        this.id = counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Player.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Enum getTeam() {
        return team;
    }

    public void setTeam(Enum team) {
        this.team = team;
    }
}
