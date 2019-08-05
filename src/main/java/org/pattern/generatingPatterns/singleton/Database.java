package main.java.org.pattern.generatingPatterns.singleton;

public class Database {
    private static Database database;

    private Database() {
    }

    public static Database getInstance() {
        if (database == null) {
            database=new Database();
        }

        return database;
    }
}
