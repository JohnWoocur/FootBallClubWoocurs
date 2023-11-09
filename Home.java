import java.util.Scanner;
import App.Menu;


public class Home {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String opt;
		System.out.println("Welcome To EPL, Do you want to continue Y (YES) / N (No) : ");
         opt = s.next();

		if (opt.equals("Y"))
		{
		   Menu.mainMenu();
		}
		else {
			System.out.println("System closed...");
		}
	}

}
