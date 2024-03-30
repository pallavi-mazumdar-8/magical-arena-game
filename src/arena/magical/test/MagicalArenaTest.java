


package arena.magical.test;

import arena.magical.Player;


public class MagicalArenaTest {
    
    public static void main(String[] args) {
        testBattle();
    }

   
    private static void testBattle() {
        // Test case 1: Player A wins
        Player playerA1 = new Player("A", 500, 5, 10);
        Player playerB1 = new Player("B", 50, 10, 5);
       while (playerA1.getHealth() > 0 && playerB1.getHealth() > 0) {
            playerA1.attack(playerB1);

            if (playerB1.getHealth() <= 0) {
                System.out.println(playerA1.getName() + " wins!");
                break;
            }

            playerB1.attack(playerA1);

            if (playerA1.getHealth() <= 0) {
                System.out.println(playerB1.getName() + " wins!");
                break;
            }
            if (playerA1.getHealth() > 0 && playerB1.getHealth() > 0) {
            System.out.println("It's a draw!");
            break;
            }
       }
        // Test case 2: Player B wins
        Player playerA2 = new Player("A", 50, 10, 5);
        Player playerB2 = new Player("B", 500, 5, 10);
        while (playerA2.getHealth() > 0 && playerB2.getHealth() > 0) {
            playerA2.attack(playerB2);

            if (playerB2.getHealth() <= 0) {
                System.out.println(playerA2.getName() + " wins!");
                break;
            }

            playerB2.attack(playerA2);

            if (playerA2.getHealth() <= 0) {
                System.out.println(playerB2.getName() + " wins!");
                break;
            }
            if (playerA2.getHealth() > 0 && playerB2.getHealth() > 0) {
            System.out.println("It's a draw!");
            break;
            }
        }
        // Test case 3: Draw
        Player playerA3 = new Player("A", 50, 5, 10);
        Player playerB3 = new Player("B", 50, 5, 10);
       while (playerA3.getHealth() > 0 && playerB3.getHealth() > 0) {
            playerA3.attack(playerB3);

            if (playerB3.getHealth() <= 0) {
                System.out.println(playerA3.getName() + " wins!");
                break;
            }

            playerB3.attack(playerA3);

            if (playerA3.getHealth() <= 0) {
                System.out.println(playerB3.getName() + " wins!");
                break;
            }
       
            if (playerA3.getHealth() > 0 && playerB3.getHealth() > 0) {
            System.out.println("It's a draw!");
            break;
            }
       }
     }
    }
  