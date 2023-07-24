package com.matz.airdata.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class AirDataJpaEntity {

    @Id
    @GeneratedValue
    private long id;
    private double temperature;
    private double humidity;
    private LocalDateTime timestamp;

    public AirDataJpaEntity() {
    }

    public AirDataJpaEntity(long id,
                            double temperature,
                            double humidity,
                            LocalDateTime localDateTime) {
        this.id = id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.timestamp = localDateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirDataJpaEntity that = (AirDataJpaEntity) o;
        return id == that.id && Double.compare(temperature, that.temperature) == 0 && Double.compare(humidity, that.humidity) == 0 && Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, temperature, humidity, timestamp);
    }
}
