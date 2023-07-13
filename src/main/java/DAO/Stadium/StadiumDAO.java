package DAO.Stadium;

import modelDTO.stadium.StadiumModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StadiumDAO {
    private final Connection connection;

    public StadiumDAO(Connection connection) {
        this.connection = connection;
    }

    public void createModel(String stadiumName, String stadiumCreatedAt) throws SQLException {
        String query = "INSERT INTO stadium_tb(stadium_name,stadium_createdAt) VALUE (?,?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, stadiumName);
            statement.setString(2, stadiumCreatedAt);
            statement.executeUpdate();
        }
    }

    public StadiumModel getStadiumByNumber(int stadiumId) throws SQLException {
        String query = "SELECT * FROM stadium_tb WHERE stadium_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, stadiumId);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    return buildStadiumFromResultSet(rs);
                }
            }
        }
        return null; // Account not found
    }


    public List<StadiumModel> getAllStadium() throws SQLException {
        List<StadiumModel> stadiumModels = new ArrayList<>();
        String query = "SELECT * FROM stadium_tb";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            try(ResultSet resultSet = statement.executeQuery()){
                while (resultSet.next()) {
                    List account = buildAccountFromResultSet(resultSet);
                    accounts.add(account);
                }
            }
        }
        return accounts;

        }

        String query = "SELECT * FROM stadium_tb WHERE stadium_number = ?";
        PreparedStatement pstmt = connection.prepareStatement(query);


    }
}

