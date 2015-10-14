/**
 * Created by earlbozarth on 10/13/15.
 */
public class Character {
    String name;
    int health;
    int damage;
    Weapon weapon;

    void battle(Character opponent){
        System.out.println(String.format("%s commences batle with %s", name, opponent.name));
        while(health > 0 && opponent.health > 0){
            health = health - (opponent.damage + opponent.weapon.damage);
            opponent.health = opponent.health - (damage + weapon.damage);
            System.out.println(String.format("%s's health is at %d and %s's health is at %d",
                    name, health, opponent.name, opponent.health));
        }//End of while loop

        String deadMessage = "%s has been killed!";
        if (health <= 0){
            System.out.println(String.format(deadMessage, name));
        }//If player dies
        if(opponent.health <= 0 ){
            System.out.println(String.format(deadMessage, opponent.name));
        }//If opponent dies

    }//End of Battle Method

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}//End of Character Class
