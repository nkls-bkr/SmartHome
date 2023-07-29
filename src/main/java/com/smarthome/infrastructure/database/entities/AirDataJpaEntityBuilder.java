package com.smarthome.infrastructure.database.entities;

import java.time.LocalDateTime;

public class AirDataJpaEntityBuilder{
    private long id;
    private double temperature;
    private double humidity;
    private LocalDateTime localDateTime;

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

    public AirDataJpaEntity createAirDataJpaEntity() {
        return new AirDataJpaEntity(id, temperature, humidity, localDateTime);
    }
}