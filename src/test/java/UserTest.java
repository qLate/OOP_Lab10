import Task23.Country;
import Task23.Database.Database;
import Task23.Database.БазаДаних;
import Task23.Database.БазаДанихAdapter;
import Task23.User.FacebookUser;
import Task23.User.TwitterUser;
import Task23.Авторизація;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private Character character;

    @Test
    public void testFacebookUser() {
        var currTime = LocalDate.now();
        FacebookUser user = new FacebookUser("abc@gmail.com", Country.Ukraine, currTime);
        assertEquals(user.getUserCountry(), Country.Ukraine);
        assertEquals(user.getEmail(), "abc@gmail.com");
        assertEquals(user.getGetUserActiveTime(), currTime);
    }

    @Test
    public void testTwitterUser() {
        var currTime = LocalDate.now().toString();
        TwitterUser user = new TwitterUser("abc@gmail.com", Country.Ukraine.toString(), currTime);
        assertEquals(user.getCountry(), Country.Ukraine.toString());
        assertEquals(user.getUserMail(), "abc@gmail.com");
        assertEquals(user.getLastActiveTime(), currTime);
    }

    @Test
    public void testDatabase() {
        БазаДаних базаДаних = new БазаДаних();
        Database database = new БазаДанихAdapter(базаДаних);
        assertEquals(database.GetUserInfo(), "hello");
        assertEquals(database.GetStaticInfo(), "hello2");
    }

    @Test
    public void testAuthentication() {
        БазаДаних базаДаних = new БазаДаних();
        Авторизація авторизація = new Авторизація();
        assertEquals(авторизація.авторизуватися(базаДаних), true);
    }
}

