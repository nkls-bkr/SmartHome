package com.smarthome.domain.model.airdata;

import com.smarthome.domain.model.location.Location;

import java.time.LocalDateTime;

public class AirDataBuilder {
    private long id;
    private double temperature;
    private double humidity;
    private LocalDateTime localDateTime;
    private Location location;

    public AirDataBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public AirDataBuilder setTemperature(double temperature) {
        this.temperature = temperature;
        return this;
    }

    public AirDataBuilder setHumidity(double humidity) {
        this.humidity = humidity;
        return this;
    }

    public AirDataBuilder setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
        return this;
    }

    public AirDataBuilder setLocation(Location location) {
        this.location = location;
        return this;
    }

    public AirData createAirData() {
        return new AirData(id, temperature, humidity, localDateTime, location);
    }
}