import java.io.Serializable;

public class FootballClub implements Serializable, Identifiable{
    private int id;
    private String name;
    private String location;
    private String category;
    private int points;
    private int goals;
    private int wins;
    private int draws;

    public FootballClub() {
    }

    public FootballClub(int id, String name, String location, String category, int points, int goals, int wins,
            int draws) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.category = category;
        this.points = points;
        this.goals = goals;
        this.wins = wins;
        this.draws = draws;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }



}
