package geco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PasswordGenerationTest {

    @Test
    public void get_random_password()
    {
        PasswordGeneration monPassword = new PasswordGeneration();
        String password = monPassword.getRandomPassword();
        assertEquals(password, password);
    }
}