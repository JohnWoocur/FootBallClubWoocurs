package App.Models;

import App.Lib.Identifiable;
import java.io.Serializable;


public class FixedMatch implements Serializable, Identifiable {
    private int id;
    private String team1;
    private String team2;
    private long date;
    private long time;

    public FixedMatch() {
    }

    public FixedMatch(int id, String team1, String team2, double date, double time) {
        this.id = id;
        this.team1 = team1;
        this.team2 = team2;
        this.date = date;
        this.time = time;
    }

	public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }



}
