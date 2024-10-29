package SportsClub;

import java.util.ArrayList;

public class SoccerClub extends Club {
    public SoccerClub(String clubName, String city, ArrayList<Player> playerList) {
        super(clubName, city, playerList);
    }

    @Override
    public double teamValue() {
        double totalValue = 0;
        for (Player player : getPlayerList()) {
            totalValue += player.getNumberOfPoints() * 1000;
        }
        return totalValue;
    }


    public String bestPlayer(){
        Player maxBroj = getPlayerList().get(0);
        for (Player i : getPlayerList()){
            if (maxBroj.getNumberOfPoints() < i.getNumberOfPoints()){
                maxBroj = i;
            }
        }
        return maxBroj.getName();
    }


}
