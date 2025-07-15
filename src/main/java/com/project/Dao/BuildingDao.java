package com.project.Dao;

import com.project.model.Building;

import javax.sql.DataSource;

public class BuildingDao {
    private final DataSource dataSource;

    public BuildingDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Building save(Building building) {
    }
}
