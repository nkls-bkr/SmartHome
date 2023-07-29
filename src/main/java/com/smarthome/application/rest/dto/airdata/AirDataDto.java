package com.smarthome.application.rest.dto.airdata;

import com.smarthome.application.rest.dto.location.LocationDto;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.time.LocalDateTime;
import java.util.Objects;

public class AirDataDto {
    @PositiveOrZero
    private final long id;

    @Max(value = 1000, message = "The temperature may be between -273°C and 1000°C")
    @Min(value = -273, message = "The temperature may be between -273°C and 1000°C")
    private final double temperature;

    @Max(value = 100, message = "The humidity may be between 0% and 100%")
    @Min(value = 0, message = "The humidity may be between 0% and 100%")
    private final double humidity;

    private final LocalDateTime localDateTime;

    @NotNull
    private final LocationDto location;

    public AirDataDto(long id, double temperature, double humidity, LocalDateTime localDateTime, LocationDto location) {
        this.id = id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.localDateTime = localDateTime;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public LocationDto getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirDataDto that = (AirDataDto) o;
        return id == that.id && Double.compare(temperature, that.temperature) == 0 && Double.compare(humidity, that.humidity) == 0 && Objects.equals(localDateTime, that.localDateTime) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, temperature, humidity, localDateTime, location);
    }
}
