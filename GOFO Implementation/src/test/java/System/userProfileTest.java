package System;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class userProfileTest {
    private userProfile userProfile;

    @Before
    public void setUp() {
        userProfile = new userProfile();
    }

    @Test
    public void testSetAndGetFullName() {
        userProfile.setFName("John");
        userProfile.setLName("Doe");
        assertEquals("O nome completo deve ser 'John Doe'", "John Doe", userProfile.getFullName());
    }

    @Test
    public void testSetAndGetID() {
        userProfile.setID(12345);
        assertEquals("O ID deve ser 12345", 12345, userProfile.getID());
    }

    @Test
    public void testSetAndGetPassword() {
        userProfile.setPassword("password123");
        assertEquals("A senha deve ser 'password123'", "password123", userProfile.getPassword());
    }

    @Test
    public void testSetAndGetEmail() {
        userProfile.setEmail("john.doe@example.com");
        assertEquals("O email deve ser 'john.doe@example.com'", "john.doe@example.com", userProfile.getEmail());
    }

    @Test
    public void testSetAndGetPhone() {
        userProfile.setPhone(123456789);
        assertEquals("O número de telefone deve ser 123456789", 123456789, userProfile.getPhone());
    }

    @Test
    public void testSetAndGetRule() {
        userProfile.setRule("Player");
        assertEquals("A regra deve ser 'Player'", "Player", userProfile.getRule());
    }
}

