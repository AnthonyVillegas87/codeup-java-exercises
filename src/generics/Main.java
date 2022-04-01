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

        Team myTeam = new Team("Luchadores");
        myTeam.addPlayer(tom);
        myTeam.addPlayer(pat);
        myTeam.addPlayer(cristiano);

        System.out.println(myTeam.numPlayers());
//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(5);
//        items.add(10);
//        items.add(15);
//
//        printDouble(items);
    }
}
