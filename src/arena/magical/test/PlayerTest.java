




package arena.magical.test;
import arena.magical.Player;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
  

    @Test
    public void testAttack() {
        Player playerA = new Player("A", 50, 5, 10);
        Player playerB = new Player("B", 100, 10, 5);

        playerA.attack(playerB);
        assertTrue(playerB.getHealth() < 100);

        playerB.attack(playerA);
        assertTrue(playerA.getHealth() < 50);
    }

    @Test
    public void testPlayerInitialization() {
        Player playerA = new Player("A", 50, 5, 10);
        assertEquals("A", playerA.getName());
        assertEquals(50, playerA.getHealth());
        assertEquals(5, playerA.getStrength());
        assertEquals(10, playerA.getAttack());
    }

    @Test
    public void testPlayerHealthUpdate() {
        Player playerA = new Player("A", 50, 5, 10);
        playerA.setHealth(30);
        assertEquals(30, playerA.getHealth());
    }
}

    
