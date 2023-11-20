package System;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlaygroundTest {
    private Playground playground;

    @Before
    public void setUp() {
        playground = new Playground();
    }

    @Test
    public void testSetAndGetCancellationPeriod() {
        playground.setCancellationPeriod(24);
        assertEquals("O período de cancelamento deve ser 24 horas", 24, playground.getCancellationPeriod());
    }

    @Test
    public void testSetAndGetName() {
        playground.setName("Playground Test");
        assertEquals("O nome do playground deve ser 'Playground Test'", "Playground Test", playground.getName());
    }

    // Testes adicionais para os métodos que podem ser testados sem entrada do usuário
    @Test
    public void testSetAndGetOwner() {
        playground.setOwner("Owner Name");
        assertEquals("O proprietário deve ser 'Owner Name'", "Owner Name", playground.getOwner());
    }
}