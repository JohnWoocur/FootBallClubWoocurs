package App;

import java.io.IOException;
import java.util.Scanner;
import App.Menu;
import App.FileHandling;

public class createClub {
    public static void create_Club(){
System.out.println("");
        while(true){
        Scanner s = new Scanner(System.in);
        System.out.println("\t\t\t ********* Create FOOTBALL CLUB ********* ");
        System.out.println("\t\t\t ****************************************\n\n ");
        System.out.print("\t\t Enter the name of the football club : ");
        String club_Name = s.next();
        System.out.print("\t\t Enter the location of the football club : \n");
        String club_Location = s.next();


        try {
            FileHandling.Save_Club(club_Name,club_Location);
        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println();
        System.out.println("\t name of the football club     : "+ club_Name);
        System.out.println("\t location of the football club : " + club_Location);
        System.out.println();
        System.out.println();
        System.out.print("Do you want to add more details to the club (y/n) : ");
        char opt = s.next().charAt(0);

        switch (opt) {
            case 'y':
                more_Details(club_Name);
                break;
            case 'n':
                Menu.mainMenu();
                break;


            default:
                System.out.println("Not Valid please enter a valid....");
                break;
        }
        System.out.print("Do you want to add more club (y/n) : ");
        char c2 = s.next().charAt(0);
        s.close();
        switch (c2) {
            case 'y':
                create_Club();
                break;
            case 'n':
                System.out.println("bSystem Closed.....");
                break;


            default:
                System.out.println("Not Valid please enter a valid....");
                break;
        }
    }
    }
    public static void more_Details(String club_Name){
        Scanner s = new Scanner(System.in);
        System.out.println("\t\t\t ********* FOOTBALL CLUB More Details ********* ");
        System.out.println("\t\t\t ****************************************\n\n ");
        System.out.println("\t\t\t\t"+club_Name);
        System.out.println();
        System.out.println();
        System.out.print("\t\t How many win the season : ");
        String wins = s.next();
        System.out.print("\t\t how many draws in the season : ");
        String draws = s.next();
        System.out.print("\t\t How many defeats in the season : ");
        String defeats = s.next();
        System.out.print("\t\t how many goals received in the season : ");
        String goals = s.next();
        System.out.print("\t\t how many scored in the season : ");
        String scored = s.next();
        System.out.print("\t\t how many number of points currently has : ");
        String points = s.next();
        System.out.print("\t\t how many match played in the season : ");
        String played = s.next();
        System.out.println(" ");
        FileHandling.saveMoreDetails(club_Name,wins,draws,defeats,goals,scored,points,played);
        System.out.println(" ");
        System.out.print("Do you want to add again (y/n) : ");
        char opt = s.next().charAt(0);

        switch (opt) {
            case 'y':
                create_Club();
                break;
            case 'n':
                Menu.mainMenu();
                break;


            default:
                System.out.println("Not Valid please enter a valid....");
                break;
        }
        s.close();
    }
}