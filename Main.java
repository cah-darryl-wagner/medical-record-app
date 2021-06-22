import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Console c = System.console();

        UserMenu um = new UserMenu(args[0].charAt(0));
        um.displayHospitalName();
        um.displayAppName();
        um.DisplayUserMenu();
        //while(c.readLine().)
        Scanner sc = new Scanner(System.in);
        System.out.print(">");
        while (sc.hasNext()) {
            //System.out.print(">");
            String s = sc.nextLine();
            UserOption uo = new UserOption();
            if(!s.equals("exit")) {
                int inp;
                try{
                    inp = Integer.parseInt(s);
                } catch (NumberFormatException e){
                    System.out.println("Sorry, not a valid input");
                    System.out.print(">");
                    continue;
                }

                uo.getUserOption(inp);
            }
            else
                break;
        }
    }

}
