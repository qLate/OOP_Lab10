package Task1;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.SQLException;

@Getter
@AllArgsConstructor
public class User {
    public static UserDatabase database = new UserDatabase();

    private String email;
    private String name;
    private int age;

    public void save() throws SQLException {
        database.save(this);
    }
}
