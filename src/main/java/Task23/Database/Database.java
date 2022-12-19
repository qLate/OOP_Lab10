package Task23.Database;

import Task23.User.User;
import lombok.Getter;

import java.util.List;

public class Database {
    @Getter
    private List<User> users;

    public String GetUserInfo() {
        return "hello";
    }
    public String GetStaticInfo() {
        return "hello2";
    }
}
