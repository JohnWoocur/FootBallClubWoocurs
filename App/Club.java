package App;
import java.util.*; //can import all kind of data from user 
import App.Lib.FileRepo; 
import App.Models.FootballClub;

public class Club {
     public static void create() {

          Scanner s = new Scanner(System.in); // to input the data Scanner s1 = new Scanner(System.in);

          int isCompleted = 0;
          int choice = 0; // user choice to run the loop

          System.out.println("\n ********************** ADD CLUB DETAILS **********************");

          do { // to get the data from the user

               System.out.println("Enter the Club ID? ");
               int id = s.nextInt();

               System.out.println("Enter the Club name? ");
               String name = s.next(); // to store the data which is input by user

               System.out.println("Enter the Club Location? ");
               String location = s.next();

               System.out.println("which Category? ");
               String category = s.next();

               System.out.println("How many points were the club get? ");
               int points = s.nextInt();

               System.out.println("Number of Goals? ");
               int goal = s.nextInt();

               System.out.println("Enter the no of Wins? ");
               int win = s.nextInt();

               System.out.println("Enter the no of Draws? ");
               int draw = s.nextInt();

               System.out.println("Enter the no of Defeats? ");
               int defeat = s.nextInt();

               System.out.println("-----------------------------------------------------------------------------" +"\n-----------------------------------------------------------------------------");
               System.out.println(" Name : " + name + "\nPoints : " + points + "\n Goals : " + goal + "\n Category : " + category + "\n Wins : " + win + "\n Draw : " + draw + "\n Defeats : " + defeat);
               // to show all datas'

               FootballClub fbc = new FootballClub(id, name, location, category, points, goal, win, draw);

               FileRepo<FootballClub> fileHandler = new FileRepo<>(FootballClub.class);
               fileHandler.save(fbc);

               System.out.println("\n\n Do u want to Add more?");
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
