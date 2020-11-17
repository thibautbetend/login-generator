package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    LoginService monLoginService;

    @Before
    public void login_service() {
        String [] mesLogins = new String[5];
        mesLogins[0] = "mdp";
        mesLogins[1] = "OuiLeMDP";
        mesLogins[2] = "LolMotDePasse_";
        mesLogins[3] = "D5f6ss31g";
        mesLogins[4] = "monMotDePasse";
        monLoginService = new LoginService(mesLogins);
    }

    @Test
    public void login_exists()
    {

        String monMotDePasse = "monMotDePasse";
        assertTrue(monLoginService.loginExists(monMotDePasse));
    }


    @Test
    public void login_doesnt_exists()
    {

        String monNewLogin = "monNewLogin";
        assertFalse(monLoginService.loginExists(monNewLogin));
    }

    @Test
    public void add_login()
    {
        String [] mesLogins = new String[1];
        mesLogins[0] = "monMotDePasse";
        monLoginService = new LoginService(mesLogins);
        List<String> mesNouveauxLogins = new ArrayList<>();
        mesNouveauxLogins.add("monMotDePasse");
        mesNouveauxLogins.add("monNouveauMotDePasse");
        monLoginService.addLogin("monNouveauMotDePasse");
        assertEquals(mesNouveauxLogins, monLoginService.findAllLogins());
    }

    @Test
    public void find_all_logins_starting_with()
    {
        List<String> mesLogins = new ArrayList<>();
        mesLogins.add("mdp");
        mesLogins.add("monMotDePasse");
        assertEquals(mesLogins, monLoginService.findAllLoginsStartingWith("m"));
    }
}