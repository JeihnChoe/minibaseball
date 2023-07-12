package DAO.Stadium;

import java.sql.Connection;

public class StadiumDAO {
    private final Connection connection;

    public StadiumDAO(Connection connection) {
        this.connection = connection;
    }

}
