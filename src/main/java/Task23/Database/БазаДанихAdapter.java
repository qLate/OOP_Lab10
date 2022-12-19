package Task23.Database;

public class БазаДанихAdapter extends Database {
    private БазаДаних database;
    public БазаДанихAdapter(БазаДаних database) {
        this.database = database;
    }

    @Override
    public String GetUserInfo() {
        return database.отриматиДаніКористувача();
    }
    @Override
    public String GetStaticInfo() {
        return database.отриматиСтатистичніДані();
    }
}
