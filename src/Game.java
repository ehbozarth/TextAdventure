/**
 * Created by earlbozarth on 10/8/15.
 */

import java.util.*;

public class Game {

    public static void run() throws Exception {
        System.out.println("Welcome to Text Adventure");
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Good luck, " + name);

        System.out.println("[1] Pick up Sword");
        System.out.println("[2] Pick up Mallet");

        String weapon = scanner.nextLine();

        int weaponNum = Integer.valueOf(weapon);

        if (weaponNum == 1){
            //weapons.equals("1")
            System.out.println("The sword is a good choice!");
        }//End of if
        else if(weaponNum == 2) {
           //weapon.equals("2")
            System.out.println("The mallet is a fine choice!");
        }//End of else if
        else {
            throw new Exception("invalid weapon");
        }

        System.out.println("[1] Enter the Forest");
        System.out.println("[2] Enter the underground tunnel");

        String area = scanner.nextLine();

        int areaNum = Integer.valueOf(area);

        if (areaNum == 1){
            System.out.println("Entering the Forest");
        }
        else if (areaNum == 2){
            System.out.println("Entering the underground tunnel");
        }
        else {
            throw new Exception("invalid area");
        }


    }//End of Run Method


}//End of Game Class
