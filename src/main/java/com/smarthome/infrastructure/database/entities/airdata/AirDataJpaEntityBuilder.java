package com.smarthome.infrastructure.database.entities.airdata;

import com.smarthome.infrastructure.database.entities.location.LocationJpaEntity;

import java.time.LocalDateTime;

public class AirDataJpaEntityBuilder {
    private long id;
    private double temperature;
    private double humidity;
    private LocalDateTime localDateTime;
    private LocationJpaEntity locationJpaEntity;

    public AirDataJpaEntityBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public AirDataJpaEntityBuilder setTemperature(double temperature) {
        this.temperature = temperature;
        return this;
    }

    public AirDataJpaEntityBuilder setHumidity(double humidity) {
        this.humidity = humidity;
        return this;
    }

    public AirDataJpaEntityBuilder setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
        return this;
    }

    public AirDataJpaEntityBuilder setLocationJpaEntity(LocationJpaEntity locationJpaEntity) {
        this.locationJpaEntity = locationJpaEntity;
        return this;
    }

    public AirDataJpaEntity createAirDataJpaEntity() {
        return new AirDataJpaEntity(id, temperature, humidity, localDateTime, locationJpaEntity);
    }
}