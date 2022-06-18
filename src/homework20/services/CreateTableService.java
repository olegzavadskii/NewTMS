package homework20.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableService {
    private Connection connection;
    public static final String CREATE = "create table if not exists " +
            "phones (id serial primary key, " +
            "brand varchar not null, " +
            "model varchar not null, " +
            "diagonal double precision not null, " +
            "storage double precision not null)";

    public CreateTableService(Connection connection) {
        this.connection = connection;
    }

    public void createTable() {
        try (Statement statement = connection.createStatement()) {
            statement.execute(CREATE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}