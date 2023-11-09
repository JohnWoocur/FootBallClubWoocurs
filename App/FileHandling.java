package App;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {
    static FileHandling fh=new FileHandling();
    private static final String Sout = null;
    static String path =".\\Clubs\\";
    static String pathArray =".\\ArrayClubs\\";
    static String pathMore =".\\ClubMoreDetails\\";

    public static void Save_Club(String club_Name, String club_Location) throws IOException{
        //create folder
        File folder = new File(path);
        if(!folder.exists()){
            folder.mkdir();
        }
        File folderA = new File(pathArray);
        if(!folderA.exists()){
            folderA.mkdir();
        }
        File folderB = new File(pathMore);
        if(!folderB.exists()){
            folderB.mkdir();
        }
        //save data as txt file
        try {
            FileWriter fw=new FileWriter(path+club_Name+".txt");
            fw.write(club_Name+"\n");
            fw.write(club_Location+"\n");
            fw.close();
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }

        //retrive data from txt file and add new data
        ArrayList<String> clubArr = new ArrayList<String>();
        try {
            File fileR = new File(pathArray+"Clublist.txt");
            Scanner s = new Scanner(fileR);

            while (s.hasNextLine()) {
                clubArr.add(s.nextLine());
            }
            s.close();
        } catch (Exception e) {
            // File fileS = new File(pathArray+"Clublist.txt");
            // FileWriter fws = new FileWriter(fileS);
            // fws.write(club_Name);
            // fws.close();
        }
        clubArr.add(club_Name);
            File fileS = new File(pathArray+"Clublist.txt");
            FileWriter fws = new FileWriter(fileS);
            for(int i=0;i<clubArr.size();i++){
                fws.write(clubArr.get(i)+"\n");
            }
            fws.close();
            System.out.println("Club Saved...");


    }

    public static void Retrive_Club(String name){
        if(fh.checkClub(name)){
        try {
            String[] clubb=new String[2];
            int i=-1;
            File file = new File(path+name+".txt");
            Scanner s = new Scanner(file);
            while (s.hasNextLine()){
                String line = s.nextLine();
                i=i+1;
                clubb[i]=line;

            }s.close();
            System.out.println("Name     : "+clubb[0]);
            System.out.println("Location : "+clubb[1]);

        } catch (Exception e) {
            System.out.println("Error");
        }
        }
        else{
            System.out.println("Club Not Found..");
        }

    }

    public static void saveMoreDetails(String club_Name,String wins,String draws,String defeats,String goals,String scored,String points,String played){
        //if(fh.checkClub(club_Name)){
        File folderA = new File(pathMore);
        if(!folderA.exists()){
            folderA.mkdir();
        }

        try {
            FileWriter fw=new FileWriter(pathMore+club_Name+".txt");
            fw.write(club_Name+"\n");
            fw.write(wins+"\n");
            fw.write(draws+"\n");
            fw.write(defeats+"\n");
            fw.write(goals+"\n");
            fw.write(scored+"\n");
            fw.write(points+"\n");
            fw.write(played+"\n");
            fw.close();
            System.out.println("saved as document");
        } catch (Exception e) {
            System.out.println("error");
        }
        // }else{
        //     System.out.println("Club not found..");
        // }

    }

    public static void statics(String name){
        try {
            File file = new File(pathMore+name+".txt");
            Scanner s = new Scanner(file);
            ArrayList<String> cS = new ArrayList<String>();
            while (s.hasNextLine()) {
                cS.add(s.nextLine());

            }
            s.close();
            //System.out.println(cS);
            System.out.println("+------+"+"+------+"+"+-------+"+"+---------+"+"+----------------+"+"+--------------+"+"+--------+"+"+--------------+");
            System.out.println("| Club |"+"| Wins |"+"| Draws |"+"| Defeats |"+"| Goals received |"+"| Goals scored |"+"| points |"+"| match played |");
            System.out.println("+------+"+"+------+"+"+-------+"+"+---------+"+"+----------------+"+"+--------------+"+"+--------+"+"+--------------+");
            System.out.println("    "+cS.get(0)+"      "+cS.get(1)+"      "+cS.get(2)+"\t"+cS.get(3)+"\t"+cS.get(4)+"\t"+cS.get(5)+"\t"+cS.get(6)+"\t"+cS.get(7));
            System.out.println("+------+"+"+------+"+"+-------+"+"+---------+"+"+----------------+"+"+--------------+"+"+--------+"+"+--------------+");

        } catch (Exception e) {
            System.out.println("Club not found..");
        }

    }

    public static void premierLeague(){
        try {
            ArrayList<String> cd=new ArrayList<>();
            // int i=0;
            ArrayList<String> pl=new ArrayList<>();
            File file = new File(pathArray+"Clublist.txt");
            Scanner sc=new Scanner(file);
            while (sc.hasNextLine()) {
                //pl.add(sc.nextLine());
                File fileD = new File(path+sc.nextLine()+".txt");
                Scanner scc=new Scanner(fileD);
                while (scc.hasNextLine()) {
                    cd.add(scc.nextLine());
                }

            }
            System.out.println("+------+"+"+------+"+"+-------+"+"+---------+"+"+----------------+"+"+--------------+"+"+--------+"+"+--------------+");
            System.out.println("| Club |"+"| Wins |"+"| Draws |"+"| Defeats |"+"| Goals received |"+"| Goals scored |"+"| points |"+"| match played |");
            System.out.println("+------+"+"+------+"+"+-------+"+"+---------+"+"+----------------+"+"+--------------+"+"+--------+"+"+--------------+");

            for(int k=0;k<cd.size();k++){
                System.out.print(cd.get(k)+" \t");
                if((k+1) % 8==0){
                    System.out.println(" ");
                    System.out.println("+------+"+"+------+"+"+-------+"+"+---------+"+"+----------------+"+"+--------------+"+"+--------+"+"+--------------+");
                  }
            }
            System.out.println("+------+"+"+------+"+"+-------+"+"+---------+"+"+----------------+"+"+--------------+"+"+--------+"+"+--------------+");
        } catch (Exception e) {
            System.out.print("Club not found..");
        }

    }

    public static void score(String club_Name,String club_Score){
        try {
            File f = new File(pathMore+club_Name+".txt");
            ArrayList<String> score=new ArrayList<>();
            Scanner sc=new Scanner(f);
            while (sc.hasNextLine()) {
                score.add(sc.nextLine());
            }
            sc.close();
            score.set(3,"7");
            System.out.println(score.get(7));
            FileWriter fw=new FileWriter(pathMore+club_Name+".txt");
            fw.write(score.get(0)+"\n");
            fw.write(score.get(1)+"\n");
            fw.write(score.get(2)+"\n");
            fw.write(score.get(3)+"\n");
            fw.write(score.get(4)+"\n");
            fw.write(club_Score+"\n");
            fw.write(score.get(6)+"\n");
            fw.write(score.get(7)+"\n");
            fw.close();
            System.out.println("+------+"+"+-------+");
            System.out.println("| Club |"+"| Points |");
            System.out.println("+------+"+"+--------+");
            System.out.println(score.get(0)+"\t"+"  "+club_Score);
            System.out.println("+------+"+"+--------+");


        } catch (Exception e) {
            System.out.print("Club not found..");
            e.printStackTrace();
        }
    }

    public boolean checkClub(String name){
        boolean r=false;
        try {
            File fileR = new File(pathArray+"Clublist.txt");
            Scanner s = new Scanner(fileR);
            ArrayList<String> clubArr = new ArrayList<String>();
            while (s.hasNextLine()) {
                clubArr.add(s.nextLine());
            }
            s.close();
            if (clubArr.contains(name)) {
                r= true;
            } else {
                r =false;
            }

        } catch (Exception e) {
            System.out.println("error in checkClub");
        }
        return r;
    }
    // public static void main(String[] args) throws IOException {
    //     FileHandling fh=new FileHandling();
    //     FileHandling.Save_Club("jkkkkki","kjlli");
    // }

    public static void showClub(){
        ArrayList<String> pl=new ArrayList<>();
        try {
            File file=new File(pathArray+"Clublist.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                pl.add(sc.nextLine());
            }
        } catch (Exception e) {
            // TO handle exception
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("--------------------| Clubs List |-------------------------");
        System.out.println("-----------------------------------------------------------");
        for(int k=0;k<pl.size();k++){

                System.out.print("|   "+pl.get(k)+" \t"+"  |");
                if((k+1) % 4==0){
                    System.out.println(" ");
                    System.out.println("-----------------------------------------------------------");
                }
            }
    }
    public static void deleteClub(String name) throws IOException{
        ArrayList<String> pl=new ArrayList<>();
        File file=new File(pathArray+"Clublist.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                pl.add(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error..");
        }

        if(pl.contains(name)){
            pl.remove(name);
            File fileS = new File(pathArray+"Clublist.txt");
            FileWriter fws = new FileWriter(fileS);
            for(int i=0;i<pl.size();i++){
                fws.write(pl.get(i)+"\n");
            }
            fws.close();
            System.out.println("Club deleted...");
            fh.showClub();
        }
        else{
            System.out.println("Account not found..");
        }

    }
}
