package geco;

public class PasswordGeneration {

    /**
     * Create a random password of 8 characters.
     * @return the random password
     */
    public String getRandomPassword()
    {
        char randomLetter;
        String randomPassword = "";
        for(int i = 0; i < 8; i++)
        {
            randomLetter = (char) ('A' + Math.random() * ('Z'-'A' + 1));
            randomPassword = randomPassword.concat(String.valueOf(randomLetter));
        }
        return randomPassword;
    }
}
