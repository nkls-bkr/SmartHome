package com.smarthome.domain.model.airdata;

import java.time.LocalDateTime;

public class AirDataBuilder{
    private double temperature;
    private double humidity;
    private LocalDateTime localDateTime;

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

    public AirData createAirData() {
        return new AirData(temperature, humidity, localDateTime);
    }
}