package System;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class PlayGroundOwnerTest {
    private PlaygroundOwner owner;

    @Before
    public void setUp() {
        owner = new PlaygroundOwner();
    }

    @Test
    public void testAddAndGetPlayground() {
        Playground playground = new Playground();
        playground.setName("Playground Test");
        owner.addPlayground(playground);
        owner.getListofPlayground();
    }

    @Test
    public void testSetAndGetBalance() {
        eWallet wallet = new eWallet();
        wallet.setBalance(100);
        owner.setBalance(wallet);
        assertEquals("O saldo deve ser 100", 100, owner.getMyBalance());
    }

    @Test
    public void testExistPlayground() {
        Playground playground = new Playground();
        playground.setName("Playground Test");
        owner.addPlayground(playground);
        assertTrue("Playground com nome 'Playground Test' deve existir", owner.existPlayground("Playground Test"));
        assertFalse("Playground com nome 'Inexistente' não deve existir", owner.existPlayground("Inexistente"));
    }
}