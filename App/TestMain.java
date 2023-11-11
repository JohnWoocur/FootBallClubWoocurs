package App;

import App.Lib.FileRepo;
import App.Models.FootballClub;

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

        FootballClub fbc2 = new FootballClub(5,"test", "asda", "aasdf",5454,23123,215,65);

        FileRepo<FootballClub> fileHandler = new FileRepo<>(FootballClub.class);

        fileHandler.save(fbc); // save an object of a class mentioned in App.Lib.FileRepo class
        fileHandler.save(fbc2); // save an object of a class mentioned in App.Lib.FileRepo class

        //this is a sample file 

        List<FootballClub> clubs = fileHandler.findAll(); // get all objects from fileHandler
        for(int i = 0; i < clubs.size(); i++){              // list all using for loop
            System.out.print(clubs.get(i).getName());
            System.out.print("\t");
            System.out.print(clubs.get(i).getWins());
            System.out.print("\t");
            System.out.print(clubs.get(i).getLocation());
            System.out.println();
        }
        
        System.out.println(fileHandler.getById(1).getGoals());  //get object by id
    }
}
