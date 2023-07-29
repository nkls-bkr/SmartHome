package com.smarthome.application.rest.dto.airdata;

import com.smarthome.application.rest.dto.location.LocationDto;

import java.time.LocalDateTime;

public class AirDataDtoBuilder {
    private long id;
    private double temperature;
    private double humidity;
    private LocalDateTime localDateTime;
    private LocationDto locationDto;

    public AirDataDtoBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public AirDataDtoBuilder setTemperature(double temperature) {
        this.temperature = temperature;
        return this;
    }

    public AirDataDtoBuilder setHumidity(double humidity) {
        this.humidity = humidity;
        return this;
    }

    public AirDataDtoBuilder setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
        return this;
    }

    public AirDataDtoBuilder setLocationDto(LocationDto locationDto) {
        this.locationDto = locationDto;
        return this;
    }

    public AirDataDto createAirDataDto() {
        return new AirDataDto(id, temperature, humidity, localDateTime, locationDto);
    }
}