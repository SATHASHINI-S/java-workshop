package com.project.Dao;

import com.project.model.Building;

import javax.sql.DataSource;
import java.sql.*;

public class BuildingDao {
    private final DataSource dataSource;

    public BuildingDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Building save(Building building) throws SQLException {
        if(building.id() == null) {
            final String insertSql = "INSERT INTO building (colour, shape, name, bulidingNumber, noOfFloors ,height) VALUES(?,?,?,?,?,?)";
            try (Connection connection = dataSource.getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setString(1, building.colour());
                preparedStatement.setString(2, building.shape());
                preparedStatement.setString(3, building.name());
                preparedStatement.setInt(4, building.bulidingNumber());
                preparedStatement.setInt(5, building.noOfFloors());
                preparedStatement.setDouble(6, building.height());
                preparedStatement.execute();
                try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                    if (resultSet.next()) {
                        return new Building(building.id(), building.colour(), building.shape(), building.name(), building.bulidingNumber(),
                                building.noOfFloors(), building.height());
                    }
                }
            }
        }
        else{
            final String updateSql = "UPDATE building SET colour WHERE id = ?";
            try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(updateSql)){
                preparedStatement.setInt(1,building.id());
                preparedStatement.executeUpdate();
                return new Building(building.id(), building.colour(), building.shape(), building.name(), building.bulidingNumber(), building.noOfFloors(), building.height());
            }
        }

        return building;
    }
}
