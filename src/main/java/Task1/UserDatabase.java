package Task1;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDatabase {
    public void save(User user) throws SQLException {
        Statement s = DriverManager.getConnection("").createStatement();
        s.execute("insert into user (email, name, age) values ('" + user.getEmail() + "', '" + user.getName() + "', " + user.getAge() + ")");
    }
}
