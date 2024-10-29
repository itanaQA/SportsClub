package SportsClub;

import java.util.ArrayList;

public class VolleyballClub extends Club {
    public VolleyballClub(String clubName, String city, ArrayList<Player> playerList) {
        super(clubName, city, playerList);
    }

    @Override
    public double teamValue() {
        double totalValue = 0;
        for (Player player : getPlayerList()) {
            totalValue += player.getNumberOfPoints() * 100;
        }
        return totalValue;
    }

    public String bestDefence() {
        Player bestDefender = null;
        for (Player player : getPlayerList()) {
            if (player.getYearsOfExperience() < 3) {
                if (bestDefender == null || player.getNumberOfPoints() > bestDefender.getNumberOfPoints()) {
                    bestDefender = player;
                }
            }
        }
        return bestDefender.getName();
    }

}
