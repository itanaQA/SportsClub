package SportsClub;

import java.util.ArrayList;


public class BasketballClub extends Club {
    public BasketballClub(String clubName, String city, ArrayList<Player> playerList) {
        super(clubName, city, playerList);
    }

    @Override
    public double teamValue() {
        double totalValue = 0;
        for (Player player : getPlayerList()) {
            totalValue += player.getNumberOfPoints() * 50;
        }
        return totalValue;
    }


    public String teamChampion() {
        for (Player player : getPlayerList()) {
            if (player.getNumberOfPoints() > 1000) {
                return player.getName();
            }
        }
        return "There are no players with more than a 1000 points.";
    }


}
