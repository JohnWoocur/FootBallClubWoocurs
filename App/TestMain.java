package App;

import App.FootballClub;
import App.Lib.FileRepo;

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

        FileRepo<FootballClub> fileHandler = new FileRepo<>(FootballClub.class);

        
        fileHandler.save(fbc); // save an object of a class mentioned in App.Lib.FileRepo class

        List<FootballClub> clubs = fileHandler.findAll(); // get all objects from fileHandler
        for(int i = 0; i < clubs.size(); i++){              // list all using for loop
            System.out.println(clubs.get(i).getName());  
        }
        
        System.out.println(fileHandler.getById(1).getGoals());  //get object by id
    }
}