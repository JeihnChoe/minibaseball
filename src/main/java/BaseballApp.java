import DAO.Stadium.StadiumDAO;
import db.DBConnection;
import lombok.ToString;

import java.sql.Connection;
import java.sql.SQLException;

@ToString
public class BaseballApp {
    public static void main(String[] args) {
        Connection connection = DBConnection.getInstance();

        StadiumDAO stadiumDAO = new StadiumDAO(connection);

        try {
            stadiumDAO.getAllStadiums();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
