/*
 * Created by earlbozarth on 10/8/15.
 */

import java.util.*;

public class Game {

    static Player player;

    public static void main(String [] args) throws Exception {
        System.out.println("Welcome to Text Adventure");

        player = new Player();

        while (true) {
            player.chooseName();
            player.chooseWeapon();
            player.chooseArea();
            player.findItem("Golden Apple");

            Weapon orgeWeapon = new Weapon();
            orgeWeapon.name = "Club";
            orgeWeapon.damage = 5;
            Enemy orge = new Enemy("Ogre", 50, 5,orgeWeapon);

            player.battle(orge);
        }//End of While Loop
    }//End of Run Method

    static String nextLine() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (s.startsWith("/")) {
            if (s.equals("/help")) {
                System.out.println("These are the availabel commands:");
                System.out.println("/help => List of availabe acommands");
            } else if (s.equals("/exit")) {
                System.exit(0);
            }
            else if(s.equals("/inv")){
                if (player.items.size() == 0){
                    System.out.println("You have no items");
                }
                for(Object item : player.items){
                    System.out.println(item);
                }//End of for loop
            }
            return nextLine();
        }//end of if
        else {
            return s;
        }//end of else

    }//End of nextLine method
}//End of Game Class