import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Warrior warrior = new Warrior(1, "Rifle", 8, 9);

        Warrior warriorClone = warrior.clone();
        warriorClone.setCode(2);
        warriorClone.setWeapon("Pistola");
        warriorClone.setSpeed(10);

        assertEquals("Guerreiro{código=1, arma=Rifle, força=8, velocidade=9}", warrior.toString());
        assertEquals("Guerreiro{código=2, arma=Pistola, força=8, velocidade=10}", warriorClone.toString());
    }
}