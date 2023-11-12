package App;

import java.util.Scanner;


//import Statements


	public class Menu {
	    public static void mainMenu() {
	        while (true) {
				System.out.println("\n************ Welcome to the FOOTBALL CLUB ************");
				System.out.println();
	            System.out.println("\t\t\t 1. Create Football club");
	            System.out.println("\t\t\t 2. Delete football club");
	            System.out.println("\t\t\t 3. Update football club");
	            System.out.println("\t\t\t 4. Show football club");
	            System.out.println("\t\t\t 5. Update Score");
	            System.out.println("\t\t\t 6. Schedule match ");
	            System.out.println("\t\t\t 7. Show fixed match");
	            System.out.println("\t\t\t 8. Exit");
	            System.out.println("");
	            System.out.print("\t\t Choose One: ");
	            Scanner scanner = new Scanner(System.in);
	            int c = scanner.nextInt();
	            switch (c) {
	                case 1:
	                    Club.create();
	                    break;

	                case 2:
	                    //DeleteClub.create();
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
	                    Match.create();
	                    break;

	                case 7:
	                    //System.out.println("Function not avaiable..");
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

