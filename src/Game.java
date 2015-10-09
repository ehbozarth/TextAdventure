/**
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
}//End of Game Class