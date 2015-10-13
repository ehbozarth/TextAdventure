/**
 * Created by earlbozarth on 10/13/15.
 */
public class Character {
    String name;
    int health;
    int damage;

    void battle(Character opponent){
        while(health > 0 && opponent.health > 0){
            health = health - opponent.damage;
            opponent.health = opponent.health - damage;
        }//End of while loop

        String deadMessage = "%s has been killed!";
        if (health <= 0){
            System.out.println(String.format(deadMessage, name));
        }//If player dies
        if(opponent.health <= 0 ){
            System.out.println(String.format(deadMessage, opponent.name));
        }//If opponent dies

    }//End of Battle Method

}//End of Character Class
