package generics;

import java.util.ArrayList;

public class Main {

//    private static void printDouble(ArrayList<Integer> n) {
//        for(int i : n) {
//            System.out.println(i * 2);
//        }
//    }
    public static void main(String[] args) {
        FootballPlayer tom = new FootballPlayer("Tom");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer cristiano = new SoccerPlayer("Cristiano");

        Team<FootballPlayer> tampa = new Team<>("Tampa Bay");
        tampa.addPlayer(tom);
//        myTeam.addPlayer(pat);
//        myTeam.addPlayer(cristiano);

        System.out.println(tampa.numPlayers());
        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Portugal");
        soccerPlayerTeam.addPlayer(cristiano);




        Team<FootballPlayer> miami = new Team<>("Miami Dolphins");
        FootballPlayer tua = new FootballPlayer("Tua Tagovailoa");
        miami.addPlayer(tua);

        Team<FootballPlayer> newEngland = new Team<>("New England Patriots");
        Team<FootballPlayer> indianapolis = new Team<>("Indianapolis Colts");
        newEngland.matchResult(indianapolis,7, 10 );
        newEngland.matchResult(miami, 21, 6);

        tampa.matchResult(miami, 24, 21);



    }
}
