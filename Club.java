package SportsClub;

import java.util.ArrayList;

public abstract class Club {

    private String clubName;
    private String city;
    private ArrayList<Player> playerList;

    public Club(String clubName, String city, ArrayList<Player> playerList) {
        this.city = city;
        this.playerList = playerList;
        this.clubName = clubName;

    }


    public String mostExperiencedPlayer() {
        Player maxExperience = playerList.get(0);
        for (Player i : getPlayerList()) {
            if (i.getYearsOfExperience() > maxExperience.getYearsOfExperience()) {
                maxExperience = i;
            }


        }
        return maxExperience.getName();

    }


    public abstract double teamValue();



    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }


    public String toString() {
        return clubName + city + playerList;
    }
}
