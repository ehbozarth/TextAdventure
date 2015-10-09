/*
 * Created by earlbozarth on 10/8/15.
 */

import java.util.*;

public class Game {

    public static void run() throws Exception {
        System.out.println("Welcome to Text Adventure");

        Player player = new Player();
        player.chooseName();;
        player.chooseWeapon();
        player.chooseArea();
    }//End of Run Method

    static String nextLine(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (s.startsWith("/")){
           if(s.equals("/help")){
               System.out.println("These are the availabel commands:");
               System.out.println("/help => List of availabe acommands");
           }
            return nextLine();
        }//end of if
        else{
            return s;
        }//end of else

    }//End of nextLine method

}//End of Game Class