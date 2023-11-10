import java.util.List;
public class TestMain {
    public static void main(String[] args) {
        FootballClub fbc = new FootballClub();
        fbc.setId(1);
        fbc.setName("vaanavil");
        fbc.setCategory("vaanavil");
        fbc.setLocation("vaanavil");
        fbc.setPoints(1000);
        fbc.setWins(90);
        fbc.setDraws(10);
        fbc.setGoals(400);

        FootballClubFile fileHandler = new FootballClubFile();

        // fileHandler.save(fbc);
        // fileHandler.save(fbc);

        List<FootballClub> clubs = fileHandler.findAll();

        for(int i = 0; i < clubs.size(); i++){
            System.out.println(clubs.get(i).getName());
        }
        
        System.out.println(fileHandler.getById(1).getGoals());
    }
}
