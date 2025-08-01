package com.temperaturedata.model;

import java.sql.Timestamp;


public record Temperature(Integer temp_data, Timestamp dateAndTime ) {
}
