public class TeamDemo {
    public static void main(String[] args) {
        Team t1 = new Team("Team A");
        Team t2 = new Team("Team B");
        t1.add(new Player(1,"Hansi", 15, t1));
        t1.add(new Player(2,"Maxi", 487, t1));
        t1.add(new Player(2,"Moritz", 45,t1));
        t1.add(new Player(4,"Conchita", 2, t1));
        t2.add(new Player(11, "Florence", 364, t2));
        t2.add(new Player(12, "Konrad", 845, t2));
        t2.add(new Player(13, "Hiasl", 65, t2));

        Verwaltung v1 = new Verwaltung();


        System.out.println(t1.getPointsPerTeam());
        System.out.println(t2.getPointsPerTeam());



    }
}
