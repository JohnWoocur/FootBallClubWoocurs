package App;

import java.util.Scanner;
import App.createClub;

//import Statements


	public class Menu {
	    public static void mainMenu() {
	        while (true) {
				System.out.println("\n************ Welcome to the FOOTBALL CLUB ************");
				System.out.println();
	            System.out.println("\t\t\t 1. Create a Football club");
	            System.out.println("\t\t\t 2. Delete a football club");
	            System.out.println("\t\t\t 3. Display the various static");
	            System.out.println("\t\t\t 4. Display the premier league table");
	            System.out.println("\t\t\t 5. Display the event");
	            System.out.println("\t\t\t 6. Update Score ");
	            System.out.println("\t\t\t 7. Set match date");
	            System.out.println("\t\t\t 8. Exit");
	            System.out.println("");
	            System.out.print("\t\t Choose One: ");
	            Scanner scanner = new Scanner(System.in);
	            int c = scanner.nextInt();
	            switch (c) {
	                case 1:
	                    createClub.create_Club();
	                    break;

	                case 2:
	                    //DeleteClub.delete();
	                    break;

	                case 3:
	                    //DisplayStatistic.display();
	                    break;

	                case 4:
	                    //DisplayPremierLeauge.display();
	                    break;

	                case 5:
	                    //System.out.println("Function not avaiable..");
	                    break;

	                case 6:
	                    //Update.update_Score();
	                    break;

	                case 7:
	                    System.out.println("Function not avaiable..");
	                    break;

	                case 8:
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("\t\t\t input not valid.. ");
	                    break;
	            }
	        }
	    }

}

