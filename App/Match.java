package App;
import java.util.*; //can import all kind of data from user
import App.Lib.FileRepo;
import App.Models.FixedMatch;

public class Match {
     public static void create() {

          Scanner s = new Scanner(System.in); // to input the data Scanner s1 = new Scanner(System.in);

          int isCompleted = 0;
          int choice = 0; // user choice to run the loop

          System.out.println("\n ********************** FIX CLUB MATCH **********************");

          do { // to get the data from the user

			   System.out.println("Enter the Match ID? ");
               int id = s.nextInt();

               System.out.println("Enter the Club name? ");
               String team1 = s.next(); // to store the data which is input by user

               System.out.println("Enter the Club name? ");
               String team2 = s.next();

               System.out.println("Schedule Match Date? ");
               long date = s.nextLong();

               System.out.println("Schedule Match Time? ");
               long time = s.nextLong();


               System.out.println("-----------------------------------------------------------------------------" +"\n-----------------------------------------------------------------------------");
               System.out.println(" Match : " + team1 + " VS  " + team2 + "\n Schedule Date : " + date + "\n Schedule Time : " + time);
               // to show all datas'

               FixedMatch fm = new FixedMatch(id, team1, team1, date, time);

               FileRepo<FixedMatch> fileHandler = new FileRepo<>(FixedMatch.class);
               fileHandler.save(fm);

               System.out.println("\n\n Do u want to Schedule more Match?");
               System.out.println(" 1.Yes \n 2.No \n");
               choice = s.nextInt();

               System.out.println("\n _______________________________________");

               if (choice == 1) {
                    isCompleted = 1;
               } else if (choice == 2) {
                    isCompleted = 0;
               }

          } while (isCompleted != 0);

     }
}
