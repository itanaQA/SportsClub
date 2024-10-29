package SportsClub;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Sam", 1, 500);
        Player player2 = new Player("John", 2, 1200);
        Player player3 = new Player("Steven", 3, 800);

        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        BasketballClub bc = new BasketballClub("Basketball City", "NYC", players);
        VolleyballClub vc = new VolleyballClub("Elite Volleyball", "Chicago", players);
        SoccerClub sc = new SoccerClub("LAFC", "LA", players);

        System.out.println("Most Experienced Player in Basketball Club: " + bc.mostExperiencedPlayer());
        System.out.println("Team Value of Volleyball Club: " + vc.teamValue());
        System.out.println("Team Champion in Basketball Club: " + bc.teamChampion());
        System.out.println("Best Defence in Volleyball Club: " + vc.bestDefence());
        System.out.println("Team Value of Soccer Club: " + sc.teamValue());
        System.out.println("Best Player in Soccer Club: " + sc.bestPlayer());

    }
}