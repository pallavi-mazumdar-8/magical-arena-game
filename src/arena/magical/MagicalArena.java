
package arena.magical;


import java.util.Scanner;


public class MagicalArena {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Player A's attributes (health, strength, attack):");
        int healthA = scanner.nextInt();
        int strengthA = scanner.nextInt();
        int attackA = scanner.nextInt();
        Player playerA = new Player("A", healthA, strengthA, attackA);

        System.out.println("Enter Player B's attributes (health, strength, attack):");
        int healthB = scanner.nextInt();
        int strengthB = scanner.nextInt();
        int attackB = scanner.nextInt();
        Player playerB = new Player("B", healthB, strengthB, attackB);

        
        scanner.close();

        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            playerA.attack(playerB);

            if (playerB.getHealth() <= 0) {
                System.out.println(playerA.getName() + " wins!");
                break;
            }

            playerB.attack(playerA);

            if (playerA.getHealth() <= 0) {
                System.out.println(playerB.getName() + " wins!");
                break;
            }
        }
    }
    
    
    
    
    
    }
    

