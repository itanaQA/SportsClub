package SportsClub;

public class Player {

    private String name;
    private int yearsOfExperience;
    private int numberOfPoints;

    public Player(String name, int yearsOfExperience, int numberOfPoints){
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.numberOfPoints = numberOfPoints;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public String toString () {
        return name + " " + yearsOfExperience + " " + numberOfPoints;
    }
}
