package System;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayGroundScheduleTest {
    private PlayGroundSchedule schedule;

    @Before
    public void setUp() {
        schedule = new PlayGroundSchedule();
        // Inicializar a agenda com configurações padrão, se necessário.
    }

    @Test
    public void testSetAndGetTimeSlotPerHour() {
        //schedule.setPrice(50);
        //assertEquals("O preço por hora deve ser 50", 50, schedule.getTimeSlotPerHour());
    }
}

