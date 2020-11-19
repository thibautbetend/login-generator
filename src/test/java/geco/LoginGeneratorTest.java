package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {
    LoginService monLoginService;
    LoginGenerator monLoginGenerator;

    @Before
    public void login_service() {
        monLoginService = new LoginService(new String[] {"JROL",
                "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        monLoginGenerator = new LoginGenerator(monLoginService);
    }

    @Test
    public void generate_login_for_nom_and_prenom_CT1()
    {
        assertEquals("PDUR", monLoginGenerator.generateLoginForNomAndPrenom("Durand", "Paul"));
    }

    @Test
    public void generate_login_for_nom_and_prenom_CT2()
    {
        assertEquals("JRAL2", monLoginGenerator.generateLoginForNomAndPrenom("Ralling", "John"));
    }
    @Test
    public void generate_login_for_nom_and_prenom_CT3()
    {
        assertEquals("JROL1", monLoginGenerator.generateLoginForNomAndPrenom("Rolling", "Jean"));
    }
    @Test
    public void generate_login_for_nom_and_prenom_CT4()
    {
        assertEquals("PDUR", monLoginGenerator.generateLoginForNomAndPrenom("Durant", "Paul"));
    }
    @Test
    public void generate_login_for_nom_and_prenom_CT5()
    {
        assertEquals("PDU", monLoginGenerator.generateLoginForNomAndPrenom("Du", "Paul"));
    }
}