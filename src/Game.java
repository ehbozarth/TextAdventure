/*
 * Created by earlbozarth on 10/8/15.
 */
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Game {

    static Player player;
    static final String FILE_NAME = "save.json";


    public static void main(String [] args) throws Exception {
        System.out.println("Welcome to Text Adventure");

        player = loadGame();

        //final String itemName = "Shield";//Creating a constant variable that does not change

        if(player == null){
            player = new Player();
            player.chooseName();
            player.chooseWeapon();
            player.chooseArea();
            //player.findItem(itemName);
            player.findItem("Shield");
        }//End of If player is null statement
        Weapon orgeWeapon = new Weapon();
        orgeWeapon.name = "Club";
        orgeWeapon.damage = 5;
        Enemy orge = new Enemy("Ogre", 50, 5,orgeWeapon);

        player.battle(orge);

        saveGame();

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

    static void saveGame(){
        File f = new File(FILE_NAME);
        JsonSerializer serializer = new JsonSerializer();
        String contentToSave = serializer.serialize(player);

        try {
            FileWriter fw = new FileWriter(f);
            fw.write(contentToSave);
            fw.close();
        }//End of Try
        catch (Exception e){
        }//End of Catch
    }//End of Save Game Method

    static Player loadGame(){

        try {
            File f = new File(FILE_NAME);
            FileReader fr = new FileReader(f);
            int fileSize = (int)f.length();
            char [] contents = new char[fileSize];
            fr.read(contents);
            String fileContents = new String(contents);
            JsonParser parser = new JsonParser();
            return parser.parse(fileContents, Player.class);
        }//End of Try
        catch (Exception e){
            return null;
        }//End of Catch

    }//End of Load Game method

}//End of Game Class