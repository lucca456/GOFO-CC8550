package System;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class AdministratorTest {
    private Administrator admin;

    @Before
    public void setUp() {
        admin = new Administrator();
    }

    @Test
    public void testGetEmail() {
        assertEquals("Email deve corresponder ao padrão", "admin@gmail.com", admin.getEmail());
    }

    @Test
    public void testGetPassword() {
        assertEquals("Senha deve corresponder ao padrão", "123", admin.getPassword());
    }
}