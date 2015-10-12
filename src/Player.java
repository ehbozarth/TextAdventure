import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by earlbozarth on 10/9/15.
 */
public class Player {
    String name;
    String weapon;
    String area;
    ArrayList items = new ArrayList();

    void chooseName(){
        System.out.println("What is your name?");
        name = Game.nextLine();

        System.out.println("Good luck, " + name);
    }//End of chooseName

    void chooseWeapon() throws Exception {
        System.out.println("[1] Pick up Sword");
        System.out.println("[2] Pick up Mallet");

        weapon = Game.nextLine();
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
    }//End of chooseWeapon

    void chooseArea() throws Exception {
        System.out.println("[1] Enter the Forest");
        System.out.println("[2] Enter the underground tunnel");

        area = Game.nextLine();
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
    }//End of chooseArea

    void findItem(String item){
        System.out.println("Found item! Pick it up? [y/n]");
        String s = Game.nextLine();
        if(s.equals("y")){
            System.out.println("You found a " + item);
            items.add(item);
        }
    }

}//End of Player Class
