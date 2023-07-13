package DAO.Stadium;

import lombok.Builder;
import lombok.ToString;
import modelDTO.stadium.Stadium;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@ToString
public class StadiumDAO {
    private final Connection connection;

    public StadiumDAO(Connection connection) {
        this.connection = connection;
    }

    public void createRow(String stadiumName, String stadiumCreatedAt) throws SQLException {
        String query = "INSERT INTO stadium_tb(stadium_name,stadium_created_at) VALUE (?,?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, stadiumName);
            statement.setString(2, stadiumCreatedAt);
            statement.executeUpdate();
        }
    }

    public Stadium readRowByNumber(int stadiumId) throws SQLException {
        String query = "SELECT * FROM stadium_tb WHERE stadium_id";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, stadiumId);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next())
                    return buildStadiumFromResultSet(rs);
            }
        }
        return null;
    }

    public List<Stadium> getAllStadiums() throws SQLException {
        List<Stadium> stadiums = new ArrayList<>();
        String query = "SELECT * FROM stadium_tb";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    Stadium stadium = buildStadiumFromResultSet(rs);
                    stadiums.add(stadium);
                    System.out.println(buildStadiumFromResultSet(rs));
                }
            }
            return stadiums;
        }
    }

    @Builder
    private Stadium buildStadiumFromResultSet(ResultSet resultSet) throws SQLException {
        String stadiumName = resultSet.getString("stadium_name");
        String stadiumCreatedAt = resultSet.getString("stadium_created_at");
        Timestamp accountCreatedAt = resultSet.getTimestamp("stadium_created_at");

        return Stadium.builder()
                .stadiumName(stadiumName)
                .stadiumCreatedAt(stadiumCreatedAt)
                .build();
    }
}

