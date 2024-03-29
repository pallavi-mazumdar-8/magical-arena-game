

package arena.magical;

import java.util.Random;


public class Player {
 
private String name;
    private int health;
    private int strength;
    private int attack;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public void attack(Player opponent) {
        Random rand = new Random();
        int attackRoll = rand.nextInt(6) + 1;
        int defenseRoll = rand.nextInt(6) + 1;

        int damage = attackRoll * this.attack;
        int defense = defenseRoll * opponent.getStrength();

        System.out.println("Player "+this.name + " attacks and rolls die. Die roll: " + attackRoll);
        System.out.println("Player "+opponent.getName() + " defends and rolls die. Die roll: " + defenseRoll);
        System.out.println("Attack damage is " + attackRoll + " * " + this.attack + " = " + damage);
        System.out.println("Defending strength is " + defenseRoll + " * " + opponent.getStrength() + " = " + defense);
        System.out.println();
       

        

        if (damage > defense) {
            int excessDamage = damage - defense;
            opponent.setHealth(opponent.getHealth() - excessDamage);
            System.out.println("Player "+opponent.getName() + " health reduced by " + excessDamage + " to " + opponent.getHealth());
            System.out.println();

        } else {
            System.out.println("No damage inflicted on " + opponent.getName() + ".");
            System.out.println();

        }
    }


}
