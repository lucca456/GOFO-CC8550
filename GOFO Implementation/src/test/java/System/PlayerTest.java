package System;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player();
    }

    @Test
    public void testSetAndGetBalance() {
        player.setBalance(100);
        assertEquals("O saldo deve ser 100", 100, player.getBalance());
    }

    @Test
    public void testDepositMoney() {
        player.setBalance(100);
        player.getMoney(50); // Supondo que este método é para depositar dinheiro
        assertEquals("Depósito de 50 deve aumentar o saldo para 150", 150, player.getBalance());
    }
}